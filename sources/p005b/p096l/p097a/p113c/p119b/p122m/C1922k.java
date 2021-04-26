package p005b.p096l.p097a.p113c.p119b.p122m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.b.m.k */
public abstract class C1922k {

    /* renamed from: a */
    public static final Object f3465a = new Object();

    /* renamed from: b */
    public static C1922k f3466b;

    /* renamed from: b.l.a.c.b.m.k$a */
    public static final class C1923a {

        /* renamed from: e */
        public static final Uri f3467e = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

        /* renamed from: a */
        public final String f3468a;

        /* renamed from: b */
        public final String f3469b;

        /* renamed from: c */
        public final int f3470c;

        /* renamed from: d */
        public final boolean f3471d;

        public C1923a(String str, String str2, int i) {
            C0823f.m376j(str);
            this.f3468a = str;
            C0823f.m376j(str2);
            this.f3469b = str2;
            this.f3470c = i;
            this.f3471d = false;
        }

        public C1923a(String str, String str2, int i, boolean z) {
            C0823f.m376j(str);
            this.f3468a = str;
            C0823f.m376j(str2);
            this.f3469b = str2;
            this.f3470c = i;
            this.f3471d = z;
        }

        /* renamed from: a */
        public final Intent mo12257a(Context context) {
            Intent intent = null;
            if (this.f3468a == null) {
                return new Intent().setComponent((ComponentName) null);
            }
            if (this.f3471d) {
                Bundle bundle = new Bundle();
                bundle.putString("serviceActionBundleKey", this.f3468a);
                Bundle call = context.getContentResolver().call(f3467e, "serviceIntentCall", (String) null, bundle);
                if (call != null) {
                    intent = (Intent) call.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    String valueOf = String.valueOf(this.f3468a);
                    Log.w("ConnectionStatusConfig", valueOf.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(valueOf) : new String("Dynamic lookup for intent failed for action: "));
                }
            }
            return intent == null ? new Intent(this.f3468a).setPackage(this.f3469b) : intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1923a)) {
                return false;
            }
            C1923a aVar = (C1923a) obj;
            return C0823f.m330A(this.f3468a, aVar.f3468a) && C0823f.m330A(this.f3469b, aVar.f3469b) && C0823f.m330A((Object) null, (Object) null) && this.f3470c == aVar.f3470c && this.f3471d == aVar.f3471d;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f3468a, this.f3469b, null, Integer.valueOf(this.f3470c), Boolean.valueOf(this.f3471d)});
        }

        public final String toString() {
            String str = this.f3468a;
            Objects.requireNonNull(str);
            return str;
        }
    }

    /* renamed from: a */
    public static C1922k m2652a(Context context) {
        synchronized (f3465a) {
            if (f3466b == null) {
                f3466b = new C1912f0(context.getApplicationContext());
            }
        }
        return f3466b;
    }

    /* renamed from: b */
    public abstract boolean mo12245b(C1923a aVar, ServiceConnection serviceConnection, String str);

    /* renamed from: c */
    public abstract void mo12246c(C1923a aVar, ServiceConnection serviceConnection, String str);
}
