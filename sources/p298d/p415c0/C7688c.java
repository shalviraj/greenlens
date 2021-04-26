package p298d.p415c0;

import java.util.List;
import java.util.regex.Matcher;
import p298d.p334t.C6781b;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.c0.c */
public final class C7688c {

    /* renamed from: a */
    public List<String> f15224a;

    /* renamed from: b */
    public final Matcher f15225b;

    /* renamed from: d.c0.c$a */
    public static final class C7689a extends C6781b<String> {

        /* renamed from: g */
        public final /* synthetic */ C7688c f15226g;

        public C7689a(C7688c cVar) {
            this.f15226g = cVar;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        /* renamed from: e */
        public int mo23951e() {
            return this.f15226g.f15225b.groupCount() + 1;
        }

        public Object get(int i) {
            String group = this.f15226g.f15225b.group(i);
            return group != null ? group : "";
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }
    }

    public C7688c(Matcher matcher, CharSequence charSequence) {
        C6888i.m12438e(matcher, "matcher");
        C6888i.m12438e(charSequence, "input");
        this.f15225b = matcher;
    }

    /* renamed from: a */
    public List<String> mo25277a() {
        if (this.f15224a == null) {
            this.f15224a = new C7689a(this);
        }
        List<String> list = this.f15224a;
        C6888i.m12436c(list);
        return list;
    }
}
