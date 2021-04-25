/**
 * 6、输出1-100不能被5整除的数，5个一行
 * 7、输出小写a-z和大写Z-A
 * 8、求1-1/2+1/3-1/4...1/100
 * 9、求1+(1+2)+(1+2+3)+...(1+2+3+...100)
 */
public class Homework06789{
    public static void main(String[] args) {
        Homework.homework06();
        Homework.homework07();
        Homework.homework08();
        Homework.homework09();
    }
}
class Homework{
    public static void homework06(){
        int n = 0;
        for(int i = 1;i <= 100;i++ ){
            if(i % 5 != 0){
                System.out.print(i + "\t");
                n++;
            }
            if(n % 5 == 0){
                System.out.print("\n");
            }
        }
    }
    public static void homework07(){
        for(char i = 'a';i <= 'z';i++){
            System.out.print(i + " ");
        }
        for(char j = 'Z'; j >= 'A';j--){
            System.out.print(j + " ");
        }
        System.out.print("\n");
    }
    public static void homework08(){
        double solve = 1;
        for(double i = 2;i<=100;i++){
            if(i % 2 == 0){
                solve -= 1 / i;
            }
            else{
                solve += 1 / i;
            }
        }
        System.out.println(solve);
    }
    public static void homework09(){
        int solve = 0;
        int n = 0;
        for(int i = 1;i <= 100;i++){
            n += i;
            solve += n;
        }
        System.out.println(solve);
    }
}
