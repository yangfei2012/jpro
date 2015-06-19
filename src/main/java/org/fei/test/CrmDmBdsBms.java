package org.fei.test;

import java.util.Date;

/**
 * Created by fei on 14-9-2.
 */
public class CrmDmBdsBms {

    /** id */
    protected Long id;

    /** salerId */
    protected Long salerId;

    /** salerName */
    protected String salerName;

    /** createDate */
    protected Date createDate;

    /** creator */
    protected Long creator;

    /** creatorName */
    protected String creatorName;

    /** authCreator */
    protected Long authCreator;

    /** authCreatorName */
    protected String authCreatorName;

    /** type */
    protected Integer type;

    /** staffCityId */
    protected Long staffCityId;

    /** cityName */
    protected String cityName;

    /** email */
    protected String email;

    /** accountEnabled */
    protected Integer accountEnabled;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getSalerId() {
        return salerId;
    }
    public void setSalerId(Long salerId) {
        this.salerId = salerId;
    }
    public String getSalerName() {
        return salerName;
    }
    public void setSalerName(String salerName) {
        this.salerName = salerName;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public Long getCreator() {
        return creator;
    }
    public void setCreator(Long creator) {
        this.creator = creator;
    }
    public String getCreatorName() {
        return creatorName;
    }
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }
    public Long getAuthCreator() {
        return authCreator;
    }
    public void setAuthCreator(Long authCreator) {
        this.authCreator = authCreator;
    }
    public String getAuthCreatorName() {
        return authCreatorName;
    }
    public void setAuthCreatorName(String authCreatorName) {
        this.authCreatorName = authCreatorName;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public Long getStaffCityId() {
        return staffCityId;
    }
    public void setStaffCityId(Long staffCityId) {
        this.staffCityId = staffCityId;
    }
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getAccountEnabled() {
        return accountEnabled;
    }
    public void setAccountEnabled(Integer accountEnabled) {
        this.accountEnabled = accountEnabled;
    }
}
