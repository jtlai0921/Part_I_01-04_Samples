package com.demo.basicaction_12a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int ans;

    static class Guess {

        public static int getNum() {
            int num = (int) (Math.random() * 10);
            return num;
        }
    }

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
