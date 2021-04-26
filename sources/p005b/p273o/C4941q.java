package p005b.p273o;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p005b.p273o.C4857i2;

/* renamed from: b.o.q */
public final class C4941q implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ Activity f9530g;

    /* renamed from: h */
    public final /* synthetic */ JSONObject f9531h;

    /* renamed from: i */
    public final /* synthetic */ int f9532i;

    /* renamed from: b.o.q$a */
    public class C4942a implements DialogInterface.OnClickListener {

        /* renamed from: g */
        public final /* synthetic */ List f9533g;

        /* renamed from: h */
        public final /* synthetic */ Intent f9534h;

        public C4942a(List list, Intent intent) {
            this.f9533g = list;
            this.f9534h = intent;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = i + 3;
            if (this.f9533g.size() > 1) {
                try {
                    JSONObject jSONObject = new JSONObject(C4941q.this.f9531h.toString());
                    jSONObject.put("actionId", this.f9533g.get(i2));
                    this.f9534h.putExtra("onesignalData", jSONObject.toString());
                    C4887k0.m8986c(C4941q.this.f9530g, this.f9534h);
                } catch (Throwable unused) {
                }
            } else {
                C4887k0.m8986c(C4941q.this.f9530g, this.f9534h);
            }
        }
    }

    /* renamed from: b.o.q$b */
    public class C4943b implements DialogInterface.OnCancelListener {

        /* renamed from: g */
        public final /* synthetic */ Intent f9536g;

        public C4943b(Intent intent) {
            this.f9536g = intent;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C4887k0.m8986c(C4941q.this.f9530g, this.f9536g);
        }
    }

    public C4941q(Activity activity, JSONObject jSONObject, int i) {
        this.f9530g = activity;
        this.f9531h = jSONObject;
        this.f9532i = i;
    }

    public void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f9530g);
        builder.setTitle(C4950r.m9104p(this.f9531h));
        builder.setMessage(this.f9531h.optString("alert"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Activity activity = this.f9530g;
        try {
            C4950r.m9090b(this.f9531h, arrayList, arrayList2);
        } catch (Throwable th) {
            C4857i2.m8933a(C4857i2.C4868k.ERROR, "Failed to parse JSON for custom buttons for alert dialog.", th);
        }
        if (arrayList.size() == 0 || arrayList.size() < 3) {
            arrayList.add(C4835f2.m8856f(activity, "onesignal_in_app_alert_ok_button_text", "Ok"));
            arrayList2.add("__DEFAULT__");
        }
        Intent n = C4950r.m9102n(this.f9532i);
        n.putExtra("action_button", true);
        n.putExtra("from_alert", true);
        n.putExtra("onesignalData", this.f9531h.toString());
        if (this.f9531h.has("grp")) {
            n.putExtra("grp", this.f9531h.optString("grp"));
        }
        C4942a aVar = new C4942a(arrayList2, n);
        builder.setOnCancelListener(new C4943b(n));
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 0) {
                builder.setNeutralButton((CharSequence) arrayList.get(i), aVar);
            } else if (i == 1) {
                builder.setNegativeButton((CharSequence) arrayList.get(i), aVar);
            } else if (i == 2) {
                builder.setPositiveButton((CharSequence) arrayList.get(i), aVar);
            }
        }
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(false);
        create.show();
    }
}
