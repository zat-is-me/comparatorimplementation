import java.util.ArrayList;
import java.util.Collections;

/**
 * @author tatek on 9/27/2023
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> arrayList = new ArrayList<>();

        arrayList.add( new Employee(111, "Mayank", "london"));
        arrayList.add( new Employee(131, "Bnshul", "nyc"));
        arrayList.add( new Employee(131, "Anshul", "nyc"));
        arrayList.add( new Employee(131, "Anshul", "ayc"));
        arrayList.add( new Employee(121, "Solanki", "jaipur"));
        arrayList.add( new Employee(101, "Aggarwal", "Hongkong"));
        arrayList.add( new Employee(102, "Aggarwal", "Aongkong"));

        System.out.println("Before sort");
        arrayList.stream().forEach(System.out::println);

        Collections.sort(arrayList, new Sorting());

        System.out.println("\nAfter sorted: ");
        arrayList.stream().forEach(System.out::println);
    }
}