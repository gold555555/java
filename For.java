public class For {
    public static void main(String[] args) {
        int []number = {1,2,3,5,12,36,59,20,35,26,25,34};
        //normal for loop
        for(int i = 0 ; i < number.length ; i++){
            System.out.println(number[i]);
        }
        //foreach
        String []text = {"apple","dog" , "cat"};
            for (String data : text) {
                    System.out.println(data);
            }
            
            int sum = 0 ;
        for (int item : number) {
            sum += item;
        }
        System.out.println(sum);
    }   
}
