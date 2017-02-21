package com.yalantis.ucrop.sample;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yalantis.ucrop.UCrop;
import com.yalantis.ucrop.view.CustomOverlayView;
import com.yalantis.ucrop.view.OverlayView;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    private CustomOverlayView mOverlayView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mOverlayView = (CustomOverlayView) findViewById(R.id.custom_overlay_view);
        initUCrop();

    }

    private void initUCrop() {
        mOverlayView.setCircleDimmedLayer(true);
        mOverlayView.setCircleDimmedLayoutBorderWidth(3);
        mOverlayView.setCircleDimmedLayoutBorderColor(ContextCompat.getColor(this, R.color.light_green));
        mOverlayView.setShowCropFrame(false);
        mOverlayView.setShowCropGrid(false);
        mOverlayView.setTargetAspectRatio(1);
    }
}
