package co.suggesty;

import co.suggesty.adapter.Adapter;
import co.suggesty.adapter.AdapterImpl;
import co.suggesty.strategy.Axe;
import co.suggesty.strategy.GameCharacter;
import co.suggesty.strategy.Knife;
import co.suggesty.strategy.Sword;
import co.suggesty.templatemethod.AbstGameConnectHelper;
import co.suggesty.templatemethod.DefaultGameConnectHelper;

public class Run {
    //    Strategy Pattern
    public void strategy() {
        GameCharacter character = new GameCharacter();
        character.attack();

        character.setWeapon(new Knife());
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

    public void templateMethod() {
        AbstGameConnectHelper helper = new DefaultGameConnectHelper();
        helper.requestConnection("ID / PASSWORD");

    }
}
