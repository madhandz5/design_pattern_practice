package co.suggesty.templateMethod;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {
    @Override
    protected String doSecurity(String string) {
        System.out.println("Decoded");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("ID / PASSWORD CHECK");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("Check Authorization");
        try {
            System.out.println("Connect.");
            Thread.sleep(500);
            System.out.println("Connect..");
            Thread.sleep(1000);
            System.out.println("Connect...");
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (int) (Math.random() * 4);
    }

    @Override
    protected String connection(String info) {
        System.out.println("Connected");
        return info;
    }
}
