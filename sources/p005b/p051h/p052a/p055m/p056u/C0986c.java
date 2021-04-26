package p005b.p051h.p052a.p055m.p056u;

import androidx.annotation.NonNull;
import java.io.OutputStream;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1023b;

/* renamed from: b.h.a.m.u.c */
public final class C0986c extends OutputStream {
    @NonNull

    /* renamed from: g */
    public final OutputStream f1032g;

    /* renamed from: h */
    public byte[] f1033h;

    /* renamed from: i */
    public C1023b f1034i;

    /* renamed from: j */
    public int f1035j;

    public C0986c(@NonNull OutputStream outputStream, @NonNull C1023b bVar) {
        this.f1032g = outputStream;
        this.f1034i = bVar;
        this.f1033h = (byte[]) bVar.mo10888e(65536, byte[].class);
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        try {
            flush();
            this.f1032g.close();
            byte[] bArr = this.f1033h;
            if (bArr != null) {
                this.f1034i.mo10887d(bArr);
                this.f1033h = null;
            }
        } catch (Throwable th) {
            this.f1032g.close();
            throw th;
        }
    }

    public void flush() {
        int i = this.f1035j;
        if (i > 0) {
            this.f1032g.write(this.f1033h, 0, i);
            this.f1035j = 0;
        }
        this.f1032g.flush();
    }

    public void write(int i) {
        byte[] bArr = this.f1033h;
        int i2 = this.f1035j;
        int i3 = i2 + 1;
        this.f1035j = i3;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length && i3 > 0) {
            this.f1032g.write(bArr, 0, i3);
            this.f1035j = 0;
        }
    }

    public void write(@NonNull byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(@NonNull byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f1035j;
            if (i6 != 0 || i4 < this.f1033h.length) {
                int min = Math.min(i4, this.f1033h.length - i6);
                System.arraycopy(bArr, i5, this.f1033h, this.f1035j, min);
                int i7 = this.f1035j + min;
                this.f1035j = i7;
                i3 += min;
                byte[] bArr2 = this.f1033h;
                if (i7 == bArr2.length && i7 > 0) {
                    this.f1032g.write(bArr2, 0, i7);
                    this.f1035j = 0;
                    continue;
                }
            } else {
                this.f1032g.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
