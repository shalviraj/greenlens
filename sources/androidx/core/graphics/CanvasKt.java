package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;
import p298d.C6777r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a<\u0010\t\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\t\u0010\n\u001aF\u0010\u000e\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u000e\u0010\u000f\u001aP\u0010\u0010\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a<\u0010\u0012\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0012\u0010\n\u001a2\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a0\u0010\u0019\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a0\u0010\u0019\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0019\u0010\u001c\u001aH\u0010\u0019\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0019\u0010\"\u001aH\u0010\u0019\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0019\u0010\u0011\u001a0\u0010\u0019\u001a\u00020\u0002*\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0019\u0010%¨\u0006&"}, mo24462d2 = {"Landroid/graphics/Canvas;", "Lkotlin/Function1;", "Ld/r;", "block", "withSave", "(Landroid/graphics/Canvas;Ld/x/b/l;)V", "", "x", "y", "withTranslation", "(Landroid/graphics/Canvas;FFLd/x/b/l;)V", "degrees", "pivotX", "pivotY", "withRotation", "(Landroid/graphics/Canvas;FFFLd/x/b/l;)V", "withScale", "(Landroid/graphics/Canvas;FFFFLd/x/b/l;)V", "withSkew", "Landroid/graphics/Matrix;", "matrix", "withMatrix", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Ld/x/b/l;)V", "Landroid/graphics/Rect;", "clipRect", "withClip", "(Landroid/graphics/Canvas;Landroid/graphics/Rect;Ld/x/b/l;)V", "Landroid/graphics/RectF;", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;Ld/x/b/l;)V", "", "left", "top", "right", "bottom", "(Landroid/graphics/Canvas;IIIILd/x/b/l;)V", "Landroid/graphics/Path;", "clipPath", "(Landroid/graphics/Canvas;Landroid/graphics/Path;Ld/x/b/l;)V", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class CanvasKt {
    public static final void withClip(Canvas canvas, float f, float f2, float f3, float f4, C6862l<? super Canvas, C6777r> lVar) {
        C6888i.m12439f(canvas, "$this$withClip");
        C6888i.m12439f(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(Canvas canvas, int i, int i2, int i3, int i4, C6862l<? super Canvas, C6777r> lVar) {
        C6888i.m12439f(canvas, "$this$withClip");
        C6888i.m12439f(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(i, i2, i3, i4);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(Canvas canvas, Path path, C6862l<? super Canvas, C6777r> lVar) {
        C6888i.m12439f(canvas, "$this$withClip");
        C6888i.m12439f(path, "clipPath");
        C6888i.m12439f(lVar, "block");
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(Canvas canvas, Rect rect, C6862l<? super Canvas, C6777r> lVar) {
        C6888i.m12439f(canvas, "$this$withClip");
        C6888i.m12439f(rect, "clipRect");
        C6888i.m12439f(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(Canvas canvas, RectF rectF, C6862l<? super Canvas, C6777r> lVar) {
        C6888i.m12439f(canvas, "$this$withClip");
        C6888i.m12439f(rectF, "clipRect");
        C6888i.m12439f(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withMatrix(Canvas canvas, Matrix matrix, C6862l<? super Canvas, C6777r> lVar) {
        C6888i.m12439f(canvas, "$this$withMatrix");
        C6888i.m12439f(matrix, "matrix");
        C6888i.m12439f(lVar, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void withMatrix$default(Canvas canvas, Matrix matrix, C6862l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            matrix = new Matrix();
        }
        C6888i.m12439f(canvas, "$this$withMatrix");
        C6888i.m12439f(matrix, "matrix");
        C6888i.m12439f(lVar, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withRotation(Canvas canvas, float f, float f2, float f3, C6862l<? super Canvas, C6777r> lVar) {
        C6888i.m12439f(canvas, "$this$withRotation");
        C6888i.m12439f(lVar, "block");
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void withRotation$default(Canvas canvas, float f, float f2, float f3, C6862l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        C6888i.m12439f(canvas, "$this$withRotation");
        C6888i.m12439f(lVar, "block");
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withSave(Canvas canvas, C6862l<? super Canvas, C6777r> lVar) {
        C6888i.m12439f(canvas, "$this$withSave");
        C6888i.m12439f(lVar, "block");
        int save = canvas.save();
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withScale(Canvas canvas, float f, float f2, float f3, float f4, C6862l<? super Canvas, C6777r> lVar) {
        C6888i.m12439f(canvas, "$this$withScale");
        C6888i.m12439f(lVar, "block");
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void withScale$default(Canvas canvas, float f, float f2, float f3, float f4, C6862l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        C6888i.m12439f(canvas, "$this$withScale");
        C6888i.m12439f(lVar, "block");
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withSkew(Canvas canvas, float f, float f2, C6862l<? super Canvas, C6777r> lVar) {
        C6888i.m12439f(canvas, "$this$withSkew");
        C6888i.m12439f(lVar, "block");
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void withSkew$default(Canvas canvas, float f, float f2, C6862l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        C6888i.m12439f(canvas, "$this$withSkew");
        C6888i.m12439f(lVar, "block");
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withTranslation(Canvas canvas, float f, float f2, C6862l<? super Canvas, C6777r> lVar) {
        C6888i.m12439f(canvas, "$this$withTranslation");
        C6888i.m12439f(lVar, "block");
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void withTranslation$default(Canvas canvas, float f, float f2, C6862l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        C6888i.m12439f(canvas, "$this$withTranslation");
        C6888i.m12439f(lVar, "block");
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
