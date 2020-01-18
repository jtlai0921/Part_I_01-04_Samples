package com.demo.mylogin_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final static String TAG = "MyLogin_2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickOK(View v) {
        // 1. 秀在 Title
        this.setTitle("確定鈕已按下！");
        // 2. by Toast
        Toast.makeText(this, "確定鈕已按下！", Toast.LENGTH_SHORT).show();
        // 3. 以 Log 秀在日誌(Logcat)區
        Log.i(TAG, "確定鈕已按下！");
    }
}
