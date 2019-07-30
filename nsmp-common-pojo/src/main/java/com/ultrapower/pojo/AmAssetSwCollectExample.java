package com.ultrapower.pojo;

import java.util.ArrayList;
import java.util.List;

public class AmAssetSwCollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmAssetSwCollectExample() {
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

        public Criteria andPkAssetSwCollectIsNull() {
            addCriterion("PK_ASSET_SW_COLLECT is null");
            return (Criteria) this;
        }

        public Criteria andPkAssetSwCollectIsNotNull() {
            addCriterion("PK_ASSET_SW_COLLECT is not null");
            return (Criteria) this;
        }

        public Criteria andPkAssetSwCollectEqualTo(String value) {
            addCriterion("PK_ASSET_SW_COLLECT =", value, "pkAssetSwCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSwCollectNotEqualTo(String value) {
            addCriterion("PK_ASSET_SW_COLLECT <>", value, "pkAssetSwCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSwCollectGreaterThan(String value) {
            addCriterion("PK_ASSET_SW_COLLECT >", value, "pkAssetSwCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSwCollectGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ASSET_SW_COLLECT >=", value, "pkAssetSwCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSwCollectLessThan(String value) {
            addCriterion("PK_ASSET_SW_COLLECT <", value, "pkAssetSwCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSwCollectLessThanOrEqualTo(String value) {
            addCriterion("PK_ASSET_SW_COLLECT <=", value, "pkAssetSwCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSwCollectLike(String value) {
            addCriterion("PK_ASSET_SW_COLLECT like", value, "pkAssetSwCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSwCollectNotLike(String value) {
            addCriterion("PK_ASSET_SW_COLLECT not like", value, "pkAssetSwCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSwCollectIn(List<String> values) {
            addCriterion("PK_ASSET_SW_COLLECT in", values, "pkAssetSwCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSwCollectNotIn(List<String> values) {
            addCriterion("PK_ASSET_SW_COLLECT not in", values, "pkAssetSwCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSwCollectBetween(String value1, String value2) {
            addCriterion("PK_ASSET_SW_COLLECT between", value1, value2, "pkAssetSwCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetSwCollectNotBetween(String value1, String value2) {
            addCriterion("PK_ASSET_SW_COLLECT not between", value1, value2, "pkAssetSwCollect");
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

        public Criteria andSwNameIsNull() {
            addCriterion("SW_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSwNameIsNotNull() {
            addCriterion("SW_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSwNameEqualTo(String value) {
            addCriterion("SW_NAME =", value, "swName");
            return (Criteria) this;
        }

        public Criteria andSwNameNotEqualTo(String value) {
            addCriterion("SW_NAME <>", value, "swName");
            return (Criteria) this;
        }

        public Criteria andSwNameGreaterThan(String value) {
            addCriterion("SW_NAME >", value, "swName");
            return (Criteria) this;
        }

        public Criteria andSwNameGreaterThanOrEqualTo(String value) {
            addCriterion("SW_NAME >=", value, "swName");
            return (Criteria) this;
        }

        public Criteria andSwNameLessThan(String value) {
            addCriterion("SW_NAME <", value, "swName");
            return (Criteria) this;
        }

        public Criteria andSwNameLessThanOrEqualTo(String value) {
            addCriterion("SW_NAME <=", value, "swName");
            return (Criteria) this;
        }

        public Criteria andSwNameLike(String value) {
            addCriterion("SW_NAME like", value, "swName");
            return (Criteria) this;
        }

        public Criteria andSwNameNotLike(String value) {
            addCriterion("SW_NAME not like", value, "swName");
            return (Criteria) this;
        }

        public Criteria andSwNameIn(List<String> values) {
            addCriterion("SW_NAME in", values, "swName");
            return (Criteria) this;
        }

        public Criteria andSwNameNotIn(List<String> values) {
            addCriterion("SW_NAME not in", values, "swName");
            return (Criteria) this;
        }

        public Criteria andSwNameBetween(String value1, String value2) {
            addCriterion("SW_NAME between", value1, value2, "swName");
            return (Criteria) this;
        }

        public Criteria andSwNameNotBetween(String value1, String value2) {
            addCriterion("SW_NAME not between", value1, value2, "swName");
            return (Criteria) this;
        }

        public Criteria andSwVerIsNull() {
            addCriterion("SW_VER is null");
            return (Criteria) this;
        }

        public Criteria andSwVerIsNotNull() {
            addCriterion("SW_VER is not null");
            return (Criteria) this;
        }

        public Criteria andSwVerEqualTo(String value) {
            addCriterion("SW_VER =", value, "swVer");
            return (Criteria) this;
        }

        public Criteria andSwVerNotEqualTo(String value) {
            addCriterion("SW_VER <>", value, "swVer");
            return (Criteria) this;
        }

        public Criteria andSwVerGreaterThan(String value) {
            addCriterion("SW_VER >", value, "swVer");
            return (Criteria) this;
        }

        public Criteria andSwVerGreaterThanOrEqualTo(String value) {
            addCriterion("SW_VER >=", value, "swVer");
            return (Criteria) this;
        }

        public Criteria andSwVerLessThan(String value) {
            addCriterion("SW_VER <", value, "swVer");
            return (Criteria) this;
        }

        public Criteria andSwVerLessThanOrEqualTo(String value) {
            addCriterion("SW_VER <=", value, "swVer");
            return (Criteria) this;
        }

        public Criteria andSwVerLike(String value) {
            addCriterion("SW_VER like", value, "swVer");
            return (Criteria) this;
        }

        public Criteria andSwVerNotLike(String value) {
            addCriterion("SW_VER not like", value, "swVer");
            return (Criteria) this;
        }

        public Criteria andSwVerIn(List<String> values) {
            addCriterion("SW_VER in", values, "swVer");
            return (Criteria) this;
        }

        public Criteria andSwVerNotIn(List<String> values) {
            addCriterion("SW_VER not in", values, "swVer");
            return (Criteria) this;
        }

        public Criteria andSwVerBetween(String value1, String value2) {
            addCriterion("SW_VER between", value1, value2, "swVer");
            return (Criteria) this;
        }

        public Criteria andSwVerNotBetween(String value1, String value2) {
            addCriterion("SW_VER not between", value1, value2, "swVer");
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

        public Criteria andRunStateEqualTo(Short value) {
            addCriterion("RUN_STATE =", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateNotEqualTo(Short value) {
            addCriterion("RUN_STATE <>", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateGreaterThan(Short value) {
            addCriterion("RUN_STATE >", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateGreaterThanOrEqualTo(Short value) {
            addCriterion("RUN_STATE >=", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateLessThan(Short value) {
            addCriterion("RUN_STATE <", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateLessThanOrEqualTo(Short value) {
            addCriterion("RUN_STATE <=", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateIn(List<Short> values) {
            addCriterion("RUN_STATE in", values, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateNotIn(List<Short> values) {
            addCriterion("RUN_STATE not in", values, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateBetween(Short value1, Short value2) {
            addCriterion("RUN_STATE between", value1, value2, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateNotBetween(Short value1, Short value2) {
            addCriterion("RUN_STATE not between", value1, value2, "runState");
            return (Criteria) this;
        }

        public Criteria andSwDescIsNull() {
            addCriterion("SW_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSwDescIsNotNull() {
            addCriterion("SW_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSwDescEqualTo(String value) {
            addCriterion("SW_DESC =", value, "swDesc");
            return (Criteria) this;
        }

        public Criteria andSwDescNotEqualTo(String value) {
            addCriterion("SW_DESC <>", value, "swDesc");
            return (Criteria) this;
        }

        public Criteria andSwDescGreaterThan(String value) {
            addCriterion("SW_DESC >", value, "swDesc");
            return (Criteria) this;
        }

        public Criteria andSwDescGreaterThanOrEqualTo(String value) {
            addCriterion("SW_DESC >=", value, "swDesc");
            return (Criteria) this;
        }

        public Criteria andSwDescLessThan(String value) {
            addCriterion("SW_DESC <", value, "swDesc");
            return (Criteria) this;
        }

        public Criteria andSwDescLessThanOrEqualTo(String value) {
            addCriterion("SW_DESC <=", value, "swDesc");
            return (Criteria) this;
        }

        public Criteria andSwDescLike(String value) {
            addCriterion("SW_DESC like", value, "swDesc");
            return (Criteria) this;
        }

        public Criteria andSwDescNotLike(String value) {
            addCriterion("SW_DESC not like", value, "swDesc");
            return (Criteria) this;
        }

        public Criteria andSwDescIn(List<String> values) {
            addCriterion("SW_DESC in", values, "swDesc");
            return (Criteria) this;
        }

        public Criteria andSwDescNotIn(List<String> values) {
            addCriterion("SW_DESC not in", values, "swDesc");
            return (Criteria) this;
        }

        public Criteria andSwDescBetween(String value1, String value2) {
            addCriterion("SW_DESC between", value1, value2, "swDesc");
            return (Criteria) this;
        }

        public Criteria andSwDescNotBetween(String value1, String value2) {
            addCriterion("SW_DESC not between", value1, value2, "swDesc");
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