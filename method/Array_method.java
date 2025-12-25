    package method;
    import java.util.Scanner;
    public class Array_method {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            
            int [] number = inputarr(n);
            outputarr(number);
            
            
        }
        static int[] inputarr(int n){
            Scanner kb = new Scanner(System.in);
            int [] arr = new int [n];
            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
                
            }
            return arr ;
        }
        //ถ้าใช้ void ไม่ต้องใช้ return 
        static void outputarr(int [] arr ){
            for (int i = 0; i < arr.length; i++) {
                System.out.println("num "+arr[i]);
            }
            
        }
    }
