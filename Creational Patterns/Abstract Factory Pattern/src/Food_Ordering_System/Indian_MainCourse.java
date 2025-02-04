package Food_Ordering_System;

public class Indian_MainCourse implements IMainCourse {
    String FoodType;
    Indian_MainCourse() {

        FoodType = "Indian Main Course Ordered";
    }
    public String OrderMainCourse() {

        return FoodType;
    }
}
