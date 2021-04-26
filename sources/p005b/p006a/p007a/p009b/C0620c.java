package p005b.p006a.p007a.p009b;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p005b.p006a.p007a.p017h.C0701f;
import p005b.p006a.p007a.p017h.C0707i;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p038f.p039a.C0849e;
import p437o.p438a.p439a.C8068c;
import p441p.p442a.C8091a;

/* renamed from: b.a.a.b.c */
public class C0620c extends WebChromeClient {

    /* renamed from: a */
    public View f273a;

    /* renamed from: b */
    public WebChromeClient.CustomViewCallback f274b;

    /* renamed from: c */
    public int f275c;

    /* renamed from: d */
    public Context f276d;

    /* renamed from: e */
    public ValueCallback<Uri[]> f277e;

    /* renamed from: f */
    public String f278f = null;

    /* renamed from: g */
    public String f279g = null;

    /* renamed from: h */
    public Dialog f280h;

    /* renamed from: i */
    public boolean f281i = true;

    /* renamed from: b.a.a.b.c$a */
    public class C0621a implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ PermissionRequest f282g;

        public C0621a(C0620c cVar, PermissionRequest permissionRequest) {
            this.f282g = permissionRequest;
        }

        public void run() {
            PermissionRequest permissionRequest = this.f282g;
            permissionRequest.grant(permissionRequest.getResources());
        }
    }

    /* renamed from: b.a.a.b.c$b */
    public class C0622b implements DialogInterface.OnDismissListener {
        public C0622b() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            ValueCallback<Uri[]> valueCallback;
            C0620c cVar = C0620c.this;
            if (cVar.f281i && (valueCallback = cVar.f277e) != null) {
                valueCallback.onReceiveValue((Object) null);
                C0620c.this.f277e = null;
            }
            C0620c.this.f281i = true;
        }
    }

    /* renamed from: b.a.a.b.c$c */
    public class C0623c implements View.OnClickListener {
        public C0623c() {
        }

        public void onClick(View view) {
            C0620c cVar = C0620c.this;
            cVar.f281i = false;
            cVar.f280h.dismiss();
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
            ((AppCompatActivity) C0620c.this.f276d).startActivityForResult(intent, 21);
        }
    }

    /* renamed from: b.a.a.b.c$d */
    public class C0624d implements View.OnClickListener {
        public C0624d() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0085  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r6) {
            /*
                r5 = this;
                b.a.a.b.c r6 = p005b.p006a.p007a.p009b.C0620c.this
                r0 = 0
                r6.f281i = r0
                android.app.Dialog r6 = r6.f280h
                r6.dismiss()
                android.content.Intent r6 = new android.content.Intent
                java.lang.String r1 = "android.media.action.IMAGE_CAPTURE"
                r6.<init>(r1)
                b.a.a.b.c r1 = p005b.p006a.p007a.p009b.C0620c.this
                android.content.Context r1 = r1.f276d
                androidx.appcompat.app.AppCompatActivity r1 = (androidx.appcompat.app.AppCompatActivity) r1
                android.content.pm.PackageManager r1 = r1.getPackageManager()
                android.content.ComponentName r1 = r6.resolveActivity(r1)
                r2 = 0
                if (r1 == 0) goto L_0x008a
                b.a.a.b.c r1 = p005b.p006a.p007a.p009b.C0620c.this     // Catch:{ IOException -> 0x0034 }
                java.io.File r1 = p005b.p006a.p007a.p009b.C0620c.m89a(r1)     // Catch:{ IOException -> 0x0034 }
                java.lang.String r3 = "PhotoPath"
                b.a.a.b.c r4 = p005b.p006a.p007a.p009b.C0620c.this     // Catch:{ IOException -> 0x0032 }
                java.lang.String r4 = r4.f278f     // Catch:{ IOException -> 0x0032 }
                r6.putExtra(r3, r4)     // Catch:{ IOException -> 0x0032 }
                goto L_0x0047
            L_0x0032:
                r3 = move-exception
                goto L_0x0037
            L_0x0034:
                r1 = move-exception
                r3 = r1
                r1 = r2
            L_0x0037:
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.String r3 = r3.getLocalizedMessage()
                r4[r0] = r3
                p.a.a$b r0 = p441p.p442a.C8091a.f16272d
                java.lang.String r3 = "Image file creation failed: %s"
                r0.mo26044b(r3, r4)
            L_0x0047:
                if (r1 == 0) goto L_0x0085
                b.a.a.b.c r0 = p005b.p006a.p007a.p009b.C0620c.this
                java.lang.String r2 = "file:"
                java.lang.StringBuilder r2 = p005b.p035e.p036a.p037a.C0843a.m460u(r2)
                java.lang.String r3 = r1.getAbsolutePath()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.f278f = r2
                b.a.a.b.c r0 = p005b.p006a.p007a.p009b.C0620c.this
                android.content.Context r0 = r0.f276d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                android.content.Context r3 = p005b.p038f.p039a.C0849e.m505a()
                java.lang.String r3 = r3.getPackageName()
                r2.append(r3)
                java.lang.String r3 = ".provider"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.net.Uri r0 = androidx.core.content.FileProvider.getUriForFile(r0, r2, r1)
                java.lang.String r1 = "output"
                r6.putExtra(r1, r0)
                goto L_0x008a
            L_0x0085:
                b.a.a.b.c r6 = p005b.p006a.p007a.p009b.C0620c.this
                r6.f278f = r2
                r6 = r2
            L_0x008a:
                b.a.a.b.c r0 = p005b.p006a.p007a.p009b.C0620c.this
                android.content.Context r0 = r0.f276d
                androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
                r1 = 22
                r0.startActivityForResult(r6, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p009b.C0620c.C0624d.onClick(android.view.View):void");
        }
    }

    /* renamed from: b.a.a.b.c$e */
    public class C0625e implements View.OnClickListener {
        public C0625e() {
        }

        public void onClick(View view) {
            File file;
            C0620c cVar = C0620c.this;
            cVar.f281i = false;
            cVar.f280h.dismiss();
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            if (intent.resolveActivity(((AppCompatActivity) C0620c.this.f276d).getPackageManager()) != null) {
                try {
                    file = C0620c.m90b(C0620c.this);
                } catch (IOException e) {
                    C8091a.f16272d.mo26044b("Video file creation failed: %s", e.getLocalizedMessage());
                    file = null;
                }
                if (file != null) {
                    C0620c cVar2 = C0620c.this;
                    StringBuilder u = C0843a.m460u("file:");
                    u.append(file.getAbsolutePath());
                    cVar2.f279g = u.toString();
                    intent.putExtra("output", FileProvider.getUriForFile(C0620c.this.f276d, C0849e.m505a().getPackageName() + ".provider", file));
                } else {
                    C0620c.this.f279g = null;
                    intent = null;
                }
            }
            ((AppCompatActivity) C0620c.this.f276d).startActivityForResult(intent, 23);
        }
    }

    public C0620c(Context context) {
        this.f276d = context;
    }

    /* renamed from: a */
    public static File m89a(C0620c cVar) {
        if (cVar.mo10359c()) {
            return File.createTempFile(C0843a.m452m("bravo_img_", new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()), "_"), ".jpg", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
        }
        return null;
    }

    /* renamed from: b */
    public static File m90b(C0620c cVar) {
        if (cVar.mo10359c()) {
            return File.createTempFile(C0843a.m452m("bravo_video_", new SimpleDateFormat("yyyy_mm_ss").format(new Date()), "_"), ".mp4", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo10359c() {
        if (ContextCompat.checkSelfPermission(this.f276d, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        ActivityCompat.requestPermissions((AppCompatActivity) this.f276d, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
        return false;
    }

    public Bitmap getDefaultVideoPoster() {
        if (this.f273a == null) {
            return null;
        }
        return BitmapFactory.decodeResource(C0849e.m505a().getResources(), 2130837573);
    }

    public void onHideCustomView() {
        C8068c.m14948b().mo26008g(new C0701f());
        ((FrameLayout) ((AppCompatActivity) this.f276d).getWindow().getDecorView()).removeView(this.f273a);
        this.f273a = null;
        ((AppCompatActivity) this.f276d).getWindow().getDecorView().setSystemUiVisibility(this.f275c);
        this.f274b.onCustomViewHidden();
        this.f274b = null;
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        C8091a.f16272d.mo26043a("chromium WEBVIEW: onpermissionrequest: %s", permissionRequest.getOrigin().toString());
        ((AppCompatActivity) this.f276d).runOnUiThread(new C0621a(this, permissionRequest));
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        C8068c.m14948b().mo26008g(new C0707i());
        if (this.f273a != null) {
            onHideCustomView();
            return;
        }
        this.f273a = view;
        this.f275c = ((AppCompatActivity) this.f276d).getWindow().getDecorView().getSystemUiVisibility();
        this.f274b = customViewCallback;
        ((FrameLayout) ((AppCompatActivity) this.f276d).getWindow().getDecorView()).addView(this.f273a, new FrameLayout.LayoutParams(-1, -1));
        ((AppCompatActivity) this.f276d).getWindow().getDecorView().setSystemUiVisibility(3846);
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        boolean z;
        if (ContextCompat.checkSelfPermission(this.f276d, "android.permission.WRITE_EXTERNAL_STORAGE") == 0 && ContextCompat.checkSelfPermission(this.f276d, "android.permission.CAMERA") == 0) {
            z = true;
        } else {
            ActivityCompat.requestPermissions((AppCompatActivity) this.f276d, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"}, 1);
            z = false;
        }
        if (!z) {
            return false;
        }
        this.f277e = valueCallback;
        if (this.f280h == null) {
            Dialog dialog = new Dialog(this.f276d);
            this.f280h = dialog;
            dialog.setTitle("Upload...");
            this.f280h.setContentView(R.layout.dialog_file_upload);
            if (this.f280h.getWindow() != null) {
                this.f280h.getWindow().setLayout(-1, -2);
            }
            this.f280h.setOnDismissListener(new C0622b());
            this.f280h.findViewById(R.id.add_picture).setOnClickListener(new C0623c());
            this.f280h.findViewById(R.id.take_photo).setOnClickListener(new C0624d());
            this.f280h.findViewById(R.id.take_video).setOnClickListener(new C0625e());
        }
        this.f280h.show();
        return true;
    }
}
