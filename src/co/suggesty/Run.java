package co.suggesty;

import co.suggesty.strategy.Axe;
import co.suggesty.strategy.GameCharacter;
import co.suggesty.strategy.Knife;
import co.suggesty.strategy.Sword;

public class Run {
    //    Strategy Pattern
    public void strategy(){
        GameCharacter character = new GameCharacter();
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        character.setWeapon(new Axe());
        character.attack();
    }
}
