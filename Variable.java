public class Variable {

    public static void main(String[] args) {
        //นิยามตัวแปร
        //global variable
        final int a= 15,b ,c ;
        float x ;
        double y ;
        //a =5 ;
        System.out.println("value of a is "+a);
        {
            int num = 2; // num คือ local variable
            System.out.println("num is : "+num);
        }
    }
}