package p005b.p096l.p164b.p165a.p166a.p168b;

import com.google.api.client.http.HttpHeaders;
import java.util.List;
import java.util.regex.Pattern;
import p005b.p096l.p164b.p165a.p166a.p168b.C3663f;
import p005b.p096l.p164b.p165a.p169b.C3677f;

/* renamed from: b.l.b.a.a.b.c */
public class C3659c {

    /* renamed from: a */
    public static final Pattern f6743a = Pattern.compile("\\s*error\\s*=\\s*\"?invalid_token\"?");

    /* renamed from: b.l.b.a.a.b.c$a */
    public static final class C3660a implements C3663f.C3664a {
        /* renamed from: a */
        public void mo14956a(C3677f fVar, String str) {
            HttpHeaders httpHeaders = fVar.f6766b;
            httpHeaders.mo22143o("Bearer " + str);
        }

        /* renamed from: b */
        public String mo14957b(C3677f fVar) {
            List<String> g = fVar.f6766b.mo22136g();
            if (g == null) {
                return null;
            }
            for (String next : g) {
                if (next.startsWith("Bearer ")) {
                    return next.substring(7);
                }
            }
            return null;
        }
    }
}
