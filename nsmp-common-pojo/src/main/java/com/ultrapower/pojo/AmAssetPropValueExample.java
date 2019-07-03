package com.ultrapower.pojo;

import java.util.ArrayList;
import java.util.List;

public class AmAssetPropValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmAssetPropValueExample() {
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

        public Criteria andPkAssetPropValueIsNull() {
            addCriterion("PK_ASSET_PROP_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropValueIsNotNull() {
            addCriterion("PK_ASSET_PROP_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropValueEqualTo(String value) {
            addCriterion("PK_ASSET_PROP_VALUE =", value, "pkAssetPropValue");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropValueNotEqualTo(String value) {
            addCriterion("PK_ASSET_PROP_VALUE <>", value, "pkAssetPropValue");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropValueGreaterThan(String value) {
            addCriterion("PK_ASSET_PROP_VALUE >", value, "pkAssetPropValue");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropValueGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ASSET_PROP_VALUE >=", value, "pkAssetPropValue");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropValueLessThan(String value) {
            addCriterion("PK_ASSET_PROP_VALUE <", value, "pkAssetPropValue");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropValueLessThanOrEqualTo(String value) {
            addCriterion("PK_ASSET_PROP_VALUE <=", value, "pkAssetPropValue");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropValueLike(String value) {
            addCriterion("PK_ASSET_PROP_VALUE like", value, "pkAssetPropValue");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropValueNotLike(String value) {
            addCriterion("PK_ASSET_PROP_VALUE not like", value, "pkAssetPropValue");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropValueIn(List<String> values) {
            addCriterion("PK_ASSET_PROP_VALUE in", values, "pkAssetPropValue");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropValueNotIn(List<String> values) {
            addCriterion("PK_ASSET_PROP_VALUE not in", values, "pkAssetPropValue");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropValueBetween(String value1, String value2) {
            addCriterion("PK_ASSET_PROP_VALUE between", value1, value2, "pkAssetPropValue");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropValueNotBetween(String value1, String value2) {
            addCriterion("PK_ASSET_PROP_VALUE not between", value1, value2, "pkAssetPropValue");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropIsNull() {
            addCriterion("PK_ASSET_PROP is null");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropIsNotNull() {
            addCriterion("PK_ASSET_PROP is not null");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropEqualTo(String value) {
            addCriterion("PK_ASSET_PROP =", value, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropNotEqualTo(String value) {
            addCriterion("PK_ASSET_PROP <>", value, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropGreaterThan(String value) {
            addCriterion("PK_ASSET_PROP >", value, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ASSET_PROP >=", value, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropLessThan(String value) {
            addCriterion("PK_ASSET_PROP <", value, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropLessThanOrEqualTo(String value) {
            addCriterion("PK_ASSET_PROP <=", value, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropLike(String value) {
            addCriterion("PK_ASSET_PROP like", value, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropNotLike(String value) {
            addCriterion("PK_ASSET_PROP not like", value, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropIn(List<String> values) {
            addCriterion("PK_ASSET_PROP in", values, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropNotIn(List<String> values) {
            addCriterion("PK_ASSET_PROP not in", values, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropBetween(String value1, String value2) {
            addCriterion("PK_ASSET_PROP between", value1, value2, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropNotBetween(String value1, String value2) {
            addCriterion("PK_ASSET_PROP not between", value1, value2, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andValueNameIsNull() {
            addCriterion("VALUE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andValueNameIsNotNull() {
            addCriterion("VALUE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andValueNameEqualTo(String value) {
            addCriterion("VALUE_NAME =", value, "valueName");
            return (Criteria) this;
        }

        public Criteria andValueNameNotEqualTo(String value) {
            addCriterion("VALUE_NAME <>", value, "valueName");
            return (Criteria) this;
        }

        public Criteria andValueNameGreaterThan(String value) {
            addCriterion("VALUE_NAME >", value, "valueName");
            return (Criteria) this;
        }

        public Criteria andValueNameGreaterThanOrEqualTo(String value) {
            addCriterion("VALUE_NAME >=", value, "valueName");
            return (Criteria) this;
        }

        public Criteria andValueNameLessThan(String value) {
            addCriterion("VALUE_NAME <", value, "valueName");
            return (Criteria) this;
        }

        public Criteria andValueNameLessThanOrEqualTo(String value) {
            addCriterion("VALUE_NAME <=", value, "valueName");
            return (Criteria) this;
        }

        public Criteria andValueNameLike(String value) {
            addCriterion("VALUE_NAME like", value, "valueName");
            return (Criteria) this;
        }

        public Criteria andValueNameNotLike(String value) {
            addCriterion("VALUE_NAME not like", value, "valueName");
            return (Criteria) this;
        }

        public Criteria andValueNameIn(List<String> values) {
            addCriterion("VALUE_NAME in", values, "valueName");
            return (Criteria) this;
        }

        public Criteria andValueNameNotIn(List<String> values) {
            addCriterion("VALUE_NAME not in", values, "valueName");
            return (Criteria) this;
        }

        public Criteria andValueNameBetween(String value1, String value2) {
            addCriterion("VALUE_NAME between", value1, value2, "valueName");
            return (Criteria) this;
        }

        public Criteria andValueNameNotBetween(String value1, String value2) {
            addCriterion("VALUE_NAME not between", value1, value2, "valueName");
            return (Criteria) this;
        }

        public Criteria andValueCodeIsNull() {
            addCriterion("VALUE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andValueCodeIsNotNull() {
            addCriterion("VALUE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andValueCodeEqualTo(String value) {
            addCriterion("VALUE_CODE =", value, "valueCode");
            return (Criteria) this;
        }

        public Criteria andValueCodeNotEqualTo(String value) {
            addCriterion("VALUE_CODE <>", value, "valueCode");
            return (Criteria) this;
        }

        public Criteria andValueCodeGreaterThan(String value) {
            addCriterion("VALUE_CODE >", value, "valueCode");
            return (Criteria) this;
        }

        public Criteria andValueCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VALUE_CODE >=", value, "valueCode");
            return (Criteria) this;
        }

        public Criteria andValueCodeLessThan(String value) {
            addCriterion("VALUE_CODE <", value, "valueCode");
            return (Criteria) this;
        }

        public Criteria andValueCodeLessThanOrEqualTo(String value) {
            addCriterion("VALUE_CODE <=", value, "valueCode");
            return (Criteria) this;
        }

        public Criteria andValueCodeLike(String value) {
            addCriterion("VALUE_CODE like", value, "valueCode");
            return (Criteria) this;
        }

        public Criteria andValueCodeNotLike(String value) {
            addCriterion("VALUE_CODE not like", value, "valueCode");
            return (Criteria) this;
        }

        public Criteria andValueCodeIn(List<String> values) {
            addCriterion("VALUE_CODE in", values, "valueCode");
            return (Criteria) this;
        }

        public Criteria andValueCodeNotIn(List<String> values) {
            addCriterion("VALUE_CODE not in", values, "valueCode");
            return (Criteria) this;
        }

        public Criteria andValueCodeBetween(String value1, String value2) {
            addCriterion("VALUE_CODE between", value1, value2, "valueCode");
            return (Criteria) this;
        }

        public Criteria andValueCodeNotBetween(String value1, String value2) {
            addCriterion("VALUE_CODE not between", value1, value2, "valueCode");
            return (Criteria) this;
        }

        public Criteria andValueDescIsNull() {
            addCriterion("VALUE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andValueDescIsNotNull() {
            addCriterion("VALUE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andValueDescEqualTo(String value) {
            addCriterion("VALUE_DESC =", value, "valueDesc");
            return (Criteria) this;
        }

        public Criteria andValueDescNotEqualTo(String value) {
            addCriterion("VALUE_DESC <>", value, "valueDesc");
            return (Criteria) this;
        }

        public Criteria andValueDescGreaterThan(String value) {
            addCriterion("VALUE_DESC >", value, "valueDesc");
            return (Criteria) this;
        }

        public Criteria andValueDescGreaterThanOrEqualTo(String value) {
            addCriterion("VALUE_DESC >=", value, "valueDesc");
            return (Criteria) this;
        }

        public Criteria andValueDescLessThan(String value) {
            addCriterion("VALUE_DESC <", value, "valueDesc");
            return (Criteria) this;
        }

        public Criteria andValueDescLessThanOrEqualTo(String value) {
            addCriterion("VALUE_DESC <=", value, "valueDesc");
            return (Criteria) this;
        }

        public Criteria andValueDescLike(String value) {
            addCriterion("VALUE_DESC like", value, "valueDesc");
            return (Criteria) this;
        }

        public Criteria andValueDescNotLike(String value) {
            addCriterion("VALUE_DESC not like", value, "valueDesc");
            return (Criteria) this;
        }

        public Criteria andValueDescIn(List<String> values) {
            addCriterion("VALUE_DESC in", values, "valueDesc");
            return (Criteria) this;
        }

        public Criteria andValueDescNotIn(List<String> values) {
            addCriterion("VALUE_DESC not in", values, "valueDesc");
            return (Criteria) this;
        }

        public Criteria andValueDescBetween(String value1, String value2) {
            addCriterion("VALUE_DESC between", value1, value2, "valueDesc");
            return (Criteria) this;
        }

        public Criteria andValueDescNotBetween(String value1, String value2) {
            addCriterion("VALUE_DESC not between", value1, value2, "valueDesc");
            return (Criteria) this;
        }

        public Criteria andPkValueParentIsNull() {
            addCriterion("PK_VALUE_PARENT is null");
            return (Criteria) this;
        }

        public Criteria andPkValueParentIsNotNull() {
            addCriterion("PK_VALUE_PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andPkValueParentEqualTo(String value) {
            addCriterion("PK_VALUE_PARENT =", value, "pkValueParent");
            return (Criteria) this;
        }

        public Criteria andPkValueParentNotEqualTo(String value) {
            addCriterion("PK_VALUE_PARENT <>", value, "pkValueParent");
            return (Criteria) this;
        }

        public Criteria andPkValueParentGreaterThan(String value) {
            addCriterion("PK_VALUE_PARENT >", value, "pkValueParent");
            return (Criteria) this;
        }

        public Criteria andPkValueParentGreaterThanOrEqualTo(String value) {
            addCriterion("PK_VALUE_PARENT >=", value, "pkValueParent");
            return (Criteria) this;
        }

        public Criteria andPkValueParentLessThan(String value) {
            addCriterion("PK_VALUE_PARENT <", value, "pkValueParent");
            return (Criteria) this;
        }

        public Criteria andPkValueParentLessThanOrEqualTo(String value) {
            addCriterion("PK_VALUE_PARENT <=", value, "pkValueParent");
            return (Criteria) this;
        }

        public Criteria andPkValueParentLike(String value) {
            addCriterion("PK_VALUE_PARENT like", value, "pkValueParent");
            return (Criteria) this;
        }

        public Criteria andPkValueParentNotLike(String value) {
            addCriterion("PK_VALUE_PARENT not like", value, "pkValueParent");
            return (Criteria) this;
        }

        public Criteria andPkValueParentIn(List<String> values) {
            addCriterion("PK_VALUE_PARENT in", values, "pkValueParent");
            return (Criteria) this;
        }

        public Criteria andPkValueParentNotIn(List<String> values) {
            addCriterion("PK_VALUE_PARENT not in", values, "pkValueParent");
            return (Criteria) this;
        }

        public Criteria andPkValueParentBetween(String value1, String value2) {
            addCriterion("PK_VALUE_PARENT between", value1, value2, "pkValueParent");
            return (Criteria) this;
        }

        public Criteria andPkValueParentNotBetween(String value1, String value2) {
            addCriterion("PK_VALUE_PARENT not between", value1, value2, "pkValueParent");
            return (Criteria) this;
        }

        public Criteria andSeriescodeIsNull() {
            addCriterion("SERIESCODE is null");
            return (Criteria) this;
        }

        public Criteria andSeriescodeIsNotNull() {
            addCriterion("SERIESCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSeriescodeEqualTo(String value) {
            addCriterion("SERIESCODE =", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeNotEqualTo(String value) {
            addCriterion("SERIESCODE <>", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeGreaterThan(String value) {
            addCriterion("SERIESCODE >", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeGreaterThanOrEqualTo(String value) {
            addCriterion("SERIESCODE >=", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeLessThan(String value) {
            addCriterion("SERIESCODE <", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeLessThanOrEqualTo(String value) {
            addCriterion("SERIESCODE <=", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeLike(String value) {
            addCriterion("SERIESCODE like", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeNotLike(String value) {
            addCriterion("SERIESCODE not like", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeIn(List<String> values) {
            addCriterion("SERIESCODE in", values, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeNotIn(List<String> values) {
            addCriterion("SERIESCODE not in", values, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeBetween(String value1, String value2) {
            addCriterion("SERIESCODE between", value1, value2, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeNotBetween(String value1, String value2) {
            addCriterion("SERIESCODE not between", value1, value2, "seriescode");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxIsNull() {
            addCriterion("DISPLAY_IDX is null");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxIsNotNull() {
            addCriterion("DISPLAY_IDX is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxEqualTo(Integer value) {
            addCriterion("DISPLAY_IDX =", value, "displayIdx");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxNotEqualTo(Integer value) {
            addCriterion("DISPLAY_IDX <>", value, "displayIdx");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxGreaterThan(Integer value) {
            addCriterion("DISPLAY_IDX >", value, "displayIdx");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("DISPLAY_IDX >=", value, "displayIdx");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxLessThan(Integer value) {
            addCriterion("DISPLAY_IDX <", value, "displayIdx");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxLessThanOrEqualTo(Integer value) {
            addCriterion("DISPLAY_IDX <=", value, "displayIdx");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxIn(List<Integer> values) {
            addCriterion("DISPLAY_IDX in", values, "displayIdx");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxNotIn(List<Integer> values) {
            addCriterion("DISPLAY_IDX not in", values, "displayIdx");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxBetween(Integer value1, Integer value2) {
            addCriterion("DISPLAY_IDX between", value1, value2, "displayIdx");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("DISPLAY_IDX not between", value1, value2, "displayIdx");
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