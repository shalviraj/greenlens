package p005b.p265m.p266a.p267t;

import android.graphics.Rect;
import p005b.p265m.p266a.C4729r;

/* renamed from: b.m.a.t.l */
public class C4751l extends C4754o {
    /* renamed from: c */
    public static float m8717c(float f) {
        return f < 1.0f ? 1.0f / f : f;
    }

    /* renamed from: a */
    public float mo16481a(C4729r rVar, C4729r rVar2) {
        int i = rVar.f9029g;
        if (i <= 0 || rVar.f9030h <= 0) {
            return 0.0f;
        }
        float c = (1.0f / m8717c((((float) i) * 1.0f) / ((float) rVar2.f9029g))) / m8717c((((float) rVar.f9030h) * 1.0f) / ((float) rVar2.f9030h));
        float c2 = m8717c(((((float) rVar.f9029g) * 1.0f) / ((float) rVar.f9030h)) / ((((float) rVar2.f9029g) * 1.0f) / ((float) rVar2.f9030h)));
        return (((1.0f / c2) / c2) / c2) * c;
    }

    /* renamed from: b */
    public Rect mo16482b(C4729r rVar, C4729r rVar2) {
        return new Rect(0, 0, rVar2.f9029g, rVar2.f9030h);
    }
}
