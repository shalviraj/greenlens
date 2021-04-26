package p005b.p096l.p097a.p151d.p152a.p154b;

import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Objects;

/* renamed from: b.l.a.d.a.b.e1 */
public final class C3488e1 extends InputStream {

    /* renamed from: g */
    public final Enumeration<File> f6380g;
    @Nullable

    /* renamed from: h */
    public InputStream f6381h;

    public C3488e1(Enumeration<File> enumeration) {
        this.f6380g = enumeration;
        mo14770d();
    }

    public final void close() {
        super.close();
        InputStream inputStream = this.f6381h;
        if (inputStream != null) {
            inputStream.close();
            this.f6381h = null;
        }
    }

    /* renamed from: d */
    public final void mo14770d() {
        InputStream inputStream = this.f6381h;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f6381h = this.f6380g.hasMoreElements() ? new FileInputStream(this.f6380g.nextElement()) : null;
    }

    public final int read() {
        while (true) {
            InputStream inputStream = this.f6381h;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            mo14770d();
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.f6381h == null) {
            return -1;
        }
        Objects.requireNonNull(bArr);
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            do {
                int read = this.f6381h.read(bArr, i, i2);
                if (read > 0) {
                    return read;
                }
                mo14770d();
            } while (this.f6381h != null);
            return -1;
        }
    }
}
