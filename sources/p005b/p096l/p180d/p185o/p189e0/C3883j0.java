package p005b.p096l.p180d.p185o.p189e0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p131e.p136e.C2363nk;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p185o.C3858b0;
import p005b.p096l.p180d.p185o.C3919n0;
import p005b.p096l.p180d.p185o.C3922p;
import p005b.p096l.p180d.p185o.C3930t;
import p005b.p096l.p180d.p185o.C3940y;

/* renamed from: b.l.d.o.e0.j0 */
public final class C3883j0 extends C3922p {
    public static final Parcelable.Creator<C3883j0> CREATOR = new C3885k0();

    /* renamed from: g */
    public C2363nk f7145g;

    /* renamed from: h */
    public C3877g0 f7146h;

    /* renamed from: i */
    public final String f7147i;

    /* renamed from: j */
    public String f7148j;

    /* renamed from: k */
    public List<C3877g0> f7149k;

    /* renamed from: l */
    public List<String> f7150l;

    /* renamed from: m */
    public String f7151m;

    /* renamed from: n */
    public Boolean f7152n;

    /* renamed from: o */
    public C3887l0 f7153o;

    /* renamed from: p */
    public boolean f7154p;

    /* renamed from: q */
    public C3919n0 f7155q;

    /* renamed from: r */
    public C3891p f7156r;

    public C3883j0(C2363nk nkVar, C3877g0 g0Var, String str, String str2, List<C3877g0> list, List<String> list2, String str3, Boolean bool, C3887l0 l0Var, boolean z, C3919n0 n0Var, C3891p pVar) {
        this.f7145g = nkVar;
        this.f7146h = g0Var;
        this.f7147i = str;
        this.f7148j = str2;
        this.f7149k = list;
        this.f7150l = list2;
        this.f7151m = str3;
        this.f7152n = bool;
        this.f7153o = l0Var;
        this.f7154p = z;
        this.f7155q = n0Var;
        this.f7156r = pVar;
    }

    public C3883j0(C3825d dVar, List<? extends C3858b0> list) {
        dVar.mo15344a();
        this.f7147i = dVar.f7043b;
        this.f7148j = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f7151m = ExifInterface.GPS_MEASUREMENT_2D;
        mo15401c0(list);
    }

    @NonNull
    /* renamed from: R */
    public final String mo15365R() {
        return this.f7146h.f7135h;
    }

    @Nullable
    /* renamed from: V */
    public final String mo15394V() {
        return this.f7146h.f7138k;
    }

    /* renamed from: W */
    public final /* bridge */ /* synthetic */ C3870d mo15395W() {
        return new C3870d(this);
    }

    @NonNull
    /* renamed from: X */
    public final List<? extends C3858b0> mo15396X() {
        return this.f7149k;
    }

    @Nullable
    /* renamed from: Y */
    public final String mo15397Y() {
        String str;
        Map map;
        C2363nk nkVar = this.f7145g;
        if (nkVar == null || (str = nkVar.f4104h) == null || (map = (Map) C3889n.m7278a(str).f7198b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @NonNull
    /* renamed from: Z */
    public final String mo15398Z() {
        return this.f7146h.f7134g;
    }

    /* renamed from: a0 */
    public final boolean mo15399a0() {
        String str;
        Boolean bool = this.f7152n;
        if (bool == null || bool.booleanValue()) {
            C2363nk nkVar = this.f7145g;
            if (nkVar != null) {
                Map map = (Map) C3889n.m7278a(nkVar.f4104h).f7198b.get("firebase");
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = "";
            }
            boolean z = false;
            if (this.f7149k.size() <= 1 && (str == null || !str.equals("custom"))) {
                z = true;
            }
            this.f7152n = Boolean.valueOf(z);
        }
        return this.f7152n.booleanValue();
    }

    @Nullable
    /* renamed from: b0 */
    public final List<String> mo15400b0() {
        return this.f7150l;
    }

    @NonNull
    /* renamed from: c0 */
    public final C3922p mo15401c0(List<? extends C3858b0> list) {
        Objects.requireNonNull(list, "null reference");
        this.f7149k = new ArrayList(list.size());
        this.f7150l = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            C3858b0 b0Var = (C3858b0) list.get(i);
            if (b0Var.mo15365R().equals("firebase")) {
                this.f7146h = (C3877g0) b0Var;
            } else {
                this.f7150l.add(b0Var.mo15365R());
            }
            this.f7149k.add((C3877g0) b0Var);
        }
        if (this.f7146h == null) {
            this.f7146h = this.f7149k.get(0);
        }
        return this;
    }

    /* renamed from: d0 */
    public final C3922p mo15402d0() {
        this.f7152n = Boolean.FALSE;
        return this;
    }

    @NonNull
    /* renamed from: e0 */
    public final C3825d mo15403e0() {
        return C3825d.m7209d(this.f7147i);
    }

    @NonNull
    /* renamed from: f0 */
    public final C2363nk mo15404f0() {
        return this.f7145g;
    }

    /* renamed from: g0 */
    public final void mo15405g0(C2363nk nkVar) {
        this.f7145g = nkVar;
    }

    @NonNull
    /* renamed from: h0 */
    public final String mo15406h0() {
        return this.f7145g.mo12844W();
    }

    @NonNull
    /* renamed from: i0 */
    public final String mo15407i0() {
        return this.f7145g.f4104h;
    }

    /* renamed from: j0 */
    public final void mo15408j0(List<C3930t> list) {
        C3891p pVar;
        if (list.isEmpty()) {
            pVar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C3930t next : list) {
                if (next instanceof C3940y) {
                    arrayList.add((C3940y) next);
                }
            }
            pVar = new C3891p(arrayList);
        }
        this.f7156r = pVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m393r0(parcel, 1, this.f7145g, i, false);
        C0823f.m393r0(parcel, 2, this.f7146h, i, false);
        C0823f.m395s0(parcel, 3, this.f7147i, false);
        C0823f.m395s0(parcel, 4, this.f7148j, false);
        C0823f.m401v0(parcel, 5, this.f7149k, false);
        C0823f.m397t0(parcel, 6, this.f7150l, false);
        C0823f.m395s0(parcel, 7, this.f7151m, false);
        C0823f.m383m0(parcel, 8, Boolean.valueOf(mo15399a0()), false);
        C0823f.m393r0(parcel, 9, this.f7153o, i, false);
        boolean z = this.f7154p;
        C0823f.m333B0(parcel, 10, 4);
        parcel.writeInt(z ? 1 : 0);
        C0823f.m393r0(parcel, 11, this.f7155q, i, false);
        C0823f.m393r0(parcel, 12, this.f7156r, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
