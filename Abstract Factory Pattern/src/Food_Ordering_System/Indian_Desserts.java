package Food_Ordering_System;

public class Indian_Desserts implements Desserts{
    String FoodType;
    Indian_Desserts(){
        FoodType = "Chines Desserts";
    }
    public String OrderDesserts() {
        return FoodType;
    }
}
