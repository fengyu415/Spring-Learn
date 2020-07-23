package com.feng.pojo;

public class Hello {

    public Hello() {
        System.out.println("构造方法");
    }

    private  String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public  void  showHello()
    {
        System.out.println("Hello"+this.getUserName());
    }
}
