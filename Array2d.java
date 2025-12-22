public class Array2d {
    public static void main(String[] args) {
        String [][] product = {
            {"chair" , "table","note"},
            {"microphone" , "phone" , "gold"},
           
        };

        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[i].length; j++) {
                    System.out.print(" "+product[i][j]);
            }
            System.out.println();
        }
    }
}
