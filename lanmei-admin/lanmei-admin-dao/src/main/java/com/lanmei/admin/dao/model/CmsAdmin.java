package com.lanmei.admin.dao.model;

import java.util.Date;

public class CmsAdmin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.admin_id
     *
     * @mbggenerated
     */
    private Integer adminId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.login_jobNum
     *
     * @mbggenerated
     */
    private String loginJobnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.admin_password
     *
     * @mbggenerated
     */
    private String adminPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.password_salt
     *
     * @mbggenerated
     */
    private String passwordSalt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.nick_name
     *
     * @mbggenerated
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.actual_name
     *
     * @mbggenerated
     */
    private String actualName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.department
     *
     * @mbggenerated
     */
    private String department;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.create_admin
     *
     * @mbggenerated
     */
    private Integer createAdmin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.invitation_code
     *
     * @mbggenerated
     */
    private String invitationCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.gender
     *
     * @mbggenerated
     */
    private String gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.age
     *
     * @mbggenerated
     */
    private Byte age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.head_portrait
     *
     * @mbggenerated
     */
    private String headPortrait;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.state
     *
     * @mbggenerated
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.email_is_activate
     *
     * @mbggenerated
     */
    private String emailIsActivate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.phone_num
     *
     * @mbggenerated
     */
    private String phoneNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.last_login_time
     *
     * @mbggenerated
     */
    private Date lastLoginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.last_login_ip
     *
     * @mbggenerated
     */
    private String lastLoginIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.login_count
     *
     * @mbggenerated
     */
    private Integer loginCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.generate_time
     *
     * @mbggenerated
     */
    private Date generateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.activate_time
     *
     * @mbggenerated
     */
    private Date activateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_admin.colose_time
     *
     * @mbggenerated
     */
    private Date coloseTime;

    public CmsAdmin() {
    }

    public CmsAdmin(String nickName) {
        this.nickName = nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.admin_id
     *
     * @return the value of cms_admin.admin_id
     *
     * @mbggenerated
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.admin_id
     *
     * @param adminId the value for cms_admin.admin_id
     *
     * @mbggenerated
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.login_jobNum
     *
     * @return the value of cms_admin.login_jobNum
     *
     * @mbggenerated
     */
    public String getLoginJobnum() {
        return loginJobnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.login_jobNum
     *
     * @param loginJobnum the value for cms_admin.login_jobNum
     *
     * @mbggenerated
     */
    public void setLoginJobnum(String loginJobnum) {
        this.loginJobnum = loginJobnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.admin_password
     *
     * @return the value of cms_admin.admin_password
     *
     * @mbggenerated
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.admin_password
     *
     * @param adminPassword the value for cms_admin.admin_password
     *
     * @mbggenerated
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.password_salt
     *
     * @return the value of cms_admin.password_salt
     *
     * @mbggenerated
     */
    public String getPasswordSalt() {
        return passwordSalt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.password_salt
     *
     * @param passwordSalt the value for cms_admin.password_salt
     *
     * @mbggenerated
     */
    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.nick_name
     *
     * @return the value of cms_admin.nick_name
     *
     * @mbggenerated
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.nick_name
     *
     * @param nickName the value for cms_admin.nick_name
     *
     * @mbggenerated
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.actual_name
     *
     * @return the value of cms_admin.actual_name
     *
     * @mbggenerated
     */
    public String getActualName() {
        return actualName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.actual_name
     *
     * @param actualName the value for cms_admin.actual_name
     *
     * @mbggenerated
     */
    public void setActualName(String actualName) {
        this.actualName = actualName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.department
     *
     * @return the value of cms_admin.department
     *
     * @mbggenerated
     */
    public String getDepartment() {
        return department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.department
     *
     * @param department the value for cms_admin.department
     *
     * @mbggenerated
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.create_admin
     *
     * @return the value of cms_admin.create_admin
     *
     * @mbggenerated
     */
    public Integer getCreateAdmin() {
        return createAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.create_admin
     *
     * @param createAdmin the value for cms_admin.create_admin
     *
     * @mbggenerated
     */
    public void setCreateAdmin(Integer createAdmin) {
        this.createAdmin = createAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.invitation_code
     *
     * @return the value of cms_admin.invitation_code
     *
     * @mbggenerated
     */
    public String getInvitationCode() {
        return invitationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.invitation_code
     *
     * @param invitationCode the value for cms_admin.invitation_code
     *
     * @mbggenerated
     */
    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.gender
     *
     * @return the value of cms_admin.gender
     *
     * @mbggenerated
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.gender
     *
     * @param gender the value for cms_admin.gender
     *
     * @mbggenerated
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.age
     *
     * @return the value of cms_admin.age
     *
     * @mbggenerated
     */
    public Byte getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.age
     *
     * @param age the value for cms_admin.age
     *
     * @mbggenerated
     */
    public void setAge(Byte age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.head_portrait
     *
     * @return the value of cms_admin.head_portrait
     *
     * @mbggenerated
     */
    public String getHeadPortrait() {
        return headPortrait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.head_portrait
     *
     * @param headPortrait the value for cms_admin.head_portrait
     *
     * @mbggenerated
     */
    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.state
     *
     * @return the value of cms_admin.state
     *
     * @mbggenerated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.state
     *
     * @param state the value for cms_admin.state
     *
     * @mbggenerated
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.email
     *
     * @return the value of cms_admin.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.email
     *
     * @param email the value for cms_admin.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.email_is_activate
     *
     * @return the value of cms_admin.email_is_activate
     *
     * @mbggenerated
     */
    public String getEmailIsActivate() {
        return emailIsActivate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.email_is_activate
     *
     * @param emailIsActivate the value for cms_admin.email_is_activate
     *
     * @mbggenerated
     */
    public void setEmailIsActivate(String emailIsActivate) {
        this.emailIsActivate = emailIsActivate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.phone_num
     *
     * @return the value of cms_admin.phone_num
     *
     * @mbggenerated
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.phone_num
     *
     * @param phoneNum the value for cms_admin.phone_num
     *
     * @mbggenerated
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.last_login_time
     *
     * @return the value of cms_admin.last_login_time
     *
     * @mbggenerated
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.last_login_time
     *
     * @param lastLoginTime the value for cms_admin.last_login_time
     *
     * @mbggenerated
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.last_login_ip
     *
     * @return the value of cms_admin.last_login_ip
     *
     * @mbggenerated
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.last_login_ip
     *
     * @param lastLoginIp the value for cms_admin.last_login_ip
     *
     * @mbggenerated
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.login_count
     *
     * @return the value of cms_admin.login_count
     *
     * @mbggenerated
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.login_count
     *
     * @param loginCount the value for cms_admin.login_count
     *
     * @mbggenerated
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.generate_time
     *
     * @return the value of cms_admin.generate_time
     *
     * @mbggenerated
     */
    public Date getGenerateTime() {
        return generateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.generate_time
     *
     * @param generateTime the value for cms_admin.generate_time
     *
     * @mbggenerated
     */
    public void setGenerateTime(Date generateTime) {
        this.generateTime = generateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.activate_time
     *
     * @return the value of cms_admin.activate_time
     *
     * @mbggenerated
     */
    public Date getActivateTime() {
        return activateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.activate_time
     *
     * @param activateTime the value for cms_admin.activate_time
     *
     * @mbggenerated
     */
    public void setActivateTime(Date activateTime) {
        this.activateTime = activateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_admin.colose_time
     *
     * @return the value of cms_admin.colose_time
     *
     * @mbggenerated
     */
    public Date getColoseTime() {
        return coloseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_admin.colose_time
     *
     * @param coloseTime the value for cms_admin.colose_time
     *
     * @mbggenerated
     */
    public void setColoseTime(Date coloseTime) {
        this.coloseTime = coloseTime;
    }
}