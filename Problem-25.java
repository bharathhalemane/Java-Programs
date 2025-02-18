//Condition: M>=35, P>=35 and C>=35 and total in any of the two subjects >= 90

import java.util.Scanner;

class Problem_25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Math marks: ");
        int m=sc.nextInt();
        System.out.print("Enter the Physics marks: ");
        int p=sc.nextInt();
        System.out.print("Enter the Chemistry marks: ");
        int c=sc.nextInt();

        if(m>=35 && p>=35 && c>=35){
            if (m+p>=90){
                System.out.println("True");
            }
            else if(m+c>=90){
                System.out.println("True");
            }
            else if(p+c>=90){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
        else{
            System.out.println("False");
        }
    }
}
