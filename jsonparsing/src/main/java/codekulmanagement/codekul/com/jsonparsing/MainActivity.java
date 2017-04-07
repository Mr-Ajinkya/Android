package codekulmanagement.codekul.com.jsonparsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StringBuilder builder = new StringBuilder();
        try {
            InputStream is = getAssets().open("sm.json");
            while (true){
                int ch = is.read();
                if (ch == -1) break;
                else builder.append((char)ch);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        parseUsingJsonObjectApi(builder.toString());
    }

    private void parseUsingJsonObjectApi(String json) {
        StringBuilder builder = new StringBuilder();
        try {
            JSONObject rootObject = new JSONObject(json);
            String name = rootObject.getString("name");
            String os = rootObject.getString("os");
            double version = rootObject.getDouble("ver");
            boolean isUpdateAva = rootObject.getBoolean("isUpdateAva");
            builder.append("\n name").append(name);
            builder.append("\n os").append(os);
            builder.append("\n version").append(version);
            builder.append("\n isUpdateAva").append(isUpdateAva);


            JSONObject innerObj = new JSONObject("allVersions");
            double base = innerObj.getDouble("base");
            double cupCake = innerObj.getDouble("cupCake");
            builder.append("\n base").append(base);
            builder.append("\n cupCake").append(cupCake);

            JSONArray devices = rootObject.getJSONArray("devices");
            for (int i = 0; i < devices.length(); i ++ ){
                JSONObject arrObj = devices.getJSONObject(i);
                String mobile = arrObj.getString("mobile");
                int cost = arrObj.getInt("cost");
                builder.append("\n mobile").append(mobile);
                builder.append("\n cost").append(cost);
            }
            Log.i("@example",builder.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

}
