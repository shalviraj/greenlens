package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import p005b.p096l.p097a.p113c.p119b.p126p.C1962f;

/* renamed from: b.l.a.c.h.b.l3 */
public final class C3236l3 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ int f5697g;

    /* renamed from: h */
    public final /* synthetic */ String f5698h;

    /* renamed from: i */
    public final /* synthetic */ Object f5699i;

    /* renamed from: j */
    public final /* synthetic */ Object f5700j;

    /* renamed from: k */
    public final /* synthetic */ Object f5701k;

    /* renamed from: l */
    public final /* synthetic */ C3269o3 f5702l;

    public C3236l3(C3269o3 o3Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f5702l = o3Var;
        this.f5697g = i;
        this.f5698h = str;
        this.f5699i = obj;
        this.f5700j = obj2;
        this.f5701k = obj3;
    }

    public final void run() {
        char c;
        C3269o3 o3Var;
        C3135c4 q = this.f5702l.f5638a.mo14464q();
        if (q.mo14376k()) {
            C3269o3 o3Var2 = this.f5702l;
            if (o3Var2.f5796c == 0) {
                C3166f fVar = o3Var2.f5638a.f5848g;
                if (fVar.f5501d == null) {
                    synchronized (fVar) {
                        if (fVar.f5501d == null) {
                            ApplicationInfo applicationInfo = fVar.f5638a.f5842a.getApplicationInfo();
                            String a = C1962f.m2878a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                fVar.f5501d = Boolean.valueOf(str != null && str.equals(a));
                            }
                            if (fVar.f5501d == null) {
                                fVar.f5501d = Boolean.TRUE;
                                fVar.f5638a.mo14329d().f5799f.mo14414a("My process not in the list of running processes");
                            }
                        }
                    }
                }
                if (fVar.f5501d.booleanValue()) {
                    o3Var = this.f5702l;
                    C3165ea eaVar = o3Var.f5638a.f5847f;
                    c = 'C';
                } else {
                    o3Var = this.f5702l;
                    C3165ea eaVar2 = o3Var.f5638a.f5847f;
                    c = 'c';
                }
                o3Var.f5796c = c;
            }
            C3269o3 o3Var3 = this.f5702l;
            if (o3Var3.f5797d < 0) {
                o3Var3.f5638a.f5848g.mo14193n();
                o3Var3.f5797d = 39065;
            }
            char charAt = "01VDIWEA?".charAt(this.f5697g);
            C3269o3 o3Var4 = this.f5702l;
            char c2 = o3Var4.f5796c;
            long j = o3Var4.f5797d;
            String w = C3269o3.m6254w(true, this.f5698h, this.f5699i, this.f5700j, this.f5701k);
            StringBuilder sb = new StringBuilder(String.valueOf(w).length() + 24);
            sb.append(ExifInterface.GPS_MEASUREMENT_2D);
            sb.append(charAt);
            sb.append(c2);
            sb.append(j);
            sb.append(":");
            sb.append(w);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f5698h.substring(0, 1024);
            }
            C3390z3 z3Var = q.f5424d;
            if (z3Var != null) {
                z3Var.f6144e.mo14126h();
                if (z3Var.f6144e.mo14143o().getLong(z3Var.f6140a, 0) == 0) {
                    z3Var.mo14641a();
                }
                if (sb2 == null) {
                    sb2 = "";
                }
                long j2 = z3Var.f6144e.mo14143o().getLong(z3Var.f6141b, 0);
                if (j2 <= 0) {
                    SharedPreferences.Editor edit = z3Var.f6144e.mo14143o().edit();
                    edit.putString(z3Var.f6142c, sb2);
                    edit.putLong(z3Var.f6141b, 1);
                    edit.apply();
                    return;
                }
                long nextLong = z3Var.f6144e.f5638a.mo14467t().mo14535e0().nextLong();
                long j3 = j2 + 1;
                long j4 = RecyclerView.FOREVER_NS / j3;
                SharedPreferences.Editor edit2 = z3Var.f6144e.mo14143o().edit();
                if ((RecyclerView.FOREVER_NS & nextLong) < j4) {
                    edit2.putString(z3Var.f6142c, sb2);
                }
                edit2.putLong(z3Var.f6141b, j3);
                edit2.apply();
                return;
            }
            return;
        }
        Log.println(6, this.f5702l.mo14446v(), "Persisted config not initialized. Not logging error/warn");
    }
}
