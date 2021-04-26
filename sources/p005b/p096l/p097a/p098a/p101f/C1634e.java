package p005b.p096l.p097a.p098a.p101f;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Map;
import p005b.p096l.p097a.p098a.p101f.C1625a;

@AutoValue
/* renamed from: b.l.a.a.f.e */
public abstract class C1634e {

    @AutoValue.Builder
    /* renamed from: b.l.a.a.f.e$a */
    public static abstract class C1635a {
        /* renamed from: a */
        public final C1635a mo11822a(String str, String str2) {
            mo11803c().put(str, str2);
            return this;
        }

        /* renamed from: b */
        public abstract C1634e mo11802b();

        /* renamed from: c */
        public abstract Map<String, String> mo11803c();
    }

    /* renamed from: a */
    public final String mo11819a(String str) {
        String str2 = mo11793b().get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: b */
    public abstract Map<String, String> mo11793b();

    @Nullable
    /* renamed from: c */
    public abstract Integer mo11794c();

    /* renamed from: d */
    public abstract C1633d mo11795d();

    /* renamed from: e */
    public abstract long mo11796e();

    /* renamed from: f */
    public final int mo11820f(String str) {
        String str2 = mo11793b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: g */
    public abstract String mo11798g();

    /* renamed from: h */
    public abstract long mo11799h();

    /* renamed from: i */
    public C1635a mo11821i() {
        C1625a.C1627b bVar = new C1625a.C1627b();
        bVar.mo11806f(mo11798g());
        bVar.f2854b = mo11794c();
        bVar.mo11804d(mo11795d());
        bVar.mo11805e(mo11796e());
        bVar.mo11807g(mo11799h());
        bVar.f2858f = new HashMap(mo11793b());
        return bVar;
    }
}
