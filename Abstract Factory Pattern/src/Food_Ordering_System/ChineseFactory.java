package Food_Ordering_System;

public class ChineseFactory implements AbstractFactory {
    public Appetizers getAppetizers(){
        return new Chines_Appetizers();
    }
    public Desserts getDesserts(){
        return new Chines_Desserts();
    }
    public MainCourse getMainCourse(){
        return new Chines_MainCourse();
    }

}
