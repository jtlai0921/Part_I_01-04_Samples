package com.demo.basicaction_4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.findViewById(android.R.id.content)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Bitmap bmp = BitmapFactory.decodeResource(
                                getResources(), R.drawable.ic_launcher);
                        Drawable drawable = new BitmapDrawable(getResources(), bmp);
                        findViewById(android.R.id.content).setBackground(drawable);
                    }
                });
    }
}
