package p005b.p096l.p097a.p113c.p131e.p138g;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1805d;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1809e;

/* renamed from: b.l.a.c.e.g.g */
public abstract class C2677g extends C2687q implements C2676f {
    public C2677g() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* renamed from: g */
    public final boolean mo13171g(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        C1809e<Status> eVar = ((C2670c) this).f4558a;
        Status status = ((C2672d) C2692v.m4526a(parcel, C2672d.CREATOR)).f4559g;
        C1805d dVar = (C1805d) eVar;
        Objects.requireNonNull(dVar);
        dVar.mo18865e(status);
        return true;
    }
}
