package p005b.p273o;

import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;

@RequiresApi(api = 22)
/* renamed from: b.o.j */
public class C4880j implements C4848h<PersistableBundle> {

    /* renamed from: a */
    public PersistableBundle f9421a = new PersistableBundle();

    /* renamed from: a */
    public void mo16577a(String str, String str2) {
        this.f9421a.putString(str, str2);
    }

    /* renamed from: b */
    public boolean mo16578b(String str, boolean z) {
        return this.f9421a.getBoolean(str, z);
    }

    /* renamed from: c */
    public void mo16579c(String str, Long l) {
        this.f9421a.putLong(str, l.longValue());
    }

    /* renamed from: d */
    public Integer mo16580d(String str) {
        return Integer.valueOf(this.f9421a.getInt(str));
    }

    /* renamed from: e */
    public Long mo16581e(String str) {
        return Long.valueOf(this.f9421a.getLong(str));
    }

    /* renamed from: f */
    public String mo16582f(String str) {
        return this.f9421a.getString(str);
    }

    /* renamed from: g */
    public boolean mo16583g(String str) {
        return this.f9421a.containsKey(str);
    }
}
