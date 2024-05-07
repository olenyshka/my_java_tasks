package ru.otus.tasks.dz11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainEmployee {
    public static void main(String[] args) {

        ArrayList<Employee> employeeList = new ArrayList<>();

        Employee emp1 = new Employee("Иван И.", 36);
        Employee emp2 = new Employee("Ольга С.", 30);
        Employee emp3 = new Employee("Александр С.", 28);
        Employee emp4 = new Employee("Екатерина С.", 40);
        Employee emp5 = new Employee("Никита В.", 25);

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);

        System.out.println(getNameList(employeeList));
        System.out.println();

        getNamesAgeMoreThanNum(employeeList, 30);
        System.out.println();

        checkAvgAge(employeeList, 28);
        System.out.println();

        findYoungestEmp(employeeList);


    }

    public static List<String> getNameList(List<Employee> emp) {
        List<String> nameEmployee = new ArrayList<>();

        for (Employee name : emp) {
            nameEmployee.add(name.getName());
//            System.out.println(name.getName());
        }
        return nameEmployee;
    }

    public static List<Employee> getNamesAgeMoreThanNum(List<Employee> emp, int minAge) {
        List<Employee> employee = new ArrayList<>();

        for (Employee e : emp) {
            if (e.getAge() >= minAge) {
                employee.add(e);
                System.out.println(e.getName() + " " + e.getAge());
            }
        }
        return employee;
    }

    public static boolean checkAvgAge(List<Employee> emp, int minAvgAge) {
        int avgAge = 0;
        for (Employee e : emp) {
            avgAge += e.getAge();
        }
        if (avgAge >= minAvgAge) {
            System.out.println("Средний возраст сотрудников превышает указанный аргумент: Средний возраст: " +
                    avgAge + ". Вы ввели: " + minAvgAge);
            return true;
        } else {
            System.out.println("Средний возраст сотрудников не превышает указанный аргумент: Средний возраст: " +
                    avgAge + ". Вы ввели: " + minAvgAge);
            return false;
        }
    }

    public static Employee findYoungestEmp(List<Employee> emp) {
        Employee minAgeEmp = emp.get(0);

        for (Employee e : emp) {
            if (e.getAge() < minAgeEmp.getAge()) {
                minAgeEmp = e;
            }
        }
        System.out.println(minAgeEmp.getName() + " " + minAgeEmp.getAge());
        return minAgeEmp;
    }

}
