package p005b.p273o;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.onesignal.PermissionsActivity;
import p005b.p273o.C4771a;

/* renamed from: b.o.v3 */
public final class C5003v3 extends C4771a.C4773b {
    /* renamed from: a */
    public void mo16492a(@NonNull Activity activity) {
        if (!activity.getClass().equals(PermissionsActivity.class)) {
            Intent intent = new Intent(activity, PermissionsActivity.class);
            intent.setFlags(131072);
            activity.startActivity(intent);
            activity.overridePendingTransition(R.anim.onesignal_fade_in, R.anim.onesignal_fade_out);
        }
    }
}
