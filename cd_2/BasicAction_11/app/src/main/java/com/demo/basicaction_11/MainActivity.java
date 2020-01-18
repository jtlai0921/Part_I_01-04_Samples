package com.demo.basicaction_11;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private static final int ACTIVITY_RESULT_QR_DRDROID = 0;
    public static final String SCAN = "la.droid.qr.scan";
    public static final String COMPLETE = "la.droid.qr.complete";
    public static final String RESULT = "la.droid.qr.result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(android.R.id.content).setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Set action "la.droid.qr.scan"
                    Intent intent = new Intent( SCAN );
                    intent.putExtra( COMPLETE , true);
                    //Send intent and wait result
                    try {
                        startActivityForResult(intent, ACTIVITY_RESULT_QR_DRDROID);
                    } catch (NullPointerException activity) {
                        Toast.makeText(MainActivity.this, "NullPointerException",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        );
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if( ACTIVITY_RESULT_QR_DRDROID==requestCode && null!=data && data.getExtras()!=null ) {
            //Read result from QR Droid (it's stored in la.droid.qr.result)
            String result = data.getExtras().getString(RESULT);
            this.setTitle("掃瞄結果："+result);
        }
    }
}
