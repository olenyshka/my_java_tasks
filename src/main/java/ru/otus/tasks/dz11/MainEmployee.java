package ru.otus.tasks.dz11;

import javax.sound.midi.Soundbank;
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
//        Employee emp6 = new Employee("Никита В.", 4);

//        System.out.println(emp6.getName());

        try {
            Employee emp6 = new Employee("Никита В.", 4);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

//        System.out.println(emp6.getName());

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);

        try {
            System.out.println("Начало блока try");
            System.out.println(getNameList(employeeList));
            System.out.println();

            getNamesAgeMoreThanNum(employeeList, 30);
            System.out.println();

//            getNamesAgeMoreThanNum(employeeList, 10);
            System.out.println();

            System.out.println(checkAvgAge(employeeList, 28));
            System.out.println();

            Employee youngestEmp = findYoungestEmp(employeeList);
            System.out.println("Самый молодой сотрудник из списка: " + youngestEmp.getName() + " " + youngestEmp.getAge());

            System.out.println(employeeList.isEmpty());

            employeeList = null;

            getNameList(employeeList);

            employeeList = new ArrayList<>();
            getNameList(employeeList);

            employeeList.add(emp1);
            employeeList.add(emp2);
            employeeList.add(emp3);
            employeeList.add(emp4);
            employeeList.add(emp5);
            System.out.println(getNameList(employeeList));


            employeeList = null;


            getNameList(employeeList);

            employeeList = new ArrayList<>();
            getNameList(employeeList);

            getNamesAgeMoreThanNum(employeeList, 10);
            getNamesAgeMoreThanNum(employeeList, 9);

        } catch (AppNullPointerException e) {
            System.out.println(e.getMessage());
        }

    }

    public static boolean isNullOrEmpty(List<Employee> emp) {
        if (emp == null || emp.isEmpty()) {
            System.out.println("Список пуст");
            return true;
        }
        return false;
    }

    public static List<String> getNameList(List<Employee> emp) {
        if (emp == null || emp.isEmpty()) {
            System.out.println("Список пуст");
            return null;
        }

        List<String> nameEmployee = new ArrayList<>();

        for (Employee name : emp) {
            nameEmployee.add(name.getName());
        }
        return nameEmployee;
    }

    public static List<Employee> getNamesAgeMoreThanNum(List<Employee> emp, int minAge) {
        if (isNullOrEmpty(emp)) {
            throw new AppNullPointerException("Список пуст или не создан");
        }

        if (minAge < 18 || minAge > 100) {
            throw new AppNullPointerException("Введен неверный возраст, должен быть от 18 до 100.");
        }

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
        if (isNullOrEmpty(emp)) {
            return false;
        }

        if (minAvgAge < 18 || minAvgAge > 100) {
            System.out.println("Минимальный средний возраст должен быть от 18 до 100, а вы ввели: " + minAvgAge);
            return false;
        }

        int avgAge = 0;
        for (Employee e : emp) {
            avgAge += e.getAge();
        }
        avgAge = avgAge / emp.size();
        return avgAge > minAvgAge;

    }

    public static Employee findYoungestEmp(List<Employee> emp) {

        if (isNullOrEmpty(emp)) {
            throw new AppNullPointerException("Список пуст или не создан");
        }

        Employee minAgeEmp = emp.get(0);

        for (Employee e : emp) {
            if (e.getAge() < minAgeEmp.getAge()) {
                minAgeEmp = e;
            }
        }
        return minAgeEmp;
    }

}
