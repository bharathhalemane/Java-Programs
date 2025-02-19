import java.util.Scanner;

class Problem_27{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num 1:");
        int a=sc.nextInt();
        System.out.print("Enter the num 2:");
        int b=sc.nextInt();

        int A=(a>b)? a : b ;
        System.out.println("Gratest number is: "+A);
    }
}
