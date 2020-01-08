package com.example.logistics.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
*  @Description
* */
public class SyEmpExample implements Serializable {

    private static final long serialVersionUID = 6306247930583823425L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyEmpExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNull() {
            addCriterion("EmpName is null");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNotNull() {
            addCriterion("EmpName is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnameEqualTo(String value) {
            addCriterion("EmpName =", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotEqualTo(String value) {
            addCriterion("EmpName <>", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThan(String value) {
            addCriterion("EmpName >", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThanOrEqualTo(String value) {
            addCriterion("EmpName >=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThan(String value) {
            addCriterion("EmpName <", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThanOrEqualTo(String value) {
            addCriterion("EmpName <=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLike(String value) {
            addCriterion("EmpName like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotLike(String value) {
            addCriterion("EmpName not like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameIn(List<String> values) {
            addCriterion("EmpName in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotIn(List<String> values) {
            addCriterion("EmpName not in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameBetween(String value1, String value2) {
            addCriterion("EmpName between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotBetween(String value1, String value2) {
            addCriterion("EmpName not between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnoIsNull() {
            addCriterion("EmpNo is null");
            return (Criteria) this;
        }

        public Criteria andEmpnoIsNotNull() {
            addCriterion("EmpNo is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnoEqualTo(String value) {
            addCriterion("EmpNo =", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotEqualTo(String value) {
            addCriterion("EmpNo <>", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoGreaterThan(String value) {
            addCriterion("EmpNo >", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoGreaterThanOrEqualTo(String value) {
            addCriterion("EmpNo >=", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLessThan(String value) {
            addCriterion("EmpNo <", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLessThanOrEqualTo(String value) {
            addCriterion("EmpNo <=", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLike(String value) {
            addCriterion("EmpNo like", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotLike(String value) {
            addCriterion("EmpNo not like", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoIn(List<String> values) {
            addCriterion("EmpNo in", values, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotIn(List<String> values) {
            addCriterion("EmpNo not in", values, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoBetween(String value1, String value2) {
            addCriterion("EmpNo between", value1, value2, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotBetween(String value1, String value2) {
            addCriterion("EmpNo not between", value1, value2, "empno");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("Pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("Pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("Pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("Pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("Pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("Pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("Pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("Pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("Pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("Pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("Pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("Pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("Pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("Pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andQuerypwdIsNull() {
            addCriterion("QueryPwd is null");
            return (Criteria) this;
        }

        public Criteria andQuerypwdIsNotNull() {
            addCriterion("QueryPwd is not null");
            return (Criteria) this;
        }

        public Criteria andQuerypwdEqualTo(String value) {
            addCriterion("QueryPwd =", value, "querypwd");
            return (Criteria) this;
        }

        public Criteria andQuerypwdNotEqualTo(String value) {
            addCriterion("QueryPwd <>", value, "querypwd");
            return (Criteria) this;
        }

        public Criteria andQuerypwdGreaterThan(String value) {
            addCriterion("QueryPwd >", value, "querypwd");
            return (Criteria) this;
        }

        public Criteria andQuerypwdGreaterThanOrEqualTo(String value) {
            addCriterion("QueryPwd >=", value, "querypwd");
            return (Criteria) this;
        }

        public Criteria andQuerypwdLessThan(String value) {
            addCriterion("QueryPwd <", value, "querypwd");
            return (Criteria) this;
        }

        public Criteria andQuerypwdLessThanOrEqualTo(String value) {
            addCriterion("QueryPwd <=", value, "querypwd");
            return (Criteria) this;
        }

        public Criteria andQuerypwdLike(String value) {
            addCriterion("QueryPwd like", value, "querypwd");
            return (Criteria) this;
        }

        public Criteria andQuerypwdNotLike(String value) {
            addCriterion("QueryPwd not like", value, "querypwd");
            return (Criteria) this;
        }

        public Criteria andQuerypwdIn(List<String> values) {
            addCriterion("QueryPwd in", values, "querypwd");
            return (Criteria) this;
        }

        public Criteria andQuerypwdNotIn(List<String> values) {
            addCriterion("QueryPwd not in", values, "querypwd");
            return (Criteria) this;
        }

        public Criteria andQuerypwdBetween(String value1, String value2) {
            addCriterion("QueryPwd between", value1, value2, "querypwd");
            return (Criteria) this;
        }

        public Criteria andQuerypwdNotBetween(String value1, String value2) {
            addCriterion("QueryPwd not between", value1, value2, "querypwd");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("RoleID is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("RoleID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("RoleID =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("RoleID <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("RoleID >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RoleID >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("RoleID <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("RoleID <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("RoleID in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("RoleID not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("RoleID between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("RoleID not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andEmpunitIsNull() {
            addCriterion("EmpUnit is null");
            return (Criteria) this;
        }

        public Criteria andEmpunitIsNotNull() {
            addCriterion("EmpUnit is not null");
            return (Criteria) this;
        }

        public Criteria andEmpunitEqualTo(Integer value) {
            addCriterion("EmpUnit =", value, "empunit");
            return (Criteria) this;
        }

        public Criteria andEmpunitNotEqualTo(Integer value) {
            addCriterion("EmpUnit <>", value, "empunit");
            return (Criteria) this;
        }

        public Criteria andEmpunitGreaterThan(Integer value) {
            addCriterion("EmpUnit >", value, "empunit");
            return (Criteria) this;
        }

        public Criteria andEmpunitGreaterThanOrEqualTo(Integer value) {
            addCriterion("EmpUnit >=", value, "empunit");
            return (Criteria) this;
        }

        public Criteria andEmpunitLessThan(Integer value) {
            addCriterion("EmpUnit <", value, "empunit");
            return (Criteria) this;
        }

        public Criteria andEmpunitLessThanOrEqualTo(Integer value) {
            addCriterion("EmpUnit <=", value, "empunit");
            return (Criteria) this;
        }

        public Criteria andEmpunitIn(List<Integer> values) {
            addCriterion("EmpUnit in", values, "empunit");
            return (Criteria) this;
        }

        public Criteria andEmpunitNotIn(List<Integer> values) {
            addCriterion("EmpUnit not in", values, "empunit");
            return (Criteria) this;
        }

        public Criteria andEmpunitBetween(Integer value1, Integer value2) {
            addCriterion("EmpUnit between", value1, value2, "empunit");
            return (Criteria) this;
        }

        public Criteria andEmpunitNotBetween(Integer value1, Integer value2) {
            addCriterion("EmpUnit not between", value1, value2, "empunit");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDisabledIsNull() {
            addCriterion("Disabled is null");
            return (Criteria) this;
        }

        public Criteria andDisabledIsNotNull() {
            addCriterion("Disabled is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledEqualTo(Boolean value) {
            addCriterion("Disabled =", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotEqualTo(Boolean value) {
            addCriterion("Disabled <>", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledGreaterThan(Boolean value) {
            addCriterion("Disabled >", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Disabled >=", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLessThan(Boolean value) {
            addCriterion("Disabled <", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLessThanOrEqualTo(Boolean value) {
            addCriterion("Disabled <=", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledIn(List<Boolean> values) {
            addCriterion("Disabled in", values, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotIn(List<Boolean> values) {
            addCriterion("Disabled not in", values, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledBetween(Boolean value1, Boolean value2) {
            addCriterion("Disabled between", value1, value2, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Disabled not between", value1, value2, "disabled");
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