import java.util.Scanner;
class project8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String word=sc.nextLine();
        System.out.print("Enter index value to get letter: ");
        int num=sc.nextInt();
        char ch=word.charAt(num);
        System.out.println(ch);
    }
}