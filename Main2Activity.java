package com.example.monary.splashscreen;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;

public class Main2Activity extends Activity {
    private String[] sehirler = {"Türkiye","İngiltere","Fransa","Brezilya","Arjantin"
            ,"Türkiye","İngiltere","Fransa","Brezilya","Arjantin"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView list = findViewById(R.id.listview1);

        ArrayAdapter<String> adapter = new  ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, sehirler);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);
                builder.setTitle("Bilgi");
                builder.setMessage(sehirler[position]);
                builder.setNegativeButton("TAMAM", null);
                builder.show();
            }
        });
    }
}
