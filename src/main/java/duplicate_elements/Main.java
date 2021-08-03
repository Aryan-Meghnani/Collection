package duplicate_elements;

public class Main {
    public static void main(String args[]) {
        int arr[] = {48, 97, 90, 54, 32, 45, 67, 97, 67};
        DuplicateElements ds = new DuplicateElements();
        ds.removeUsingSet(arr);
        ds.removeUsingLinkedHash(arr);
        ds.removeUsingTree(arr);
        ds.remove(arr);
        ds.removeUsingHashMap(arr);
    }
}

