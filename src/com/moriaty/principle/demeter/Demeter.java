package com.moriaty.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 迪米特法则
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/24 21:43
 */
public class Demeter {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManger());
    }
}

// 学校总部员工
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 学院员工
class CollegeEmployee {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 管理学院员工的管理类
class CollegeManger {
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工 id: " + i);
            list.add(collegeEmployee);
        }
        return list;
    }
}

// 学校管理类
// 直接朋友: Employee CollegeManger
// 间接朋友: CollegeEmployee
class SchoolManager {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学校总部员工 id: " + i);
            list.add(employee);
        }
        return list;
    }

    // 间接朋友出现在局部变量, 违反了迪米特法则
    void printAllEmployee(CollegeManger sub) {
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("----------- 学院员工 -------------");
        for (CollegeEmployee collegeEmployee : list1) {
            System.out.println(collegeEmployee.getId());
        }

        List<Employee> list2 = this.getAllEmployee();
        System.out.println("----------- 学校员工 -------------");
        for (Employee employee : list2) {
            System.out.println(employee.getId());
        }
    }
}
