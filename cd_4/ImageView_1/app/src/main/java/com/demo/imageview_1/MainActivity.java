package com.demo.imageview_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv1;
    boolean bStatus = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        iv1 = (ImageView) findViewById(R.id.imageView1);
    }

    public void clickToOpen(View v) {
        bStatus = !bStatus;
        if(bStatus)
            iv1.setImageResource(R.drawable.heart);
        else
            iv1.setImageResource(R.drawable.back_square);
        setTitle("翻牌? "+ bStatus);
    }
}
