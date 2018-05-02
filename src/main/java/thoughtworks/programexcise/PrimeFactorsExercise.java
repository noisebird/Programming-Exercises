import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangjie on 2018/5/2.
 */
public class PrimeFactorsExercise {
    public static void main(String[] args) {
        List<Integer> list=generate(30);
        show(list);
    }
    public static List<Integer> generate(int number){
        List<Integer> list=new ArrayList<Integer>();
        for(int i=2;i<number/2;i++){
            if(number%i==0&&isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean isPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void show(List<Integer> list){
       list.stream().forEach(item-> System.out.println(item));
    }
}
