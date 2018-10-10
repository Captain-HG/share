package com.qilinxx.shareAct.domain.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "provide")
public class Provide {
    @Id
    private String pId;

    @Column(name = "p_account")
    private String pAccount;

    @Column(name = "p_password")
    private String pPassword;

    @Column(name = "p_name")
    private String pName;

    @Column(name = "p_address")
    private String pAddress;

    @Column(name = "p_create_time")
    private Integer pCreateTime;

    @Column(name = "p_permit_number")
    private String pPermitNumber;

    @Column(name = "p_state")
    private String pState;

    @Column(name = "p_backup")
    private String pBackup;

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public String getpAccount() {
        return pAccount;
    }

    public void setpAccount(String pAccount) {
        this.pAccount = pAccount == null ? null : pAccount.trim();
    }

    public String getpPassword() {
        return pPassword;
    }

    public void setpPassword(String pPassword) {
        this.pPassword = pPassword == null ? null : pPassword.trim();
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress == null ? null : pAddress.trim();
    }

    public Integer getpCreateTime() {
        return pCreateTime;
    }

    public void setpCreateTime(Integer pCreateTime) {
        this.pCreateTime = pCreateTime;
    }

    public String getpPermitNumber() {
        return pPermitNumber;
    }

    public void setpPermitNumber(String pPermitNumber) {
        this.pPermitNumber = pPermitNumber == null ? null : pPermitNumber.trim();
    }

    public String getpState() {
        return pState;
    }

    public void setpState(String pState) {
        this.pState = pState == null ? null : pState.trim();
    }

    public String getpBackup() {
        return pBackup;
    }

    public void setpBackup(String pBackup) {
        this.pBackup = pBackup == null ? null : pBackup.trim();
    }

    @Override
    public String toString() {
        return "Provide{" +
                "pId='" + pId + '\'' +
                ", pAccount='" + pAccount + '\'' +
                ", pPassword='" + pPassword + '\'' +
                ", pName='" + pName + '\'' +
                ", pAddress='" + pAddress + '\'' +
                ", pCreateTime=" + pCreateTime +
                ", pPermitNumber='" + pPermitNumber + '\'' +
                ", pState='" + pState + '\'' +
                ", pBackup='" + pBackup + '\'' +
                '}';
    }
}