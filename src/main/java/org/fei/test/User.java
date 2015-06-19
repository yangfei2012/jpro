package org.fei.test;

import java.util.Date;

/**
 * @author chen.qi, yangfei
 */
public class User {

    private long id;
    private String email;
    private String name;
    private String password; // 弃用
    private String passwordNew;
    private String mobile;
    private int auth;
    private int score;
    private int state;
    private String ticket;
    private Date regTime;
    private Date lastLoginTime;
    private String regIp;
    private String lastLoginIp;
    private int mergeType;
    private long areaId;
    private int version;
    private long siteConnected;
    private int emailValid;
    private long areaCode;
    private String areaName;
    private int site;
    private long siteId;
    private double moneySave;
    private boolean nativeLogin;
    private int passwordChange;
    private long headPortraitId;
    private String ref;
    private int growthLevel;

    public String toString() {
        return "name: ["+this.name+"] |emain: ["+this.email+"] |mobile: ["+this.mobile+"]";
    }

    public String getTicket() {
        return this.ticket;
    }

    public void setRef(String ref) {
        if (null != ref && ref.length() < 8) {
            this.ref = ref;
        }
    }

    public double getMoneySave() {
        return moneySave;
    }

    public int getEmailValid() {
        return emailValid;
    }

    public String getRef() {
        return ref;
    }

    public void setMoneySave(double moneySave) {
        this.moneySave = moneySave;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public long getAreaId() {
        return areaId;
    }

    public void setAreaId(long areaId) {
        this.areaId = areaId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (null != email) {
            this.email = email.trim().toLowerCase();
        }
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAuth() {
        return auth;
    }

    public void setAuth(int auth) {
        this.auth = auth;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordNew() {
        return passwordNew;
    }

    public void setPasswordNew(String passwordNew) {
        this.passwordNew = passwordNew;
    }

    @Deprecated
    public int getSite() {
        return site;
    }

    public void setSite(int site) {
        this.site = site;
    }

    @Deprecated
    public long getSiteId() {
        return siteId;
    }

    public void setSiteId(long siteId) {
        this.siteId = siteId;
    }

    public long getSiteConnected() {
        return siteConnected;
    }

    public void setSiteConnected(long siteConnected) {
        this.siteConnected = siteConnected;
    }

    public void setEmailValid(int emailValid) {
        this.emailValid = emailValid;
    }

    public long getHeadPortraitId() {
        return headPortraitId;
    }

    public void setHeadPortraitId(long headPortraitId) {
        this.headPortraitId = headPortraitId;
    }

    public int getMergeType() {
        return mergeType;
    }

    public void setMergeType(int mergeType) {
        this.mergeType = mergeType;
    }

    public long getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(long areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public boolean isNativeLogin() {
        return nativeLogin;
    }

    public void setNativeLogin(boolean nativeLogin) {
        this.nativeLogin = nativeLogin;
    }

    public int getPasswordChange() {
        return passwordChange;
    }

    public void setPasswordChange(int passwordChange) {
        this.passwordChange = passwordChange;
    }

    public int getGrowthLevel() {
        return growthLevel;
    }

    public void setGrowthLevel(int growthLevel) {
        this.growthLevel = growthLevel;
    }

}
