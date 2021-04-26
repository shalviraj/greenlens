package p005b.p096l.p097a.p151d.p152a.p162h;

import android.content.Context;
import android.os.Process;

/* renamed from: b.l.a.d.a.h.a */
public final class C3633a {
    static {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        if ("SplitInstallInfoProvider".length() != 0) {
            valueOf.concat("SplitInstallInfoProvider");
        } else {
            new String(valueOf);
        }
    }

    public C3633a(Context context) {
        context.getPackageName();
    }
}
