package JAVA_888;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.List.*;
import java.util.stream.Collectors;

public class Limit_Skip {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6,9,0));
        List<Integer> limit = numbers.stream().limit(3)
                .collect(Collectors.toList());
        System.out.println(limit);

        List<Integer> skip = numbers.stream().skip(3).collect(Collectors.toList());
        System.out.println(skip);
    }
}
