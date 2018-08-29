package com.t3ch.shaj.androidzoomcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    private ZoomControls zoom;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zoom = findViewById(R.id.zoom_id);
        img = findViewById(R.id.IV_ID);

        zoom.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x = img.getScaleX();
                float y = img.getScaleY();

                img.setScaleX(x + 1);
                img.setScaleY(y + 1);
            }
        });
        zoom.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x = img.getScaleX();
                float y = img.getScaleY();

                img.setScaleX(x - 1);
                img.setScaleY(y - 1);
            }
        });

    }
}
