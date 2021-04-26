package p005b.p265m.p266a;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.amplitude.api.Constants;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import java.util.List;
import java.util.Objects;
import p005b.p096l.p232f.C4625s;
import p005b.p096l.p232f.p254x.p255a.C4645c;
import p005b.p096l.p232f.p254x.p255a.C4650f;
import p005b.p265m.p266a.C4701d;
import p005b.p265m.p266a.p267t.C4738d;

/* renamed from: b.m.a.f */
public class C4708f {

    /* renamed from: m */
    public static final String f8979m = "f";

    /* renamed from: a */
    public Activity f8980a;

    /* renamed from: b */
    public DecoratedBarcodeView f8981b;

    /* renamed from: c */
    public int f8982c = -1;

    /* renamed from: d */
    public boolean f8983d = false;

    /* renamed from: e */
    public boolean f8984e = false;

    /* renamed from: f */
    public C4650f f8985f;

    /* renamed from: g */
    public C4645c f8986g;

    /* renamed from: h */
    public Handler f8987h;

    /* renamed from: i */
    public boolean f8988i = false;

    /* renamed from: j */
    public C4698a f8989j = new C4709a();

    /* renamed from: k */
    public final C4701d.C4706e f8990k;

    /* renamed from: l */
    public boolean f8991l;

    /* renamed from: b.m.a.f$a */
    public class C4709a implements C4698a {

        /* renamed from: b.m.a.f$a$a */
        public class C4710a implements Runnable {

            /* renamed from: g */
            public final /* synthetic */ C4699b f8993g;

            public C4710a(C4699b bVar) {
                this.f8993g = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:18:0x00d5  */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x013f  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r14 = this;
                    b.m.a.f$a r0 = p005b.p265m.p266a.C4708f.C4709a.this
                    b.m.a.f r0 = p005b.p265m.p266a.C4708f.this
                    b.m.a.b r1 = r14.f8993g
                    boolean r2 = r0.f8983d
                    r3 = 0
                    if (r2 == 0) goto L_0x009e
                    b.m.a.s r2 = r1.f8945b
                    java.util.Objects.requireNonNull(r2)
                    android.graphics.Rect r4 = new android.graphics.Rect
                    b.m.a.n r5 = r2.f9031a
                    int r6 = r5.f9022b
                    int r5 = r5.f9023c
                    r4.<init>(r3, r3, r6, r5)
                    android.graphics.YuvImage r5 = new android.graphics.YuvImage
                    b.m.a.n r6 = r2.f9031a
                    byte[] r8 = r6.f9021a
                    int r9 = r2.f9032b
                    int r10 = r6.f9022b
                    int r11 = r6.f9023c
                    r12 = 0
                    r7 = r5
                    r7.<init>(r8, r9, r10, r11, r12)
                    java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
                    r6.<init>()
                    r7 = 90
                    r5.compressToJpeg(r4, r7, r6)
                    byte[] r4 = r6.toByteArray()
                    android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
                    r5.<init>()
                    r6 = 2
                    r5.inSampleSize = r6
                    int r6 = r4.length
                    android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeByteArray(r4, r3, r6, r5)
                    int r4 = r2.f9033c
                    if (r4 == 0) goto L_0x0065
                    android.graphics.Matrix r12 = new android.graphics.Matrix
                    r12.<init>()
                    int r2 = r2.f9033c
                    float r2 = (float) r2
                    r12.postRotate(r2)
                    r8 = 0
                    r9 = 0
                    int r10 = r7.getWidth()
                    int r11 = r7.getHeight()
                    r13 = 0
                    android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r8, r9, r10, r11, r12, r13)
                L_0x0065:
                    java.lang.String r2 = "barcodeimage"
                    java.lang.String r4 = ".jpg"
                    android.app.Activity r5 = r0.f8980a     // Catch:{ IOException -> 0x0087 }
                    java.io.File r5 = r5.getCacheDir()     // Catch:{ IOException -> 0x0087 }
                    java.io.File r2 = java.io.File.createTempFile(r2, r4, r5)     // Catch:{ IOException -> 0x0087 }
                    java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0087 }
                    r4.<init>(r2)     // Catch:{ IOException -> 0x0087 }
                    android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x0087 }
                    r6 = 100
                    r7.compress(r5, r6, r4)     // Catch:{ IOException -> 0x0087 }
                    r4.close()     // Catch:{ IOException -> 0x0087 }
                    java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x0087 }
                    goto L_0x009f
                L_0x0087:
                    r2 = move-exception
                    java.lang.String r4 = p005b.p265m.p266a.C4708f.f8979m
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r6 = "Unable to create temporary file and store bitmap! "
                    r5.append(r6)
                    r5.append(r2)
                    java.lang.String r2 = r5.toString()
                    android.util.Log.w(r4, r2)
                L_0x009e:
                    r2 = 0
                L_0x009f:
                    android.content.Intent r4 = new android.content.Intent
                    java.lang.String r5 = "com.google.zxing.client.android.SCAN"
                    r4.<init>(r5)
                    r5 = 524288(0x80000, float:7.34684E-40)
                    r4.addFlags(r5)
                    b.l.f.q r5 = r1.f8944a
                    java.lang.String r5 = r5.f8691a
                    java.lang.String r6 = "SCAN_RESULT"
                    r4.putExtra(r6, r5)
                    b.l.f.q r5 = r1.f8944a
                    b.l.f.a r5 = r5.f8694d
                    java.lang.String r5 = r5.toString()
                    java.lang.String r6 = "SCAN_RESULT_FORMAT"
                    r4.putExtra(r6, r5)
                    b.l.f.q r5 = r1.f8944a
                    byte[] r5 = r5.f8692b
                    if (r5 == 0) goto L_0x00cf
                    int r6 = r5.length
                    if (r6 <= 0) goto L_0x00cf
                    java.lang.String r6 = "SCAN_RESULT_BYTES"
                    r4.putExtra(r6, r5)
                L_0x00cf:
                    b.l.f.q r1 = r1.f8944a
                    java.util.Map<b.l.f.r, java.lang.Object> r1 = r1.f8695e
                    if (r1 == 0) goto L_0x013d
                    b.l.f.r r5 = p005b.p096l.p232f.C4624r.UPC_EAN_EXTENSION
                    boolean r6 = r1.containsKey(r5)
                    if (r6 == 0) goto L_0x00ea
                    java.lang.Object r5 = r1.get(r5)
                    java.lang.String r5 = r5.toString()
                    java.lang.String r6 = "SCAN_RESULT_UPC_EAN_EXTENSION"
                    r4.putExtra(r6, r5)
                L_0x00ea:
                    b.l.f.r r5 = p005b.p096l.p232f.C4624r.ORIENTATION
                    java.lang.Object r5 = r1.get(r5)
                    java.lang.Number r5 = (java.lang.Number) r5
                    if (r5 == 0) goto L_0x00fd
                    int r5 = r5.intValue()
                    java.lang.String r6 = "SCAN_RESULT_ORIENTATION"
                    r4.putExtra(r6, r5)
                L_0x00fd:
                    b.l.f.r r5 = p005b.p096l.p232f.C4624r.ERROR_CORRECTION_LEVEL
                    java.lang.Object r5 = r1.get(r5)
                    java.lang.String r5 = (java.lang.String) r5
                    if (r5 == 0) goto L_0x010c
                    java.lang.String r6 = "SCAN_RESULT_ERROR_CORRECTION_LEVEL"
                    r4.putExtra(r6, r5)
                L_0x010c:
                    b.l.f.r r5 = p005b.p096l.p232f.C4624r.BYTE_SEGMENTS
                    java.lang.Object r1 = r1.get(r5)
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    if (r1 == 0) goto L_0x013d
                    java.util.Iterator r1 = r1.iterator()
                L_0x011a:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L_0x013d
                    java.lang.Object r5 = r1.next()
                    byte[] r5 = (byte[]) r5
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r7 = "SCAN_RESULT_BYTE_SEGMENTS_"
                    r6.append(r7)
                    r6.append(r3)
                    java.lang.String r6 = r6.toString()
                    r4.putExtra(r6, r5)
                    int r3 = r3 + 1
                    goto L_0x011a
                L_0x013d:
                    if (r2 == 0) goto L_0x0144
                    java.lang.String r1 = "SCAN_RESULT_IMAGE_PATH"
                    r4.putExtra(r1, r2)
                L_0x0144:
                    android.app.Activity r1 = r0.f8980a
                    r2 = -1
                    r1.setResult(r2, r4)
                    r0.mo16437a()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p005b.p265m.p266a.C4708f.C4709a.C4710a.run():void");
            }
        }

        public C4709a() {
        }

        /* renamed from: a */
        public void mo16395a(C4699b bVar) {
            C4708f.this.f8981b.f11468g.mo16404d();
            C4645c cVar = C4708f.this.f8986g;
            synchronized (cVar) {
                if (cVar.f8760b) {
                    cVar.mo16311a();
                }
            }
            C4708f.this.f8987h.post(new C4710a(bVar));
        }

        /* renamed from: b */
        public void mo16396b(List<C4625s> list) {
        }
    }

    /* renamed from: b.m.a.f$b */
    public class C4711b implements C4701d.C4706e {
        public C4711b() {
        }

        /* renamed from: a */
        public void mo16431a() {
        }

        /* renamed from: b */
        public void mo16432b(Exception exc) {
            C4708f.this.mo16438b();
        }

        /* renamed from: c */
        public void mo16433c() {
        }

        /* renamed from: d */
        public void mo16434d() {
        }

        /* renamed from: e */
        public void mo16435e() {
            if (C4708f.this.f8988i) {
                Log.d(C4708f.f8979m, "Camera closed; finishing activity");
                C4708f.this.f8980a.finish();
            }
        }
    }

    /* renamed from: b.m.a.f$c */
    public class C4712c implements Runnable {
        public C4712c() {
        }

        public void run() {
            Log.d(C4708f.f8979m, "Finishing due to inactivity");
            C4708f.this.f8980a.finish();
        }
    }

    /* renamed from: b.m.a.f$d */
    public class C4713d implements Runnable {
        public C4713d() {
        }

        public void run() {
            C4708f fVar = C4708f.this;
            Objects.requireNonNull(fVar);
            Intent intent = new Intent("com.google.zxing.client.android.SCAN");
            intent.putExtra("TIMEOUT", true);
            fVar.f8980a.setResult(0, intent);
            fVar.mo16437a();
        }
    }

    /* renamed from: b.m.a.f$e */
    public class C4714e implements DialogInterface.OnClickListener {
        public C4714e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C4708f.this.f8980a.finish();
        }
    }

    /* renamed from: b.m.a.f$f */
    public class C4715f implements DialogInterface.OnCancelListener {
        public C4715f() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C4708f.this.f8980a.finish();
        }
    }

    public C4708f(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        C4711b bVar = new C4711b();
        this.f8990k = bVar;
        this.f8991l = false;
        this.f8980a = activity;
        this.f8981b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().f8963p.add(bVar);
        this.f8987h = new Handler();
        this.f8985f = new C4650f(activity, new C4712c());
        this.f8986g = new C4645c(activity);
    }

    /* renamed from: a */
    public void mo16437a() {
        C4738d dVar = this.f8981b.getBarcodeView().f8954g;
        if (dVar == null || dVar.f9060g) {
            this.f8980a.finish();
        } else {
            this.f8988i = true;
        }
        this.f8981b.f11468g.mo16404d();
        this.f8985f.mo16314a();
    }

    /* renamed from: b */
    public void mo16438b() {
        if (!this.f8980a.isFinishing() && !this.f8984e && !this.f8988i) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f8980a);
            builder.setTitle(this.f8980a.getString(R.string.zxing_app_name));
            builder.setMessage(this.f8980a.getString(R.string.zxing_msg_camera_framework_bug));
            builder.setPositiveButton(R.string.zxing_button_ok, new C4714e());
            builder.setOnCancelListener(new C4715f());
            builder.show();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0189  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16439c(android.content.Intent r17, android.os.Bundle r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            android.app.Activity r3 = r0.f8980a
            android.view.Window r3 = r3.getWindow()
            r4 = 128(0x80, float:1.794E-43)
            r3.addFlags(r4)
            r3 = -1
            if (r2 == 0) goto L_0x001c
            java.lang.String r4 = "SAVED_ORIENTATION_LOCK"
            int r2 = r2.getInt(r4, r3)
            r0.f8982c = r2
        L_0x001c:
            if (r1 == 0) goto L_0x01dd
            java.lang.String r2 = "SCAN_ORIENTATION_LOCKED"
            r4 = 1
            boolean r2 = r1.getBooleanExtra(r2, r4)
            r5 = 0
            if (r2 == 0) goto L_0x0068
            int r2 = r0.f8982c
            if (r2 != r3) goto L_0x0061
            android.app.Activity r2 = r0.f8980a
            android.view.WindowManager r2 = r2.getWindowManager()
            android.view.Display r2 = r2.getDefaultDisplay()
            int r2 = r2.getRotation()
            android.app.Activity r6 = r0.f8980a
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            r7 = 2
            if (r6 != r7) goto L_0x0051
            if (r2 == 0) goto L_0x005e
            if (r2 != r4) goto L_0x004e
            goto L_0x005e
        L_0x004e:
            r2 = 8
            goto L_0x005f
        L_0x0051:
            if (r6 != r4) goto L_0x005e
            if (r2 == 0) goto L_0x005c
            r6 = 3
            if (r2 != r6) goto L_0x0059
            goto L_0x005c
        L_0x0059:
            r2 = 9
            goto L_0x005f
        L_0x005c:
            r2 = r4
            goto L_0x005f
        L_0x005e:
            r2 = r5
        L_0x005f:
            r0.f8982c = r2
        L_0x0061:
            android.app.Activity r2 = r0.f8980a
            int r6 = r0.f8982c
            r2.setRequestedOrientation(r6)
        L_0x0068:
            java.lang.String r2 = r17.getAction()
            java.lang.String r6 = "com.google.zxing.client.android.SCAN"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x01af
            com.journeyapps.barcodescanner.DecoratedBarcodeView r2 = r0.f8981b
            java.util.Objects.requireNonNull(r2)
            java.util.regex.Pattern r6 = p005b.p096l.p232f.p254x.p255a.C4648d.f8761a
            java.lang.String r6 = "SCAN_FORMATS"
            java.lang.String r6 = r1.getStringExtra(r6)
            r7 = 0
            if (r6 == 0) goto L_0x008f
            java.util.regex.Pattern r8 = p005b.p096l.p232f.p254x.p255a.C4648d.f8761a
            java.lang.String[] r6 = r8.split(r6)
            java.util.List r6 = java.util.Arrays.asList(r6)
            goto L_0x0090
        L_0x008f:
            r6 = r7
        L_0x0090:
            java.lang.String r8 = "SCAN_MODE"
            java.lang.String r8 = r1.getStringExtra(r8)
            if (r6 == 0) goto L_0x00b6
            java.lang.Class<b.l.f.a> r9 = p005b.p096l.p232f.C4484a.class
            java.util.EnumSet r9 = java.util.EnumSet.noneOf(r9)
            java.util.Iterator r6 = r6.iterator()     // Catch:{ IllegalArgumentException -> 0x00b6 }
        L_0x00a2:
            boolean r10 = r6.hasNext()     // Catch:{ IllegalArgumentException -> 0x00b6 }
            if (r10 == 0) goto L_0x00c3
            java.lang.Object r10 = r6.next()     // Catch:{ IllegalArgumentException -> 0x00b6 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IllegalArgumentException -> 0x00b6 }
            b.l.f.a r10 = p005b.p096l.p232f.C4484a.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x00b6 }
            r9.add(r10)     // Catch:{ IllegalArgumentException -> 0x00b6 }
            goto L_0x00a2
        L_0x00b6:
            if (r8 == 0) goto L_0x00c2
            java.util.Map<java.lang.String, java.util.Set<b.l.f.a>> r6 = p005b.p096l.p232f.p254x.p255a.C4648d.f8769i
            java.lang.Object r6 = r6.get(r8)
            r9 = r6
            java.util.Set r9 = (java.util.Set) r9
            goto L_0x00c3
        L_0x00c2:
            r9 = r7
        L_0x00c3:
            java.lang.String r6 = p005b.p096l.p232f.p254x.p255a.C4649e.f8770a
            android.os.Bundle r6 = r17.getExtras()
            if (r6 == 0) goto L_0x0152
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L_0x00d3
            goto L_0x0152
        L_0x00d3:
            java.util.EnumMap r7 = new java.util.EnumMap
            java.lang.Class<b.l.f.e> r8 = p005b.p096l.p232f.C4577e.class
            r7.<init>(r8)
            b.l.f.e[] r8 = p005b.p096l.p232f.C4577e.values()
            r10 = 11
            r11 = r5
        L_0x00e1:
            if (r11 >= r10) goto L_0x013c
            r12 = r8[r11]
            b.l.f.e r13 = p005b.p096l.p232f.C4577e.CHARACTER_SET
            if (r12 == r13) goto L_0x0137
            b.l.f.e r13 = p005b.p096l.p232f.C4577e.NEED_RESULT_POINT_CALLBACK
            if (r12 == r13) goto L_0x0137
            b.l.f.e r13 = p005b.p096l.p232f.C4577e.POSSIBLE_FORMATS
            if (r12 != r13) goto L_0x00f2
            goto L_0x0137
        L_0x00f2:
            java.lang.String r13 = r12.name()
            boolean r14 = r6.containsKey(r13)
            if (r14 == 0) goto L_0x0137
            java.lang.Class<?> r14 = r12.f8578g
            java.lang.Class<java.lang.Void> r15 = java.lang.Void.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0109
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            goto L_0x0115
        L_0x0109:
            java.lang.Object r13 = r6.get(r13)
            java.lang.Class<?> r14 = r12.f8578g
            boolean r14 = r14.isInstance(r13)
            if (r14 == 0) goto L_0x0119
        L_0x0115:
            r7.put(r12, r13)
            goto L_0x0137
        L_0x0119:
            java.lang.String r14 = p005b.p096l.p232f.p254x.p255a.C4649e.f8770a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r10 = "Ignoring hint "
            r15.append(r10)
            r15.append(r12)
            java.lang.String r10 = " because it is not assignable from "
            r15.append(r10)
            r15.append(r13)
            java.lang.String r10 = r15.toString()
            android.util.Log.w(r14, r10)
        L_0x0137:
            int r11 = r11 + 1
            r10 = 11
            goto L_0x00e1
        L_0x013c:
            java.lang.String r6 = p005b.p096l.p232f.p254x.p255a.C4649e.f8770a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "Hints from the Intent: "
            r8.append(r10)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            android.util.Log.i(r6, r8)
        L_0x0152:
            b.m.a.t.f r6 = new b.m.a.t.f
            r6.<init>()
            java.lang.String r8 = "SCAN_CAMERA_ID"
            boolean r10 = r1.hasExtra(r8)
            if (r10 == 0) goto L_0x0167
            int r3 = r1.getIntExtra(r8, r3)
            if (r3 < 0) goto L_0x0167
            r6.f9088a = r3
        L_0x0167:
            java.lang.String r3 = "TORCH_ENABLED"
            boolean r8 = r1.hasExtra(r3)
            if (r8 == 0) goto L_0x0181
            boolean r3 = r1.getBooleanExtra(r3, r5)
            if (r3 == 0) goto L_0x0181
            com.journeyapps.barcodescanner.BarcodeView r3 = r2.f11468g
            r3.setTorch(r4)
            com.journeyapps.barcodescanner.DecoratedBarcodeView$a r3 = r2.f11471j
            if (r3 == 0) goto L_0x0181
            r3.mo22216b()
        L_0x0181:
            java.lang.String r3 = "PROMPT_MESSAGE"
            java.lang.String r3 = r1.getStringExtra(r3)
            if (r3 == 0) goto L_0x018c
            r2.setStatusText(r3)
        L_0x018c:
            java.lang.String r3 = "SCAN_TYPE"
            int r3 = r1.getIntExtra(r3, r5)
            java.lang.String r8 = "CHARACTER_SET"
            java.lang.String r8 = r1.getStringExtra(r8)
            b.l.f.k r10 = new b.l.f.k
            r10.<init>()
            r10.mo16280e(r7)
            com.journeyapps.barcodescanner.BarcodeView r10 = r2.f11468g
            r10.setCameraSettings(r6)
            com.journeyapps.barcodescanner.BarcodeView r2 = r2.f11468g
            b.m.a.k r6 = new b.m.a.k
            r6.<init>(r9, r7, r8, r3)
            r2.setDecoderFactory(r6)
        L_0x01af:
            java.lang.String r2 = "BEEP_ENABLED"
            boolean r2 = r1.getBooleanExtra(r2, r4)
            if (r2 != 0) goto L_0x01bb
            b.l.f.x.a.c r2 = r0.f8986g
            r2.f8760b = r5
        L_0x01bb:
            java.lang.String r2 = "TIMEOUT"
            boolean r3 = r1.hasExtra(r2)
            if (r3 == 0) goto L_0x01d3
            b.m.a.f$d r3 = new b.m.a.f$d
            r3.<init>()
            android.os.Handler r6 = r0.f8987h
            r7 = 0
            long r7 = r1.getLongExtra(r2, r7)
            r6.postDelayed(r3, r7)
        L_0x01d3:
            java.lang.String r2 = "BARCODE_IMAGE_ENABLED"
            boolean r1 = r1.getBooleanExtra(r2, r5)
            if (r1 == 0) goto L_0x01dd
            r0.f8983d = r4
        L_0x01dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p265m.p266a.C4708f.mo16439c(android.content.Intent, android.os.Bundle):void");
    }

    /* renamed from: d */
    public void mo16440d() {
        this.f8985f.mo16314a();
        BarcodeView barcodeView = this.f8981b.f11468g;
        C4738d cameraInstance = barcodeView.getCameraInstance();
        barcodeView.mo16404d();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.f9060g && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* renamed from: e */
    public void mo16441e() {
        if (ContextCompat.checkSelfPermission(this.f8980a, "android.permission.CAMERA") == 0) {
            this.f8981b.f11468g.mo16406f();
        } else if (!this.f8991l) {
            ActivityCompat.requestPermissions(this.f8980a, new String[]{"android.permission.CAMERA"}, 250);
            this.f8991l = true;
        }
        C4650f fVar = this.f8985f;
        if (!fVar.f8773c) {
            fVar.f8771a.registerReceiver(fVar.f8772b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            fVar.f8773c = true;
        }
        fVar.f8774d.removeCallbacksAndMessages((Object) null);
        if (fVar.f8776f) {
            fVar.f8774d.postDelayed(fVar.f8775e, Constants.MIN_TIME_BETWEEN_SESSIONS_MILLIS);
        }
    }
}
