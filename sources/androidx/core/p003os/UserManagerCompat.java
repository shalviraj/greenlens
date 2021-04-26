package androidx.core.p003os;

import android.content.Context;
import android.os.UserManager;
import androidx.annotation.NonNull;

/* renamed from: androidx.core.os.UserManagerCompat */
public class UserManagerCompat {
    private UserManagerCompat() {
    }

    public static boolean isUserUnlocked(@NonNull Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
