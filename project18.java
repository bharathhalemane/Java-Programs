import java.util.Scanner;

class project18{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a integer value:");
        int n=sc.nextInt();
        boolean sta=(25<n);
        if (sta){
            if (n<75){
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