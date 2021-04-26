package p005b.p096l.p180d.p185o.p189e0;

import android.content.SharedPreferences;
import com.segment.analytics.integrations.BasePayload;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: b.l.d.o.e0.r */
public final class C3893r {

    /* renamed from: a */
    public static final List<String> f7171a = new ArrayList(Arrays.asList(new String[]{"firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", BasePayload.TIMESTAMP_KEY}));

    /* renamed from: b */
    public static final C3893r f7172b = new C3893r();

    /* renamed from: a */
    public static final void m7283a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String remove : f7171a) {
            edit.remove(remove);
        }
        edit.commit();
    }
}
