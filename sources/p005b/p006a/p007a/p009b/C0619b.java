package p005b.p006a.p007a.p009b;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: b.a.a.b.b */
public class C0619b extends MetricAffectingSpan {

    /* renamed from: g */
    public final float f272g;

    public C0619b(float f) {
        this.f272g = f;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f272g);
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f272g);
    }
}
