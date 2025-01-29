package Food_Ordering_System;

public class Chines_Appetizers implements IAppetizers {
    String FoodType;
    Chines_Appetizers(){
        FoodType = "Chines IAppetizers";
    }
    public String OrderAppetizers(){
        return FoodType;
    }
}
