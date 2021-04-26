package p005b.p273o;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.onesignal.PermissionsActivity;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4857i2;

/* renamed from: b.o.u3 */
public class C4997u3 implements DialogInterface.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ PermissionsActivity f9666g;

    public C4997u3(PermissionsActivity permissionsActivity) {
        this.f9666g = permissionsActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        StringBuilder u = C0843a.m460u("package:");
        u.append(this.f9666g.getPackageName());
        intent.setData(Uri.parse(u.toString()));
        this.f9666g.startActivity(intent);
        C4794c0.m8793i(true, C4857i2.C4876s.PERMISSION_DENIED);
    }
}
