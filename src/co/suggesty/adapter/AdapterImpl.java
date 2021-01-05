package co.suggesty.adapter;

public class AdapterImpl implements Adapter {

    Math math = new Math();

    @Override
    public Float twiceOf(Float f) {
        return math.doubled(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f) {
//        로그를 찍는 코드는 Math에 구현하지 않고, 이곳에 구현함.
        System.out.println("Half Method Called");
        return (float) math.half(f.doubleValue());
    }
}
