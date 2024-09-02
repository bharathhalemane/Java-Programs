import java.util.Scanner;
class project14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the breadth of rectangle:");
        int a=sc.nextInt();
        System.out.print("Enter the length of rectangle:");
        int b=sc.nextInt();
        sc.close();
        int per=2*(a+b);
        System.out.println(per);
    }
}