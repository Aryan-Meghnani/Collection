package comparable_comparator;

public class Movies implements Comparable<Movies> {
    private String name;
    private int launchYear;

    public Movies(String name, int launchYear) {
        this.name = name;
        this.launchYear = launchYear;
    }

    public String getName() {
        return name;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "name='" + name + '\'' +
                ", launchYear=" + launchYear +
                '}';
    }

    @Override
    public int compareTo(Movies movies) {
        int a=this.name.compareTo(movies.getName());
        if(a>1)
            return 1;
        else
            return -1;
    }
}
