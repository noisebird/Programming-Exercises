import java.util.stream.IntStream;

/**
 * Created by wangjie on 2018/5/2.
 */
public class DrawHorizontalLine {
    public static void main(String[] args) {
        draw(8);
    }
    public static void draw(int number){
        String str="";
        for(int i=0;i<number;i++){
            str+="*";
        }
        System.out.println(str);
    }
}
