package p005b.p273o;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.C1760e;

/* renamed from: b.o.t */
public final class C4976t implements Runnable {

    /* renamed from: b.o.t$a */
    public class C4977a implements DialogInterface.OnClickListener {
        public C4977a(C4976t tVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C4815d3.m8834i(C4815d3.f9230a, "GT_DO_NOT_SHOW_MISSING_GPS", true);
        }
    }

    /* renamed from: b.o.t$b */
    public class C4978b implements DialogInterface.OnClickListener {

        /* renamed from: g */
        public final /* synthetic */ Activity f9621g;

        public C4978b(C4976t tVar, Activity activity) {
            this.f9621g = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Activity activity = this.f9621g;
            try {
                Object obj = C1760e.f3107c;
                C1760e eVar = C1760e.f3108d;
                PendingIntent pendingIntent = null;
                Intent a = eVar.mo12003a(activity, eVar.mo12006d(C4857i2.f9358c), (String) null);
                if (a != null) {
                    pendingIntent = PendingIntent.getActivity(activity, 9000, a, 134217728);
                }
                if (pendingIntent != null) {
                    pendingIntent.send();
                }
            } catch (PendingIntent.CanceledException e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        Activity k = C4857i2.m8943k();
        if (k != null) {
            Objects.requireNonNull(C4857i2.f9338H);
            String f = C4835f2.m8856f(k, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
            String f2 = C4835f2.m8856f(k, "onesignal_gms_missing_alert_button_update", "Update");
            String f3 = C4835f2.m8856f(k, "onesignal_gms_missing_alert_button_skip", "Skip");
            new AlertDialog.Builder(k).setMessage(f).setPositiveButton(f2, new C4978b(this, k)).setNegativeButton(f3, new C4977a(this)).setNeutralButton(C4835f2.m8856f(k, "onesignal_gms_missing_alert_button_close", "Close"), (DialogInterface.OnClickListener) null).create().show();
        }
    }
}
