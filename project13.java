import java.util.Scanner;
class project13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter breadth value:");
        int a=sc.nextInt();
        System.out.print("Enter length value:");
        int b=sc.nextInt();
        sc.close();
        int area= a*b;
        System.out.println(area);

    }
}