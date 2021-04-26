package p005b.p038f.p039a;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* renamed from: b.f.a.b */
public final class C0846b implements DialogInterface.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ Activity f704g;

    public C0846b(Activity activity) {
        this.f704g = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.f704g.getPackageName(), (String) null));
        this.f704g.startActivity(intent);
    }
}
