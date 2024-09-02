import java.util.Scanner;

public class project12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value A:");        
        int a=sc.nextInt();
        System.out.print("Enter value B:");
        int b=sc.nextInt();
        int add=a+b;
        int sub=a-b;
        int multi=a*b;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(multi);
    }
}
