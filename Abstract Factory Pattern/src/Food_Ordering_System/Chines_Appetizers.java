package Food_Ordering_System;

public class Chines_Appetizers implements Appetizers{
    String FoodType;
    Chines_Appetizers(){
        FoodType = "Chines Appetizers";
    }
    public String OrderAppetizers(){
        return FoodType;
    }
}
