package com.example.f.activitycycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final String BOOF_NAME_OF_INFO ="name";
    private Button mbutton;
    private Button buttonthird;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        mbutton = (Button) findViewById(R.id.activity_main_button);
        final EditText editText =(EditText) findViewById(R.id.activity_main_EditText_name);
        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activitysecond.class);
                intent.putExtra(BOOF_NAME_OF_INFO,editText.getText().toString());
                startActivityForResult(intent,0);
            }
        });

        buttonthird = (Button) findViewById(R.id.activity_main_thirdbutton);
        buttonthird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,thirdActivity.class);
                startActivityForResult(intent,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);
        String name = "";
        switch (requestCode){
            case 0:
                name = data.getStringExtra("back");
                break;
            case 1:
                name = data.getStringExtra("thirdback");
                break;
        }

        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}
