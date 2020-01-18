package com.demo.basicaction_12b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.demo.mylibrary.Guess;

public class MainActivity extends AppCompatActivity {

    int ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("猜一個數字(0~9)?");
        ans = Guess.getNum();

        findViewById(android.R.id.content).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        setTitle("答案是: " + ans + ". 猜下一個數字是(0~9)?");
                        ans = Guess.getNum();
                    }
                }
        );
    }
}
