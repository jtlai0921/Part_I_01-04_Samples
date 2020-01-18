package com.demo.myquestionnaire_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final static String TAG = "MyQuestionnaire_1";

    EditText et1;
    RadioButton rb0, rb1;
    CheckBox cb1, cb2, cb3, cb4;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        findViews();
    }

    public void findViews() {
        et1 = (EditText) findViewById(R.id.editText1);
        rb0 = (RadioButton) findViewById(R.id.radio0);
        rb1 = (RadioButton) findViewById(R.id.radio1);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        cb4 = (CheckBox) findViewById(R.id.checkBox4);
        tv1 = (TextView) findViewById(R.id.textView5);
    }

    public void clickOK(View v) {
        Log.i(TAG, "確定鈕已按下！");

        // 檢測性別
        if(rb0.isChecked())
            Toast.makeText(this, "男生", Toast.LENGTH_SHORT).show();
        else if(rb1.isChecked())
            Toast.makeText(this, "女生", Toast.LENGTH_SHORT).show();
    }
}
