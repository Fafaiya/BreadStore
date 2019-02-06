package net.alifproduction.wakhyudi.breadstore;

public class BreadFactory extends AbstractFactory{
    @Override
    Bread getBread(String bread) {



        if (bread.equals("BRI")){
            return new Brioche();
        }else if(bread.equals("BAG")){
            return new Baguette();
        }else if(bread.equals("ROL")){
            return new Roll();
        }
        return null;
    }

    @Override
    Filling getFilling(String filling) {
        return null;
    }

    @Override
    Drink getDrink(String drink) {
        return null;
    }


    //factory patern , single patern

//    public Bread getBread(String breadType){
//        if (breadType.equals("BRI")){
//            return new Brioche();
//        }else if(breadType.equals("BAG")){
//            return new Baguette();
//        }else if(breadType.equals("ROL")){
//            return new Roll();
//        }
//        return null;
//    }



}
