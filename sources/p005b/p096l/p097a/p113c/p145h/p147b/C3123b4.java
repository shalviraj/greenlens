package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.h.b.b4 */
public final class C3123b4 {

    /* renamed from: a */
    public final String f5317a;

    /* renamed from: b */
    public boolean f5318b;

    /* renamed from: c */
    public String f5319c;

    /* renamed from: d */
    public final /* synthetic */ C3135c4 f5320d;

    public C3123b4(C3135c4 c4Var, String str) {
        this.f5320d = c4Var;
        C0823f.m376j(str);
        this.f5317a = str;
    }

    @WorkerThread
    /* renamed from: a */
    public final String mo14127a() {
        if (!this.f5318b) {
            this.f5318b = true;
            this.f5319c = this.f5320d.mo14143o().getString(this.f5317a, (String) null);
        }
        return this.f5319c;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo14128b(String str) {
        SharedPreferences.Editor edit = this.f5320d.mo14143o().edit();
        edit.putString(this.f5317a, str);
        edit.apply();
        this.f5319c = str;
    }
}
