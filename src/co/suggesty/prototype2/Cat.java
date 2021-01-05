package co.suggesty.prototype2;

public class Cat implements Cloneable {

    private String name;
    private Age age;

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Cat copy() throws CloneNotSupportedException {
        Cat ret = (Cat) this.clone();
//        깊은 복사를 진행한다.
        ret.setAge(new Age(this.age.getYear(),this.age.getAge()));
        return ret;
    }
}
