package com.zhk.test;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name;
    private int age;
    private String sex;
    public Dog(){
        name="Dog";
        age=10;
        sex="male";
    }
    public static int count(){
        int sum=0;
        for(int i=0;i<10;i++){
            sum+=i;
        }
        return sum;
    }

    public String getName() {
        return name;
    }

}
