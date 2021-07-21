import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1, num2, r=0;

        System.out.println("enter 1st #");
        num1 = s.nextInt();
        System.out.println("enter 2nd #");
        num2 = s.nextInt();

        while(num2!=0){
            System.out.println("B4 r:::r="+r+" and num1="+num1+" and num2="+num2);
            r=num1%num2;
            System.out.println("B4 num1 r="+r+" and num1="+num1+" and num2="+num2);
            num1=num2;
            System.out.println("B4 num2 r="+r+" and num1="+num1+" and num2="+num2);
            num2=r;
        }
        System.out.println("\nGCD:" +num1);
    }
}
