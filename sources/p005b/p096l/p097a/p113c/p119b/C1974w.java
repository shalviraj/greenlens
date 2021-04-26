package p005b.p096l.p097a.p113c.p119b;

import java.lang.ref.WeakReference;

/* renamed from: b.l.a.c.b.w */
public abstract class C1974w extends C1972u {

    /* renamed from: d */
    public static final WeakReference<byte[]> f3540d = new WeakReference<>((Object) null);

    /* renamed from: c */
    public WeakReference<byte[]> f3541c = f3540d;

    public C1974w(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: k */
    public final byte[] mo12302k() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f3541c.get();
            if (bArr == null) {
                bArr = mo11991o();
                this.f3541c = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: o */
    public abstract byte[] mo11991o();
}
