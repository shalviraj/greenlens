package p005b.p040g.p041a.p046h;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;

/* renamed from: b.g.a.h.e */
public class C0883e {

    /* renamed from: c */
    public static final String f750c = "e";

    /* renamed from: a */
    public final int f751a;

    /* renamed from: b */
    public final Intent f752b;

    public C0883e(@Nullable Intent intent) {
        this.f752b = intent;
        this.f751a = mo10732a() != null ? -1 : 0;
    }

    @Nullable
    /* renamed from: a */
    public Uri mo10732a() {
        Intent intent = this.f752b;
        if (intent == null) {
            return null;
        }
        return intent.getData();
    }

    /* renamed from: b */
    public boolean mo10733b() {
        return this.f751a == 0 && this.f752b != null && mo10732a() == null;
    }
}
