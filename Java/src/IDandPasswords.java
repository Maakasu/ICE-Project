import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IDandPasswords(){

        loginInfo.put("Madsen", "1");
        loginInfo.put("Seb", "1");
        loginInfo.put("Shorty", "1");

    }

   protected HashMap getLoginInfo(){
        return loginInfo;

    }
}
