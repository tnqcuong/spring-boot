package com.org.prototype.example.dto;

import javax.validation.constraints.NotNull;

public class MemberDto {
    @NotNull
    private String account;

    @NotNull
    private String password;

    @NotNull
    private String skypeId;

    @NotNull
    private String name;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSkypeId() {
        return skypeId;
    }

    public void setSkypeId(String skypeId) {
        this.skypeId = skypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
