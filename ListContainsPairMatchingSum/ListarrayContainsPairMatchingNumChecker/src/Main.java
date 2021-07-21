import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers into the list?");
        int amtNum = sc.nextInt();
        int[] arr = new int[amtNum];
        for(int i = 1; i < amtNum+1; i++){
            System.out.println("Please put in number "+i+":");
            arr[i-1] = sc.nextInt();
        }
        System.out.println("Target number: ");
        int targetNum = sc.nextInt();
        System.out.println(containsPairWithSum(arr, targetNum));
    }
    public static boolean containsPairWithSum(int[] a, int x) {
        Arrays.sort(a);
        for (int i = 0, j = a.length - 1; i < j;) {
            System.out.println("Beginning of For: a[i] = " + a[i] + ", a[j] = " + a[j]);
            int sum = a[i] + a[j];
            System.out.println("Sum is: " + sum);
            if (sum < x) {
                System.out.println("In If: a[i] = " + a[i] + ", a[j] = " + a[j] + "\n");
                i++;
            }
            else if (sum > x) {
                System.out.println("In Else If: a[i] = " + a[i] + ", a[j] = " + a[j] + "\n");
                j--;
            }
            else{
                System.out.println("In else: a[i] = " + a[i] + ", a[j] = " + a[j] + "\n");
                return true;
            }
        }
        return false;
    }
}
