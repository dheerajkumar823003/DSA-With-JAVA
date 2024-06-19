import java.util.Scanner;
public class Lcm {
    public static void  main(String[]args){
        int a,b,lcm=0;
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=(a>b)?a:b;i<=a*b;i++){
            if(i%a==0 && i%b==0){
                lcm=i;
                break;
            }
        }
        System.out.println("lcm is given two number is::"+lcm);
    }
}
