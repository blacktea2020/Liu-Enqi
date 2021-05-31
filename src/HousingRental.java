import java.util.Scanner;
import java.util.ArrayList;

public class HousingRental{
    public static void main(String[] args) {
        ArrayList<House> houseSet = new ArrayList<House>();
        Scanner input = new Scanner(System.in);
        while(true){
        System.out.println("-----------------房屋出租系统-----------------");
        System.out.println("             1 新 增 房 源");
        System.out.println("             2 查 找 房 屋");
        System.out.println("             3 删 除 房 屋");
        System.out.println("             4 修 改 房 屋 信 息");
        System.out.println("             5 房 屋 列 表");
        System.out.println("             6 退       出");
        System.out.println("----------------------------------------------");
        System.out.print("请输入1-6: ");
        int choose = input.nextInt();
        if(choose == 1){
            houseSet.add(Features.additive());
        }
        else if(choose == 2){
            Features.lookUp(houseSet);
        }
        else if(choose == 3){
            houseSet = Features.delHouse(houseSet);
        }
        else if(choose == 4){
            houseSet = Features.modifyInformation(houseSet);
        }
        else if(choose == 5){
            Features.listHouse(houseSet);
        }
        else if(choose == 6){
            System.out.println("欢迎下次使用！");
            break;
        }
        else{
            System.out.println("未知命令");
        }
    }
    input.close();
}
}

class House{
    String name;
    String tel;
    String address;
    int monthlyRent;
    String Rent;
    public House(String name,String tel,String address,int monthlyRent,boolean whetherToRent){
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.monthlyRent = monthlyRent;
        if(whetherToRent){
            Rent = "已出租";
        }
        else{
            Rent = "未出租";
        }
    }
    @Override
    public String toString() {
        
        return "House{name:"+name+";tel:"+tel+";address:"
        +address+";monthlyRent:"+monthlyRent+";whetherToRent:"+Rent+"}";
    }
}

class Features{
    public static House additive(){
        System.out.println("------------------添加房屋------------------");
        Scanner inputAdd = new Scanner(System.in);
        System.out.print("姓名:");
        String name = inputAdd.next();
        System.out.print("电话:");
        String tel = inputAdd.next();
        System.out.print("地址:");
        String address = inputAdd.next();
        System.out.print("月租:");
        int monthlyRent = inputAdd.nextInt();
        House newHouse = new House(name, tel, address, monthlyRent, false);
        System.out.println("------------------添加完成------------------");
        return newHouse;
    }

    public static void lookUp(ArrayList<House> houseSet){
        System.out.println("------------------查找房屋------------------");
        Scanner inputId = new Scanner(System.in);
        System.out.print("请输入想要查找的id:");
        int id = inputId.nextInt();
        if(houseSet.size()<id){
            System.out.println("-----------------没有该房屋------------------");
        }
        else{
            House findHouse = (House) houseSet.get(id);
            System.out.println("id" +"\t\t" + "name" + "\t" + "tel" + "\t" + "address" + "\t" + "monthlyRent" + "\t" + "Rent");
            System.out.println(id +"\t\t" + findHouse.name + "\t" + findHouse.tel + "\t" + findHouse.address + "\t" + findHouse.monthlyRent + "\t\t" + findHouse.Rent);
        }
    }

    public static ArrayList<House> delHouse(ArrayList<House> houseSet){
        System.out.println("------------------删除房屋------------------");
        Scanner inputDel = new Scanner(System.in);
        System.out.print("请选择待删除房屋编号:");
        int id = inputDel.nextInt();
        if((id != -1)||(id < houseSet.size())){
            System.out.println("确认是否删除(Y/N),请小心选择");
            System.out.print("请输入你的选择:");
            String del = inputDel.next();
            if(del.equals("Y")){
                houseSet.remove(id);
                System.out.println("------------------删除完成------------------");
            }
            else{
                System.out.println("未删除...");
            }
        }
        return houseSet;
    }



    public static void listHouse(ArrayList<House> houseSet){
        System.out.println("id" +"\t\t" + "name" + "\t" + "tel" + "\t" + "address" + "\t" + "monthlyRent" + "\t" + "Rent");
        for(int i= 0;i<houseSet.size();i++){
            System.out.println(i +"\t\t" + houseSet.get(i).name + "\t" + houseSet.get(i).tel + "\t" + houseSet.get(i).address + "\t" + houseSet.get(i).monthlyRent + "\t\t" + houseSet.get(i).Rent);
        }
    }

    public static ArrayList<House> modifyInformation(ArrayList<House> houseSet){
        Scanner inputModify = new Scanner(System.in);
        System.out.println("请选择要修改的房屋id:");
        int id = inputModify.nextInt();
        if(id < houseSet.size()){
            System.out.print("请输入姓名:");
            String name = inputModify.next();
            System.out.print("请输入电话:");
            String tel = inputModify.next();
            System.out.print("请输入地址:");
            String adress = inputModify.next();
            System.out.print("请输入月租:");
            int mouthRent = inputModify.nextInt();
            System.out.print("请输入出租状态:");
            boolean rent = Boolean.valueOf(inputModify.next()).booleanValue();
            houseSet.get(id).name = name;
            houseSet.get(id).tel= tel;
            houseSet.get(id).address = adress;
            houseSet.get(id).monthlyRent = mouthRent;
            if(rent){
                houseSet.get(id).Rent = "已出租";
            }
            else{
                houseSet.get(id).Rent = "未出租";
            }            
        }
        else{
            System.out.println("未找到该房屋，自动返回主页...");
        }
        return houseSet;
    }
}