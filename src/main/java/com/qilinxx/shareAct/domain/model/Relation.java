package com.qilinxx.shareAct.domain.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "relation")
public class Relation {
    @Id
    private String rId;

    @Column(name = "r_u_id")
    private String rUId;

    @Column(name = "r_i_id")
    private String rIId;

    @Column(name = "r_a_id")
    private String rAId;

    @Column(name = "r_create_time")
    private Integer rCreateTime;

    @Column(name = "r_backup")
    private String rBackup;

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId == null ? null : rId.trim();
    }

    public String getrUId() {
        return rUId;
    }

    public void setrUId(String rUId) {
        this.rUId = rUId == null ? null : rUId.trim();
    }

    public String getrIId() {
        return rIId;
    }

    public void setrIId(String rIId) {
        this.rIId = rIId == null ? null : rIId.trim();
    }

    public String getrAId() {
        return rAId;
    }

    public void setrAId(String rAId) {
        this.rAId = rAId == null ? null : rAId.trim();
    }

    public Integer getrCreateTime() {
        return rCreateTime;
    }

    public void setrCreateTime(Integer rCreateTime) {
        this.rCreateTime = rCreateTime;
    }

    public String getrBackup() {
        return rBackup;
    }

    public void setrBackup(String rBackup) {
        this.rBackup = rBackup == null ? null : rBackup.trim();
    }

    @Override
    public String toString() {
        return "Relation{" +
                "rId='" + rId + '\'' +
                ", rUId='" + rUId + '\'' +
                ", rIId='" + rIId + '\'' +
                ", rAId='" + rAId + '\'' +
                ", rCreateTime=" + rCreateTime +
                ", rBackup='" + rBackup + '\'' +
                '}';
    }
}