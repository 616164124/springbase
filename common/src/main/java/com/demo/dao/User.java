/**
 * projectName: cloud2020-   
 * fileName: User.java  
 * packageName: com.demo.dao   
 * date: 2020-09-20
 * copyright(c) 2017-2020 xxx公司  
 */
package com.demo.dao;

import java.io.Serializable;

/**
 * @version: V1.0
 * @author: stjh756
 * @className: User
 * @packageName: com.demo.dao
 * @description: User实体类
 * @data: 2020-09-20
 **/
public class User implements Serializable {
    private int id;
    private String name;
    private int age;

    public User() {
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
