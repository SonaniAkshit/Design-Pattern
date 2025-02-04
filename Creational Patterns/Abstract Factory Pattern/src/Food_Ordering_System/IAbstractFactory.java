package Food_Ordering_System;

interface IAbstractFactory {

    IAppetizers getAppetizers();
    IDesserts getDesserts();
    IMainCourse getMainCourse();

    static IAbstractFactory getCuisine(String cuisine) {

        IAbstractFactory factory = null;

        switch (cuisine) {
            case "Indian":
                factory = new IndianFactory();
                break;
            case "Chines":
                factory = new ChineseFactory();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + cuisine);
        }
        return factory;
    }
}
