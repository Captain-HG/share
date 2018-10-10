package com.qilinxx.shareAct.domain.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "activity")
public class Activity {
    @Id
    private String aId;

    @Column(name = "a_name")
    private String aName;

    @Column(name = "a_p_id")
    private String aPId;

    @Column(name = "a_start_time")
    private Integer aStartTime;

    @Column(name = "a_end_time")
    private Integer aEndTime;

    @Column(name = "a_state")
    private String aState;

    @Column(name = "a_url")
    private String aUrl;

    @Column(name = "a_detail")
    private String aDetail;

    @Column(name = "a_backup")
    private String aBackup;

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId == null ? null : aId.trim();
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public String getaPId() {
        return aPId;
    }

    public void setaPId(String aPId) {
        this.aPId = aPId == null ? null : aPId.trim();
    }

    public Integer getaStartTime() {
        return aStartTime;
    }

    public void setaStartTime(Integer aStartTime) {
        this.aStartTime = aStartTime;
    }

    public Integer getaEndTime() {
        return aEndTime;
    }

    public void setaEndTime(Integer aEndTime) {
        this.aEndTime = aEndTime;
    }

    public String getaState() {
        return aState;
    }

    public void setaState(String aState) {
        this.aState = aState == null ? null : aState.trim();
    }

    public String getaUrl() {
        return aUrl;
    }

    public void setaUrl(String aUrl) {
        this.aUrl = aUrl == null ? null : aUrl.trim();
    }

    public String getaDetail() {
        return aDetail;
    }

    public void setaDetail(String aDetail) {
        this.aDetail = aDetail == null ? null : aDetail.trim();
    }

    public String getaBackup() {
        return aBackup;
    }

    public void setaBackup(String aBackup) {
        this.aBackup = aBackup == null ? null : aBackup.trim();
    }

    @Override
    public String toString() {
        return "Activity{" +
                "aId='" + aId + '\'' +
                ", aName='" + aName + '\'' +
                ", aPId='" + aPId + '\'' +
                ", aStartTime=" + aStartTime +
                ", aEndTime=" + aEndTime +
                ", aState='" + aState + '\'' +
                ", aUrl='" + aUrl + '\'' +
                ", aDetail='" + aDetail + '\'' +
                ", aBackup='" + aBackup + '\'' +
                '}';
    }
}