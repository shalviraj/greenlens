package p298d.p299a.p300a.p301a.p303y0.p326e.p329y;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6699a;
import p298d.p333a0.C6757c;
import p298d.p333a0.C6758d;
import p298d.p334t.C6789g;
import p298d.p334t.C6790h;
import p298d.p334t.C6804v;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.e.y.a */
public final class C6696a extends C6699a {

    /* renamed from: f */
    public static final C6697a f13533f = new C6697a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public static final C6696a f13534g = new C6696a(1, 0, 7);

    /* renamed from: d.a.a.a.y0.e.y.a$a */
    public static final class C6697a {
        public C6697a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public final C6696a mo23834a(InputStream inputStream) {
            C6888i.m12438e(inputStream, "stream");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            C6758d dVar = new C6758d(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(C5266a.m9892V(dVar, 10));
            Iterator it = dVar.iterator();
            while (((C6757c) it).f13662h) {
                ((C6804v) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] W = C6790h.m12336W(arrayList);
            int[] iArr = new int[W.length];
            System.arraycopy(W, 0, iArr, 0, W.length);
            return new C6696a(iArr);
        }
    }

    static {
        int[] iArr = new int[0];
        C6888i.m12438e(iArr, "numbers");
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        C6888i.m12438e(iArr2, "numbers");
        Integer G1 = C5266a.m9808G1(iArr2, 0);
        if (G1 != null) {
            G1.intValue();
        }
        Integer G12 = C5266a.m9808G1(iArr2, 1);
        if (G12 != null) {
            G12.intValue();
        }
        Integer G13 = C5266a.m9808G1(iArr2, 2);
        if (G13 != null) {
            G13.intValue();
        }
        if (iArr2.length > 3) {
            C6888i.m12438e(iArr2, "$this$asList");
            C6790h.m12337X(new C6789g(iArr2).subList(3, iArr2.length));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6696a(int... r4) {
        /*
            r3 = this;
            java.lang.String r0 = "numbers"
            p298d.p344x.p346c.C6888i.m12438e(r4, r0)
            int r0 = r4.length
            int[] r0 = new int[r0]
            int r1 = r4.length
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r0, r2, r1)
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p326e.p329y.C6696a.<init>(int[]):void");
    }
}
