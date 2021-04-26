package p005b.p096l.p180d.p212u;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: b.l.d.u.g */
public class C4230g {

    /* renamed from: b */
    public static C4230g f7824b;

    /* renamed from: c */
    public static final SimpleDateFormat f7825c = new SimpleDateFormat("dd/MM/yyyy z");

    /* renamed from: a */
    public final SharedPreferences f7826a;

    public C4230g(Context context) {
        this.f7826a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    /* renamed from: a */
    public synchronized boolean mo15811a(String str, long j) {
        if (this.f7826a.contains(str)) {
            Date date = new Date(this.f7826a.getLong(str, -1));
            Date date2 = new Date(j);
            SimpleDateFormat simpleDateFormat = f7825c;
            if (!(!simpleDateFormat.format(date).equals(simpleDateFormat.format(date2)))) {
                return false;
            }
            this.f7826a.edit().putLong(str, j).apply();
            return true;
        }
        this.f7826a.edit().putLong(str, j).apply();
        return true;
    }
}
