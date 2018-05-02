/**
 * Created by wangjie on 2018/5/2.
 */
public class FizzBuzzExercise {
    public static void main(String[] args) {
        play(100);
    }
    public static void play(int number){
        for(int i=1;i<=number;i++){
            String result="";
            if(i%3==0){
                result+="Fizz";
            }
            if(i%5==0){
                result+="Buzz";
            }
            System.out.println(result.equals("")?i:result);
        }
    }
}
