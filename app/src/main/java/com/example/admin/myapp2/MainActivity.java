package com.example.admin.myapp2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d("UI_PARTS", "ボタンをタップしました");
            }
        });

        TextView textView = (TextView) findViewById(R.id.textview);
        textView.setText("テキスト");

    }
}
