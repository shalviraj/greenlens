package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.uj */
public final class C2530uj implements Parcelable.Creator<C2506tj> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        C2316ll llVar = null;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = C0823f.m394s(parcel, readInt);
                    break;
                case 3:
                    z = C0823f.m356Y(parcel, readInt);
                    break;
                case 4:
                    str2 = C0823f.m394s(parcel, readInt);
                    break;
                case 5:
                    z2 = C0823f.m356Y(parcel, readInt);
                    break;
                case 6:
                    llVar = (C2316ll) C0823f.m392r(parcel, readInt, C2316ll.CREATOR);
                    break;
                case 7:
                    arrayList = C0823f.m396t(parcel, readInt);
                    break;
                default:
                    C0823f.m379k0(parcel, readInt);
                    break;
            }
        }
        C0823f.m408z(parcel, l0);
        return new C2506tj(str, z, str2, z2, llVar, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2506tj[i];
    }
}
