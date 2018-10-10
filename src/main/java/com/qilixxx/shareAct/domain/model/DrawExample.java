package com.qilixxx.shareAct.domain.model;

import java.util.ArrayList;
import java.util.List;

public class DrawExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrawExample() {
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

        public Criteria andDIdIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(String value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(String value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(String value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(String value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(String value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(String value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLike(String value) {
            addCriterion("d_id like", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotLike(String value) {
            addCriterion("d_id not like", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<String> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<String> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(String value1, String value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(String value1, String value2) {
            addCriterion("d_id not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDUIdIsNull() {
            addCriterion("d_u_id is null");
            return (Criteria) this;
        }

        public Criteria andDUIdIsNotNull() {
            addCriterion("d_u_id is not null");
            return (Criteria) this;
        }

        public Criteria andDUIdEqualTo(String value) {
            addCriterion("d_u_id =", value, "dUId");
            return (Criteria) this;
        }

        public Criteria andDUIdNotEqualTo(String value) {
            addCriterion("d_u_id <>", value, "dUId");
            return (Criteria) this;
        }

        public Criteria andDUIdGreaterThan(String value) {
            addCriterion("d_u_id >", value, "dUId");
            return (Criteria) this;
        }

        public Criteria andDUIdGreaterThanOrEqualTo(String value) {
            addCriterion("d_u_id >=", value, "dUId");
            return (Criteria) this;
        }

        public Criteria andDUIdLessThan(String value) {
            addCriterion("d_u_id <", value, "dUId");
            return (Criteria) this;
        }

        public Criteria andDUIdLessThanOrEqualTo(String value) {
            addCriterion("d_u_id <=", value, "dUId");
            return (Criteria) this;
        }

        public Criteria andDUIdLike(String value) {
            addCriterion("d_u_id like", value, "dUId");
            return (Criteria) this;
        }

        public Criteria andDUIdNotLike(String value) {
            addCriterion("d_u_id not like", value, "dUId");
            return (Criteria) this;
        }

        public Criteria andDUIdIn(List<String> values) {
            addCriterion("d_u_id in", values, "dUId");
            return (Criteria) this;
        }

        public Criteria andDUIdNotIn(List<String> values) {
            addCriterion("d_u_id not in", values, "dUId");
            return (Criteria) this;
        }

        public Criteria andDUIdBetween(String value1, String value2) {
            addCriterion("d_u_id between", value1, value2, "dUId");
            return (Criteria) this;
        }

        public Criteria andDUIdNotBetween(String value1, String value2) {
            addCriterion("d_u_id not between", value1, value2, "dUId");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeIsNull() {
            addCriterion("d_create_time is null");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeIsNotNull() {
            addCriterion("d_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeEqualTo(Integer value) {
            addCriterion("d_create_time =", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeNotEqualTo(Integer value) {
            addCriterion("d_create_time <>", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeGreaterThan(Integer value) {
            addCriterion("d_create_time >", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_create_time >=", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeLessThan(Integer value) {
            addCriterion("d_create_time <", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("d_create_time <=", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeIn(List<Integer> values) {
            addCriterion("d_create_time in", values, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeNotIn(List<Integer> values) {
            addCriterion("d_create_time not in", values, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("d_create_time between", value1, value2, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("d_create_time not between", value1, value2, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeIsNull() {
            addCriterion("d_update_time is null");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeIsNotNull() {
            addCriterion("d_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeEqualTo(Integer value) {
            addCriterion("d_update_time =", value, "dUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeNotEqualTo(Integer value) {
            addCriterion("d_update_time <>", value, "dUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeGreaterThan(Integer value) {
            addCriterion("d_update_time >", value, "dUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_update_time >=", value, "dUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeLessThan(Integer value) {
            addCriterion("d_update_time <", value, "dUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("d_update_time <=", value, "dUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeIn(List<Integer> values) {
            addCriterion("d_update_time in", values, "dUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeNotIn(List<Integer> values) {
            addCriterion("d_update_time not in", values, "dUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeBetween(Integer value1, Integer value2) {
            addCriterion("d_update_time between", value1, value2, "dUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("d_update_time not between", value1, value2, "dUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDHadDrawIsNull() {
            addCriterion("d_had_draw is null");
            return (Criteria) this;
        }

        public Criteria andDHadDrawIsNotNull() {
            addCriterion("d_had_draw is not null");
            return (Criteria) this;
        }

        public Criteria andDHadDrawEqualTo(Integer value) {
            addCriterion("d_had_draw =", value, "dHadDraw");
            return (Criteria) this;
        }

        public Criteria andDHadDrawNotEqualTo(Integer value) {
            addCriterion("d_had_draw <>", value, "dHadDraw");
            return (Criteria) this;
        }

        public Criteria andDHadDrawGreaterThan(Integer value) {
            addCriterion("d_had_draw >", value, "dHadDraw");
            return (Criteria) this;
        }

        public Criteria andDHadDrawGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_had_draw >=", value, "dHadDraw");
            return (Criteria) this;
        }

        public Criteria andDHadDrawLessThan(Integer value) {
            addCriterion("d_had_draw <", value, "dHadDraw");
            return (Criteria) this;
        }

        public Criteria andDHadDrawLessThanOrEqualTo(Integer value) {
            addCriterion("d_had_draw <=", value, "dHadDraw");
            return (Criteria) this;
        }

        public Criteria andDHadDrawIn(List<Integer> values) {
            addCriterion("d_had_draw in", values, "dHadDraw");
            return (Criteria) this;
        }

        public Criteria andDHadDrawNotIn(List<Integer> values) {
            addCriterion("d_had_draw not in", values, "dHadDraw");
            return (Criteria) this;
        }

        public Criteria andDHadDrawBetween(Integer value1, Integer value2) {
            addCriterion("d_had_draw between", value1, value2, "dHadDraw");
            return (Criteria) this;
        }

        public Criteria andDHadDrawNotBetween(Integer value1, Integer value2) {
            addCriterion("d_had_draw not between", value1, value2, "dHadDraw");
            return (Criteria) this;
        }

        public Criteria andDDrawNumberIsNull() {
            addCriterion("d_draw_number is null");
            return (Criteria) this;
        }

        public Criteria andDDrawNumberIsNotNull() {
            addCriterion("d_draw_number is not null");
            return (Criteria) this;
        }

        public Criteria andDDrawNumberEqualTo(Integer value) {
            addCriterion("d_draw_number =", value, "dDrawNumber");
            return (Criteria) this;
        }

        public Criteria andDDrawNumberNotEqualTo(Integer value) {
            addCriterion("d_draw_number <>", value, "dDrawNumber");
            return (Criteria) this;
        }

        public Criteria andDDrawNumberGreaterThan(Integer value) {
            addCriterion("d_draw_number >", value, "dDrawNumber");
            return (Criteria) this;
        }

        public Criteria andDDrawNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_draw_number >=", value, "dDrawNumber");
            return (Criteria) this;
        }

        public Criteria andDDrawNumberLessThan(Integer value) {
            addCriterion("d_draw_number <", value, "dDrawNumber");
            return (Criteria) this;
        }

        public Criteria andDDrawNumberLessThanOrEqualTo(Integer value) {
            addCriterion("d_draw_number <=", value, "dDrawNumber");
            return (Criteria) this;
        }

        public Criteria andDDrawNumberIn(List<Integer> values) {
            addCriterion("d_draw_number in", values, "dDrawNumber");
            return (Criteria) this;
        }

        public Criteria andDDrawNumberNotIn(List<Integer> values) {
            addCriterion("d_draw_number not in", values, "dDrawNumber");
            return (Criteria) this;
        }

        public Criteria andDDrawNumberBetween(Integer value1, Integer value2) {
            addCriterion("d_draw_number between", value1, value2, "dDrawNumber");
            return (Criteria) this;
        }

        public Criteria andDDrawNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("d_draw_number not between", value1, value2, "dDrawNumber");
            return (Criteria) this;
        }

        public Criteria andDInvitePeopleIsNull() {
            addCriterion("d_invite_people is null");
            return (Criteria) this;
        }

        public Criteria andDInvitePeopleIsNotNull() {
            addCriterion("d_invite_people is not null");
            return (Criteria) this;
        }

        public Criteria andDInvitePeopleEqualTo(Integer value) {
            addCriterion("d_invite_people =", value, "dInvitePeople");
            return (Criteria) this;
        }

        public Criteria andDInvitePeopleNotEqualTo(Integer value) {
            addCriterion("d_invite_people <>", value, "dInvitePeople");
            return (Criteria) this;
        }

        public Criteria andDInvitePeopleGreaterThan(Integer value) {
            addCriterion("d_invite_people >", value, "dInvitePeople");
            return (Criteria) this;
        }

        public Criteria andDInvitePeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_invite_people >=", value, "dInvitePeople");
            return (Criteria) this;
        }

        public Criteria andDInvitePeopleLessThan(Integer value) {
            addCriterion("d_invite_people <", value, "dInvitePeople");
            return (Criteria) this;
        }

        public Criteria andDInvitePeopleLessThanOrEqualTo(Integer value) {
            addCriterion("d_invite_people <=", value, "dInvitePeople");
            return (Criteria) this;
        }

        public Criteria andDInvitePeopleIn(List<Integer> values) {
            addCriterion("d_invite_people in", values, "dInvitePeople");
            return (Criteria) this;
        }

        public Criteria andDInvitePeopleNotIn(List<Integer> values) {
            addCriterion("d_invite_people not in", values, "dInvitePeople");
            return (Criteria) this;
        }

        public Criteria andDInvitePeopleBetween(Integer value1, Integer value2) {
            addCriterion("d_invite_people between", value1, value2, "dInvitePeople");
            return (Criteria) this;
        }

        public Criteria andDInvitePeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("d_invite_people not between", value1, value2, "dInvitePeople");
            return (Criteria) this;
        }

        public Criteria andDPointIsNull() {
            addCriterion("d_point is null");
            return (Criteria) this;
        }

        public Criteria andDPointIsNotNull() {
            addCriterion("d_point is not null");
            return (Criteria) this;
        }

        public Criteria andDPointEqualTo(Integer value) {
            addCriterion("d_point =", value, "dPoint");
            return (Criteria) this;
        }

        public Criteria andDPointNotEqualTo(Integer value) {
            addCriterion("d_point <>", value, "dPoint");
            return (Criteria) this;
        }

        public Criteria andDPointGreaterThan(Integer value) {
            addCriterion("d_point >", value, "dPoint");
            return (Criteria) this;
        }

        public Criteria andDPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_point >=", value, "dPoint");
            return (Criteria) this;
        }

        public Criteria andDPointLessThan(Integer value) {
            addCriterion("d_point <", value, "dPoint");
            return (Criteria) this;
        }

        public Criteria andDPointLessThanOrEqualTo(Integer value) {
            addCriterion("d_point <=", value, "dPoint");
            return (Criteria) this;
        }

        public Criteria andDPointIn(List<Integer> values) {
            addCriterion("d_point in", values, "dPoint");
            return (Criteria) this;
        }

        public Criteria andDPointNotIn(List<Integer> values) {
            addCriterion("d_point not in", values, "dPoint");
            return (Criteria) this;
        }

        public Criteria andDPointBetween(Integer value1, Integer value2) {
            addCriterion("d_point between", value1, value2, "dPoint");
            return (Criteria) this;
        }

        public Criteria andDPointNotBetween(Integer value1, Integer value2) {
            addCriterion("d_point not between", value1, value2, "dPoint");
            return (Criteria) this;
        }

        public Criteria andDBackupIsNull() {
            addCriterion("d_backup is null");
            return (Criteria) this;
        }

        public Criteria andDBackupIsNotNull() {
            addCriterion("d_backup is not null");
            return (Criteria) this;
        }

        public Criteria andDBackupEqualTo(String value) {
            addCriterion("d_backup =", value, "dBackup");
            return (Criteria) this;
        }

        public Criteria andDBackupNotEqualTo(String value) {
            addCriterion("d_backup <>", value, "dBackup");
            return (Criteria) this;
        }

        public Criteria andDBackupGreaterThan(String value) {
            addCriterion("d_backup >", value, "dBackup");
            return (Criteria) this;
        }

        public Criteria andDBackupGreaterThanOrEqualTo(String value) {
            addCriterion("d_backup >=", value, "dBackup");
            return (Criteria) this;
        }

        public Criteria andDBackupLessThan(String value) {
            addCriterion("d_backup <", value, "dBackup");
            return (Criteria) this;
        }

        public Criteria andDBackupLessThanOrEqualTo(String value) {
            addCriterion("d_backup <=", value, "dBackup");
            return (Criteria) this;
        }

        public Criteria andDBackupLike(String value) {
            addCriterion("d_backup like", value, "dBackup");
            return (Criteria) this;
        }

        public Criteria andDBackupNotLike(String value) {
            addCriterion("d_backup not like", value, "dBackup");
            return (Criteria) this;
        }

        public Criteria andDBackupIn(List<String> values) {
            addCriterion("d_backup in", values, "dBackup");
            return (Criteria) this;
        }

        public Criteria andDBackupNotIn(List<String> values) {
            addCriterion("d_backup not in", values, "dBackup");
            return (Criteria) this;
        }

        public Criteria andDBackupBetween(String value1, String value2) {
            addCriterion("d_backup between", value1, value2, "dBackup");
            return (Criteria) this;
        }

        public Criteria andDBackupNotBetween(String value1, String value2) {
            addCriterion("d_backup not between", value1, value2, "dBackup");
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