package com.angentle.novel.web.model;

public class Author {
    private String authorId;

    private String authorName;

    private String authorRealname;

    private String honor;

    private Integer level;

    private String idNumber;

    private String sex;

    private String mobile;

    private String mobileZoneCode;

    private String email;

    private String address;

    private String userId;

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId == null ? null : authorId.trim();
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public String getAuthorRealname() {
        return authorRealname;
    }

    public void setAuthorRealname(String authorRealname) {
        this.authorRealname = authorRealname == null ? null : authorRealname.trim();
    }

    public String getHonor() {
        return honor;
    }

    public void setHonor(String honor) {
        this.honor = honor == null ? null : honor.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getMobileZoneCode() {
        return mobileZoneCode;
    }

    public void setMobileZoneCode(String mobileZoneCode) {
        this.mobileZoneCode = mobileZoneCode == null ? null : mobileZoneCode.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}