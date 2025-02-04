package Food_Ordering_System;

public class Indian_Desserts implements IDesserts {
    String FoodType;
    Indian_Desserts(){

        FoodType = "Indian Desserts Ordered";
    }
    public String OrderDesserts() {
        return FoodType;
    }
}
