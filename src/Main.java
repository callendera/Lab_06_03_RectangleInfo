import java.util.*;
public class Main
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double w;
        double l;

        System.out.print("Enter length of rectangle: ");
        l = scanner.nextDouble();

        System.out.print("Enter width of rectangle: ");
        w = scanner.nextDouble();

        if(l < 0 || w < 0 )
            System.out.println("Error: Bad Input!!");
        else
        {
            System.out.println("Perimeter of rectangle: "+ (2*(l+w))+" Unit " );

            System.out.println("Area of rectangle: "+l*w+" Unit square");

            System.out.println("Diagonal of rectangle: " + (Math.sqrt( Math.pow(l,2) + Math.pow(w,2) ) )+" Unit" );
        }
    }
}