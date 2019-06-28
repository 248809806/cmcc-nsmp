package com.ultrapower.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmUserBsGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmUserBsGroupExample() {
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

        public Criteria andPkNsmpUserIsNull() {
            addCriterion("PK_NSMP_USER is null");
            return (Criteria) this;
        }

        public Criteria andPkNsmpUserIsNotNull() {
            addCriterion("PK_NSMP_USER is not null");
            return (Criteria) this;
        }

        public Criteria andPkNsmpUserEqualTo(String value) {
            addCriterion("PK_NSMP_USER =", value, "pkNsmpUser");
            return (Criteria) this;
        }

        public Criteria andPkNsmpUserNotEqualTo(String value) {
            addCriterion("PK_NSMP_USER <>", value, "pkNsmpUser");
            return (Criteria) this;
        }

        public Criteria andPkNsmpUserGreaterThan(String value) {
            addCriterion("PK_NSMP_USER >", value, "pkNsmpUser");
            return (Criteria) this;
        }

        public Criteria andPkNsmpUserGreaterThanOrEqualTo(String value) {
            addCriterion("PK_NSMP_USER >=", value, "pkNsmpUser");
            return (Criteria) this;
        }

        public Criteria andPkNsmpUserLessThan(String value) {
            addCriterion("PK_NSMP_USER <", value, "pkNsmpUser");
            return (Criteria) this;
        }

        public Criteria andPkNsmpUserLessThanOrEqualTo(String value) {
            addCriterion("PK_NSMP_USER <=", value, "pkNsmpUser");
            return (Criteria) this;
        }

        public Criteria andPkNsmpUserLike(String value) {
            addCriterion("PK_NSMP_USER like", value, "pkNsmpUser");
            return (Criteria) this;
        }

        public Criteria andPkNsmpUserNotLike(String value) {
            addCriterion("PK_NSMP_USER not like", value, "pkNsmpUser");
            return (Criteria) this;
        }

        public Criteria andPkNsmpUserIn(List<String> values) {
            addCriterion("PK_NSMP_USER in", values, "pkNsmpUser");
            return (Criteria) this;
        }

        public Criteria andPkNsmpUserNotIn(List<String> values) {
            addCriterion("PK_NSMP_USER not in", values, "pkNsmpUser");
            return (Criteria) this;
        }

        public Criteria andPkNsmpUserBetween(String value1, String value2) {
            addCriterion("PK_NSMP_USER between", value1, value2, "pkNsmpUser");
            return (Criteria) this;
        }

        public Criteria andPkNsmpUserNotBetween(String value1, String value2) {
            addCriterion("PK_NSMP_USER not between", value1, value2, "pkNsmpUser");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupIsNull() {
            addCriterion("PK_BS_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupIsNotNull() {
            addCriterion("PK_BS_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupEqualTo(String value) {
            addCriterion("PK_BS_GROUP =", value, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupNotEqualTo(String value) {
            addCriterion("PK_BS_GROUP <>", value, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupGreaterThan(String value) {
            addCriterion("PK_BS_GROUP >", value, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupGreaterThanOrEqualTo(String value) {
            addCriterion("PK_BS_GROUP >=", value, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupLessThan(String value) {
            addCriterion("PK_BS_GROUP <", value, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupLessThanOrEqualTo(String value) {
            addCriterion("PK_BS_GROUP <=", value, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupLike(String value) {
            addCriterion("PK_BS_GROUP like", value, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupNotLike(String value) {
            addCriterion("PK_BS_GROUP not like", value, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupIn(List<String> values) {
            addCriterion("PK_BS_GROUP in", values, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupNotIn(List<String> values) {
            addCriterion("PK_BS_GROUP not in", values, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupBetween(String value1, String value2) {
            addCriterion("PK_BS_GROUP between", value1, value2, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupNotBetween(String value1, String value2) {
            addCriterion("PK_BS_GROUP not between", value1, value2, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkCreatorIsNull() {
            addCriterion("PK_CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andPkCreatorIsNotNull() {
            addCriterion("PK_CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPkCreatorEqualTo(String value) {
            addCriterion("PK_CREATOR =", value, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorNotEqualTo(String value) {
            addCriterion("PK_CREATOR <>", value, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorGreaterThan(String value) {
            addCriterion("PK_CREATOR >", value, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("PK_CREATOR >=", value, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorLessThan(String value) {
            addCriterion("PK_CREATOR <", value, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorLessThanOrEqualTo(String value) {
            addCriterion("PK_CREATOR <=", value, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorLike(String value) {
            addCriterion("PK_CREATOR like", value, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorNotLike(String value) {
            addCriterion("PK_CREATOR not like", value, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorIn(List<String> values) {
            addCriterion("PK_CREATOR in", values, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorNotIn(List<String> values) {
            addCriterion("PK_CREATOR not in", values, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorBetween(String value1, String value2) {
            addCriterion("PK_CREATOR between", value1, value2, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorNotBetween(String value1, String value2) {
            addCriterion("PK_CREATOR not between", value1, value2, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
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