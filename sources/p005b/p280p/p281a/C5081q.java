package p005b.p280p.p281a;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4805c3;
import p435n.C8040e;
import p435n.C8044h;
import p435n.C8054q;

/* renamed from: b.p.a.q */
public abstract class C5081q implements Closeable {

    /* renamed from: g */
    public int f9798g;

    /* renamed from: h */
    public int[] f9799h = new int[32];

    /* renamed from: i */
    public String[] f9800i = new String[32];

    /* renamed from: j */
    public int[] f9801j = new int[32];

    /* renamed from: b.p.a.q$a */
    public static final class C5082a {

        /* renamed from: a */
        public final String[] f9802a;

        /* renamed from: b */
        public final C8054q f9803b;

        public C5082a(String[] strArr, C8054q qVar) {
            this.f9802a = strArr;
            this.f9803b = qVar;
        }

        /* renamed from: a */
        public static C5082a m9296a(String... strArr) {
            try {
                C8044h[] hVarArr = new C8044h[strArr.length];
                C8040e eVar = new C8040e();
                for (int i = 0; i < strArr.length; i++) {
                    C5085s.m9322t0(eVar, strArr[i]);
                    eVar.readByte();
                    hVarArr[i] = eVar.mo25907f0();
                }
                return new C5082a((String[]) strArr.clone(), C8054q.f16165i.mo25981c(hVarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: b.p.a.q$b */
    public enum C5083b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    /* renamed from: H */
    public final String mo16834H() {
        return C4805c3.m8810i(this.f9798g, this.f9799h, this.f9800i, this.f9801j);
    }

    /* renamed from: N */
    public abstract boolean mo16835N();

    /* renamed from: O */
    public abstract double mo16836O();

    /* renamed from: S */
    public abstract int mo16837S();

    /* renamed from: Z */
    public abstract <T> T mo16838Z();

    /* renamed from: d */
    public abstract void mo16839d();

    /* renamed from: e */
    public abstract void mo16840e();

    /* renamed from: f0 */
    public abstract String mo16841f0();

    /* renamed from: h0 */
    public abstract C5083b mo16842h0();

    /* renamed from: l0 */
    public final void mo16843l0(int i) {
        int i2 = this.f9798g;
        int[] iArr = this.f9799h;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f9799h = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f9800i;
                this.f9800i = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f9801j;
                this.f9801j = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder u = C0843a.m460u("Nesting too deep at ");
                u.append(mo16834H());
                throw new C5078n(u.toString());
            }
        }
        int[] iArr3 = this.f9799h;
        int i3 = this.f9798g;
        this.f9798g = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: n0 */
    public abstract int mo16844n0(C5082a aVar);

    /* renamed from: o0 */
    public abstract void mo16845o0();

    /* renamed from: p0 */
    public abstract void mo16846p0();

    /* renamed from: q */
    public abstract void mo16847q();

    /* renamed from: q0 */
    public final C5079o mo16848q0(String str) {
        StringBuilder y = C0843a.m464y(str, " at path ");
        y.append(mo16834H());
        throw new C5079o(y.toString());
    }

    /* renamed from: z */
    public abstract void mo16849z();
}
