package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.Metadata;
import p298d.C6777r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\b¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, mo24462d2 = {"Landroid/graphics/Picture;", "", "width", "height", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Ld/r;", "block", "record", "(Landroid/graphics/Picture;IILd/x/b/l;)Landroid/graphics/Picture;", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class PictureKt {
    public static final Picture record(Picture picture, int i, int i2, C6862l<? super Canvas, C6777r> lVar) {
        C6888i.m12439f(picture, "$this$record");
        C6888i.m12439f(lVar, "block");
        Canvas beginRecording = picture.beginRecording(i, i2);
        try {
            C6888i.m12435b(beginRecording, "c");
            lVar.invoke(beginRecording);
            return picture;
        } finally {
            picture.endRecording();
        }
    }
}
