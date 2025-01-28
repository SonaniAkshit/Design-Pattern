package Food_Ordering_System;

public class Indian_MainCourse implements MainCourse {
    String FoodType;
    Indian_MainCourse() {
        FoodType = "Chines Main Course";
    }
    public String OrderMainCourse() {
        return FoodType;
    }
}
