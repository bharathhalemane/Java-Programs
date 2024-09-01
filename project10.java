import java.util.Scanner;
class project10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word=sc.nextLine();
        int num=word.length();
        int num2=num/2;
        String hfword=word.substring(0,num2);
        System.out.println(hfword);
    }
}