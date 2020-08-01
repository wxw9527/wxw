package com.apesource.pingyougouguanli.pojo;

import java.io.Serializable;

public class Seller implements Serializable {
    private int sellerId;
    private String name;
    private String nickName;
    private String password;
    private String mobile;
    private String telephone;
    private int status;
    private String addressDetail;
    private String linkmanName;
    private String linkmanQq;
    private String linkmanMobile;
    private String linkmanEmail;
    private String licenseNumber;
    private String taxNumber;
    private String orgNumber;
    private String address;
    private String brief;
    private String createTime;
    private String legalPerson;
    private String legalPersonCardId;
    private String bankUser;
    private String bankName;
    private String bankName1;

    public Seller() {
    }

    public Seller(int sellerId, String name, String nickName, String password, String mobile, String telephone, int status, String addressDetail, String linkmanName, String linkmanQq, String linkmanMobile, String linkmanEmail, String licenseNumber, String taxNumber, String orgNumber, String address, String brief, String createTime, String legalPerson, String legalPersonCardId, String bankUser, String bankName, String bankName1) {
        this.sellerId = sellerId;
        this.name = name;
        this.nickName = nickName;
        this.password = password;
        this.mobile = mobile;
        this.telephone = telephone;
        this.status = status;
        this.addressDetail = addressDetail;
        this.linkmanName = linkmanName;
        this.linkmanQq = linkmanQq;
        this.linkmanMobile = linkmanMobile;
        this.linkmanEmail = linkmanEmail;
        this.licenseNumber = licenseNumber;
        this.taxNumber = taxNumber;
        this.orgNumber = orgNumber;
        this.address = address;
        this.brief = brief;
        this.createTime = createTime;
        this.legalPerson = legalPerson;
        this.legalPersonCardId = legalPersonCardId;
        this.bankUser = bankUser;
        this.bankName = bankName;
        this.bankName1 = bankName1;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getLinkmanName() {
        return linkmanName;
    }

    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName;
    }

    public String getLinkmanQq() {
        return linkmanQq;
    }

    public void setLinkmanQq(String linkmanQq) {
        this.linkmanQq = linkmanQq;
    }

    public String getLinkmanMobile() {
        return linkmanMobile;
    }

    public void setLinkmanMobile(String linkmanMobile) {
        this.linkmanMobile = linkmanMobile;
    }

    public String getLinkmanEmail() {
        return linkmanEmail;
    }

    public void setLinkmanEmail(String linkmanEmail) {
        this.linkmanEmail = linkmanEmail;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getOrgNumber() {
        return orgNumber;
    }

    public void setOrgNumber(String orgNumber) {
        this.orgNumber = orgNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getLegalPersonCardId() {
        return legalPersonCardId;
    }

    public void setLegalPersonCardId(String legalPersonCardId) {
        this.legalPersonCardId = legalPersonCardId;
    }

    public String getBankUser() {
        return bankUser;
    }

    public void setBankUser(String bankUser) {
        this.bankUser = bankUser;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName1() {
        return bankName1;
    }

    public void setBankName1(String bankName1) {
        this.bankName1 = bankName1;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "sellerId=" + sellerId +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", mobile='" + mobile + '\'' +
                ", telephone='" + telephone + '\'' +
                ", status=" + status +
                ", addressDetail='" + addressDetail + '\'' +
                ", linkmanName='" + linkmanName + '\'' +
                ", linkmanQq='" + linkmanQq + '\'' +
                ", linkmanMobile='" + linkmanMobile + '\'' +
                ", linkmanEmail='" + linkmanEmail + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", taxNumber='" + taxNumber + '\'' +
                ", orgNumber='" + orgNumber + '\'' +
                ", address='" + address + '\'' +
                ", brief='" + brief + '\'' +
                ", createTime='" + createTime + '\'' +
                ", legalPerson='" + legalPerson + '\'' +
                ", legalPersonCardId='" + legalPersonCardId + '\'' +
                ", bankUser='" + bankUser + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankName1='" + bankName1 + '\'' +
                '}';
    }
}
