package p005b.p096l.p180d.p191q.p192f.p196h;

import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.d.q.f.h.c */
public class C4055c implements Closeable {

    /* renamed from: m */
    public static final Logger f7451m = Logger.getLogger(C4055c.class.getName());

    /* renamed from: g */
    public final RandomAccessFile f7452g;

    /* renamed from: h */
    public int f7453h;

    /* renamed from: i */
    public int f7454i;

    /* renamed from: j */
    public C4057b f7455j;

    /* renamed from: k */
    public C4057b f7456k;

    /* renamed from: l */
    public final byte[] f7457l = new byte[16];

    /* renamed from: b.l.d.q.f.h.c$a */
    public class C4056a implements C4059d {

        /* renamed from: a */
        public boolean f7458a = true;

        /* renamed from: b */
        public final /* synthetic */ StringBuilder f7459b;

        public C4056a(C4055c cVar, StringBuilder sb) {
            this.f7459b = sb;
        }

        public void read(InputStream inputStream, int i) {
            if (this.f7458a) {
                this.f7458a = false;
            } else {
                this.f7459b.append(", ");
            }
            this.f7459b.append(i);
        }
    }

    /* renamed from: b.l.d.q.f.h.c$b */
    public static class C4057b {

        /* renamed from: c */
        public static final C4057b f7460c = new C4057b(0, 0);

        /* renamed from: a */
        public final int f7461a;

        /* renamed from: b */
        public final int f7462b;

        public C4057b(int i, int i2) {
            this.f7461a = i;
            this.f7462b = i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C4057b.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.f7461a);
            sb.append(", length = ");
            return C0843a.m453n(sb, this.f7462b, "]");
        }
    }

    /* renamed from: b.l.d.q.f.h.c$d */
    public interface C4059d {
        void read(InputStream inputStream, int i);
    }

    /* JADX INFO: finally extract failed */
    public C4055c(File file) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096);
                randomAccessFile.seek(0);
                byte[] bArr = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    m7459p0(bArr, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f7452g = randomAccessFile2;
        randomAccessFile2.seek(0);
        randomAccessFile2.readFully(this.f7457l);
        int S = m7457S(this.f7457l, 0);
        this.f7453h = S;
        if (((long) S) <= randomAccessFile2.length()) {
            this.f7454i = m7457S(this.f7457l, 4);
            int S2 = m7457S(this.f7457l, 8);
            int S3 = m7457S(this.f7457l, 12);
            this.f7455j = mo15563O(S2);
            this.f7456k = mo15563O(S3);
            return;
        }
        StringBuilder u = C0843a.m460u("File is truncated. Expected length: ");
        u.append(this.f7453h);
        u.append(", Actual length: ");
        u.append(randomAccessFile2.length());
        throw new IOException(u.toString());
    }

    /* renamed from: S */
    public static int m7457S(byte[] bArr, int i) {
        return ((bArr[i] & ExifInterface.MARKER) << 24) + ((bArr[i + 1] & ExifInterface.MARKER) << 16) + ((bArr[i + 2] & ExifInterface.MARKER) << 8) + (bArr[i + 3] & ExifInterface.MARKER);
    }

    /* renamed from: d */
    public static int m7458d(C4055c cVar, int i) {
        int i2 = cVar.f7453h;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: p0 */
    public static void m7459p0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: H */
    public synchronized void mo15561H(C4059d dVar) {
        int i = this.f7455j.f7461a;
        for (int i2 = 0; i2 < this.f7454i; i2++) {
            C4057b O = mo15563O(i);
            dVar.read(new C4058c(O, (C4056a) null), O.f7462b);
            i = mo15570n0(O.f7461a + 4 + O.f7462b);
        }
    }

    /* renamed from: N */
    public synchronized boolean mo15562N() {
        return this.f7454i == 0;
    }

    /* renamed from: O */
    public final C4057b mo15563O(int i) {
        if (i == 0) {
            return C4057b.f7460c;
        }
        this.f7452g.seek((long) i);
        return new C4057b(i, this.f7452g.readInt());
    }

    /* renamed from: Z */
    public synchronized void mo15564Z() {
        if (mo15562N()) {
            throw new NoSuchElementException();
        } else if (this.f7454i == 1) {
            mo15572q();
        } else {
            C4057b bVar = this.f7455j;
            int n0 = mo15570n0(bVar.f7461a + 4 + bVar.f7462b);
            mo15567f0(n0, this.f7457l, 0, 4);
            int S = m7457S(this.f7457l, 0);
            mo15571o0(this.f7453h, this.f7454i - 1, n0, this.f7456k.f7461a);
            this.f7454i--;
            this.f7455j = new C4057b(n0, S);
        }
    }

    public synchronized void close() {
        this.f7452g.close();
    }

    /* renamed from: e */
    public void mo15566e(byte[] bArr) {
        int i;
        int length = bArr.length;
        synchronized (this) {
            if ((0 | length) >= 0) {
                if (length <= bArr.length - 0) {
                    mo15574z(length);
                    boolean N = mo15562N();
                    if (N) {
                        i = 16;
                    } else {
                        C4057b bVar = this.f7456k;
                        i = mo15570n0(bVar.f7461a + 4 + bVar.f7462b);
                    }
                    C4057b bVar2 = new C4057b(i, length);
                    m7459p0(this.f7457l, 0, length);
                    mo15568h0(bVar2.f7461a, this.f7457l, 0, 4);
                    mo15568h0(bVar2.f7461a + 4, bArr, 0, length);
                    mo15571o0(this.f7453h, this.f7454i + 1, N ? bVar2.f7461a : this.f7455j.f7461a, bVar2.f7461a);
                    this.f7456k = bVar2;
                    this.f7454i++;
                    if (N) {
                        this.f7455j = bVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: f0 */
    public final void mo15567f0(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int i4 = this.f7453h;
        if (i >= i4) {
            i = (i + 16) - i4;
        }
        if (i + i3 <= i4) {
            this.f7452g.seek((long) i);
            randomAccessFile = this.f7452g;
        } else {
            int i5 = i4 - i;
            this.f7452g.seek((long) i);
            this.f7452g.readFully(bArr, i2, i5);
            this.f7452g.seek(16);
            randomAccessFile = this.f7452g;
            i2 += i5;
            i3 -= i5;
        }
        randomAccessFile.readFully(bArr, i2, i3);
    }

    /* renamed from: h0 */
    public final void mo15568h0(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int i4 = this.f7453h;
        if (i >= i4) {
            i = (i + 16) - i4;
        }
        if (i + i3 <= i4) {
            this.f7452g.seek((long) i);
            randomAccessFile = this.f7452g;
        } else {
            int i5 = i4 - i;
            this.f7452g.seek((long) i);
            this.f7452g.write(bArr, i2, i5);
            this.f7452g.seek(16);
            randomAccessFile = this.f7452g;
            i2 += i5;
            i3 -= i5;
        }
        randomAccessFile.write(bArr, i2, i3);
    }

    /* renamed from: l0 */
    public int mo15569l0() {
        if (this.f7454i == 0) {
            return 16;
        }
        C4057b bVar = this.f7456k;
        int i = bVar.f7461a;
        int i2 = this.f7455j.f7461a;
        return i >= i2 ? (i - i2) + 4 + bVar.f7462b + 16 : (((i + 4) + bVar.f7462b) + this.f7453h) - i2;
    }

    /* renamed from: n0 */
    public final int mo15570n0(int i) {
        int i2 = this.f7453h;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: o0 */
    public final void mo15571o0(int i, int i2, int i3, int i4) {
        byte[] bArr = this.f7457l;
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            m7459p0(bArr, i5, iArr[i6]);
            i5 += 4;
        }
        this.f7452g.seek(0);
        this.f7452g.write(this.f7457l);
    }

    /* renamed from: q */
    public synchronized void mo15572q() {
        mo15571o0(4096, 0, 0, 0);
        this.f7454i = 0;
        C4057b bVar = C4057b.f7460c;
        this.f7455j = bVar;
        this.f7456k = bVar;
        if (this.f7453h > 4096) {
            this.f7452g.setLength((long) 4096);
            this.f7452g.getChannel().force(true);
        }
        this.f7453h = 4096;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C4055c.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f7453h);
        sb.append(", size=");
        sb.append(this.f7454i);
        sb.append(", first=");
        sb.append(this.f7455j);
        sb.append(", last=");
        sb.append(this.f7456k);
        sb.append(", element lengths=[");
        try {
            mo15561H(new C4056a(this, sb));
        } catch (IOException e) {
            f7451m.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: z */
    public final void mo15574z(int i) {
        int i2 = i + 4;
        int l0 = this.f7453h - mo15569l0();
        if (l0 < i2) {
            int i3 = this.f7453h;
            do {
                l0 += i3;
                i3 <<= 1;
            } while (l0 < i2);
            this.f7452g.setLength((long) i3);
            this.f7452g.getChannel().force(true);
            C4057b bVar = this.f7456k;
            int n0 = mo15570n0(bVar.f7461a + 4 + bVar.f7462b);
            if (n0 < this.f7455j.f7461a) {
                FileChannel channel = this.f7452g.getChannel();
                channel.position((long) this.f7453h);
                long j = (long) (n0 - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.f7456k.f7461a;
            int i5 = this.f7455j.f7461a;
            if (i4 < i5) {
                int i6 = (this.f7453h + i4) - 16;
                mo15571o0(i3, this.f7454i, i5, i6);
                this.f7456k = new C4057b(i6, this.f7456k.f7462b);
            } else {
                mo15571o0(i3, this.f7454i, i5, i4);
            }
            this.f7453h = i3;
        }
    }

    /* renamed from: b.l.d.q.f.h.c$c */
    public final class C4058c extends InputStream {

        /* renamed from: g */
        public int f7463g;

        /* renamed from: h */
        public int f7464h;

        public C4058c(C4057b bVar, C4056a aVar) {
            int i = bVar.f7461a + 4;
            int i2 = C4055c.this.f7453h;
            this.f7463g = i >= i2 ? (i + 16) - i2 : i;
            this.f7464h = bVar.f7462b;
        }

        public int read() {
            if (this.f7464h == 0) {
                return -1;
            }
            C4055c.this.f7452g.seek((long) this.f7463g);
            int read = C4055c.this.f7452g.read();
            this.f7463g = C4055c.m7458d(C4055c.this, this.f7463g + 1);
            this.f7464h--;
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            Objects.requireNonNull(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f7464h;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            C4055c.this.mo15567f0(this.f7463g, bArr, i, i2);
            this.f7463g = C4055c.m7458d(C4055c.this, this.f7463g + i2);
            this.f7464h -= i2;
            return i2;
        }
    }
}
