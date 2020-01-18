package com.demo.moveimage_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MyView mView = null;
    private Bitmap mBitmap = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.myimage);
        mBitmap = Bitmap.createScaledBitmap(mBitmap, 600, 400, true);
        mView = new MyView(this);
        setContentView(mView);
    }

    private class MyView extends View {
        private int imageX = 0;
        private int imageY = 0;
        int dx, dy;
        boolean bTouched = false;
        //
        public MyView(Context context) {
            super(context);
        }
        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawBitmap(mBitmap, imageX, imageY, null);
        }
        @Override
        public boolean onTouchEvent(MotionEvent event) {
            int x = (int) event.getX();
            int y = (int) event.getY();
            if(event.getAction() == MotionEvent.ACTION_DOWN){
                if(x>imageX && x < imageX + mBitmap.getWidth() &&
                        y>imageY && y < imageY + mBitmap.getHeight()) {
                    dx = x - imageX;
                    dy = y - imageY;
                    bTouched = true;
                }
            }
            else if(event.getAction() == MotionEvent.ACTION_MOVE){
                if(bTouched) {
                    imageX = x - dx;
                    imageY = y - dy;
                }
            }
            else if(event.getAction() == MotionEvent.ACTION_UP){
                bTouched = false;
            }
            invalidate();        						//再描繪的指示
            return true;
        }
    }
}
