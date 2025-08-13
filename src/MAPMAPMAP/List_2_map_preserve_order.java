package MAPMAPMAP;
    import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

    /*
     * Java Program to convert a List to map in Java 8.
     * This example shows a trick to preserve order of element
     * in the list while converting to Map using LinkedHashMap.
     */
    public class List_2_map_preserve_order {

        public static void main(String args[]) {

            List<String> hostingProviders = Arrays.asList("Bluehost",
                    "GoDaddy", "Amazon AWS", "LiquidWeb", "FatCow");
            System.out.println("list: " + hostingProviders);

            Map<String, Integer> cards2Length = hostingProviders.stream()
                    .collect(Collectors.toMap(Function.identity(),
                            String::length,
                            (e1, e2) -> e1,
                            LinkedHashMap::new));
            System.out.println("map: " + cards2Length);

        }



}
