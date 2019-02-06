package net.alifproduction.wakhyudi.breadstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        BreadFactory breadFactory = new BreadFactory();
//        Bread bread = breadFactory.getBread("BRI");
//        Log.d("infoData", "onCreate: "+bread.name());

        AbstractFactory breadFactory  = FactoryGenerator.getFactory("BRE");

        Bread bread = breadFactory.getBread("ROL");



        Log.d("infoData", "onCreate: "+bread.name());



    }
}
