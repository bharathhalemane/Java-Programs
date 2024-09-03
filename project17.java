import java.util.Scanner;

class project17{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a password contain more than 7 characters:");
        String psw=sc.nextLine();
        int len=psw.length();
        if (len>=7){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}