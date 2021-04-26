package com.appfoundry.previewer.activities;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Page;
import com.segment.analytics.Analytics;
import com.segment.analytics.Options;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import p005b.p006a.p007a.p015f.C0688a;
import p005b.p006a.p007a.p017h.C0699e;
import p005b.p006a.p007a.p017h.C0718n0;
import p005b.p006a.p007a.p018i.C0744e;
import p005b.p006a.p007a.p023n.C0816e;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p038f.p039a.C0849e;
import p298d.p344x.p346c.C6888i;
import p437o.p438a.p439a.C8083m;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, mo24462d2 = {"Lcom/appfoundry/previewer/activities/ScannedAppsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Ld/r;", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "()V", "onStart", "Lb/a/a/h/n0;", "event", "onShowQrEvent", "(Lb/a/a/h/n0;)V", "Lb/a/a/h/e;", "onPageCloseEvent", "(Lb/a/a/h/e;)V", "<init>", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class ScannedAppsActivity extends AppCompatActivity {
    public void onBackPressed() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        List<Container> list;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_with_container);
        C0849e.m554y0(this);
        C0849e.m512d0(this);
        Page K = C0823f.m342K("page-scanned-apps");
        if (K != null) {
            Container container = null;
            C0849e.m540r0(this, C0744e.m200d(K, (Boolean) null, 1), R.id.container);
            List<Container> list2 = K.f11038f;
            if (!(list2 == null || !(!list2.isEmpty()) || (list = K.f11038f) == null)) {
                container = list.get(0);
            }
            if (container != null) {
                C0816e eVar = C0816e.f639l;
                C0816e.f630c.mo16832d(container);
                K.f11038f = new ArrayList();
            }
        }
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onPageCloseEvent(C0699e eVar) {
        C6888i.m12438e(eVar, "event");
        finish();
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onShowQrEvent(C0718n0 n0Var) {
        C6888i.m12438e(n0Var, "event");
        C0688a aVar = C0688a.f391b;
        Analytics.with(C0849e.m505a()).track("Show QR", C0843a.m436L("java.util.UUID.randomUUID().toString()", C0688a.m185c(), "app_url", n0Var.f421a, "app_name", n0Var.f422b), new Options().setIntegration("Slack", false));
        Bundle bundle = new Bundle();
        bundle.putString("qrCodeUrl", n0Var.f421a);
        bundle.putString("appName", n0Var.f422b);
        Intent intent = new Intent(this, QrCodeActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void onStart() {
        super.onStart();
        C0849e.m536p0(this);
    }
}
