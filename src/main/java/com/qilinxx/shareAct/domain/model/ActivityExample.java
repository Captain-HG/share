package com.qilinxx.shareAct.domain.model;

import java.util.ArrayList;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(String value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(String value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(String value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(String value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(String value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(String value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLike(String value) {
            addCriterion("a_id like", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotLike(String value) {
            addCriterion("a_id not like", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<String> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<String> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(String value1, String value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(String value1, String value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andANameIsNull() {
            addCriterion("a_name is null");
            return (Criteria) this;
        }

        public Criteria andANameIsNotNull() {
            addCriterion("a_name is not null");
            return (Criteria) this;
        }

        public Criteria andANameEqualTo(String value) {
            addCriterion("a_name =", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotEqualTo(String value) {
            addCriterion("a_name <>", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThan(String value) {
            addCriterion("a_name >", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThanOrEqualTo(String value) {
            addCriterion("a_name >=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThan(String value) {
            addCriterion("a_name <", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThanOrEqualTo(String value) {
            addCriterion("a_name <=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLike(String value) {
            addCriterion("a_name like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotLike(String value) {
            addCriterion("a_name not like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameIn(List<String> values) {
            addCriterion("a_name in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotIn(List<String> values) {
            addCriterion("a_name not in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameBetween(String value1, String value2) {
            addCriterion("a_name between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotBetween(String value1, String value2) {
            addCriterion("a_name not between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andAPIdIsNull() {
            addCriterion("a_p_id is null");
            return (Criteria) this;
        }

        public Criteria andAPIdIsNotNull() {
            addCriterion("a_p_id is not null");
            return (Criteria) this;
        }

        public Criteria andAPIdEqualTo(String value) {
            addCriterion("a_p_id =", value, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdNotEqualTo(String value) {
            addCriterion("a_p_id <>", value, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdGreaterThan(String value) {
            addCriterion("a_p_id >", value, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdGreaterThanOrEqualTo(String value) {
            addCriterion("a_p_id >=", value, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdLessThan(String value) {
            addCriterion("a_p_id <", value, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdLessThanOrEqualTo(String value) {
            addCriterion("a_p_id <=", value, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdLike(String value) {
            addCriterion("a_p_id like", value, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdNotLike(String value) {
            addCriterion("a_p_id not like", value, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdIn(List<String> values) {
            addCriterion("a_p_id in", values, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdNotIn(List<String> values) {
            addCriterion("a_p_id not in", values, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdBetween(String value1, String value2) {
            addCriterion("a_p_id between", value1, value2, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdNotBetween(String value1, String value2) {
            addCriterion("a_p_id not between", value1, value2, "aPId");
            return (Criteria) this;
        }

        public Criteria andAStartTimeIsNull() {
            addCriterion("a_start_time is null");
            return (Criteria) this;
        }

        public Criteria andAStartTimeIsNotNull() {
            addCriterion("a_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andAStartTimeEqualTo(Integer value) {
            addCriterion("a_start_time =", value, "aStartTime");
            return (Criteria) this;
        }

        public Criteria andAStartTimeNotEqualTo(Integer value) {
            addCriterion("a_start_time <>", value, "aStartTime");
            return (Criteria) this;
        }

        public Criteria andAStartTimeGreaterThan(Integer value) {
            addCriterion("a_start_time >", value, "aStartTime");
            return (Criteria) this;
        }

        public Criteria andAStartTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_start_time >=", value, "aStartTime");
            return (Criteria) this;
        }

        public Criteria andAStartTimeLessThan(Integer value) {
            addCriterion("a_start_time <", value, "aStartTime");
            return (Criteria) this;
        }

        public Criteria andAStartTimeLessThanOrEqualTo(Integer value) {
            addCriterion("a_start_time <=", value, "aStartTime");
            return (Criteria) this;
        }

        public Criteria andAStartTimeIn(List<Integer> values) {
            addCriterion("a_start_time in", values, "aStartTime");
            return (Criteria) this;
        }

        public Criteria andAStartTimeNotIn(List<Integer> values) {
            addCriterion("a_start_time not in", values, "aStartTime");
            return (Criteria) this;
        }

        public Criteria andAStartTimeBetween(Integer value1, Integer value2) {
            addCriterion("a_start_time between", value1, value2, "aStartTime");
            return (Criteria) this;
        }

        public Criteria andAStartTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("a_start_time not between", value1, value2, "aStartTime");
            return (Criteria) this;
        }

        public Criteria andAEndTimeIsNull() {
            addCriterion("a_end_time is null");
            return (Criteria) this;
        }

        public Criteria andAEndTimeIsNotNull() {
            addCriterion("a_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andAEndTimeEqualTo(Integer value) {
            addCriterion("a_end_time =", value, "aEndTime");
            return (Criteria) this;
        }

        public Criteria andAEndTimeNotEqualTo(Integer value) {
            addCriterion("a_end_time <>", value, "aEndTime");
            return (Criteria) this;
        }

        public Criteria andAEndTimeGreaterThan(Integer value) {
            addCriterion("a_end_time >", value, "aEndTime");
            return (Criteria) this;
        }

        public Criteria andAEndTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_end_time >=", value, "aEndTime");
            return (Criteria) this;
        }

        public Criteria andAEndTimeLessThan(Integer value) {
            addCriterion("a_end_time <", value, "aEndTime");
            return (Criteria) this;
        }

        public Criteria andAEndTimeLessThanOrEqualTo(Integer value) {
            addCriterion("a_end_time <=", value, "aEndTime");
            return (Criteria) this;
        }

        public Criteria andAEndTimeIn(List<Integer> values) {
            addCriterion("a_end_time in", values, "aEndTime");
            return (Criteria) this;
        }

        public Criteria andAEndTimeNotIn(List<Integer> values) {
            addCriterion("a_end_time not in", values, "aEndTime");
            return (Criteria) this;
        }

        public Criteria andAEndTimeBetween(Integer value1, Integer value2) {
            addCriterion("a_end_time between", value1, value2, "aEndTime");
            return (Criteria) this;
        }

        public Criteria andAEndTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("a_end_time not between", value1, value2, "aEndTime");
            return (Criteria) this;
        }

        public Criteria andAStateIsNull() {
            addCriterion("a_state is null");
            return (Criteria) this;
        }

        public Criteria andAStateIsNotNull() {
            addCriterion("a_state is not null");
            return (Criteria) this;
        }

        public Criteria andAStateEqualTo(String value) {
            addCriterion("a_state =", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateNotEqualTo(String value) {
            addCriterion("a_state <>", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateGreaterThan(String value) {
            addCriterion("a_state >", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateGreaterThanOrEqualTo(String value) {
            addCriterion("a_state >=", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateLessThan(String value) {
            addCriterion("a_state <", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateLessThanOrEqualTo(String value) {
            addCriterion("a_state <=", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateLike(String value) {
            addCriterion("a_state like", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateNotLike(String value) {
            addCriterion("a_state not like", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateIn(List<String> values) {
            addCriterion("a_state in", values, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateNotIn(List<String> values) {
            addCriterion("a_state not in", values, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateBetween(String value1, String value2) {
            addCriterion("a_state between", value1, value2, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateNotBetween(String value1, String value2) {
            addCriterion("a_state not between", value1, value2, "aState");
            return (Criteria) this;
        }

        public Criteria andAUrlIsNull() {
            addCriterion("a_url is null");
            return (Criteria) this;
        }

        public Criteria andAUrlIsNotNull() {
            addCriterion("a_url is not null");
            return (Criteria) this;
        }

        public Criteria andAUrlEqualTo(String value) {
            addCriterion("a_url =", value, "aUrl");
            return (Criteria) this;
        }

        public Criteria andAUrlNotEqualTo(String value) {
            addCriterion("a_url <>", value, "aUrl");
            return (Criteria) this;
        }

        public Criteria andAUrlGreaterThan(String value) {
            addCriterion("a_url >", value, "aUrl");
            return (Criteria) this;
        }

        public Criteria andAUrlGreaterThanOrEqualTo(String value) {
            addCriterion("a_url >=", value, "aUrl");
            return (Criteria) this;
        }

        public Criteria andAUrlLessThan(String value) {
            addCriterion("a_url <", value, "aUrl");
            return (Criteria) this;
        }

        public Criteria andAUrlLessThanOrEqualTo(String value) {
            addCriterion("a_url <=", value, "aUrl");
            return (Criteria) this;
        }

        public Criteria andAUrlLike(String value) {
            addCriterion("a_url like", value, "aUrl");
            return (Criteria) this;
        }

        public Criteria andAUrlNotLike(String value) {
            addCriterion("a_url not like", value, "aUrl");
            return (Criteria) this;
        }

        public Criteria andAUrlIn(List<String> values) {
            addCriterion("a_url in", values, "aUrl");
            return (Criteria) this;
        }

        public Criteria andAUrlNotIn(List<String> values) {
            addCriterion("a_url not in", values, "aUrl");
            return (Criteria) this;
        }

        public Criteria andAUrlBetween(String value1, String value2) {
            addCriterion("a_url between", value1, value2, "aUrl");
            return (Criteria) this;
        }

        public Criteria andAUrlNotBetween(String value1, String value2) {
            addCriterion("a_url not between", value1, value2, "aUrl");
            return (Criteria) this;
        }

        public Criteria andADetailIsNull() {
            addCriterion("a_detail is null");
            return (Criteria) this;
        }

        public Criteria andADetailIsNotNull() {
            addCriterion("a_detail is not null");
            return (Criteria) this;
        }

        public Criteria andADetailEqualTo(String value) {
            addCriterion("a_detail =", value, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailNotEqualTo(String value) {
            addCriterion("a_detail <>", value, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailGreaterThan(String value) {
            addCriterion("a_detail >", value, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailGreaterThanOrEqualTo(String value) {
            addCriterion("a_detail >=", value, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailLessThan(String value) {
            addCriterion("a_detail <", value, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailLessThanOrEqualTo(String value) {
            addCriterion("a_detail <=", value, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailLike(String value) {
            addCriterion("a_detail like", value, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailNotLike(String value) {
            addCriterion("a_detail not like", value, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailIn(List<String> values) {
            addCriterion("a_detail in", values, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailNotIn(List<String> values) {
            addCriterion("a_detail not in", values, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailBetween(String value1, String value2) {
            addCriterion("a_detail between", value1, value2, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailNotBetween(String value1, String value2) {
            addCriterion("a_detail not between", value1, value2, "aDetail");
            return (Criteria) this;
        }

        public Criteria andABackupIsNull() {
            addCriterion("a_backup is null");
            return (Criteria) this;
        }

        public Criteria andABackupIsNotNull() {
            addCriterion("a_backup is not null");
            return (Criteria) this;
        }

        public Criteria andABackupEqualTo(String value) {
            addCriterion("a_backup =", value, "aBackup");
            return (Criteria) this;
        }

        public Criteria andABackupNotEqualTo(String value) {
            addCriterion("a_backup <>", value, "aBackup");
            return (Criteria) this;
        }

        public Criteria andABackupGreaterThan(String value) {
            addCriterion("a_backup >", value, "aBackup");
            return (Criteria) this;
        }

        public Criteria andABackupGreaterThanOrEqualTo(String value) {
            addCriterion("a_backup >=", value, "aBackup");
            return (Criteria) this;
        }

        public Criteria andABackupLessThan(String value) {
            addCriterion("a_backup <", value, "aBackup");
            return (Criteria) this;
        }

        public Criteria andABackupLessThanOrEqualTo(String value) {
            addCriterion("a_backup <=", value, "aBackup");
            return (Criteria) this;
        }

        public Criteria andABackupLike(String value) {
            addCriterion("a_backup like", value, "aBackup");
            return (Criteria) this;
        }

        public Criteria andABackupNotLike(String value) {
            addCriterion("a_backup not like", value, "aBackup");
            return (Criteria) this;
        }

        public Criteria andABackupIn(List<String> values) {
            addCriterion("a_backup in", values, "aBackup");
            return (Criteria) this;
        }

        public Criteria andABackupNotIn(List<String> values) {
            addCriterion("a_backup not in", values, "aBackup");
            return (Criteria) this;
        }

        public Criteria andABackupBetween(String value1, String value2) {
            addCriterion("a_backup between", value1, value2, "aBackup");
            return (Criteria) this;
        }

        public Criteria andABackupNotBetween(String value1, String value2) {
            addCriterion("a_backup not between", value1, value2, "aBackup");
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