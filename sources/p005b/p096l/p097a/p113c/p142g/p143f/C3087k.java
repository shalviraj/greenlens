package p005b.p096l.p097a.p113c.p142g.p143f;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* renamed from: b.l.a.c.g.f.k */
public final class C3087k {
    /* renamed from: a */
    public static <T extends Parcelable> T m5774a(@Nullable Bundle bundle, String str) {
        Class<C3087k> cls = C3087k.class;
        bundle.setClassLoader(cls.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(cls.getClassLoader());
        return bundle2.getParcelable(str);
    }

    /* renamed from: b */
    public static void m5775b(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable a = m5774a(bundle, "MapOptions");
            if (a != null) {
                m5776c(bundle2, "MapOptions", a);
            }
            Parcelable a2 = m5774a(bundle, "StreetViewPanoramaOptions");
            if (a2 != null) {
                m5776c(bundle2, "StreetViewPanoramaOptions", a2);
            }
            Parcelable a3 = m5774a(bundle, "camera");
            if (a3 != null) {
                m5776c(bundle2, "camera", a3);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    /* renamed from: c */
    public static void m5776c(Bundle bundle, String str, Parcelable parcelable) {
        Class<C3087k> cls = C3087k.class;
        bundle.setClassLoader(cls.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(cls.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
