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
        textView.setText("这是来自master的rebase");
        textView.setText("这是firstbranch_local自己的");
        textView.setText("直接把firstbranch_local push到master");
        textView.setText("直接把firstbranch_local push到firstbranch_local");

        textView.setText("hahah");

        // master

        ///my firset branch

        // i have commit the firstbranch to master
        // and then checkout the firstbranch

        // now i will merge the firstbranch to master.
    }
}
