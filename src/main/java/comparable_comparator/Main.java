package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        List<Movies> movies = new ArrayList<>();
        movies.add(new Movies("The Matrix", 1999));
        movies.add(new Movies("Inception", 2010));
        movies.add(new Movies("Rush Hour", 1998));
        movies.add(new Movies("Shanghai Noon", 2000));
        movies.add(new Movies("Tenet", 2020));

        Collections.sort(movies);
        System.out.println("Using Ccomparable: According to Name of Movie");
        for (Movies m : movies) {
            System.out.println(m);
        }
//        Comparator<Movies> com=new Comparator<Movies>() {
//            @Override
//            public int compare(Movies m1, Movies m2) {
//                if(m1.getLaunchYear()>m2.getLaunchYear())
//                    return 1;
//                else
//                return -1;
//            }
//        };
//        Collections.sort(movies,com);
        //This code can be written as this using Lamda
        Collections.sort(movies, (m1, m2) -> m1.getLaunchYear() > m2.getLaunchYear() ? 1 : -1);

        System.out.println("\nUsing Comparator: According to Launch Year");
        for (Movies m : movies) {
            System.out.println(m);
        }

    }
}
