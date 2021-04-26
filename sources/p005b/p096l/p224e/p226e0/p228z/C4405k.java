package p005b.p096l.p224e.p226e0.p228z;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p005b.p096l.p224e.C4332b0;
import p005b.p096l.p224e.C4334c0;
import p005b.p096l.p224e.C4465k;
import p005b.p096l.p224e.C4480y;
import p005b.p096l.p224e.p230f0.C4455a;
import p005b.p096l.p224e.p231g0.C4457a;
import p005b.p096l.p224e.p231g0.C4459b;
import p005b.p096l.p224e.p231g0.C4460c;

/* renamed from: b.l.e.e0.z.k */
public final class C4405k extends C4332b0<Date> {

    /* renamed from: b */
    public static final C4334c0 f8159b = new C4406a();

    /* renamed from: a */
    public final DateFormat f8160a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: b.l.e.e0.z.k$a */
    public class C4406a implements C4334c0 {
        /* renamed from: a */
        public <T> C4332b0<T> mo10754a(C4465k kVar, C4455a<T> aVar) {
            if (aVar.f8249a == Date.class) {
                return new C4405k();
            }
            return null;
        }
    }

    /* renamed from: a */
    public Object mo10755a(C4457a aVar) {
        Date date;
        synchronized (this) {
            if (aVar.mo16060w0() == C4459b.NULL) {
                aVar.mo16057s0();
                date = null;
            } else {
                try {
                    date = new Date(this.f8160a.parse(aVar.mo16059u0()).getTime());
                } catch (ParseException e) {
                    throw new C4480y((Throwable) e);
                }
            }
        }
        return date;
    }

    /* renamed from: b */
    public void mo10756b(C4460c cVar, Object obj) {
        Date date = (Date) obj;
        synchronized (this) {
            cVar.mo16074r0(date == null ? null : this.f8160a.format(date));
        }
    }
}
