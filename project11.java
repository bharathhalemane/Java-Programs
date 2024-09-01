import java.util.Scanner;
class project11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a digit: ");
        int n=sc.nextInt();
        int num1=n/100;
        int num2=(n/10)%10;
        int num3=n%10;
        int tot=num1+num2+num3;
        System.out.println(tot);

    }
}