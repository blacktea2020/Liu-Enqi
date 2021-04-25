/**
 * 判断整数大于0，小于0，等于0
 * 判断闰年
 * 判断水仙花数
 */
public class Homework0234 {
    public static void main(String[] args) {
        Judge.positiveOrNot(1);
        Judge.positiveOrNot(0);
        Judge.positiveOrNot(-1);
        Judge.leapYearOrNot(2004);
        Judge.leapYearOrNot(2003);
        Judge.leapYearOrNot(1900);
        Judge.leapYearOrNot(2000);
        Judge.narcissisticOrNot(153);
        Judge.narcissisticOrNot(99);
        
    }
}   
class Judge{
    public static void positiveOrNot(int num){
        if(num>0){
            System.out.println(num + "大于0");
        }
        else if(num == 0){
            System.out.println(num + "等于0");
        }
        else{
            System.out.println(num + "小于0");
        }
    }
    public static void leapYearOrNot(int year){
        if(year % 100 == 0){
            if(year % 400 == 0){
                System.out.println(year + "年是闰年");
            }
            else{
                System.out.println(year + "年不是闰年");
            }
        }
        else{
            if(year % 4 == 0){
                System.out.println(year + "年是闰年");
            }
            else{
                System.out.println(year + "年不是闰年");
            }
        }
    }
    public static void narcissisticOrNot(int figure){
        if(figure < 100 || figure > 999){
            System.out.println(figure + "不是三位数");
        }
        else{
            int oneFigure = figure % 10;
            int threeFigure = figure / 100;
            int twoFigure = (figure - oneFigure - 100 * threeFigure) / 10;
            if(Math.pow(oneFigure, 3)+Math.pow(twoFigure, 3)+Math.pow(threeFigure, 3) == figure){
                System.out.println(figure + "是水仙花数");
            }
            else{
                System.out.println(figure + "不是水仙花数"); 
            }
        }
    }
}