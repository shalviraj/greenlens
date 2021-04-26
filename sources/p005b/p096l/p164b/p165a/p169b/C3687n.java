package p005b.p096l.p164b.p165a.p169b;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;
import p005b.p096l.p164b.p165a.p173d.C3718d;
import p005b.p096l.p164b.p165a.p173d.C3723g;
import p005b.p096l.p164b.p165a.p173d.C3729j;
import p005b.p096l.p164b.p165a.p173d.C3734l;
import p005b.p096l.p164b.p165a.p173d.p174z.C3750a;

/* renamed from: b.l.b.a.b.n */
public class C3687n extends C3672a {

    /* renamed from: c */
    public Object f6811c;

    public C3687n(Object obj) {
        super(C3688o.f6812a);
        this.f6811c = obj;
    }

    /* renamed from: b */
    public static boolean m6954b(boolean z, Writer writer, String str, Object obj) {
        String str2;
        if (obj != null && !C3723g.m7020c(obj)) {
            if (z) {
                z = false;
            } else {
                writer.write("&");
            }
            writer.write(str);
            if (obj instanceof Enum) {
                str2 = C3729j.m7031c((Enum) obj).f6907d;
            } else {
                str2 = obj.toString();
            }
            String a = C3750a.f6932a.mo15130a(str2);
            if (a.length() != 0) {
                writer.write("=");
                writer.write(a);
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo15014a(OutputStream outputStream) {
        C3676e eVar = this.f6752a;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, (eVar == null || eVar.mo14985d() == null) ? C3718d.f6865b : this.f6752a.mo14985d()));
        boolean z = true;
        for (Map.Entry next : C3723g.m7022e(this.f6811c).entrySet()) {
            Object value = next.getValue();
            if (value != null) {
                String a = C3750a.f6932a.mo15130a((String) next.getKey());
                Class<?> cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    for (Object b : C3734l.m7048l(value)) {
                        z = m6954b(z, bufferedWriter, a, b);
                    }
                } else {
                    z = m6954b(z, bufferedWriter, a, value);
                }
            }
        }
        bufferedWriter.flush();
    }
}
