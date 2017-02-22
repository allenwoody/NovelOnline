package com.angentle.novel.web.model;

import java.util.ArrayList;
import java.util.List;

public class NovelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NovelExample() {
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

        public Criteria andNovelIdIsNull() {
            addCriterion("novel_id is null");
            return (Criteria) this;
        }

        public Criteria andNovelIdIsNotNull() {
            addCriterion("novel_id is not null");
            return (Criteria) this;
        }

        public Criteria andNovelIdEqualTo(String value) {
            addCriterion("novel_id =", value, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdNotEqualTo(String value) {
            addCriterion("novel_id <>", value, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdGreaterThan(String value) {
            addCriterion("novel_id >", value, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdGreaterThanOrEqualTo(String value) {
            addCriterion("novel_id >=", value, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdLessThan(String value) {
            addCriterion("novel_id <", value, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdLessThanOrEqualTo(String value) {
            addCriterion("novel_id <=", value, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdLike(String value) {
            addCriterion("novel_id like", value, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdNotLike(String value) {
            addCriterion("novel_id not like", value, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdIn(List<String> values) {
            addCriterion("novel_id in", values, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdNotIn(List<String> values) {
            addCriterion("novel_id not in", values, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdBetween(String value1, String value2) {
            addCriterion("novel_id between", value1, value2, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdNotBetween(String value1, String value2) {
            addCriterion("novel_id not between", value1, value2, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelNameIsNull() {
            addCriterion("novel_name is null");
            return (Criteria) this;
        }

        public Criteria andNovelNameIsNotNull() {
            addCriterion("novel_name is not null");
            return (Criteria) this;
        }

        public Criteria andNovelNameEqualTo(String value) {
            addCriterion("novel_name =", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameNotEqualTo(String value) {
            addCriterion("novel_name <>", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameGreaterThan(String value) {
            addCriterion("novel_name >", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameGreaterThanOrEqualTo(String value) {
            addCriterion("novel_name >=", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameLessThan(String value) {
            addCriterion("novel_name <", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameLessThanOrEqualTo(String value) {
            addCriterion("novel_name <=", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameLike(String value) {
            addCriterion("novel_name like", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameNotLike(String value) {
            addCriterion("novel_name not like", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameIn(List<String> values) {
            addCriterion("novel_name in", values, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameNotIn(List<String> values) {
            addCriterion("novel_name not in", values, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameBetween(String value1, String value2) {
            addCriterion("novel_name between", value1, value2, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameNotBetween(String value1, String value2) {
            addCriterion("novel_name not between", value1, value2, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelTypeIsNull() {
            addCriterion("novel_type is null");
            return (Criteria) this;
        }

        public Criteria andNovelTypeIsNotNull() {
            addCriterion("novel_type is not null");
            return (Criteria) this;
        }

        public Criteria andNovelTypeEqualTo(String value) {
            addCriterion("novel_type =", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeNotEqualTo(String value) {
            addCriterion("novel_type <>", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeGreaterThan(String value) {
            addCriterion("novel_type >", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("novel_type >=", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeLessThan(String value) {
            addCriterion("novel_type <", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeLessThanOrEqualTo(String value) {
            addCriterion("novel_type <=", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeLike(String value) {
            addCriterion("novel_type like", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeNotLike(String value) {
            addCriterion("novel_type not like", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeIn(List<String> values) {
            addCriterion("novel_type in", values, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeNotIn(List<String> values) {
            addCriterion("novel_type not in", values, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeBetween(String value1, String value2) {
            addCriterion("novel_type between", value1, value2, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeNotBetween(String value1, String value2) {
            addCriterion("novel_type not between", value1, value2, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelStatusIsNull() {
            addCriterion("novel_status is null");
            return (Criteria) this;
        }

        public Criteria andNovelStatusIsNotNull() {
            addCriterion("novel_status is not null");
            return (Criteria) this;
        }

        public Criteria andNovelStatusEqualTo(String value) {
            addCriterion("novel_status =", value, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusNotEqualTo(String value) {
            addCriterion("novel_status <>", value, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusGreaterThan(String value) {
            addCriterion("novel_status >", value, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusGreaterThanOrEqualTo(String value) {
            addCriterion("novel_status >=", value, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusLessThan(String value) {
            addCriterion("novel_status <", value, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusLessThanOrEqualTo(String value) {
            addCriterion("novel_status <=", value, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusLike(String value) {
            addCriterion("novel_status like", value, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusNotLike(String value) {
            addCriterion("novel_status not like", value, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusIn(List<String> values) {
            addCriterion("novel_status in", values, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusNotIn(List<String> values) {
            addCriterion("novel_status not in", values, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusBetween(String value1, String value2) {
            addCriterion("novel_status between", value1, value2, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusNotBetween(String value1, String value2) {
            addCriterion("novel_status not between", value1, value2, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("is_valid is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("is_valid is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(String value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(String value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(String value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(String value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(String value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(String value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLike(String value) {
            addCriterion("is_valid like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotLike(String value) {
            addCriterion("is_valid not like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<String> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<String> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(String value1, String value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(String value1, String value2) {
            addCriterion("is_valid not between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNull() {
            addCriterion("author_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("author_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdEqualTo(String value) {
            addCriterion("author_id =", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotEqualTo(String value) {
            addCriterion("author_id <>", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThan(String value) {
            addCriterion("author_id >", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(String value) {
            addCriterion("author_id >=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThan(String value) {
            addCriterion("author_id <", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(String value) {
            addCriterion("author_id <=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLike(String value) {
            addCriterion("author_id like", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotLike(String value) {
            addCriterion("author_id not like", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIn(List<String> values) {
            addCriterion("author_id in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotIn(List<String> values) {
            addCriterion("author_id not in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdBetween(String value1, String value2) {
            addCriterion("author_id between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotBetween(String value1, String value2) {
            addCriterion("author_id not between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIsNull() {
            addCriterion("author_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIsNotNull() {
            addCriterion("author_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameEqualTo(String value) {
            addCriterion("author_name =", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotEqualTo(String value) {
            addCriterion("author_name <>", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThan(String value) {
            addCriterion("author_name >", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThanOrEqualTo(String value) {
            addCriterion("author_name >=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThan(String value) {
            addCriterion("author_name <", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThanOrEqualTo(String value) {
            addCriterion("author_name <=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLike(String value) {
            addCriterion("author_name like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotLike(String value) {
            addCriterion("author_name not like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIn(List<String> values) {
            addCriterion("author_name in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotIn(List<String> values) {
            addCriterion("author_name not in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameBetween(String value1, String value2) {
            addCriterion("author_name between", value1, value2, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotBetween(String value1, String value2) {
            addCriterion("author_name not between", value1, value2, "authorName");
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