package co.suggesty.strategy;

public class Axe implements Weapon{
    @Override
    public void attack() {
        System.out.println("도끼 공격");
    }
}
