public class Chapter2 {
    public static void homework1(){
        /** 定义变量与运算符
         * @param No param
         * @return No return value
         */
        int n1;
        n1 = 13;
        int n2;
        n2 = 17;
        int n3;
        n3 = n1 + n2;
        System.out.println("n3 = "+n3);//n3 = n1 + n2 = 13 + 17 = 30
        int n4 = 38;
        int n5 = n4 - n3;
        System.out.println("n5 = "+n5);//n5 = n4 - n3 = 38 - 30 = 8
    }
    public static void homework2(){
        /** char学习
         * @param No param
         * @return No return value
         */
        char a = '\n';
        char b = '\t';
        char c = '\r';
        char d = '\\';
        char e = '1';
        char f = '2';
        char g = '3';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    /**
     * 与python不同，java中的单引号表示字符,java中的双引号是字符串。
     * char类型是一个单一的 16 位 Unicode 字符
     */
    }
    public static void homework3(){
        /** 字符串拼接
         * @param No param
         * @return No return value
         */
        String book1 = "JAVA核心技术";
        String book2 = "三国演义";
        String gender1 = "男";
        String gender2 = "女";
        double price1 = 66.66;
        double price2 = 11.11;
        System.out.println(book1 + book2);
        System.out.println(gender1 + gender2);
        System.out.println(price1 + price2);
    }
    public static void homework4(){
        /** 个人信息表打印
         * @param No param
         * @return No return value
         */
        String name = "xx";
        int age = 24;
        double grade = 100.00;
        String gender = "男";
        String hoppy = "java";
        System.out.println("姓名\t\t年龄\t成绩\t性别\t爱好"+"\n"+name+"\t\t"+age+"\t"+grade+"\t"+gender+"\t"+hoppy);
    }
}
