package p005b.p096l.p180d.p191q.p192f.p196h;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p191q.p192f.p195g.C4004e;

/* renamed from: b.l.d.q.f.h.e */
public class C4061e implements C4050a {

    /* renamed from: d */
    public static final Charset f7468d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final File f7469a;

    /* renamed from: b */
    public final int f7470b;

    /* renamed from: c */
    public C4055c f7471c;

    /* renamed from: b.l.d.q.f.h.e$a */
    public static class C4062a {

        /* renamed from: a */
        public final byte[] f7472a;

        /* renamed from: b */
        public final int f7473b;

        public C4062a(byte[] bArr, int i) {
            this.f7472a = bArr;
            this.f7473b = i;
        }
    }

    public C4061e(File file, int i) {
        this.f7469a = file;
        this.f7470b = i;
    }

    /* renamed from: a */
    public void mo15557a() {
        C4004e.m7393a(this.f7471c, "There was a problem closing the Crashlytics log file.");
        this.f7471c = null;
    }

    /* renamed from: b */
    public String mo15558b() {
        byte[] d = mo15579d();
        if (d != null) {
            return new String(d, f7468d);
        }
        return null;
    }

    /* renamed from: c */
    public void mo15559c(long j, String str) {
        mo15580e();
        if (this.f7471c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.f7470b / 4;
                if (str.length() > i) {
                    str = "..." + str.substring(str.length() - i);
                }
                this.f7471c.mo15566e(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(f7468d));
                while (!this.f7471c.mo15562N() && this.f7471c.mo15569l0() > this.f7470b) {
                    this.f7471c.mo15564Z();
                }
            } catch (IOException e) {
                if (C3982b.f7289a.mo15495a(6)) {
                    Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo15579d() {
        /*
            r7 = this;
            java.io.File r0 = r7.f7469a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            r4 = r1
            goto L_0x0042
        L_0x000c:
            r7.mo15580e()
            b.l.d.q.f.h.c r0 = r7.f7471c
            if (r0 != 0) goto L_0x0014
            goto L_0x000a
        L_0x0014:
            r3 = 1
            int[] r3 = new int[r3]
            r3[r2] = r2
            int r0 = r0.mo15569l0()
            byte[] r0 = new byte[r0]
            b.l.d.q.f.h.c r4 = r7.f7471c     // Catch:{ IOException -> 0x002a }
            b.l.d.q.f.h.d r5 = new b.l.d.q.f.h.d     // Catch:{ IOException -> 0x002a }
            r5.<init>(r7, r0, r3)     // Catch:{ IOException -> 0x002a }
            r4.mo15561H(r5)     // Catch:{ IOException -> 0x002a }
            goto L_0x003b
        L_0x002a:
            r4 = move-exception
            b.l.d.q.f.b r5 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            r6 = 6
            boolean r5 = r5.mo15495a(r6)
            if (r5 == 0) goto L_0x003b
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            android.util.Log.e(r5, r6, r4)
        L_0x003b:
            b.l.d.q.f.h.e$a r4 = new b.l.d.q.f.h.e$a
            r3 = r3[r2]
            r4.<init>(r0, r3)
        L_0x0042:
            if (r4 != 0) goto L_0x0045
            return r1
        L_0x0045:
            int r0 = r4.f7473b
            byte[] r1 = new byte[r0]
            byte[] r3 = r4.f7472a
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p191q.p192f.p196h.C4061e.mo15579d():byte[]");
    }

    /* renamed from: e */
    public final void mo15580e() {
        if (this.f7471c == null) {
            try {
                this.f7471c = new C4055c(this.f7469a);
            } catch (IOException e) {
                C3982b bVar = C3982b.f7289a;
                StringBuilder u = C0843a.m460u("Could not open log file: ");
                u.append(this.f7469a);
                bVar.mo15498d(u.toString(), e);
            }
        }
    }
}
