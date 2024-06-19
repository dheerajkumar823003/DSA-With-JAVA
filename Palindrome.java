import java.util.Scanner;
public class Palindrome {
    public static void main(String[]args){
        int num;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int rev=0;
        int temp=num;
        int digit;
        while(temp!=0){
            digit = temp%10;
            rev = rev*10+digit;
            temp=temp/10;
        }
        System.out.println("reverse number"+rev);
        if(rev==num){
            System.out.println("it is a palindrome number");
        }
        else{
            System.out.println("it is not palindtome number");
        }
    }
}
