import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;

//interface Sab{
//    public void eat(int a,int b);
//}
// 测试dev分支
// 第二次测试dev
public class GitTest {
    @Test
    public void test() {
        Runnable r = () -> System.out.println("22");
        r.run();
        Consumer<String> con = t -> System.out.println(t);
        con.accept("haahah");
        Comparator<Integer> com = (x, y) -> {
            System.out.println("slfjalsf");
            return Integer.compare(x, y);
        };

//        Sab ss = new Sab(){
//            public void eat(int a,int b) {
//                System.out.println(a+b);
//            }
//        };
//        ss.eat(2,4);
//        Comparator<Integer> com = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return Integer.compare(o1,o2);
//            }
//        };
//        System.out.println(com.compare(1,2));
//        TreeSet<Integer> ts = new TreeSet<>(com);
//        ts.add(2);
//        ts.add(4);
//        ts.add(1);
//        ts.add(0);
//
//        for (Integer t : ts) {
//            System.out.println(t);
//        }
    }

    @Test
    public void test1(){
        List<Integer> numbers = Arrays.asList(-1, -2, 0, 4, 5);
        long count = 0;
        for(Integer number: numbers)
        {
            if(number > 0)
            {
                count++;
            }
        }
        System.out.println("Positive count: " + count);
    }

    @Test
    public void test2(){
        List<Integer> numbers = Arrays.asList(-1, -2, 0, 4, 5);
        long count = numbers.parallelStream().filter(i -> i>0).count();
        System.out.println("Positive count: " + count);
    }
    // todo master, dev
>>>>>>> dev
}
