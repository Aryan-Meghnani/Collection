package practice;

import java.util.*;

public class Comparator {
    public static void main(String args[]) {
//        List<Integer> values = new ArrayList<>();
//        values.add(305);
//        values.add(998);
//        values.add(774);
//        values.add(236);
//        values.add(881);
//
//        Collections.sort(values, (o1, o2) -> {
//            return o1%10 > o2%10 ? 1 : -1;
//        });
//
//        for (int i : values) {
//            System.out.println(i);
//        }

        Map<String, String> map = new HashMap<>();
        map.put("Aryan", "8770769858");
        map.put("Simran", "8107515089");
        map.put("Hunny", "8209365807");

        System.out.println(map);
        map.remove("Aryan");
        Set<String> keys = map.keySet();
        System.out.println("Hash Map:\n");

        for (String i : keys) {

            System.out.println(i + " : " + map.get(i));
        }

        Map<String, String> lmap = new LinkedHashMap<>();
        lmap.put("Aryan", "8770769858");
        lmap.put("Simran", "8107515089");
        lmap.put("Hunny", "8209365807");

        System.out.println("Linked Hash Map:\n");
        Set<Map.Entry<String, String>> values = lmap.entrySet();
        for (Map.Entry<String, String> e : values) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }


        Map<String, String> tmap = new TreeMap<>();
        tmap.put("Aryan", "8770769858");
        tmap.put("Simran", "8107515089");
        tmap.put("Hunny", "8209365807");

        System.out.print("Tree Map:\n");
        for (Map.Entry e : tmap.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
