package p005b.p096l.p224e.p226e0.p228z;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p224e.C4332b0;
import p005b.p096l.p224e.C4334c0;
import p005b.p096l.p224e.C4465k;
import p005b.p096l.p224e.p226e0.C4369p;
import p005b.p096l.p224e.p230f0.C4455a;
import p005b.p096l.p224e.p231g0.C4460c;

/* renamed from: b.l.e.e0.z.c */
public final class C4390c extends C4332b0<Date> {

    /* renamed from: b */
    public static final C4334c0 f8121b = new C4391a();

    /* renamed from: a */
    public final List<DateFormat> f8122a;

    /* renamed from: b.l.e.e0.z.c$a */
    public class C4391a implements C4334c0 {
        /* renamed from: a */
        public <T> C4332b0<T> mo10754a(C4465k kVar, C4455a<T> aVar) {
            if (aVar.f8249a == Date.class) {
                return new C4390c();
            }
            return null;
        }
    }

    public C4390c() {
        ArrayList arrayList = new ArrayList();
        this.f8122a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C4369p.f8085a >= 9) {
            arrayList.add(C1960d.m2778b0(2, 2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3 = p005b.p096l.p224e.p226e0.p228z.p229u.C4453a.m8153b(r3, new java.text.ParsePosition(0));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo10755a(p005b.p096l.p224e.p231g0.C4457a r3) {
        /*
            r2 = this;
            b.l.e.g0.b r0 = r3.mo16060w0()
            b.l.e.g0.b r1 = p005b.p096l.p224e.p231g0.C4459b.NULL
            if (r0 != r1) goto L_0x000d
            r3.mo16057s0()
            r3 = 0
            goto L_0x0034
        L_0x000d:
            java.lang.String r3 = r3.mo16059u0()
            monitor-enter(r2)
            java.util.List<java.text.DateFormat> r0 = r2.f8122a     // Catch:{ all -> 0x003c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x003c }
        L_0x0018:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x003c }
            java.text.DateFormat r1 = (java.text.DateFormat) r1     // Catch:{ all -> 0x003c }
            java.util.Date r3 = r1.parse(r3)     // Catch:{ ParseException -> 0x0018 }
            goto L_0x0033
        L_0x0029:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch:{ ParseException -> 0x0035 }
            r1 = 0
            r0.<init>(r1)     // Catch:{ ParseException -> 0x0035 }
            java.util.Date r3 = p005b.p096l.p224e.p226e0.p228z.p229u.C4453a.m8153b(r3, r0)     // Catch:{ ParseException -> 0x0035 }
        L_0x0033:
            monitor-exit(r2)
        L_0x0034:
            return r3
        L_0x0035:
            r0 = move-exception
            b.l.e.y r1 = new b.l.e.y     // Catch:{ all -> 0x003c }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x003c }
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p224e.p226e0.p228z.C4390c.mo10755a(b.l.e.g0.a):java.lang.Object");
    }

    /* renamed from: b */
    public void mo10756b(C4460c cVar, Object obj) {
        Date date = (Date) obj;
        synchronized (this) {
            if (date == null) {
                cVar.mo16066Z();
            } else {
                cVar.mo16074r0(this.f8122a.get(0).format(date));
            }
        }
    }
}
