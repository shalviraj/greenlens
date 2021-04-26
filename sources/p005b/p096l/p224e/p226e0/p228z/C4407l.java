package p005b.p096l.p224e.p226e0.p228z;

import java.sql.Time;
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

/* renamed from: b.l.e.e0.z.l */
public final class C4407l extends C4332b0<Time> {

    /* renamed from: b */
    public static final C4334c0 f8161b = new C4408a();

    /* renamed from: a */
    public final DateFormat f8162a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: b.l.e.e0.z.l$a */
    public class C4408a implements C4334c0 {
        /* renamed from: a */
        public <T> C4332b0<T> mo10754a(C4465k kVar, C4455a<T> aVar) {
            if (aVar.f8249a == Time.class) {
                return new C4407l();
            }
            return null;
        }
    }

    /* renamed from: a */
    public Object mo10755a(C4457a aVar) {
        synchronized (this) {
            if (aVar.mo16060w0() == C4459b.NULL) {
                aVar.mo16057s0();
                return null;
            }
            try {
                Time time = new Time(this.f8162a.parse(aVar.mo16059u0()).getTime());
                return time;
            } catch (ParseException e) {
                throw new C4480y((Throwable) e);
            }
        }
    }

    /* renamed from: b */
    public void mo10756b(C4460c cVar, Object obj) {
        Time time = (Time) obj;
        synchronized (this) {
            cVar.mo16074r0(time == null ? null : this.f8162a.format(time));
        }
    }
}
