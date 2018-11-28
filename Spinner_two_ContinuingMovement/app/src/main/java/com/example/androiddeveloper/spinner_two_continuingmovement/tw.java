package com.example.androiddeveloper.spinner_two_continuingmovement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class tw extends AppCompatActivity
{
    private Button bt1;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        bt1 = (Button)findViewById(R.id.button);
        bt1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent = new Intent(tw.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
