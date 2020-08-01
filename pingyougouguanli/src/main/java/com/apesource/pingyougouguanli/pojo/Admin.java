package com.apesource.pingyougouguanli.pojo;

import java.io.Serializable;

public class Admin implements Serializable {
    private int id;
    private String account;
    protected String loginpwd;

    public Admin() {
    }

    public Admin(int id, String account, String loginpwd) {
        this.id = id;
        this.account = account;
        this.loginpwd = loginpwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", loginpwd='" + loginpwd + '\'' +
                '}';
    }
}
