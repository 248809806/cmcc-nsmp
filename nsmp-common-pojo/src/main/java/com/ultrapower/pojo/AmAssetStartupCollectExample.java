package com.ultrapower.pojo;

import java.util.ArrayList;
import java.util.List;

public class AmAssetStartupCollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmAssetStartupCollectExample() {
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

        public Criteria andPkAssetStartupCollectIsNull() {
            addCriterion("PK_ASSET_STARTUP_COLLECT is null");
            return (Criteria) this;
        }

        public Criteria andPkAssetStartupCollectIsNotNull() {
            addCriterion("PK_ASSET_STARTUP_COLLECT is not null");
            return (Criteria) this;
        }

        public Criteria andPkAssetStartupCollectEqualTo(String value) {
            addCriterion("PK_ASSET_STARTUP_COLLECT =", value, "pkAssetStartupCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetStartupCollectNotEqualTo(String value) {
            addCriterion("PK_ASSET_STARTUP_COLLECT <>", value, "pkAssetStartupCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetStartupCollectGreaterThan(String value) {
            addCriterion("PK_ASSET_STARTUP_COLLECT >", value, "pkAssetStartupCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetStartupCollectGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ASSET_STARTUP_COLLECT >=", value, "pkAssetStartupCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetStartupCollectLessThan(String value) {
            addCriterion("PK_ASSET_STARTUP_COLLECT <", value, "pkAssetStartupCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetStartupCollectLessThanOrEqualTo(String value) {
            addCriterion("PK_ASSET_STARTUP_COLLECT <=", value, "pkAssetStartupCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetStartupCollectLike(String value) {
            addCriterion("PK_ASSET_STARTUP_COLLECT like", value, "pkAssetStartupCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetStartupCollectNotLike(String value) {
            addCriterion("PK_ASSET_STARTUP_COLLECT not like", value, "pkAssetStartupCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetStartupCollectIn(List<String> values) {
            addCriterion("PK_ASSET_STARTUP_COLLECT in", values, "pkAssetStartupCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetStartupCollectNotIn(List<String> values) {
            addCriterion("PK_ASSET_STARTUP_COLLECT not in", values, "pkAssetStartupCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetStartupCollectBetween(String value1, String value2) {
            addCriterion("PK_ASSET_STARTUP_COLLECT between", value1, value2, "pkAssetStartupCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetStartupCollectNotBetween(String value1, String value2) {
            addCriterion("PK_ASSET_STARTUP_COLLECT not between", value1, value2, "pkAssetStartupCollect");
            return (Criteria) this;
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

        public Criteria andStartNameIsNull() {
            addCriterion("START_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStartNameIsNotNull() {
            addCriterion("START_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStartNameEqualTo(String value) {
            addCriterion("START_NAME =", value, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameNotEqualTo(String value) {
            addCriterion("START_NAME <>", value, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameGreaterThan(String value) {
            addCriterion("START_NAME >", value, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameGreaterThanOrEqualTo(String value) {
            addCriterion("START_NAME >=", value, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameLessThan(String value) {
            addCriterion("START_NAME <", value, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameLessThanOrEqualTo(String value) {
            addCriterion("START_NAME <=", value, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameLike(String value) {
            addCriterion("START_NAME like", value, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameNotLike(String value) {
            addCriterion("START_NAME not like", value, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameIn(List<String> values) {
            addCriterion("START_NAME in", values, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameNotIn(List<String> values) {
            addCriterion("START_NAME not in", values, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameBetween(String value1, String value2) {
            addCriterion("START_NAME between", value1, value2, "startName");
            return (Criteria) this;
        }

        public Criteria andStartNameNotBetween(String value1, String value2) {
            addCriterion("START_NAME not between", value1, value2, "startName");
            return (Criteria) this;
        }

        public Criteria andStartFileIsNull() {
            addCriterion("START_FILE is null");
            return (Criteria) this;
        }

        public Criteria andStartFileIsNotNull() {
            addCriterion("START_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andStartFileEqualTo(String value) {
            addCriterion("START_FILE =", value, "startFile");
            return (Criteria) this;
        }

        public Criteria andStartFileNotEqualTo(String value) {
            addCriterion("START_FILE <>", value, "startFile");
            return (Criteria) this;
        }

        public Criteria andStartFileGreaterThan(String value) {
            addCriterion("START_FILE >", value, "startFile");
            return (Criteria) this;
        }

        public Criteria andStartFileGreaterThanOrEqualTo(String value) {
            addCriterion("START_FILE >=", value, "startFile");
            return (Criteria) this;
        }

        public Criteria andStartFileLessThan(String value) {
            addCriterion("START_FILE <", value, "startFile");
            return (Criteria) this;
        }

        public Criteria andStartFileLessThanOrEqualTo(String value) {
            addCriterion("START_FILE <=", value, "startFile");
            return (Criteria) this;
        }

        public Criteria andStartFileLike(String value) {
            addCriterion("START_FILE like", value, "startFile");
            return (Criteria) this;
        }

        public Criteria andStartFileNotLike(String value) {
            addCriterion("START_FILE not like", value, "startFile");
            return (Criteria) this;
        }

        public Criteria andStartFileIn(List<String> values) {
            addCriterion("START_FILE in", values, "startFile");
            return (Criteria) this;
        }

        public Criteria andStartFileNotIn(List<String> values) {
            addCriterion("START_FILE not in", values, "startFile");
            return (Criteria) this;
        }

        public Criteria andStartFileBetween(String value1, String value2) {
            addCriterion("START_FILE between", value1, value2, "startFile");
            return (Criteria) this;
        }

        public Criteria andStartFileNotBetween(String value1, String value2) {
            addCriterion("START_FILE not between", value1, value2, "startFile");
            return (Criteria) this;
        }

        public Criteria andSrvTypeIsNull() {
            addCriterion("SRV_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSrvTypeIsNotNull() {
            addCriterion("SRV_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSrvTypeEqualTo(String value) {
            addCriterion("SRV_TYPE =", value, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeNotEqualTo(String value) {
            addCriterion("SRV_TYPE <>", value, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeGreaterThan(String value) {
            addCriterion("SRV_TYPE >", value, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SRV_TYPE >=", value, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeLessThan(String value) {
            addCriterion("SRV_TYPE <", value, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeLessThanOrEqualTo(String value) {
            addCriterion("SRV_TYPE <=", value, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeLike(String value) {
            addCriterion("SRV_TYPE like", value, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeNotLike(String value) {
            addCriterion("SRV_TYPE not like", value, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeIn(List<String> values) {
            addCriterion("SRV_TYPE in", values, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeNotIn(List<String> values) {
            addCriterion("SRV_TYPE not in", values, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeBetween(String value1, String value2) {
            addCriterion("SRV_TYPE between", value1, value2, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeNotBetween(String value1, String value2) {
            addCriterion("SRV_TYPE not between", value1, value2, "srvType");
            return (Criteria) this;
        }

        public Criteria andStartTypeIsNull() {
            addCriterion("START_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andStartTypeIsNotNull() {
            addCriterion("START_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStartTypeEqualTo(String value) {
            addCriterion("START_TYPE =", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeNotEqualTo(String value) {
            addCriterion("START_TYPE <>", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeGreaterThan(String value) {
            addCriterion("START_TYPE >", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeGreaterThanOrEqualTo(String value) {
            addCriterion("START_TYPE >=", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeLessThan(String value) {
            addCriterion("START_TYPE <", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeLessThanOrEqualTo(String value) {
            addCriterion("START_TYPE <=", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeLike(String value) {
            addCriterion("START_TYPE like", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeNotLike(String value) {
            addCriterion("START_TYPE not like", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeIn(List<String> values) {
            addCriterion("START_TYPE in", values, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeNotIn(List<String> values) {
            addCriterion("START_TYPE not in", values, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeBetween(String value1, String value2) {
            addCriterion("START_TYPE between", value1, value2, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeNotBetween(String value1, String value2) {
            addCriterion("START_TYPE not between", value1, value2, "startType");
            return (Criteria) this;
        }

        public Criteria andSrvDescIsNull() {
            addCriterion("SRV_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSrvDescIsNotNull() {
            addCriterion("SRV_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSrvDescEqualTo(String value) {
            addCriterion("SRV_DESC =", value, "srvDesc");
            return (Criteria) this;
        }

        public Criteria andSrvDescNotEqualTo(String value) {
            addCriterion("SRV_DESC <>", value, "srvDesc");
            return (Criteria) this;
        }

        public Criteria andSrvDescGreaterThan(String value) {
            addCriterion("SRV_DESC >", value, "srvDesc");
            return (Criteria) this;
        }

        public Criteria andSrvDescGreaterThanOrEqualTo(String value) {
            addCriterion("SRV_DESC >=", value, "srvDesc");
            return (Criteria) this;
        }

        public Criteria andSrvDescLessThan(String value) {
            addCriterion("SRV_DESC <", value, "srvDesc");
            return (Criteria) this;
        }

        public Criteria andSrvDescLessThanOrEqualTo(String value) {
            addCriterion("SRV_DESC <=", value, "srvDesc");
            return (Criteria) this;
        }

        public Criteria andSrvDescLike(String value) {
            addCriterion("SRV_DESC like", value, "srvDesc");
            return (Criteria) this;
        }

        public Criteria andSrvDescNotLike(String value) {
            addCriterion("SRV_DESC not like", value, "srvDesc");
            return (Criteria) this;
        }

        public Criteria andSrvDescIn(List<String> values) {
            addCriterion("SRV_DESC in", values, "srvDesc");
            return (Criteria) this;
        }

        public Criteria andSrvDescNotIn(List<String> values) {
            addCriterion("SRV_DESC not in", values, "srvDesc");
            return (Criteria) this;
        }

        public Criteria andSrvDescBetween(String value1, String value2) {
            addCriterion("SRV_DESC between", value1, value2, "srvDesc");
            return (Criteria) this;
        }

        public Criteria andSrvDescNotBetween(String value1, String value2) {
            addCriterion("SRV_DESC not between", value1, value2, "srvDesc");
            return (Criteria) this;
        }

        public Criteria andRunStateIsNull() {
            addCriterion("RUN_STATE is null");
            return (Criteria) this;
        }

        public Criteria andRunStateIsNotNull() {
            addCriterion("RUN_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andRunStateEqualTo(String value) {
            addCriterion("RUN_STATE =", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateNotEqualTo(String value) {
            addCriterion("RUN_STATE <>", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateGreaterThan(String value) {
            addCriterion("RUN_STATE >", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateGreaterThanOrEqualTo(String value) {
            addCriterion("RUN_STATE >=", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateLessThan(String value) {
            addCriterion("RUN_STATE <", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateLessThanOrEqualTo(String value) {
            addCriterion("RUN_STATE <=", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateLike(String value) {
            addCriterion("RUN_STATE like", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateNotLike(String value) {
            addCriterion("RUN_STATE not like", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateIn(List<String> values) {
            addCriterion("RUN_STATE in", values, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateNotIn(List<String> values) {
            addCriterion("RUN_STATE not in", values, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateBetween(String value1, String value2) {
            addCriterion("RUN_STATE between", value1, value2, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateNotBetween(String value1, String value2) {
            addCriterion("RUN_STATE not between", value1, value2, "runState");
            return (Criteria) this;
        }

        public Criteria andRunLevelIsNull() {
            addCriterion("RUN_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andRunLevelIsNotNull() {
            addCriterion("RUN_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andRunLevelEqualTo(String value) {
            addCriterion("RUN_LEVEL =", value, "runLevel");
            return (Criteria) this;
        }

        public Criteria andRunLevelNotEqualTo(String value) {
            addCriterion("RUN_LEVEL <>", value, "runLevel");
            return (Criteria) this;
        }

        public Criteria andRunLevelGreaterThan(String value) {
            addCriterion("RUN_LEVEL >", value, "runLevel");
            return (Criteria) this;
        }

        public Criteria andRunLevelGreaterThanOrEqualTo(String value) {
            addCriterion("RUN_LEVEL >=", value, "runLevel");
            return (Criteria) this;
        }

        public Criteria andRunLevelLessThan(String value) {
            addCriterion("RUN_LEVEL <", value, "runLevel");
            return (Criteria) this;
        }

        public Criteria andRunLevelLessThanOrEqualTo(String value) {
            addCriterion("RUN_LEVEL <=", value, "runLevel");
            return (Criteria) this;
        }

        public Criteria andRunLevelLike(String value) {
            addCriterion("RUN_LEVEL like", value, "runLevel");
            return (Criteria) this;
        }

        public Criteria andRunLevelNotLike(String value) {
            addCriterion("RUN_LEVEL not like", value, "runLevel");
            return (Criteria) this;
        }

        public Criteria andRunLevelIn(List<String> values) {
            addCriterion("RUN_LEVEL in", values, "runLevel");
            return (Criteria) this;
        }

        public Criteria andRunLevelNotIn(List<String> values) {
            addCriterion("RUN_LEVEL not in", values, "runLevel");
            return (Criteria) this;
        }

        public Criteria andRunLevelBetween(String value1, String value2) {
            addCriterion("RUN_LEVEL between", value1, value2, "runLevel");
            return (Criteria) this;
        }

        public Criteria andRunLevelNotBetween(String value1, String value2) {
            addCriterion("RUN_LEVEL not between", value1, value2, "runLevel");
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