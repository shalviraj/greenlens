package p005b.p082j.p083a.p084a;

import java.io.IOException;

/* renamed from: b.j.a.a.h */
public class C1523h extends IOException {

    /* renamed from: g */
    public C1519e f2383g;

    public C1523h(String str, C1519e eVar) {
        super(str);
        this.f2383g = eVar;
    }

    public C1523h(String str, C1519e eVar, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this.f2383g = eVar;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        C1519e eVar = this.f2383g;
        if (eVar == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (eVar != null) {
            sb.append(10);
            sb.append(" at ");
            sb.append(eVar.toString());
        }
        return sb.toString();
    }

    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
