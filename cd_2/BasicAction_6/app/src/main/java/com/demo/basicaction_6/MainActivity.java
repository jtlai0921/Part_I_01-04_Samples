package com.demo.basicaction_6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.findViewById(android.R.id.content)
            .setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    String pos = motionEvent.getX() + ", " + motionEvent.getY();
                    switch(action) {
                        case MotionEvent.ACTION_DOWN:
                            setTitle("ACTION_DOWN at " + pos);
                            Log.i("onTouch", "ACTION_DOWN at " + pos);
                            break;
                        case MotionEvent.ACTION_MOVE:
                            setTitle("ACTION_MOVE at " + pos);
                            Log.i("onTouch", "ACTION_MOVE at " + pos);
                            break;
                        case MotionEvent.ACTION_UP:
                            setTitle("ACTION_UP at " + pos);
                            Log.i("onTouch", "ACTION_UP at " + pos);
                            break;
                    }
                    return true;
                }
            });
    }
}
