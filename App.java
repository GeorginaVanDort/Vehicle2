import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {

    ...

      if (navigationChoice.equals("All Vehicles")){
        for ( Vehicle individualVehicle : allVehicles ) {
          System.out.println( "----------------------" );
          System.out.println( individualVehicle.getYear() );
          System.out.println( individualVehicle.getBrand() );
          System.out.println( individualVehicle.getModel() );
          System.out.println( individualVehicle.getMiles() );
          System.out.println( individualVehicle.getPrice() );
        }
      } else if (navigationChoice.equals("Search Price")){

          ...

        for ( Vehicle individualVehicle : allVehicles ) {
          if (individualVehicle.worthBuying(userMaxBudget)){
            System.out.println( "----------------------" );
            System.out.println( individualVehicle.getYear() );
            System.out.println( individualVehicle.getBrand() );
            System.out.println( individualVehicle.getModel() );
            System.out.println( individualVehicle.getMiles() );
            System.out.println( individualVehicle.getPrice() );
          }
        }
      } else if (navigationChoice.equals("Add Vehicle")){

          ...

          System.out.println( userVehicle.getYear() );
          System.out.println( userVehicle.getBrand() );
          System.out.println( userVehicle.getModel() );
          System.out.println( userVehicle.getMiles() );
          System.out.println( userVehicle.getPrice() );
      } else if (navigationChoice.equals("Exit")){
      } else {
        System.out.println("I'm sorry, I didn't understand that input, please check your spelling.");
      }
      System.out.println("Enter one of the following options: All Vehicles, Search Price, Add Vehicle, or Quit");
      navigationChoice = c.readLine();
    }
  }
}