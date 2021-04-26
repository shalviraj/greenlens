package p005b.p280p.p281a;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4805c3;

/* renamed from: b.p.a.u */
public abstract class C5087u implements Closeable, Flushable {

    /* renamed from: g */
    public int f9831g = 0;

    /* renamed from: h */
    public int[] f9832h = new int[32];

    /* renamed from: i */
    public String[] f9833i = new String[32];

    /* renamed from: j */
    public int[] f9834j = new int[32];

    /* renamed from: k */
    public boolean f9835k;

    /* renamed from: l */
    public int f9836l = -1;

    /* renamed from: H */
    public abstract C5087u mo16864H();

    /* renamed from: N */
    public final String mo16884N() {
        return C4805c3.m8810i(this.f9831g, this.f9832h, this.f9833i, this.f9834j);
    }

    /* renamed from: O */
    public abstract C5087u mo16865O(String str);

    /* renamed from: S */
    public abstract C5087u mo16866S();

    /* renamed from: Z */
    public final int mo16885Z() {
        int i = this.f9831g;
        if (i != 0) {
            return this.f9832h[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: d */
    public abstract C5087u mo16868d();

    /* renamed from: e */
    public abstract C5087u mo16869e();

    /* renamed from: f0 */
    public final void mo16886f0(int i) {
        int[] iArr = this.f9832h;
        int i2 = this.f9831g;
        this.f9831g = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: h0 */
    public abstract C5087u mo16871h0(double d);

    /* renamed from: l0 */
    public abstract C5087u mo16872l0(long j);

    /* renamed from: n0 */
    public abstract C5087u mo16873n0(Number number);

    /* renamed from: o0 */
    public abstract C5087u mo16874o0(String str);

    /* renamed from: p0 */
    public abstract C5087u mo16875p0(boolean z);

    /* renamed from: q */
    public final boolean mo16887q() {
        int i = this.f9831g;
        int[] iArr = this.f9832h;
        if (i != iArr.length) {
            return false;
        }
        if (i != 256) {
            this.f9832h = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f9833i;
            this.f9833i = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f9834j;
            this.f9834j = Arrays.copyOf(iArr2, iArr2.length * 2);
            if (!(this instanceof C5086t)) {
                return true;
            }
            C5086t tVar = (C5086t) this;
            Object[] objArr = tVar.f9829m;
            tVar.f9829m = Arrays.copyOf(objArr, objArr.length * 2);
            return true;
        }
        StringBuilder u = C0843a.m460u("Nesting too deep at ");
        u.append(mo16884N());
        u.append(": circular reference?");
        throw new C5078n(u.toString());
    }

    /* renamed from: z */
    public abstract C5087u mo16880z();
}
