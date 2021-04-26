package p005b.p096l.p097a.p113c.p119b;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.Callable;
import p005b.p096l.p097a.p113c.p119b.p126p.C1957a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1961e;

/* renamed from: b.l.a.c.b.v */
public final /* synthetic */ class C1973v implements Callable {

    /* renamed from: a */
    public final boolean f3537a;

    /* renamed from: b */
    public final String f3538b;

    /* renamed from: c */
    public final C1972u f3539c;

    public C1973v(boolean z, String str, C1972u uVar) {
        this.f3537a = z;
        this.f3538b = str;
        this.f3539c = uVar;
    }

    public final Object call() {
        boolean z = this.f3537a;
        String str = this.f3538b;
        C1972u uVar = this.f3539c;
        Object[] objArr = new Object[5];
        objArr[0] = !z && C1971t.m2886a(str, uVar, true, false).f3101a ? "debug cert rejected" : "not whitelisted";
        objArr[1] = str;
        byte[] digest = C1957a.m2689b("SHA-1").digest(uVar.mo12302k());
        char[] cArr = new char[(digest.length << 1)];
        int i = 0;
        for (byte b : digest) {
            byte b2 = b & ExifInterface.MARKER;
            int i2 = i + 1;
            char[] cArr2 = C1961e.f3520b;
            cArr[i] = cArr2[b2 >>> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        objArr[2] = new String(cArr);
        objArr[3] = Boolean.valueOf(z);
        objArr[4] = "12451009.false";
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", objArr);
    }
}
