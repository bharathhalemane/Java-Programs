import java.util.Scanner;

class project21{
    public static void main(String[] args){         
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");        
        String str=sc.nextLine();
        System.out.print("Enter the index to remove:");
        int ind=sc.nextInt();
        if (ind>=0 && ind < str.length()){
            String result=str.replace(String.valueOf(str.charAt(ind)),"");
            System.out.println(result);
        }
        else{
            System.out.println(str);        
        }
        sc.close();
    }
}