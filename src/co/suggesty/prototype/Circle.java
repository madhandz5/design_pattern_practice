package co.suggesty.prototype;

public class Circle extends Shape {
    private int x, y, r;

    public Circle(int x, int y, int r) {
        super();
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getR() {
        return r;
    }

    public Circle copy() throws CloneNotSupportedException {
        Circle circle = (Circle) clone();
//        복사 했을 때 기존의 위치와 겹치지 않게 살짝 이동시켜줌
        circle.x += 1;
        circle.y += 1;
        return circle;
    }
}
