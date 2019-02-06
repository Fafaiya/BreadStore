package net.alifproduction.wakhyudi.breadstore;

public class DrinkFactory extends AbstractFactory {
    @Override
    Bread getBread(String bread) {
        return null;
    }

    @Override
    Filling getFilling(String filling) {
        return null;
    }

    @Override
    Drink getDrink(String drink) {

        if (drink.equals("TEA")){
            return new IceTea();
        }

        return null;
    }
}
