package Food_Ordering_System;

public class Indian_Appetizers implements Appetizers{
    String FoodType;
    Indian_Appetizers(){
        FoodType = "Chines Appetizers";
    }
    public String OrderAppetizers(){
        return FoodType;
    }
}
