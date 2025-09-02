package JAVA_888;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {


        Integer Int[] = {2, 4, 6, 4, 1, 2, 5};
        int[] arr = {2, 4, 6, 4, 1, 2, 5};

        List<int[]> iin = Arrays.asList(arr);
       for(int[] i : iin)
       {
           System.out.println(Arrays.toString(i));
       }
        Set<int[]> iset = iin.stream().collect(Collectors.toSet());
       for(int[] i : iset)
       {
           System.out.println(Arrays.toString(i));
       }

        List<String> lstr = List.of("red", "green", "blue", "yellow", "red","blue");
        List<Character> lchars = new ArrayList<>(Arrays.asList('a', 'b', 'a', 'd', 'b','c'));

        Set<String> str = lstr.stream().collect(Collectors.toSet());
        Set<Character> ch = lchars.stream().collect(Collectors.toSet());

        System.out.println(str +"\n"+ ch);
        ch.forEach(System.out::println);

        str.forEach(word-> System.out.println("Color: "+word));
    }
}
