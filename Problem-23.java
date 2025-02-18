import java.util.Scanner;
//Given a student has scored marks in maths, physics and chemistry.
//if a student is eligible for admission in a professional course.
//conditions: 1) M>=70 and P >= 60 and C >= 60 2) M+C+P >= 180
class Problem_23{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks of Maths:");
        int m=sc.nextInt();
        System.out.print("Enter the marks of physics:");
        int p=sc.nextInt();
        System.out.print("Enter the marks of chemsitry:");
        int c=sc.nextInt();

        if (m>=70 && p>=60 && c>=60){

            System.out.println("He/She is Eligible for admission.");
        }
        else if (m+p+c>=180) {
            System.out.println("He/She is Eligible for admission.");
        }

        else{
            System.out.println("He/She is not Eligible for admission.");
        }
    }
}
