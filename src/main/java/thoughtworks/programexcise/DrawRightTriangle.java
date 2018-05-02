/**
 * Created by wangjie on 2018/5/2.
 */
public class DrawRightTriangle {
    public static void main(String[] args) {
        draw(3);
    }
    public static void draw(int number){
        for(int i=0;i<number;i++){
            String str="";
            for(int k=0;k<number-i-1;k++){
                str+=" ";
            }
            for(int j=0;j<2*i+1;j++){
                str+="*";
            }
            System.out.println(str);
        }
    }
}
