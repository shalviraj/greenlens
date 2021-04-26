package p005b.p096l.p097a.p151d.p152a.p154b;

import java.io.File;

/* renamed from: b.l.a.d.a.b.k1 */
public final /* synthetic */ class C3512k1 implements Runnable {

    /* renamed from: g */
    public final C3520m1 f6457g;

    /* renamed from: h */
    public final C3508j1 f6458h;

    public C3512k1(C3520m1 m1Var, C3508j1 j1Var) {
        this.f6457g = m1Var;
        this.f6458h = j1Var;
    }

    public final void run() {
        C3520m1 m1Var = this.f6457g;
        C3508j1 j1Var = this.f6458h;
        C3544t tVar = m1Var.f6477a;
        String str = j1Var.f6610b;
        int i = j1Var.f6452c;
        long j = j1Var.f6453d;
        File a = tVar.mo14816a(str);
        if (a.exists()) {
            for (File file : a.listFiles()) {
                if (!file.getName().equals(String.valueOf(i)) && !file.getName().equals("stale.tmp")) {
                    C3544t.m6741h(file);
                } else if (file.getName().equals(String.valueOf(i))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j))) {
                            C3544t.m6741h(file2);
                        }
                    }
                }
            }
        }
    }
}
