package p421m;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import p298d.p344x.p346c.C6888i;

/* renamed from: m.u */
public abstract class C8014u {

    /* renamed from: a */
    public static final C8014u f16084a = new C8015a();

    /* renamed from: m.u$a */
    public static final class C8015a extends C8014u {
    }

    /* renamed from: m.u$b */
    public interface C8016b {
        /* renamed from: a */
        C8014u mo25582a(C7841f fVar);
    }

    /* renamed from: a */
    public void mo25826a(C7841f fVar, C7861l lVar) {
        C6888i.m12438e(fVar, NotificationCompat.CATEGORY_CALL);
        C6888i.m12438e(lVar, "connection");
    }

    /* renamed from: b */
    public void mo25827b(C7841f fVar, IOException iOException) {
        C6888i.m12438e(fVar, NotificationCompat.CATEGORY_CALL);
        C6888i.m12438e(iOException, "ioe");
    }

    /* renamed from: c */
    public void mo25828c(C7841f fVar, IOException iOException) {
        C6888i.m12438e(fVar, NotificationCompat.CATEGORY_CALL);
        C6888i.m12438e(iOException, "ioe");
    }
}
