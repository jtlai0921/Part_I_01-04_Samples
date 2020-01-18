package com.demo.basicaction_10;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private Handler handler = new Handler();
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler.postDelayed(new Runnable(){
            @Override
            public void run() {
                count++;
                setTitle("計數 " + count + " 次!");
                Log.i(TAG, "計數 " + count + " 次!");
                if(count<5) {
                    handler.postDelayed(this, 1000);
                }
            }
        }, 1000);
    }
}
