import java.util.Scanner;
public class reverse_digit {
    public static void main(String[]args){
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int rev=0;
        while(num>0){
            rev = rev*10 + (num%10);
            num/=10;
        }
        System.out.println("reverse"+rev);
    }
}
