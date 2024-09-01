import java.util.Scanner;
class project9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word=sc.nextLine();
        int num=word.length();
        int ind=num-1;
        System.out.println(word.substring(ind));
    }
}