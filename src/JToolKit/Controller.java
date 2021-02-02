package JToolKit;

import JToolKit.util.WebRequest;
import org.json.JSONException;
import org.json.JSONObject;

public class Controller {

    JToolKit gui;
    JSONObject versionJSON = new JSONObject();

    public Controller(JToolKit oGUI) {
        gui = oGUI;
        gui.getLblVersion().setText("Version: " + checkVersion());
    }

    private String checkVersion() {
        if (!versionJSON.isNull("Version_Number")) {
            return versionJSON.get("Version_Number").toString();
        } else {
            downloadVersionInfo();
            return versionJSON.get("Version_Number").toString();
        }
    }

    private void downloadVersionInfo() {
        try {
            versionJSON = new JSONObject(WebRequest.getWebContent("http://vincentlyons.com/JToolKit/version.json"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
