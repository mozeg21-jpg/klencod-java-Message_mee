package com.ahmed.app;

import android.app.Activity;
import android.os.Bundle;

/** Compatibility activity; SplashActivity is the launcher. */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}