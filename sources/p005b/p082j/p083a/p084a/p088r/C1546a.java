package p005b.p082j.p083a.p084a.p088r;

import java.io.CharConversionException;
import java.io.InputStream;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p082j.p083a.p084a.p087q.C1537b;

/* renamed from: b.j.a.a.r.a */
public final class C1546a {

    /* renamed from: a */
    public final C1537b f2485a;

    /* renamed from: b */
    public final InputStream f2486b;

    /* renamed from: c */
    public final byte[] f2487c;

    /* renamed from: d */
    public int f2488d;

    /* renamed from: e */
    public int f2489e;

    /* renamed from: f */
    public final boolean f2490f;

    /* renamed from: g */
    public boolean f2491g = true;

    /* renamed from: h */
    public int f2492h;

    public C1546a(C1537b bVar, InputStream inputStream) {
        this.f2485a = bVar;
        this.f2486b = inputStream;
        bVar.mo11538a(bVar.f2456e);
        byte[] a = bVar.f2455d.mo11684a(0);
        bVar.f2456e = a;
        this.f2487c = a;
        this.f2488d = 0;
        this.f2489e = 0;
        this.f2490f = true;
    }

    /* renamed from: a */
    public final boolean mo11562a(int i) {
        if ((65280 & i) == 0) {
            this.f2491g = true;
        } else if ((i & 255) != 0) {
            return false;
        } else {
            this.f2491g = false;
        }
        this.f2492h = 2;
        return true;
    }

    /* renamed from: b */
    public boolean mo11563b(int i) {
        int i2;
        int i3 = this.f2489e - this.f2488d;
        while (i3 < i) {
            InputStream inputStream = this.f2486b;
            if (inputStream == null) {
                i2 = -1;
            } else {
                byte[] bArr = this.f2487c;
                int i4 = this.f2489e;
                i2 = inputStream.read(bArr, i4, bArr.length - i4);
            }
            if (i2 < 1) {
                return false;
            }
            this.f2489e += i2;
            i3 += i2;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo11564c(String str) {
        throw new CharConversionException(C0843a.m452m("Unsupported UCS-4 endianness (", str, ") detected"));
    }
}
