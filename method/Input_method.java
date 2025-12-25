package method;
import java.util.Scanner;
public class Input_method {
    public static void main(String[] args) {
        display("gold"); //  gold is argument
        display("gear");
        display("tonnam");
        //......................................................................
        //การ retrun ค่า ต้องมีตัวแปรรับ
        String myIp = getIp();
        System.out.println(myIp);
        System.out.println(getIp());
        //......................................................................
        Scanner sc = new Scanner(System.in);
        System.out.print("How long you work here : ");
        int month = sc.nextInt();
        int salary = money(month);
        System.out.println(salary);
    }

    static void display (String message){ //message is parameter
        System.out.println(message);
    } 
    
    // การreturn ข้อมูล
    static String getIp(){
        return "0.000.269.951";
    }
    //
    static int money(int n){
        int x ;
        x = n*10000;
        return x ;
    }

}

