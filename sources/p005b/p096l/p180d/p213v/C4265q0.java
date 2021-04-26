package p005b.p096l.p180d.p213v;

import android.content.SharedPreferences;
import com.google.firebase.iid.FirebaseInstanceId;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p150j.C3427g;
import p005b.p096l.p097a.p113c.p150j.C3428h;

/* renamed from: b.l.d.v.q0 */
public final /* synthetic */ class C4265q0 implements C3427g {

    /* renamed from: a */
    public final FirebaseInstanceId f7894a;

    /* renamed from: b */
    public final String f7895b;

    /* renamed from: c */
    public final String f7896c;

    /* renamed from: d */
    public final String f7897d;

    public C4265q0(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.f7894a = firebaseInstanceId;
        this.f7895b = str;
        this.f7896c = str2;
        this.f7897d = str3;
    }

    /* renamed from: a */
    public final C3428h mo14700a(Object obj) {
        FirebaseInstanceId firebaseInstanceId = this.f7894a;
        String str = this.f7895b;
        String str2 = this.f7896c;
        String str3 = this.f7897d;
        String str4 = (String) obj;
        C4278x xVar = FirebaseInstanceId.f11438j;
        String c = firebaseInstanceId.f11442c.mo15862c();
        synchronized (xVar) {
            String a = C4232a0.m7771a(str4, c, System.currentTimeMillis());
            if (a != null) {
                SharedPreferences.Editor edit = xVar.f7924a.edit();
                edit.putString(C4278x.m7829a("", str, str2), a);
                edit.commit();
            }
        }
        return C1960d.m2740P(new C4277w0(str3, str4));
    }
}
