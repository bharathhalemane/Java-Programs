import java.util.Scanner;
class project22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Password:");
        String str=sc.nextLine();

        int ind=str.length();
        String first2=str.substring(0,2);
        String last2=str.substring(ind-2);
        String star="";
        if(ind>4){
            for(int i=0;i<ind-4;i++){
                star += "*";
            }
            System.out.print(first2);
            System.out.print(star);
            System.out.print(last2);
        }
        else{
            System.out.println(str);
        }



    }
}