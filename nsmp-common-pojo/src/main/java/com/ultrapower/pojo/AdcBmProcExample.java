package com.ultrapower.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdcBmProcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdcBmProcExample() {
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

        public Criteria andPkBmProcIsNull() {
            addCriterion("PK_BM_PROC is null");
            return (Criteria) this;
        }

        public Criteria andPkBmProcIsNotNull() {
            addCriterion("PK_BM_PROC is not null");
            return (Criteria) this;
        }

        public Criteria andPkBmProcEqualTo(String value) {
            addCriterion("PK_BM_PROC =", value, "pkBmProc");
            return (Criteria) this;
        }

        public Criteria andPkBmProcNotEqualTo(String value) {
            addCriterion("PK_BM_PROC <>", value, "pkBmProc");
            return (Criteria) this;
        }

        public Criteria andPkBmProcGreaterThan(String value) {
            addCriterion("PK_BM_PROC >", value, "pkBmProc");
            return (Criteria) this;
        }

        public Criteria andPkBmProcGreaterThanOrEqualTo(String value) {
            addCriterion("PK_BM_PROC >=", value, "pkBmProc");
            return (Criteria) this;
        }

        public Criteria andPkBmProcLessThan(String value) {
            addCriterion("PK_BM_PROC <", value, "pkBmProc");
            return (Criteria) this;
        }

        public Criteria andPkBmProcLessThanOrEqualTo(String value) {
            addCriterion("PK_BM_PROC <=", value, "pkBmProc");
            return (Criteria) this;
        }

        public Criteria andPkBmProcLike(String value) {
            addCriterion("PK_BM_PROC like", value, "pkBmProc");
            return (Criteria) this;
        }

        public Criteria andPkBmProcNotLike(String value) {
            addCriterion("PK_BM_PROC not like", value, "pkBmProc");
            return (Criteria) this;
        }

        public Criteria andPkBmProcIn(List<String> values) {
            addCriterion("PK_BM_PROC in", values, "pkBmProc");
            return (Criteria) this;
        }

        public Criteria andPkBmProcNotIn(List<String> values) {
            addCriterion("PK_BM_PROC not in", values, "pkBmProc");
            return (Criteria) this;
        }

        public Criteria andPkBmProcBetween(String value1, String value2) {
            addCriterion("PK_BM_PROC between", value1, value2, "pkBmProc");
            return (Criteria) this;
        }

        public Criteria andPkBmProcNotBetween(String value1, String value2) {
            addCriterion("PK_BM_PROC not between", value1, value2, "pkBmProc");
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

        public Criteria andProcTypeIsNull() {
            addCriterion("PROC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProcTypeIsNotNull() {
            addCriterion("PROC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProcTypeEqualTo(Integer value) {
            addCriterion("PROC_TYPE =", value, "procType");
            return (Criteria) this;
        }

        public Criteria andProcTypeNotEqualTo(Integer value) {
            addCriterion("PROC_TYPE <>", value, "procType");
            return (Criteria) this;
        }

        public Criteria andProcTypeGreaterThan(Integer value) {
            addCriterion("PROC_TYPE >", value, "procType");
            return (Criteria) this;
        }

        public Criteria andProcTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROC_TYPE >=", value, "procType");
            return (Criteria) this;
        }

        public Criteria andProcTypeLessThan(Integer value) {
            addCriterion("PROC_TYPE <", value, "procType");
            return (Criteria) this;
        }

        public Criteria andProcTypeLessThanOrEqualTo(Integer value) {
            addCriterion("PROC_TYPE <=", value, "procType");
            return (Criteria) this;
        }

        public Criteria andProcTypeIn(List<Integer> values) {
            addCriterion("PROC_TYPE in", values, "procType");
            return (Criteria) this;
        }

        public Criteria andProcTypeNotIn(List<Integer> values) {
            addCriterion("PROC_TYPE not in", values, "procType");
            return (Criteria) this;
        }

        public Criteria andProcTypeBetween(Integer value1, Integer value2) {
            addCriterion("PROC_TYPE between", value1, value2, "procType");
            return (Criteria) this;
        }

        public Criteria andProcTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PROC_TYPE not between", value1, value2, "procType");
            return (Criteria) this;
        }

        public Criteria andProcNameIsNull() {
            addCriterion("PROC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProcNameIsNotNull() {
            addCriterion("PROC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProcNameEqualTo(String value) {
            addCriterion("PROC_NAME =", value, "procName");
            return (Criteria) this;
        }

        public Criteria andProcNameNotEqualTo(String value) {
            addCriterion("PROC_NAME <>", value, "procName");
            return (Criteria) this;
        }

        public Criteria andProcNameGreaterThan(String value) {
            addCriterion("PROC_NAME >", value, "procName");
            return (Criteria) this;
        }

        public Criteria andProcNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROC_NAME >=", value, "procName");
            return (Criteria) this;
        }

        public Criteria andProcNameLessThan(String value) {
            addCriterion("PROC_NAME <", value, "procName");
            return (Criteria) this;
        }

        public Criteria andProcNameLessThanOrEqualTo(String value) {
            addCriterion("PROC_NAME <=", value, "procName");
            return (Criteria) this;
        }

        public Criteria andProcNameLike(String value) {
            addCriterion("PROC_NAME like", value, "procName");
            return (Criteria) this;
        }

        public Criteria andProcNameNotLike(String value) {
            addCriterion("PROC_NAME not like", value, "procName");
            return (Criteria) this;
        }

        public Criteria andProcNameIn(List<String> values) {
            addCriterion("PROC_NAME in", values, "procName");
            return (Criteria) this;
        }

        public Criteria andProcNameNotIn(List<String> values) {
            addCriterion("PROC_NAME not in", values, "procName");
            return (Criteria) this;
        }

        public Criteria andProcNameBetween(String value1, String value2) {
            addCriterion("PROC_NAME between", value1, value2, "procName");
            return (Criteria) this;
        }

        public Criteria andProcNameNotBetween(String value1, String value2) {
            addCriterion("PROC_NAME not between", value1, value2, "procName");
            return (Criteria) this;
        }

        public Criteria andSeverityLevelIsNull() {
            addCriterion("SEVERITY_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andSeverityLevelIsNotNull() {
            addCriterion("SEVERITY_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andSeverityLevelEqualTo(Integer value) {
            addCriterion("SEVERITY_LEVEL =", value, "severityLevel");
            return (Criteria) this;
        }

        public Criteria andSeverityLevelNotEqualTo(Integer value) {
            addCriterion("SEVERITY_LEVEL <>", value, "severityLevel");
            return (Criteria) this;
        }

        public Criteria andSeverityLevelGreaterThan(Integer value) {
            addCriterion("SEVERITY_LEVEL >", value, "severityLevel");
            return (Criteria) this;
        }

        public Criteria andSeverityLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEVERITY_LEVEL >=", value, "severityLevel");
            return (Criteria) this;
        }

        public Criteria andSeverityLevelLessThan(Integer value) {
            addCriterion("SEVERITY_LEVEL <", value, "severityLevel");
            return (Criteria) this;
        }

        public Criteria andSeverityLevelLessThanOrEqualTo(Integer value) {
            addCriterion("SEVERITY_LEVEL <=", value, "severityLevel");
            return (Criteria) this;
        }

        public Criteria andSeverityLevelIn(List<Integer> values) {
            addCriterion("SEVERITY_LEVEL in", values, "severityLevel");
            return (Criteria) this;
        }

        public Criteria andSeverityLevelNotIn(List<Integer> values) {
            addCriterion("SEVERITY_LEVEL not in", values, "severityLevel");
            return (Criteria) this;
        }

        public Criteria andSeverityLevelBetween(Integer value1, Integer value2) {
            addCriterion("SEVERITY_LEVEL between", value1, value2, "severityLevel");
            return (Criteria) this;
        }

        public Criteria andSeverityLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("SEVERITY_LEVEL not between", value1, value2, "severityLevel");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("IS_DELETED is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("IS_DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Integer value) {
            addCriterion("IS_DELETED =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Integer value) {
            addCriterion("IS_DELETED <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Integer value) {
            addCriterion("IS_DELETED >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_DELETED >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Integer value) {
            addCriterion("IS_DELETED <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("IS_DELETED <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Integer> values) {
            addCriterion("IS_DELETED in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Integer> values) {
            addCriterion("IS_DELETED not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Integer value1, Integer value2) {
            addCriterion("IS_DELETED between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_DELETED not between", value1, value2, "isDeleted");
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

        public Criteria andPkMenderIsNull() {
            addCriterion("PK_MENDER is null");
            return (Criteria) this;
        }

        public Criteria andPkMenderIsNotNull() {
            addCriterion("PK_MENDER is not null");
            return (Criteria) this;
        }

        public Criteria andPkMenderEqualTo(String value) {
            addCriterion("PK_MENDER =", value, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderNotEqualTo(String value) {
            addCriterion("PK_MENDER <>", value, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderGreaterThan(String value) {
            addCriterion("PK_MENDER >", value, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderGreaterThanOrEqualTo(String value) {
            addCriterion("PK_MENDER >=", value, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderLessThan(String value) {
            addCriterion("PK_MENDER <", value, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderLessThanOrEqualTo(String value) {
            addCriterion("PK_MENDER <=", value, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderLike(String value) {
            addCriterion("PK_MENDER like", value, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderNotLike(String value) {
            addCriterion("PK_MENDER not like", value, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderIn(List<String> values) {
            addCriterion("PK_MENDER in", values, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderNotIn(List<String> values) {
            addCriterion("PK_MENDER not in", values, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderBetween(String value1, String value2) {
            addCriterion("PK_MENDER between", value1, value2, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderNotBetween(String value1, String value2) {
            addCriterion("PK_MENDER not between", value1, value2, "pkMender");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastIsNull() {
            addCriterion("MEND_TIME_LAST is null");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastIsNotNull() {
            addCriterion("MEND_TIME_LAST is not null");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastEqualTo(Date value) {
            addCriterion("MEND_TIME_LAST =", value, "mendTimeLast");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastNotEqualTo(Date value) {
            addCriterion("MEND_TIME_LAST <>", value, "mendTimeLast");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastGreaterThan(Date value) {
            addCriterion("MEND_TIME_LAST >", value, "mendTimeLast");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastGreaterThanOrEqualTo(Date value) {
            addCriterion("MEND_TIME_LAST >=", value, "mendTimeLast");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastLessThan(Date value) {
            addCriterion("MEND_TIME_LAST <", value, "mendTimeLast");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastLessThanOrEqualTo(Date value) {
            addCriterion("MEND_TIME_LAST <=", value, "mendTimeLast");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastIn(List<Date> values) {
            addCriterion("MEND_TIME_LAST in", values, "mendTimeLast");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastNotIn(List<Date> values) {
            addCriterion("MEND_TIME_LAST not in", values, "mendTimeLast");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastBetween(Date value1, Date value2) {
            addCriterion("MEND_TIME_LAST between", value1, value2, "mendTimeLast");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastNotBetween(Date value1, Date value2) {
            addCriterion("MEND_TIME_LAST not between", value1, value2, "mendTimeLast");
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