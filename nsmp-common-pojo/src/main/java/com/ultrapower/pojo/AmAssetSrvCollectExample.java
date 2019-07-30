package com.ultrapower.pojo;

import java.util.ArrayList;
import java.util.List;

public class AmAssetSrvCollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmAssetSrvCollectExample() {
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

        public Criteria andPkAssetSrvCollectIsNull() {
            addCriterion("PK_ASSET_SRV_COLLECT is null");
            return (Criteria) this;
        }

        public Criteria andPkAssetSrvCollectIsNotNull() {
            addCriterion("PK_ASSET_SRV_COLLECT is not null");
            return (Criteria) this;
        }

        public Criteria andPkAssetSrvCollectEqualTo(String value) {
            addCriterion("PK_ASSET_SRV_COLLECT =", value, "pkAssetSrvCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSrvCollectNotEqualTo(String value) {
            addCriterion("PK_ASSET_SRV_COLLECT <>", value, "pkAssetSrvCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSrvCollectGreaterThan(String value) {
            addCriterion("PK_ASSET_SRV_COLLECT >", value, "pkAssetSrvCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSrvCollectGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ASSET_SRV_COLLECT >=", value, "pkAssetSrvCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSrvCollectLessThan(String value) {
            addCriterion("PK_ASSET_SRV_COLLECT <", value, "pkAssetSrvCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSrvCollectLessThanOrEqualTo(String value) {
            addCriterion("PK_ASSET_SRV_COLLECT <=", value, "pkAssetSrvCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSrvCollectLike(String value) {
            addCriterion("PK_ASSET_SRV_COLLECT like", value, "pkAssetSrvCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSrvCollectNotLike(String value) {
            addCriterion("PK_ASSET_SRV_COLLECT not like", value, "pkAssetSrvCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSrvCollectIn(List<String> values) {
            addCriterion("PK_ASSET_SRV_COLLECT in", values, "pkAssetSrvCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSrvCollectNotIn(List<String> values) {
            addCriterion("PK_ASSET_SRV_COLLECT not in", values, "pkAssetSrvCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSrvCollectBetween(String value1, String value2) {
            addCriterion("PK_ASSET_SRV_COLLECT between", value1, value2, "pkAssetSrvCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSrvCollectNotBetween(String value1, String value2) {
            addCriterion("PK_ASSET_SRV_COLLECT not between", value1, value2, "pkAssetSrvCollect");
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

        public Criteria andSrvNameIsNull() {
            addCriterion("SRV_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSrvNameIsNotNull() {
            addCriterion("SRV_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSrvNameEqualTo(String value) {
            addCriterion("SRV_NAME =", value, "srvName");
            return (Criteria) this;
        }

        public Criteria andSrvNameNotEqualTo(String value) {
            addCriterion("SRV_NAME <>", value, "srvName");
            return (Criteria) this;
        }

        public Criteria andSrvNameGreaterThan(String value) {
            addCriterion("SRV_NAME >", value, "srvName");
            return (Criteria) this;
        }

        public Criteria andSrvNameGreaterThanOrEqualTo(String value) {
            addCriterion("SRV_NAME >=", value, "srvName");
            return (Criteria) this;
        }

        public Criteria andSrvNameLessThan(String value) {
            addCriterion("SRV_NAME <", value, "srvName");
            return (Criteria) this;
        }

        public Criteria andSrvNameLessThanOrEqualTo(String value) {
            addCriterion("SRV_NAME <=", value, "srvName");
            return (Criteria) this;
        }

        public Criteria andSrvNameLike(String value) {
            addCriterion("SRV_NAME like", value, "srvName");
            return (Criteria) this;
        }

        public Criteria andSrvNameNotLike(String value) {
            addCriterion("SRV_NAME not like", value, "srvName");
            return (Criteria) this;
        }

        public Criteria andSrvNameIn(List<String> values) {
            addCriterion("SRV_NAME in", values, "srvName");
            return (Criteria) this;
        }

        public Criteria andSrvNameNotIn(List<String> values) {
            addCriterion("SRV_NAME not in", values, "srvName");
            return (Criteria) this;
        }

        public Criteria andSrvNameBetween(String value1, String value2) {
            addCriterion("SRV_NAME between", value1, value2, "srvName");
            return (Criteria) this;
        }

        public Criteria andSrvNameNotBetween(String value1, String value2) {
            addCriterion("SRV_NAME not between", value1, value2, "srvName");
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

        public Criteria andSrvStateIsNull() {
            addCriterion("SRV_STATE is null");
            return (Criteria) this;
        }

        public Criteria andSrvStateIsNotNull() {
            addCriterion("SRV_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andSrvStateEqualTo(Integer value) {
            addCriterion("SRV_STATE =", value, "srvState");
            return (Criteria) this;
        }

        public Criteria andSrvStateNotEqualTo(Integer value) {
            addCriterion("SRV_STATE <>", value, "srvState");
            return (Criteria) this;
        }

        public Criteria andSrvStateGreaterThan(Integer value) {
            addCriterion("SRV_STATE >", value, "srvState");
            return (Criteria) this;
        }

        public Criteria andSrvStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("SRV_STATE >=", value, "srvState");
            return (Criteria) this;
        }

        public Criteria andSrvStateLessThan(Integer value) {
            addCriterion("SRV_STATE <", value, "srvState");
            return (Criteria) this;
        }

        public Criteria andSrvStateLessThanOrEqualTo(Integer value) {
            addCriterion("SRV_STATE <=", value, "srvState");
            return (Criteria) this;
        }

        public Criteria andSrvStateIn(List<Integer> values) {
            addCriterion("SRV_STATE in", values, "srvState");
            return (Criteria) this;
        }

        public Criteria andSrvStateNotIn(List<Integer> values) {
            addCriterion("SRV_STATE not in", values, "srvState");
            return (Criteria) this;
        }

        public Criteria andSrvStateBetween(Integer value1, Integer value2) {
            addCriterion("SRV_STATE between", value1, value2, "srvState");
            return (Criteria) this;
        }

        public Criteria andSrvStateNotBetween(Integer value1, Integer value2) {
            addCriterion("SRV_STATE not between", value1, value2, "srvState");
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

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("PID like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("PID not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("PID not between", value1, value2, "pid");
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