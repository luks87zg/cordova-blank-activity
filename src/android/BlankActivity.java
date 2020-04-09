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
import android.util.Log;

public class BlankActivity extends CordovaPlugin {

    protected static final String LOG_TAG = "BlankActivity";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("doNothing")) {
            doNothing();
            callbackContext.success();
            return true;
        }
        return false;
    }

    protected void doNothing() {
        Log.d(LOG_TAG, "Empty plugin did absolutely nothing");
            Intent intentEncode = new Intent(this.cordova.getActivity().getBaseContext(), EmptyActivity.class);
        // avoid calling other phonegap apps
        intentEncode.setPackage(this.cordova.getActivity().getApplicationContext().getPackageName());
        this.cordova.getActivity().startActivity(intentEncode);
    }
}