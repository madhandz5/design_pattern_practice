package co.suggesty.factoryMethod.concrete;

import co.suggesty.factoryMethod.framework.Item;

public class MpPotion implements Item {
    @Override
    public void use() {
        System.out.println("마나 회복");
    }
}
