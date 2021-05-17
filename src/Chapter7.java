public class Chapter7 {
    public static void main(String[] args) {
        Student a = new Student("小明", 15, "男", "00023102");
        a.geiInfo();
        a.study();
        System.out.println(a.play("足球"));
    }
}
class Person{
    private String name;
    private int age;
    private String job;
    public Person(String name,int age,String job){
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public void geiInfo(){
        System.out.println("name:"+this.name+"\tage:"+this.age+"\tjob:"+this.job);
    }
    public static void sort(Person[] arr){
        Person temp;
        for(int i=arr.length;i>0;i--){
            for(int j = 1;j<i;j++){
                if(arr[j].age>arr[j-1].age){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}


/**
 * 4种访问修饰符
 * 1、public
 * 在任何地方都可以访问。使用对象：类、接口、变量、方法。
 * 2、protected
 * 对同一包内的类和所有子类可见。使用对象：变量、方法（不能修饰类）
 * 3、private
 * 在同一类内可见。使用对象：变量、方法（不能修饰类）
 * 4、default
 * 在同一包中可见，不使用任何修饰符，使用对象：类、接口、变量、方法。
 */


class Teacher{
    private String name;
    private int age;
    private String post;
    private double salary;
    public Teacher(String name,int age,String post,double salary){
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }
    public void introduce(){
        System.out.println("name:"+this.name+"\tage:"+this.age+"\tpost:"+this.post+"\tsalary:"+this.salary);
    }
}
class Professor extends Teacher{

    public Professor(String name, int age) {
        super(name, age, "Professor", 1.3);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void introduce(){
        super.introduce();
    }
}
class AssociateProfessor extends Teacher{

    public AssociateProfessor(String name, int age) {
        super(name, age, "AssociateProfessor", 1.2);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void introduce(){
        super.introduce();
    }
}
class Lecturer extends Teacher{
    public Lecturer(String name, int age) {
        super(name, age, "Lecturer", 1.1);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void introduce(){
        super.introduce();
    }
}

class Staff{
    private String name;
    private double dailyPay;
    private int workDay;
    public Staff(String name,double dailyPay,int workDay){
        this.name = name;
        this.dailyPay = dailyPay;
        this.workDay = workDay;
    }
    public void printSalary(double coefficient,int basicPay){
        double salary = basicPay + this.dailyPay*this.workDay*coefficient;
        System.out.println(this.name+"员工工资为:"+salary);
    }
}

class DepartmentManager extends Staff{

    public DepartmentManager(String name, double dailyPay, int workDay) {
        super(name, dailyPay, workDay);
        //TODO Auto-generated constructor stub
    }
    public void printSalary(){
        super.printSalary(1.2, 1000);
    }
}

class  GeneralStaff extends Staff{

    public GeneralStaff(String name, double dailyPay, int workDay) {
        super(name, dailyPay, workDay);
        //TODO Auto-generated constructor stub
    }
    public void printSalary(){
        super.printSalary(1, 0);
    }
}

class Employee{
    private String name;
    private String job;
    protected double monthlySalary;
    protected double yearSalary;
    public Employee(String name,String job,double monthlySalary){
        this.name = name;
        this.job = job;
        this.monthlySalary = monthlySalary;
    }
    public void salary(){
        this.yearSalary = this.monthlySalary * 12;
    }
    public void printSalary(){
        System.out.println("name:"+this.name+"\tjob:"+this.job+"\tsalary:"+this.yearSalary);
    }
}

class Worker extends Employee{
    public Worker(String name,double monthlySalary){
        super(name,"worker",monthlySalary);
    }
    public void salary(){
        super.salary();
    }
    public void printSalary(){
        super.printSalary();
    }
}
class Peasant extends Employee{
    public Peasant(String name,double monthlySalary){
        super(name,"peasant",monthlySalary);
    }
    public void salary(){
        super.salary();
    }
    public void printSalary(){
        super.printSalary();
    }
}
class Waiter extends Employee{
    public Waiter(String name,double monthlySalary){
        super(name,"waiter",monthlySalary);
    }
    public void salary(){
        super.salary();
    }
    public void printSalary(){
        super.printSalary();
    }
}
class Teacher_ extends Employee{
    public Teacher_(String name,double monthlySalary){
        super(name,"teacher",monthlySalary);
    }
    public void salary(int workDay){
        double workPay = 50;
        this.yearSalary = this.monthlySalary * 12 + workDay *workPay;
    }
    public void printSalary(){
        super.printSalary();
    }
}
class Scientist extends Employee{
    public Scientist(String name,double monthlySalary){
        super(name,"scientist",monthlySalary);
    }
    public void salary(double yearEndAwards){
        this.yearSalary = this.monthlySalary *12 +yearEndAwards;
    }
    public void printSalary(){
        super.printSalary();
    }
}

/**
 * ==与equals()的区别:
 * ==是判断两个变量或者实例是否指向同一个内存空间，适用于基本数据类型
 * equals()是判断两个变量或实例指向内存空间的值是不是相等，适用于引用类型和实例对象属性
 */

 class Person1{
     protected String name;
     protected int age;
     protected String gender;
     public Person1(String name,int age,String gender){
         this.name = name;
         this.age = age;
         this.gender = gender;
     }
     public String play(String hoppy){
         return this.name+"爱玩"+hoppy;
     }
     public void geiInfo(){
        System.out.println("姓名："+this.name);
        System.out.println("年龄："+this.age);
        System.out.println("性别："+this.gender);

     }
 }
 class Student extends Person1{

    private String stuId;
    public Student(String name, int age, String gender,String stuId) {
        super(name, age, gender);
        this.stuId = stuId;
    }
    public void study(){
        System.out.println("我承诺，我会好好学习。");
    }
    public String play(String hoppy){
        return super.play(hoppy);
    }
    public void geiInfo(){
        System.out.println("学生的信息：");
        super.geiInfo();
        System.out.println("学号："+this.stuId);
    }
 }

class Teacher__ extends Person1{

    private String workAge;
    public Teacher__(String name, int age, String gender,int workAge) {
        super(name, age, gender);
    }
    public void teacher(){
        System.out.println("我承诺，我会认真教学。");
    }
    public String play(String hoppy){
        return super.play(hoppy);
    }
    public void getInfo(){
        System.out.println("老师的信息：");
        super.geiInfo();
        System.out.println("工龄："+this.workAge);
    }
}
