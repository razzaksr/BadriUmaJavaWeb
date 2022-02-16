package application.console.badri.BadriConsoleApplication;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Product p1=new Product("16GB pendrive", "Sandisk", 20, new String[] {"Black","Red"}, 250);
    	Product p2=new Product("Airdopes", "Boat", 180, new String[] {"White","Blue","Red"}, 999);
    	Product p3=new Product("15AC2022 Laptop", "Dell", 45, new String[] {"Grey","Silver","Black"}, 87600);
        CommerceController controller=new CommerceController();
        System.out.println(Arrays.toString(controller.available()));
        System.out.println(controller.newStock(p1));System.out.println(controller.newStock(p2));
        System.out.println(controller.newStock(p3));
        System.out.println(Arrays.toString(controller.available()));
    }
}
