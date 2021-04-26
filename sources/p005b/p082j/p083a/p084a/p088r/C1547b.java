package p005b.p082j.p083a.p084a.p088r;

import java.util.HashSet;

/* renamed from: b.j.a.a.r.b */
public class C1547b {

    /* renamed from: a */
    public final Object f2493a;

    /* renamed from: b */
    public String f2494b;

    /* renamed from: c */
    public String f2495c;

    /* renamed from: d */
    public HashSet<String> f2496d;

    public C1547b(Object obj) {
        this.f2493a = obj;
    }

    /* renamed from: a */
    public C1547b mo11565a() {
        return new C1547b(this.f2493a);
    }

    /* renamed from: b */
    public boolean mo11566b(String str) {
        String str2 = this.f2494b;
        if (str2 == null) {
            this.f2494b = str;
            return false;
        } else if (str.equals(str2)) {
            return true;
        } else {
            String str3 = this.f2495c;
            if (str3 == null) {
                this.f2495c = str;
                return false;
            } else if (str.equals(str3)) {
                return true;
            } else {
                if (this.f2496d == null) {
                    HashSet<String> hashSet = new HashSet<>(16);
                    this.f2496d = hashSet;
                    hashSet.add(this.f2494b);
                    this.f2496d.add(this.f2495c);
                }
                return !this.f2496d.add(str);
            }
        }
    }
}
