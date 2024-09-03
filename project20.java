import java.util.Scanner;

class project20{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks out of 100:");
        int marks=sc.nextInt();
        if (marks>50){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }
}