//package com.org.prototype.example.model;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "member")
//public class Member {
//
//    @Id
//    @Column(unique = true, nullable = false)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq")
//    private Long id;
//
//    private String account;
//
//    @Column(length = 60)
//    private String password;
//
//    private String skypeId;
//
//    private String name;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getAccount() {
//        return account;
//    }
//
//    public void setAccount(String account) {
//        this.account = account;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getSkypeId() {
//        return skypeId;
//    }
//
//    public void setSkypeId(String skypeId) {
//        this.skypeId = skypeId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
