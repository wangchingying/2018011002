package com.cyw.a2018011002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        Intent it = new Intent(MainActivity.this, Main2Activity.class);
        Bundle b = new Bundle();
        b.putString("DATA", "MyDATA");
        it.putExtras(b);
        startActivity(it);
    }
}
