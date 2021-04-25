public class Homework02 {
    public static void main(String[] args) {
        String name = "LEQ";
        String gender = "男";
        String nativePlace = "XX省XX市";
        String address = "XX小区";
        String str = String.format("姓名:%s\n性别:%s\n籍贯:%s\n住址:%s",name,gender,nativePlace,address);
        System.out.println(str);

        /**
         * 转义符的使用：同Python，https://www.runoob.com/java/java-regular-expressions.html
         * 占位符的使用：占位符使用同Python，但需要使用format()方法将字符串格式化。
         */
    }
}   
