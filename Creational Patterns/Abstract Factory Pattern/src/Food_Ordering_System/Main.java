package Food_Ordering_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IAbstractFactory ABS;
        String Result = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the [Indian,Chinese]");
        String Cuisine = scan.nextLine();

        System.out.println("Enter the cuisine name [Appetizers,Desserts,MainCourse]");
        String Product = scan.nextLine();

        ABS = IAbstractFactory.getCuisine(Cuisine);

        switch (Product) {
            case "Appetizers":
                IAppetizers Ap = ABS.getAppetizers();
                Result = Ap.OrderAppetizers();
                break;
            case "Desserts":
                IDesserts De = ABS.getDesserts();
                Result = De.OrderDesserts();
                break;
            case "MainCourse":
                IMainCourse Mc = ABS.getMainCourse();
                Result = Mc.OrderMainCourse();
                break;
            default:
                System.out.println("\nInvalid input");
        }
        System.out.println(Result);
    }
}
