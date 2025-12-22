public class Array {
    public static void main(String[] args) {
        //กำหนดขนาด อาเร
        int []number=new int[4];

        //กำหนดค่า
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;

        System.out.println("out put number[1] is "+number[1]);

        // แบบกำหนดสมาชิก
        int []num={0,10,20,30,40,100,200,50,60,70,90};
        System.out.println("output num[3]"+num[3]);
        int size = num.length;
        //ได้2แบบ
        System.out.println(num.length);
        System.out.println(size);


    }
}
