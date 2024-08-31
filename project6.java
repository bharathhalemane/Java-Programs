import java.util.Scanner;
class project6 {
    public static void main(String[] args) { 
        // Write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digital value:");
        int Int=sc.nextInt();
        int num1=Int/10;
        int num2=Int%10;
        System.out.printf("%d%d",num2,num1);
    }
}