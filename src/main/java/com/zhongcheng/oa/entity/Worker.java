package com.zhongcheng.oa.entity;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhongcheng.oa.constant.company_profile.BusRoleEnum;
import com.zhongcheng.oa.constant.worker_profile.WorkerProfileConstant;

public class Worker {
    private Integer id;

    private String name;

    @Pattern(regexp="^[1][3,4,5,7,8][0-9]{9}$",message="{手机号不正确}")
    private String phone;

    private String addr;

    @Email(message = "错误的邮箱格式")
    private String cEmail;

    @Email(message = "错误的邮箱格式")
    private String wEmail;

    private String loginName;

    private String password;

    private Integer age;

    private String birthday;

    private Integer deptId;

    private Integer status;

    private Integer busRoleId;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date correctionTime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date entryTime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date departureTime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updateTime;

    private Integer createUserId;

    private Integer updateUserId;

    private String bank;

    private String cardNum;

    private Integer sex;

    private Integer positionId;

    private Integer leaderId;

    private String idCardPic;

    private String leavingCertificatePic;

    private String bankRunning;

    private String diplomaCertificate;

    private String curriculumVitae;

    private String code;

    private Integer isDeptManage;

    private Integer isLogin;

    private List<LoginLog> logList;

    private List<BusRole> roleList;

    private String deptName;

    private String positionName;

    private Date loginTime;

    private Integer roleIds;

    /**
     * 判断拥有某个角色
     * @param busRoleEnum
     * @return
     */
    public boolean hasBusRole(BusRoleEnum busRoleEnum){
        for (BusRole busRole : roleList) {
            if(busRole.getId() == busRoleEnum.getId()) return true;
        }
        return false;
    }

    /**
     * 判断是否是管理层
     * @return
     */
    public boolean isManage(){
        return this.getIsDeptManage() == WorkerProfileConstant.isManage;
    }


    public List<LoginLog> getLogList() {
        return logList;
    }

    public void setLogList(List<LoginLog> logList) {
        this.logList = logList;
    }

    public List<BusRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<BusRole> roleList) {
        this.roleList = roleList;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(Integer roleIds) {
        this.roleIds = roleIds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail == null ? null : cEmail.trim();
    }

    public String getwEmail() {
        return wEmail;
    }

    public void setwEmail(String wEmail) {
        this.wEmail = wEmail == null ? null : wEmail.trim();
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBusRoleId() {
        return busRoleId;
    }

    public void setBusRoleId(Integer busRoleId) {
        this.busRoleId = busRoleId;
    }

    public Date getCorrectionTime() {
        return correctionTime;
    }

    public void setCorrectionTime(Date correctionTime) {
        this.correctionTime = correctionTime;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
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

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum == null ? null : cardNum.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Integer leaderId) {
        this.leaderId = leaderId;
    }

    public String getIdCardPic() {
        return idCardPic;
    }

    public void setIdCardPic(String idCardPic) {
        this.idCardPic = idCardPic == null ? null : idCardPic.trim();
    }

    public String getLeavingCertificatePic() {
        return leavingCertificatePic;
    }

    public void setLeavingCertificatePic(String leavingCertificatePic) {
        this.leavingCertificatePic = leavingCertificatePic == null ? null : leavingCertificatePic.trim();
    }

    public String getBankRunning() {
        return bankRunning;
    }

    public void setBankRunning(String bankRunning) {
        this.bankRunning = bankRunning == null ? null : bankRunning.trim();
    }

    public String getDiplomaCertificate() {
        return diplomaCertificate;
    }

    public void setDiplomaCertificate(String diplomaCertificate) {
        this.diplomaCertificate = diplomaCertificate == null ? null : diplomaCertificate.trim();
    }

    public String getCurriculumVitae() {
        return curriculumVitae;
    }

    public void setCurriculumVitae(String curriculumVitae) {
        this.curriculumVitae = curriculumVitae == null ? null : curriculumVitae.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    // 0 是部门领导
    public Integer getIsDeptManage() {
        return isDeptManage;
    }

    public void setIsDeptManage(Integer isDeptManage) {
        this.isDeptManage = isDeptManage;
    }

    public Integer getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(Integer isLogin) {
        this.isLogin = isLogin;
    }
}