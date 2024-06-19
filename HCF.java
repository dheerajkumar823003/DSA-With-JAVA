import java.util.Scanner;
public class HCF {
    public static void main(String[]args){
        int a,b,hcf=0;
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=(a<b)?a:b;i>=1;i--){
            if(a%i==0 && b%i==0){
                hcf=i;
                break;
            }
        }
        System.out.println("hcf of given two number is ::"+hcf);    
    }
}
