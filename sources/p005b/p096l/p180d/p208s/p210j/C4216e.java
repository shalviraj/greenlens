package p005b.p096l.p180d.p208s.p210j;

import androidx.annotation.NonNull;
import com.google.android.material.datepicker.UtcDates;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p005b.p096l.p180d.p208s.C4206e;
import p005b.p096l.p180d.p208s.C4208g;
import p005b.p096l.p180d.p208s.C4209h;
import p005b.p096l.p180d.p208s.p209i.C4211b;

/* renamed from: b.l.d.s.j.e */
public final class C4216e implements C4211b<C4216e> {

    /* renamed from: e */
    public static final C4217a f7801e = new C4217a((C4215d) null);

    /* renamed from: a */
    public final Map<Class<?>, C4206e<?>> f7802a;

    /* renamed from: b */
    public final Map<Class<?>, C4208g<?>> f7803b;

    /* renamed from: c */
    public C4206e<Object> f7804c = C4212a.f7797a;

    /* renamed from: d */
    public boolean f7805d = false;

    /* renamed from: b.l.d.s.j.e$a */
    public static final class C4217a implements C4208g<Date> {

        /* renamed from: a */
        public static final DateFormat f7806a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f7806a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
        }

        public C4217a(C4215d dVar) {
        }

        /* renamed from: a */
        public void mo11751a(@NonNull Object obj, @NonNull Object obj2) {
            ((C4209h) obj2).mo15802d(f7806a.format((Date) obj));
        }
    }

    public C4216e() {
        HashMap hashMap = new HashMap();
        this.f7802a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f7803b = hashMap2;
        Class<String> cls = String.class;
        hashMap2.put(cls, C4213b.f7798a);
        hashMap.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        hashMap2.put(cls2, C4214c.f7799a);
        hashMap.remove(cls2);
        Class<Date> cls3 = Date.class;
        hashMap2.put(cls3, f7801e);
        hashMap.remove(cls3);
    }
}
