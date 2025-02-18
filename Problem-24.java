import java.util.Scanner;

class Problem_24{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks of Maths: ");
        int m=sc.nextInt();
        System.out.print("Enter the marks of Physics: ");
        int p=sc.nextInt();
        System.out.print("Enter the marks of Chemistry: ");
        int c=sc.nextInt();
//condition: Sum of marks in any two subjects >=100 and m+p+c >=180
        if (m+p>=100 && m+c>=100 && m+p+c>=180){
            System.out.println("True");
        } else if (m+p>=100 && p+c>=100 && m+p+c>=180) {
            System.out.println("True");
        } else if (m+c>=100 && p+c>=100 && m+p+c>=180) {
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
