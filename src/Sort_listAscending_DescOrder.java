import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort_listAscending_DescOrder {

    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(3,2,7,1,4,6);
        System.out.println("Ascending:");
        ls.stream().sorted().forEach(System.out::println);
        System.out.println("Descending:");
        ls.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
