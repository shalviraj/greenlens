package p005b.p051h.p052a.p055m.p064x.p066d;

import androidx.annotation.NonNull;
import java.util.Objects;
import p005b.p051h.p052a.p055m.p058v.C1115w;

/* renamed from: b.h.a.m.x.d.b */
public class C1269b implements C1115w<byte[]> {

    /* renamed from: g */
    public final byte[] f1578g;

    public C1269b(byte[] bArr) {
        Objects.requireNonNull(bArr, "Argument must not be null");
        this.f1578g = bArr;
    }

    /* renamed from: a */
    public int mo11004a() {
        return this.f1578g.length;
    }

    @NonNull
    /* renamed from: b */
    public Class<byte[]> mo11005b() {
        return byte[].class;
    }

    @NonNull
    public Object get() {
        return this.f1578g;
    }

    public void recycle() {
    }
}
