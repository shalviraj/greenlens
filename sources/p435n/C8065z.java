package p435n;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import p298d.p344x.p346c.C6888i;

/* renamed from: n.z */
public final class C8065z extends C8031b {

    /* renamed from: l */
    public final Socket f16196l;

    public C8065z(Socket socket) {
        C6888i.m12438e(socket, "socket");
        this.f16196l = socket;
    }

    /* renamed from: j */
    public IOException mo17036j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.AssertionError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Exception} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17037k() {
        /*
            r5 = this;
            java.net.Socket r0 = r5.f16196l     // Catch:{ Exception -> 0x0018, AssertionError -> 0x0006 }
            r0.close()     // Catch:{ Exception -> 0x0018, AssertionError -> 0x0006 }
            goto L_0x0033
        L_0x0006:
            r0 = move-exception
            boolean r1 = p005b.p291q.p292a.C5266a.m10004o2(r0)
            if (r1 == 0) goto L_0x0017
            java.util.logging.Logger r1 = p435n.C8053p.f16164a
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x0022
        L_0x0017:
            throw r0
        L_0x0018:
            r0 = move-exception
            java.util.logging.Logger r1 = p435n.C8053p.f16164a
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x0022:
            java.lang.String r4 = "Failed to close timed out socket "
            r3.append(r4)
            java.net.Socket r4 = r5.f16196l
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.log(r2, r3, r0)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p435n.C8065z.mo17037k():void");
    }
}
