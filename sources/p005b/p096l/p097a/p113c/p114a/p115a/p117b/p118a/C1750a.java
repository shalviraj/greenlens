package p005b.p096l.p097a.p113c.p114a.p115a.p117b.p118a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: b.l.a.c.a.a.b.a.a */
public class C1750a {

    /* renamed from: c */
    public static final Lock f3083c = new ReentrantLock();

    /* renamed from: d */
    public static C1750a f3084d;

    /* renamed from: a */
    public final Lock f3085a = new ReentrantLock();

    /* renamed from: b */
    public final SharedPreferences f3086b;

    public C1750a(Context context) {
        this.f3086b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static C1750a m2319a(Context context) {
        Objects.requireNonNull(context, "null reference");
        Lock lock = f3083c;
        lock.lock();
        try {
            if (f3084d == null) {
                f3084d = new C1750a(context.getApplicationContext());
            }
            C1750a aVar = f3084d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f3083c.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public GoogleSignInAccount mo11977b() {
        String c = mo11978c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 20);
        sb.append("googleSignInAccount");
        sb.append(":");
        sb.append(c);
        String c2 = mo11978c(sb.toString());
        if (c2 == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m10368W(c2);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final String mo11978c(String str) {
        this.f3085a.lock();
        try {
            return this.f3086b.getString(str, (String) null);
        } finally {
            this.f3085a.unlock();
        }
    }
}
