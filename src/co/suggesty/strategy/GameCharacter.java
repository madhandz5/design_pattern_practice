package co.suggesty.strategy;

public class GameCharacter {

    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
//        무기를 장착하지 않았을 예외도 고려 해야함.
        if (weapon == null) {
            System.out.println("맨손 공격");
        } else {
            weapon.attack();
        }
    }
}
