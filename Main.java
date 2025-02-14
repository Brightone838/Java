import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total=0;
        char Grade=0;
        for (int i=1; i <= 7; i++) {
            System.out.println("Enter the unit marks");
            int marks=scanner.nextInt();
            total+=marks;
        }
        double sum=total;
        double average=sum/7;
        if(average>=70){
            Grade='A';
        } else if (average>=60) {
            Grade='B';
        } else if (average>=50) {
            Grade='C';
        } else if (average>=40) {
            Grade='D';
        } else if (average>=-0) {
            Grade='F';
        }
        System.out.println("The sum is"+sum);
        System.out.println("The average is"+average);
        System.out.println("the Grdae is "+Grade);
    }

}
