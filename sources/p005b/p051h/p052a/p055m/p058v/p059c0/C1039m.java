package p005b.p051h.p052a.p055m.p058v.p059c0;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.p078s.C1380j;

@RequiresApi(19)
/* renamed from: b.h.a.m.v.c0.m */
public class C1039m implements C1037k {

    /* renamed from: d */
    public static final Bitmap.Config[] f1114d;

    /* renamed from: e */
    public static final Bitmap.Config[] f1115e;

    /* renamed from: f */
    public static final Bitmap.Config[] f1116f = {Bitmap.Config.RGB_565};

    /* renamed from: g */
    public static final Bitmap.Config[] f1117g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h */
    public static final Bitmap.Config[] f1118h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a */
    public final C1042c f1119a = new C1042c();

    /* renamed from: b */
    public final C1028g<C1041b, Bitmap> f1120b = new C1028g<>();

    /* renamed from: c */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f1121c = new HashMap();

    /* renamed from: b.h.a.m.v.c0.m$a */
    public static /* synthetic */ class C1040a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1122a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1122a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1122a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1122a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1122a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p055m.p058v.p059c0.C1039m.C1040a.<clinit>():void");
        }
    }

    @VisibleForTesting
    /* renamed from: b.h.a.m.v.c0.m$b */
    public static final class C1041b implements C1038l {

        /* renamed from: a */
        public final C1042c f1123a;

        /* renamed from: b */
        public int f1124b;

        /* renamed from: c */
        public Bitmap.Config f1125c;

        public C1041b(C1042c cVar) {
            this.f1123a = cVar;
        }

        /* renamed from: a */
        public void mo10907a() {
            this.f1123a.mo10891c(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1041b)) {
                return false;
            }
            C1041b bVar = (C1041b) obj;
            return this.f1124b == bVar.f1124b && C1380j.m1469b(this.f1125c, bVar.f1125c);
        }

        public int hashCode() {
            int i = this.f1124b * 31;
            Bitmap.Config config = this.f1125c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C1039m.m881c(this.f1124b, this.f1125c);
        }
    }

    @VisibleForTesting
    /* renamed from: b.h.a.m.v.c0.m$c */
    public static class C1042c extends C1024c<C1041b> {
        /* renamed from: a */
        public C1038l mo10889a() {
            return new C1041b(this);
        }

        /* renamed from: d */
        public C1041b mo10925d(int i, Bitmap.Config config) {
            C1041b bVar = (C1041b) mo10890b();
            bVar.f1124b = i;
            bVar.f1125c = config;
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f1114d = configArr;
        f1115e = configArr;
    }

    /* renamed from: c */
    public static String m881c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: a */
    public final void mo10916a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d = mo10918d(bitmap.getConfig());
        Integer num2 = (Integer) d.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo10919e(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            d.remove(num);
        } else {
            d.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    @Nullable
    /* renamed from: b */
    public Bitmap mo10917b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int c = C1380j.m1470c(i, i2, config);
        C1041b bVar = (C1041b) this.f1119a.mo10890b();
        bVar.f1124b = c;
        bVar.f1125c = config;
        int i3 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i4 = C1040a.f1122a[config.ordinal()];
            if (i4 == 1) {
                configArr = f1114d;
            } else if (i4 == 2) {
                configArr = f1116f;
            } else if (i4 != 3) {
                configArr = i4 != 4 ? new Bitmap.Config[]{config} : f1118h;
            } else {
                configArr = f1117g;
            }
        } else {
            configArr = f1115e;
        }
        int length = configArr.length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i3];
            Integer ceilingKey = mo10918d(config2).ceilingKey(Integer.valueOf(c));
            if (ceilingKey == null || ceilingKey.intValue() > c * 8) {
                i3++;
            } else if (ceilingKey.intValue() != c || (config2 != null ? !config2.equals(config) : config != null)) {
                this.f1119a.mo10891c(bVar);
                bVar = this.f1119a.mo10925d(ceilingKey.intValue(), config2);
            }
        }
        Bitmap a = this.f1120b.mo10897a(bVar);
        if (a != null) {
            mo10916a(Integer.valueOf(bVar.f1124b), a);
            a.reconfigure(i, i2, config);
        }
        return a;
    }

    /* renamed from: d */
    public final NavigableMap<Integer, Integer> mo10918d(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f1121c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f1121c.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: e */
    public String mo10919e(Bitmap bitmap) {
        return m881c(C1380j.m1471d(bitmap), bitmap.getConfig());
    }

    /* renamed from: f */
    public void mo10920f(Bitmap bitmap) {
        C1041b d = this.f1119a.mo10925d(C1380j.m1471d(bitmap), bitmap.getConfig());
        this.f1120b.mo10898b(d, bitmap);
        NavigableMap<Integer, Integer> d2 = mo10918d(bitmap.getConfig());
        Integer num = (Integer) d2.get(Integer.valueOf(d.f1124b));
        Integer valueOf = Integer.valueOf(d.f1124b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        d2.put(valueOf, Integer.valueOf(i));
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("SizeConfigStrategy{groupedMap=");
        u.append(this.f1120b);
        u.append(", sortedSizes=(");
        for (Map.Entry next : this.f1121c.entrySet()) {
            u.append(next.getKey());
            u.append('[');
            u.append(next.getValue());
            u.append("], ");
        }
        if (!this.f1121c.isEmpty()) {
            u.replace(u.length() - 2, u.length(), "");
        }
        u.append(")}");
        return u.toString();
    }
}
