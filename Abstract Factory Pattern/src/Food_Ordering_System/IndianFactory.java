package Food_Ordering_System;

public class IndianFactory implements AbstractFactory{
    public Appetizers getAppetizers(){
        return new Indian_Appetizers();
    }
    public Desserts getDesserts(){
        return new Indian_Desserts();
    }
    public MainCourse getMainCourse(){
        return new Indian_MainCourse();
    }
}
