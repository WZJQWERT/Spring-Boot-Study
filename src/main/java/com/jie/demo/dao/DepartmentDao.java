package com.jie.demo.dao;

import com.jie.demo.pojo.Department;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DepartmentDao {
    //模拟数据库中的数据
    private static Map<Integer , Department> departments =null;
    static {
        //创建一个部门表
        departments= new HashMap<Integer, Department>();

        departments.put(101,new Department(101,"教学部"));
        departments.put(102,new Department(102,"市场部"));
        departments.put(101,new Department(103,"营销部"));
        departments.put(101,new Department(104,"市场部"));
        departments.put(101,new Department(105,"作业部"));


//获得所有部门信息
    }
    public Collection<Department> getDepartment(){
        return departments.values();
    }
    //通过id 来得到部门；
    public static Department getDepartmentById(Integer id){
        return departments.get(id);
    }
}
