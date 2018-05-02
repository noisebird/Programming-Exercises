/**
 * Created by wangjie on 2018/5/2.
 */
public class DiamonWithName {
    public static void main(String[] args) {
        draw(6);
    }

    public static void draw(int number) {
        for (int i = 1; i < 2 * number; i++) {
            if(i==number){
                System.out.println("wangjie");
                continue;
            }
            String str = "";
            for (int k = Math.abs(i - number); k != 0; k--) {
                str += " ";
            }
            int temp=(i<=number)?(i-1)*2+1:(2*number-i-1)*2+1;
            for (int j = 0; j < temp; j++) {
                str += "*";
            }
            System.out.println(str);
        }
    }
}
