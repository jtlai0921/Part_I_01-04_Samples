package com.demo.dragzoom_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView iv1, iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = (ImageView) findViewById(R.id.imageView1);
        iv1.setOnTouchListener(new DragZoomListener());
        iv1.setScaleX(.3f);
        iv1.setScaleY(.3f);
        iv2 = (ImageView) findViewById(R.id.imageView2);
        iv2.setOnTouchListener(new DragZoomListener());
        iv2.setScaleX(.3f);
        iv2.setScaleY(.3f);
    }

    public void click1(View v) {
        Toast.makeText(this, "ImageView1 is clicked",
                Toast.LENGTH_SHORT).show();
    }

    public void click2(View v) {
        Toast.makeText(this, "ImageView2 is clicked",
                Toast.LENGTH_SHORT).show();
    }
}
