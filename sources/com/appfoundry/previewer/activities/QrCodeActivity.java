package com.appfoundry.previewer.activities;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import p005b.p006a.p007a.p017h.C0699e;
import p005b.p038f.p039a.C0849e;
import p298d.p344x.p346c.C6888i;
import p437o.p438a.p439a.C8083m;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, mo24462d2 = {"Lcom/appfoundry/previewer/activities/QrCodeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Ld/r;", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "()V", "onStart", "Lb/a/a/h/e;", "event", "onPageCloseEvent", "(Lb/a/a/h/e;)V", "<init>", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class QrCodeActivity extends AppCompatActivity {
    public void onBackPressed() {
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        r0 = r0.get(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r7 = 2131427361(0x7f0b0021, float:1.8476336E38)
            r6.setContentView((int) r7)
            p005b.p038f.p039a.C0849e.m554y0(r6)
            p005b.p038f.p039a.C0849e.m512d0(r6)
            java.lang.String r7 = "page-qr"
            com.appfoundry.previewer.model.Page r7 = p005b.p006a.p007a.p024o.C0823f.m342K(r7)
            if (r7 == 0) goto L_0x008a
            java.util.List<com.appfoundry.previewer.model.Container> r0 = r7.f11038f
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r0.get(r1)
            com.appfoundry.previewer.model.Container r0 = (com.appfoundry.previewer.model.Container) r0
            if (r0 == 0) goto L_0x002c
            java.lang.String r3 = "scanned-qr"
            com.appfoundry.previewer.model.Component r0 = p005b.p006a.p007a.p018i.C0744e.m205i(r0, r3)
            goto L_0x002d
        L_0x002c:
            r0 = r2
        L_0x002d:
            java.lang.String r3 = "intent"
            if (r0 == 0) goto L_0x0048
            android.content.Intent r4 = r6.getIntent()
            p298d.p344x.p346c.C6888i.m12437d(r4, r3)
            android.os.Bundle r4 = r4.getExtras()
            if (r4 == 0) goto L_0x0045
            java.lang.String r5 = "qrCodeUrl"
            java.lang.String r4 = r4.getString(r5)
            goto L_0x0046
        L_0x0045:
            r4 = r2
        L_0x0046:
            r0.f10945g = r4
        L_0x0048:
            if (r0 == 0) goto L_0x004e
            java.lang.String r4 = "componennt:qr"
            r0.f10940b = r4
        L_0x004e:
            java.util.List<com.appfoundry.previewer.model.Container> r0 = r7.f11038f
            if (r0 == 0) goto L_0x0061
            java.lang.Object r0 = r0.get(r1)
            com.appfoundry.previewer.model.Container r0 = (com.appfoundry.previewer.model.Container) r0
            if (r0 == 0) goto L_0x0061
            java.lang.String r1 = "scanned-title"
            com.appfoundry.previewer.model.Component r0 = p005b.p006a.p007a.p018i.C0744e.m205i(r0, r1)
            goto L_0x0062
        L_0x0061:
            r0 = r2
        L_0x0062:
            if (r0 == 0) goto L_0x007f
            android.content.Intent r1 = r6.getIntent()
            p298d.p344x.p346c.C6888i.m12437d(r1, r3)
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x007a
            java.lang.String r3 = "appName"
            java.lang.String r1 = r1.getString(r3)
            if (r1 == 0) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            java.lang.String r1 = ""
        L_0x007c:
            p005b.p006a.p007a.p018i.C0744e.m191D(r0, r1)
        L_0x007f:
            r0 = 1
            b.a.a.a.b r7 = p005b.p006a.p007a.p018i.C0744e.m200d(r7, r2, r0)
            r0 = 2131230859(0x7f08008b, float:1.8077783E38)
            p005b.p038f.p039a.C0849e.m540r0(r6, r7, r0)
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.QrCodeActivity.onCreate(android.os.Bundle):void");
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onPageCloseEvent(C0699e eVar) {
        C6888i.m12438e(eVar, "event");
        finish();
    }

    public void onStart() {
        super.onStart();
        C0849e.m536p0(this);
    }
}
