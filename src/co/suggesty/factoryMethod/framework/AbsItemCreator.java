package co.suggesty.factoryMethod.framework;

public abstract class AbsItemCreator {
    public Item create() {
        Item item;

//        이건 곧 Template Method Pattern
        requestItemsInfo();
        item = createItem();
        createItemLog();

        return item;
    }

    //    생성하기 전에 DB에서 아이템 정보를 요청함.
    abstract protected void requestItemsInfo();

    //    아이템을 생성 후에는 아이템 복제등의 불법을 방지하기 위해 DB에 아이템 생성정보를 전달함.
    abstract protected void createItemLog();

    //    아이템을 생성하는 알고리즘
    abstract protected Item createItem();

}
