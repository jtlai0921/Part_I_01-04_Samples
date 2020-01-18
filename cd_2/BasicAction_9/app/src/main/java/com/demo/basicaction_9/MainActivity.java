package com.demo.basicaction_9;

import android.app.ListActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity {

    private static final String PATH = "/data/local/tmp/";
    private static final String DBNAME = "contact.db";
    private static final String TABLENAME = "info";

    private SQLiteDatabase dataBase;
    private Cursor cursor;
    private List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        readDB();

        this.getListView()
            .setAdapter(new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1,
                    list));
    }

    private void readDB() {
        // 1. 開啟資料庫
        dataBase = SQLiteDatabase.openDatabase(PATH+DBNAME, null,
                SQLiteDatabase.NO_LOCALIZED_COLLATORS | SQLiteDatabase.OPEN_READWRITE);
        // 2. 開啟資料表
        cursor = dataBase.rawQuery("select * from " + TABLENAME, null);
        if(cursor!=null) {
            // 3. 資料表長寬
            int iRow = cursor.getCount(); // 取得資料記錄的筆數
            int iCol = cursor.getColumnCount(); // 取得資料記錄的欄位數
            String [] oneRow = new String[iCol];
            // 4. 資料欄位
            cursor.moveToFirst();
            for(int i=0; i<iRow; i++) {
                for(int j=0; j<iCol; j++) { // 第 0 欄位：_id, 第 1 欄位：name, 第 2 欄位：email
                    oneRow[j] = cursor.getString(j);
                }
                list.add(oneRow[1]); // 第 1 欄位：name
                cursor.moveToNext();
            }
            // 5. 關閉資料庫
            dataBase.close();
        }
        else {
            setTitle("Hint 1: 請將db準備好!");
        }
    }
}
