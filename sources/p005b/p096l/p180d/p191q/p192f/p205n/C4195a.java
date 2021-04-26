package p005b.p096l.p180d.p191q.p192f.p205n;

/* renamed from: b.l.d.q.f.n.a */
public class C4195a implements C4198d {

    /* renamed from: a */
    public final C4198d[] f7785a;

    /* renamed from: b */
    public final C4196b f7786b;

    public C4195a(int i, C4198d... dVarArr) {
        this.f7785a = dVarArr;
        this.f7786b = new C4196b(i);
    }

    /* renamed from: a */
    public StackTraceElement[] mo15793a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (C4198d dVar : this.f7785a) {
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = dVar.mo15793a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? this.f7786b.mo15793a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
