package beginnerjava;
import java.util.Scanner;
public class AssignmentDemo {
    public static void main(String[] args){
    Scanner input= new Scanner(System.in);
        int x, y;
        System.out.print("Enter the First Number: ");
        x= input.nextInt();
        System.out.print("Enter the Second Number: ");
        y= input.nextInt();
        x+=y;
        System.out.println("X= "+x);
         x-=y;
        System.out.println("X= "+x);
         x*=y;
        System.out.println("X= "+x);
         x/=y;
        System.out.println("X= "+x);
         x%=y;
        System.out.println("X= "+x);    
    }
}