
package com.example.satsv.goodplays.lyricmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Lyrics {

    @SerializedName("lyrics_id")
    @Expose
    private int lyricsId;
    @SerializedName("can_edit")
    @Expose
    private int canEdit;
    @SerializedName("locked")
    @Expose
    private int locked;
    @SerializedName("published_status")
    @Expose
    private int publishedStatus;
    @SerializedName("action_requested")
    @Expose
    private String actionRequested;
    @SerializedName("verified")
    @Expose
    private int verified;
    @SerializedName("restricted")
    @Expose
    private int restricted;
    @SerializedName("instrumental")
    @Expose
    private int instrumental;
    @SerializedName("explicit")
    @Expose
    private int explicit;
    @SerializedName("lyrics_body")
    @Expose
    private String lyricsBody;
    @SerializedName("lyrics_language")
    @Expose
    private String lyricsLanguage;
    @SerializedName("lyrics_language_description")
    @Expose
    private String lyricsLanguageDescription;
    @SerializedName("script_tracking_url")
    @Expose
    private String scriptTrackingUrl;
    @SerializedName("pixel_tracking_url")
    @Expose
    private String pixelTrackingUrl;
    @SerializedName("html_tracking_url")
    @Expose
    private String htmlTrackingUrl;
    @SerializedName("lyrics_copyright")
    @Expose
    private String lyricsCopyright;
    @SerializedName("writer_list")
    @Expose
    private List<Object> writerList = null;
    @SerializedName("publisher_list")
    @Expose
    private List<Object> publisherList = null;
    @SerializedName("backlink_url")
    @Expose
    private String backlinkUrl;
    @SerializedName("updated_time")
    @Expose
    private String updatedTime;

    public int getLyricsId() {
        return lyricsId;
    }

    public void setLyricsId(int lyricsId) {
        this.lyricsId = lyricsId;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getLocked() {
        return locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }

    public int getPublishedStatus() {
        return publishedStatus;
    }

    public void setPublishedStatus(int publishedStatus) {
        this.publishedStatus = publishedStatus;
    }

    public String getActionRequested() {
        return actionRequested;
    }

    public void setActionRequested(String actionRequested) {
        this.actionRequested = actionRequested;
    }

    public int getVerified() {
        return verified;
    }

    public void setVerified(int verified) {
        this.verified = verified;
    }

    public int getRestricted() {
        return restricted;
    }

    public void setRestricted(int restricted) {
        this.restricted = restricted;
    }

    public int getInstrumental() {
        return instrumental;
    }

    public void setInstrumental(int instrumental) {
        this.instrumental = instrumental;
    }

    public int getExplicit() {
        return explicit;
    }

    public void setExplicit(int explicit) {
        this.explicit = explicit;
    }

    public String getLyricsBody() {
        return lyricsBody;
    }

    public void setLyricsBody(String lyricsBody) {
        this.lyricsBody = lyricsBody;
    }

    public String getLyricsLanguage() {
        return lyricsLanguage;
    }

    public void setLyricsLanguage(String lyricsLanguage) {
        this.lyricsLanguage = lyricsLanguage;
    }

    public String getLyricsLanguageDescription() {
        return lyricsLanguageDescription;
    }

    public void setLyricsLanguageDescription(String lyricsLanguageDescription) {
        this.lyricsLanguageDescription = lyricsLanguageDescription;
    }

    public String getScriptTrackingUrl() {
        return scriptTrackingUrl;
    }

    public void setScriptTrackingUrl(String scriptTrackingUrl) {
        this.scriptTrackingUrl = scriptTrackingUrl;
    }

    public String getPixelTrackingUrl() {
        return pixelTrackingUrl;
    }

    public void setPixelTrackingUrl(String pixelTrackingUrl) {
        this.pixelTrackingUrl = pixelTrackingUrl;
    }

    public String getHtmlTrackingUrl() {
        return htmlTrackingUrl;
    }

    public void setHtmlTrackingUrl(String htmlTrackingUrl) {
        this.htmlTrackingUrl = htmlTrackingUrl;
    }

    public String getLyricsCopyright() {
        return lyricsCopyright;
    }

    public void setLyricsCopyright(String lyricsCopyright) {
        this.lyricsCopyright = lyricsCopyright;
    }

    public List<Object> getWriterList() {
        return writerList;
    }

    public void setWriterList(List<Object> writerList) {
        this.writerList = writerList;
    }

    public List<Object> getPublisherList() {
        return publisherList;
    }

    public void setPublisherList(List<Object> publisherList) {
        this.publisherList = publisherList;
    }

    public String getBacklinkUrl() {
        return backlinkUrl;
    }

    public void setBacklinkUrl(String backlinkUrl) {
        this.backlinkUrl = backlinkUrl;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

}
