import java.nio.channels.NonWritableChannelException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Chapter6{
    public static void main(String[] args) {
        Mora Tom = new Mora();
        for(int i = 0;i<10;i++){
            Tom.play();
        }
        Tom.statistics();
    }
}

class A01{
    public static double max(double[] arr){
        /** 找最大值
         * @param doubleArray
         * @return maxNum
         */
        double maxNum = arr[0];
        for(int i = 1;i<arr.length;i++){
            if (arr[i]>maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
}

class A02{
    public static int find(String str,char a){
        /** 字符串匹配char
         * @param doubleArray
         * @return maxNum
         */
        int index = -1;
        char[] charArr = str.toCharArray();
        for(int i = 0;i<charArr.length;i++){
            if(charArr[i] == a){
                index = i;
                break;
            }
        }
        return index;
    }
}

class Book{
    public String name;
    public double price;

    public Book(String name,double price){
        this.name = name;
        this.price = price;
    }
    public void updatePrece(){
        if(this.price >150){
            this.price = 150;
        }
        else if(this.price>100){
            this.price = 100;
        }
    }
}

class A03{
    public int[] copyArr(int[] arr){
        int len = arr.length;
        int[] newArr = new int[len];
        for(int i =0;i<len;i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }
}

class Cycle{
    final double pi = 3.1415926;
    public double radius;
    public Cycle(double radius){
        this.radius = radius;
    }
    public void perimeter(){
        System.out.println("perimeter = "  + 2 * pi * this.radius);
    }
    public void area(){
        System.out.println("area = "+ pi * Math.pow(this.radius, 2));
    }
}
class Fibonacci{
    public static int[][] fibonacci(int[][] arr) {
        if(arr[1][0]<arr[0].length){
            if(arr[1][0]<2){
                arr[0][arr[1][0]] = 1;
                arr[1][0]+=1;
                fibonacci(arr);
            }
            else if(arr[1][0]>=2){
                arr[0][arr[1][0]] = arr[0][arr[1][0]-1]+ arr[0][arr[1][0]-2] ;
                arr[1][0]+=1;
                fibonacci(arr);
            }
            else{
                arr[0][arr[1][0]] = -1;
                arr[1][0]+=1;
                fibonacci(arr);
            }
        }
        return arr;
    }
    public static int[][] initialization(int n){
        int[][] arr = new int[2][];
        arr[0] = new int[10];
        arr[1] = new int[1];
        arr[1][0] = 0;
        return arr;
    }
}

class Cale{
    int a;
    int b;
    public Cale(int a,int b){
        this.a = a;
        this.b = b;
    }
    public int add(){
        return this.a+this.b;
    }
    public int less(){
        return this.a - this.b;
    }
    public int multiply(){
        return this.a * this.b;
    }
    public int except(){
        if(this.b == 0){
            System.out.println("error");
            return -1;
        }
        else{
            return a/b;
        }
    }
}

class Dog{
    String name;
    String colar;
    int age;
    public Dog(String name,String colar,int age){
        this.name = name;
        this.colar = colar;
        this.age = age;
    }
    public void show(){
        System.out.println("小狗的名字为：" + this.name);
        System.out.println("小狗的颜色为：" + this.colar);
        System.out.println("小狗的年龄为：" + this.age);
    }
}
class Music{
    String name;
    int times;
    public Music(String name,int times){
        this.name = name;
        this.times = times;
    }
    public void play(){
        for(int timeLeft = 0;timeLeft<=times;timeLeft++){
            System.out.println(this.name + " 正在播放，时间："+timeLeft);
        }
    }
    public void getInfo(){
        System.out.println("歌的名字为："+this.name);
        System.out.println("歌的持续时间为："+this.times);
        
    }
}
class Circle{
    private double radius;
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double findArea(){
        return Math.PI*Math.pow(this.radius, 2); 
    }
}
class PassObject{
    public void printAreas(Circle c,int times){
        System.out.println("Radius\t\tArea");
        for(int i = 1;i<times;i++){
            c.setRadius(i);
            System.out.println(i+"\t\t"+c.findArea());
        }
    }
}
class Mora{
    int winRate = 0;
    int loseRate = 0;
    int totalRate = 0;
    public void play(){
        System.out.print("请输入 0：石头，1：剪刀，2：布:");
        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();
        Random ran = new Random();
        int chooseAI = ran.nextInt(3);
        if((choose==0 && chooseAI==1)||(choose==1 && chooseAI==2)||(choose==2 && chooseAI==0)){
            System.out.println("你赢了");
            this.winRate += 1;
            this.totalRate +=1;
        }
        else if ((choose==1 && chooseAI==0)||(choose==2 && chooseAI==1)||(choose==0 && chooseAI==2)){
            System.out.println("你输了");
            this.loseRate += 1;
            this.totalRate += 1;
        }
        else if(choose == chooseAI){
            System.out.println("平局");
            this.totalRate += 1;
        }
        else{
            System.out.println("输入错误");
        }
    }
    public void statistics(){
        double win = this.winRate;
        double total = this.totalRate;
        double rate = Double.valueOf(win / total);
        System.out.println("总共进行了"+this.totalRate+ "局");
        System.out.println("其中赢了"+this.winRate+"局");
        System.out.println("输了"+this.loseRate+"局");
        System.out.println("胜率为"+ rate);
    }
}