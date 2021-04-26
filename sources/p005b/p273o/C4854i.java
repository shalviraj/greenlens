package p005b.p273o;

import android.os.Bundle;

/* renamed from: b.o.i */
public class C4854i implements C4848h<Bundle> {

    /* renamed from: a */
    public Bundle f9329a;

    public C4854i() {
        this.f9329a = new Bundle();
    }

    public C4854i(Bundle bundle) {
        this.f9329a = bundle;
    }

    /* renamed from: a */
    public void mo16577a(String str, String str2) {
        this.f9329a.putString(str, str2);
    }

    /* renamed from: b */
    public boolean mo16578b(String str, boolean z) {
        return this.f9329a.getBoolean(str, z);
    }

    /* renamed from: c */
    public void mo16579c(String str, Long l) {
        this.f9329a.putLong(str, l.longValue());
    }

    /* renamed from: d */
    public Integer mo16580d(String str) {
        return Integer.valueOf(this.f9329a.getInt(str));
    }

    /* renamed from: e */
    public Long mo16581e(String str) {
        return Long.valueOf(this.f9329a.getLong(str));
    }

    /* renamed from: f */
    public String mo16582f(String str) {
        return this.f9329a.getString(str);
    }

    /* renamed from: g */
    public boolean mo16583g(String str) {
        return this.f9329a.containsKey(str);
    }
}
