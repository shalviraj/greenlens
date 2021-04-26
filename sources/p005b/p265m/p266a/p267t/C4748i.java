package p005b.p265m.p266a.p267t;

import android.graphics.Rect;
import android.util.Log;
import p005b.p265m.p266a.C4729r;

/* renamed from: b.m.a.t.i */
public class C4748i extends C4754o {

    /* renamed from: b */
    public static final String f9096b = "i";

    /* renamed from: a */
    public float mo16481a(C4729r rVar, C4729r rVar2) {
        if (rVar.f9029g <= 0 || rVar.f9030h <= 0) {
            return 0.0f;
        }
        C4729r d = rVar.mo16453d(rVar2);
        float f = (((float) d.f9029g) * 1.0f) / ((float) rVar.f9029g);
        if (f > 1.0f) {
            f = (float) Math.pow((double) (1.0f / f), 1.1d);
        }
        float f2 = ((((float) d.f9030h) * 1.0f) / ((float) rVar2.f9030h)) + ((((float) d.f9029g) * 1.0f) / ((float) rVar2.f9029g));
        return ((1.0f / f2) / f2) * f;
    }

    /* renamed from: b */
    public Rect mo16482b(C4729r rVar, C4729r rVar2) {
        C4729r d = rVar.mo16453d(rVar2);
        String str = f9096b;
        Log.i(str, "Preview: " + rVar + "; Scaled: " + d + "; Want: " + rVar2);
        int i = (d.f9029g - rVar2.f9029g) / 2;
        int i2 = (d.f9030h - rVar2.f9030h) / 2;
        return new Rect(-i, -i2, d.f9029g - i, d.f9030h - i2);
    }
}
