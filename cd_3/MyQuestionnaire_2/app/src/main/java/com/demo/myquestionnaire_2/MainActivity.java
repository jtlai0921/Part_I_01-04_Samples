package com.demo.myquestionnaire_2;

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

    final static String TAG = "MyQuestionnaire_2";

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
        String msg = "";
        Log.i(TAG, "確定鈕已按下！");

        // 檢測姓名
        if( et1.getText().toString().equals("")) {
            Toast.makeText(this, "尚未填寫姓名", Toast.LENGTH_SHORT).show();
            return;
        }

        // 檢測性別
        if(rb0.isChecked())
            msg += et1.getText().toString() + "是男生";
        else if(rb1.isChecked())
            msg += et1.getText().toString() + "是女生";
        // 檢測嗜好
        msg += ", 嗜好為";
        if(cb1.isChecked())
            msg += cb1.getText().toString();
        if(cb2.isChecked())
            msg += cb2.getText().toString();
        if(cb3.isChecked())
            msg += cb3.getText().toString();
        if(cb4.isChecked())
            msg += cb4.getText().toString();
        // 顯示結果
        tv1.setText(msg);
    }
}
