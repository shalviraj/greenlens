package p005b.p096l.p097a.p113c.p119b.p126p;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.regex.Pattern;

/* renamed from: b.l.a.c.b.p.g */
public class C1963g {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    @Nullable
    /* renamed from: a */
    public static String m2880a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public static boolean m2881b(@Nullable String str) {
        return str == null || str.trim().isEmpty();
    }
}
