package p005b.p265m.p266a.p267t;

import android.graphics.Rect;
import android.util.Log;
import p005b.p265m.p266a.C4729r;

/* renamed from: b.m.a.t.k */
public class C4750k extends C4754o {

    /* renamed from: b */
    public static final String f9100b = "k";

    /* renamed from: a */
    public float mo16481a(C4729r rVar, C4729r rVar2) {
        if (rVar.f9029g <= 0 || rVar.f9030h <= 0) {
            return 0.0f;
        }
        C4729r e = rVar.mo16454e(rVar2);
        float f = (((float) e.f9029g) * 1.0f) / ((float) rVar.f9029g);
        if (f > 1.0f) {
            f = (float) Math.pow((double) (1.0f / f), 1.1d);
        }
        float f2 = ((((float) rVar2.f9030h) * 1.0f) / ((float) e.f9030h)) * ((((float) rVar2.f9029g) * 1.0f) / ((float) e.f9029g));
        return (((1.0f / f2) / f2) / f2) * f;
    }

    /* renamed from: b */
    public Rect mo16482b(C4729r rVar, C4729r rVar2) {
        C4729r e = rVar.mo16454e(rVar2);
        String str = f9100b;
        Log.i(str, "Preview: " + rVar + "; Scaled: " + e + "; Want: " + rVar2);
        int i = (e.f9029g - rVar2.f9029g) / 2;
        int i2 = (e.f9030h - rVar2.f9030h) / 2;
        return new Rect(-i, -i2, e.f9029g - i, e.f9030h - i2);
    }
}
