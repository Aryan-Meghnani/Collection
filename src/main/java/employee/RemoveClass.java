package employee;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveClass {
    void remove(List<Employee> e) {
        Set<Employee> set = new HashSet<Employee>(e);
        set.forEach(System.out::println);
    }
}

