package p005b.p096l.p180d.p191q.p192f.p205n;

/* renamed from: b.l.d.q.f.n.b */
public class C4196b implements C4198d {

    /* renamed from: a */
    public final int f7787a;

    public C4196b(int i) {
        this.f7787a = i;
    }

    /* renamed from: a */
    public StackTraceElement[] mo15793a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f7787a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
