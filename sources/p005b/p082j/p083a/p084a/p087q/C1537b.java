package p005b.p082j.p083a.p084a.p087q;

import p005b.p082j.p083a.p084a.C1513a;
import p005b.p082j.p083a.p084a.p090t.C1559a;

/* renamed from: b.j.a.a.q.b */
public class C1537b {

    /* renamed from: a */
    public final Object f2452a;

    /* renamed from: b */
    public C1513a f2453b;

    /* renamed from: c */
    public final boolean f2454c;

    /* renamed from: d */
    public final C1559a f2455d;

    /* renamed from: e */
    public byte[] f2456e;

    /* renamed from: f */
    public byte[] f2457f;

    /* renamed from: g */
    public char[] f2458g;

    /* renamed from: h */
    public char[] f2459h;

    public C1537b(C1559a aVar, Object obj, boolean z) {
        this.f2455d = aVar;
        this.f2452a = obj;
        this.f2454c = z;
    }

    /* renamed from: a */
    public final void mo11538a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    /* renamed from: b */
    public final void mo11539b(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
    }

    /* renamed from: c */
    public void mo11540c(byte[] bArr) {
        byte[] bArr2 = this.f2456e;
        if (bArr == bArr2 || bArr.length >= bArr2.length) {
            this.f2456e = null;
            this.f2455d.f2605a.set(0, bArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer smaller than original");
    }

    /* renamed from: d */
    public void mo11541d(byte[] bArr) {
        byte[] bArr2 = this.f2457f;
        if (bArr == bArr2 || bArr.length >= bArr2.length) {
            this.f2457f = null;
            this.f2455d.f2605a.set(1, bArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer smaller than original");
    }
}
