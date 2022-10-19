import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> listOne = List.of("aa", "ccc");
        List<String> listTwo = Arrays.asList("bb", "dddd");

//        ArrayList<String> test = new ArrayList<>() {{ add("qqq"); }};
//        test.add("wwww");

        //listOne.set(0, "zzz");
        listTwo.set(0, "zzz");
        listTwo.add("zzz");

        List<String> newList = Stream.concat(listOne.stream(), listTwo.stream())
                .collect(Collectors.toList());


        List<String> newList2 = new ArrayList<>(listOne);
        newList2.addAll(listTwo);


//    List mergeSort(List l1, List l2) {
//        List res = new ArrayList();
//
//        int p1 = 0, p2 = 0;
//        while(p1<l1.length && p2<l2.length) {
//            Integer i1 = l1.get(p1);
//            integer i2 = l2.get(p2);
//            if (i1<i2) {
//                res.add(i1);
//                p1++;
//            } else {
//                res.add(i2);
//                p2++;
//            }
//        }
//
//        if (p1<l1.le)
//    }
    }
}
