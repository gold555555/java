import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name;
        switch (n) {
            case 1:
                name = "มกราคม";
                break;

            case 2:
                name = "กุมพาพันธ์";
                break;

            default:
                name = "not found";
                break;
        }
        System.out.println(name);
    }

}
