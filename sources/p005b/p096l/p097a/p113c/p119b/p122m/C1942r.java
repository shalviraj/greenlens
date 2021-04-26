package p005b.p096l.p097a.p113c.p119b.p122m;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: b.l.a.c.b.m.r */
public final class C1942r {

    /* renamed from: a */
    public final List<String> f3484a = new ArrayList();

    /* renamed from: b */
    public final Object f3485b;

    public C1942r(Object obj, C1941q0 q0Var) {
        Objects.requireNonNull(obj, "null reference");
        this.f3485b = obj;
    }

    /* renamed from: a */
    public final C1942r mo12270a(String str, @Nullable Object obj) {
        List<String> list = this.f3484a;
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(valueOf.length() + str.length() + 1);
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        list.add(sb.toString());
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.f3485b.getClass().getSimpleName());
        sb.append('{');
        int size = this.f3484a.size();
        for (int i = 0; i < size; i++) {
            sb.append(this.f3484a.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
