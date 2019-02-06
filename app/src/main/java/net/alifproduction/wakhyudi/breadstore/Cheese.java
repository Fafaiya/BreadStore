package net.alifproduction.wakhyudi.breadstore;

public class Cheese implements Filling {
    @Override
    public String name() {
        return "Cheese";
    }

    @Override
    public String calories() {
        return " : 40 kcal";
    }
}
