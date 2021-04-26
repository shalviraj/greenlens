package p005b.p006a.p007a.p019j;

import com.appfoundry.previewer.model.Dimensions;
import java.util.Arrays;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.j.k */
public final class C0780k {

    /* renamed from: a */
    public final int f551a;

    /* renamed from: b */
    public final int f552b;

    /* renamed from: c */
    public final Dimensions f553c;

    /* renamed from: d */
    public final int f554d;

    /* renamed from: e */
    public final float f555e;

    /* renamed from: f */
    public final float f556f;

    /* renamed from: g */
    public final float f557g;

    /* renamed from: h */
    public final float[] f558h;

    public C0780k(int i, int i2, Dimensions dimensions, int i3, float f, float f2, float f3, float[] fArr) {
        C6888i.m12438e(dimensions, "margins");
        C6888i.m12438e(fArr, "cornerRadii");
        this.f551a = i;
        this.f552b = i2;
        this.f553c = dimensions;
        this.f554d = i3;
        this.f555e = f;
        this.f556f = f2;
        this.f557g = f3;
        this.f558h = fArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0780k)) {
            return false;
        }
        C0780k kVar = (C0780k) obj;
        return this.f551a == kVar.f551a && this.f552b == kVar.f552b && C6888i.m12434a(this.f553c, kVar.f553c) && this.f554d == kVar.f554d && Float.compare(this.f555e, kVar.f555e) == 0 && Float.compare(this.f556f, kVar.f556f) == 0 && Float.compare(this.f557g, kVar.f557g) == 0 && C6888i.m12434a(this.f558h, kVar.f558h);
    }

    public int hashCode() {
        int hashCode = (Integer.hashCode(this.f552b) + (Integer.hashCode(this.f551a) * 31)) * 31;
        Dimensions dimensions = this.f553c;
        int i = 0;
        int hashCode2 = dimensions != null ? dimensions.hashCode() : 0;
        int hashCode3 = Integer.hashCode(this.f554d);
        int hashCode4 = Float.hashCode(this.f555e);
        int hashCode5 = (Float.hashCode(this.f557g) + ((Float.hashCode(this.f556f) + ((hashCode4 + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31)) * 31)) * 31;
        float[] fArr = this.f558h;
        if (fArr != null) {
            i = Arrays.hashCode(fArr);
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("ShadowData(width=");
        u.append(this.f551a);
        u.append(", height=");
        u.append(this.f552b);
        u.append(", margins=");
        u.append(this.f553c);
        u.append(", shadowColor=");
        u.append(this.f554d);
        u.append(", shadowRadius=");
        u.append(this.f555e);
        u.append(", shadowOffsetX=");
        u.append(this.f556f);
        u.append(", shadowOffsetY=");
        u.append(this.f557g);
        u.append(", cornerRadii=");
        u.append(Arrays.toString(this.f558h));
        u.append(")");
        return u.toString();
    }
}
