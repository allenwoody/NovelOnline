package com.angentle.novel.web.model;

public class Chapter {
    private String chapterId;

    private String novelId;

    private String chapterName;

    private Integer chapterVolumn;

    private Integer chapterNo;

    private String chapterType;

    private String chapterStatus;

    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId == null ? null : chapterId.trim();
    }

    public String getNovelId() {
        return novelId;
    }

    public void setNovelId(String novelId) {
        this.novelId = novelId == null ? null : novelId.trim();
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName == null ? null : chapterName.trim();
    }

    public Integer getChapterVolumn() {
        return chapterVolumn;
    }

    public void setChapterVolumn(Integer chapterVolumn) {
        this.chapterVolumn = chapterVolumn;
    }

    public Integer getChapterNo() {
        return chapterNo;
    }

    public void setChapterNo(Integer chapterNo) {
        this.chapterNo = chapterNo;
    }

    public String getChapterType() {
        return chapterType;
    }

    public void setChapterType(String chapterType) {
        this.chapterType = chapterType == null ? null : chapterType.trim();
    }

    public String getChapterStatus() {
        return chapterStatus;
    }

    public void setChapterStatus(String chapterStatus) {
        this.chapterStatus = chapterStatus == null ? null : chapterStatus.trim();
    }
}