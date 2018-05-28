package com.test.gitlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.tv);
        textView.setText("1233333333333333");

        // master

        ///my firset branch

        // i have commit the firstbranch to master
        // and then checkout the firstbranch

        // now i will merge the firstbranch to master.
    }
}
