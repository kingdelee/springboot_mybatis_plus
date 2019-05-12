package com.zhongcheng.oa.entity;

import java.util.Date;
import java.util.StringJoiner;

public class AdvertiserInfo {
    private String id;

    private String parentId;

    private String loginName;

    private String password;

    private String phone;

    private Integer type;

    private Integer state;

    private String stateMsg;

    private String company;

    private String companyLicenseNum;

    private String companyLicenseImg;

    private String companyAddress;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStateMsg() {
        return stateMsg;
    }

    public void setStateMsg(String stateMsg) {
        this.stateMsg = stateMsg == null ? null : stateMsg.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getCompanyLicenseNum() {
        return companyLicenseNum;
    }

    public void setCompanyLicenseNum(String companyLicenseNum) {
        this.companyLicenseNum = companyLicenseNum == null ? null : companyLicenseNum.trim();
    }

    public String getCompanyLicenseImg() {
        return companyLicenseImg;
    }

    public void setCompanyLicenseImg(String companyLicenseImg) {
        this.companyLicenseImg = companyLicenseImg == null ? null : companyLicenseImg.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AdvertiserInfo.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("parentId='" + parentId + "'")
                .add("loginName='" + loginName + "'")
                .add("password='" + password + "'")
                .add("phone='" + phone + "'")
                .add("type=" + type)
                .add("state=" + state)
                .add("stateMsg='" + stateMsg + "'")
                .add("company='" + company + "'")
                .add("companyLicenseNum='" + companyLicenseNum + "'")
                .add("companyLicenseImg='" + companyLicenseImg + "'")
                .add("companyAddress='" + companyAddress + "'")
                .add("createTime=" + createTime)
                .add("updateTime=" + updateTime)
                .toString();
    }
}