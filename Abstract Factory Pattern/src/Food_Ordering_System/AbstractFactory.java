package Food_Ordering_System;

import java.util.Locale;

interface AbstractFactory {

    Appetizers getAppetizers();
    Desserts getDesserts();
    MainCourse getMainCourse();

    static AbstractFactory getCuisine(String cuisine) {

        AbstractFactory factory = null;
        switch (cuisine.toLowerCase()) {
            case "Indian":
                factory = new IndianFactory();
                break;
            case "Chines":
                factory = new ChineseFactory();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + cuisine.toLowerCase());
        }
        return factory;

//        return switch (cuisine.toLowerCase()) {
//            case "Indian" -> new IndianFactory();
//            case "Chinese" -> new ChineseFactory();
//            default -> throw new IllegalArgumentException();
//        };

    }
}
