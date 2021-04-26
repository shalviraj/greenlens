package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.h.b.t */
public final class C3320t implements Parcelable.Creator<C3309s> {
    /* renamed from: a */
    public static void m6414a(C3309s sVar, Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 2, sVar.f5937g, false);
        C0823f.m393r0(parcel, 3, sVar.f5938h, i, false);
        C0823f.m395s0(parcel, 4, sVar.f5939i, false);
        long j = sVar.f5940j;
        C0823f.m333B0(parcel, 5, 8);
        parcel.writeLong(j);
        C0823f.m331A0(parcel, w0);
    }

    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        String str = null;
        C3287q qVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = C0823f.m394s(parcel, readInt);
            } else if (i == 3) {
                qVar = (C3287q) C0823f.m392r(parcel, readInt, C3287q.CREATOR);
            } else if (i == 4) {
                str2 = C0823f.m394s(parcel, readInt);
            } else if (i != 5) {
                C0823f.m379k0(parcel, readInt);
            } else {
                j = C0823f.m369f0(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C3309s(str, qVar, str2, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3309s[i];
    }
}
