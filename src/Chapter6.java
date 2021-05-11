public class Chapter6{
    public static void main(String[] args) {
        Cycle a = new Cycle(1);
        a.perimeter();
        a.area();
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