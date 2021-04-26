package p005b.p051h.p052a.p055m.p056u;

import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import java.io.FilterInputStream;
import java.io.InputStream;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.h.a.m.u.g */
public final class C0994g extends FilterInputStream {

    /* renamed from: i */
    public static final byte[] f1039i;

    /* renamed from: j */
    public static final int f1040j;

    /* renamed from: k */
    public static final int f1041k;

    /* renamed from: g */
    public final byte f1042g;

    /* renamed from: h */
    public int f1043h;

    static {
        byte[] bArr = {-1, ExifInterface.MARKER_APP1, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f1039i = bArr;
        int length = bArr.length;
        f1040j = length;
        f1041k = length + 2;
    }

    public C0994g(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(C0843a.m444e("Cannot add invalid orientation: ", i));
        }
        this.f1042g = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        int i;
        int i2 = this.f1043h;
        int read = (i2 < 2 || i2 > (i = f1041k)) ? super.read() : i2 == i ? this.f1042g : f1039i[i2 - 2] & ExifInterface.MARKER;
        if (read != -1) {
            this.f1043h++;
        }
        return read;
    }

    public int read(@NonNull byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.f1043h;
        int i5 = f1041k;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f1042g;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f1039i, this.f1043h - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f1043h += i3;
        }
        return i3;
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }

    public long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f1043h = (int) (((long) this.f1043h) + skip);
        }
        return skip;
    }
}
