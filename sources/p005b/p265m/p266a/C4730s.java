package p005b.p265m.p266a;

import android.graphics.Rect;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.m.a.s */
public class C4730s {

    /* renamed from: a */
    public C4725n f9031a;

    /* renamed from: b */
    public int f9032b;

    /* renamed from: c */
    public int f9033c;

    /* renamed from: d */
    public Rect f9034d;

    /* renamed from: e */
    public boolean f9035e;

    public C4730s(byte[] bArr, int i, int i2, int i3, int i4) {
        this.f9031a = new C4725n(bArr, i, i2);
        this.f9033c = i4;
        this.f9032b = i3;
        if (i * i2 > bArr.length) {
            StringBuilder x = C0843a.m463x("Image data does not match the resolution. ", i, "x", i2, " > ");
            x.append(bArr.length);
            throw new IllegalArgumentException(x.toString());
        }
    }
}
