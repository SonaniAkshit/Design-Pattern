package Food_Ordering_System;

public class Indian_Appetizers implements IAppetizers {
    String FoodType;
    Indian_Appetizers(){
        FoodType = "Indian IAppetizers";
    }
    public String OrderAppetizers(){
        return FoodType;
    }
}
