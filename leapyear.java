import java.util.Scanner;
public class leapyear {
    public static void main(String[] args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the leapyear");
        num=sc.nextInt();
        if(num%4==0||num%400==0){
            System.out.println("leapyear");
        }
        else{
            System.out.println("not leapyear");
        }
    }
}