package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.h.b.w3 */
public final class C3357w3 {

    /* renamed from: a */
    public final String f6053a;

    /* renamed from: b */
    public final boolean f6054b;

    /* renamed from: c */
    public boolean f6055c;

    /* renamed from: d */
    public boolean f6056d;

    /* renamed from: e */
    public final /* synthetic */ C3135c4 f6057e;

    public C3357w3(C3135c4 c4Var, String str, boolean z) {
        this.f6057e = c4Var;
        C0823f.m376j(str);
        this.f6053a = str;
        this.f6054b = z;
    }

    @WorkerThread
    /* renamed from: a */
    public final boolean mo14613a() {
        if (!this.f6055c) {
            this.f6055c = true;
            this.f6056d = this.f6057e.mo14143o().getBoolean(this.f6053a, this.f6054b);
        }
        return this.f6056d;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo14614b(boolean z) {
        SharedPreferences.Editor edit = this.f6057e.mo14143o().edit();
        edit.putBoolean(this.f6053a, z);
        edit.apply();
        this.f6056d = z;
    }
}
