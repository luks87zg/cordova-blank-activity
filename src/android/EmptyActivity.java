package hr.intendanet.cordova.plugin.blank;

import android.app.Activity;
import android.os.Bundle;

import org.apache.cordova.Config;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class EmptyActivity extends Activity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        Log.d("Bundle log");
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
    Log.d("resume");
        super.onResume();
        finish();
    }
}