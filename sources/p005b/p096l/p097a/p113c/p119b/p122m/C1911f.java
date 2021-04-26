package p005b.p096l.p097a.p113c.p119b.p122m;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.util.Log;

/* renamed from: b.l.a.c.b.m.f */
public abstract class C1911f implements DialogInterface.OnClickListener {
    /* renamed from: a */
    public abstract void mo12243a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo12243a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
