/**
 * 100000 元
 * >50000 扣5%
 * <=50000 -1000
 * 输出次数
 */
public class Homework01{
    public static void main(String[] args) {
        double money = 100000;
        int n = 0;
        while(true){
            if(money>50000){
                money *= 0.95;
                n += 1;
            }
            else if(money>0){
                money -= 1000;
                n += 1;
            }
            else{
                break;
            }
        }
        System.out.println(n);
    }
}    