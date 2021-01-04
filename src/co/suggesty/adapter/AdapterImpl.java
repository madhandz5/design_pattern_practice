package co.suggesty.adapter;

public class AdapterImpl implements Adapter {

    Math math = new Math();

    @Override
    public Float twiceOf(Float f) {
        return math.doubled(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f) {
        System.out.println("Half Method Called");
        return (float) math.half(f.doubleValue());
    }
}
