package net.alifproduction.wakhyudi.breadstore;

public class IceTea implements Drink {
    @Override
    public String name() {
        return "Ice Tea";
    }

    @Override
    public String calories() {
        return " : 55 kcal";
    }
}
