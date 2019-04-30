package com.lincitrin.androidgitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    void testMaster() {
        Log.d("test","測試 master 功能");
    }

    void testBranch() {
        Log.d("test","測試分支功能");
    }

}
