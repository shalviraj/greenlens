package p005b.p096l.p180d.p185o;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p131e.p136e.C2364nl;

/* renamed from: b.l.d.o.o0 */
public final class C3921o0 implements Parcelable.Creator<C3919n0> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        C2364nl nlVar = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = C0823f.m394s(parcel, readInt);
                    break;
                case 2:
                    str2 = C0823f.m394s(parcel, readInt);
                    break;
                case 3:
                    str3 = C0823f.m394s(parcel, readInt);
                    break;
                case 4:
                    nlVar = (C2364nl) C0823f.m392r(parcel, readInt, C2364nl.CREATOR);
                    break;
                case 5:
                    str4 = C0823f.m394s(parcel, readInt);
                    break;
                case 6:
                    str5 = C0823f.m394s(parcel, readInt);
                    break;
                case 7:
                    str6 = C0823f.m394s(parcel, readInt);
                    break;
                default:
                    C0823f.m379k0(parcel, readInt);
                    break;
            }
        }
        C0823f.m408z(parcel, l0);
        return new C3919n0(str, str2, str3, nlVar, str4, str5, str6);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3919n0[i];
    }
}
