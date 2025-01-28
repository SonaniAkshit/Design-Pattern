package Food_Ordering_System;

public class Chines_Desserts implements Desserts {
    String FoodType;
    Chines_Desserts(){
        FoodType = "Chines Desserts";
    }
    public String OrderDesserts() {
        return FoodType;
    }
}
