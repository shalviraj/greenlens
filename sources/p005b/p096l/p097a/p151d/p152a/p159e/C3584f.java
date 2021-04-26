package p005b.p096l.p097a.p151d.p152a.p159e;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.IllegalFormatException;
import java.util.Locale;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.d.a.e.f */
public final class C3584f {

    /* renamed from: a */
    public final String f6648a;

    public C3584f(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        this.f6648a = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    /* renamed from: c */
    public static String m6804c(String str, String str2, @Nullable Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                String valueOf = String.valueOf(str2);
                Log.e("PlayCore", valueOf.length() != 0 ? "Unable to format ".concat(valueOf) : new String("Unable to format "), e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        return C0843a.m456q(new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length()), str, " : ", str2);
    }

    /* renamed from: a */
    public final void mo14883a(Throwable th, String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m6804c(this.f6648a, str, objArr), th);
        }
    }

    /* renamed from: b */
    public final int mo14884b(int i, String str, @Nullable Object[] objArr) {
        if (Log.isLoggable("PlayCore", i)) {
            return Log.i("PlayCore", m6804c(this.f6648a, str, objArr));
        }
        return 0;
    }
}
