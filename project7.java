import java.util.Scanner;
class project7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first num:");
        int fn=sc.nextInt();
        System.out.print("Enter the second num:");
        int sn=sc.nextInt();
        int sum=fn+sn;
        System.out.print("The Sum is: ");
        System.out.println(sum);
    }
}