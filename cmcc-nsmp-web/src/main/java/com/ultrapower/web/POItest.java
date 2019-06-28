package com.ultrapower.web;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

/**
 * poi技术入门
 */
public class POItest {


    @Test
    public void test5() throws Exception {
        /*String S= "123";
        String S1="ABC";
        String s1 = S.concat(S1);
        System.out.println(s1);*/
        double d = 1.34;
        Double aDouble = new Double(d);
        System.out.println(aDouble);
        Double aDouble1 = Double.valueOf(d);
        System.out.println(aDouble1);
    }

    /**
     * 存储操作
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("测试");
        XSSFRow row = sheet.createRow(1);
        XSSFCell cell = row.createCell(1);
        cell.setCellValue(new Date());
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\1.xls");
        workbook.write(fileOutputStream);
    }

    /**
     * 读取操作
     * @throws Exception
     */
    @Test
    public void test2() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\1.xls");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("测试");
        XSSFRow row = sheet.getRow(1);
        XSSFCell cell = row.getCell(1);
        Date dateCellValue = cell.getDateCellValue();
        System.out.println(dateCellValue);
    }

    @Test
    public void test3() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\1.xls");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        //workbook.getNumberOfSheets();//当前sheet表的个数
        XSSFSheet sheetAt = workbook.getSheetAt(0);
        //行数
        int rows = sheetAt.getPhysicalNumberOfRows();
        for(int i = 0;i<rows;i++){
            XSSFRow row = sheetAt.getRow(i);
            int cells = row.getPhysicalNumberOfCells();
            for(int j = 0;j<cells;j++){
                XSSFCell cell = row.getCell(j);
                System.out.print(cell.getRawValue()+"     ");
            }
            System.out.println();
        }
    }
}
