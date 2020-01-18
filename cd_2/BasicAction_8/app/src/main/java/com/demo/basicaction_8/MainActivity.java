package com.demo.basicaction_8;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        this.getListView()
                .setAdapter(new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,
                        new String[]{"陳一", "林二", "張三", "李四", "王五"}));

    }
}
