package com.course.model;

import lombok.Data;

/**
 * @description:model层级下用户类,定义基础参数
 * @author:yang
 * @time:2023/2/22 14:51
 */
@Data
public class User {


   private int id;
   private String userName;
   private String password;
   private String age;
   private String sex;
   private String permission;
   private String isDelete;
   //复写toString方法，改写json串
   @Override
   public String toString() {
    return (
            "id"+id+","+
            "userName"+userName+","+
            "password"+password+","+
            "age"+age+","+
            "sex"+sex+","+
            "permission"+permission +","+
            "isDelete"+isDelete +"}"
            );
   }
}
