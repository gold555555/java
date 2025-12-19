import java.util.Scanner;

public class Inputtutorial {
    public static void main(String[] args) {
        //รับค่า
        System.out.print("input your name : ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine() ;
        System.out.println(name);

        System.out.print("Year of birth ");
        Scanner pc=new Scanner(System.in);
        int x = pc.nextInt();
        System.out.print(x);
    }
}
