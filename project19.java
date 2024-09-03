import java.util.Scanner;

class project19{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Password:");
        String psw=sc.nextLine();
        int len=psw.length();
        StringBuilder output=new StringBuilder();
        char firstchar=psw.charAt(0);
        char lastchar=psw.charAt(len-1);
        output.append(firstchar);
        for (int i=1;i<len-1;i++){
            output.append("*");
        }
        output.append(lastchar);
        
        System.out.println(output);
    }
}