package com.example.f.activitycycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by lsx on 2016/7/22.
 */
//第二个
public class Activitysecond extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Intent intent = getIntent();
        String data = intent.getStringExtra(MainActivity.BOOF_NAME_OF_INFO);
        //Toast.makeText(Activitysecond.this, data, Toast.LENGTH_SHORT).show();
        TextView textView = (TextView) findViewById(R.id.text_view_name);
        textView.setText(data);
    }
}
