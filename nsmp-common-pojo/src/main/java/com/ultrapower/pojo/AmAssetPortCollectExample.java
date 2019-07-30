package com.ultrapower.pojo;

import java.util.ArrayList;
import java.util.List;

public class AmAssetPortCollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmAssetPortCollectExample() {
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

        public Criteria andPkAssetPortCollectIsNull() {
            addCriterion("PK_ASSET_PORT_COLLECT is null");
            return (Criteria) this;
        }

        public Criteria andPkAssetPortCollectIsNotNull() {
            addCriterion("PK_ASSET_PORT_COLLECT is not null");
            return (Criteria) this;
        }

        public Criteria andPkAssetPortCollectEqualTo(String value) {
            addCriterion("PK_ASSET_PORT_COLLECT =", value, "pkAssetPortCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetPortCollectNotEqualTo(String value) {
            addCriterion("PK_ASSET_PORT_COLLECT <>", value, "pkAssetPortCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetPortCollectGreaterThan(String value) {
            addCriterion("PK_ASSET_PORT_COLLECT >", value, "pkAssetPortCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetPortCollectGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ASSET_PORT_COLLECT >=", value, "pkAssetPortCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetPortCollectLessThan(String value) {
            addCriterion("PK_ASSET_PORT_COLLECT <", value, "pkAssetPortCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetPortCollectLessThanOrEqualTo(String value) {
            addCriterion("PK_ASSET_PORT_COLLECT <=", value, "pkAssetPortCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetPortCollectLike(String value) {
            addCriterion("PK_ASSET_PORT_COLLECT like", value, "pkAssetPortCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetPortCollectNotLike(String value) {
            addCriterion("PK_ASSET_PORT_COLLECT not like", value, "pkAssetPortCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetPortCollectIn(List<String> values) {
            addCriterion("PK_ASSET_PORT_COLLECT in", values, "pkAssetPortCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetPortCollectNotIn(List<String> values) {
            addCriterion("PK_ASSET_PORT_COLLECT not in", values, "pkAssetPortCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetPortCollectBetween(String value1, String value2) {
            addCriterion("PK_ASSET_PORT_COLLECT between", value1, value2, "pkAssetPortCollect");
            return (Criteria) this;
        }

        public Criteria andPkAssetPortCollectNotBetween(String value1, String value2) {
            addCriterion("PK_ASSET_PORT_COLLECT not between", value1, value2, "pkAssetPortCollect");
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

        public Criteria andProtocolIsNull() {
            addCriterion("PROTOCOL is null");
            return (Criteria) this;
        }

        public Criteria andProtocolIsNotNull() {
            addCriterion("PROTOCOL is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolEqualTo(String value) {
            addCriterion("PROTOCOL =", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotEqualTo(String value) {
            addCriterion("PROTOCOL <>", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolGreaterThan(String value) {
            addCriterion("PROTOCOL >", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolGreaterThanOrEqualTo(String value) {
            addCriterion("PROTOCOL >=", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLessThan(String value) {
            addCriterion("PROTOCOL <", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLessThanOrEqualTo(String value) {
            addCriterion("PROTOCOL <=", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLike(String value) {
            addCriterion("PROTOCOL like", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotLike(String value) {
            addCriterion("PROTOCOL not like", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolIn(List<String> values) {
            addCriterion("PROTOCOL in", values, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotIn(List<String> values) {
            addCriterion("PROTOCOL not in", values, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolBetween(String value1, String value2) {
            addCriterion("PROTOCOL between", value1, value2, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotBetween(String value1, String value2) {
            addCriterion("PROTOCOL not between", value1, value2, "protocol");
            return (Criteria) this;
        }

        public Criteria andLocalAddrIsNull() {
            addCriterion("LOCAL_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andLocalAddrIsNotNull() {
            addCriterion("LOCAL_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andLocalAddrEqualTo(String value) {
            addCriterion("LOCAL_ADDR =", value, "localAddr");
            return (Criteria) this;
        }

        public Criteria andLocalAddrNotEqualTo(String value) {
            addCriterion("LOCAL_ADDR <>", value, "localAddr");
            return (Criteria) this;
        }

        public Criteria andLocalAddrGreaterThan(String value) {
            addCriterion("LOCAL_ADDR >", value, "localAddr");
            return (Criteria) this;
        }

        public Criteria andLocalAddrGreaterThanOrEqualTo(String value) {
            addCriterion("LOCAL_ADDR >=", value, "localAddr");
            return (Criteria) this;
        }

        public Criteria andLocalAddrLessThan(String value) {
            addCriterion("LOCAL_ADDR <", value, "localAddr");
            return (Criteria) this;
        }

        public Criteria andLocalAddrLessThanOrEqualTo(String value) {
            addCriterion("LOCAL_ADDR <=", value, "localAddr");
            return (Criteria) this;
        }

        public Criteria andLocalAddrLike(String value) {
            addCriterion("LOCAL_ADDR like", value, "localAddr");
            return (Criteria) this;
        }

        public Criteria andLocalAddrNotLike(String value) {
            addCriterion("LOCAL_ADDR not like", value, "localAddr");
            return (Criteria) this;
        }

        public Criteria andLocalAddrIn(List<String> values) {
            addCriterion("LOCAL_ADDR in", values, "localAddr");
            return (Criteria) this;
        }

        public Criteria andLocalAddrNotIn(List<String> values) {
            addCriterion("LOCAL_ADDR not in", values, "localAddr");
            return (Criteria) this;
        }

        public Criteria andLocalAddrBetween(String value1, String value2) {
            addCriterion("LOCAL_ADDR between", value1, value2, "localAddr");
            return (Criteria) this;
        }

        public Criteria andLocalAddrNotBetween(String value1, String value2) {
            addCriterion("LOCAL_ADDR not between", value1, value2, "localAddr");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("PORT is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("PORT is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(String value) {
            addCriterion("PORT =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(String value) {
            addCriterion("PORT <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(String value) {
            addCriterion("PORT >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(String value) {
            addCriterion("PORT >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(String value) {
            addCriterion("PORT <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(String value) {
            addCriterion("PORT <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLike(String value) {
            addCriterion("PORT like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotLike(String value) {
            addCriterion("PORT not like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<String> values) {
            addCriterion("PORT in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<String> values) {
            addCriterion("PORT not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(String value1, String value2) {
            addCriterion("PORT between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(String value1, String value2) {
            addCriterion("PORT not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrIsNull() {
            addCriterion("REMOTE_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrIsNotNull() {
            addCriterion("REMOTE_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrEqualTo(String value) {
            addCriterion("REMOTE_ADDR =", value, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrNotEqualTo(String value) {
            addCriterion("REMOTE_ADDR <>", value, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrGreaterThan(String value) {
            addCriterion("REMOTE_ADDR >", value, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrGreaterThanOrEqualTo(String value) {
            addCriterion("REMOTE_ADDR >=", value, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrLessThan(String value) {
            addCriterion("REMOTE_ADDR <", value, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrLessThanOrEqualTo(String value) {
            addCriterion("REMOTE_ADDR <=", value, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrLike(String value) {
            addCriterion("REMOTE_ADDR like", value, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrNotLike(String value) {
            addCriterion("REMOTE_ADDR not like", value, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrIn(List<String> values) {
            addCriterion("REMOTE_ADDR in", values, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrNotIn(List<String> values) {
            addCriterion("REMOTE_ADDR not in", values, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrBetween(String value1, String value2) {
            addCriterion("REMOTE_ADDR between", value1, value2, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemoteAddrNotBetween(String value1, String value2) {
            addCriterion("REMOTE_ADDR not between", value1, value2, "remoteAddr");
            return (Criteria) this;
        }

        public Criteria andRemotePortIsNull() {
            addCriterion("REMOTE_PORT is null");
            return (Criteria) this;
        }

        public Criteria andRemotePortIsNotNull() {
            addCriterion("REMOTE_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andRemotePortEqualTo(String value) {
            addCriterion("REMOTE_PORT =", value, "remotePort");
            return (Criteria) this;
        }

        public Criteria andRemotePortNotEqualTo(String value) {
            addCriterion("REMOTE_PORT <>", value, "remotePort");
            return (Criteria) this;
        }

        public Criteria andRemotePortGreaterThan(String value) {
            addCriterion("REMOTE_PORT >", value, "remotePort");
            return (Criteria) this;
        }

        public Criteria andRemotePortGreaterThanOrEqualTo(String value) {
            addCriterion("REMOTE_PORT >=", value, "remotePort");
            return (Criteria) this;
        }

        public Criteria andRemotePortLessThan(String value) {
            addCriterion("REMOTE_PORT <", value, "remotePort");
            return (Criteria) this;
        }

        public Criteria andRemotePortLessThanOrEqualTo(String value) {
            addCriterion("REMOTE_PORT <=", value, "remotePort");
            return (Criteria) this;
        }

        public Criteria andRemotePortLike(String value) {
            addCriterion("REMOTE_PORT like", value, "remotePort");
            return (Criteria) this;
        }

        public Criteria andRemotePortNotLike(String value) {
            addCriterion("REMOTE_PORT not like", value, "remotePort");
            return (Criteria) this;
        }

        public Criteria andRemotePortIn(List<String> values) {
            addCriterion("REMOTE_PORT in", values, "remotePort");
            return (Criteria) this;
        }

        public Criteria andRemotePortNotIn(List<String> values) {
            addCriterion("REMOTE_PORT not in", values, "remotePort");
            return (Criteria) this;
        }

        public Criteria andRemotePortBetween(String value1, String value2) {
            addCriterion("REMOTE_PORT between", value1, value2, "remotePort");
            return (Criteria) this;
        }

        public Criteria andRemotePortNotBetween(String value1, String value2) {
            addCriterion("REMOTE_PORT not between", value1, value2, "remotePort");
            return (Criteria) this;
        }

        public Criteria andConnStateIsNull() {
            addCriterion("CONN_STATE is null");
            return (Criteria) this;
        }

        public Criteria andConnStateIsNotNull() {
            addCriterion("CONN_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andConnStateEqualTo(String value) {
            addCriterion("CONN_STATE =", value, "connState");
            return (Criteria) this;
        }

        public Criteria andConnStateNotEqualTo(String value) {
            addCriterion("CONN_STATE <>", value, "connState");
            return (Criteria) this;
        }

        public Criteria andConnStateGreaterThan(String value) {
            addCriterion("CONN_STATE >", value, "connState");
            return (Criteria) this;
        }

        public Criteria andConnStateGreaterThanOrEqualTo(String value) {
            addCriterion("CONN_STATE >=", value, "connState");
            return (Criteria) this;
        }

        public Criteria andConnStateLessThan(String value) {
            addCriterion("CONN_STATE <", value, "connState");
            return (Criteria) this;
        }

        public Criteria andConnStateLessThanOrEqualTo(String value) {
            addCriterion("CONN_STATE <=", value, "connState");
            return (Criteria) this;
        }

        public Criteria andConnStateLike(String value) {
            addCriterion("CONN_STATE like", value, "connState");
            return (Criteria) this;
        }

        public Criteria andConnStateNotLike(String value) {
            addCriterion("CONN_STATE not like", value, "connState");
            return (Criteria) this;
        }

        public Criteria andConnStateIn(List<String> values) {
            addCriterion("CONN_STATE in", values, "connState");
            return (Criteria) this;
        }

        public Criteria andConnStateNotIn(List<String> values) {
            addCriterion("CONN_STATE not in", values, "connState");
            return (Criteria) this;
        }

        public Criteria andConnStateBetween(String value1, String value2) {
            addCriterion("CONN_STATE between", value1, value2, "connState");
            return (Criteria) this;
        }

        public Criteria andConnStateNotBetween(String value1, String value2) {
            addCriterion("CONN_STATE not between", value1, value2, "connState");
            return (Criteria) this;
        }

        public Criteria andPortDescIsNull() {
            addCriterion("PORT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andPortDescIsNotNull() {
            addCriterion("PORT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andPortDescEqualTo(String value) {
            addCriterion("PORT_DESC =", value, "portDesc");
            return (Criteria) this;
        }

        public Criteria andPortDescNotEqualTo(String value) {
            addCriterion("PORT_DESC <>", value, "portDesc");
            return (Criteria) this;
        }

        public Criteria andPortDescGreaterThan(String value) {
            addCriterion("PORT_DESC >", value, "portDesc");
            return (Criteria) this;
        }

        public Criteria andPortDescGreaterThanOrEqualTo(String value) {
            addCriterion("PORT_DESC >=", value, "portDesc");
            return (Criteria) this;
        }

        public Criteria andPortDescLessThan(String value) {
            addCriterion("PORT_DESC <", value, "portDesc");
            return (Criteria) this;
        }

        public Criteria andPortDescLessThanOrEqualTo(String value) {
            addCriterion("PORT_DESC <=", value, "portDesc");
            return (Criteria) this;
        }

        public Criteria andPortDescLike(String value) {
            addCriterion("PORT_DESC like", value, "portDesc");
            return (Criteria) this;
        }

        public Criteria andPortDescNotLike(String value) {
            addCriterion("PORT_DESC not like", value, "portDesc");
            return (Criteria) this;
        }

        public Criteria andPortDescIn(List<String> values) {
            addCriterion("PORT_DESC in", values, "portDesc");
            return (Criteria) this;
        }

        public Criteria andPortDescNotIn(List<String> values) {
            addCriterion("PORT_DESC not in", values, "portDesc");
            return (Criteria) this;
        }

        public Criteria andPortDescBetween(String value1, String value2) {
            addCriterion("PORT_DESC between", value1, value2, "portDesc");
            return (Criteria) this;
        }

        public Criteria andPortDescNotBetween(String value1, String value2) {
            addCriterion("PORT_DESC not between", value1, value2, "portDesc");
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