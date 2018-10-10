package com.qilixxx.shareAct.domain.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "draw")
public class Draw {
    @Id
    private String dId;

    @Column(name = "d_u_id")
    private String dUId;

    @Column(name = "d_create_time")
    private Integer dCreateTime;

    @Column(name = "d_update_time")
    private Integer dUpdateTime;

    @Column(name = "d_had_draw")
    private Integer dHadDraw;

    @Column(name = "d_draw_number")
    private Integer dDrawNumber;

    @Column(name="d_invite_people")
    private Integer dInvitePeople;

    @Column(name = "d_point")
    private Integer dPoint;

    @Column(name = "d_backup")
    private String dBackup;

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId == null ? null : dId.trim();
    }

    public String getdUId() {
        return dUId;
    }

    public void setdUId(String dUId) {
        this.dUId = dUId == null ? null : dUId.trim();
    }

    public Integer getdCreateTime() {
        return dCreateTime;
    }

    public void setdCreateTime(Integer dCreateTime) {
        this.dCreateTime = dCreateTime;
    }

    public Integer getdUpdateTime() {
        return dUpdateTime;
    }

    public void setdUpdateTime(Integer dUpdateTime) {
        this.dUpdateTime = dUpdateTime;
    }

    public Integer getdHadDraw() {
        return dHadDraw;
    }

    public void setdHadDraw(Integer dHadDraw) {
        this.dHadDraw = dHadDraw;
    }

    public Integer getdDrawNumber() {
        return dDrawNumber;
    }

    public void setdDrawNumber(Integer dDrawNumber) {
        this.dDrawNumber = dDrawNumber;
    }

    public Integer getdInvitePeople() {
        return dInvitePeople;
    }

    public void setdInvitePeople(Integer dInvitePeople) {
        this.dInvitePeople = dInvitePeople;
    }

    public Integer getdPoint() {
        return dPoint;
    }

    public void setdPoint(Integer dPoint) {
        this.dPoint = dPoint;
    }

    public String getdBackup() {
        return dBackup;
    }

    public void setdBackup(String dBackup) {
        this.dBackup = dBackup == null ? null : dBackup.trim();
    }

    @Override
    public String toString() {
        return "Draw{" +
                "dId='" + dId + '\'' +
                ", dUId='" + dUId + '\'' +
                ", dCreateTime=" + dCreateTime +
                ", dUpdateTime=" + dUpdateTime +
                ", dHadDraw=" + dHadDraw +
                ", dDrawNumber=" + dDrawNumber +
                ", dInvitePeople=" + dInvitePeople +
                ", dPoint=" + dPoint +
                ", dBackup='" + dBackup + '\'' +
                '}';
    }
}