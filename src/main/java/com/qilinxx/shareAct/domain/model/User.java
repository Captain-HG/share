package com.qilinxx.shareAct.domain.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
public class User {
    @Id
    private String uId;

    @Column(name = "u_account")
    private String uAccount;

    @Column(name = "u_password")
    private String uPassword;

    @Column(name = "u_name")
    private String uName;

    @Column(name = "u_create_time")
    private Integer uCreateTime;

    @Column(name = "u_state")
    private String uState;

    @Column(name = "u_backup")
    private String uBackup;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getuAccount() {
        return uAccount;
    }

    public void setuAccount(String uAccount) {
        this.uAccount = uAccount == null ? null : uAccount.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public Integer getuCreateTime() {
        return uCreateTime;
    }

    public void setuCreateTime(Integer uCreateTime) {
        this.uCreateTime = uCreateTime;
    }

    public String getuState() {
        return uState;
    }

    public void setuState(String uState) {
        this.uState = uState == null ? null : uState.trim();
    }

    public String getuBackup() {
        return uBackup;
    }

    public void setuBackup(String uBackup) {
        this.uBackup = uBackup == null ? null : uBackup.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "uId='" + uId + '\'' +
                ", uAccount='" + uAccount + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uName='" + uName + '\'' +
                ", uCreateTime=" + uCreateTime +
                ", uState='" + uState + '\'' +
                ", uBackup='" + uBackup + '\'' +
                '}';
    }
}