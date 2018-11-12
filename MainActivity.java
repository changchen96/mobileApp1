package com.example.c7_ong.testapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.d("MainActivity", "Hello World");
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void incrementValue(View view)
    {
        counter++;
        if (mShowCount != null)
        {
            mShowCount.setText(Integer.toString(counter));
        }
    }
}
