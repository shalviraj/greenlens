package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.h.b.y3 */
public final class C3379y3 {

    /* renamed from: a */
    public final String f6112a;

    /* renamed from: b */
    public final long f6113b;

    /* renamed from: c */
    public boolean f6114c;

    /* renamed from: d */
    public long f6115d;

    /* renamed from: e */
    public final /* synthetic */ C3135c4 f6116e;

    public C3379y3(C3135c4 c4Var, String str, long j) {
        this.f6116e = c4Var;
        C0823f.m376j(str);
        this.f6112a = str;
        this.f6113b = j;
    }

    @WorkerThread
    /* renamed from: a */
    public final long mo14633a() {
        if (!this.f6114c) {
            this.f6114c = true;
            this.f6115d = this.f6116e.mo14143o().getLong(this.f6112a, this.f6113b);
        }
        return this.f6115d;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo14634b(long j) {
        SharedPreferences.Editor edit = this.f6116e.mo14143o().edit();
        edit.putLong(this.f6112a, j);
        edit.apply();
        this.f6115d = j;
    }
}
