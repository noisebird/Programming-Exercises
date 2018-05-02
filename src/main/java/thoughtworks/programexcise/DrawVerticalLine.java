/**
 * Created by wangjie on 2018/5/2.
 */
public class DrawVerticalLine {
    public static void main(String[] args) {
        draw(3);
    }
    public static void draw(int number){
        String str="";
        for(int i=0;i<number;i++){
            str+="*\n";
        }
        System.out.println(str);
    }
}
