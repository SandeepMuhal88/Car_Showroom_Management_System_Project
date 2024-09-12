// Make a class for Car_Shoeroom that provide setails and input from user
import java.util.Scanner;

class Showroom implements utility
{
    String Showroom_Name;
    String Showroom_Address;
    int Total_car_in_Stock = 0;
    int Total_Employee;
    String Manager_Name;
 
    Showroom() {
    }
     public void get_details() {
      System.out.println("Showroom Name:-" + this.Showroom_Name);
      System.out.println("Showroom Address:-" + this.Showroom_Address);
      System.out.println("Manager Name:-" + this.Manager_Name);
      System.out.println("Total Number of Employee:-" + this.Total_Employee);
      System.out.println("Total Car in Stock:-" + this.Total_car_in_Stock);
   }

   public void set_details() {
      Scanner IN = new Scanner(System.in);
      System.out.println("====================== ***** ENTER SHOWROOM DETAILS ***** =================================");
      System.out.println();
      System.out.println("Showroom Name:-");
      this.Showroom_Name = IN.nextLine();
      System.out.println("Showroom Address:-");
      this.Showroom_Address = IN.nextLine();
      System.out.println("Manager Name:-");
      this.Manager_Name = IN.nextLine();
      System.out.println("Totals Employee:-");
      this.Total_Employee = IN.nextInt();
      System.out.println("Totals Car in Stock:-");
      this.Total_car_in_Stock = IN.nextInt();
   }
}