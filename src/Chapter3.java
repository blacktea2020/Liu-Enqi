public class Chapter3 {
    public static void homework1(){
        /** 运算符
         * @param No param
         * @return No return value
         */
        System.out.println(10 / 3); //10整除3
        System.out.println(10 / 2); //10整除2
        System.out.println(10 % 2); //10对2取余
        System.out.println(-10.5 % 3); //-10.5对3取余 -10.5除3 = -3余-1.5(10.5 % 3 = 1.5)
    }
    public static void homework2(){
        /** i++与++i
         * @param No param
         * @return No return value
         */
        int i = 66;
        System.out.println(++i + i); //++i先加后赋值
        int n1 = 50;
        int n2 = 50;
        int a = ++n1;
        int b = n2++;
        System.out.println(a); 
        System.out.println(b); //i++先赋值后加
    }
    public static void homework4(){
        /** 字符串转浮点数
         * @param No param
         * @return No return value
         */
        String a = "66.66";
        double b = Double.parseDouble(a);
        System.out.println(b);
        char c = 'A';
        String d = c + "";
        System.out.println(d);
    }
}
