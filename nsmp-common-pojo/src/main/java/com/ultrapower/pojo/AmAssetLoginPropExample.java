package com.ultrapower.pojo;

import java.util.ArrayList;
import java.util.List;

public class AmAssetLoginPropExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmAssetLoginPropExample() {
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

        public Criteria andDriverPortIsNull() {
            addCriterion("DRIVER_PORT is null");
            return (Criteria) this;
        }

        public Criteria andDriverPortIsNotNull() {
            addCriterion("DRIVER_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andDriverPortEqualTo(Integer value) {
            addCriterion("DRIVER_PORT =", value, "driverPort");
            return (Criteria) this;
        }

        public Criteria andDriverPortNotEqualTo(Integer value) {
            addCriterion("DRIVER_PORT <>", value, "driverPort");
            return (Criteria) this;
        }

        public Criteria andDriverPortGreaterThan(Integer value) {
            addCriterion("DRIVER_PORT >", value, "driverPort");
            return (Criteria) this;
        }

        public Criteria andDriverPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("DRIVER_PORT >=", value, "driverPort");
            return (Criteria) this;
        }

        public Criteria andDriverPortLessThan(Integer value) {
            addCriterion("DRIVER_PORT <", value, "driverPort");
            return (Criteria) this;
        }

        public Criteria andDriverPortLessThanOrEqualTo(Integer value) {
            addCriterion("DRIVER_PORT <=", value, "driverPort");
            return (Criteria) this;
        }

        public Criteria andDriverPortIn(List<Integer> values) {
            addCriterion("DRIVER_PORT in", values, "driverPort");
            return (Criteria) this;
        }

        public Criteria andDriverPortNotIn(List<Integer> values) {
            addCriterion("DRIVER_PORT not in", values, "driverPort");
            return (Criteria) this;
        }

        public Criteria andDriverPortBetween(Integer value1, Integer value2) {
            addCriterion("DRIVER_PORT between", value1, value2, "driverPort");
            return (Criteria) this;
        }

        public Criteria andDriverPortNotBetween(Integer value1, Integer value2) {
            addCriterion("DRIVER_PORT not between", value1, value2, "driverPort");
            return (Criteria) this;
        }

        public Criteria andAdminUserIsNull() {
            addCriterion("ADMIN_USER is null");
            return (Criteria) this;
        }

        public Criteria andAdminUserIsNotNull() {
            addCriterion("ADMIN_USER is not null");
            return (Criteria) this;
        }

        public Criteria andAdminUserEqualTo(String value) {
            addCriterion("ADMIN_USER =", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserNotEqualTo(String value) {
            addCriterion("ADMIN_USER <>", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserGreaterThan(String value) {
            addCriterion("ADMIN_USER >", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserGreaterThanOrEqualTo(String value) {
            addCriterion("ADMIN_USER >=", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserLessThan(String value) {
            addCriterion("ADMIN_USER <", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserLessThanOrEqualTo(String value) {
            addCriterion("ADMIN_USER <=", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserLike(String value) {
            addCriterion("ADMIN_USER like", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserNotLike(String value) {
            addCriterion("ADMIN_USER not like", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserIn(List<String> values) {
            addCriterion("ADMIN_USER in", values, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserNotIn(List<String> values) {
            addCriterion("ADMIN_USER not in", values, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserBetween(String value1, String value2) {
            addCriterion("ADMIN_USER between", value1, value2, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserNotBetween(String value1, String value2) {
            addCriterion("ADMIN_USER not between", value1, value2, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNull() {
            addCriterion("ADMIN_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNotNull() {
            addCriterion("ADMIN_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordEqualTo(String value) {
            addCriterion("ADMIN_PASSWORD =", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotEqualTo(String value) {
            addCriterion("ADMIN_PASSWORD <>", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThan(String value) {
            addCriterion("ADMIN_PASSWORD >", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ADMIN_PASSWORD >=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThan(String value) {
            addCriterion("ADMIN_PASSWORD <", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("ADMIN_PASSWORD <=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLike(String value) {
            addCriterion("ADMIN_PASSWORD like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotLike(String value) {
            addCriterion("ADMIN_PASSWORD not like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIn(List<String> values) {
            addCriterion("ADMIN_PASSWORD in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotIn(List<String> values) {
            addCriterion("ADMIN_PASSWORD not in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordBetween(String value1, String value2) {
            addCriterion("ADMIN_PASSWORD between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("ADMIN_PASSWORD not between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPromptIsNull() {
            addCriterion("ADMIN_PROMPT is null");
            return (Criteria) this;
        }

        public Criteria andAdminPromptIsNotNull() {
            addCriterion("ADMIN_PROMPT is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPromptEqualTo(String value) {
            addCriterion("ADMIN_PROMPT =", value, "adminPrompt");
            return (Criteria) this;
        }

        public Criteria andAdminPromptNotEqualTo(String value) {
            addCriterion("ADMIN_PROMPT <>", value, "adminPrompt");
            return (Criteria) this;
        }

        public Criteria andAdminPromptGreaterThan(String value) {
            addCriterion("ADMIN_PROMPT >", value, "adminPrompt");
            return (Criteria) this;
        }

        public Criteria andAdminPromptGreaterThanOrEqualTo(String value) {
            addCriterion("ADMIN_PROMPT >=", value, "adminPrompt");
            return (Criteria) this;
        }

        public Criteria andAdminPromptLessThan(String value) {
            addCriterion("ADMIN_PROMPT <", value, "adminPrompt");
            return (Criteria) this;
        }

        public Criteria andAdminPromptLessThanOrEqualTo(String value) {
            addCriterion("ADMIN_PROMPT <=", value, "adminPrompt");
            return (Criteria) this;
        }

        public Criteria andAdminPromptLike(String value) {
            addCriterion("ADMIN_PROMPT like", value, "adminPrompt");
            return (Criteria) this;
        }

        public Criteria andAdminPromptNotLike(String value) {
            addCriterion("ADMIN_PROMPT not like", value, "adminPrompt");
            return (Criteria) this;
        }

        public Criteria andAdminPromptIn(List<String> values) {
            addCriterion("ADMIN_PROMPT in", values, "adminPrompt");
            return (Criteria) this;
        }

        public Criteria andAdminPromptNotIn(List<String> values) {
            addCriterion("ADMIN_PROMPT not in", values, "adminPrompt");
            return (Criteria) this;
        }

        public Criteria andAdminPromptBetween(String value1, String value2) {
            addCriterion("ADMIN_PROMPT between", value1, value2, "adminPrompt");
            return (Criteria) this;
        }

        public Criteria andAdminPromptNotBetween(String value1, String value2) {
            addCriterion("ADMIN_PROMPT not between", value1, value2, "adminPrompt");
            return (Criteria) this;
        }

        public Criteria andCharEncodeIsNull() {
            addCriterion("CHAR_ENCODE is null");
            return (Criteria) this;
        }

        public Criteria andCharEncodeIsNotNull() {
            addCriterion("CHAR_ENCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCharEncodeEqualTo(String value) {
            addCriterion("CHAR_ENCODE =", value, "charEncode");
            return (Criteria) this;
        }

        public Criteria andCharEncodeNotEqualTo(String value) {
            addCriterion("CHAR_ENCODE <>", value, "charEncode");
            return (Criteria) this;
        }

        public Criteria andCharEncodeGreaterThan(String value) {
            addCriterion("CHAR_ENCODE >", value, "charEncode");
            return (Criteria) this;
        }

        public Criteria andCharEncodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHAR_ENCODE >=", value, "charEncode");
            return (Criteria) this;
        }

        public Criteria andCharEncodeLessThan(String value) {
            addCriterion("CHAR_ENCODE <", value, "charEncode");
            return (Criteria) this;
        }

        public Criteria andCharEncodeLessThanOrEqualTo(String value) {
            addCriterion("CHAR_ENCODE <=", value, "charEncode");
            return (Criteria) this;
        }

        public Criteria andCharEncodeLike(String value) {
            addCriterion("CHAR_ENCODE like", value, "charEncode");
            return (Criteria) this;
        }

        public Criteria andCharEncodeNotLike(String value) {
            addCriterion("CHAR_ENCODE not like", value, "charEncode");
            return (Criteria) this;
        }

        public Criteria andCharEncodeIn(List<String> values) {
            addCriterion("CHAR_ENCODE in", values, "charEncode");
            return (Criteria) this;
        }

        public Criteria andCharEncodeNotIn(List<String> values) {
            addCriterion("CHAR_ENCODE not in", values, "charEncode");
            return (Criteria) this;
        }

        public Criteria andCharEncodeBetween(String value1, String value2) {
            addCriterion("CHAR_ENCODE between", value1, value2, "charEncode");
            return (Criteria) this;
        }

        public Criteria andCharEncodeNotBetween(String value1, String value2) {
            addCriterion("CHAR_ENCODE not between", value1, value2, "charEncode");
            return (Criteria) this;
        }

        public Criteria andEchoTimeIsNull() {
            addCriterion("ECHO_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEchoTimeIsNotNull() {
            addCriterion("ECHO_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEchoTimeEqualTo(Integer value) {
            addCriterion("ECHO_TIME =", value, "echoTime");
            return (Criteria) this;
        }

        public Criteria andEchoTimeNotEqualTo(Integer value) {
            addCriterion("ECHO_TIME <>", value, "echoTime");
            return (Criteria) this;
        }

        public Criteria andEchoTimeGreaterThan(Integer value) {
            addCriterion("ECHO_TIME >", value, "echoTime");
            return (Criteria) this;
        }

        public Criteria andEchoTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ECHO_TIME >=", value, "echoTime");
            return (Criteria) this;
        }

        public Criteria andEchoTimeLessThan(Integer value) {
            addCriterion("ECHO_TIME <", value, "echoTime");
            return (Criteria) this;
        }

        public Criteria andEchoTimeLessThanOrEqualTo(Integer value) {
            addCriterion("ECHO_TIME <=", value, "echoTime");
            return (Criteria) this;
        }

        public Criteria andEchoTimeIn(List<Integer> values) {
            addCriterion("ECHO_TIME in", values, "echoTime");
            return (Criteria) this;
        }

        public Criteria andEchoTimeNotIn(List<Integer> values) {
            addCriterion("ECHO_TIME not in", values, "echoTime");
            return (Criteria) this;
        }

        public Criteria andEchoTimeBetween(Integer value1, Integer value2) {
            addCriterion("ECHO_TIME between", value1, value2, "echoTime");
            return (Criteria) this;
        }

        public Criteria andEchoTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ECHO_TIME not between", value1, value2, "echoTime");
            return (Criteria) this;
        }

        public Criteria andTimeoutIsNull() {
            addCriterion("TIMEOUT is null");
            return (Criteria) this;
        }

        public Criteria andTimeoutIsNotNull() {
            addCriterion("TIMEOUT is not null");
            return (Criteria) this;
        }

        public Criteria andTimeoutEqualTo(Integer value) {
            addCriterion("TIMEOUT =", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutNotEqualTo(Integer value) {
            addCriterion("TIMEOUT <>", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutGreaterThan(Integer value) {
            addCriterion("TIMEOUT >", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIMEOUT >=", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutLessThan(Integer value) {
            addCriterion("TIMEOUT <", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutLessThanOrEqualTo(Integer value) {
            addCriterion("TIMEOUT <=", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutIn(List<Integer> values) {
            addCriterion("TIMEOUT in", values, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutNotIn(List<Integer> values) {
            addCriterion("TIMEOUT not in", values, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutBetween(Integer value1, Integer value2) {
            addCriterion("TIMEOUT between", value1, value2, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutNotBetween(Integer value1, Integer value2) {
            addCriterion("TIMEOUT not between", value1, value2, "timeout");
            return (Criteria) this;
        }

        public Criteria andTryTimesIsNull() {
            addCriterion("TRY_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andTryTimesIsNotNull() {
            addCriterion("TRY_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andTryTimesEqualTo(Integer value) {
            addCriterion("TRY_TIMES =", value, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesNotEqualTo(Integer value) {
            addCriterion("TRY_TIMES <>", value, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesGreaterThan(Integer value) {
            addCriterion("TRY_TIMES >", value, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRY_TIMES >=", value, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesLessThan(Integer value) {
            addCriterion("TRY_TIMES <", value, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesLessThanOrEqualTo(Integer value) {
            addCriterion("TRY_TIMES <=", value, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesIn(List<Integer> values) {
            addCriterion("TRY_TIMES in", values, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesNotIn(List<Integer> values) {
            addCriterion("TRY_TIMES not in", values, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesBetween(Integer value1, Integer value2) {
            addCriterion("TRY_TIMES between", value1, value2, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("TRY_TIMES not between", value1, value2, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andWindowsDriverIsNull() {
            addCriterion("WINDOWS_DRIVER is null");
            return (Criteria) this;
        }

        public Criteria andWindowsDriverIsNotNull() {
            addCriterion("WINDOWS_DRIVER is not null");
            return (Criteria) this;
        }

        public Criteria andWindowsDriverEqualTo(String value) {
            addCriterion("WINDOWS_DRIVER =", value, "windowsDriver");
            return (Criteria) this;
        }

        public Criteria andWindowsDriverNotEqualTo(String value) {
            addCriterion("WINDOWS_DRIVER <>", value, "windowsDriver");
            return (Criteria) this;
        }

        public Criteria andWindowsDriverGreaterThan(String value) {
            addCriterion("WINDOWS_DRIVER >", value, "windowsDriver");
            return (Criteria) this;
        }

        public Criteria andWindowsDriverGreaterThanOrEqualTo(String value) {
            addCriterion("WINDOWS_DRIVER >=", value, "windowsDriver");
            return (Criteria) this;
        }

        public Criteria andWindowsDriverLessThan(String value) {
            addCriterion("WINDOWS_DRIVER <", value, "windowsDriver");
            return (Criteria) this;
        }

        public Criteria andWindowsDriverLessThanOrEqualTo(String value) {
            addCriterion("WINDOWS_DRIVER <=", value, "windowsDriver");
            return (Criteria) this;
        }

        public Criteria andWindowsDriverLike(String value) {
            addCriterion("WINDOWS_DRIVER like", value, "windowsDriver");
            return (Criteria) this;
        }

        public Criteria andWindowsDriverNotLike(String value) {
            addCriterion("WINDOWS_DRIVER not like", value, "windowsDriver");
            return (Criteria) this;
        }

        public Criteria andWindowsDriverIn(List<String> values) {
            addCriterion("WINDOWS_DRIVER in", values, "windowsDriver");
            return (Criteria) this;
        }

        public Criteria andWindowsDriverNotIn(List<String> values) {
            addCriterion("WINDOWS_DRIVER not in", values, "windowsDriver");
            return (Criteria) this;
        }

        public Criteria andWindowsDriverBetween(String value1, String value2) {
            addCriterion("WINDOWS_DRIVER between", value1, value2, "windowsDriver");
            return (Criteria) this;
        }

        public Criteria andWindowsDriverNotBetween(String value1, String value2) {
            addCriterion("WINDOWS_DRIVER not between", value1, value2, "windowsDriver");
            return (Criteria) this;
        }

        public Criteria andWindowsDomainIsNull() {
            addCriterion("WINDOWS_DOMAIN is null");
            return (Criteria) this;
        }

        public Criteria andWindowsDomainIsNotNull() {
            addCriterion("WINDOWS_DOMAIN is not null");
            return (Criteria) this;
        }

        public Criteria andWindowsDomainEqualTo(String value) {
            addCriterion("WINDOWS_DOMAIN =", value, "windowsDomain");
            return (Criteria) this;
        }

        public Criteria andWindowsDomainNotEqualTo(String value) {
            addCriterion("WINDOWS_DOMAIN <>", value, "windowsDomain");
            return (Criteria) this;
        }

        public Criteria andWindowsDomainGreaterThan(String value) {
            addCriterion("WINDOWS_DOMAIN >", value, "windowsDomain");
            return (Criteria) this;
        }

        public Criteria andWindowsDomainGreaterThanOrEqualTo(String value) {
            addCriterion("WINDOWS_DOMAIN >=", value, "windowsDomain");
            return (Criteria) this;
        }

        public Criteria andWindowsDomainLessThan(String value) {
            addCriterion("WINDOWS_DOMAIN <", value, "windowsDomain");
            return (Criteria) this;
        }

        public Criteria andWindowsDomainLessThanOrEqualTo(String value) {
            addCriterion("WINDOWS_DOMAIN <=", value, "windowsDomain");
            return (Criteria) this;
        }

        public Criteria andWindowsDomainLike(String value) {
            addCriterion("WINDOWS_DOMAIN like", value, "windowsDomain");
            return (Criteria) this;
        }

        public Criteria andWindowsDomainNotLike(String value) {
            addCriterion("WINDOWS_DOMAIN not like", value, "windowsDomain");
            return (Criteria) this;
        }

        public Criteria andWindowsDomainIn(List<String> values) {
            addCriterion("WINDOWS_DOMAIN in", values, "windowsDomain");
            return (Criteria) this;
        }

        public Criteria andWindowsDomainNotIn(List<String> values) {
            addCriterion("WINDOWS_DOMAIN not in", values, "windowsDomain");
            return (Criteria) this;
        }

        public Criteria andWindowsDomainBetween(String value1, String value2) {
            addCriterion("WINDOWS_DOMAIN between", value1, value2, "windowsDomain");
            return (Criteria) this;
        }

        public Criteria andWindowsDomainNotBetween(String value1, String value2) {
            addCriterion("WINDOWS_DOMAIN not between", value1, value2, "windowsDomain");
            return (Criteria) this;
        }

        public Criteria andUnixDriverIsNull() {
            addCriterion("UNIX_DRIVER is null");
            return (Criteria) this;
        }

        public Criteria andUnixDriverIsNotNull() {
            addCriterion("UNIX_DRIVER is not null");
            return (Criteria) this;
        }

        public Criteria andUnixDriverEqualTo(String value) {
            addCriterion("UNIX_DRIVER =", value, "unixDriver");
            return (Criteria) this;
        }

        public Criteria andUnixDriverNotEqualTo(String value) {
            addCriterion("UNIX_DRIVER <>", value, "unixDriver");
            return (Criteria) this;
        }

        public Criteria andUnixDriverGreaterThan(String value) {
            addCriterion("UNIX_DRIVER >", value, "unixDriver");
            return (Criteria) this;
        }

        public Criteria andUnixDriverGreaterThanOrEqualTo(String value) {
            addCriterion("UNIX_DRIVER >=", value, "unixDriver");
            return (Criteria) this;
        }

        public Criteria andUnixDriverLessThan(String value) {
            addCriterion("UNIX_DRIVER <", value, "unixDriver");
            return (Criteria) this;
        }

        public Criteria andUnixDriverLessThanOrEqualTo(String value) {
            addCriterion("UNIX_DRIVER <=", value, "unixDriver");
            return (Criteria) this;
        }

        public Criteria andUnixDriverLike(String value) {
            addCriterion("UNIX_DRIVER like", value, "unixDriver");
            return (Criteria) this;
        }

        public Criteria andUnixDriverNotLike(String value) {
            addCriterion("UNIX_DRIVER not like", value, "unixDriver");
            return (Criteria) this;
        }

        public Criteria andUnixDriverIn(List<String> values) {
            addCriterion("UNIX_DRIVER in", values, "unixDriver");
            return (Criteria) this;
        }

        public Criteria andUnixDriverNotIn(List<String> values) {
            addCriterion("UNIX_DRIVER not in", values, "unixDriver");
            return (Criteria) this;
        }

        public Criteria andUnixDriverBetween(String value1, String value2) {
            addCriterion("UNIX_DRIVER between", value1, value2, "unixDriver");
            return (Criteria) this;
        }

        public Criteria andUnixDriverNotBetween(String value1, String value2) {
            addCriterion("UNIX_DRIVER not between", value1, value2, "unixDriver");
            return (Criteria) this;
        }

        public Criteria andSuUserIsNull() {
            addCriterion("SU_USER is null");
            return (Criteria) this;
        }

        public Criteria andSuUserIsNotNull() {
            addCriterion("SU_USER is not null");
            return (Criteria) this;
        }

        public Criteria andSuUserEqualTo(String value) {
            addCriterion("SU_USER =", value, "suUser");
            return (Criteria) this;
        }

        public Criteria andSuUserNotEqualTo(String value) {
            addCriterion("SU_USER <>", value, "suUser");
            return (Criteria) this;
        }

        public Criteria andSuUserGreaterThan(String value) {
            addCriterion("SU_USER >", value, "suUser");
            return (Criteria) this;
        }

        public Criteria andSuUserGreaterThanOrEqualTo(String value) {
            addCriterion("SU_USER >=", value, "suUser");
            return (Criteria) this;
        }

        public Criteria andSuUserLessThan(String value) {
            addCriterion("SU_USER <", value, "suUser");
            return (Criteria) this;
        }

        public Criteria andSuUserLessThanOrEqualTo(String value) {
            addCriterion("SU_USER <=", value, "suUser");
            return (Criteria) this;
        }

        public Criteria andSuUserLike(String value) {
            addCriterion("SU_USER like", value, "suUser");
            return (Criteria) this;
        }

        public Criteria andSuUserNotLike(String value) {
            addCriterion("SU_USER not like", value, "suUser");
            return (Criteria) this;
        }

        public Criteria andSuUserIn(List<String> values) {
            addCriterion("SU_USER in", values, "suUser");
            return (Criteria) this;
        }

        public Criteria andSuUserNotIn(List<String> values) {
            addCriterion("SU_USER not in", values, "suUser");
            return (Criteria) this;
        }

        public Criteria andSuUserBetween(String value1, String value2) {
            addCriterion("SU_USER between", value1, value2, "suUser");
            return (Criteria) this;
        }

        public Criteria andSuUserNotBetween(String value1, String value2) {
            addCriterion("SU_USER not between", value1, value2, "suUser");
            return (Criteria) this;
        }

        public Criteria andSuPasswordIsNull() {
            addCriterion("SU_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andSuPasswordIsNotNull() {
            addCriterion("SU_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andSuPasswordEqualTo(String value) {
            addCriterion("SU_PASSWORD =", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotEqualTo(String value) {
            addCriterion("SU_PASSWORD <>", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordGreaterThan(String value) {
            addCriterion("SU_PASSWORD >", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("SU_PASSWORD >=", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordLessThan(String value) {
            addCriterion("SU_PASSWORD <", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordLessThanOrEqualTo(String value) {
            addCriterion("SU_PASSWORD <=", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordLike(String value) {
            addCriterion("SU_PASSWORD like", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotLike(String value) {
            addCriterion("SU_PASSWORD not like", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordIn(List<String> values) {
            addCriterion("SU_PASSWORD in", values, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotIn(List<String> values) {
            addCriterion("SU_PASSWORD not in", values, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordBetween(String value1, String value2) {
            addCriterion("SU_PASSWORD between", value1, value2, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotBetween(String value1, String value2) {
            addCriterion("SU_PASSWORD not between", value1, value2, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPromptIsNull() {
            addCriterion("SU_PROMPT is null");
            return (Criteria) this;
        }

        public Criteria andSuPromptIsNotNull() {
            addCriterion("SU_PROMPT is not null");
            return (Criteria) this;
        }

        public Criteria andSuPromptEqualTo(String value) {
            addCriterion("SU_PROMPT =", value, "suPrompt");
            return (Criteria) this;
        }

        public Criteria andSuPromptNotEqualTo(String value) {
            addCriterion("SU_PROMPT <>", value, "suPrompt");
            return (Criteria) this;
        }

        public Criteria andSuPromptGreaterThan(String value) {
            addCriterion("SU_PROMPT >", value, "suPrompt");
            return (Criteria) this;
        }

        public Criteria andSuPromptGreaterThanOrEqualTo(String value) {
            addCriterion("SU_PROMPT >=", value, "suPrompt");
            return (Criteria) this;
        }

        public Criteria andSuPromptLessThan(String value) {
            addCriterion("SU_PROMPT <", value, "suPrompt");
            return (Criteria) this;
        }

        public Criteria andSuPromptLessThanOrEqualTo(String value) {
            addCriterion("SU_PROMPT <=", value, "suPrompt");
            return (Criteria) this;
        }

        public Criteria andSuPromptLike(String value) {
            addCriterion("SU_PROMPT like", value, "suPrompt");
            return (Criteria) this;
        }

        public Criteria andSuPromptNotLike(String value) {
            addCriterion("SU_PROMPT not like", value, "suPrompt");
            return (Criteria) this;
        }

        public Criteria andSuPromptIn(List<String> values) {
            addCriterion("SU_PROMPT in", values, "suPrompt");
            return (Criteria) this;
        }

        public Criteria andSuPromptNotIn(List<String> values) {
            addCriterion("SU_PROMPT not in", values, "suPrompt");
            return (Criteria) this;
        }

        public Criteria andSuPromptBetween(String value1, String value2) {
            addCriterion("SU_PROMPT between", value1, value2, "suPrompt");
            return (Criteria) this;
        }

        public Criteria andSuPromptNotBetween(String value1, String value2) {
            addCriterion("SU_PROMPT not between", value1, value2, "suPrompt");
            return (Criteria) this;
        }

        public Criteria andNetdeviceDriverIsNull() {
            addCriterion("NETDEVICE_DRIVER is null");
            return (Criteria) this;
        }

        public Criteria andNetdeviceDriverIsNotNull() {
            addCriterion("NETDEVICE_DRIVER is not null");
            return (Criteria) this;
        }

        public Criteria andNetdeviceDriverEqualTo(String value) {
            addCriterion("NETDEVICE_DRIVER =", value, "netdeviceDriver");
            return (Criteria) this;
        }

        public Criteria andNetdeviceDriverNotEqualTo(String value) {
            addCriterion("NETDEVICE_DRIVER <>", value, "netdeviceDriver");
            return (Criteria) this;
        }

        public Criteria andNetdeviceDriverGreaterThan(String value) {
            addCriterion("NETDEVICE_DRIVER >", value, "netdeviceDriver");
            return (Criteria) this;
        }

        public Criteria andNetdeviceDriverGreaterThanOrEqualTo(String value) {
            addCriterion("NETDEVICE_DRIVER >=", value, "netdeviceDriver");
            return (Criteria) this;
        }

        public Criteria andNetdeviceDriverLessThan(String value) {
            addCriterion("NETDEVICE_DRIVER <", value, "netdeviceDriver");
            return (Criteria) this;
        }

        public Criteria andNetdeviceDriverLessThanOrEqualTo(String value) {
            addCriterion("NETDEVICE_DRIVER <=", value, "netdeviceDriver");
            return (Criteria) this;
        }

        public Criteria andNetdeviceDriverLike(String value) {
            addCriterion("NETDEVICE_DRIVER like", value, "netdeviceDriver");
            return (Criteria) this;
        }

        public Criteria andNetdeviceDriverNotLike(String value) {
            addCriterion("NETDEVICE_DRIVER not like", value, "netdeviceDriver");
            return (Criteria) this;
        }

        public Criteria andNetdeviceDriverIn(List<String> values) {
            addCriterion("NETDEVICE_DRIVER in", values, "netdeviceDriver");
            return (Criteria) this;
        }

        public Criteria andNetdeviceDriverNotIn(List<String> values) {
            addCriterion("NETDEVICE_DRIVER not in", values, "netdeviceDriver");
            return (Criteria) this;
        }

        public Criteria andNetdeviceDriverBetween(String value1, String value2) {
            addCriterion("NETDEVICE_DRIVER between", value1, value2, "netdeviceDriver");
            return (Criteria) this;
        }

        public Criteria andNetdeviceDriverNotBetween(String value1, String value2) {
            addCriterion("NETDEVICE_DRIVER not between", value1, value2, "netdeviceDriver");
            return (Criteria) this;
        }

        public Criteria andEnableCommandIsNull() {
            addCriterion("ENABLE_COMMAND is null");
            return (Criteria) this;
        }

        public Criteria andEnableCommandIsNotNull() {
            addCriterion("ENABLE_COMMAND is not null");
            return (Criteria) this;
        }

        public Criteria andEnableCommandEqualTo(String value) {
            addCriterion("ENABLE_COMMAND =", value, "enableCommand");
            return (Criteria) this;
        }

        public Criteria andEnableCommandNotEqualTo(String value) {
            addCriterion("ENABLE_COMMAND <>", value, "enableCommand");
            return (Criteria) this;
        }

        public Criteria andEnableCommandGreaterThan(String value) {
            addCriterion("ENABLE_COMMAND >", value, "enableCommand");
            return (Criteria) this;
        }

        public Criteria andEnableCommandGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLE_COMMAND >=", value, "enableCommand");
            return (Criteria) this;
        }

        public Criteria andEnableCommandLessThan(String value) {
            addCriterion("ENABLE_COMMAND <", value, "enableCommand");
            return (Criteria) this;
        }

        public Criteria andEnableCommandLessThanOrEqualTo(String value) {
            addCriterion("ENABLE_COMMAND <=", value, "enableCommand");
            return (Criteria) this;
        }

        public Criteria andEnableCommandLike(String value) {
            addCriterion("ENABLE_COMMAND like", value, "enableCommand");
            return (Criteria) this;
        }

        public Criteria andEnableCommandNotLike(String value) {
            addCriterion("ENABLE_COMMAND not like", value, "enableCommand");
            return (Criteria) this;
        }

        public Criteria andEnableCommandIn(List<String> values) {
            addCriterion("ENABLE_COMMAND in", values, "enableCommand");
            return (Criteria) this;
        }

        public Criteria andEnableCommandNotIn(List<String> values) {
            addCriterion("ENABLE_COMMAND not in", values, "enableCommand");
            return (Criteria) this;
        }

        public Criteria andEnableCommandBetween(String value1, String value2) {
            addCriterion("ENABLE_COMMAND between", value1, value2, "enableCommand");
            return (Criteria) this;
        }

        public Criteria andEnableCommandNotBetween(String value1, String value2) {
            addCriterion("ENABLE_COMMAND not between", value1, value2, "enableCommand");
            return (Criteria) this;
        }

        public Criteria andEnablePasswordIsNull() {
            addCriterion("ENABLE_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andEnablePasswordIsNotNull() {
            addCriterion("ENABLE_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andEnablePasswordEqualTo(String value) {
            addCriterion("ENABLE_PASSWORD =", value, "enablePassword");
            return (Criteria) this;
        }

        public Criteria andEnablePasswordNotEqualTo(String value) {
            addCriterion("ENABLE_PASSWORD <>", value, "enablePassword");
            return (Criteria) this;
        }

        public Criteria andEnablePasswordGreaterThan(String value) {
            addCriterion("ENABLE_PASSWORD >", value, "enablePassword");
            return (Criteria) this;
        }

        public Criteria andEnablePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLE_PASSWORD >=", value, "enablePassword");
            return (Criteria) this;
        }

        public Criteria andEnablePasswordLessThan(String value) {
            addCriterion("ENABLE_PASSWORD <", value, "enablePassword");
            return (Criteria) this;
        }

        public Criteria andEnablePasswordLessThanOrEqualTo(String value) {
            addCriterion("ENABLE_PASSWORD <=", value, "enablePassword");
            return (Criteria) this;
        }

        public Criteria andEnablePasswordLike(String value) {
            addCriterion("ENABLE_PASSWORD like", value, "enablePassword");
            return (Criteria) this;
        }

        public Criteria andEnablePasswordNotLike(String value) {
            addCriterion("ENABLE_PASSWORD not like", value, "enablePassword");
            return (Criteria) this;
        }

        public Criteria andEnablePasswordIn(List<String> values) {
            addCriterion("ENABLE_PASSWORD in", values, "enablePassword");
            return (Criteria) this;
        }

        public Criteria andEnablePasswordNotIn(List<String> values) {
            addCriterion("ENABLE_PASSWORD not in", values, "enablePassword");
            return (Criteria) this;
        }

        public Criteria andEnablePasswordBetween(String value1, String value2) {
            addCriterion("ENABLE_PASSWORD between", value1, value2, "enablePassword");
            return (Criteria) this;
        }

        public Criteria andEnablePasswordNotBetween(String value1, String value2) {
            addCriterion("ENABLE_PASSWORD not between", value1, value2, "enablePassword");
            return (Criteria) this;
        }

        public Criteria andEnablePromptIsNull() {
            addCriterion("ENABLE_PROMPT is null");
            return (Criteria) this;
        }

        public Criteria andEnablePromptIsNotNull() {
            addCriterion("ENABLE_PROMPT is not null");
            return (Criteria) this;
        }

        public Criteria andEnablePromptEqualTo(String value) {
            addCriterion("ENABLE_PROMPT =", value, "enablePrompt");
            return (Criteria) this;
        }

        public Criteria andEnablePromptNotEqualTo(String value) {
            addCriterion("ENABLE_PROMPT <>", value, "enablePrompt");
            return (Criteria) this;
        }

        public Criteria andEnablePromptGreaterThan(String value) {
            addCriterion("ENABLE_PROMPT >", value, "enablePrompt");
            return (Criteria) this;
        }

        public Criteria andEnablePromptGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLE_PROMPT >=", value, "enablePrompt");
            return (Criteria) this;
        }

        public Criteria andEnablePromptLessThan(String value) {
            addCriterion("ENABLE_PROMPT <", value, "enablePrompt");
            return (Criteria) this;
        }

        public Criteria andEnablePromptLessThanOrEqualTo(String value) {
            addCriterion("ENABLE_PROMPT <=", value, "enablePrompt");
            return (Criteria) this;
        }

        public Criteria andEnablePromptLike(String value) {
            addCriterion("ENABLE_PROMPT like", value, "enablePrompt");
            return (Criteria) this;
        }

        public Criteria andEnablePromptNotLike(String value) {
            addCriterion("ENABLE_PROMPT not like", value, "enablePrompt");
            return (Criteria) this;
        }

        public Criteria andEnablePromptIn(List<String> values) {
            addCriterion("ENABLE_PROMPT in", values, "enablePrompt");
            return (Criteria) this;
        }

        public Criteria andEnablePromptNotIn(List<String> values) {
            addCriterion("ENABLE_PROMPT not in", values, "enablePrompt");
            return (Criteria) this;
        }

        public Criteria andEnablePromptBetween(String value1, String value2) {
            addCriterion("ENABLE_PROMPT between", value1, value2, "enablePrompt");
            return (Criteria) this;
        }

        public Criteria andEnablePromptNotBetween(String value1, String value2) {
            addCriterion("ENABLE_PROMPT not between", value1, value2, "enablePrompt");
            return (Criteria) this;
        }

        public Criteria andDbDriverIsNull() {
            addCriterion("DB_DRIVER is null");
            return (Criteria) this;
        }

        public Criteria andDbDriverIsNotNull() {
            addCriterion("DB_DRIVER is not null");
            return (Criteria) this;
        }

        public Criteria andDbDriverEqualTo(String value) {
            addCriterion("DB_DRIVER =", value, "dbDriver");
            return (Criteria) this;
        }

        public Criteria andDbDriverNotEqualTo(String value) {
            addCriterion("DB_DRIVER <>", value, "dbDriver");
            return (Criteria) this;
        }

        public Criteria andDbDriverGreaterThan(String value) {
            addCriterion("DB_DRIVER >", value, "dbDriver");
            return (Criteria) this;
        }

        public Criteria andDbDriverGreaterThanOrEqualTo(String value) {
            addCriterion("DB_DRIVER >=", value, "dbDriver");
            return (Criteria) this;
        }

        public Criteria andDbDriverLessThan(String value) {
            addCriterion("DB_DRIVER <", value, "dbDriver");
            return (Criteria) this;
        }

        public Criteria andDbDriverLessThanOrEqualTo(String value) {
            addCriterion("DB_DRIVER <=", value, "dbDriver");
            return (Criteria) this;
        }

        public Criteria andDbDriverLike(String value) {
            addCriterion("DB_DRIVER like", value, "dbDriver");
            return (Criteria) this;
        }

        public Criteria andDbDriverNotLike(String value) {
            addCriterion("DB_DRIVER not like", value, "dbDriver");
            return (Criteria) this;
        }

        public Criteria andDbDriverIn(List<String> values) {
            addCriterion("DB_DRIVER in", values, "dbDriver");
            return (Criteria) this;
        }

        public Criteria andDbDriverNotIn(List<String> values) {
            addCriterion("DB_DRIVER not in", values, "dbDriver");
            return (Criteria) this;
        }

        public Criteria andDbDriverBetween(String value1, String value2) {
            addCriterion("DB_DRIVER between", value1, value2, "dbDriver");
            return (Criteria) this;
        }

        public Criteria andDbDriverNotBetween(String value1, String value2) {
            addCriterion("DB_DRIVER not between", value1, value2, "dbDriver");
            return (Criteria) this;
        }

        public Criteria andDbNameIsNull() {
            addCriterion("DB_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDbNameIsNotNull() {
            addCriterion("DB_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDbNameEqualTo(String value) {
            addCriterion("DB_NAME =", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameNotEqualTo(String value) {
            addCriterion("DB_NAME <>", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameGreaterThan(String value) {
            addCriterion("DB_NAME >", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameGreaterThanOrEqualTo(String value) {
            addCriterion("DB_NAME >=", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameLessThan(String value) {
            addCriterion("DB_NAME <", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameLessThanOrEqualTo(String value) {
            addCriterion("DB_NAME <=", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameLike(String value) {
            addCriterion("DB_NAME like", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameNotLike(String value) {
            addCriterion("DB_NAME not like", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameIn(List<String> values) {
            addCriterion("DB_NAME in", values, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameNotIn(List<String> values) {
            addCriterion("DB_NAME not in", values, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameBetween(String value1, String value2) {
            addCriterion("DB_NAME between", value1, value2, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameNotBetween(String value1, String value2) {
            addCriterion("DB_NAME not between", value1, value2, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbServiceNameIsNull() {
            addCriterion("DB_SERVICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDbServiceNameIsNotNull() {
            addCriterion("DB_SERVICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDbServiceNameEqualTo(String value) {
            addCriterion("DB_SERVICE_NAME =", value, "dbServiceName");
            return (Criteria) this;
        }

        public Criteria andDbServiceNameNotEqualTo(String value) {
            addCriterion("DB_SERVICE_NAME <>", value, "dbServiceName");
            return (Criteria) this;
        }

        public Criteria andDbServiceNameGreaterThan(String value) {
            addCriterion("DB_SERVICE_NAME >", value, "dbServiceName");
            return (Criteria) this;
        }

        public Criteria andDbServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("DB_SERVICE_NAME >=", value, "dbServiceName");
            return (Criteria) this;
        }

        public Criteria andDbServiceNameLessThan(String value) {
            addCriterion("DB_SERVICE_NAME <", value, "dbServiceName");
            return (Criteria) this;
        }

        public Criteria andDbServiceNameLessThanOrEqualTo(String value) {
            addCriterion("DB_SERVICE_NAME <=", value, "dbServiceName");
            return (Criteria) this;
        }

        public Criteria andDbServiceNameLike(String value) {
            addCriterion("DB_SERVICE_NAME like", value, "dbServiceName");
            return (Criteria) this;
        }

        public Criteria andDbServiceNameNotLike(String value) {
            addCriterion("DB_SERVICE_NAME not like", value, "dbServiceName");
            return (Criteria) this;
        }

        public Criteria andDbServiceNameIn(List<String> values) {
            addCriterion("DB_SERVICE_NAME in", values, "dbServiceName");
            return (Criteria) this;
        }

        public Criteria andDbServiceNameNotIn(List<String> values) {
            addCriterion("DB_SERVICE_NAME not in", values, "dbServiceName");
            return (Criteria) this;
        }

        public Criteria andDbServiceNameBetween(String value1, String value2) {
            addCriterion("DB_SERVICE_NAME between", value1, value2, "dbServiceName");
            return (Criteria) this;
        }

        public Criteria andDbServiceNameNotBetween(String value1, String value2) {
            addCriterion("DB_SERVICE_NAME not between", value1, value2, "dbServiceName");
            return (Criteria) this;
        }

        public Criteria andDbUrlIsNull() {
            addCriterion("DB_URL is null");
            return (Criteria) this;
        }

        public Criteria andDbUrlIsNotNull() {
            addCriterion("DB_URL is not null");
            return (Criteria) this;
        }

        public Criteria andDbUrlEqualTo(String value) {
            addCriterion("DB_URL =", value, "dbUrl");
            return (Criteria) this;
        }

        public Criteria andDbUrlNotEqualTo(String value) {
            addCriterion("DB_URL <>", value, "dbUrl");
            return (Criteria) this;
        }

        public Criteria andDbUrlGreaterThan(String value) {
            addCriterion("DB_URL >", value, "dbUrl");
            return (Criteria) this;
        }

        public Criteria andDbUrlGreaterThanOrEqualTo(String value) {
            addCriterion("DB_URL >=", value, "dbUrl");
            return (Criteria) this;
        }

        public Criteria andDbUrlLessThan(String value) {
            addCriterion("DB_URL <", value, "dbUrl");
            return (Criteria) this;
        }

        public Criteria andDbUrlLessThanOrEqualTo(String value) {
            addCriterion("DB_URL <=", value, "dbUrl");
            return (Criteria) this;
        }

        public Criteria andDbUrlLike(String value) {
            addCriterion("DB_URL like", value, "dbUrl");
            return (Criteria) this;
        }

        public Criteria andDbUrlNotLike(String value) {
            addCriterion("DB_URL not like", value, "dbUrl");
            return (Criteria) this;
        }

        public Criteria andDbUrlIn(List<String> values) {
            addCriterion("DB_URL in", values, "dbUrl");
            return (Criteria) this;
        }

        public Criteria andDbUrlNotIn(List<String> values) {
            addCriterion("DB_URL not in", values, "dbUrl");
            return (Criteria) this;
        }

        public Criteria andDbUrlBetween(String value1, String value2) {
            addCriterion("DB_URL between", value1, value2, "dbUrl");
            return (Criteria) this;
        }

        public Criteria andDbUrlNotBetween(String value1, String value2) {
            addCriterion("DB_URL not between", value1, value2, "dbUrl");
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