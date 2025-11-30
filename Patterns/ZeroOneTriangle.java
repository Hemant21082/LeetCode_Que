public class ZeroOneTriangle {

    public static void ZeroOneTri(int rows){
        int count = 1;
        for(int i = 1;i<=rows;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(count);
                if(count == 1){
                    count = 0;
                }
                else {
                    count = 1;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ZeroOneTri(4);
    }
}
