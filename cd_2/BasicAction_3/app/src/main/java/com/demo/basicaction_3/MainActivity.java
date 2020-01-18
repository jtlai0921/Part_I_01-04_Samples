package com.demo.basicaction_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.findViewById(android.R.id.content)
            .setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    setTitle("點擊空白處！");
                }
            });
    }
}
