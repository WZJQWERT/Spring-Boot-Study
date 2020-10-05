package com.jie.demo.dao;

import com.jie.demo.pojo.Department;
import com.jie.demo.pojo.Employee;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EmployeeDao {
    private static Map<Integer, Employee> employees=null;
    //员工所属部门
    @Autowired
    private Department department;
    static {
        employees =new HashMap<Integer, Employee>();

        employees.put(101,new Employee(1001,"aa","2459604063@qq.com",0, new Department(101,"教学部")));
        employees.put(102,new Employee(1001,"bb","3309211840@qq.com",1, new Department(102,"市场部")));
        employees.put(103,new Employee(1001,"cc","3474501433@qq.com",0, new Department(103,"营销部")));
        employees.put(104,new Employee(1001,"dd","2459604063@qq.com",1, new Department(104,"作业部")));
        employees.put(105,new Employee(1001,"ee","3309211840@qq.com",1, new Department(105,"试卷部")));
    }


    //主键自增
    private static Integer initId =1006;
    //增加员工
    public void save(Employee employee){
        if(employee.getId()==null){
            employee.setId(initId++);
        }
        employee.setDepartment(DepartmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }
    //查询所有员工
    public Collection<Employee> getAll(){
        return employees.values();
    }
    //通过id查寻员工
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }
    //通过id删除员工
    public void delete(Integer id ){
        employees.remove(id);

    }
}

