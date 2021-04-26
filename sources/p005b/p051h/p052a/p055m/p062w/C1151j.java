package p005b.p051h.p052a.p055m.p062w;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.h.a.m.w.j */
public final class C1151j implements C1149h {

    /* renamed from: b */
    public final Map<String, List<C1150i>> f1393b;

    /* renamed from: c */
    public volatile Map<String, String> f1394c;

    /* renamed from: b.h.a.m.w.j$a */
    public static final class C1152a {

        /* renamed from: b */
        public static final String f1395b;

        /* renamed from: c */
        public static final Map<String, List<C1150i>> f1396c;

        /* renamed from: a */
        public Map<String, List<C1150i>> f1397a = f1396c;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char charAt = property.charAt(i);
                    if ((charAt <= 31 && charAt != 9) || charAt >= 127) {
                        charAt = '?';
                    }
                    sb.append(charAt);
                }
                property = sb.toString();
            }
            f1395b = property;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new C1153b(property)));
            }
            f1396c = Collections.unmodifiableMap(hashMap);
        }
    }

    /* renamed from: b.h.a.m.w.j$b */
    public static final class C1153b implements C1150i {
        @NonNull

        /* renamed from: a */
        public final String f1398a;

        public C1153b(@NonNull String str) {
            this.f1398a = str;
        }

        /* renamed from: a */
        public String mo11044a() {
            return this.f1398a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1153b) {
                return this.f1398a.equals(((C1153b) obj).f1398a);
            }
            return false;
        }

        public int hashCode() {
            return this.f1398a.hashCode();
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("StringHeaderFactory{value='");
            u.append(this.f1398a);
            u.append('\'');
            u.append('}');
            return u.toString();
        }
    }

    public C1151j(Map<String, List<C1150i>> map) {
        this.f1393b = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public Map<String, String> mo11043a() {
        if (this.f1394c == null) {
            synchronized (this) {
                if (this.f1394c == null) {
                    this.f1394c = Collections.unmodifiableMap(mo11045b());
                }
            }
        }
        return this.f1394c;
    }

    /* renamed from: b */
    public final Map<String, String> mo11045b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f1393b.entrySet()) {
            List list = (List) next.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String a = ((C1150i) list.get(i)).mo11044a();
                if (!TextUtils.isEmpty(a)) {
                    sb.append(a);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(next.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1151j) {
            return this.f1393b.equals(((C1151j) obj).f1393b);
        }
        return false;
    }

    public int hashCode() {
        return this.f1393b.hashCode();
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("LazyHeaders{headers=");
        u.append(this.f1393b);
        u.append('}');
        return u.toString();
    }
}
