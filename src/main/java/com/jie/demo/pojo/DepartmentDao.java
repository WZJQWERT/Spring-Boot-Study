package com.jie.demo.pojo;

import java.util.HashMap;
import java.util.Map;

public class DepartmentDao {
    //模拟数据库中的数据
    private static Map<Integer ,DepartmentDao> departments =null;
    static {
        //创建一个部门表
        departments=new HashMap<Integer, DepartmentDao>();
        departments.put(101,new DepartmentDao());

    }
}
