package co.suggesty.prototype2;

public class Age {
    int year;
    int age;

    public Age(int year, int age) {
        this.year = year;
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Age{" +
                "year=" + year +
                ", age=" + age +
                '}';
    }
}
