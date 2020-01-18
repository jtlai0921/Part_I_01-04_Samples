package com.demo.myswitch_1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    boolean bStatus = false;
    RelativeLayout relativelayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        relativelayout = (RelativeLayout) findViewById(R.id.relativeLayout1);
    }

    public void clickToSwitch(View v) {
        if(bStatus==false) {
            relativelayout.setBackgroundColor(Color.RED);
            setTitle("On");
            bStatus = true;
        }
        else {
            relativelayout.setBackgroundColor(Color.GREEN);
            setTitle("Off");
            bStatus = false;
        }
    }
}
