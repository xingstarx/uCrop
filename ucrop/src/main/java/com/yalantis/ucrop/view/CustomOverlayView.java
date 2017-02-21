package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;


public class CustomOverlayView extends OverlayView {
    public CustomOverlayView(Context context) {
        this(context, null);
    }

    public CustomOverlayView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomOverlayView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        TypedArray a = context.obtainStyledAttributes(attrs, com.yalantis.ucrop.R.styleable.ucrop_UCropView);
        processStyledAttributes(a);
        a.recycle();
    }

}
