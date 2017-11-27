package com.pritesh.androidcaptureimagefromcameraandgallery;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class UseCustomActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_custom);
    }

    public void onClicked(View view)
    {
        String text = view.getId() == R.id.view1 ? "Background" : "Foreground";
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
