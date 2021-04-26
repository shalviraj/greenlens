package p005b.p051h.p052a.p055m.p058v.p060d0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserModel;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.h.a.m.v.d0.j */
public final class C1059j {

    /* renamed from: a */
    public final int f1150a;

    /* renamed from: b */
    public final int f1151b;

    /* renamed from: c */
    public final Context f1152c;

    /* renamed from: d */
    public final int f1153d;

    /* renamed from: b.h.a.m.v.d0.j$a */
    public static final class C1060a {

        /* renamed from: e */
        public static final int f1154e = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: a */
        public final Context f1155a;

        /* renamed from: b */
        public ActivityManager f1156b;

        /* renamed from: c */
        public C1062c f1157c;

        /* renamed from: d */
        public float f1158d = ((float) f1154e);

        public C1060a(Context context) {
            this.f1155a = context;
            this.f1156b = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.f1157c = new C1061b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && this.f1156b.isLowRamDevice()) {
                this.f1158d = 0.0f;
            }
        }
    }

    /* renamed from: b.h.a.m.v.d0.j$b */
    public static final class C1061b implements C1062c {

        /* renamed from: a */
        public final DisplayMetrics f1159a;

        public C1061b(DisplayMetrics displayMetrics) {
            this.f1159a = displayMetrics;
        }
    }

    /* renamed from: b.h.a.m.v.d0.j$c */
    public interface C1062c {
    }

    public C1059j(C1060a aVar) {
        this.f1152c = aVar.f1155a;
        int i = aVar.f1156b.isLowRamDevice() ? 2097152 : 4194304;
        this.f1153d = i;
        ActivityManager activityManager = aVar.f1156b;
        int round = Math.round(((float) (activityManager.getMemoryClass() * 1024 * 1024)) * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = ((C1061b) aVar.f1157c).f1159a;
        float f = (float) (displayMetrics.widthPixels * displayMetrics.heightPixels * 4);
        int round2 = Math.round(aVar.f1158d * f);
        int round3 = Math.round(f * 2.0f);
        int i2 = round - i;
        int i3 = round3 + round2;
        if (i3 <= i2) {
            this.f1151b = round3;
            this.f1150a = round2;
        } else {
            float f2 = ((float) i2) / (aVar.f1158d + 2.0f);
            this.f1151b = Math.round(2.0f * f2);
            this.f1150a = Math.round(f2 * aVar.f1158d);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder u = C0843a.m460u("Calculation complete, Calculated memory cache size: ");
            u.append(mo10932a(this.f1151b));
            u.append(", pool size: ");
            u.append(mo10932a(this.f1150a));
            u.append(", byte array size: ");
            u.append(mo10932a(i));
            u.append(", memory class limited? ");
            u.append(i3 > round);
            u.append(", max size: ");
            u.append(mo10932a(round));
            u.append(", memoryClass: ");
            u.append(aVar.f1156b.getMemoryClass());
            u.append(", isLowMemoryDevice: ");
            u.append(aVar.f1156b.isLowRamDevice());
            Log.d("MemorySizeCalculator", u.toString());
        }
    }

    /* renamed from: a */
    public final String mo10932a(int i) {
        return Formatter.formatFileSize(this.f1152c, (long) i);
    }
}
