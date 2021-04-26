package p005b.p051h.p052a.p074q.p076i;

import android.graphics.drawable.Drawable;
import p005b.p051h.p052a.p055m.C0962a;

/* renamed from: b.h.a.q.i.a */
public class C1358a implements C1364e<Drawable> {

    /* renamed from: a */
    public final int f1769a;

    /* renamed from: b */
    public C1359b f1770b;

    public C1358a(int i, boolean z) {
        this.f1769a = i;
    }

    /* renamed from: a */
    public C1362d<Drawable> mo11224a(C0962a aVar, boolean z) {
        if (aVar == C0962a.MEMORY_CACHE) {
            return C1360c.f1773a;
        }
        if (this.f1770b == null) {
            this.f1770b = new C1359b(this.f1769a, false);
        }
        return this.f1770b;
    }
}
