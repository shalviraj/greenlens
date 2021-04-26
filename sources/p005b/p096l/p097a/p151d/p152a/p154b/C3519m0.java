package p005b.p096l.p097a.p151d.p152a.p154b;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.d.a.b.m0 */
public final /* synthetic */ class C3519m0 implements C3548u0 {

    /* renamed from: a */
    public final C3551v0 f6474a;

    /* renamed from: b */
    public final Bundle f6475b;

    /* renamed from: c */
    public final /* synthetic */ int f6476c = 0;

    public C3519m0(C3551v0 v0Var, Bundle bundle) {
        this.f6474a = v0Var;
        this.f6475b = bundle;
    }

    public C3519m0(C3551v0 v0Var, Bundle bundle, byte[] bArr) {
        this.f6474a = v0Var;
        this.f6475b = bundle;
    }

    /* renamed from: a */
    public final Object mo14793a() {
        boolean z;
        C3545t0 t0Var;
        boolean z2 = true;
        if (this.f6476c != 0) {
            C3551v0 v0Var = this.f6474a;
            Bundle bundle = this.f6475b;
            Objects.requireNonNull(v0Var);
            int i = bundle.getInt("session_id");
            if (i == 0) {
                return Boolean.FALSE;
            }
            Map<Integer, C3542s0> map = v0Var.f6586e;
            Integer valueOf = Integer.valueOf(i);
            boolean z3 = false;
            if (map.containsKey(valueOf)) {
                C3542s0 c = v0Var.mo14844c(i);
                int i2 = bundle.getInt(C1960d.m2722J(NotificationCompat.CATEGORY_STATUS, c.f6554c.f6539a));
                if (C3484d1.m6661g(c.f6554c.f6541c, i2)) {
                    C3551v0.f6581g.mo14884b(3, "Found stale update for session %s with status %d.", new Object[]{valueOf, Integer.valueOf(c.f6554c.f6541c)});
                    C3539r0 r0Var = c.f6554c;
                    String str = r0Var.f6539a;
                    int i3 = r0Var.f6541c;
                    if (i3 == 4) {
                        v0Var.f6583b.mo14881a().mo14758a(i, str);
                    } else if (i3 == 5) {
                        v0Var.f6583b.mo14881a().mo14761d(i);
                    } else if (i3 == 6) {
                        v0Var.f6583b.mo14881a().mo14763f(Arrays.asList(new String[]{str}));
                    }
                } else {
                    c.f6554c.f6541c = i2;
                    if (C3484d1.m6659e(i2)) {
                        v0Var.mo14842a(i);
                        v0Var.f6584c.mo14789a(c.f6554c.f6539a);
                    } else {
                        for (C3545t0 next : c.f6554c.f6543e) {
                            ArrayList parcelableArrayList = bundle.getParcelableArrayList(C1960d.m2728L("chunk_intents", c.f6554c.f6539a, next.f6568a));
                            if (parcelableArrayList != null) {
                                for (int i4 = 0; i4 < parcelableArrayList.size(); i4++) {
                                    if (!(parcelableArrayList.get(i4) == null || ((Intent) parcelableArrayList.get(i4)).getData() == null)) {
                                        next.f6571d.get(i4).f6532a = true;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                String d = C3551v0.m6765d(bundle);
                long j = bundle.getLong(C1960d.m2722J("pack_version", d));
                int i5 = bundle.getInt(C1960d.m2722J(NotificationCompat.CATEGORY_STATUS, d));
                long j2 = bundle.getLong(C1960d.m2722J("total_bytes_to_download", d));
                List<String> stringArrayList = bundle.getStringArrayList(C1960d.m2722J("slice_ids", d));
                ArrayList arrayList = new ArrayList();
                if (stringArrayList == null) {
                    stringArrayList = Collections.emptyList();
                }
                for (String str2 : stringArrayList) {
                    List<Intent> parcelableArrayList2 = bundle.getParcelableArrayList(C1960d.m2728L("chunk_intents", d, str2));
                    ArrayList arrayList2 = new ArrayList();
                    if (parcelableArrayList2 == null) {
                        parcelableArrayList2 = Collections.emptyList();
                    }
                    for (Intent intent : parcelableArrayList2) {
                        if (intent == null) {
                            z2 = z3;
                        }
                        arrayList2.add(new C3535q0(z2));
                        z2 = true;
                        z3 = false;
                    }
                    String string = bundle.getString(C1960d.m2728L("uncompressed_hash_sha256", d, str2));
                    long j3 = bundle.getLong(C1960d.m2728L("uncompressed_size", d, str2));
                    int i6 = bundle.getInt(C1960d.m2728L("patch_format", d, str2), 0);
                    if (i6 != 0) {
                        t0Var = new C3545t0(str2, string, j3, arrayList2, 0, i6);
                        z = false;
                    } else {
                        z = false;
                        t0Var = new C3545t0(str2, string, j3, arrayList2, bundle.getInt(C1960d.m2728L("compression_format", d, str2), 0), 0);
                    }
                    arrayList.add(t0Var);
                    z3 = z;
                    z2 = true;
                }
                v0Var.f6586e.put(Integer.valueOf(i), new C3542s0(i, bundle.getInt("app_version_code"), new C3539r0(d, j, i5, j2, arrayList)));
            }
            return Boolean.TRUE;
        }
        C3551v0 v0Var2 = this.f6474a;
        Bundle bundle2 = this.f6475b;
        Objects.requireNonNull(v0Var2);
        int i7 = bundle2.getInt("session_id");
        if (i7 != 0) {
            Map<Integer, C3542s0> map2 = v0Var2.f6586e;
            Integer valueOf2 = Integer.valueOf(i7);
            if (map2.containsKey(valueOf2)) {
                C3542s0 s0Var = v0Var2.f6586e.get(valueOf2);
                if (s0Var.f6554c.f6541c == 6) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!C3484d1.m6661g(s0Var.f6554c.f6541c, bundle2.getInt(C1960d.m2722J(NotificationCompat.CATEGORY_STATUS, C3551v0.m6765d(bundle2)))));
            }
        }
        return Boolean.TRUE;
    }
}
