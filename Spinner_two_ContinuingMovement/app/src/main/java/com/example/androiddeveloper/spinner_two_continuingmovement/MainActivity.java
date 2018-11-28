package com.example.androiddeveloper.spinner_two_continuingmovement;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity
{
    private static final String data = "DATA";
    private static final String nameField = "NAME";

    private String[] type = new String[] {"茶類", "果汁類"};
    private String[] tea = new String[]{"紅茶","綠茶","烏龍綠","青茶"};
    private String[][] type2 = new String[][]{{"紅茶","綠茶","烏龍綠","青茶"},{"柳丁汁","西瓜汁","烏梅汁"}};
    private Spinner sp;//第一個下拉選單
    private Spinner sp2;//第二個下拉選單
    private Button bt1;
    private SharedPreferences settings;

    ArrayAdapter<String> adapter ;
    ArrayAdapter<String> adapter2;

    Intent intent;
    int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = (Spinner)findViewById(R.id.type);
        sp2 = (Spinner)findViewById(R.id.type2);
        bt1 = (Button)findViewById(R.id.button);
        //程式剛啟始時載入第一個下拉選單
        adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item, type);
        sp.setAdapter(adapter);

        //因為下拉選單第一個為茶類，所以先載入茶類群組進第二個下拉選單
        adapter2 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item, tea);
        sp2.setAdapter(adapter2);

        settings = getSharedPreferences("data",0);

        settings = getSharedPreferences(data,0);
        if(settings.equals("紅茶"))
        {
            sp.setSelection(0);
            sp2.setSelection(0);
        }
        else if(settings.equals("綠茶"))
        {
            sp.setSelection(0);
            sp2.setSelection(1);
        }
        else if(settings.equals("烏龍綠"))
        {
            sp.setSelection(0);
            sp2.setSelection(2);
        }
        else if(settings.equals("青茶"))
        {
            sp.setSelection(0);
            sp2.setSelection(3);
        }
        else if(settings.equals("柳丁汁"))
        {
            sp.setSelection(1);
            sp2.setSelection(0);
        }
        else if(settings.equals("西瓜汁"))
        {
            sp.setSelection(1);
            sp2.setSelection(1);
        }
        else
        {
            sp.setSelection(1);
            sp2.setSelection(2);
        }

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                //讀取第一個下拉選單是選擇第幾個
                pos = sp.getSelectedItemPosition();
                //重新產生新的Adapter，用的是二維陣列type2[pos]
                adapter2 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item, type2[pos]);
                //載入第二個下拉選單Spinner
                sp2.setAdapter(adapter2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });

        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                int pos = sp.getSelectedItemPosition();
                settings.edit().putString("name", type2[pos][position]).commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });

        bt1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent = new Intent(MainActivity.this, tw.class);
                startActivity(intent);
            }
        });

    }

}
