package net.alifproduction.wakhyudi.breadstore;

public class FillingFactory extends AbstractFactory {
    @Override
    Bread getBread(String bread) {
        return null;
    }

    @Override
    Filling getFilling(String filling) {

        if(filling.equals("CHE")){
            return new Cheese();
        }else if(filling.equals("TOM")){
            return new Tomato();
        }
        return null;
    }

    @Override
    Drink getDrink(String drink) {
        return null;
    }
}
