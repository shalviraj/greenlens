package com.google.android.material.shape;

import androidx.annotation.NonNull;

public interface Shapeable {
    @NonNull
    ShapeAppearanceModel getShapeAppearanceModel();

    void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel);
}
