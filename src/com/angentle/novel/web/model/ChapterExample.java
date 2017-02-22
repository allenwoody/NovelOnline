package com.angentle.novel.web.model;

import java.util.ArrayList;
import java.util.List;

public class ChapterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChapterExample() {
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

        public Criteria andChapterIdIsNull() {
            addCriterion("chapter_id is null");
            return (Criteria) this;
        }

        public Criteria andChapterIdIsNotNull() {
            addCriterion("chapter_id is not null");
            return (Criteria) this;
        }

        public Criteria andChapterIdEqualTo(String value) {
            addCriterion("chapter_id =", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotEqualTo(String value) {
            addCriterion("chapter_id <>", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdGreaterThan(String value) {
            addCriterion("chapter_id >", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdGreaterThanOrEqualTo(String value) {
            addCriterion("chapter_id >=", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdLessThan(String value) {
            addCriterion("chapter_id <", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdLessThanOrEqualTo(String value) {
            addCriterion("chapter_id <=", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdLike(String value) {
            addCriterion("chapter_id like", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotLike(String value) {
            addCriterion("chapter_id not like", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdIn(List<String> values) {
            addCriterion("chapter_id in", values, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotIn(List<String> values) {
            addCriterion("chapter_id not in", values, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdBetween(String value1, String value2) {
            addCriterion("chapter_id between", value1, value2, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotBetween(String value1, String value2) {
            addCriterion("chapter_id not between", value1, value2, "chapterId");
            return (Criteria) this;
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

        public Criteria andChapterNameIsNull() {
            addCriterion("chapter_name is null");
            return (Criteria) this;
        }

        public Criteria andChapterNameIsNotNull() {
            addCriterion("chapter_name is not null");
            return (Criteria) this;
        }

        public Criteria andChapterNameEqualTo(String value) {
            addCriterion("chapter_name =", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotEqualTo(String value) {
            addCriterion("chapter_name <>", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameGreaterThan(String value) {
            addCriterion("chapter_name >", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameGreaterThanOrEqualTo(String value) {
            addCriterion("chapter_name >=", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLessThan(String value) {
            addCriterion("chapter_name <", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLessThanOrEqualTo(String value) {
            addCriterion("chapter_name <=", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLike(String value) {
            addCriterion("chapter_name like", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotLike(String value) {
            addCriterion("chapter_name not like", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameIn(List<String> values) {
            addCriterion("chapter_name in", values, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotIn(List<String> values) {
            addCriterion("chapter_name not in", values, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameBetween(String value1, String value2) {
            addCriterion("chapter_name between", value1, value2, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotBetween(String value1, String value2) {
            addCriterion("chapter_name not between", value1, value2, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterVolumnIsNull() {
            addCriterion("chapter_volumn is null");
            return (Criteria) this;
        }

        public Criteria andChapterVolumnIsNotNull() {
            addCriterion("chapter_volumn is not null");
            return (Criteria) this;
        }

        public Criteria andChapterVolumnEqualTo(Integer value) {
            addCriterion("chapter_volumn =", value, "chapterVolumn");
            return (Criteria) this;
        }

        public Criteria andChapterVolumnNotEqualTo(Integer value) {
            addCriterion("chapter_volumn <>", value, "chapterVolumn");
            return (Criteria) this;
        }

        public Criteria andChapterVolumnGreaterThan(Integer value) {
            addCriterion("chapter_volumn >", value, "chapterVolumn");
            return (Criteria) this;
        }

        public Criteria andChapterVolumnGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapter_volumn >=", value, "chapterVolumn");
            return (Criteria) this;
        }

        public Criteria andChapterVolumnLessThan(Integer value) {
            addCriterion("chapter_volumn <", value, "chapterVolumn");
            return (Criteria) this;
        }

        public Criteria andChapterVolumnLessThanOrEqualTo(Integer value) {
            addCriterion("chapter_volumn <=", value, "chapterVolumn");
            return (Criteria) this;
        }

        public Criteria andChapterVolumnIn(List<Integer> values) {
            addCriterion("chapter_volumn in", values, "chapterVolumn");
            return (Criteria) this;
        }

        public Criteria andChapterVolumnNotIn(List<Integer> values) {
            addCriterion("chapter_volumn not in", values, "chapterVolumn");
            return (Criteria) this;
        }

        public Criteria andChapterVolumnBetween(Integer value1, Integer value2) {
            addCriterion("chapter_volumn between", value1, value2, "chapterVolumn");
            return (Criteria) this;
        }

        public Criteria andChapterVolumnNotBetween(Integer value1, Integer value2) {
            addCriterion("chapter_volumn not between", value1, value2, "chapterVolumn");
            return (Criteria) this;
        }

        public Criteria andChapterNoIsNull() {
            addCriterion("chapter_no is null");
            return (Criteria) this;
        }

        public Criteria andChapterNoIsNotNull() {
            addCriterion("chapter_no is not null");
            return (Criteria) this;
        }

        public Criteria andChapterNoEqualTo(Integer value) {
            addCriterion("chapter_no =", value, "chapterNo");
            return (Criteria) this;
        }

        public Criteria andChapterNoNotEqualTo(Integer value) {
            addCriterion("chapter_no <>", value, "chapterNo");
            return (Criteria) this;
        }

        public Criteria andChapterNoGreaterThan(Integer value) {
            addCriterion("chapter_no >", value, "chapterNo");
            return (Criteria) this;
        }

        public Criteria andChapterNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapter_no >=", value, "chapterNo");
            return (Criteria) this;
        }

        public Criteria andChapterNoLessThan(Integer value) {
            addCriterion("chapter_no <", value, "chapterNo");
            return (Criteria) this;
        }

        public Criteria andChapterNoLessThanOrEqualTo(Integer value) {
            addCriterion("chapter_no <=", value, "chapterNo");
            return (Criteria) this;
        }

        public Criteria andChapterNoIn(List<Integer> values) {
            addCriterion("chapter_no in", values, "chapterNo");
            return (Criteria) this;
        }

        public Criteria andChapterNoNotIn(List<Integer> values) {
            addCriterion("chapter_no not in", values, "chapterNo");
            return (Criteria) this;
        }

        public Criteria andChapterNoBetween(Integer value1, Integer value2) {
            addCriterion("chapter_no between", value1, value2, "chapterNo");
            return (Criteria) this;
        }

        public Criteria andChapterNoNotBetween(Integer value1, Integer value2) {
            addCriterion("chapter_no not between", value1, value2, "chapterNo");
            return (Criteria) this;
        }

        public Criteria andChapterTypeIsNull() {
            addCriterion("chapter_type is null");
            return (Criteria) this;
        }

        public Criteria andChapterTypeIsNotNull() {
            addCriterion("chapter_type is not null");
            return (Criteria) this;
        }

        public Criteria andChapterTypeEqualTo(String value) {
            addCriterion("chapter_type =", value, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeNotEqualTo(String value) {
            addCriterion("chapter_type <>", value, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeGreaterThan(String value) {
            addCriterion("chapter_type >", value, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("chapter_type >=", value, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeLessThan(String value) {
            addCriterion("chapter_type <", value, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeLessThanOrEqualTo(String value) {
            addCriterion("chapter_type <=", value, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeLike(String value) {
            addCriterion("chapter_type like", value, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeNotLike(String value) {
            addCriterion("chapter_type not like", value, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeIn(List<String> values) {
            addCriterion("chapter_type in", values, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeNotIn(List<String> values) {
            addCriterion("chapter_type not in", values, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeBetween(String value1, String value2) {
            addCriterion("chapter_type between", value1, value2, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeNotBetween(String value1, String value2) {
            addCriterion("chapter_type not between", value1, value2, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterStatusIsNull() {
            addCriterion("chapter_status is null");
            return (Criteria) this;
        }

        public Criteria andChapterStatusIsNotNull() {
            addCriterion("chapter_status is not null");
            return (Criteria) this;
        }

        public Criteria andChapterStatusEqualTo(String value) {
            addCriterion("chapter_status =", value, "chapterStatus");
            return (Criteria) this;
        }

        public Criteria andChapterStatusNotEqualTo(String value) {
            addCriterion("chapter_status <>", value, "chapterStatus");
            return (Criteria) this;
        }

        public Criteria andChapterStatusGreaterThan(String value) {
            addCriterion("chapter_status >", value, "chapterStatus");
            return (Criteria) this;
        }

        public Criteria andChapterStatusGreaterThanOrEqualTo(String value) {
            addCriterion("chapter_status >=", value, "chapterStatus");
            return (Criteria) this;
        }

        public Criteria andChapterStatusLessThan(String value) {
            addCriterion("chapter_status <", value, "chapterStatus");
            return (Criteria) this;
        }

        public Criteria andChapterStatusLessThanOrEqualTo(String value) {
            addCriterion("chapter_status <=", value, "chapterStatus");
            return (Criteria) this;
        }

        public Criteria andChapterStatusLike(String value) {
            addCriterion("chapter_status like", value, "chapterStatus");
            return (Criteria) this;
        }

        public Criteria andChapterStatusNotLike(String value) {
            addCriterion("chapter_status not like", value, "chapterStatus");
            return (Criteria) this;
        }

        public Criteria andChapterStatusIn(List<String> values) {
            addCriterion("chapter_status in", values, "chapterStatus");
            return (Criteria) this;
        }

        public Criteria andChapterStatusNotIn(List<String> values) {
            addCriterion("chapter_status not in", values, "chapterStatus");
            return (Criteria) this;
        }

        public Criteria andChapterStatusBetween(String value1, String value2) {
            addCriterion("chapter_status between", value1, value2, "chapterStatus");
            return (Criteria) this;
        }

        public Criteria andChapterStatusNotBetween(String value1, String value2) {
            addCriterion("chapter_status not between", value1, value2, "chapterStatus");
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