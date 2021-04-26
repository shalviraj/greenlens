package com.appfoundry.previewer.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.segment.analytics.integrations.BasePayload;
import kotlin.Metadata;
import p005b.p006a.p007a.p022m.C0800f;
import p005b.p038f.p039a.C0849e;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, mo24462d2 = {"Lcom/appfoundry/previewer/activities/DebugAppsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Ld/r;", "onCreate", "(Landroid/os/Bundle;)V", "finish", "()V", "<init>", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class DebugAppsActivity extends AppCompatActivity {
    public void finish() {
        super.finish();
        C0849e.m524j0(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0849e.m554y0(this);
        C0849e.m512d0(this);
        setContentView((int) R.layout.activity_emulator);
        C0849e.m522i0(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        if (recyclerView != null) {
            C6888i.m12438e(recyclerView, "$this$setupForDebugApps");
            C6888i.m12438e(this, BasePayload.CONTEXT_KEY);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(new C0800f(this));
        }
    }
}
