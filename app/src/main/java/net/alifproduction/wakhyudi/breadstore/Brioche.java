package net.alifproduction.wakhyudi.breadstore;

public class Brioche implements Bread {
    @Override
    public String name() {
        return "Brioche";
    }

    @Override
    public String calories() {
        return " : 85 kcal";
    }
}
