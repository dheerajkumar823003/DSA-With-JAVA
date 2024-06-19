import java.util.Scanner;
public class Armstrong_number {
    public static void main(String[]args){
        int num;
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int temp= num;
        int digit;
        int sum=0;
        while(temp!=0){
            digit = temp%10;
            sum = sum+(digit*digit*digit);
            temp/=10;
        }
        if(sum==num){
            System .out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong number");
        }
    }
}
