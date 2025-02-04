package Food_Ordering_System;

public class IndianFactory implements IAbstractFactory {

    public IAppetizers getAppetizers(){

        return new Indian_Appetizers();
    }

    public IDesserts getDesserts(){

        return new Indian_Desserts();
    }
    public IMainCourse getMainCourse(){

        return new Indian_MainCourse();
    }
}
