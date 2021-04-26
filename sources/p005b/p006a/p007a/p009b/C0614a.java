package p005b.p006a.p007a.p009b;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.net.http.SslError;
import android.view.MotionEvent;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AlertDialog;
import com.appfoundry.previewer.model.Style;
import com.segment.analytics.integrations.BasePayload;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import p005b.p006a.p007a.p017h.C0691a;
import p005b.p006a.p007a.p017h.C0697d;
import p005b.p006a.p007a.p017h.C0709j;
import p005b.p006a.p007a.p017h.C0722p0;
import p005b.p006a.p007a.p017h.C0724q0;
import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p337v.C6824d;
import p298d.p337v.p338i.C6833a;
import p298d.p337v.p339j.p340a.C6840e;
import p298d.p337v.p339j.p340a.C6844h;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p364h.p365a.p366a.p367a.C6969b;
import p364h.p365a.p366a.p367a.p368c.C6972c;
import p364h.p365a.p366a.p367a.p369d.C6975a;
import p416l.p417a.C7706c0;
import p416l.p417a.C7716e0;
import p416l.p417a.C7725h0;
import p416l.p417a.C7758r0;
import p416l.p417a.C7821y;
import p416l.p417a.C7823z;
import p437o.p438a.p439a.C8068c;
import p437o.p438a.p439a.C8083m;
import p441p.p442a.C8091a;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B+\b\u0016\u0012\u0006\u0010M\u001a\u00020L\u0012\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u000106\u0012\b\b\u0002\u0010A\u001a\u00020\u0005¢\u0006\u0004\bN\u0010OJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001e\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\b2\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010\nR\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X.¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u00109\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u0001068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0016\u0010A\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010@¨\u0006P"}, mo24462d2 = {"Lb/a/a/b/a;", "Landroid/webkit/WebView;", "Lh/a/a/a/d/a$a;", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ld/r;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lb/a/a/h/d;", "onCameraPermissionGrantedEvent", "(Lb/a/a/h/d;)V", "Lb/a/a/h/j;", "onFileUploadCancelledEvent", "(Lb/a/a/h/j;)V", "Lb/a/a/h/a;", "onAddPictureFromAlbumEvent", "(Lb/a/a/h/a;)V", "Lb/a/a/h/p0;", "onTakePictureFinishedEvent", "(Lb/a/a/h/p0;)V", "Lb/a/a/h/q0;", "onTakeVideoFinishedEvent", "(Lb/a/a/h/q0;)V", "", "url", "destinationPath", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "b", "(Ljava/lang/Exception;)V", "", "progress", "total", "a", "(II)V", "d", "Lb/a/a/b/c;", "p", "Lb/a/a/b/c;", "bravoChromeClient", "o", "Ljava/lang/String;", "webViewUrl", "Lh/a/a/a/c/c;", "h", "Lh/a/a/a/c/c;", "adapter", "", "k", "Ljava/util/List;", "tags", "m", "I", "webViewWidth", "n", "webViewHeight", "j", "Z", "isSvg", "Lh/a/a/a/b;", "i", "Lh/a/a/a/b;", "remotePDFViewPager", "Lcom/appfoundry/previewer/model/Style;", "l", "Lcom/appfoundry/previewer/model/Style;", "webViewStyle", "g", "registered", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/util/List;Z)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: b.a.a.b.a */
public final class C0614a extends WebView implements C6975a.C6976a {

    /* renamed from: g */
    public boolean f256g;

    /* renamed from: h */
    public C6972c f257h;

    /* renamed from: i */
    public C6969b f258i;

    /* renamed from: j */
    public boolean f259j;

    /* renamed from: k */
    public List<String> f260k = new ArrayList();

    /* renamed from: l */
    public Style f261l;

    /* renamed from: m */
    public int f262m;

    /* renamed from: n */
    public int f263n;

    /* renamed from: o */
    public String f264o;

    /* renamed from: p */
    public C0620c f265p;

    /* renamed from: b.a.a.b.a$a */
    public static final class C0615a extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ C0614a f266a;

        /* renamed from: b.a.a.b.a$a$a */
        /* compiled from: java-style lambda group */
        public static final class C0616a implements DialogInterface.OnClickListener {

            /* renamed from: g */
            public final /* synthetic */ int f267g;

            /* renamed from: h */
            public final /* synthetic */ Object f268h;

            public C0616a(int i, Object obj) {
                this.f267g = i;
                this.f268h = obj;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = this.f267g;
                if (i2 == 0) {
                    ((SslErrorHandler) this.f268h).proceed();
                } else if (i2 == 1) {
                    ((SslErrorHandler) this.f268h).cancel();
                } else {
                    throw null;
                }
            }
        }

        public C0615a(C0614a aVar) {
            this.f266a = aVar;
        }

        public void onPageFinished(WebView webView, String str) {
            C6888i.m12438e(webView, "view");
            C6888i.m12438e(str, "url");
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            C6888i.m12438e(webView, "view");
            C6888i.m12438e(sslErrorHandler, "handler");
            C6888i.m12438e(sslError, "error");
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f266a.getContext());
            builder.setMessage((CharSequence) "Error: Invalid SSL Certificate. Continue?");
            builder.setPositiveButton((CharSequence) "Continue", (DialogInterface.OnClickListener) new C0616a(0, sslErrorHandler));
            builder.setNegativeButton((CharSequence) "Cancel", (DialogInterface.OnClickListener) new C0616a(1, sslErrorHandler));
            AlertDialog create = builder.create();
            C6888i.m12437d(create, "builder.create()");
            create.show();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C6888i.m12438e(webView, "view");
            C6888i.m12438e(str, "url");
            webView.loadUrl(str);
            return true;
        }
    }

    @C6840e(mo24177c = "com.appfoundry.previewer.custom.BravoWebView2$configureBravoWebView$3", mo24178f = "BravoWebView2.kt", mo24179l = {268}, mo24180m = "invokeSuspend")
    /* renamed from: b.a.a.b.a$b */
    public static final class C0617b extends C6844h implements C6866p<C7821y, C6824d<? super C6777r>, Object> {

        /* renamed from: k */
        public int f269k;

        /* renamed from: l */
        public final /* synthetic */ C0614a f270l;

        @C6840e(mo24177c = "com.appfoundry.previewer.custom.BravoWebView2$configureBravoWebView$3$svgTask$1", mo24178f = "BravoWebView2.kt", mo24179l = {}, mo24180m = "invokeSuspend")
        /* renamed from: b.a.a.b.a$b$a */
        public static final class C0618a extends C6844h implements C6866p<C7821y, C6824d<? super String>, Object> {

            /* renamed from: k */
            public final /* synthetic */ C0617b f271k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0618a(C0617b bVar, C6824d dVar) {
                super(2, dVar);
                this.f271k = bVar;
            }

            /* renamed from: b */
            public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
                C6888i.m12438e(dVar, "completion");
                return new C0618a(this.f271k, dVar);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
                throw r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0048, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
                p005b.p291q.p292a.C5266a.m9877S(r5, r0);
             */
            /* renamed from: e */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object mo10326e(java.lang.Object r5) {
                /*
                    r4 = this;
                    p005b.p291q.p292a.C5266a.m10018q4(r5)
                    java.net.URL r5 = new java.net.URL
                    b.a.a.b.a$b r0 = r4.f271k
                    b.a.a.b.a r0 = r0.f270l
                    java.lang.String r0 = r0.f264o
                    r5.<init>(r0)
                    java.nio.charset.Charset r0 = p298d.p415c0.C7685a.f15210a
                    java.lang.String r1 = "$this$readBytes"
                    p298d.p344x.p346c.C6888i.m12438e(r5, r1)
                    java.io.InputStream r5 = r5.openStream()
                    java.lang.String r2 = "it"
                    p298d.p344x.p346c.C6888i.m12437d(r5, r2)     // Catch:{ all -> 0x0046 }
                    p298d.p344x.p346c.C6888i.m12438e(r5, r1)     // Catch:{ all -> 0x0046 }
                    java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0046 }
                    int r2 = r5.available()     // Catch:{ all -> 0x0046 }
                    r3 = 8192(0x2000, float:1.14794E-41)
                    int r2 = java.lang.Math.max(r3, r2)     // Catch:{ all -> 0x0046 }
                    r1.<init>(r2)     // Catch:{ all -> 0x0046 }
                    p005b.p291q.p292a.C5266a.m9972j0(r5, r1, r3)     // Catch:{ all -> 0x0046 }
                    byte[] r1 = r1.toByteArray()     // Catch:{ all -> 0x0046 }
                    java.lang.String r2 = "buffer.toByteArray()"
                    p298d.p344x.p346c.C6888i.m12437d(r1, r2)     // Catch:{ all -> 0x0046 }
                    r2 = 0
                    p005b.p291q.p292a.C5266a.m9877S(r5, r2)
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r0)
                    return r5
                L_0x0046:
                    r0 = move-exception
                    throw r0     // Catch:{ all -> 0x0048 }
                L_0x0048:
                    r1 = move-exception
                    p005b.p291q.p292a.C5266a.m9877S(r5, r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p009b.C0614a.C0617b.C0618a.mo10326e(java.lang.Object):java.lang.Object");
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0058, code lost:
                throw r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0054, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0055, code lost:
                p005b.p291q.p292a.C5266a.m9877S(r5, r4);
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
                /*
                    r3 = this;
                    d.v.d r5 = (p298d.p337v.C6824d) r5
                    java.lang.String r4 = "completion"
                    p298d.p344x.p346c.C6888i.m12438e(r5, r4)
                    b.a.a.b.a$b r4 = r3.f271k
                    r5.getContext()
                    d.r r5 = p298d.C6777r.f13694a
                    p005b.p291q.p292a.C5266a.m10018q4(r5)
                    java.net.URL r5 = new java.net.URL
                    b.a.a.b.a r4 = r4.f270l
                    java.lang.String r4 = r4.f264o
                    r5.<init>(r4)
                    java.nio.charset.Charset r4 = p298d.p415c0.C7685a.f15210a
                    java.lang.String r0 = "$this$readBytes"
                    p298d.p344x.p346c.C6888i.m12438e(r5, r0)
                    java.io.InputStream r5 = r5.openStream()
                    java.lang.String r1 = "it"
                    p298d.p344x.p346c.C6888i.m12437d(r5, r1)     // Catch:{ all -> 0x0052 }
                    p298d.p344x.p346c.C6888i.m12438e(r5, r0)     // Catch:{ all -> 0x0052 }
                    java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0052 }
                    int r1 = r5.available()     // Catch:{ all -> 0x0052 }
                    r2 = 8192(0x2000, float:1.14794E-41)
                    int r1 = java.lang.Math.max(r2, r1)     // Catch:{ all -> 0x0052 }
                    r0.<init>(r1)     // Catch:{ all -> 0x0052 }
                    p005b.p291q.p292a.C5266a.m9972j0(r5, r0, r2)     // Catch:{ all -> 0x0052 }
                    byte[] r0 = r0.toByteArray()     // Catch:{ all -> 0x0052 }
                    java.lang.String r1 = "buffer.toByteArray()"
                    p298d.p344x.p346c.C6888i.m12437d(r0, r1)     // Catch:{ all -> 0x0052 }
                    r1 = 0
                    p005b.p291q.p292a.C5266a.m9877S(r5, r1)
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r4)
                    return r5
                L_0x0052:
                    r4 = move-exception
                    throw r4     // Catch:{ all -> 0x0054 }
                L_0x0054:
                    r0 = move-exception
                    p005b.p291q.p292a.C5266a.m9877S(r5, r4)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p009b.C0614a.C0617b.C0618a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0617b(C0614a aVar, C6824d dVar) {
            super(2, dVar);
            this.f270l = aVar;
        }

        /* renamed from: b */
        public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
            C6888i.m12438e(dVar, "completion");
            return new C0617b(this.f270l, dVar);
        }

        /* renamed from: e */
        public final Object mo10326e(Object obj) {
            C6833a aVar = C6833a.COROUTINE_SUSPENDED;
            int i = this.f269k;
            if (i == 0) {
                C5266a.m10018q4(obj);
                C7706c0 F = C5266a.m9800F(C7758r0.f15311g, C7725h0.f15274b, (C7823z) null, new C0618a(this, (C6824d) null), 2, (Object) null);
                this.f269k = 1;
                obj = C7716e0.m14025U((C7716e0) F, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    C5266a.m10018q4(obj);
                } catch (Exception e) {
                    C8091a.f16272d.mo26044b("Exception loading svg as webview, with url=%s -> %s", this.f270l.f264o, e.getLocalizedMessage());
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0614a aVar2 = this.f270l;
            aVar2.loadDataWithBaseURL((String) null, "<style>svg { position:fixed; top:0; left:0; height:100%; width:100% }</style>" + ((String) obj), "text/html", "UTF-8", (String) null);
            return C6777r.f13694a;
        }

        public final Object invoke(Object obj, Object obj2) {
            C6824d dVar = (C6824d) obj2;
            C6888i.m12438e(dVar, "completion");
            return new C0617b(this.f270l, dVar).mo10326e(C6777r.f13694a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0614a(Context context, List<String> list, boolean z) {
        super(context);
        C6888i.m12438e(context, BasePayload.CONTEXT_KEY);
        this.f260k = list;
        this.f259j = z;
    }

    /* renamed from: a */
    public void mo10341a(int i, int i2) {
        C8091a.f16272d.mo26043a("Progress: %s of %s", String.valueOf(i), String.valueOf(i2));
    }

    /* renamed from: b */
    public void mo10342b(Exception exc) {
        C8091a.f16272d.mo26044b("ERROR PDF: %s", String.valueOf(exc));
    }

    /* renamed from: c */
    public void mo10343c(String str, String str2) {
        C6972c cVar = new C6972c(getContext(), str.substring(str.lastIndexOf(47) + 1));
        this.f257h = cVar;
        C6969b bVar = this.f258i;
        if (bVar != null) {
            bVar.setAdapter(cVar);
            C6969b bVar2 = this.f258i;
            if (bVar2 != null) {
                addView(bVar2);
            } else {
                C6888i.m12446m("remotePDFViewPager");
                throw null;
            }
        } else {
            C6888i.m12446m("remotePDFViewPager");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0160, code lost:
        if (r7 != null) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01a7, code lost:
        if (r7 != null) goto L_0x01a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0048 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10344d() {
        /*
            r14 = this;
            com.appfoundry.previewer.model.Style r1 = r14.f261l
            int r2 = r14.f262m
            int r3 = r14.f263n
            r4 = 0
            r5 = 0
            r6 = 24
            r0 = r14
            p005b.p006a.p007a.p018i.C0758q.m243h(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = r14.f264o
            r1 = 1
            if (r0 == 0) goto L_0x002e
            java.lang.String r2 = "pdf"
            boolean r0 = p298d.p415c0.C7694h.m13924b(r0, r2, r1)
            if (r0 != r1) goto L_0x002e
            h.a.a.a.b r0 = new h.a.a.a.b
            android.content.Context r2 = r14.getContext()
            java.lang.String r3 = r14.f264o
            r0.<init>(r2, r3, r14)
            r14.f258i = r0
            r2 = 2131231132(0x7f08019c, float:1.8078336E38)
            r0.setId(r2)
        L_0x002e:
            java.lang.String r0 = r14.f264o
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x01ba
            java.lang.String r4 = "$this$parseUrlParams"
            p298d.p344x.p346c.C6888i.m12438e(r0, r4)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.String r5 = "\\$\\{(.*?)\\}"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.util.regex.Matcher r5 = r5.matcher(r0)
        L_0x0048:
            boolean r6 = r5.find()
            if (r6 == 0) goto L_0x01b0
            java.lang.String r6 = r5.group()
            java.lang.String r7 = "matcher.group()"
            p298d.p344x.p346c.C6888i.m12437d(r6, r7)
            r7 = 2
            java.lang.String r8 = r5.group()
            int r8 = r8.length()
            int r8 = r8 + -1
            java.lang.String r6 = r6.substring(r7, r8)
            java.lang.String r7 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p298d.p344x.p346c.C6888i.m12437d(r6, r7)
            int r7 = r6.hashCode()
            r8 = -1588383098(0xffffffffa1533286, float:-7.155645E-19)
            r9 = 4
            r10 = 125(0x7d, float:1.75E-43)
            java.lang.String r11 = "${"
            if (r7 == r8) goto L_0x00d4
            r8 = 25162675(0x17ff3b3, float:4.701095E-38)
            if (r7 == r8) goto L_0x00ab
            r8 = 1475083531(0x57ebfd0b, float:5.18944088E14)
            if (r7 == r8) goto L_0x0085
            goto L_0x0117
        L_0x0085:
            java.lang.String r7 = "device.platform"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0117
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            r7.append(r6)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "android"
            java.lang.String r0 = p298d.p415c0.C7694h.m13944v(r0, r7, r8, r2, r9)
            java.lang.String r7 = "platform"
            r4.put(r7, r8)
            goto L_0x0117
        L_0x00ab:
            java.lang.String r7 = "device.id"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0117
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            r7.append(r6)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = p005b.p038f.p039a.C0849e.m470B()
            java.lang.String r0 = p298d.p415c0.C7694h.m13944v(r0, r7, r8, r2, r9)
            java.lang.String r7 = p005b.p038f.p039a.C0849e.m470B()
            java.lang.String r8 = "id"
            goto L_0x0114
        L_0x00d4:
            java.lang.String r7 = "device.lang"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0117
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            r7.append(r6)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            java.util.Locale r8 = java.util.Locale.getDefault()
            java.lang.String r12 = "Locale.getDefault()"
            p298d.p344x.p346c.C6888i.m12437d(r8, r12)
            java.lang.String r8 = r8.getDisplayLanguage()
            java.lang.String r13 = "Locale.getDefault().displayLanguage"
            p298d.p344x.p346c.C6888i.m12437d(r8, r13)
            java.lang.String r0 = p298d.p415c0.C7694h.m13944v(r0, r7, r8, r2, r9)
            java.util.Locale r7 = java.util.Locale.getDefault()
            p298d.p344x.p346c.C6888i.m12437d(r7, r12)
            java.lang.String r7 = r7.getDisplayLanguage()
            p298d.p344x.p346c.C6888i.m12437d(r7, r13)
            java.lang.String r8 = "lang"
        L_0x0114:
            r4.put(r8, r7)
        L_0x0117:
            boolean r7 = p005b.p038f.p039a.C0849e.m506a0()
            if (r7 == 0) goto L_0x0048
            b.a.a.n.e r7 = p005b.p006a.p007a.p023n.C0816e.f639l
            b.p.a.l<com.appfoundry.previewer.model.BravoIdTokenResponseFromBackend> r7 = p005b.p006a.p007a.p023n.C0816e.f633f
            java.lang.String r8 = p005b.p038f.p039a.C0849e.m515f()
            java.lang.Object r7 = r7.mo16830b(r8)
            com.appfoundry.previewer.model.BravoIdTokenResponseFromBackend r7 = (com.appfoundry.previewer.model.BravoIdTokenResponseFromBackend) r7
            int r8 = r6.hashCode()
            r12 = -147180002(0xfffffffff73a361e, float:-3.7768158E33)
            java.lang.String r13 = ""
            if (r8 == r12) goto L_0x0189
            r12 = 294088398(0x11876ece, float:2.1367533E-28)
            if (r8 == r12) goto L_0x0163
            r12 = 518840249(0x1eecdfb9, float:2.5080001E-20)
            if (r8 == r12) goto L_0x0142
            goto L_0x0048
        L_0x0142:
            java.lang.String r8 = "user.email"
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x0048
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r11)
            r8.append(r6)
            r8.append(r10)
            java.lang.String r6 = r8.toString()
            if (r7 == 0) goto L_0x01aa
            java.lang.String r7 = r7.f10934b
            if (r7 == 0) goto L_0x01aa
            goto L_0x01a9
        L_0x0163:
            java.lang.String r8 = "user.name"
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x0048
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r11)
            r8.append(r6)
            r8.append(r10)
            java.lang.String r6 = r8.toString()
            if (r7 == 0) goto L_0x0184
            java.lang.String r7 = r7.f10935c
            if (r7 == 0) goto L_0x0184
            r13 = r7
        L_0x0184:
            p298d.p415c0.C7694h.m13944v(r0, r6, r13, r2, r9)
            goto L_0x0048
        L_0x0189:
            java.lang.String r8 = "user.id"
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x0048
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r11)
            r8.append(r6)
            r8.append(r10)
            java.lang.String r6 = r8.toString()
            if (r7 == 0) goto L_0x01aa
            java.lang.String r7 = r7.f10933a
            if (r7 == 0) goto L_0x01aa
        L_0x01a9:
            r13 = r7
        L_0x01aa:
            java.lang.String r0 = p298d.p415c0.C7694h.m13944v(r0, r6, r13, r2, r9)
            goto L_0x0048
        L_0x01b0:
            com.appfoundry.previewer.BravoApp$b r5 = com.appfoundry.previewer.BravoApp.f10730N
            java.lang.String r5 = "<set-?>"
            p298d.p344x.p346c.C6888i.m12438e(r4, r5)
            com.appfoundry.previewer.BravoApp.f10742r = r4
            goto L_0x01bb
        L_0x01ba:
            r0 = r3
        L_0x01bb:
            android.webkit.WebSettings r4 = r14.getSettings()
            r4.setJavaScriptEnabled(r1)
            r4.setJavaScriptCanOpenWindowsAutomatically(r1)
            r4.setLoadWithOverviewMode(r1)
            r4.setUseWideViewPort(r1)
            r4.setBuiltInZoomControls(r1)
            r4.setDomStorageEnabled(r1)
            r4.setDisplayZoomControls(r2)
            r4.setAllowFileAccess(r1)
            r4.setMediaPlaybackRequiresUserGesture(r2)
            b.a.a.b.a$a r4 = new b.a.a.b.a$a
            r4.<init>(r14)
            r14.setWebViewClient(r4)
            b.a.a.b.c r4 = new b.a.a.b.c
            android.content.Context r5 = r14.getContext()
            r4.<init>(r5)
            r14.f265p = r4
            r14.setWebChromeClient(r4)
            boolean r4 = r14.f259j
            if (r4 == 0) goto L_0x0217
            r14.setVerticalScrollBarEnabled(r2)
            r14.setHorizontalScrollBarEnabled(r2)
            l.a.o r0 = p005b.p291q.p292a.C5266a.m9959h(r3, r1, r3)
            l.a.w r1 = p416l.p417a.C7725h0.f15273a
            l.a.g1 r1 = p416l.p417a.p419u1.C7785l.f15351b
            d.v.f r0 = r1.plus(r0)
            l.a.y r4 = p005b.p291q.p292a.C5266a.m9953g(r0)
            r5 = 0
            r6 = 0
            b.a.a.b.a$b r7 = new b.a.a.b.a$b
            r7.<init>(r14, r3)
            r8 = 3
            r9 = 0
            p005b.p291q.p292a.C5266a.m9880S2(r4, r5, r6, r7, r8, r9)
            goto L_0x021a
        L_0x0217:
            r14.loadUrl(r0)
        L_0x021a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p009b.C0614a.mo10344d():void");
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onAddPictureFromAlbumEvent(C0691a aVar) {
        C6888i.m12438e(aVar, "event");
        C0620c cVar = this.f265p;
        if (cVar != null) {
            Uri[] uriArr = aVar.f397a;
            ValueCallback<Uri[]> valueCallback = cVar.f277e;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(uriArr);
                cVar.f277e = null;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f256g) {
            C8068c.m14948b().mo26012k(this);
            this.f256g = true;
        }
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onCameraPermissionGrantedEvent(C0697d dVar) {
        C6888i.m12438e(dVar, "event");
        mo10344d();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f256g) {
            C8068c.m14948b().mo26014m(this);
        }
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onFileUploadCancelledEvent(C0709j jVar) {
        ValueCallback<Uri[]> valueCallback;
        C6888i.m12438e(jVar, "event");
        C0620c cVar = this.f265p;
        if (cVar != null && (valueCallback = cVar.f277e) != null) {
            valueCallback.onReceiveValue((Object) null);
        }
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onTakePictureFinishedEvent(C0722p0 p0Var) {
        ValueCallback<Uri[]> valueCallback;
        C6888i.m12438e(p0Var, "event");
        C0620c cVar = this.f265p;
        if (cVar != null && (valueCallback = cVar.f277e) != null) {
            valueCallback.onReceiveValue(new Uri[]{Uri.parse(cVar.f278f)});
        }
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onTakeVideoFinishedEvent(C0724q0 q0Var) {
        ValueCallback<Uri[]> valueCallback;
        C6888i.m12438e(q0Var, "event");
        C0620c cVar = this.f265p;
        if (cVar != null && (valueCallback = cVar.f277e) != null) {
            valueCallback.onReceiveValue(new Uri[]{Uri.parse(cVar.f279g)});
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C6888i.m12438e(motionEvent, "event");
        if (!this.f259j) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }
}
