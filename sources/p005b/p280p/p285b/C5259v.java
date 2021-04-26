package p005b.p280p.p285b;

import java.nio.charset.Charset;
import p005b.p280p.p285b.p286a0.C5134i;

/* renamed from: b.p.b.v */
public abstract class C5259v {
    /* renamed from: a */
    public static C5259v m9756a(C5251q qVar, String str) {
        Charset charset = C5134i.f9955c;
        if (qVar != null) {
            String str2 = qVar.f10446b;
            Charset forName = str2 != null ? Charset.forName(str2) : null;
            if (forName == null) {
                qVar = C5251q.m9744b(qVar + "; charset=utf-8");
            } else {
                charset = forName;
            }
        }
        byte[] bytes = str.getBytes(charset);
        int length = bytes.length;
        C5134i.m9456a((long) bytes.length, (long) 0, (long) length);
        return new C5258u(qVar, length, bytes, 0);
    }
}
