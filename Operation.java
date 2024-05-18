import java.util.Collections;
import java.util.LinkedList;
import java.util.Arrays;

public class Operation {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Adding an element ");
        list.add(78);
        list.add(76);
        list.add(43);

        System.out.println(list);

        System.out.println("Adding at a particular index");
        list.add(2, 8);
        list.add(1, 56);

        System.out.println(list);

        System.out.println("Retrieving an element from particular index 3");
        int p = list.get(3);
        System.out.println(p);

        list.remove(3);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        System.out.println(list.isEmpty());

        // list.clear();
        // System.out.println(list.isEmpty());

        for (int i : list) {
            System.out.println(i);

        }

        System.out.println("Reversing a linked list");
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("Sorting of linked list");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Converting linked list into array");
        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));

        System.out.println("Converting an array into linked list");
        LinkedList<Integer> l = new LinkedList<>(Arrays.asList(arr));
        System.out.println(l);
    }
}
