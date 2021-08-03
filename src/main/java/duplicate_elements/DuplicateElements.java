package duplicate_elements;

import java.util.*;

public class DuplicateElements {
    void removeUsingSet(int arr[]) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
        System.out.println("HashSet:");
        Iterator<Integer> itr = s.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }

    void removeUsingLinkedHash(int arr[]) {
        Set<Integer> s = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
        System.out.println("LinkedHashSet");
        s.forEach(integer -> System.out.println(integer));
    }

    void removeUsingTree(int arr[]) {
        Set<Integer> s = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
        System.out.println("TreeSet");
        s.forEach(System.out::println);
    }

    void removeUsingHashMap(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        Set<Integer> set = map.keySet();
        System.out.println("HashMap");
        for (Map.Entry s : map.entrySet()) {
            System.out.println(s.getKey());
        }
    }

    //Removing duplicate value by removing the value and putting last value of array in that place
    //whenever find a duplicate value decrement end
    void remove(int[] arr) {
        int end = arr.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[end - 1];
                    end--;
                    j--;
                }
            }
        }
        System.out.println("Without Set");
        for (int i = 0; i < end; i++) {
            System.out.println(arr[i]);
        }
    }


}



