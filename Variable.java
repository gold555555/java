public class Variable {

    public static void main(String[] args) {
        //นิยามตัวแปร
        //global variable
        final int a= 15 ;
        float x = 3.145f;
        double y ;
        //a =5 ;
        System.out.println("value of a is "+a);
        {
            int num = 2; // num คือ local variable
            System.out.println("num is : "+num);
        }
        
        // เล้ก ---> ใหญ่
        int num1 = 10;
        double numDouble = num1;
        System.out.println("int to double : "+numDouble);
        
        //ใหญ๋ --> เล็ก 
        double numDouble2 = 10.0 ;
        int numInt = (int)numDouble2;
        System.out.println("double to int : "+numInt);

        String b="100" ;
        int c ;
        //string to int 
        c=Integer.parseInt(b);
        c=c+50 ;
        System.out.println("string to int : "+c);
    }
}