package techm.Utils;

import java.util.Base64;

public class Base64Decodifier {

    public static String decodedPass(String base64) {

        return Base64.getDecoder().decode(base64).toString();
    }
}
