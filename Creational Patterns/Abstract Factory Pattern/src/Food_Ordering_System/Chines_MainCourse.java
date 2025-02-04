package Food_Ordering_System;

public class Chines_MainCourse implements IMainCourse {
    String FoodType;
    Chines_MainCourse() {

        FoodType = "Chines Main Course Ordered";
    }
    public String OrderMainCourse() {

        return FoodType;
    }
}
