package Food_Ordering_System;

public class Chines_Appetizers implements IAppetizers {
    String FoodType;
    Chines_Appetizers(){

        FoodType = "Chines Appetizers Ordered";
    }
    public String OrderAppetizers(){

        return FoodType;
    }
}
