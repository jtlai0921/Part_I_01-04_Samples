package com.demo.moveimage_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public class MainActivity extends AppCompatActivity implements OnTouchListener {

    RelativeLayout rl1;
    ImageView iv1;
    RelativeLayout.LayoutParams params;
    int x0, y0, ivW = 600, ivH = 400;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prepareViews();
    }

    private void prepareViews() {
        rl1 = (RelativeLayout) findViewById(R.id.relative);
        iv1 = new ImageView(this);
        iv1.setImageResource(R.drawable.myimage);
        params = new RelativeLayout.LayoutParams(ivW, ivH);
        params.addRule(RelativeLayout.ALIGN_LEFT);
        params.addRule(RelativeLayout.ALIGN_TOP);
        iv1.setLayoutParams(params);
        iv1.setOnTouchListener(this);
        rl1.addView(iv1);
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        // TODO Auto-generated method stub
        if(view == iv1) {
            int x = (int) event.getX();
            int y = (int) event.getY();
            if(event.getAction() == MotionEvent.ACTION_DOWN){
                x0 = x;
                y0 = y;
            }
            else if(event.getAction() == MotionEvent.ACTION_MOVE){
                params = (LayoutParams) iv1.getLayoutParams();
                params.leftMargin += (x - x0);
                params.topMargin  += (y - y0);
                params.rightMargin += (x - x0) + ivW;
                params.bottomMargin  += (y - y0) + ivH;
                iv1.setLayoutParams(params);
            }
        }
        return true;
    }
}
