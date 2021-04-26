package p005b.p096l.p232f.p261z.p264e;

import androidx.exifinterface.media.ExifInterface;
import java.nio.charset.StandardCharsets;
import p005b.p096l.p232f.C4612f;

/* renamed from: b.l.f.z.e.h */
public final class C4692h {

    /* renamed from: a */
    public final String f8918a;

    /* renamed from: b */
    public C4695k f8919b;

    /* renamed from: c */
    public C4612f f8920c;

    /* renamed from: d */
    public C4612f f8921d;

    /* renamed from: e */
    public final StringBuilder f8922e;

    /* renamed from: f */
    public int f8923f;

    /* renamed from: g */
    public int f8924g;

    /* renamed from: h */
    public C4694j f8925h;

    /* renamed from: i */
    public int f8926i;

    public C4692h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i = 0;
        while (i < length) {
            char c = (char) (bytes[i] & ExifInterface.MARKER);
            if (c != '?' || str.charAt(i) == '?') {
                sb.append(c);
                i++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f8918a = sb.toString();
        this.f8919b = C4695k.FORCE_NONE;
        this.f8922e = new StringBuilder(str.length());
        this.f8924g = -1;
    }

    /* renamed from: a */
    public int mo16382a() {
        return this.f8922e.length();
    }

    /* renamed from: b */
    public char mo16383b() {
        return this.f8918a.charAt(this.f8923f);
    }

    /* renamed from: c */
    public int mo16384c() {
        return (this.f8918a.length() - this.f8926i) - this.f8923f;
    }

    /* renamed from: d */
    public boolean mo16385d() {
        return this.f8923f < this.f8918a.length() - this.f8926i;
    }

    /* renamed from: e */
    public void mo16386e() {
        mo16387f(mo16382a());
    }

    /* renamed from: f */
    public void mo16387f(int i) {
        C4694j jVar = this.f8925h;
        if (jVar == null || i > jVar.f8933b) {
            this.f8925h = C4694j.m8644i(i, this.f8919b, this.f8920c, this.f8921d, true);
        }
    }
}
