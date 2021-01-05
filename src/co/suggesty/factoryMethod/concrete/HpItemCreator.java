package co.suggesty.factoryMethod.concrete;

import co.suggesty.factoryMethod.framework.AbsItemCreator;
import co.suggesty.factoryMethod.framework.Item;

import java.util.Date;

public class HpItemCreator extends AbsItemCreator {
    @Override
    protected void requestItemsInfo() {
        System.out.println("DB에서 HP회복 물약의 정보를 가져옴");
    }

    @Override
    protected void createItemLog() {
        System.out.println("HP포션을 새로 생성했습니다." + new Date());
    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }
}
