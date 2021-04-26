package p005b.p096l.p097a.p113c.p142g.p143f;

import android.os.IBinder;
import android.os.Parcel;
import p005b.p096l.p097a.p113c.p129c.C1980b;
import p005b.p096l.p097a.p113c.p131e.p139h.C2697a;
import p005b.p096l.p097a.p113c.p131e.p139h.C2699c;
import p005b.p096l.p097a.p113c.p131e.p139h.C2703g;
import p005b.p096l.p097a.p113c.p131e.p139h.C2704h;
import p005b.p096l.p097a.p113c.p142g.p144g.C3095c;

/* renamed from: b.l.a.c.g.f.o */
public final class C3091o extends C2697a implements C3078b {
    public C3091o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p096l.p097a.p113c.p142g.p143f.C3080d mo14033N() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo13198g()
            r1 = 25
            android.os.Parcel r0 = r4.mo13199k(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof p005b.p096l.p097a.p113c.p142g.p143f.C3080d
            if (r3 == 0) goto L_0x0020
            r1 = r2
            b.l.a.c.g.f.d r1 = (p005b.p096l.p097a.p113c.p142g.p143f.C3080d) r1
            goto L_0x0026
        L_0x0020:
            b.l.a.c.g.f.j r2 = new b.l.a.c.g.f.j
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p142g.p143f.C3091o.mo14033N():b.l.a.c.g.f.d");
    }

    /* renamed from: O0 */
    public final void mo14034O0(C3083g gVar) {
        Parcel g = mo13198g();
        C2699c.m4538a(g, gVar);
        mo13200n(30, g);
    }

    /* renamed from: a1 */
    public final C2703g mo14035a1(C3095c cVar) {
        Parcel g = mo13198g();
        C2699c.m4539b(g, cVar);
        Parcel k = mo13199k(11, g);
        C2703g k2 = C2704h.m4547k(k.readStrongBinder());
        k.recycle();
        return k2;
    }

    /* renamed from: p */
    public final void mo14036p(int i) {
        Parcel g = mo13198g();
        g.writeInt(i);
        mo13200n(16, g);
    }

    /* renamed from: q0 */
    public final void mo14037q0(C1980b bVar) {
        Parcel g = mo13198g();
        C2699c.m4538a(g, bVar);
        mo13200n(4, g);
    }
}
