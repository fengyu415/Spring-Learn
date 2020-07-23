package com.feng.pojo;

public class User {
    private  String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public  void  showUserName()
    {
        System.out.println("输出用户名"+getUserName());
    }
}
