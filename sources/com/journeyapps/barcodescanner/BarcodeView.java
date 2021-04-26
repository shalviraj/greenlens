package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4577e;
import p005b.p096l.p232f.C4617k;
import p005b.p265m.p266a.C4698a;
import p005b.p265m.p266a.C4701d;
import p005b.p265m.p266a.C4716g;
import p005b.p265m.p266a.C4717h;
import p005b.p265m.p266a.C4718i;
import p005b.p265m.p266a.C4719j;
import p005b.p265m.p266a.C4722k;
import p005b.p265m.p266a.C4723l;
import p005b.p265m.p266a.C4724m;

public class BarcodeView extends C4701d {

    /* renamed from: H */
    public C5771b f11455H = C5771b.NONE;

    /* renamed from: I */
    public C4698a f11456I = null;

    /* renamed from: J */
    public C4719j f11457J;

    /* renamed from: K */
    public C4717h f11458K;

    /* renamed from: L */
    public Handler f11459L;

    /* renamed from: M */
    public final Handler.Callback f11460M;

    /* renamed from: com.journeyapps.barcodescanner.BarcodeView$a */
    public class C5770a implements Handler.Callback {
        public C5770a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            r1 = r4.f11461a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean handleMessage(android.os.Message r5) {
            /*
                r4 = this;
                com.journeyapps.barcodescanner.BarcodeView$b r0 = com.journeyapps.barcodescanner.BarcodeView.C5771b.NONE
                int r1 = r5.what
                r2 = 1
                r3 = 2131231312(0x7f080250, float:1.8078701E38)
                if (r1 != r3) goto L_0x002e
                java.lang.Object r5 = r5.obj
                b.m.a.b r5 = (p005b.p265m.p266a.C4699b) r5
                if (r5 == 0) goto L_0x002d
                com.journeyapps.barcodescanner.BarcodeView r1 = com.journeyapps.barcodescanner.BarcodeView.this
                b.m.a.a r3 = r1.f11456I
                if (r3 == 0) goto L_0x002d
                com.journeyapps.barcodescanner.BarcodeView$b r1 = r1.f11455H
                if (r1 == r0) goto L_0x002d
                r3.mo16395a(r5)
                com.journeyapps.barcodescanner.BarcodeView r5 = com.journeyapps.barcodescanner.BarcodeView.this
                com.journeyapps.barcodescanner.BarcodeView$b r1 = r5.f11455H
                com.journeyapps.barcodescanner.BarcodeView$b r3 = com.journeyapps.barcodescanner.BarcodeView.C5771b.SINGLE
                if (r1 != r3) goto L_0x002d
                r5.f11455H = r0
                r0 = 0
                r5.f11456I = r0
                r5.mo22195k()
            L_0x002d:
                return r2
            L_0x002e:
                r3 = 2131231311(0x7f08024f, float:1.80787E38)
                if (r1 != r3) goto L_0x0034
                return r2
            L_0x0034:
                r3 = 2131231313(0x7f080251, float:1.8078703E38)
                if (r1 != r3) goto L_0x004b
                java.lang.Object r5 = r5.obj
                java.util.List r5 = (java.util.List) r5
                com.journeyapps.barcodescanner.BarcodeView r1 = com.journeyapps.barcodescanner.BarcodeView.this
                b.m.a.a r3 = r1.f11456I
                if (r3 == 0) goto L_0x004a
                com.journeyapps.barcodescanner.BarcodeView$b r1 = r1.f11455H
                if (r1 == r0) goto L_0x004a
                r3.mo16396b(r5)
            L_0x004a:
                return r2
            L_0x004b:
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.BarcodeView.C5770a.handleMessage(android.os.Message):boolean");
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.BarcodeView$b */
    public enum C5771b {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5770a aVar = new C5770a();
        this.f11460M = aVar;
        this.f11458K = new C4722k();
        this.f11459L = new Handler(aVar);
    }

    /* renamed from: d */
    public void mo16404d() {
        mo22195k();
        super.mo16404d();
    }

    /* renamed from: e */
    public void mo16405e() {
        mo22194j();
    }

    public C4717h getDecoderFactory() {
        return this.f11458K;
    }

    /* renamed from: i */
    public final C4716g mo22193i() {
        if (this.f11458K == null) {
            this.f11458K = new C4722k();
        }
        C4718i iVar = new C4718i();
        HashMap hashMap = new HashMap();
        hashMap.put(C4577e.NEED_RESULT_POINT_CALLBACK, iVar);
        C4722k kVar = (C4722k) this.f11458K;
        Objects.requireNonNull(kVar);
        EnumMap enumMap = new EnumMap(C4577e.class);
        enumMap.putAll(hashMap);
        Map<C4577e, ?> map = kVar.f9017b;
        if (map != null) {
            enumMap.putAll(map);
        }
        Collection<C4484a> collection = kVar.f9016a;
        if (collection != null) {
            enumMap.put(C4577e.POSSIBLE_FORMATS, collection);
        }
        String str = kVar.f9018c;
        if (str != null) {
            enumMap.put(C4577e.CHARACTER_SET, str);
        }
        C4617k kVar2 = new C4617k();
        kVar2.mo16280e(enumMap);
        int i = kVar.f9019d;
        C4716g gVar = i != 0 ? i != 1 ? i != 2 ? new C4716g(kVar2) : new C4724m(kVar2) : new C4723l(kVar2) : new C4716g(kVar2);
        iVar.f9002a = gVar;
        return gVar;
    }

    /* renamed from: j */
    public final void mo22194j() {
        mo22195k();
        if (this.f11455H != C5771b.NONE && this.f8960m) {
            C4719j jVar = new C4719j(getCameraInstance(), mo22193i(), this.f11459L);
            this.f11457J = jVar;
            jVar.f9009f = getPreviewFramingRect();
            C4719j jVar2 = this.f11457J;
            Objects.requireNonNull(jVar2);
            C1960d.m2750S0();
            HandlerThread handlerThread = new HandlerThread(C4719j.f9003k);
            jVar2.f9005b = handlerThread;
            handlerThread.start();
            jVar2.f9006c = new Handler(jVar2.f9005b.getLooper(), jVar2.f9012i);
            jVar2.f9010g = true;
            jVar2.mo16448a();
        }
    }

    /* renamed from: k */
    public final void mo22195k() {
        C4719j jVar = this.f11457J;
        if (jVar != null) {
            Objects.requireNonNull(jVar);
            C1960d.m2750S0();
            synchronized (jVar.f9011h) {
                jVar.f9010g = false;
                jVar.f9006c.removeCallbacksAndMessages((Object) null);
                jVar.f9005b.quit();
            }
            this.f11457J = null;
        }
    }

    public void setDecoderFactory(C4717h hVar) {
        C1960d.m2750S0();
        this.f11458K = hVar;
        C4719j jVar = this.f11457J;
        if (jVar != null) {
            jVar.f9007d = mo22193i();
        }
    }
}
