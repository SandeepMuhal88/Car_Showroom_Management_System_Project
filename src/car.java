import java.util.Scanner;

class car extends Showroom implements utility {
   String car_name;
   String car_color;
   int car_price;
   String car_type;
   String car_transmission;
   String car_f_type;

   car() {
   }

   public void get_details() {
      System.out.println("Car Name: " + this.car_name);
      System.out.println("Car Color: " + this.car_color);
      System.out.println("Car Price: " + this.car_price);
      System.out.println("Car Type: " + this.car_type);
      System.out.println("Car Transmission: " + this.car_transmission);
      System.out.println("Car F Type: " + this.car_f_type);
   }

   public void set_details() {
      Scanner sc = new Scanner(System.in);
      System.out.println("====================== ***** ENTER SHOWROOM DETAILS ***** =================================");
      System.out.println();
      System.out.print("Enter Car Name: ");
      this.car_name = sc.nextLine();
      System.out.print("Enter Car Color: ");
      this.car_color = sc.nextLine();
      System.out.print("Enter Car Price: ");
      this.car_price = sc.nextInt();
      System.out.print("Enter Car Type:(SUDAN/SUV/HATCHBACK):-");
      this.car_type = sc.nextLine();
      System.out.print("Enter Car Transmission:(AUTOMATIC/MANUAL):- ");
      this.car_transmission = sc.nextLine();
      System.out.print("Enter Car F Type:(PETROL/DEISEL):-");
      this.car_f_type = sc.nextLine();
      ++this.Total_car_in_Stock;
   }
}
