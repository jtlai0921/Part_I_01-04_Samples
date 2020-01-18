package com.demo.myswitch_2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    boolean bStatus = false;
    int iStatus = 0;
    RelativeLayout relativelayout;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        relativelayout = (RelativeLayout) findViewById(R.id.relativeLayout1);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
    }

    public void clickToSwitch(View v) {
        if(v==btn1) {
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
        else if(v==btn2) {
            if(iStatus==0) {
                relativelayout.setBackgroundColor(Color.GRAY);
                setTitle("Stage #1");
                iStatus = 1;
            }
            else if (iStatus==1) {
                relativelayout.setBackgroundColor(Color.BLACK);
                setTitle("Stage #2");
                iStatus = 2;
            }
            else if (iStatus==2) {
                relativelayout.setBackgroundColor(Color.WHITE);
                setTitle("Stage #0");
                iStatus = 0;
            }
        }
    }
}
