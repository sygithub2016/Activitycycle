package com.example.f.activitycycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thirdActivity extends AppCompatActivity {
private Button mbackButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        mbackButton = (Button)findViewById(R.id.activity_main_third_button);
        mbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("thirdback","3333333");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
