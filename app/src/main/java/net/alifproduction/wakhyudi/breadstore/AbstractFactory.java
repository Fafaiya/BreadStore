package net.alifproduction.wakhyudi.breadstore;

public abstract class AbstractFactory {

    abstract Bread getBread(String bread);
    abstract Filling getFilling(String filling);
    abstract Drink getDrink(String drink);

}
