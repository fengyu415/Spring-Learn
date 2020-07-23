package com.feng.pojo;

public class UserT {
    private  String name;
    private  int age;

    public UserT(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public UserT setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public UserT setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "UserT{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
