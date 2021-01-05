package co.suggesty;

import co.suggesty.adapter.Adapter;
import co.suggesty.adapter.AdapterImpl;
import co.suggesty.factoryMethod.concrete.HpItemCreator;
import co.suggesty.factoryMethod.concrete.MpItemCreator;
import co.suggesty.factoryMethod.framework.AbsItemCreator;
import co.suggesty.factoryMethod.framework.Item;
import co.suggesty.prototype.Circle;
import co.suggesty.prototype2.Age;
import co.suggesty.prototype2.Cat;
import co.suggesty.singleton.SystemSpeaker;
import co.suggesty.strategy.Axe;
import co.suggesty.strategy.GameCharacter;
import co.suggesty.strategy.Bow;
import co.suggesty.strategy.Sword;
import co.suggesty.templateMethod.AbstGameConnectHelper;
import co.suggesty.templateMethod.DefaultGameConnectHelper;

public class Run {
    //    Strategy Pattern
    public void strategy() {
        GameCharacter character = new GameCharacter();
        character.attack();

        character.setWeapon(new Bow());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        character.setWeapon(new Axe());
        character.attack();
    }

    //    Adapter Pattern
    public void adapter() {
        Adapter adapter = new AdapterImpl();
        System.out.println(adapter.twiceOf(100f));
        System.out.println(adapter.halfOf(88f));
    }

    //    Template Method Pattern
    public void templateMethod() {
        AbstGameConnectHelper helper = new DefaultGameConnectHelper();
        helper.requestConnection("ID / PASSWORD");

    }

    //    Factory Method Pattern
    public void factoryMethod() {
        AbsItemCreator creator;
        Item item;
        creator = new HpItemCreator();
        item = creator.create();
        item.use();

        creator = new MpItemCreator();
        item = creator.create();
        item.use();
    }

    // Singleton Pattern

    public void singleton() {
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        speaker1.setVolume(21);
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker2.setVolume(15);
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());
    }

    //    ProtoType Pattern
    public void protoType() throws CloneNotSupportedException {
        Circle circle1 = new Circle(1, 1, 3);
        Circle circle2 = circle1.copy();

        System.out.println(circle1.getX() + "," + circle1.getY() + "," + circle1.getR());

        System.out.println(circle2.getX() + "," + circle2.getY() + "," + circle2.getR());
    }

    public void protoType2() throws CloneNotSupportedException {
        Cat navi = new Cat();
        navi.setName("Navi");
        navi.setAge(new Age(2019, 3));

        Cat yo = navi.copy();
        yo.setName("yo");

        yo.getAge().setAge(5);
        yo.getAge().setYear(2018);

        System.out.println(navi.toString());

//        Cat 에서 Clone 할 때 깊은 복사를 했기 때문에, Age 의 주소값이 따로 존재함.
        System.out.println(yo.toString());
    }
}
















































