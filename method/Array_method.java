    package method;
    import java.util.Scanner;
    public class Array_method {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int [] number = new int[n] ;
            for (int i = 0; i < n; i++) {
                number[i] = sc.nextInt();
            }
            outputarr(number);
            
        }
        //ถ้าใช้ void ไม่ต้องใช้ return 
        static int outputarr(int [] arr ){
            for (int i = 0; i < arr.length; i++) {
                System.out.println("num "+arr[i]);
            }
            return 0 ;
        }
    }
