package com.ultrapower.web;

import com.ultrapower.dao.AmAssetMapper;
import com.ultrapower.pojo.AmAsset;
import com.ultrapower.utils.PkUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class TestController2 {

    @Autowired
    AmAssetMapper assetMapper;

    @RequestMapping("/test3")
    public ModelAndView test3(@RequestParam MultipartFile assetExcel) throws Exception {
        InputStream inputStream = assetExcel.getInputStream();
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheetAt = workbook.getSheetAt(0);
        int rows = sheetAt.getPhysicalNumberOfRows();
        for(int i = 0;i<rows;i++){
            XSSFRow row = sheetAt.getRow(i);
            AmAsset amAsset = amAsset(row);
            assetMapper.insert(amAsset);
        }
        return null;
    }

    public AmAsset amAsset(XSSFRow row){
        AmAsset amAsset = new AmAsset();
        amAsset.setPkAsset(PkUtils.getPrimaryKey());
        amAsset.setProvCode(row.getCell(0).getStringCellValue());
        amAsset.setAssetName(row.getCell(1).getStringCellValue());
        amAsset.setAssetCode(row.getCell(2).getStringCellValue());
        return amAsset;
    }

    //返回一个ResponseEntity类型
    @RequestMapping("/test4")
    public ResponseEntity<byte[]> poiDownloadTest() throws UnsupportedEncodingException {
        List<AmAsset> amAssets = assetMapper.selectByExample(null);
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();
        XSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue("省份编码");
        row.createCell(1).setCellValue("资产名称");
        row.createCell(2).setCellValue("资产编码");
        row.createCell(3).setCellValue("资产IP");
        for (int i = 0;i<amAssets.size();i++){
            XSSFRow xssfRow = sheet.createRow(i + 1);
            xssfRow.createCell(0).setCellValue(amAssets.get(i).getProvCode());
            xssfRow.createCell(1).setCellValue(amAssets.get(i).getAssetName());
            xssfRow.createCell(2).setCellValue(amAssets.get(i).getAssetCode());
            xssfRow.createCell(3).setCellValue(amAssets.get(i).getAssetIp());
        }
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
        try {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        HttpHeaders headers=new HttpHeaders();
        String fileName=new String("1.xlsx".getBytes("UTF-8"),"iso-8859-1");
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

        ResponseEntity<byte[]> returnFile=new ResponseEntity<byte[]>
                (outputStream.toByteArray(),headers,HttpStatus.CREATED);
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return returnFile;
    }
}
