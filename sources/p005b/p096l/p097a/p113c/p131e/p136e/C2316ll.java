package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1963g;

/* renamed from: b.l.a.c.e.e.ll */
public final class C2316ll extends C1948a {
    public static final Parcelable.Creator<C2316ll> CREATOR = new C2340ml();

    /* renamed from: g */
    public final int f4049g;

    /* renamed from: h */
    public List<String> f4050h;

    public C2316ll() {
        this((List<String>) null);
    }

    public C2316ll(int i, List<String> list) {
        List<String> list2;
        this.f4049g = i;
        if (list == null || list.isEmpty()) {
            list2 = Collections.emptyList();
        } else {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.set(i2, C1963g.m2880a(list.get(i2)));
            }
            list2 = Collections.unmodifiableList(list);
        }
        this.f4050h = list2;
    }

    public C2316ll(@Nullable List<String> list) {
        this.f4049g = 1;
        this.f4050h = new ArrayList();
        if (list != null && !list.isEmpty()) {
            this.f4050h.addAll(list);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        int i2 = this.f4049g;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(i2);
        C0823f.m397t0(parcel, 2, this.f4050h, false);
        C0823f.m331A0(parcel, w0);
    }
}
