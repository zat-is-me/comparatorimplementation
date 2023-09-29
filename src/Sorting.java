import java.util.Comparator;

/**
 * @author tatek on 9/28/2023
 */
public class Sorting implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {

        var idCompare = Integer.compare(o1.getId(),o2.getId());

        var nameCompare = o1.getName().compareTo(o2.getName());

        var addressCompare = o1.getAddress().compareTo(o2.getAddress());

        //if nameCompare equals 0 return nameCompare, otherwise return nameCompare.
        var result = (idCompare == 0) ? nameCompare : idCompare;

        //if a result equals 0 return addressCompare, otherwise return result.
        int finalResult = (result == 0) ? addressCompare : result;

        return finalResult;
    }
}
