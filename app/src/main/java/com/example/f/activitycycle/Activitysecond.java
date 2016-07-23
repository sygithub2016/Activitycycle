package com.example.f.activitycycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by lsx on 2016/7/22.
 */
//第二个
public class Activitysecond extends AppCompatActivity {
    private TextView mtextView;
    private Button msendBackButton;
    private EditText mNameEditText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Intent intent = getIntent();
        String data = intent.getStringExtra(MainActivity.BOOF_NAME_OF_INFO);
        //Toast.makeText(Activitysecond.this, data, Toast.LENGTH_SHORT).show();
        TextView textView = (TextView) findViewById(R.id.text_view_name);
        textView.setText(data);
        mNameEditText = (EditText)findViewById(R.id.activity_main_EditText_name);
        msendBackButton = (Button) findViewById(R.id.second_activity_button);
        msendBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = msendBackButton.getText().toString();
                Intent intent =new Intent();
                intent.putExtra("back",name);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
