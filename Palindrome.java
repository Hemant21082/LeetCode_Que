import java.util.Scanner;
public class Palindrome{

    public static boolean check_Palindrome(int num){
        int reverse = 0;
        int input = num;
        while(num != 0){
            int lastdigit = num % 10;
            num = num / 10;
            reverse = reverse * 10 + lastdigit;
        }
        if(input == reverse){
            return true;
        }
        return false;
    }
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        String result = check_Palindrome(num)?"It is a palindrome" : "It is not a palindrome";
        System.out.println(result);
    }
}