package co.suggesty;

import co.suggesty.strategy.*;

public class Main {

    public static void main(String[] args) {
        Run run = new Run();
//        Strategy Pattern
//        run.strategy();

//        Adapter Pattern
//        run.adapter();

//        Template Method Pattern
//        run.templateMethod();

//        Factory Method Pattern
//        run.factoryMethod();

//        Singleton Pattern
//        run.singleton();

//        Prototype Pattern
        try {
//            run.protoType();
            run.protoType2();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}


