package p005b.p096l.p097a.p113c.p142g.p143f;

import android.os.Parcel;
import p005b.p096l.p097a.p113c.p131e.p139h.C2698b;
import p005b.p096l.p097a.p113c.p131e.p139h.C2699c;
import p005b.p096l.p097a.p113c.p131e.p139h.C2704h;
import p005b.p096l.p097a.p113c.p142g.C3103j;
import p005b.p096l.p097a.p113c.p142g.p144g.C3094b;

/* renamed from: b.l.a.c.g.f.h */
public abstract class C3084h extends C2698b implements C3083g {
    public C3084h() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    /* renamed from: g */
    public final boolean mo13202g(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        boolean a = ((C3103j) this).f5239a.mo10648a(new C3094b(C2704h.m4547k(parcel.readStrongBinder())));
        parcel2.writeNoException();
        int i3 = C2699c.f4597a;
        parcel2.writeInt(a ? 1 : 0);
        return true;
    }
}
