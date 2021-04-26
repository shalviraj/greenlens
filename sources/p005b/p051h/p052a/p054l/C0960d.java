package p005b.p051h.p052a.p054l;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.h.a.l.d */
public class C0960d {

    /* renamed from: a */
    public final byte[] f972a = new byte[256];

    /* renamed from: b */
    public ByteBuffer f973b;

    /* renamed from: c */
    public C0959c f974c;

    /* renamed from: d */
    public int f975d = 0;

    /* renamed from: a */
    public final boolean mo10815a() {
        return this.f974c.f962b != 0;
    }

    @NonNull
    /* renamed from: b */
    public C0959c mo10816b() {
        if (this.f973b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (mo10815a()) {
            return this.f974c;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb.append((char) mo10817c());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.f974c.f962b = 1;
            } else {
                this.f974c.f966f = mo10820f();
                this.f974c.f967g = mo10820f();
                int c = mo10817c();
                C0959c cVar = this.f974c;
                cVar.f968h = (c & 128) != 0;
                cVar.f969i = (int) Math.pow(2.0d, (double) ((c & 7) + 1));
                this.f974c.f970j = mo10817c();
                C0959c cVar2 = this.f974c;
                mo10817c();
                Objects.requireNonNull(cVar2);
                if (this.f974c.f968h && !mo10815a()) {
                    C0959c cVar3 = this.f974c;
                    cVar3.f961a = mo10819e(cVar3.f969i);
                    C0959c cVar4 = this.f974c;
                    cVar4.f971k = cVar4.f961a[cVar4.f970j];
                }
            }
            if (!mo10815a()) {
                boolean z = false;
                while (!z && !mo10815a() && this.f974c.f963c <= Integer.MAX_VALUE) {
                    int c2 = mo10817c();
                    if (c2 == 33) {
                        int c3 = mo10817c();
                        if (c3 != 1) {
                            if (c3 == 249) {
                                this.f974c.f964d = new C0958b();
                                mo10817c();
                                int c4 = mo10817c();
                                C0958b bVar = this.f974c.f964d;
                                int i2 = (c4 & 28) >> 2;
                                bVar.f956g = i2;
                                if (i2 == 0) {
                                    bVar.f956g = 1;
                                }
                                bVar.f955f = (c4 & 1) != 0;
                                int f = mo10820f();
                                if (f < 2) {
                                    f = 10;
                                }
                                C0958b bVar2 = this.f974c.f964d;
                                bVar2.f958i = f * 10;
                                bVar2.f957h = mo10817c();
                                mo10817c();
                            } else if (c3 != 254 && c3 == 255) {
                                mo10818d();
                                StringBuilder sb2 = new StringBuilder();
                                for (int i3 = 0; i3 < 11; i3++) {
                                    sb2.append((char) this.f972a[i3]);
                                }
                                if (sb2.toString().equals("NETSCAPE2.0")) {
                                    do {
                                        mo10818d();
                                        byte[] bArr = this.f972a;
                                        if (bArr[0] == 1) {
                                            byte b = bArr[1];
                                            byte b2 = bArr[2];
                                            Objects.requireNonNull(this.f974c);
                                        }
                                        if (this.f975d <= 0) {
                                            break;
                                        }
                                    } while (mo10815a());
                                }
                            }
                        }
                        mo10821g();
                    } else if (c2 == 44) {
                        C0959c cVar5 = this.f974c;
                        if (cVar5.f964d == null) {
                            cVar5.f964d = new C0958b();
                        }
                        cVar5.f964d.f950a = mo10820f();
                        this.f974c.f964d.f951b = mo10820f();
                        this.f974c.f964d.f952c = mo10820f();
                        this.f974c.f964d.f953d = mo10820f();
                        int c5 = mo10817c();
                        boolean z2 = (c5 & 128) != 0;
                        int pow = (int) Math.pow(2.0d, (double) ((c5 & 7) + 1));
                        C0958b bVar3 = this.f974c.f964d;
                        bVar3.f954e = (c5 & 64) != 0;
                        if (z2) {
                            bVar3.f960k = mo10819e(pow);
                        } else {
                            bVar3.f960k = null;
                        }
                        this.f974c.f964d.f959j = this.f973b.position();
                        mo10817c();
                        mo10821g();
                        if (!mo10815a()) {
                            C0959c cVar6 = this.f974c;
                            cVar6.f963c++;
                            cVar6.f965e.add(cVar6.f964d);
                        }
                    } else if (c2 != 59) {
                        this.f974c.f962b = 1;
                    } else {
                        z = true;
                    }
                }
                C0959c cVar7 = this.f974c;
                if (cVar7.f963c < 0) {
                    cVar7.f962b = 1;
                }
            }
            return this.f974c;
        }
    }

    /* renamed from: c */
    public final int mo10817c() {
        try {
            return this.f973b.get() & ExifInterface.MARKER;
        } catch (Exception unused) {
            this.f974c.f962b = 1;
            return 0;
        }
    }

    /* renamed from: d */
    public final void mo10818d() {
        int c = mo10817c();
        this.f975d = c;
        if (c > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.f975d;
                    if (i < i3) {
                        i2 = i3 - i;
                        this.f973b.get(this.f972a, i, i2);
                        i += i2;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder x = C0843a.m463x("Error Reading Block n: ", i, " count: ", i2, " blockSize: ");
                        x.append(this.f975d);
                        Log.d("GifHeaderParser", x.toString(), e);
                    }
                    this.f974c.f962b = 1;
                    return;
                }
            }
        }
    }

    @Nullable
    /* renamed from: e */
    public final int[] mo10819e(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f973b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & ExifInterface.MARKER) << 16) | -16777216 | ((bArr[i4] & ExifInterface.MARKER) << 8) | (bArr[i5] & ExifInterface.MARKER);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f974c.f962b = 1;
        }
        return iArr;
    }

    /* renamed from: f */
    public final int mo10820f() {
        return this.f973b.getShort();
    }

    /* renamed from: g */
    public final void mo10821g() {
        int c;
        do {
            c = mo10817c();
            this.f973b.position(Math.min(this.f973b.position() + c, this.f973b.limit()));
        } while (c > 0);
    }
}
