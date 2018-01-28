package com.example.viethoc.studentmaket.models;

/**
 * Created by viethoc on 28/01/2018.
 */

public class User {
    private int userId;
    private String userName;
    private String phoneNumber;
    public User(int userId, String userName, String phoneNumber) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", phoneNumber=" + phoneNumber + "]";
    }

}

