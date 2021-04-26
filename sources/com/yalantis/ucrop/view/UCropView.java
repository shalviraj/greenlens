package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import java.util.Objects;
import p005b.p291q.p292a.C5267b;
import p005b.p291q.p292a.p297m.C5300d;
import p005b.p291q.p292a.p297m.C5301e;

public class UCropView extends FrameLayout {

    /* renamed from: g */
    public GestureCropImageView f11592g = ((GestureCropImageView) findViewById(R.id.image_view_crop));

    /* renamed from: h */
    public final OverlayView f11593h;

    public UCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.ucrop_view, this, true);
        OverlayView overlayView = (OverlayView) findViewById(R.id.view_overlay);
        this.f11593h = overlayView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5267b.f10527b);
        Objects.requireNonNull(overlayView);
        overlayView.f11583r = obtainStyledAttributes.getBoolean(2, false);
        int color = obtainStyledAttributes.getColor(3, overlayView.getResources().getColor(R.color.ucrop_color_default_dimmed));
        overlayView.f11584s = color;
        overlayView.f11586u.setColor(color);
        overlayView.f11586u.setStyle(Paint.Style.STROKE);
        overlayView.f11586u.setStrokeWidth(1.0f);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, overlayView.getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width));
        int color2 = obtainStyledAttributes.getColor(4, overlayView.getResources().getColor(R.color.ucrop_color_default_crop_frame));
        overlayView.f11588w.setStrokeWidth((float) dimensionPixelSize);
        overlayView.f11588w.setColor(color2);
        overlayView.f11588w.setStyle(Paint.Style.STROKE);
        overlayView.f11589x.setStrokeWidth((float) (dimensionPixelSize * 3));
        overlayView.f11589x.setColor(color2);
        overlayView.f11589x.setStyle(Paint.Style.STROKE);
        overlayView.f11581p = obtainStyledAttributes.getBoolean(10, true);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(9, overlayView.getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width));
        int color3 = obtainStyledAttributes.getColor(6, overlayView.getResources().getColor(R.color.ucrop_color_default_crop_grid));
        overlayView.f11587v.setStrokeWidth((float) dimensionPixelSize2);
        overlayView.f11587v.setColor(color3);
        overlayView.f11577l = obtainStyledAttributes.getInt(8, 2);
        overlayView.f11578m = obtainStyledAttributes.getInt(7, 2);
        overlayView.f11582q = obtainStyledAttributes.getBoolean(11, true);
        GestureCropImageView gestureCropImageView = this.f11592g;
        Objects.requireNonNull(gestureCropImageView);
        float abs = Math.abs(obtainStyledAttributes.getFloat(0, 0.0f));
        float abs2 = Math.abs(obtainStyledAttributes.getFloat(1, 0.0f));
        if (abs == 0.0f || abs2 == 0.0f) {
            gestureCropImageView.f10605x = 0.0f;
        } else {
            gestureCropImageView.f10605x = abs / abs2;
        }
        obtainStyledAttributes.recycle();
        this.f11592g.setCropBoundsChangeListener(new C5300d(this));
        overlayView.setOverlayViewChangeListener(new C5301e(this));
    }

    @NonNull
    public GestureCropImageView getCropImageView() {
        return this.f11592g;
    }

    @NonNull
    public OverlayView getOverlayView() {
        return this.f11593h;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
