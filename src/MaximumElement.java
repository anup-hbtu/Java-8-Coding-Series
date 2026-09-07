
import java.util.*;

public class MaximumElement {
    public static void main(String[] args) {
        List<Integer> al= Arrays.asList(1,4,3,9,6);
       // int maxVal= al.stream().mapToInt(Integer::intValue).max().orElse(0);
        Optional<Integer> maxVal= al.stream()
                        .max((a,b)->a.compareTo(b));
        System.out.println(maxVal.get());
    }
}
