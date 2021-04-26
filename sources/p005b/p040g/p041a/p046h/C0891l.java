package p005b.p040g.p041a.p046h;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import p005b.p040g.p041a.C0850a;
import p005b.p040g.p041a.C0851b;

/* renamed from: b.g.a.h.l */
public class C0891l extends C0900p {

    /* renamed from: a */
    public final C0850a f774a;

    /* renamed from: b */
    public final C0905u f775b;

    /* renamed from: c */
    public final Map<String, String> f776c;

    /* renamed from: d */
    public C0887i f777d;

    public C0891l(@NonNull C0850a aVar, @NonNull C0905u uVar, @NonNull String str) {
        this.f774a = aVar;
        this.f775b = uVar;
        HashMap hashMap = new HashMap();
        this.f776c = hashMap;
        hashMap.put("returnTo", str);
    }

    /* renamed from: a */
    public boolean mo10741a(C0883e eVar) {
        if (eVar.mo10733b()) {
            this.f775b.mo10713b(new C0851b("The user closed the browser app so the logout was cancelled."));
            return true;
        }
        this.f775b.mo10712a(null);
        return true;
    }
}
