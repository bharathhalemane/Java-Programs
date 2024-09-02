import java.util.Scanner;
class project15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the km:");
        float a=sc.nextFloat();
        float b=1000*a;
        int d=(int) b;
        System.out.println(d);
    }
}