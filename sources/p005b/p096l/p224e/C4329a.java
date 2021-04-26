package p005b.p096l.p224e;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p224e.p226e0.C4369p;
import p005b.p096l.p224e.p231g0.C4460c;

/* renamed from: b.l.e.a */
public final class C4329a extends C4332b0<Date> {

    /* renamed from: a */
    public final Class<? extends Date> f8044a;

    /* renamed from: b */
    public final List<DateFormat> f8045b;

    public C4329a(Class<? extends Date> cls, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f8045b = arrayList;
        m7942c(cls);
        this.f8044a = cls;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C4369p.f8085a >= 9) {
            arrayList.add(C1960d.m2778b0(i, i2));
        }
    }

    public C4329a(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f8045b = arrayList;
        m7942c(cls);
        this.f8044a = cls;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    /* renamed from: c */
    public static Class<? extends Date> m7942c(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4 = p005b.p096l.p224e.p226e0.p228z.p229u.C4453a.m8153b(r4, new java.text.ParsePosition(0));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo10755a(p005b.p096l.p224e.p231g0.C4457a r4) {
        /*
            r3 = this;
            b.l.e.g0.b r0 = r4.mo16060w0()
            b.l.e.g0.b r1 = p005b.p096l.p224e.p231g0.C4459b.NULL
            if (r0 != r1) goto L_0x000d
            r4.mo16057s0()
            r4 = 0
            goto L_0x005a
        L_0x000d:
            java.lang.String r4 = r4.mo16059u0()
            java.util.List<java.text.DateFormat> r0 = r3.f8045b
            monitor-enter(r0)
            java.util.List<java.text.DateFormat> r1 = r3.f8045b     // Catch:{ all -> 0x0068 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0068 }
        L_0x001a:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0068 }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0068 }
            java.text.DateFormat r2 = (java.text.DateFormat) r2     // Catch:{ all -> 0x0068 }
            java.util.Date r4 = r2.parse(r4)     // Catch:{ ParseException -> 0x001a }
            goto L_0x0035
        L_0x002b:
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch:{ ParseException -> 0x0061 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ ParseException -> 0x0061 }
            java.util.Date r4 = p005b.p096l.p224e.p226e0.p228z.p229u.C4453a.m8153b(r4, r1)     // Catch:{ ParseException -> 0x0061 }
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            java.lang.Class<? extends java.util.Date> r0 = r3.f8044a
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            if (r0 != r1) goto L_0x003d
            goto L_0x005a
        L_0x003d:
            java.lang.Class<java.sql.Timestamp> r1 = java.sql.Timestamp.class
            if (r0 != r1) goto L_0x004c
            java.sql.Timestamp r0 = new java.sql.Timestamp
            long r1 = r4.getTime()
            r0.<init>(r1)
        L_0x004a:
            r4 = r0
            goto L_0x005a
        L_0x004c:
            java.lang.Class<java.sql.Date> r1 = java.sql.Date.class
            if (r0 != r1) goto L_0x005b
            java.sql.Date r0 = new java.sql.Date
            long r1 = r4.getTime()
            r0.<init>(r1)
            goto L_0x004a
        L_0x005a:
            return r4
        L_0x005b:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L_0x0061:
            r1 = move-exception
            b.l.e.y r2 = new b.l.e.y     // Catch:{ all -> 0x0068 }
            r2.<init>(r4, r1)     // Catch:{ all -> 0x0068 }
            throw r2     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p224e.C4329a.mo10755a(b.l.e.g0.a):java.lang.Object");
    }

    /* renamed from: b */
    public void mo10756b(C4460c cVar, Object obj) {
        Date date = (Date) obj;
        if (date == null) {
            cVar.mo16066Z();
            return;
        }
        synchronized (this.f8045b) {
            cVar.mo16074r0(this.f8045b.get(0).format(date));
        }
    }

    public String toString() {
        StringBuilder sb;
        String str;
        DateFormat dateFormat = this.f8045b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb = C0843a.m460u("DefaultDateTypeAdapter(");
            str = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb = C0843a.m460u("DefaultDateTypeAdapter(");
            str = dateFormat.getClass().getSimpleName();
        }
        return C0843a.m454o(sb, str, ')');
    }
}
