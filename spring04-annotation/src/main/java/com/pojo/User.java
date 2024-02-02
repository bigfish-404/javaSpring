package com.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于在配置文件中<bean id="user" class="com.pojo"/>

@Component
@Scope("singleton")
public class User {

    //相当于  <property name="name" value="fish"/>
    @Value("fish")
    public String name;
}
