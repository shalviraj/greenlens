package p005b.p051h.p052a.p055m.p064x.p065c;

import android.os.Build;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import java.io.File;

/* renamed from: b.h.a.m.x.c.r */
public final class C1253r {

    /* renamed from: f */
    public static final File f1544f = new File("/proc/self/fd");

    /* renamed from: g */
    public static volatile C1253r f1545g;

    /* renamed from: a */
    public final boolean f1546a;

    /* renamed from: b */
    public final int f1547b;

    /* renamed from: c */
    public final int f1548c;
    @GuardedBy("this")

    /* renamed from: d */
    public int f1549d;
    @GuardedBy("this")

    /* renamed from: e */
    public boolean f1550e = true;

    @VisibleForTesting
    public C1253r() {
        boolean z = true;
        String str = Build.MODEL;
        if (str != null && str.length() >= 7) {
            String substring = str.substring(0, 7);
            substring.hashCode();
            char c = 65535;
            switch (substring.hashCode()) {
                case -1398613787:
                    if (substring.equals("SM-A520")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1398431166:
                    if (substring.equals("SM-G930")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1398431161:
                    if (substring.equals("SM-G935")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1398431073:
                    if (substring.equals("SM-G960")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1398431068:
                    if (substring.equals("SM-G965")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1398343746:
                    if (substring.equals("SM-J720")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1398222624:
                    if (substring.equals("SM-N935")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    if (Build.VERSION.SDK_INT == 26) {
                        z = false;
                        break;
                    }
                    break;
            }
        }
        this.f1546a = z;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1547b = 20000;
            this.f1548c = 0;
            return;
        }
        this.f1547b = 700;
        this.f1548c = 128;
    }

    /* renamed from: a */
    public static C1253r m1232a() {
        if (f1545g == null) {
            synchronized (C1253r.class) {
                if (f1545g == null) {
                    f1545g = new C1253r();
                }
            }
        }
        return f1545g;
    }

    /* renamed from: b */
    public boolean mo11089b(int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3;
        if (!z || !this.f1546a || Build.VERSION.SDK_INT < 26 || z2 || i < (i3 = this.f1548c) || i2 < i3) {
            return false;
        }
        synchronized (this) {
            int i4 = this.f1549d + 1;
            this.f1549d = i4;
            if (i4 >= 50) {
                this.f1549d = 0;
                int length = f1544f.list().length;
                boolean z4 = length < this.f1547b;
                this.f1550e = z4;
                if (!z4 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.f1547b);
                }
            }
            z3 = this.f1550e;
        }
        return z3;
    }
}
