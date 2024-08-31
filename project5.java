import java.util.Scanner;

class project5
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string value:");
        System.out.println("Enter repetation times:");
        String str=sc.nextLine();
        String str1=str+" ";
        int Int=sc.nextInt();
        System.out.println(str1.repeat(Int));
    }
}