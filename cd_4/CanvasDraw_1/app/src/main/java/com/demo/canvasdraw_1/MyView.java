package com.demo.canvasdraw_1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by user on 2017/12/8.
 */

public class MyView extends View {

    Bitmap bitmap;

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        // 畫圖
        canvas.drawBitmap(bitmap, 100, 100, null);
    }
}
