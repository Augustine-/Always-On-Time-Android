package io.augustine.alwaysontime;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class AlarmListActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Perform the window operations before super.onCreate(), or you'll get a runtime exception
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_list);
    }
}
