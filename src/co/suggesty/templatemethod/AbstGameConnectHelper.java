package co.suggesty.templatemethod;

public abstract class AbstGameConnectHelper {

    protected abstract String doSecurity(String string);

    protected abstract boolean authentication(String id, String password);

    protected abstract int authorization(String userName);

    protected abstract String connection(String info);


    //    Template Method
    public String requestConnection(String encodedInfo) {

//       Security -> 암호화된 문자열을 복호화
        String decodedInfo = doSecurity(encodedInfo);


//        리턴된 값으로 아이디 암호를 할당한다.
        String id = "aaa";
        String password = "bbb";

        if (!authentication(id, password)) {
            throw new Error("Password incorrect");
        }
        String userName = "userName";

        int i = authorization(userName);

        switch (i) {
            case 0:
                System.out.println("You are Game Manager");
                break;
            case 1:
                System.out.println("You are Paid User");
                break;
            case 2:
                System.out.println("You are Free User");
                break;
            case 3:
                System.out.println("권한없음");
                break;
            default:
                break;

        }

        return connection(decodedInfo);
    }
}
