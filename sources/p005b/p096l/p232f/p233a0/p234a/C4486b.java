package p005b.p096l.p232f.p233a0.p234a;

import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.f.a0.a.b */
public final class C4486b {

    /* renamed from: a */
    public final String f8348a;

    /* renamed from: b */
    public final String f8349b;

    /* renamed from: c */
    public final byte[] f8350c;

    /* renamed from: d */
    public final Integer f8351d;

    /* renamed from: e */
    public final String f8352e;

    /* renamed from: f */
    public final String f8353f;

    public C4486b() {
        this.f8348a = null;
        this.f8349b = null;
        this.f8350c = null;
        this.f8351d = null;
        this.f8352e = null;
        this.f8353f = null;
    }

    public C4486b(String str, String str2, byte[] bArr, Integer num, String str3, String str4) {
        this.f8348a = str;
        this.f8349b = str2;
        this.f8350c = bArr;
        this.f8351d = num;
        this.f8352e = str3;
        this.f8353f = str4;
    }

    public String toString() {
        byte[] bArr = this.f8350c;
        int length = bArr == null ? 0 : bArr.length;
        StringBuilder u = C0843a.m460u("Format: ");
        u.append(this.f8349b);
        u.append(10);
        u.append("Contents: ");
        u.append(this.f8348a);
        u.append(10);
        u.append("Raw bytes: (");
        u.append(length);
        u.append(" bytes)\nOrientation: ");
        u.append(this.f8351d);
        u.append(10);
        u.append("EC level: ");
        u.append(this.f8352e);
        u.append(10);
        u.append("Barcode image: ");
        return C0843a.m454o(u, this.f8353f, 10);
    }
}
