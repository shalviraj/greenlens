package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.h.b.n9 */
public final class C3264n9 implements Parcelable.Creator<C3253m9> {
    /* renamed from: a */
    public static void m6246a(C3253m9 m9Var, Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        int i2 = m9Var.f5750g;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(i2);
        C0823f.m395s0(parcel, 2, m9Var.f5751h, false);
        long j = m9Var.f5752i;
        C0823f.m333B0(parcel, 3, 8);
        parcel.writeLong(j);
        C0823f.m391q0(parcel, 4, m9Var.f5753j, false);
        C0823f.m387o0(parcel, 5, (Float) null, false);
        C0823f.m395s0(parcel, 6, m9Var.f5754k, false);
        C0823f.m395s0(parcel, 7, m9Var.f5755l, false);
        Double d = m9Var.f5756m;
        if (d != null) {
            C0823f.m333B0(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        C0823f.m331A0(parcel, w0);
    }

    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int l0 = C0823f.m381l0(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C0823f.m367e0(parcel2, readInt);
                    break;
                case 2:
                    str = C0823f.m394s(parcel2, readInt);
                    break;
                case 3:
                    j = C0823f.m369f0(parcel2, readInt);
                    break;
                case 4:
                    l = C0823f.m371g0(parcel2, readInt);
                    break;
                case 5:
                    f = C0823f.m363c0(parcel2, readInt);
                    break;
                case 6:
                    str2 = C0823f.m394s(parcel2, readInt);
                    break;
                case 7:
                    str3 = C0823f.m394s(parcel2, readInt);
                    break;
                case 8:
                    int h0 = C0823f.m373h0(parcel2, readInt);
                    if (h0 != 0) {
                        C0823f.m409z0(parcel2, h0, 8);
                        d = Double.valueOf(parcel.readDouble());
                        break;
                    } else {
                        d = null;
                        break;
                    }
                default:
                    C0823f.m379k0(parcel2, readInt);
                    break;
            }
        }
        C0823f.m408z(parcel2, l0);
        return new C3253m9(i, str, j, l, f, str2, str3, d);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3253m9[i];
    }
}
