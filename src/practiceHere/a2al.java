package practiceHere;

import java.util.*;
import java.util.stream.Collectors;

public class a2al {
    public static void main(String[] args) {

        Integer Int[] = {2, 4, 6, 4, 1, 2, 5};
        int[] arr = {2, 4, 6, 4, 1, 2, 5};
        System.out.println(Arrays.toString(arr));
        String str[] = {"raj", "amz", "raj", "pfc"};
        System.out.println(Arrays.toString(str));

        char c[] = {'A', 'B', 'B', 'A', 'E'};
        System.out.println(Arrays.toString(c));

//        List<String> sli = Arrays.asList(str); // Immutable list
//        sli.add("rajesh");
//        System.out.println(sli);



        List<int[]> intLi = Arrays.asList(arr);
       for(int[] i : intLi)
       {
           System.out.print(Arrays.toString(i)+"\n");
       }

        List<Integer> lis = Arrays.asList(Int);
        System.out.println("Integer array-->"+lis);

        List<int[]> list = List.of(arr); // Immutable list

        for(int[] i : list)
        {
            System.out.print("modified-->"+Arrays.toString(i));
        }

        List<Integer> j8 = Arrays.stream(arr).boxed().collect(Collectors.toList()); // MUTABLE LIST
        j8.add(99);
        System.out.println("java 8 -->"+j8);

        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<=arr.length-1; i++)
        {
            set.add(arr[i]);
        }
        System.out.println("remove dup numbers:"+set);

        List<char[]> llii = Arrays.asList(c);
        for(char[] ch : llii)
        {
            System.out.println("char to arraly list-->"+Arrays.toString(c));
        }

        List<char[]> cli = new ArrayList<>();
        List<char[]> chli = List.of(c);

        Collections.addAll(cli,c);
        for(char[] cc :cli)
        {
            System.out.println(Arrays.toString(cc));
        }

        List<String> slist = Arrays.asList(str);
        Set <String> s = new HashSet<String>();
        for(int i=0; i<=str.length-1; i++) {
            s.add(str[i]);
        }
        System.out.println("remove dup strings:-->"+s);

        List<String> sli = Arrays.asList(str);
       // sli.add("extra");
        sli.set(1,"abc");
        System.out.println(sli);

        sli.forEach(k-> System.out.print(k+" "));

    }
}
