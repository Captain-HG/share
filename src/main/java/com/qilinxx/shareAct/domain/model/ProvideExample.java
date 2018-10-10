package com.qilinxx.shareAct.domain.model;

import java.util.ArrayList;
import java.util.List;

public class ProvideExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProvideExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(String value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(String value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(String value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(String value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(String value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(String value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLike(String value) {
            addCriterion("p_id like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotLike(String value) {
            addCriterion("p_id not like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<String> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<String> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(String value1, String value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(String value1, String value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPAccountIsNull() {
            addCriterion("p_account is null");
            return (Criteria) this;
        }

        public Criteria andPAccountIsNotNull() {
            addCriterion("p_account is not null");
            return (Criteria) this;
        }

        public Criteria andPAccountEqualTo(String value) {
            addCriterion("p_account =", value, "pAccount");
            return (Criteria) this;
        }

        public Criteria andPAccountNotEqualTo(String value) {
            addCriterion("p_account <>", value, "pAccount");
            return (Criteria) this;
        }

        public Criteria andPAccountGreaterThan(String value) {
            addCriterion("p_account >", value, "pAccount");
            return (Criteria) this;
        }

        public Criteria andPAccountGreaterThanOrEqualTo(String value) {
            addCriterion("p_account >=", value, "pAccount");
            return (Criteria) this;
        }

        public Criteria andPAccountLessThan(String value) {
            addCriterion("p_account <", value, "pAccount");
            return (Criteria) this;
        }

        public Criteria andPAccountLessThanOrEqualTo(String value) {
            addCriterion("p_account <=", value, "pAccount");
            return (Criteria) this;
        }

        public Criteria andPAccountLike(String value) {
            addCriterion("p_account like", value, "pAccount");
            return (Criteria) this;
        }

        public Criteria andPAccountNotLike(String value) {
            addCriterion("p_account not like", value, "pAccount");
            return (Criteria) this;
        }

        public Criteria andPAccountIn(List<String> values) {
            addCriterion("p_account in", values, "pAccount");
            return (Criteria) this;
        }

        public Criteria andPAccountNotIn(List<String> values) {
            addCriterion("p_account not in", values, "pAccount");
            return (Criteria) this;
        }

        public Criteria andPAccountBetween(String value1, String value2) {
            addCriterion("p_account between", value1, value2, "pAccount");
            return (Criteria) this;
        }

        public Criteria andPAccountNotBetween(String value1, String value2) {
            addCriterion("p_account not between", value1, value2, "pAccount");
            return (Criteria) this;
        }

        public Criteria andPPasswordIsNull() {
            addCriterion("p_password is null");
            return (Criteria) this;
        }

        public Criteria andPPasswordIsNotNull() {
            addCriterion("p_password is not null");
            return (Criteria) this;
        }

        public Criteria andPPasswordEqualTo(String value) {
            addCriterion("p_password =", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordNotEqualTo(String value) {
            addCriterion("p_password <>", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordGreaterThan(String value) {
            addCriterion("p_password >", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("p_password >=", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordLessThan(String value) {
            addCriterion("p_password <", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordLessThanOrEqualTo(String value) {
            addCriterion("p_password <=", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordLike(String value) {
            addCriterion("p_password like", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordNotLike(String value) {
            addCriterion("p_password not like", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordIn(List<String> values) {
            addCriterion("p_password in", values, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordNotIn(List<String> values) {
            addCriterion("p_password not in", values, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordBetween(String value1, String value2) {
            addCriterion("p_password between", value1, value2, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordNotBetween(String value1, String value2) {
            addCriterion("p_password not between", value1, value2, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPAddressIsNull() {
            addCriterion("p_address is null");
            return (Criteria) this;
        }

        public Criteria andPAddressIsNotNull() {
            addCriterion("p_address is not null");
            return (Criteria) this;
        }

        public Criteria andPAddressEqualTo(String value) {
            addCriterion("p_address =", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotEqualTo(String value) {
            addCriterion("p_address <>", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressGreaterThan(String value) {
            addCriterion("p_address >", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressGreaterThanOrEqualTo(String value) {
            addCriterion("p_address >=", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLessThan(String value) {
            addCriterion("p_address <", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLessThanOrEqualTo(String value) {
            addCriterion("p_address <=", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLike(String value) {
            addCriterion("p_address like", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotLike(String value) {
            addCriterion("p_address not like", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressIn(List<String> values) {
            addCriterion("p_address in", values, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotIn(List<String> values) {
            addCriterion("p_address not in", values, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressBetween(String value1, String value2) {
            addCriterion("p_address between", value1, value2, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotBetween(String value1, String value2) {
            addCriterion("p_address not between", value1, value2, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeIsNull() {
            addCriterion("p_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeIsNotNull() {
            addCriterion("p_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeEqualTo(Integer value) {
            addCriterion("p_create_time =", value, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeNotEqualTo(Integer value) {
            addCriterion("p_create_time <>", value, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeGreaterThan(Integer value) {
            addCriterion("p_create_time >", value, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_create_time >=", value, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeLessThan(Integer value) {
            addCriterion("p_create_time <", value, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("p_create_time <=", value, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeIn(List<Integer> values) {
            addCriterion("p_create_time in", values, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeNotIn(List<Integer> values) {
            addCriterion("p_create_time not in", values, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("p_create_time between", value1, value2, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("p_create_time not between", value1, value2, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPPermitNumberIsNull() {
            addCriterion("p_permit_number is null");
            return (Criteria) this;
        }

        public Criteria andPPermitNumberIsNotNull() {
            addCriterion("p_permit_number is not null");
            return (Criteria) this;
        }

        public Criteria andPPermitNumberEqualTo(String value) {
            addCriterion("p_permit_number =", value, "pPermitNumber");
            return (Criteria) this;
        }

        public Criteria andPPermitNumberNotEqualTo(String value) {
            addCriterion("p_permit_number <>", value, "pPermitNumber");
            return (Criteria) this;
        }

        public Criteria andPPermitNumberGreaterThan(String value) {
            addCriterion("p_permit_number >", value, "pPermitNumber");
            return (Criteria) this;
        }

        public Criteria andPPermitNumberGreaterThanOrEqualTo(String value) {
            addCriterion("p_permit_number >=", value, "pPermitNumber");
            return (Criteria) this;
        }

        public Criteria andPPermitNumberLessThan(String value) {
            addCriterion("p_permit_number <", value, "pPermitNumber");
            return (Criteria) this;
        }

        public Criteria andPPermitNumberLessThanOrEqualTo(String value) {
            addCriterion("p_permit_number <=", value, "pPermitNumber");
            return (Criteria) this;
        }

        public Criteria andPPermitNumberLike(String value) {
            addCriterion("p_permit_number like", value, "pPermitNumber");
            return (Criteria) this;
        }

        public Criteria andPPermitNumberNotLike(String value) {
            addCriterion("p_permit_number not like", value, "pPermitNumber");
            return (Criteria) this;
        }

        public Criteria andPPermitNumberIn(List<String> values) {
            addCriterion("p_permit_number in", values, "pPermitNumber");
            return (Criteria) this;
        }

        public Criteria andPPermitNumberNotIn(List<String> values) {
            addCriterion("p_permit_number not in", values, "pPermitNumber");
            return (Criteria) this;
        }

        public Criteria andPPermitNumberBetween(String value1, String value2) {
            addCriterion("p_permit_number between", value1, value2, "pPermitNumber");
            return (Criteria) this;
        }

        public Criteria andPPermitNumberNotBetween(String value1, String value2) {
            addCriterion("p_permit_number not between", value1, value2, "pPermitNumber");
            return (Criteria) this;
        }

        public Criteria andPStateIsNull() {
            addCriterion("p_state is null");
            return (Criteria) this;
        }

        public Criteria andPStateIsNotNull() {
            addCriterion("p_state is not null");
            return (Criteria) this;
        }

        public Criteria andPStateEqualTo(String value) {
            addCriterion("p_state =", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateNotEqualTo(String value) {
            addCriterion("p_state <>", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateGreaterThan(String value) {
            addCriterion("p_state >", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateGreaterThanOrEqualTo(String value) {
            addCriterion("p_state >=", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateLessThan(String value) {
            addCriterion("p_state <", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateLessThanOrEqualTo(String value) {
            addCriterion("p_state <=", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateLike(String value) {
            addCriterion("p_state like", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateNotLike(String value) {
            addCriterion("p_state not like", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateIn(List<String> values) {
            addCriterion("p_state in", values, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateNotIn(List<String> values) {
            addCriterion("p_state not in", values, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateBetween(String value1, String value2) {
            addCriterion("p_state between", value1, value2, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateNotBetween(String value1, String value2) {
            addCriterion("p_state not between", value1, value2, "pState");
            return (Criteria) this;
        }

        public Criteria andPBackupIsNull() {
            addCriterion("p_backup is null");
            return (Criteria) this;
        }

        public Criteria andPBackupIsNotNull() {
            addCriterion("p_backup is not null");
            return (Criteria) this;
        }

        public Criteria andPBackupEqualTo(String value) {
            addCriterion("p_backup =", value, "pBackup");
            return (Criteria) this;
        }

        public Criteria andPBackupNotEqualTo(String value) {
            addCriterion("p_backup <>", value, "pBackup");
            return (Criteria) this;
        }

        public Criteria andPBackupGreaterThan(String value) {
            addCriterion("p_backup >", value, "pBackup");
            return (Criteria) this;
        }

        public Criteria andPBackupGreaterThanOrEqualTo(String value) {
            addCriterion("p_backup >=", value, "pBackup");
            return (Criteria) this;
        }

        public Criteria andPBackupLessThan(String value) {
            addCriterion("p_backup <", value, "pBackup");
            return (Criteria) this;
        }

        public Criteria andPBackupLessThanOrEqualTo(String value) {
            addCriterion("p_backup <=", value, "pBackup");
            return (Criteria) this;
        }

        public Criteria andPBackupLike(String value) {
            addCriterion("p_backup like", value, "pBackup");
            return (Criteria) this;
        }

        public Criteria andPBackupNotLike(String value) {
            addCriterion("p_backup not like", value, "pBackup");
            return (Criteria) this;
        }

        public Criteria andPBackupIn(List<String> values) {
            addCriterion("p_backup in", values, "pBackup");
            return (Criteria) this;
        }

        public Criteria andPBackupNotIn(List<String> values) {
            addCriterion("p_backup not in", values, "pBackup");
            return (Criteria) this;
        }

        public Criteria andPBackupBetween(String value1, String value2) {
            addCriterion("p_backup between", value1, value2, "pBackup");
            return (Criteria) this;
        }

        public Criteria andPBackupNotBetween(String value1, String value2) {
            addCriterion("p_backup not between", value1, value2, "pBackup");
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