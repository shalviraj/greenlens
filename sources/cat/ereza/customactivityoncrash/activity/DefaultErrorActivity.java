package cat.ereza.customactivityoncrash.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import p360g.p361a.p362a.C6964c;
import p360g.p361a.p362a.C6966d;
import p360g.p361a.p362a.p363e.C6967a;

public final class DefaultErrorActivity extends AppCompatActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f10647g = 0;

    /* renamed from: cat.ereza.customactivityoncrash.activity.DefaultErrorActivity$a */
    public class C5303a implements View.OnClickListener {

        /* renamed from: g */
        public final /* synthetic */ C6967a f10648g;

        public C5303a(C6967a aVar) {
            this.f10648g = aVar;
        }

        public void onClick(View view) {
            C6964c.m12561e(DefaultErrorActivity.this, this.f10648g);
        }
    }

    /* renamed from: cat.ereza.customactivityoncrash.activity.DefaultErrorActivity$b */
    public class C5304b implements View.OnClickListener {

        /* renamed from: g */
        public final /* synthetic */ C6967a f10650g;

        public C5304b(C6967a aVar) {
            this.f10650g = aVar;
        }

        public void onClick(View view) {
            DefaultErrorActivity defaultErrorActivity = DefaultErrorActivity.this;
            C6967a aVar = this.f10650g;
            Application application = C6964c.f13963a;
            C6964c.C6965a aVar2 = aVar.f13979q;
            if (aVar2 != null) {
                aVar2.mo24356r();
            }
            defaultErrorActivity.finish();
            C6964c.m12560d();
        }
    }

    /* renamed from: cat.ereza.customactivityoncrash.activity.DefaultErrorActivity$c */
    public class C5305c implements View.OnClickListener {

        /* renamed from: cat.ereza.customactivityoncrash.activity.DefaultErrorActivity$c$a */
        public class C5306a implements DialogInterface.OnClickListener {
            public C5306a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                DefaultErrorActivity defaultErrorActivity = DefaultErrorActivity.this;
                int i2 = DefaultErrorActivity.f10647g;
                String b = C6964c.m12558b(defaultErrorActivity, defaultErrorActivity.getIntent());
                ClipboardManager clipboardManager = (ClipboardManager) defaultErrorActivity.getSystemService("clipboard");
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(defaultErrorActivity.getString(R.string.customactivityoncrash_error_activity_error_details_clipboard_label), b));
                    Toast.makeText(defaultErrorActivity, R.string.customactivityoncrash_error_activity_error_details_copied, 0).show();
                }
            }
        }

        public C5305c() {
        }

        public void onClick(View view) {
            AlertDialog.Builder title = new AlertDialog.Builder(DefaultErrorActivity.this).setTitle((int) R.string.customactivityoncrash_error_activity_error_details_title);
            DefaultErrorActivity defaultErrorActivity = DefaultErrorActivity.this;
            TextView textView = (TextView) title.setMessage((CharSequence) C6964c.m12558b(defaultErrorActivity, defaultErrorActivity.getIntent())).setPositiveButton((int) R.string.customactivityoncrash_error_activity_error_details_close, (DialogInterface.OnClickListener) null).setNeutralButton((int) R.string.customactivityoncrash_error_activity_error_details_copy, (DialogInterface.OnClickListener) new C5306a()).show().findViewById(16908299);
            if (textView != null) {
                textView.setTextSize(0, DefaultErrorActivity.this.getResources().getDimension(R.dimen.customactivityoncrash_error_activity_error_details_text_size));
            }
        }
    }

    @SuppressLint({"PrivateResource"})
    public void onCreate(@Nullable Bundle bundle) {
        View.OnClickListener onClickListener;
        super.onCreate(bundle);
        TypedArray obtainStyledAttributes = obtainStyledAttributes(C6966d.f13968a);
        if (!obtainStyledAttributes.hasValue(115)) {
            setTheme(2131820972);
        }
        obtainStyledAttributes.recycle();
        setContentView((int) R.layout.customactivityoncrash_default_error_activity);
        Button button = (Button) findViewById(R.id.customactivityoncrash_error_activity_restart_button);
        C6967a c = C6964c.m12559c(getIntent());
        if (!c.f13972j || c.f13978p == null) {
            onClickListener = new C5304b(c);
        } else {
            button.setText(R.string.customactivityoncrash_error_activity_restart_app);
            onClickListener = new C5303a(c);
        }
        button.setOnClickListener(onClickListener);
        Button button2 = (Button) findViewById(R.id.customactivityoncrash_error_activity_more_info_button);
        if (c.f13971i) {
            button2.setOnClickListener(new C5305c());
        } else {
            button2.setVisibility(8);
        }
        Integer num = c.f13976n;
        ImageView imageView = (ImageView) findViewById(R.id.customactivityoncrash_error_activity_image);
        if (num != null) {
            imageView.setImageDrawable(ResourcesCompat.getDrawable(getResources(), num.intValue(), getTheme()));
        }
    }
}
