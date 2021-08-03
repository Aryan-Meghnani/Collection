package employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String args[]) {
        List<Employee> emp = new ArrayList<Employee>();

        emp.add(new Employee("Aryan", 21, "Jaipur"));
        emp.add(new Employee("Simran", 25, "Pune"));
        emp.add(new Employee("Hunny", 24, "Kolkata"));
        emp.add(new Employee("Rahul", 21, "Indore"));
        emp.add(new Employee("Aryan", 21, "Jaipur"));
        emp.add(new Employee("Rahul", 21, "Indore"));
        emp.add(new Employee("Anjali", 20, "Jaipur"));

//        RemoveClass rc=new RemoveClass();
//        rc.remove(emp);
        Set<Employee> set = new HashSet<Employee>(emp);
        set.forEach(System.out::println);
    }
}
