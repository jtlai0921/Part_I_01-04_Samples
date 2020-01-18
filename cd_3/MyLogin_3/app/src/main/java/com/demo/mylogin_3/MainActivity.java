package com.demo.mylogin_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final static String TAG = "MyLogin_3";

    EditText et1, et2;							// 以 EditText 變數連結版面元件

    String account = "john", passwd = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.editText1);	// 以 findViewById 連結元件
        et2 = (EditText) findViewById(R.id.editText2);
    }

    public void clickOK(View v) {
        // 1. 秀在 Title
//    	this.setTitle("確定鈕已按下！");
        // 2. by Toast
//    	Toast.makeText(this, "確定鈕已按下！", Toast.LENGTH_SHORT).show();
        // 3. 以 Log 秀在日誌(Logcat)區
        Log.i(TAG, "確定鈕已按下！");
        if(account.equals(et1.getText().toString())  &&						            // 以 Java equals 比較字串
                passwd.equals(et2.getText().toString())) {						        // 帳號與密碼都要一致才正確
            Toast.makeText(this, "登入成功！", Toast.LENGTH_SHORT).show();	// 以 Toast 顯示結果訊息
        }
        else {
            Toast.makeText(this, "登入失敗！", Toast.LENGTH_SHORT).show();
        }
    }
}
