package com.yum.itsm.ddtalk.busi.entity;

import java.util.ArrayList;
import java.util.List;

public class DiningRoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiningRoomExample() {
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

        public Criteria andDiningRoomIdIsNull() {
            addCriterion("dining_room_id is null");
            return (Criteria) this;
        }

        public Criteria andDiningRoomIdIsNotNull() {
            addCriterion("dining_room_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiningRoomIdEqualTo(Long value) {
            addCriterion("dining_room_id =", value, "diningRoomId");
            return (Criteria) this;
        }

        public Criteria andDiningRoomIdNotEqualTo(Long value) {
            addCriterion("dining_room_id <>", value, "diningRoomId");
            return (Criteria) this;
        }

        public Criteria andDiningRoomIdGreaterThan(Long value) {
            addCriterion("dining_room_id >", value, "diningRoomId");
            return (Criteria) this;
        }

        public Criteria andDiningRoomIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dining_room_id >=", value, "diningRoomId");
            return (Criteria) this;
        }

        public Criteria andDiningRoomIdLessThan(Long value) {
            addCriterion("dining_room_id <", value, "diningRoomId");
            return (Criteria) this;
        }

        public Criteria andDiningRoomIdLessThanOrEqualTo(Long value) {
            addCriterion("dining_room_id <=", value, "diningRoomId");
            return (Criteria) this;
        }

        public Criteria andDiningRoomIdIn(List<Long> values) {
            addCriterion("dining_room_id in", values, "diningRoomId");
            return (Criteria) this;
        }

        public Criteria andDiningRoomIdNotIn(List<Long> values) {
            addCriterion("dining_room_id not in", values, "diningRoomId");
            return (Criteria) this;
        }

        public Criteria andDiningRoomIdBetween(Long value1, Long value2) {
            addCriterion("dining_room_id between", value1, value2, "diningRoomId");
            return (Criteria) this;
        }

        public Criteria andDiningRoomIdNotBetween(Long value1, Long value2) {
            addCriterion("dining_room_id not between", value1, value2, "diningRoomId");
            return (Criteria) this;
        }

        public Criteria andDiningRoomNameIsNull() {
            addCriterion("dining_room_name is null");
            return (Criteria) this;
        }

        public Criteria andDiningRoomNameIsNotNull() {
            addCriterion("dining_room_name is not null");
            return (Criteria) this;
        }

        public Criteria andDiningRoomNameEqualTo(String value) {
            addCriterion("dining_room_name =", value, "diningRoomName");
            return (Criteria) this;
        }

        public Criteria andDiningRoomNameNotEqualTo(String value) {
            addCriterion("dining_room_name <>", value, "diningRoomName");
            return (Criteria) this;
        }

        public Criteria andDiningRoomNameGreaterThan(String value) {
            addCriterion("dining_room_name >", value, "diningRoomName");
            return (Criteria) this;
        }

        public Criteria andDiningRoomNameGreaterThanOrEqualTo(String value) {
            addCriterion("dining_room_name >=", value, "diningRoomName");
            return (Criteria) this;
        }

        public Criteria andDiningRoomNameLessThan(String value) {
            addCriterion("dining_room_name <", value, "diningRoomName");
            return (Criteria) this;
        }

        public Criteria andDiningRoomNameLessThanOrEqualTo(String value) {
            addCriterion("dining_room_name <=", value, "diningRoomName");
            return (Criteria) this;
        }

        public Criteria andDiningRoomNameLike(String value) {
            addCriterion("dining_room_name like", value, "diningRoomName");
            return (Criteria) this;
        }

        public Criteria andDiningRoomNameNotLike(String value) {
            addCriterion("dining_room_name not like", value, "diningRoomName");
            return (Criteria) this;
        }

        public Criteria andDiningRoomNameIn(List<String> values) {
            addCriterion("dining_room_name in", values, "diningRoomName");
            return (Criteria) this;
        }

        public Criteria andDiningRoomNameNotIn(List<String> values) {
            addCriterion("dining_room_name not in", values, "diningRoomName");
            return (Criteria) this;
        }

        public Criteria andDiningRoomNameBetween(String value1, String value2) {
            addCriterion("dining_room_name between", value1, value2, "diningRoomName");
            return (Criteria) this;
        }

        public Criteria andDiningRoomNameNotBetween(String value1, String value2) {
            addCriterion("dining_room_name not between", value1, value2, "diningRoomName");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNull() {
            addCriterion("district_id is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNotNull() {
            addCriterion("district_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdEqualTo(Long value) {
            addCriterion("district_id =", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotEqualTo(Long value) {
            addCriterion("district_id <>", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThan(Long value) {
            addCriterion("district_id >", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThanOrEqualTo(Long value) {
            addCriterion("district_id >=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThan(Long value) {
            addCriterion("district_id <", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThanOrEqualTo(Long value) {
            addCriterion("district_id <=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIn(List<Long> values) {
            addCriterion("district_id in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotIn(List<Long> values) {
            addCriterion("district_id not in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdBetween(Long value1, Long value2) {
            addCriterion("district_id between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotBetween(Long value1, Long value2) {
            addCriterion("district_id not between", value1, value2, "districtId");
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