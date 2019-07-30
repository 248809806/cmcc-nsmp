package com.ultrapower.pojo;

import java.util.ArrayList;
import java.util.List;

public class AmAssetProcCollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmAssetProcCollectExample() {
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

        public Criteria andPkAssetProcCollectIsNull() {
            addCriterion("PK_ASSET_PROC_COLLECT is null");
            return (Criteria) this;
        }

        public Criteria andPkAssetProcCollectIsNotNull() {
            addCriterion("PK_ASSET_PROC_COLLECT is not null");
            return (Criteria) this;
        }

        public Criteria andPkAssetProcCollectEqualTo(String value) {
            addCriterion("PK_ASSET_PROC_COLLECT =", value, "pkAssetProcCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetProcCollectNotEqualTo(String value) {
            addCriterion("PK_ASSET_PROC_COLLECT <>", value, "pkAssetProcCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetProcCollectGreaterThan(String value) {
            addCriterion("PK_ASSET_PROC_COLLECT >", value, "pkAssetProcCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetProcCollectGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ASSET_PROC_COLLECT >=", value, "pkAssetProcCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetProcCollectLessThan(String value) {
            addCriterion("PK_ASSET_PROC_COLLECT <", value, "pkAssetProcCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetProcCollectLessThanOrEqualTo(String value) {
            addCriterion("PK_ASSET_PROC_COLLECT <=", value, "pkAssetProcCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetProcCollectLike(String value) {
            addCriterion("PK_ASSET_PROC_COLLECT like", value, "pkAssetProcCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetProcCollectNotLike(String value) {
            addCriterion("PK_ASSET_PROC_COLLECT not like", value, "pkAssetProcCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetProcCollectIn(List<String> values) {
            addCriterion("PK_ASSET_PROC_COLLECT in", values, "pkAssetProcCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetProcCollectNotIn(List<String> values) {
            addCriterion("PK_ASSET_PROC_COLLECT not in", values, "pkAssetProcCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetProcCollectBetween(String value1, String value2) {
            addCriterion("PK_ASSET_PROC_COLLECT between", value1, value2, "pkAssetProcCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetProcCollectNotBetween(String value1, String value2) {
            addCriterion("PK_ASSET_PROC_COLLECT not between", value1, value2, "pkAssetProcCollect");
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

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
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

        public Criteria andPpidIsNull() {
            addCriterion("PPID is null");
            return (Criteria) this;
        }

        public Criteria andPpidIsNotNull() {
            addCriterion("PPID is not null");
            return (Criteria) this;
        }

        public Criteria andPpidEqualTo(String value) {
            addCriterion("PPID =", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidNotEqualTo(String value) {
            addCriterion("PPID <>", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidGreaterThan(String value) {
            addCriterion("PPID >", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidGreaterThanOrEqualTo(String value) {
            addCriterion("PPID >=", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidLessThan(String value) {
            addCriterion("PPID <", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidLessThanOrEqualTo(String value) {
            addCriterion("PPID <=", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidLike(String value) {
            addCriterion("PPID like", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidNotLike(String value) {
            addCriterion("PPID not like", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidIn(List<String> values) {
            addCriterion("PPID in", values, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidNotIn(List<String> values) {
            addCriterion("PPID not in", values, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidBetween(String value1, String value2) {
            addCriterion("PPID between", value1, value2, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidNotBetween(String value1, String value2) {
            addCriterion("PPID not between", value1, value2, "ppid");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("START_TIME like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("START_TIME not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeIsNull() {
            addCriterion("RUN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRunTimeIsNotNull() {
            addCriterion("RUN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRunTimeEqualTo(String value) {
            addCriterion("RUN_TIME =", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotEqualTo(String value) {
            addCriterion("RUN_TIME <>", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeGreaterThan(String value) {
            addCriterion("RUN_TIME >", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeGreaterThanOrEqualTo(String value) {
            addCriterion("RUN_TIME >=", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeLessThan(String value) {
            addCriterion("RUN_TIME <", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeLessThanOrEqualTo(String value) {
            addCriterion("RUN_TIME <=", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeLike(String value) {
            addCriterion("RUN_TIME like", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotLike(String value) {
            addCriterion("RUN_TIME not like", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeIn(List<String> values) {
            addCriterion("RUN_TIME in", values, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotIn(List<String> values) {
            addCriterion("RUN_TIME not in", values, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeBetween(String value1, String value2) {
            addCriterion("RUN_TIME between", value1, value2, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotBetween(String value1, String value2) {
            addCriterion("RUN_TIME not between", value1, value2, "runTime");
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

        public Criteria andWorkPathIsNull() {
            addCriterion("WORK_PATH is null");
            return (Criteria) this;
        }

        public Criteria andWorkPathIsNotNull() {
            addCriterion("WORK_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPathEqualTo(String value) {
            addCriterion("WORK_PATH =", value, "workPath");
            return (Criteria) this;
        }

        public Criteria andWorkPathNotEqualTo(String value) {
            addCriterion("WORK_PATH <>", value, "workPath");
            return (Criteria) this;
        }

        public Criteria andWorkPathGreaterThan(String value) {
            addCriterion("WORK_PATH >", value, "workPath");
            return (Criteria) this;
        }

        public Criteria andWorkPathGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_PATH >=", value, "workPath");
            return (Criteria) this;
        }

        public Criteria andWorkPathLessThan(String value) {
            addCriterion("WORK_PATH <", value, "workPath");
            return (Criteria) this;
        }

        public Criteria andWorkPathLessThanOrEqualTo(String value) {
            addCriterion("WORK_PATH <=", value, "workPath");
            return (Criteria) this;
        }

        public Criteria andWorkPathLike(String value) {
            addCriterion("WORK_PATH like", value, "workPath");
            return (Criteria) this;
        }

        public Criteria andWorkPathNotLike(String value) {
            addCriterion("WORK_PATH not like", value, "workPath");
            return (Criteria) this;
        }

        public Criteria andWorkPathIn(List<String> values) {
            addCriterion("WORK_PATH in", values, "workPath");
            return (Criteria) this;
        }

        public Criteria andWorkPathNotIn(List<String> values) {
            addCriterion("WORK_PATH not in", values, "workPath");
            return (Criteria) this;
        }

        public Criteria andWorkPathBetween(String value1, String value2) {
            addCriterion("WORK_PATH between", value1, value2, "workPath");
            return (Criteria) this;
        }

        public Criteria andWorkPathNotBetween(String value1, String value2) {
            addCriterion("WORK_PATH not between", value1, value2, "workPath");
            return (Criteria) this;
        }

        public Criteria andStartCmdIsNull() {
            addCriterion("START_CMD is null");
            return (Criteria) this;
        }

        public Criteria andStartCmdIsNotNull() {
            addCriterion("START_CMD is not null");
            return (Criteria) this;
        }

        public Criteria andStartCmdEqualTo(String value) {
            addCriterion("START_CMD =", value, "startCmd");
            return (Criteria) this;
        }

        public Criteria andStartCmdNotEqualTo(String value) {
            addCriterion("START_CMD <>", value, "startCmd");
            return (Criteria) this;
        }

        public Criteria andStartCmdGreaterThan(String value) {
            addCriterion("START_CMD >", value, "startCmd");
            return (Criteria) this;
        }

        public Criteria andStartCmdGreaterThanOrEqualTo(String value) {
            addCriterion("START_CMD >=", value, "startCmd");
            return (Criteria) this;
        }

        public Criteria andStartCmdLessThan(String value) {
            addCriterion("START_CMD <", value, "startCmd");
            return (Criteria) this;
        }

        public Criteria andStartCmdLessThanOrEqualTo(String value) {
            addCriterion("START_CMD <=", value, "startCmd");
            return (Criteria) this;
        }

        public Criteria andStartCmdLike(String value) {
            addCriterion("START_CMD like", value, "startCmd");
            return (Criteria) this;
        }

        public Criteria andStartCmdNotLike(String value) {
            addCriterion("START_CMD not like", value, "startCmd");
            return (Criteria) this;
        }

        public Criteria andStartCmdIn(List<String> values) {
            addCriterion("START_CMD in", values, "startCmd");
            return (Criteria) this;
        }

        public Criteria andStartCmdNotIn(List<String> values) {
            addCriterion("START_CMD not in", values, "startCmd");
            return (Criteria) this;
        }

        public Criteria andStartCmdBetween(String value1, String value2) {
            addCriterion("START_CMD between", value1, value2, "startCmd");
            return (Criteria) this;
        }

        public Criteria andStartCmdNotBetween(String value1, String value2) {
            addCriterion("START_CMD not between", value1, value2, "startCmd");
            return (Criteria) this;
        }

        public Criteria andProcDescIsNull() {
            addCriterion("PROC_DESC is null");
            return (Criteria) this;
        }

        public Criteria andProcDescIsNotNull() {
            addCriterion("PROC_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andProcDescEqualTo(String value) {
            addCriterion("PROC_DESC =", value, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescNotEqualTo(String value) {
            addCriterion("PROC_DESC <>", value, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescGreaterThan(String value) {
            addCriterion("PROC_DESC >", value, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescGreaterThanOrEqualTo(String value) {
            addCriterion("PROC_DESC >=", value, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescLessThan(String value) {
            addCriterion("PROC_DESC <", value, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescLessThanOrEqualTo(String value) {
            addCriterion("PROC_DESC <=", value, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescLike(String value) {
            addCriterion("PROC_DESC like", value, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescNotLike(String value) {
            addCriterion("PROC_DESC not like", value, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescIn(List<String> values) {
            addCriterion("PROC_DESC in", values, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescNotIn(List<String> values) {
            addCriterion("PROC_DESC not in", values, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescBetween(String value1, String value2) {
            addCriterion("PROC_DESC between", value1, value2, "procDesc");
            return (Criteria) this;
        }

        public Criteria andProcDescNotBetween(String value1, String value2) {
            addCriterion("PROC_DESC not between", value1, value2, "procDesc");
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