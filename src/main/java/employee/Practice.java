package employee;

public class Practice {
    public static void main(String[] args) {
        Employee em = new Employee("Aryan", 21, "Jaipur");
        Employee em1 = new Employee("Aryan", 21, "Jaipur");
        System.out.println(em.equals(em1));
        System.out.println(em == em1);
        System.out.println(em);
        System.out.println(em1);

        System.out.println(System.identityHashCode(em));
        System.out.println(System.identityHashCode(em1));
    }


}
