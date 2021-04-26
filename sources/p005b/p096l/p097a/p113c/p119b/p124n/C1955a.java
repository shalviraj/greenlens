package p005b.p096l.p097a.p113c.p119b.p124n;

import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Locale;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p122m.C1925l;

/* renamed from: b.l.a.c.b.n.a */
public class C1955a {

    /* renamed from: a */
    public final String f3501a;

    /* renamed from: b */
    public final String f3502b;

    /* renamed from: c */
    public final int f3503c;

    public C1955a(String str, String... strArr) {
        String str2;
        if (strArr.length == 0) {
            str2 = "";
        } else {
            StringBuilder t = C0843a.m459t('[');
            for (String str3 : strArr) {
                if (t.length() > 1) {
                    t.append(",");
                }
                t.append(str3);
            }
            t.append(']');
            t.append(' ');
            str2 = t.toString();
        }
        this.f3502b = str2;
        this.f3501a = str;
        new C1925l(str, (String) null);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f3501a, i)) {
            i++;
        }
        this.f3503c = i;
    }

    /* renamed from: a */
    public void mo12282a(String str, @Nullable Object... objArr) {
        if (this.f3503c <= 3) {
            Log.d(this.f3501a, mo12284c(str, objArr));
        }
    }

    /* renamed from: b */
    public void mo12283b(String str, @Nullable Object... objArr) {
        Log.e(this.f3501a, mo12284c(str, objArr));
    }

    /* renamed from: c */
    public String mo12284c(String str, @Nullable Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f3502b.concat(str);
    }

    /* renamed from: d */
    public void mo12285d(String str, @Nullable Object... objArr) {
        if (this.f3503c <= 2) {
            Log.v(this.f3501a, mo12284c(str, objArr));
        }
    }

    /* renamed from: e */
    public void mo12286e(String str, @Nullable Object... objArr) {
        Log.w(this.f3501a, mo12284c(str, objArr));
    }
}
