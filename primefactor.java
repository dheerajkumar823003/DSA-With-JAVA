import java.util.Scanner;
public class primefactor{
    public static void main(String[] args){
        int num;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(int i=2; i<=num; i+=1){
            if(num%i==0){
                 System.out.println("prime of factor is: ");
            }
        }
    }
}