package com.demo.imageview_2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv1;
    boolean bStatus = false;

    Bitmap bmpHeart, bmpBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        iv1 = (ImageView) findViewById(R.id.imageView1);

        bmpHeart = BitmapFactory.decodeResource(getResources(), R.drawable.heart);
        bmpBack = BitmapFactory.decodeResource(getResources(), R.drawable.back_square);
        bmpBack = Bitmap.createScaledBitmap(bmpBack,
                bmpHeart.getWidth(), bmpHeart.getHeight(), true);
        iv1.setImageBitmap(bmpBack);
    }

    public void clickToOpen(View v) {
        bStatus = !bStatus;
        if(bStatus)
            iv1.setImageBitmap(bmpHeart);
        else
            iv1.setImageBitmap(bmpBack);
        setTitle("翻牌? "+ bStatus);
    }
}
