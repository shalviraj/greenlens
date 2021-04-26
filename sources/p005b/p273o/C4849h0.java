package p005b.p273o;

import android.content.Context;
import java.security.SecureRandom;
import org.json.JSONObject;
import p005b.p273o.C4840g0;

/* renamed from: b.o.h0 */
public class C4849h0 {

    /* renamed from: a */
    public Context f9311a;

    /* renamed from: b */
    public JSONObject f9312b;

    /* renamed from: c */
    public boolean f9313c;

    /* renamed from: d */
    public boolean f9314d;

    /* renamed from: e */
    public boolean f9315e;

    /* renamed from: f */
    public Long f9316f;

    /* renamed from: g */
    public C4840g0.C4841a f9317g;

    public C4849h0(Context context) {
        this.f9311a = context;
    }

    /* renamed from: a */
    public Integer mo16584a() {
        if (this.f9317g == null) {
            this.f9317g = new C4840g0.C4841a();
        }
        C4840g0.C4841a aVar = this.f9317g;
        if (aVar.f9299a == null) {
            aVar.f9299a = Integer.valueOf(new SecureRandom().nextInt());
        }
        return this.f9317g.f9299a;
    }

    /* renamed from: b */
    public int mo16585b() {
        Integer num;
        C4840g0.C4841a aVar = this.f9317g;
        if (aVar == null || (num = aVar.f9299a) == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: c */
    public CharSequence mo16586c() {
        return this.f9312b.optString("alert", (String) null);
    }

    /* renamed from: d */
    public CharSequence mo16587d() {
        return this.f9312b.optString("title", (String) null);
    }
}
