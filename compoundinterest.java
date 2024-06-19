import java.util.Scanner;
public class compoundinterest {
    public static void main(String args[]){
        int  p,r,t;
        System.out.println("p,r,t");
        Scanner sc = new Scanner(System.in);
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        double amount=p*Math.pow(1+(r/100.0),t);
        double ci=amount-p;
        System.out.println(amount);
        System.out.println(ci);
    }
}
