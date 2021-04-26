package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p151d.p152a.p154b.C3511k0;
import p005b.p096l.p097a.p151d.p152a.p154b.C3538r;
import p005b.p096l.p097a.p151d.p152a.p154b.C3541s;
import p005b.p096l.p097a.p151d.p152a.p154b.C3556x;

public abstract class AssetPackState {
    /* renamed from: d */
    public static AssetPackState m10421d(@NonNull String str, int i, int i2, long j, long j2, double d, int i3, String str2) {
        return new C3556x(str, i, i2, j, j2, (int) Math.rint(100.0d * d), i3, str2);
    }

    /* renamed from: e */
    public static AssetPackState m10422e(Bundle bundle, String str, C3511k0 k0Var, C3538r rVar) {
        double doubleValue;
        Bundle bundle2 = bundle;
        String str2 = str;
        C3511k0 k0Var2 = k0Var;
        int i = bundle2.getInt(C1960d.m2722J(NotificationCompat.CATEGORY_STATUS, str2));
        Objects.requireNonNull((C3541s) rVar);
        int i2 = bundle2.getInt(C1960d.m2722J("error_code", str2));
        long j = bundle2.getLong(C1960d.m2722J("bytes_downloaded", str2));
        long j2 = bundle2.getLong(C1960d.m2722J("total_bytes_to_download", str2));
        synchronized (k0Var) {
            Double d = k0Var2.f6456a.get(str2);
            doubleValue = d == null ? ShadowDrawableWrapper.COS_45 : d.doubleValue();
        }
        long j3 = bundle2.getLong(C1960d.m2722J("pack_version", str2));
        long j4 = bundle2.getLong(C1960d.m2722J("pack_base_version", str2));
        int i3 = 1;
        if (!(i != 4 || j4 == 0 || j4 == j3)) {
            i3 = 2;
        }
        return m10421d(str, i, i2, j, j2, doubleValue, i3, bundle2.getString(C1960d.m2722J("pack_version_tag", str2), ""));
    }

    /* renamed from: a */
    public abstract int mo14849a();

    /* renamed from: b */
    public abstract String mo14850b();

    /* renamed from: c */
    public abstract long mo14851c();

    /* renamed from: f */
    public abstract int mo14853f();

    /* renamed from: g */
    public abstract String mo14854g();

    /* renamed from: h */
    public abstract int mo14855h();

    /* renamed from: i */
    public abstract long mo14857i();

    /* renamed from: j */
    public abstract int mo14858j();
}
