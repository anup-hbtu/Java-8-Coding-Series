
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinimumElement {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,5,1,7,9,2);
        Optional<Integer> minVal=list.stream().min((a, b)-> a.compareTo(b));
        System.out.println(minVal.get());


    }
}
