import java.util.Scanner;

public class TakeInputUntilZero {
    public static void main(String[] args) {
        int sum=0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number ");

        while(scn.nextInt()!=0){
            System.out.println("Sum till Zero is "+scn.nextInt());

             sum+=scn.nextInt();
        }
        // System.out.println("Sum till Zero is "+sum);
    }
}
