package Food_Ordering_System;

public class Chines_MainCourse implements MainCourse {
    String FoodType;
    Chines_MainCourse() {
        FoodType = "Chines Main Course";
    }
    public String OrderMainCourse() {
        return FoodType;
    }
}
