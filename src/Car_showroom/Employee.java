package Car_showroom;
import java.util.Scanner;
import java.util.UUID;

@SuppressWarnings("unused")
class Employee extends Showroom implements utility {
   int emp_age;
   String emp_id;
   String emp_Name;
   String emp_department;

   Employee() {
   }

   public void get_details() {
      System.out.println("Showroom Name:-" + this.Showroom_Name);
      System.out.println("Employee ID :-" + this.emp_id);
      System.out.println("Employee Department :-" + this.emp_department);
      System.out.println("Employee Name :-" + this.emp_Name);
      System.out.println("Employee Age :-" + this.emp_age);
   }

   public void set_details() {
      Scanner IN = new Scanner(System.in);
      UUID ID = UUID.randomUUID();
      System.out.println("=========================== ******** ENTER EMPLOYEE DETAILS ******* =========================");
      System.out.println();
      System.out.println("Enter Employee ID:-");
      this.emp_id = ID.toString();
      System.out.println("Showroom Name:-");
      this.Showroom_Name = IN.nextLine();
      System.out.println("Employee Department:- ");
      this.emp_department = IN.nextLine();
      System.out.println("Employee Name:-");
      this.emp_Name = IN.nextLine();
      System.out.println("Employee Age:-");
      this.emp_age = IN.nextInt();
      IN.nextLine();
   }
}
