package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import java.util.Objects;
import p005b.p273o.C4771a;
import p005b.p273o.C4793c;
import p005b.p273o.C4794c0;
import p005b.p273o.C4832f;
import p005b.p273o.C4857i2;
import p005b.p273o.C4983t3;
import p005b.p273o.C4997u3;

public class PermissionsActivity extends Activity {

    /* renamed from: g */
    public static final String f11503g = PermissionsActivity.class.getCanonicalName();

    /* renamed from: h */
    public static boolean f11504h;

    /* renamed from: i */
    public static boolean f11505i;

    /* renamed from: j */
    public static boolean f11506j;

    /* renamed from: k */
    public static boolean f11507k;

    /* renamed from: l */
    public static C4771a.C4773b f11508l;

    /* renamed from: com.onesignal.PermissionsActivity$a */
    public class C5791a implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ int[] f11509g;

        public C5791a(int[] iArr) {
            this.f11509g = iArr;
        }

        public void run() {
            int[] iArr = this.f11509g;
            boolean z = false;
            if (iArr.length > 0 && iArr[0] == 0) {
                z = true;
            }
            C4794c0.m8793i(true, z ? C4857i2.C4876s.PERMISSION_GRANTED : C4857i2.C4876s.PERMISSION_DENIED);
            if (z) {
                C4794c0.m8794j();
                return;
            }
            PermissionsActivity permissionsActivity = PermissionsActivity.this;
            String str = PermissionsActivity.f11503g;
            Objects.requireNonNull(permissionsActivity);
            if (PermissionsActivity.f11506j && PermissionsActivity.f11507k && !ActivityCompat.shouldShowRequestPermissionRationale(permissionsActivity, C4794c0.f9184i)) {
                new AlertDialog.Builder(C4857i2.m8943k()).setTitle(R.string.location_not_available_title).setMessage(R.string.location_not_available_open_settings_message).setPositiveButton(R.string.location_not_available_open_settings_option, new C4997u3(permissionsActivity)).setNegativeButton(17039369, new C4983t3(permissionsActivity)).show();
            }
            C4794c0.m8787c();
        }
    }

    /* renamed from: a */
    public final void mo22371a() {
        if (!f11504h) {
            f11504h = true;
            f11507k = !ActivityCompat.shouldShowRequestPermissionRationale(this, C4794c0.f9184i);
            String[] strArr = {C4794c0.f9184i};
            if (this instanceof C4832f) {
                ((C4832f) this).validateRequestPermissionsRequestCode(2);
            }
            requestPermissions(strArr, 2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4857i2.m8928E(this);
        if (bundle == null || !bundle.getBoolean("android:hasCurrentPermissionsRequest", false)) {
            mo22371a();
        } else {
            f11504h = true;
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (C4857i2.f9362g) {
            mo22371a();
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        f11505i = true;
        f11504h = false;
        if (i == 2) {
            new Handler().postDelayed(new C5791a(iArr), 500);
        }
        if (C4793c.f9174h != null) {
            C4771a.f9115c.remove(f11503g);
        }
        finish();
        overridePendingTransition(R.anim.onesignal_fade_in, R.anim.onesignal_fade_out);
    }
}
