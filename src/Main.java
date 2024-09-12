// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class Main {
   public Main() {
   }

   static void main_menu() {
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
      Showroom[] arr = new Showroom[5];
      Employee[] brr = new Employee[5];
      car [] crr=new car[5];
      int car_counter = 0;
      int showroom_counter = 0;
      int employees_counter = 0;
      int choice = 100;

      label60:
      while(choice != 0) {
         main_menu();
         choice = sc.nextInt();

         while(true) {
            while(true) {
               if (choice == 9 || choice == 0) {
                  continue label60;
               }

               int var9;
               switch (choice) {
                  case 1:
                     arr[showroom_counter] = new Showroom();
                     arr[showroom_counter].set_details();
                     ++showroom_counter;
                     System.out.println();
                     System.out.println("1].ADD NEW SHOWROOM");
                     System.out.println("9].GO BACK TO MAIN MENU");
                     choice = sc.nextInt();
                     break;
                  case 2:
                     brr[employees_counter] = new Employee();
                     brr[employees_counter].set_details();
                     ++employees_counter;
                     System.out.println();
                     System.out.println("2].ADD NEW EMPLOYEE");
                     System.out.println("9].GO BACK TO MAIN MENU");
                     choice = sc.nextInt();
                     break;
                  case 3:
                  crr[car_counter] = new car();
                  crr[car_counter].set_details();
                  car_counter++;
                  System.out.println();
                  System.out.println("3].ADD NEW CAR");
                  System.out.println("9].GO BACK TO MAIN MENU");
                  choice = sc.nextInt();
                  break;
                  case 4:
                     for(int i= 0; i < showroom_counter; ++i) {
                        arr[i].get_details();
                        System.out.println();
                        System.out.println();
                     }

                     System.out.println();
                     System.out.println("9].GO BACK TO MAIN MENU");
                     System.out.println("0].EXIT");
                     choice = sc.nextInt();
                     break;
                  case 5:
                     for(int i = 0; i < employees_counter; ++i) {
                        brr[i].get_details();
                        System.out.println();
                        System.out.println();
                     }

                     System.out.println();
                     System.out.println("9].GO BACK TO MAIN MENU");
                     System.out.println("0].EXIT");
                     choice = sc.nextInt();
                     break;
                  case 6:
                     for(int i = 0; i < car_counter; ++i) {
                        System.out.println();
                        System.out.println();
                     }

                     System.out.println();
                     System.out.println("9].GO BACK TO MAIN MENU");
                     System.out.println("0].EXIT");
                     choice= sc.nextInt();
                     break;
                  default:
                     System.out.println("ENTER VALID CHOICE: ");
               }
            }
         }
      }

   }
}
