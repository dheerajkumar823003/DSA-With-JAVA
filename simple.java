import java.util.Scanner;
public class simple{
    public static void main(String[] args){
        int p,t,r,simple;
        System.out.println("Enter the simple intrest");
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        t = sc.nextInt();
        r = sc.nextInt();
        simple = (p*t*r)/100;
        System.out.println("simple intrest: "+simple);
    }
}