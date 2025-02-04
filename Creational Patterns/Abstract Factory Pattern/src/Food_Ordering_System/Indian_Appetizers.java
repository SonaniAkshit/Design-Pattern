package Food_Ordering_System;

public class Indian_Appetizers implements IAppetizers {
    String FoodType;
    Indian_Appetizers(){
        FoodType = "Indian Appetizers Ordered";
    }
    public String OrderAppetizers(){
        return FoodType;
    }
}
