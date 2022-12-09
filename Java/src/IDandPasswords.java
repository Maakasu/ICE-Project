import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IDandPasswords(){

        loginInfo.put("Madsen", "1234");
        loginInfo.put("Admin1", "1234");
        loginInfo.put("Admin2", "1234");

    }

   protected HashMap getLoginInfo(){
        return loginInfo;

    }
}
