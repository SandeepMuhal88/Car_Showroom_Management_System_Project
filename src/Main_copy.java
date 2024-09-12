import java.util.*;
import java.lang.*;
import java.util.UUID;

interface utility{
    public void get_details();
    public void set_details();
}
// import java.sql.SQLOutput;
// import java.util.Scanner;
class Showroom implements utility {
    String Showroom_Name;
    String Showroom_Address;
    int Total_car_in_Stock=0;
    int Total_Employee;
    String Manager_Name;
    @Override
    public void get_details(){
        System.out.println("Showroom Name:-"+Showroom_Name);
        System.out.println("Showroom Address:-"+Showroom_Address);
        System.out.println("Manager Name:-"+Manager_Name);
        System.out.println("Total Number of Employee:-"+Total_Employee);
        System.out.println("Total Car in Stock:-"+Total_car_in_Stock);

    }
    @Override
    public void set_details(){
        Scanner sc=new Scanner(System.in);
        System.out.println("====================== ***** ENTER SHOWROOM DETAILS ***** =================================");
        System.out.println();
        System.out.println("Showroom Name");
        Showroom_Name =sc.nextLine();
        System.out.println("Showroom Address");
        Showroom_Address=sc.nextLine();
        System.out.println("Manager Name");
        Manager_Name=sc.nextLine();
        System.out.println("Totals Employee");
        Total_Employee=sc.nextInt();
        System.out.println("Totals Car in Stock");
        Total_car_in_Stock=sc.nextInt();

    }

}
 class Employee extends Showroom implements utility{
    int emp_age;
    String emp_id;
    String emp_Name;
    String emp_department;
    @Override
    public void get_details(){
        System.out.println("Showroom Name"+Showroom_Name);
        System.out.println("Employee ID "+emp_id);
        System.out.println("Employee Department "+emp_department);
        System.out.println("Employee Name"+emp_Name);
        System.out.println("Employee Age"+emp_age);
    }
    @Override
    public void set_details(){
        Scanner sc=new Scanner(System.in);
        UUID uuid=UUID.randomUUID();
        System.out.println("=========================== ******** ENTER EMPLOYEE DETAILS ******* =========================");
        System.out.println();
        System.out.println("Enter Employee ID");
        emp_id=uuid.toString();
        System.out.println("Showroom Name");
        Showroom_Name = sc.nextLine();
        System.out.println("Employee Department ");
        emp_department = sc.nextLine();
        System.out.println("Employee Name");
        emp_Name = sc.nextLine();
        System.out.println("Employee Age ");
        emp_age = sc.nextInt();
        sc.nextLine();
    }
}
 class car extends Showroom implements utility{
    String car_name;
    String car_color;
    int car_price;
    String car_type;
    String car_transmission;
    String car_f_type;
    @Override
    public void get_details(){
        System.out.println("Car Name: " + car_name);
        System.out.println("Car Color: " + car_color);
        System.out.println("Car Price: " + car_price);
        System.out.println("Car Type: " + car_type);
        System.out.println("Car Transmission: " + car_transmission);
        System.out.println("Car F Type: " + car_f_type);

    }
    @Override
    public void set_details(){
        Scanner sc=new Scanner(System.in);
        System.out.println("====================== ***** ENTER SHOWROOM DETAILS ***** =================================");
        System.out.println();
        System.out.print("Enter Car Name: ");
        car_name=sc.nextLine();
        System.out.print("Enter Car Color: ");
        car_color=sc.nextLine();
        System.out.print("Enter Car Price: ");
        car_price=sc.nextInt();
        System.out.print("Enter Car Type:(SUDAN/SUV/HATCHBACK):-");
        car_type=sc.nextLine();
        System.out.print("Enter Car Transmission:(AUTOMATIC/MANUAL):- ");
        car_transmission=sc.nextLine();
        System.out.print("Enter Car F Type:(PETROL/DEISEL):-");
        car_f_type=sc.nextLine();
        Total_car_in_Stock++;

    }

    
}




public class Main_copy {

    static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employee employee[] = new Employee[5];
        car car[] = new car[5];
        int car_counter = 0;
        int showroom_counter = 0;
        int employees_counter = 0;
        int choice = 100;
        while(choice!=0){

            main_menu();
            choice = sc.nextInt();

            while(choice!=9 && choice!=0){
                switch (choice) {
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employee[employees_counter] = new Employee();
                        employee[employees_counter].set_details();
                        employees_counter++;
                        System.out.println();
                        System.out.println("2].ADD NEW EMPLOYEE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        car[car_counter] = new car();
                        car[car_counter].set_details();
                        car_counter++;
                        System.out.println();
                        System.out.println("3].ADD NEW CAR");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < showroom_counter; i++) {
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employees_counter; i++) {
                            employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < car_counter; i++) {
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }


    }
}
