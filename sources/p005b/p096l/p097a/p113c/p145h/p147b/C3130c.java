package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.h.b.c */
public final class C3130c implements Parcelable.Creator<C3118b> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int l0 = C0823f.m381l0(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        C3253m9 m9Var = null;
        String str3 = null;
        C3309s sVar = null;
        C3309s sVar2 = null;
        C3309s sVar3 = null;
        boolean z = false;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = C0823f.m394s(parcel2, readInt);
                    break;
                case 3:
                    str2 = C0823f.m394s(parcel2, readInt);
                    break;
                case 4:
                    m9Var = (C3253m9) C0823f.m392r(parcel2, readInt, C3253m9.CREATOR);
                    break;
                case 5:
                    j = C0823f.m369f0(parcel2, readInt);
                    break;
                case 6:
                    z = C0823f.m356Y(parcel2, readInt);
                    break;
                case 7:
                    str3 = C0823f.m394s(parcel2, readInt);
                    break;
                case 8:
                    sVar = (C3309s) C0823f.m392r(parcel2, readInt, C3309s.CREATOR);
                    break;
                case 9:
                    j2 = C0823f.m369f0(parcel2, readInt);
                    break;
                case 10:
                    sVar2 = (C3309s) C0823f.m392r(parcel2, readInt, C3309s.CREATOR);
                    break;
                case 11:
                    j3 = C0823f.m369f0(parcel2, readInt);
                    break;
                case 12:
                    sVar3 = (C3309s) C0823f.m392r(parcel2, readInt, C3309s.CREATOR);
                    break;
                default:
                    C0823f.m379k0(parcel2, readInt);
                    break;
            }
        }
        C0823f.m408z(parcel2, l0);
        return new C3118b(str, str2, m9Var, j, z, str3, sVar, j2, sVar2, j3, sVar3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3118b[i];
    }
}
