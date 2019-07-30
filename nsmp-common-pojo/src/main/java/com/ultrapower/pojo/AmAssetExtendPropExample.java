package com.ultrapower.pojo;

import java.util.ArrayList;
import java.util.List;

public class AmAssetExtendPropExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmAssetExtendPropExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPkAssetIsNull() {
            addCriterion("PK_ASSET is null");
            return (Criteria) this;
        }

        public Criteria andPkAssetIsNotNull() {
            addCriterion("PK_ASSET is not null");
            return (Criteria) this;
        }

        public Criteria andPkAssetEqualTo(String value) {
            addCriterion("PK_ASSET =", value, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetNotEqualTo(String value) {
            addCriterion("PK_ASSET <>", value, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetGreaterThan(String value) {
            addCriterion("PK_ASSET >", value, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ASSET >=", value, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetLessThan(String value) {
            addCriterion("PK_ASSET <", value, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetLessThanOrEqualTo(String value) {
            addCriterion("PK_ASSET <=", value, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetLike(String value) {
            addCriterion("PK_ASSET like", value, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetNotLike(String value) {
            addCriterion("PK_ASSET not like", value, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetIn(List<String> values) {
            addCriterion("PK_ASSET in", values, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetNotIn(List<String> values) {
            addCriterion("PK_ASSET not in", values, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetBetween(String value1, String value2) {
            addCriterion("PK_ASSET between", value1, value2, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetNotBetween(String value1, String value2) {
            addCriterion("PK_ASSET not between", value1, value2, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andProvCodeIsNull() {
            addCriterion("PROV_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProvCodeIsNotNull() {
            addCriterion("PROV_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvCodeEqualTo(String value) {
            addCriterion("PROV_CODE =", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotEqualTo(String value) {
            addCriterion("PROV_CODE <>", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeGreaterThan(String value) {
            addCriterion("PROV_CODE >", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROV_CODE >=", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeLessThan(String value) {
            addCriterion("PROV_CODE <", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeLessThanOrEqualTo(String value) {
            addCriterion("PROV_CODE <=", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeLike(String value) {
            addCriterion("PROV_CODE like", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotLike(String value) {
            addCriterion("PROV_CODE not like", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeIn(List<String> values) {
            addCriterion("PROV_CODE in", values, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotIn(List<String> values) {
            addCriterion("PROV_CODE not in", values, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeBetween(String value1, String value2) {
            addCriterion("PROV_CODE between", value1, value2, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotBetween(String value1, String value2) {
            addCriterion("PROV_CODE not between", value1, value2, "provCode");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("VERSION like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("VERSION not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andSecurityZoneIsNull() {
            addCriterion("SECURITY_ZONE is null");
            return (Criteria) this;
        }

        public Criteria andSecurityZoneIsNotNull() {
            addCriterion("SECURITY_ZONE is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityZoneEqualTo(String value) {
            addCriterion("SECURITY_ZONE =", value, "securityZone");
            return (Criteria) this;
        }

        public Criteria andSecurityZoneNotEqualTo(String value) {
            addCriterion("SECURITY_ZONE <>", value, "securityZone");
            return (Criteria) this;
        }

        public Criteria andSecurityZoneGreaterThan(String value) {
            addCriterion("SECURITY_ZONE >", value, "securityZone");
            return (Criteria) this;
        }

        public Criteria andSecurityZoneGreaterThanOrEqualTo(String value) {
            addCriterion("SECURITY_ZONE >=", value, "securityZone");
            return (Criteria) this;
        }

        public Criteria andSecurityZoneLessThan(String value) {
            addCriterion("SECURITY_ZONE <", value, "securityZone");
            return (Criteria) this;
        }

        public Criteria andSecurityZoneLessThanOrEqualTo(String value) {
            addCriterion("SECURITY_ZONE <=", value, "securityZone");
            return (Criteria) this;
        }

        public Criteria andSecurityZoneLike(String value) {
            addCriterion("SECURITY_ZONE like", value, "securityZone");
            return (Criteria) this;
        }

        public Criteria andSecurityZoneNotLike(String value) {
            addCriterion("SECURITY_ZONE not like", value, "securityZone");
            return (Criteria) this;
        }

        public Criteria andSecurityZoneIn(List<String> values) {
            addCriterion("SECURITY_ZONE in", values, "securityZone");
            return (Criteria) this;
        }

        public Criteria andSecurityZoneNotIn(List<String> values) {
            addCriterion("SECURITY_ZONE not in", values, "securityZone");
            return (Criteria) this;
        }

        public Criteria andSecurityZoneBetween(String value1, String value2) {
            addCriterion("SECURITY_ZONE between", value1, value2, "securityZone");
            return (Criteria) this;
        }

        public Criteria andSecurityZoneNotBetween(String value1, String value2) {
            addCriterion("SECURITY_ZONE not between", value1, value2, "securityZone");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("REGION is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("REGION is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("REGION =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("REGION <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("REGION >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("REGION >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("REGION <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("REGION <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("REGION like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("REGION not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("REGION in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("REGION not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("REGION between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("REGION not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andPhysicalPositionIsNull() {
            addCriterion("PHYSICAL_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPhysicalPositionIsNotNull() {
            addCriterion("PHYSICAL_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicalPositionEqualTo(String value) {
            addCriterion("PHYSICAL_POSITION =", value, "physicalPosition");
            return (Criteria) this;
        }

        public Criteria andPhysicalPositionNotEqualTo(String value) {
            addCriterion("PHYSICAL_POSITION <>", value, "physicalPosition");
            return (Criteria) this;
        }

        public Criteria andPhysicalPositionGreaterThan(String value) {
            addCriterion("PHYSICAL_POSITION >", value, "physicalPosition");
            return (Criteria) this;
        }

        public Criteria andPhysicalPositionGreaterThanOrEqualTo(String value) {
            addCriterion("PHYSICAL_POSITION >=", value, "physicalPosition");
            return (Criteria) this;
        }

        public Criteria andPhysicalPositionLessThan(String value) {
            addCriterion("PHYSICAL_POSITION <", value, "physicalPosition");
            return (Criteria) this;
        }

        public Criteria andPhysicalPositionLessThanOrEqualTo(String value) {
            addCriterion("PHYSICAL_POSITION <=", value, "physicalPosition");
            return (Criteria) this;
        }

        public Criteria andPhysicalPositionLike(String value) {
            addCriterion("PHYSICAL_POSITION like", value, "physicalPosition");
            return (Criteria) this;
        }

        public Criteria andPhysicalPositionNotLike(String value) {
            addCriterion("PHYSICAL_POSITION not like", value, "physicalPosition");
            return (Criteria) this;
        }

        public Criteria andPhysicalPositionIn(List<String> values) {
            addCriterion("PHYSICAL_POSITION in", values, "physicalPosition");
            return (Criteria) this;
        }

        public Criteria andPhysicalPositionNotIn(List<String> values) {
            addCriterion("PHYSICAL_POSITION not in", values, "physicalPosition");
            return (Criteria) this;
        }

        public Criteria andPhysicalPositionBetween(String value1, String value2) {
            addCriterion("PHYSICAL_POSITION between", value1, value2, "physicalPosition");
            return (Criteria) this;
        }

        public Criteria andPhysicalPositionNotBetween(String value1, String value2) {
            addCriterion("PHYSICAL_POSITION not between", value1, value2, "physicalPosition");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DEPARTMENT like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andPublicIpIsNull() {
            addCriterion("PUBLIC_IP is null");
            return (Criteria) this;
        }

        public Criteria andPublicIpIsNotNull() {
            addCriterion("PUBLIC_IP is not null");
            return (Criteria) this;
        }

        public Criteria andPublicIpEqualTo(String value) {
            addCriterion("PUBLIC_IP =", value, "publicIp");
            return (Criteria) this;
        }

        public Criteria andPublicIpNotEqualTo(String value) {
            addCriterion("PUBLIC_IP <>", value, "publicIp");
            return (Criteria) this;
        }

        public Criteria andPublicIpGreaterThan(String value) {
            addCriterion("PUBLIC_IP >", value, "publicIp");
            return (Criteria) this;
        }

        public Criteria andPublicIpGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLIC_IP >=", value, "publicIp");
            return (Criteria) this;
        }

        public Criteria andPublicIpLessThan(String value) {
            addCriterion("PUBLIC_IP <", value, "publicIp");
            return (Criteria) this;
        }

        public Criteria andPublicIpLessThanOrEqualTo(String value) {
            addCriterion("PUBLIC_IP <=", value, "publicIp");
            return (Criteria) this;
        }

        public Criteria andPublicIpLike(String value) {
            addCriterion("PUBLIC_IP like", value, "publicIp");
            return (Criteria) this;
        }

        public Criteria andPublicIpNotLike(String value) {
            addCriterion("PUBLIC_IP not like", value, "publicIp");
            return (Criteria) this;
        }

        public Criteria andPublicIpIn(List<String> values) {
            addCriterion("PUBLIC_IP in", values, "publicIp");
            return (Criteria) this;
        }

        public Criteria andPublicIpNotIn(List<String> values) {
            addCriterion("PUBLIC_IP not in", values, "publicIp");
            return (Criteria) this;
        }

        public Criteria andPublicIpBetween(String value1, String value2) {
            addCriterion("PUBLIC_IP between", value1, value2, "publicIp");
            return (Criteria) this;
        }

        public Criteria andPublicIpNotBetween(String value1, String value2) {
            addCriterion("PUBLIC_IP not between", value1, value2, "publicIp");
            return (Criteria) this;
        }

        public Criteria andPrivateIpIsNull() {
            addCriterion("PRIVATE_IP is null");
            return (Criteria) this;
        }

        public Criteria andPrivateIpIsNotNull() {
            addCriterion("PRIVATE_IP is not null");
            return (Criteria) this;
        }

        public Criteria andPrivateIpEqualTo(String value) {
            addCriterion("PRIVATE_IP =", value, "privateIp");
            return (Criteria) this;
        }

        public Criteria andPrivateIpNotEqualTo(String value) {
            addCriterion("PRIVATE_IP <>", value, "privateIp");
            return (Criteria) this;
        }

        public Criteria andPrivateIpGreaterThan(String value) {
            addCriterion("PRIVATE_IP >", value, "privateIp");
            return (Criteria) this;
        }

        public Criteria andPrivateIpGreaterThanOrEqualTo(String value) {
            addCriterion("PRIVATE_IP >=", value, "privateIp");
            return (Criteria) this;
        }

        public Criteria andPrivateIpLessThan(String value) {
            addCriterion("PRIVATE_IP <", value, "privateIp");
            return (Criteria) this;
        }

        public Criteria andPrivateIpLessThanOrEqualTo(String value) {
            addCriterion("PRIVATE_IP <=", value, "privateIp");
            return (Criteria) this;
        }

        public Criteria andPrivateIpLike(String value) {
            addCriterion("PRIVATE_IP like", value, "privateIp");
            return (Criteria) this;
        }

        public Criteria andPrivateIpNotLike(String value) {
            addCriterion("PRIVATE_IP not like", value, "privateIp");
            return (Criteria) this;
        }

        public Criteria andPrivateIpIn(List<String> values) {
            addCriterion("PRIVATE_IP in", values, "privateIp");
            return (Criteria) this;
        }

        public Criteria andPrivateIpNotIn(List<String> values) {
            addCriterion("PRIVATE_IP not in", values, "privateIp");
            return (Criteria) this;
        }

        public Criteria andPrivateIpBetween(String value1, String value2) {
            addCriterion("PRIVATE_IP between", value1, value2, "privateIp");
            return (Criteria) this;
        }

        public Criteria andPrivateIpNotBetween(String value1, String value2) {
            addCriterion("PRIVATE_IP not between", value1, value2, "privateIp");
            return (Criteria) this;
        }

        public Criteria andNatIpIsNull() {
            addCriterion("NAT_IP is null");
            return (Criteria) this;
        }

        public Criteria andNatIpIsNotNull() {
            addCriterion("NAT_IP is not null");
            return (Criteria) this;
        }

        public Criteria andNatIpEqualTo(String value) {
            addCriterion("NAT_IP =", value, "natIp");
            return (Criteria) this;
        }

        public Criteria andNatIpNotEqualTo(String value) {
            addCriterion("NAT_IP <>", value, "natIp");
            return (Criteria) this;
        }

        public Criteria andNatIpGreaterThan(String value) {
            addCriterion("NAT_IP >", value, "natIp");
            return (Criteria) this;
        }

        public Criteria andNatIpGreaterThanOrEqualTo(String value) {
            addCriterion("NAT_IP >=", value, "natIp");
            return (Criteria) this;
        }

        public Criteria andNatIpLessThan(String value) {
            addCriterion("NAT_IP <", value, "natIp");
            return (Criteria) this;
        }

        public Criteria andNatIpLessThanOrEqualTo(String value) {
            addCriterion("NAT_IP <=", value, "natIp");
            return (Criteria) this;
        }

        public Criteria andNatIpLike(String value) {
            addCriterion("NAT_IP like", value, "natIp");
            return (Criteria) this;
        }

        public Criteria andNatIpNotLike(String value) {
            addCriterion("NAT_IP not like", value, "natIp");
            return (Criteria) this;
        }

        public Criteria andNatIpIn(List<String> values) {
            addCriterion("NAT_IP in", values, "natIp");
            return (Criteria) this;
        }

        public Criteria andNatIpNotIn(List<String> values) {
            addCriterion("NAT_IP not in", values, "natIp");
            return (Criteria) this;
        }

        public Criteria andNatIpBetween(String value1, String value2) {
            addCriterion("NAT_IP between", value1, value2, "natIp");
            return (Criteria) this;
        }

        public Criteria andNatIpNotBetween(String value1, String value2) {
            addCriterion("NAT_IP not between", value1, value2, "natIp");
            return (Criteria) this;
        }

        public Criteria andVirtualIpIsNull() {
            addCriterion("VIRTUAL_IP is null");
            return (Criteria) this;
        }

        public Criteria andVirtualIpIsNotNull() {
            addCriterion("VIRTUAL_IP is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualIpEqualTo(String value) {
            addCriterion("VIRTUAL_IP =", value, "virtualIp");
            return (Criteria) this;
        }

        public Criteria andVirtualIpNotEqualTo(String value) {
            addCriterion("VIRTUAL_IP <>", value, "virtualIp");
            return (Criteria) this;
        }

        public Criteria andVirtualIpGreaterThan(String value) {
            addCriterion("VIRTUAL_IP >", value, "virtualIp");
            return (Criteria) this;
        }

        public Criteria andVirtualIpGreaterThanOrEqualTo(String value) {
            addCriterion("VIRTUAL_IP >=", value, "virtualIp");
            return (Criteria) this;
        }

        public Criteria andVirtualIpLessThan(String value) {
            addCriterion("VIRTUAL_IP <", value, "virtualIp");
            return (Criteria) this;
        }

        public Criteria andVirtualIpLessThanOrEqualTo(String value) {
            addCriterion("VIRTUAL_IP <=", value, "virtualIp");
            return (Criteria) this;
        }

        public Criteria andVirtualIpLike(String value) {
            addCriterion("VIRTUAL_IP like", value, "virtualIp");
            return (Criteria) this;
        }

        public Criteria andVirtualIpNotLike(String value) {
            addCriterion("VIRTUAL_IP not like", value, "virtualIp");
            return (Criteria) this;
        }

        public Criteria andVirtualIpIn(List<String> values) {
            addCriterion("VIRTUAL_IP in", values, "virtualIp");
            return (Criteria) this;
        }

        public Criteria andVirtualIpNotIn(List<String> values) {
            addCriterion("VIRTUAL_IP not in", values, "virtualIp");
            return (Criteria) this;
        }

        public Criteria andVirtualIpBetween(String value1, String value2) {
            addCriterion("VIRTUAL_IP between", value1, value2, "virtualIp");
            return (Criteria) this;
        }

        public Criteria andVirtualIpNotBetween(String value1, String value2) {
            addCriterion("VIRTUAL_IP not between", value1, value2, "virtualIp");
            return (Criteria) this;
        }

        public Criteria andAdministratorUserIsNull() {
            addCriterion("ADMINISTRATOR_USER is null");
            return (Criteria) this;
        }

        public Criteria andAdministratorUserIsNotNull() {
            addCriterion("ADMINISTRATOR_USER is not null");
            return (Criteria) this;
        }

        public Criteria andAdministratorUserEqualTo(String value) {
            addCriterion("ADMINISTRATOR_USER =", value, "administratorUser");
            return (Criteria) this;
        }

        public Criteria andAdministratorUserNotEqualTo(String value) {
            addCriterion("ADMINISTRATOR_USER <>", value, "administratorUser");
            return (Criteria) this;
        }

        public Criteria andAdministratorUserGreaterThan(String value) {
            addCriterion("ADMINISTRATOR_USER >", value, "administratorUser");
            return (Criteria) this;
        }

        public Criteria andAdministratorUserGreaterThanOrEqualTo(String value) {
            addCriterion("ADMINISTRATOR_USER >=", value, "administratorUser");
            return (Criteria) this;
        }

        public Criteria andAdministratorUserLessThan(String value) {
            addCriterion("ADMINISTRATOR_USER <", value, "administratorUser");
            return (Criteria) this;
        }

        public Criteria andAdministratorUserLessThanOrEqualTo(String value) {
            addCriterion("ADMINISTRATOR_USER <=", value, "administratorUser");
            return (Criteria) this;
        }

        public Criteria andAdministratorUserLike(String value) {
            addCriterion("ADMINISTRATOR_USER like", value, "administratorUser");
            return (Criteria) this;
        }

        public Criteria andAdministratorUserNotLike(String value) {
            addCriterion("ADMINISTRATOR_USER not like", value, "administratorUser");
            return (Criteria) this;
        }

        public Criteria andAdministratorUserIn(List<String> values) {
            addCriterion("ADMINISTRATOR_USER in", values, "administratorUser");
            return (Criteria) this;
        }

        public Criteria andAdministratorUserNotIn(List<String> values) {
            addCriterion("ADMINISTRATOR_USER not in", values, "administratorUser");
            return (Criteria) this;
        }

        public Criteria andAdministratorUserBetween(String value1, String value2) {
            addCriterion("ADMINISTRATOR_USER between", value1, value2, "administratorUser");
            return (Criteria) this;
        }

        public Criteria andAdministratorUserNotBetween(String value1, String value2) {
            addCriterion("ADMINISTRATOR_USER not between", value1, value2, "administratorUser");
            return (Criteria) this;
        }

        public Criteria andAdministratorPhoneIsNull() {
            addCriterion("ADMINISTRATOR_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andAdministratorPhoneIsNotNull() {
            addCriterion("ADMINISTRATOR_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andAdministratorPhoneEqualTo(String value) {
            addCriterion("ADMINISTRATOR_PHONE =", value, "administratorPhone");
            return (Criteria) this;
        }

        public Criteria andAdministratorPhoneNotEqualTo(String value) {
            addCriterion("ADMINISTRATOR_PHONE <>", value, "administratorPhone");
            return (Criteria) this;
        }

        public Criteria andAdministratorPhoneGreaterThan(String value) {
            addCriterion("ADMINISTRATOR_PHONE >", value, "administratorPhone");
            return (Criteria) this;
        }

        public Criteria andAdministratorPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ADMINISTRATOR_PHONE >=", value, "administratorPhone");
            return (Criteria) this;
        }

        public Criteria andAdministratorPhoneLessThan(String value) {
            addCriterion("ADMINISTRATOR_PHONE <", value, "administratorPhone");
            return (Criteria) this;
        }

        public Criteria andAdministratorPhoneLessThanOrEqualTo(String value) {
            addCriterion("ADMINISTRATOR_PHONE <=", value, "administratorPhone");
            return (Criteria) this;
        }

        public Criteria andAdministratorPhoneLike(String value) {
            addCriterion("ADMINISTRATOR_PHONE like", value, "administratorPhone");
            return (Criteria) this;
        }

        public Criteria andAdministratorPhoneNotLike(String value) {
            addCriterion("ADMINISTRATOR_PHONE not like", value, "administratorPhone");
            return (Criteria) this;
        }

        public Criteria andAdministratorPhoneIn(List<String> values) {
            addCriterion("ADMINISTRATOR_PHONE in", values, "administratorPhone");
            return (Criteria) this;
        }

        public Criteria andAdministratorPhoneNotIn(List<String> values) {
            addCriterion("ADMINISTRATOR_PHONE not in", values, "administratorPhone");
            return (Criteria) this;
        }

        public Criteria andAdministratorPhoneBetween(String value1, String value2) {
            addCriterion("ADMINISTRATOR_PHONE between", value1, value2, "administratorPhone");
            return (Criteria) this;
        }

        public Criteria andAdministratorPhoneNotBetween(String value1, String value2) {
            addCriterion("ADMINISTRATOR_PHONE not between", value1, value2, "administratorPhone");
            return (Criteria) this;
        }

        public Criteria andAcceptanceStateIsNull() {
            addCriterion("ACCEPTANCE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceStateIsNotNull() {
            addCriterion("ACCEPTANCE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceStateEqualTo(Short value) {
            addCriterion("ACCEPTANCE_STATE =", value, "acceptanceState");
            return (Criteria) this;
        }

        public Criteria andAcceptanceStateNotEqualTo(Short value) {
            addCriterion("ACCEPTANCE_STATE <>", value, "acceptanceState");
            return (Criteria) this;
        }

        public Criteria andAcceptanceStateGreaterThan(Short value) {
            addCriterion("ACCEPTANCE_STATE >", value, "acceptanceState");
            return (Criteria) this;
        }

        public Criteria andAcceptanceStateGreaterThanOrEqualTo(Short value) {
            addCriterion("ACCEPTANCE_STATE >=", value, "acceptanceState");
            return (Criteria) this;
        }

        public Criteria andAcceptanceStateLessThan(Short value) {
            addCriterion("ACCEPTANCE_STATE <", value, "acceptanceState");
            return (Criteria) this;
        }

        public Criteria andAcceptanceStateLessThanOrEqualTo(Short value) {
            addCriterion("ACCEPTANCE_STATE <=", value, "acceptanceState");
            return (Criteria) this;
        }

        public Criteria andAcceptanceStateIn(List<Short> values) {
            addCriterion("ACCEPTANCE_STATE in", values, "acceptanceState");
            return (Criteria) this;
        }

        public Criteria andAcceptanceStateNotIn(List<Short> values) {
            addCriterion("ACCEPTANCE_STATE not in", values, "acceptanceState");
            return (Criteria) this;
        }

        public Criteria andAcceptanceStateBetween(Short value1, Short value2) {
            addCriterion("ACCEPTANCE_STATE between", value1, value2, "acceptanceState");
            return (Criteria) this;
        }

        public Criteria andAcceptanceStateNotBetween(Short value1, Short value2) {
            addCriterion("ACCEPTANCE_STATE not between", value1, value2, "acceptanceState");
            return (Criteria) this;
        }

        public Criteria andOwnershipIsNull() {
            addCriterion("OWNERSHIP is null");
            return (Criteria) this;
        }

        public Criteria andOwnershipIsNotNull() {
            addCriterion("OWNERSHIP is not null");
            return (Criteria) this;
        }

        public Criteria andOwnershipEqualTo(Short value) {
            addCriterion("OWNERSHIP =", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipNotEqualTo(Short value) {
            addCriterion("OWNERSHIP <>", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipGreaterThan(Short value) {
            addCriterion("OWNERSHIP >", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipGreaterThanOrEqualTo(Short value) {
            addCriterion("OWNERSHIP >=", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipLessThan(Short value) {
            addCriterion("OWNERSHIP <", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipLessThanOrEqualTo(Short value) {
            addCriterion("OWNERSHIP <=", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipIn(List<Short> values) {
            addCriterion("OWNERSHIP in", values, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipNotIn(List<Short> values) {
            addCriterion("OWNERSHIP not in", values, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipBetween(Short value1, Short value2) {
            addCriterion("OWNERSHIP between", value1, value2, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipNotBetween(Short value1, Short value2) {
            addCriterion("OWNERSHIP not between", value1, value2, "ownership");
            return (Criteria) this;
        }

        public Criteria andHostIpIsNull() {
            addCriterion("HOST_IP is null");
            return (Criteria) this;
        }

        public Criteria andHostIpIsNotNull() {
            addCriterion("HOST_IP is not null");
            return (Criteria) this;
        }

        public Criteria andHostIpEqualTo(String value) {
            addCriterion("HOST_IP =", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotEqualTo(String value) {
            addCriterion("HOST_IP <>", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpGreaterThan(String value) {
            addCriterion("HOST_IP >", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpGreaterThanOrEqualTo(String value) {
            addCriterion("HOST_IP >=", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLessThan(String value) {
            addCriterion("HOST_IP <", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLessThanOrEqualTo(String value) {
            addCriterion("HOST_IP <=", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLike(String value) {
            addCriterion("HOST_IP like", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotLike(String value) {
            addCriterion("HOST_IP not like", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpIn(List<String> values) {
            addCriterion("HOST_IP in", values, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotIn(List<String> values) {
            addCriterion("HOST_IP not in", values, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpBetween(String value1, String value2) {
            addCriterion("HOST_IP between", value1, value2, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotBetween(String value1, String value2) {
            addCriterion("HOST_IP not between", value1, value2, "hostIp");
            return (Criteria) this;
        }

        public Criteria andInstallPathIsNull() {
            addCriterion("INSTALL_PATH is null");
            return (Criteria) this;
        }

        public Criteria andInstallPathIsNotNull() {
            addCriterion("INSTALL_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andInstallPathEqualTo(String value) {
            addCriterion("INSTALL_PATH =", value, "installPath");
            return (Criteria) this;
        }

        public Criteria andInstallPathNotEqualTo(String value) {
            addCriterion("INSTALL_PATH <>", value, "installPath");
            return (Criteria) this;
        }

        public Criteria andInstallPathGreaterThan(String value) {
            addCriterion("INSTALL_PATH >", value, "installPath");
            return (Criteria) this;
        }

        public Criteria andInstallPathGreaterThanOrEqualTo(String value) {
            addCriterion("INSTALL_PATH >=", value, "installPath");
            return (Criteria) this;
        }

        public Criteria andInstallPathLessThan(String value) {
            addCriterion("INSTALL_PATH <", value, "installPath");
            return (Criteria) this;
        }

        public Criteria andInstallPathLessThanOrEqualTo(String value) {
            addCriterion("INSTALL_PATH <=", value, "installPath");
            return (Criteria) this;
        }

        public Criteria andInstallPathLike(String value) {
            addCriterion("INSTALL_PATH like", value, "installPath");
            return (Criteria) this;
        }

        public Criteria andInstallPathNotLike(String value) {
            addCriterion("INSTALL_PATH not like", value, "installPath");
            return (Criteria) this;
        }

        public Criteria andInstallPathIn(List<String> values) {
            addCriterion("INSTALL_PATH in", values, "installPath");
            return (Criteria) this;
        }

        public Criteria andInstallPathNotIn(List<String> values) {
            addCriterion("INSTALL_PATH not in", values, "installPath");
            return (Criteria) this;
        }

        public Criteria andInstallPathBetween(String value1, String value2) {
            addCriterion("INSTALL_PATH between", value1, value2, "installPath");
            return (Criteria) this;
        }

        public Criteria andInstallPathNotBetween(String value1, String value2) {
            addCriterion("INSTALL_PATH not between", value1, value2, "installPath");
            return (Criteria) this;
        }

        public Criteria andPkVendorIsNull() {
            addCriterion("PK_VENDOR is null");
            return (Criteria) this;
        }

        public Criteria andPkVendorIsNotNull() {
            addCriterion("PK_VENDOR is not null");
            return (Criteria) this;
        }

        public Criteria andPkVendorEqualTo(String value) {
            addCriterion("PK_VENDOR =", value, "pkVendor");
            return (Criteria) this;
        }

        public Criteria andPkVendorNotEqualTo(String value) {
            addCriterion("PK_VENDOR <>", value, "pkVendor");
            return (Criteria) this;
        }

        public Criteria andPkVendorGreaterThan(String value) {
            addCriterion("PK_VENDOR >", value, "pkVendor");
            return (Criteria) this;
        }

        public Criteria andPkVendorGreaterThanOrEqualTo(String value) {
            addCriterion("PK_VENDOR >=", value, "pkVendor");
            return (Criteria) this;
        }

        public Criteria andPkVendorLessThan(String value) {
            addCriterion("PK_VENDOR <", value, "pkVendor");
            return (Criteria) this;
        }

        public Criteria andPkVendorLessThanOrEqualTo(String value) {
            addCriterion("PK_VENDOR <=", value, "pkVendor");
            return (Criteria) this;
        }

        public Criteria andPkVendorLike(String value) {
            addCriterion("PK_VENDOR like", value, "pkVendor");
            return (Criteria) this;
        }

        public Criteria andPkVendorNotLike(String value) {
            addCriterion("PK_VENDOR not like", value, "pkVendor");
            return (Criteria) this;
        }

        public Criteria andPkVendorIn(List<String> values) {
            addCriterion("PK_VENDOR in", values, "pkVendor");
            return (Criteria) this;
        }

        public Criteria andPkVendorNotIn(List<String> values) {
            addCriterion("PK_VENDOR not in", values, "pkVendor");
            return (Criteria) this;
        }

        public Criteria andPkVendorBetween(String value1, String value2) {
            addCriterion("PK_VENDOR between", value1, value2, "pkVendor");
            return (Criteria) this;
        }

        public Criteria andPkVendorNotBetween(String value1, String value2) {
            addCriterion("PK_VENDOR not between", value1, value2, "pkVendor");
            return (Criteria) this;
        }

        public Criteria andHardwareModelIsNull() {
            addCriterion("HARDWARE_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andHardwareModelIsNotNull() {
            addCriterion("HARDWARE_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andHardwareModelEqualTo(String value) {
            addCriterion("HARDWARE_MODEL =", value, "hardwareModel");
            return (Criteria) this;
        }

        public Criteria andHardwareModelNotEqualTo(String value) {
            addCriterion("HARDWARE_MODEL <>", value, "hardwareModel");
            return (Criteria) this;
        }

        public Criteria andHardwareModelGreaterThan(String value) {
            addCriterion("HARDWARE_MODEL >", value, "hardwareModel");
            return (Criteria) this;
        }

        public Criteria andHardwareModelGreaterThanOrEqualTo(String value) {
            addCriterion("HARDWARE_MODEL >=", value, "hardwareModel");
            return (Criteria) this;
        }

        public Criteria andHardwareModelLessThan(String value) {
            addCriterion("HARDWARE_MODEL <", value, "hardwareModel");
            return (Criteria) this;
        }

        public Criteria andHardwareModelLessThanOrEqualTo(String value) {
            addCriterion("HARDWARE_MODEL <=", value, "hardwareModel");
            return (Criteria) this;
        }

        public Criteria andHardwareModelLike(String value) {
            addCriterion("HARDWARE_MODEL like", value, "hardwareModel");
            return (Criteria) this;
        }

        public Criteria andHardwareModelNotLike(String value) {
            addCriterion("HARDWARE_MODEL not like", value, "hardwareModel");
            return (Criteria) this;
        }

        public Criteria andHardwareModelIn(List<String> values) {
            addCriterion("HARDWARE_MODEL in", values, "hardwareModel");
            return (Criteria) this;
        }

        public Criteria andHardwareModelNotIn(List<String> values) {
            addCriterion("HARDWARE_MODEL not in", values, "hardwareModel");
            return (Criteria) this;
        }

        public Criteria andHardwareModelBetween(String value1, String value2) {
            addCriterion("HARDWARE_MODEL between", value1, value2, "hardwareModel");
            return (Criteria) this;
        }

        public Criteria andHardwareModelNotBetween(String value1, String value2) {
            addCriterion("HARDWARE_MODEL not between", value1, value2, "hardwareModel");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNameIsNull() {
            addCriterion("OPERATING_SYSTEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNameIsNotNull() {
            addCriterion("OPERATING_SYSTEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNameEqualTo(String value) {
            addCriterion("OPERATING_SYSTEM_NAME =", value, "operatingSystemName");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNameNotEqualTo(String value) {
            addCriterion("OPERATING_SYSTEM_NAME <>", value, "operatingSystemName");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNameGreaterThan(String value) {
            addCriterion("OPERATING_SYSTEM_NAME >", value, "operatingSystemName");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATING_SYSTEM_NAME >=", value, "operatingSystemName");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNameLessThan(String value) {
            addCriterion("OPERATING_SYSTEM_NAME <", value, "operatingSystemName");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNameLessThanOrEqualTo(String value) {
            addCriterion("OPERATING_SYSTEM_NAME <=", value, "operatingSystemName");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNameLike(String value) {
            addCriterion("OPERATING_SYSTEM_NAME like", value, "operatingSystemName");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNameNotLike(String value) {
            addCriterion("OPERATING_SYSTEM_NAME not like", value, "operatingSystemName");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNameIn(List<String> values) {
            addCriterion("OPERATING_SYSTEM_NAME in", values, "operatingSystemName");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNameNotIn(List<String> values) {
            addCriterion("OPERATING_SYSTEM_NAME not in", values, "operatingSystemName");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNameBetween(String value1, String value2) {
            addCriterion("OPERATING_SYSTEM_NAME between", value1, value2, "operatingSystemName");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNameNotBetween(String value1, String value2) {
            addCriterion("OPERATING_SYSTEM_NAME not between", value1, value2, "operatingSystemName");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemVersionIsNull() {
            addCriterion("OPERATING_SYSTEM_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemVersionIsNotNull() {
            addCriterion("OPERATING_SYSTEM_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemVersionEqualTo(String value) {
            addCriterion("OPERATING_SYSTEM_VERSION =", value, "operatingSystemVersion");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemVersionNotEqualTo(String value) {
            addCriterion("OPERATING_SYSTEM_VERSION <>", value, "operatingSystemVersion");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemVersionGreaterThan(String value) {
            addCriterion("OPERATING_SYSTEM_VERSION >", value, "operatingSystemVersion");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemVersionGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATING_SYSTEM_VERSION >=", value, "operatingSystemVersion");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemVersionLessThan(String value) {
            addCriterion("OPERATING_SYSTEM_VERSION <", value, "operatingSystemVersion");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemVersionLessThanOrEqualTo(String value) {
            addCriterion("OPERATING_SYSTEM_VERSION <=", value, "operatingSystemVersion");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemVersionLike(String value) {
            addCriterion("OPERATING_SYSTEM_VERSION like", value, "operatingSystemVersion");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemVersionNotLike(String value) {
            addCriterion("OPERATING_SYSTEM_VERSION not like", value, "operatingSystemVersion");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemVersionIn(List<String> values) {
            addCriterion("OPERATING_SYSTEM_VERSION in", values, "operatingSystemVersion");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemVersionNotIn(List<String> values) {
            addCriterion("OPERATING_SYSTEM_VERSION not in", values, "operatingSystemVersion");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemVersionBetween(String value1, String value2) {
            addCriterion("OPERATING_SYSTEM_VERSION between", value1, value2, "operatingSystemVersion");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemVersionNotBetween(String value1, String value2) {
            addCriterion("OPERATING_SYSTEM_VERSION not between", value1, value2, "operatingSystemVersion");
            return (Criteria) this;
        }

        public Criteria andDevicenameIsNull() {
            addCriterion("DEVICENAME is null");
            return (Criteria) this;
        }

        public Criteria andDevicenameIsNotNull() {
            addCriterion("DEVICENAME is not null");
            return (Criteria) this;
        }

        public Criteria andDevicenameEqualTo(String value) {
            addCriterion("DEVICENAME =", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotEqualTo(String value) {
            addCriterion("DEVICENAME <>", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameGreaterThan(String value) {
            addCriterion("DEVICENAME >", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICENAME >=", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLessThan(String value) {
            addCriterion("DEVICENAME <", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLessThanOrEqualTo(String value) {
            addCriterion("DEVICENAME <=", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLike(String value) {
            addCriterion("DEVICENAME like", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotLike(String value) {
            addCriterion("DEVICENAME not like", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameIn(List<String> values) {
            addCriterion("DEVICENAME in", values, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotIn(List<String> values) {
            addCriterion("DEVICENAME not in", values, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameBetween(String value1, String value2) {
            addCriterion("DEVICENAME between", value1, value2, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotBetween(String value1, String value2) {
            addCriterion("DEVICENAME not between", value1, value2, "devicename");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}