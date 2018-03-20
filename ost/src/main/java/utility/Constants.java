package utility;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import org.apache.commons.codec.binary.Hex;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Utility class for organizing project-wide constants
 */
public class Constants {

    /* Icon to use in the application */
    public static final ImageIcon OST_ICON =
            new ImageIcon(Constants.class.getClassLoader().getResource("images/icon.png"));

    public static final String USER_ENDPOINT = "/users/create?api_key=";

    private static HashFunction HASH_FUNCTION = Hashing.sha256();

    private static MessageDigest messageDigest;

    /**
     * Generates the message digest
     *
     * @return the message digest
     * @throws NoSuchAlgorithmException if the algorithm supplied to the message digest is not recognized
     */
    public static MessageDigest generateMessageDigest() throws NoSuchAlgorithmException {
        if (messageDigest == null) {
            messageDigest = MessageDigest.getInstance("SHA-256");
        }
        return messageDigest;
    }



    protected String generateCreateUserQueryString(String name, String apiKey) {
        String query = "";
        long timestamp = System.currentTimeMillis()/1000; //seconds
        query = USER_ENDPOINT + apiKey + "&name=" + name + "&request_timestamp=" + timestamp;

        return query;
    }

    public static char[] encode(String key, String data) throws Exception {
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
        sha256_HMAC.init(secret_key);

        return Hex.encodeHex(sha256_HMAC.doFinal(data.getBytes("UTF-8")));

    }

    /*
"/users/create?api_key=4b66f566d7596e2b733b&name=Alice+Anderson&request_timestamp=1521073147"

    const queryString = require('query-string');

generateQueryString: function (endpoint, inputParams, apiKey, requestTimestamp) {
  inputParams["api_key"] = apiKey;
  inputParams["request_timestamp"] = requestTimestamp;
  const queryParamsString = queryString.stringify(inputParams, {arrayFormat: 'bracket'}).replace(/%20/g, '+');
  const stringToSign = endpoint + '?' + queryParamsString;
  return stringToSign;
}
const crypto = require('crypto');

generateApiSignature: function (stringToSign, apiSecret) {
  var buff = new Buffer.from(apiSecret, 'utf8');
  var hmac = crypto.createHmac('sha256', buff);
  hmac.update(stringToSign);
  return hmac.digest('hex');
}

     */

}
