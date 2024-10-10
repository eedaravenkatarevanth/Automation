package lambda;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ExampleStreams {
    public static <Charecter> void main(String[] args) {
        List<Integer>list= Arrays.asList(1, 2, 3, 6, 7, 8);
        int a=10,b=20;
        List<Integer>sqquare=list.stream().filter(n->n%2==0).map(n->n*n).toList();

        System.out.println(sqquare);
        int sum= IntStream.rangeClosed(a,b).filter(n->n%2==0).sum();

        Optional<Integer> maximun= list.stream().max(Comparator.naturalOrder());
        System.out.println(maximun.get());

        Optional<Integer> minimum= list.stream().min(Comparator.naturalOrder());
        System.out.println(minimum.get());

        LongStream ls= LongStream.of(10L,11L,12L,5L,3L,24L);
        ls.forEach(System.out::println);

        List<Integer> list1= Arrays.asList(1,2,2,3,4,4);
        Set<Integer>set= new HashSet<>();

        String[] str={"Aa","Bb","Cc"};
        List<String> str1= Arrays.stream(str)
                .map(x->x.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(str1);

        List<Integer>li= Arrays.asList(1,2,3,4,5);
        List<Integer>li2= li.stream().filter(x->x>2).toList();
        System.out.println(li2);

        int[] arr={114,101,118,97,110,116,104,31,105,115,31,103,114,101,97,116};
        List<Character>lei=Arrays.stream(arr).mapToObj(x->(char)(x)).toList();
        lei.forEach(System.out::print);
    }
}
