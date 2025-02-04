package Food_Ordering_System;

public class ChineseFactory implements IAbstractFactory {
    public IAppetizers getAppetizers(){

        return new Chines_Appetizers();
    }
    public IDesserts getDesserts(){

        return new Chines_Desserts();
    }
    public IMainCourse getMainCourse(){

        return new Chines_MainCourse();
    }

}
