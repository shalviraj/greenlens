package p005b.p006a.p007a.p022m;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import p005b.p006a.p007a.p017h.C0712k0;
import p005b.p006a.p007a.p018i.C0756o;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p437o.p438a.p439a.C8068c;

/* renamed from: b.a.a.m.d */
public final class C0798d implements View.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ C0799e f592g;

    /* renamed from: h */
    public final /* synthetic */ TextView f593h;

    public C0798d(C0799e eVar, TextView textView) {
        this.f592g = eVar;
        this.f593h = textView;
    }

    public final void onClick(View view) {
        StringBuilder sb;
        TextView textView = this.f593h;
        C6888i.m12437d(textView, "editText");
        String obj = textView.getText().toString();
        C6888i.m12438e(obj, "$this$isBravoUrl");
        boolean z = false;
        if (!C7694h.m13926d(obj, "/devices/apps/", false, 2)) {
            C6888i.m12438e(obj, "$this$isBravoAppId");
            if (!(obj.length() == 26) && !C0756o.m227e(obj)) {
                Toast.makeText(this.f592g.f594a, "Invalid json", 0).show();
                return;
            }
        }
        C6888i.m12438e(obj, "$this$isBravoAppId");
        if (obj.length() == 26) {
            z = true;
        }
        if (z) {
            sb = C0843a.m460u("https://apps-service.bravostudio.app/devices/apps/");
        } else {
            if (C0756o.m227e(obj)) {
                sb = C0843a.m460u("https://apps-service-dev.bravostudio.app/devices/apps/");
                obj = obj.substring(3);
                C6888i.m12437d(obj, "(this as java.lang.String).substring(startIndex)");
            }
            C8068c.m14948b().mo26008g(new C0712k0(obj));
            this.f592g.f594a.finish();
        }
        sb.append(obj);
        obj = sb.toString();
        C8068c.m14948b().mo26008g(new C0712k0(obj));
        this.f592g.f594a.finish();
    }
}
