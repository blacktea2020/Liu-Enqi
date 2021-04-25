public class Homework02 {
    public static void main(String[] args) {
        int i = 66;
        System.out.println(++i + i); //++i先加后赋值
        int n1 = 50;
        int n2 = 50;
        int a = ++n1;
        int b = n2++;
        System.out.println(a); 
        System.out.println(b); //i++先赋值后加
    }
}   
