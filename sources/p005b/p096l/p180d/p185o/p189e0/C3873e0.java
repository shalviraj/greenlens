package p005b.p096l.p180d.p185o.p189e0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1950c;
import p005b.p096l.p180d.p185o.C3919n0;

/* renamed from: b.l.d.o.e0.e0 */
public final class C3873e0 implements C1950c {
    public static final Parcelable.Creator<C3873e0> CREATOR = new C3875f0();
    @NonNull

    /* renamed from: g */
    public C3883j0 f7128g;
    @Nullable

    /* renamed from: h */
    public C3869c0 f7129h;
    @Nullable

    /* renamed from: i */
    public C3919n0 f7130i;

    public C3873e0(C3883j0 j0Var) {
        this.f7128g = j0Var;
        List<C3877g0> list = j0Var.f7149k;
        this.f7129h = null;
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.isEmpty(list.get(i).f7141n)) {
                this.f7129h = new C3869c0(list.get(i).f7135h, list.get(i).f7141n, j0Var.f7154p);
            }
        }
        if (this.f7129h == null) {
            this.f7129h = new C3869c0(j0Var.f7154p);
        }
        this.f7130i = j0Var.f7155q;
    }

    public C3873e0(@NonNull C3883j0 j0Var, @Nullable C3869c0 c0Var, @Nullable C3919n0 n0Var) {
        this.f7128g = j0Var;
        this.f7129h = c0Var;
        this.f7130i = n0Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m393r0(parcel, 1, this.f7128g, i, false);
        C0823f.m393r0(parcel, 2, this.f7129h, i, false);
        C0823f.m393r0(parcel, 3, this.f7130i, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
