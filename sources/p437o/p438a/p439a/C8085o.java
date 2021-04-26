package p437o.p438a.p439a;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: o.a.a.o */
public class C8085o {

    /* renamed from: a */
    public final Method f16243a;

    /* renamed from: b */
    public final ThreadMode f16244b;

    /* renamed from: c */
    public final Class<?> f16245c;

    /* renamed from: d */
    public final int f16246d;

    /* renamed from: e */
    public final boolean f16247e;

    /* renamed from: f */
    public String f16248f;

    public C8085o(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.f16243a = method;
        this.f16244b = threadMode;
        this.f16245c = cls;
        this.f16246d = i;
        this.f16247e = z;
    }

    /* renamed from: a */
    public final synchronized void mo26026a() {
        if (this.f16248f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f16243a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f16243a.getName());
            sb.append('(');
            sb.append(this.f16245c.getName());
            this.f16248f = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8085o)) {
            return false;
        }
        mo26026a();
        C8085o oVar = (C8085o) obj;
        oVar.mo26026a();
        return this.f16248f.equals(oVar.f16248f);
    }

    public int hashCode() {
        return this.f16243a.hashCode();
    }
}
