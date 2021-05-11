public class Chapter4 {
    public static int homework1(double money){
        /**
         * money 元
         * >50000 扣5%
         * <=50000 -1000
         * 输出次数
         * @param money
         * @return times n
         */
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
        return n;
    }
    public static void homework2(int num){
        /**
         * 判断一个数是不是正数
         * @param judge num
         * @return No return value
         */
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
    public static void homework3(int year){
        /**
         * 判断年份是不是闰年
         * @param judge year
         * @return No return value
         */
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
    public static void homework4(int figure){
        /**
         * 判断一个数是不是水仙花数
         * @param judge num
         * @return No return value
         */
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
