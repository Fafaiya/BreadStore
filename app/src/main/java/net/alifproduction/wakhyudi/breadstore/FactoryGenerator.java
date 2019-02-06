package net.alifproduction.wakhyudi.breadstore;

public class FactoryGenerator {

    public static AbstractFactory getFactory(String factory){

        if(factory.equals("BRE")){
            return new BreadFactory();
        }else if(factory.equals("FIL")){
            return new FillingFactory();
        }
        return null;
    }
}
