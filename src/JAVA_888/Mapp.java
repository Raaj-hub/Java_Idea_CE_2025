package JAVA_888;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Mapp {
    public static void main(String[] args) {

        String[] str;
        str = new String[]{"raj", "amz", "raj", "pfc"};

        List<String> list =List.of(str);
        Set<String> result =list.stream().map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println(result);
    }
}
