package JToolKit.util;

import java.net.URL;
import java.util.Scanner;

public class WebRequest {

    public static String getWebContent(String link) {
        try {
            StringBuilder result = new StringBuilder();
            URL url = new URL(link);
            Scanner sc = new Scanner(url.openStream());
            while (sc.hasNext()) {
                result.append(sc.next());
            }

            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
