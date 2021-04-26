package androidx.core.graphics.drawable;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\b¢\u0006\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, mo24462d2 = {"", "Landroid/graphics/drawable/ColorDrawable;", "toDrawable", "(I)Landroid/graphics/drawable/ColorDrawable;", "Landroid/graphics/Color;", "(Landroid/graphics/Color;)Landroid/graphics/drawable/ColorDrawable;", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class ColorDrawableKt {
    public static final ColorDrawable toDrawable(@ColorInt int i) {
        return new ColorDrawable(i);
    }

    @RequiresApi(26)
    public static final ColorDrawable toDrawable(Color color) {
        C6888i.m12439f(color, "$this$toDrawable");
        return new ColorDrawable(color.toArgb());
    }
}
