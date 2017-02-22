package com.angentle.novel.web.model;

public class Novel {
    private String novelId;

    private String novelName;

    private String novelType;

    private String novelStatus;

    private String isValid;

    private String authorId;

    private String authorName;

    public String getNovelId() {
        return novelId;
    }

    public void setNovelId(String novelId) {
        this.novelId = novelId == null ? null : novelId.trim();
    }

    public String getNovelName() {
        return novelName;
    }

    public void setNovelName(String novelName) {
        this.novelName = novelName == null ? null : novelName.trim();
    }

    public String getNovelType() {
        return novelType;
    }

    public void setNovelType(String novelType) {
        this.novelType = novelType == null ? null : novelType.trim();
    }

    public String getNovelStatus() {
        return novelStatus;
    }

    public void setNovelStatus(String novelStatus) {
        this.novelStatus = novelStatus == null ? null : novelStatus.trim();
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }

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
}