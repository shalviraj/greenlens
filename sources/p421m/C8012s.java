package p421m;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;

/* renamed from: m.s */
public final class C8012s implements C8013t {
    /* renamed from: a */
    public List<InetAddress> mo25825a(String str) {
        C6888i.m12438e(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            C6888i.m12437d(allByName, "InetAddress.getAllByName(hostname)");
            return C5266a.m10066y4(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException(C0843a.m451l("Broken system behaviour for dns lookup of ", str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
