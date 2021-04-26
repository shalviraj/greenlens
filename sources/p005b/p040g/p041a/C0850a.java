package p005b.p040g.p041a;

import android.content.Context;
import androidx.annotation.NonNull;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p040g.p041a.p050k.C0926c;
import p005b.p280p.p285b.C5245o;

/* renamed from: b.g.a.a */
public class C0850a {

    /* renamed from: a */
    public final String f707a;

    /* renamed from: b */
    public final C5245o f708b;

    /* renamed from: c */
    public C0926c f709c;

    /* renamed from: d */
    public boolean f710d;

    public C0850a(@NonNull Context context) {
        String b = m557b(context, "com_auth0_client_id");
        String b2 = m557b(context, "com_auth0_domain");
        this.f707a = b;
        C5245o a = mo10689a(b2);
        this.f708b = a;
        if (a != null) {
            if (mo10689a((String) null) == null) {
                String str = a.f10423d;
                if (str.endsWith(".auth0.com")) {
                    String[] split = str.split("\\.");
                    C5245o.m9723l(split.length > 3 ? C0843a.m455p(C0843a.m460u("https://cdn."), split[split.length - 3], ".auth0.com") : "https://cdn.auth0.com");
                }
            }
            this.f709c = new C0926c("Auth0.Android", "1.22.0");
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid domain url: '%s'", new Object[]{b2}));
    }

    /* renamed from: b */
    public static String m557b(@NonNull Context context, String str) {
        int identifier = context.getResources().getIdentifier(str, "string", context.getPackageName());
        if (identifier != 0) {
            return context.getString(identifier);
        }
        throw new IllegalArgumentException(String.format("The 'R.string.%s' value it's not defined in your project's resources file.", new Object[]{str}));
    }

    /* renamed from: a */
    public final C5245o mo10689a(String str) {
        if (str == null) {
            return null;
        }
        if (!str.startsWith("http")) {
            str = C0843a.m451l("https://", str);
        }
        return C5245o.m9723l(str);
    }
}
