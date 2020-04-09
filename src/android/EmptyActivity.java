package hr.intendanet.cordova.blank;

import android.app.Activity;

public class EmptyActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
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