package com.angentle.novel.web.model;

public class ChapterWithBLOBs extends Chapter {
    private String chapterContent;

    private String authorSpeak;

    public String getChapterContent() {
        return chapterContent;
    }

    public void setChapterContent(String chapterContent) {
        this.chapterContent = chapterContent == null ? null : chapterContent.trim();
    }

    public String getAuthorSpeak() {
        return authorSpeak;
    }

    public void setAuthorSpeak(String authorSpeak) {
        this.authorSpeak = authorSpeak == null ? null : authorSpeak.trim();
    }
}