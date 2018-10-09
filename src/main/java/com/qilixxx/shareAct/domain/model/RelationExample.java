package com.qilixxx.shareAct.domain.model;

import java.util.ArrayList;
import java.util.List;

public class RelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelationExample() {
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

        public Criteria andRIdIsNull() {
            addCriterion("r_id is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("r_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(String value) {
            addCriterion("r_id =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(String value) {
            addCriterion("r_id <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(String value) {
            addCriterion("r_id >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(String value) {
            addCriterion("r_id >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(String value) {
            addCriterion("r_id <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(String value) {
            addCriterion("r_id <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLike(String value) {
            addCriterion("r_id like", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotLike(String value) {
            addCriterion("r_id not like", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<String> values) {
            addCriterion("r_id in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<String> values) {
            addCriterion("r_id not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(String value1, String value2) {
            addCriterion("r_id between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(String value1, String value2) {
            addCriterion("r_id not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRUIdIsNull() {
            addCriterion("r_u_id is null");
            return (Criteria) this;
        }

        public Criteria andRUIdIsNotNull() {
            addCriterion("r_u_id is not null");
            return (Criteria) this;
        }

        public Criteria andRUIdEqualTo(String value) {
            addCriterion("r_u_id =", value, "rUId");
            return (Criteria) this;
        }

        public Criteria andRUIdNotEqualTo(String value) {
            addCriterion("r_u_id <>", value, "rUId");
            return (Criteria) this;
        }

        public Criteria andRUIdGreaterThan(String value) {
            addCriterion("r_u_id >", value, "rUId");
            return (Criteria) this;
        }

        public Criteria andRUIdGreaterThanOrEqualTo(String value) {
            addCriterion("r_u_id >=", value, "rUId");
            return (Criteria) this;
        }

        public Criteria andRUIdLessThan(String value) {
            addCriterion("r_u_id <", value, "rUId");
            return (Criteria) this;
        }

        public Criteria andRUIdLessThanOrEqualTo(String value) {
            addCriterion("r_u_id <=", value, "rUId");
            return (Criteria) this;
        }

        public Criteria andRUIdLike(String value) {
            addCriterion("r_u_id like", value, "rUId");
            return (Criteria) this;
        }

        public Criteria andRUIdNotLike(String value) {
            addCriterion("r_u_id not like", value, "rUId");
            return (Criteria) this;
        }

        public Criteria andRUIdIn(List<String> values) {
            addCriterion("r_u_id in", values, "rUId");
            return (Criteria) this;
        }

        public Criteria andRUIdNotIn(List<String> values) {
            addCriterion("r_u_id not in", values, "rUId");
            return (Criteria) this;
        }

        public Criteria andRUIdBetween(String value1, String value2) {
            addCriterion("r_u_id between", value1, value2, "rUId");
            return (Criteria) this;
        }

        public Criteria andRUIdNotBetween(String value1, String value2) {
            addCriterion("r_u_id not between", value1, value2, "rUId");
            return (Criteria) this;
        }

        public Criteria andRIIdIsNull() {
            addCriterion("r_i_id is null");
            return (Criteria) this;
        }

        public Criteria andRIIdIsNotNull() {
            addCriterion("r_i_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIIdEqualTo(String value) {
            addCriterion("r_i_id =", value, "rIId");
            return (Criteria) this;
        }

        public Criteria andRIIdNotEqualTo(String value) {
            addCriterion("r_i_id <>", value, "rIId");
            return (Criteria) this;
        }

        public Criteria andRIIdGreaterThan(String value) {
            addCriterion("r_i_id >", value, "rIId");
            return (Criteria) this;
        }

        public Criteria andRIIdGreaterThanOrEqualTo(String value) {
            addCriterion("r_i_id >=", value, "rIId");
            return (Criteria) this;
        }

        public Criteria andRIIdLessThan(String value) {
            addCriterion("r_i_id <", value, "rIId");
            return (Criteria) this;
        }

        public Criteria andRIIdLessThanOrEqualTo(String value) {
            addCriterion("r_i_id <=", value, "rIId");
            return (Criteria) this;
        }

        public Criteria andRIIdLike(String value) {
            addCriterion("r_i_id like", value, "rIId");
            return (Criteria) this;
        }

        public Criteria andRIIdNotLike(String value) {
            addCriterion("r_i_id not like", value, "rIId");
            return (Criteria) this;
        }

        public Criteria andRIIdIn(List<String> values) {
            addCriterion("r_i_id in", values, "rIId");
            return (Criteria) this;
        }

        public Criteria andRIIdNotIn(List<String> values) {
            addCriterion("r_i_id not in", values, "rIId");
            return (Criteria) this;
        }

        public Criteria andRIIdBetween(String value1, String value2) {
            addCriterion("r_i_id between", value1, value2, "rIId");
            return (Criteria) this;
        }

        public Criteria andRIIdNotBetween(String value1, String value2) {
            addCriterion("r_i_id not between", value1, value2, "rIId");
            return (Criteria) this;
        }

        public Criteria andRAIdIsNull() {
            addCriterion("r_a_id is null");
            return (Criteria) this;
        }

        public Criteria andRAIdIsNotNull() {
            addCriterion("r_a_id is not null");
            return (Criteria) this;
        }

        public Criteria andRAIdEqualTo(String value) {
            addCriterion("r_a_id =", value, "rAId");
            return (Criteria) this;
        }

        public Criteria andRAIdNotEqualTo(String value) {
            addCriterion("r_a_id <>", value, "rAId");
            return (Criteria) this;
        }

        public Criteria andRAIdGreaterThan(String value) {
            addCriterion("r_a_id >", value, "rAId");
            return (Criteria) this;
        }

        public Criteria andRAIdGreaterThanOrEqualTo(String value) {
            addCriterion("r_a_id >=", value, "rAId");
            return (Criteria) this;
        }

        public Criteria andRAIdLessThan(String value) {
            addCriterion("r_a_id <", value, "rAId");
            return (Criteria) this;
        }

        public Criteria andRAIdLessThanOrEqualTo(String value) {
            addCriterion("r_a_id <=", value, "rAId");
            return (Criteria) this;
        }

        public Criteria andRAIdLike(String value) {
            addCriterion("r_a_id like", value, "rAId");
            return (Criteria) this;
        }

        public Criteria andRAIdNotLike(String value) {
            addCriterion("r_a_id not like", value, "rAId");
            return (Criteria) this;
        }

        public Criteria andRAIdIn(List<String> values) {
            addCriterion("r_a_id in", values, "rAId");
            return (Criteria) this;
        }

        public Criteria andRAIdNotIn(List<String> values) {
            addCriterion("r_a_id not in", values, "rAId");
            return (Criteria) this;
        }

        public Criteria andRAIdBetween(String value1, String value2) {
            addCriterion("r_a_id between", value1, value2, "rAId");
            return (Criteria) this;
        }

        public Criteria andRAIdNotBetween(String value1, String value2) {
            addCriterion("r_a_id not between", value1, value2, "rAId");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeIsNull() {
            addCriterion("r_create_time is null");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeIsNotNull() {
            addCriterion("r_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeEqualTo(Integer value) {
            addCriterion("r_create_time =", value, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeNotEqualTo(Integer value) {
            addCriterion("r_create_time <>", value, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeGreaterThan(Integer value) {
            addCriterion("r_create_time >", value, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_create_time >=", value, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeLessThan(Integer value) {
            addCriterion("r_create_time <", value, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("r_create_time <=", value, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeIn(List<Integer> values) {
            addCriterion("r_create_time in", values, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeNotIn(List<Integer> values) {
            addCriterion("r_create_time not in", values, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("r_create_time between", value1, value2, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("r_create_time not between", value1, value2, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRBackupIsNull() {
            addCriterion("r_backup is null");
            return (Criteria) this;
        }

        public Criteria andRBackupIsNotNull() {
            addCriterion("r_backup is not null");
            return (Criteria) this;
        }

        public Criteria andRBackupEqualTo(String value) {
            addCriterion("r_backup =", value, "rBackup");
            return (Criteria) this;
        }

        public Criteria andRBackupNotEqualTo(String value) {
            addCriterion("r_backup <>", value, "rBackup");
            return (Criteria) this;
        }

        public Criteria andRBackupGreaterThan(String value) {
            addCriterion("r_backup >", value, "rBackup");
            return (Criteria) this;
        }

        public Criteria andRBackupGreaterThanOrEqualTo(String value) {
            addCriterion("r_backup >=", value, "rBackup");
            return (Criteria) this;
        }

        public Criteria andRBackupLessThan(String value) {
            addCriterion("r_backup <", value, "rBackup");
            return (Criteria) this;
        }

        public Criteria andRBackupLessThanOrEqualTo(String value) {
            addCriterion("r_backup <=", value, "rBackup");
            return (Criteria) this;
        }

        public Criteria andRBackupLike(String value) {
            addCriterion("r_backup like", value, "rBackup");
            return (Criteria) this;
        }

        public Criteria andRBackupNotLike(String value) {
            addCriterion("r_backup not like", value, "rBackup");
            return (Criteria) this;
        }

        public Criteria andRBackupIn(List<String> values) {
            addCriterion("r_backup in", values, "rBackup");
            return (Criteria) this;
        }

        public Criteria andRBackupNotIn(List<String> values) {
            addCriterion("r_backup not in", values, "rBackup");
            return (Criteria) this;
        }

        public Criteria andRBackupBetween(String value1, String value2) {
            addCriterion("r_backup between", value1, value2, "rBackup");
            return (Criteria) this;
        }

        public Criteria andRBackupNotBetween(String value1, String value2) {
            addCriterion("r_backup not between", value1, value2, "rBackup");
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