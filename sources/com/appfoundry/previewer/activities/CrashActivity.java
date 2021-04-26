package com.appfoundry.previewer.activities;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import java.util.Objects;
import kotlin.Metadata;
import p005b.p006a.p007a.p023n.C0801a;
import p005b.p006a.p007a.p024o.C0823f;
import p298d.p344x.p346c.C6888i;
import p360g.p361a.p362a.C6964c;
import p360g.p361a.p362a.p363e.C6967a;
import p441p.p442a.C8091a;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo24462d2 = {"Lcom/appfoundry/previewer/activities/CrashActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Ld/r;", "onCreate", "(Landroid/os/Bundle;)V", "<init>", "()V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class CrashActivity extends AppCompatActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f10828g = 0;

    /* renamed from: com.appfoundry.previewer.activities.CrashActivity$a */
    public static final class C5440a implements View.OnClickListener {

        /* renamed from: g */
        public final /* synthetic */ CrashActivity f10829g;

        /* renamed from: h */
        public final /* synthetic */ C6967a f10830h;

        public C5440a(CrashActivity crashActivity, Typeface typeface, C6967a aVar) {
            this.f10829g = crashActivity;
            this.f10830h = aVar;
        }

        public final void onClick(View view) {
            C6967a aVar = this.f10830h;
            if (aVar != null) {
                C6964c.m12561e(this.f10829g, aVar);
            }
        }
    }

    /* renamed from: com.appfoundry.previewer.activities.CrashActivity$b */
    public static final class C5441b implements View.OnClickListener {

        /* renamed from: g */
        public final /* synthetic */ TextView f10831g;

        /* renamed from: h */
        public final /* synthetic */ CrashActivity f10832h;

        /* renamed from: com.appfoundry.previewer.activities.CrashActivity$b$a */
        public static final class C5442a implements DialogInterface.OnClickListener {

            /* renamed from: g */
            public final /* synthetic */ C5441b f10833g;

            public C5442a(C5441b bVar) {
                this.f10833g = bVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                CrashActivity crashActivity = this.f10833g.f10832h;
                int i2 = CrashActivity.f10828g;
                String b = C6964c.m12558b(crashActivity, crashActivity.getIntent());
                C6888i.m12437d(b, "CustomActivityOnCrash.ge…sFromIntent(this, intent)");
                Object systemService = crashActivity.getSystemService("clipboard");
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(crashActivity.getString(R.string.customactivityoncrash_error_activity_error_details_clipboard_label), b));
                Toast.makeText(crashActivity, R.string.customactivityoncrash_error_activity_error_details_copied, 0).show();
            }
        }

        public C5441b(TextView textView, CrashActivity crashActivity, Typeface typeface) {
            this.f10831g = textView;
            this.f10832h = crashActivity;
        }

        public final void onClick(View view) {
            AlertDialog.Builder title = new AlertDialog.Builder(this.f10832h).setTitle((int) R.string.customactivityoncrash_error_activity_error_details_title);
            CrashActivity crashActivity = this.f10832h;
            TextView textView = (TextView) title.setMessage((CharSequence) C6964c.m12558b(crashActivity, crashActivity.getIntent())).setPositiveButton((int) R.string.customactivityoncrash_error_activity_error_details_close, (DialogInterface.OnClickListener) null).setNeutralButton((int) R.string.customactivityoncrash_error_activity_error_details_copy, (DialogInterface.OnClickListener) new C5442a(this)).show().findViewById(16908299);
            if (textView != null) {
                textView.setTextSize(0, this.f10831g.getResources().getDimension(R.dimen.customactivityoncrash_error_activity_error_details_text_size));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_crash);
        C8091a.f16272d.mo26044b("AppCrash: %s, with app id: %s", C6964c.m12558b(this, getIntent()), C0823f.m332B());
        C6967a c = C6964c.m12559c(getIntent());
        Typeface a = C0801a.m267a(C0801a.f597b, "01E25XRF6ZJM19R4ZQCJPPT1XF", 0, 2);
        TextView textView = (TextView) findViewById(R.id.crash_error_text);
        if (textView != null) {
            textView.setTypeface(a);
            textView.setTypeface(a);
            textView.setOnClickListener(new C5440a(this, a, c));
        }
        TextView textView2 = (TextView) findViewById(R.id.more_info);
        if (textView2 != null) {
            textView2.setVisibility(0);
            textView2.setTypeface(a);
            textView2.setOnClickListener(new C5441b(textView2, this, a));
        }
    }
}
