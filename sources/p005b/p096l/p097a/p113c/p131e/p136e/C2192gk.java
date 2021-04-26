package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p180d.p185o.C3919n0;

/* renamed from: b.l.a.c.e.e.gk */
public final class C2192gk extends C1948a {
    public static final Parcelable.Creator<C2192gk> CREATOR = new C2217hk();

    /* renamed from: g */
    public String f3890g;

    /* renamed from: h */
    public String f3891h;

    /* renamed from: i */
    public boolean f3892i;

    /* renamed from: j */
    public String f3893j;

    /* renamed from: k */
    public String f3894k;

    /* renamed from: l */
    public C2555vk f3895l;

    /* renamed from: m */
    public String f3896m;

    /* renamed from: n */
    public String f3897n;

    /* renamed from: o */
    public long f3898o;

    /* renamed from: p */
    public long f3899p;

    /* renamed from: q */
    public boolean f3900q;

    /* renamed from: r */
    public C3919n0 f3901r;

    /* renamed from: s */
    public List<C2435qk> f3902s;

    public C2192gk() {
        this.f3895l = new C2555vk();
    }

    public C2192gk(String str, String str2, boolean z, String str3, String str4, C2555vk vkVar, String str5, String str6, long j, long j2, boolean z2, C3919n0 n0Var, List<C2435qk> list) {
        C2555vk vkVar2;
        this.f3890g = str;
        this.f3891h = str2;
        this.f3892i = z;
        this.f3893j = str3;
        this.f3894k = str4;
        if (vkVar == null) {
            vkVar2 = new C2555vk();
        } else {
            List<C2507tk> list2 = vkVar.f4373g;
            C2555vk vkVar3 = new C2555vk();
            if (list2 != null) {
                vkVar3.f4373g.addAll(list2);
            }
            vkVar2 = vkVar3;
        }
        this.f3895l = vkVar2;
        this.f3896m = str5;
        this.f3897n = str6;
        this.f3898o = j;
        this.f3899p = j2;
        this.f3900q = z2;
        this.f3901r = n0Var;
        this.f3902s = list == null ? new ArrayList<>() : list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 2, this.f3890g, false);
        C0823f.m395s0(parcel, 3, this.f3891h, false);
        boolean z = this.f3892i;
        C0823f.m333B0(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        C0823f.m395s0(parcel, 5, this.f3893j, false);
        C0823f.m395s0(parcel, 6, this.f3894k, false);
        C0823f.m393r0(parcel, 7, this.f3895l, i, false);
        C0823f.m395s0(parcel, 8, this.f3896m, false);
        C0823f.m395s0(parcel, 9, this.f3897n, false);
        long j = this.f3898o;
        C0823f.m333B0(parcel, 10, 8);
        parcel.writeLong(j);
        long j2 = this.f3899p;
        C0823f.m333B0(parcel, 11, 8);
        parcel.writeLong(j2);
        boolean z2 = this.f3900q;
        C0823f.m333B0(parcel, 12, 4);
        parcel.writeInt(z2 ? 1 : 0);
        C0823f.m393r0(parcel, 13, this.f3901r, i, false);
        C0823f.m401v0(parcel, 14, this.f3902s, false);
        C0823f.m331A0(parcel, w0);
    }
}
