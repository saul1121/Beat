package com.hfad.beat;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

import com.hfad.bitsandpizzas.R;

public class DJSActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_djs);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
