package com.demo.canvasdraw_2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by user on 2017/12/8.
 */

public class MyView extends View {

    Bitmap bitmap;
    Context context;

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        // 畫圖
        canvas.drawBitmap(bitmap, 100, 100, null);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();
        Log.i("MyView", "x,y = " + x + ", " + y);
        Log.i("MyView", "event.getAction() = " + event.getAction());

        switch(event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                if( x >= 100 && x <= 100+bitmap.getWidth()
                        && y >= 100 && y <= 100+bitmap.getHeight())
                    Toast.makeText(context, "圖片被 click", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onTouchEvent(event);
    }
}
