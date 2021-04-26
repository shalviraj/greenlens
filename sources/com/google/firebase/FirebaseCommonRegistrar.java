package com.google.firebase;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p180d.C3831e;
import p005b.p096l.p180d.C3832f;
import p005b.p096l.p180d.C3833g;
import p005b.p096l.p180d.C3834h;
import p005b.p096l.p180d.p181a0.C3816b;
import p005b.p096l.p180d.p181a0.C3819e;
import p005b.p096l.p180d.p181a0.C3822h;
import p005b.p096l.p180d.p190p.C3948d;
import p005b.p096l.p180d.p190p.C3956h;
import p005b.p096l.p180d.p190p.C3967r;
import p005b.p096l.p180d.p212u.C4224b;
import p005b.p096l.p180d.p212u.C4226d;
import p005b.p096l.p180d.p212u.C4227e;
import p005b.p096l.p180d.p212u.C4228f;
import p298d.C6763e;

public class FirebaseCommonRegistrar implements C3956h {
    /* renamed from: a */
    public static String m10514a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public List<C3948d<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        C3948d.C3950b<C3822h> a = C3948d.m7321a(C3822h.class);
        a.mo15461a(new C3967r(C3819e.class, 2, 0));
        a.mo15463c(C3816b.f7030a);
        arrayList.add(a.mo15462b());
        int i = C4226d.f7816b;
        C3948d.C3950b<C4228f> a2 = C3948d.m7321a(C4228f.class);
        a2.mo15461a(new C3967r(Context.class, 1, 0));
        a2.mo15461a(new C3967r(C4227e.class, 2, 0));
        a2.mo15463c(C4224b.f7814a);
        arrayList.add(a2.mo15462b());
        arrayList.add(C1960d.m2707E("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C1960d.m2707E("fire-core", "19.5.0"));
        arrayList.add(C1960d.m2707E("device-name", m10514a(Build.PRODUCT)));
        arrayList.add(C1960d.m2707E("device-model", m10514a(Build.DEVICE)));
        arrayList.add(C1960d.m2707E("device-brand", m10514a(Build.BRAND)));
        arrayList.add(C1960d.m2743Q("android-target-sdk", C3831e.f7054a));
        arrayList.add(C1960d.m2743Q("android-min-sdk", C3832f.f7055a));
        arrayList.add(C1960d.m2743Q("android-platform", C3833g.f7056a));
        arrayList.add(C1960d.m2743Q("android-installer", C3834h.f7057a));
        try {
            str = C6763e.f13672k.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(C1960d.m2707E("kotlin", str));
        }
        return arrayList;
    }
}
