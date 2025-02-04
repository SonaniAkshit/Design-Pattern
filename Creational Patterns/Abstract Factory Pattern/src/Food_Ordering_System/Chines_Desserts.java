package Food_Ordering_System;

public class Chines_Desserts implements IDesserts {
    String FoodType;
    Chines_Desserts(){

        FoodType = "Chines Desserts Ordered";
    }
    public String OrderDesserts() {

        return FoodType;
    }
}
