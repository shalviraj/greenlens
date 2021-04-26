package p005b.p096l.p180d.p185o;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Set;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.d.o.b */
public class C3857b {

    /* renamed from: c */
    public static final /* synthetic */ int f7099c = 0;

    /* renamed from: a */
    public final String f7100a;
    @Nullable

    /* renamed from: b */
    public final String f7101b;

    static {
        new C3917m0();
    }

    public C3857b(String str) {
        String a = m7248a(str, "apiKey");
        String a2 = m7248a(str, "oobCode");
        String a3 = m7248a(str, "mode");
        if (a == null || a2 == null || a3 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", new Object[]{"apiKey", "oobCode", "mode"}));
        }
        C0823f.m376j(a);
        C0823f.m376j(a2);
        this.f7100a = a2;
        C0823f.m376j(a3);
        m7248a(str, "continueUrl");
        m7248a(str, "languageCode");
        this.f7101b = m7248a(str, "tenantId");
    }

    @Nullable
    /* renamed from: a */
    public static String m7248a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            String queryParameter = parse.getQueryParameter("link");
            C0823f.m376j(queryParameter);
            return Uri.parse(queryParameter).getQueryParameter(str2);
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
