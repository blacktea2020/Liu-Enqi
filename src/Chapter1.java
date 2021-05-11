public class Chapter1 {
    public static void homework1(){
        /** Print "hello world"
         * @param No param
         * @return No return value
         */
        System.out.println("hello,world");
    }
    public static void homework2(){
         /** 打印个人信息
         * @param No param
         * @return No return value
         */
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
/**
 * homework3 
 * JDK：java development kit （java开发工具）
 * JRE：java runtime environment （java运行环境）
 * JVM：java virtuak machine （java虚拟机）
 * JDK是java开发的核心，它由三部分组成————JRE，java基础类库（如io）和java开发工具（如编译器javac）组成。
 * JRE是java开发时的工作环境，包括JVM和jvm工作所需要的类库，可以解释class文件。
 * JVM是java实现跨平台的最核心的部分，可以将class文件与操作系统进行交互，将程序解释给本地系统执行。
 * JDK包含JRE，JRE包含JVM。
 * 
 * homework4
 * 环境变量配置及其作用：
 * Win系统环境变量配置：
 * 安装JDK———>配置JAVA-HOME,PATH，CLASSPATH
 * 见https://www.runoob.com/java/java-environment-setup.html#win-install
 * JAVA_HOME指明JDK安装路径，使得其他相关环境变量的配置更加方便简洁
 * Path使得系统可以在任何路径下识别java命令。
 * CLASSPATH告诉java虚拟机所有的可执行文件.class都在哪。
 * 
 * homework5
 * java编写的步骤：
 * 建立.java文件——>编写源码——>javac编译为.class文件——>运行
 * 源码编写:类，属性，方法
 * 
 * homework6
 * java编写7个规范：
 * 1.类，方法的注释，使用javadoc的方式，即文档注释
 * https://blog.csdn.net/vbirdbest/article/details/80296136
 * 
 * 2.非javadoc注释，往往是对代码的说明（给程序的维护者），说明如何修改，注意事项
 * 
 * 3.使用tab，整体将代码右移，使用shift+tab整体左移
 *  
 * 4.运算符和等号两边各加一个空格  1 + 1 = 2
 * 
 * 5.源码文件使用utf-8编码
 * 
 * 6.行宽字符不要超过80
 * 
 * 7.代码编写次行风格和行尾风格
 * 
 * homework7
 * 犯错误：
 * 1.忘记 ;
 * 2.主类名与文件名不一致
 */
 
}
