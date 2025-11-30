public class ButterflyPattern {

    public static void print_Butterfly(int rows){
        for(int i = 1;i<=rows;i++){
                for(int k = 1;k<=i;k++){
                    System.out.print("*");
                }
                for(int k = 1;k<=rows-i;k++){
                    System.out.print(" ");
                }
                for(int k = 1;k<=rows-i;k++){
                    System.out.print(" ");
                }
                for(int k = 1;k<=i;k++){
                    System.out.print("*");
                }
            System.out.println();
        }
        for(int i = rows;i>=1;i--){
                for(int k = 1;k<=i;k++){
                    System.out.print("*");
                }
                for(int k = 1;k<=rows-i;k++){
                    System.out.print(" ");
                }
                for(int k = 1;k<=rows-i;k++){
                    System.out.print(" ");
                }
                for(int k = 1;k<=i;k++){
                    System.out.print("*");
                }
            System.out.println();
        }


    }
    public static void main(String args[]){
        print_Butterfly(4);
    }
}
