package p005b.p091k.p092a.p093a.p094a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.segment.analytics.integrations.BasePayload;
import com.segment.analytics.integrations.ScreenPayload;
import java.util.HashMap;
import kotlin.Metadata;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p224e.C4465k;
import p005b.p096l.p224e.p226e0.C4372s;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B\u0011\b\u0016\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\f\u0010\rR.\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R.\u0010\u001e\u001a\u0004\u0018\u00010\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u00178\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR.\u0010 \u001a\u0004\u0018\u00010\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u00178\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR.\u0010%\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0011\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R\u0018\u0010(\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00065"}, mo24462d2 = {"Lb/k/a/a/a/c;", "Landroid/webkit/WebView;", "Lb/k/a/a/a/g;", "chartOptions", "Ld/r;", "a", "(Lb/k/a/a/a/g;)V", "", "javaScriptString", "b", "(Ljava/lang/String;)V", "message", "androidMethod", "(Ljava/lang/String;)Ljava/lang/String;", "", "value", "h", "Ljava/lang/Float;", "getContentHeight", "()Ljava/lang/Float;", "setContentHeight", "(Ljava/lang/Float;)V", "contentHeight", "", "i", "Ljava/lang/Boolean;", "getChartSeriesHidden", "()Ljava/lang/Boolean;", "setChartSeriesHidden", "(Ljava/lang/Boolean;)V", "chartSeriesHidden", "j", "isClearBackgroundColor", "setClearBackgroundColor", "g", "getContentWidth", "setContentWidth", "contentWidth", "l", "Ljava/lang/String;", "optionsJson", "Lb/k/a/a/a/c$a;", "k", "Lb/k/a/a/a/c$a;", "getCallBack", "()Lb/k/a/a/a/c$a;", "setCallBack", "(Lb/k/a/a/a/c$a;)V", "callBack", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "charts_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
/* renamed from: b.k.a.a.a.c */
public final class C1574c extends WebView {

    /* renamed from: m */
    public static final /* synthetic */ int f2672m = 0;

    /* renamed from: g */
    public Float f2673g;

    /* renamed from: h */
    public Float f2674h;

    /* renamed from: i */
    public Boolean f2675i;

    /* renamed from: j */
    public Boolean f2676j;

    /* renamed from: k */
    public C1575a f2677k;

    /* renamed from: l */
    public String f2678l;

    /* renamed from: b.k.a.a.a.c$a */
    public interface C1575a {
        /* renamed from: a */
        void mo11726a(C1574c cVar);

        /* renamed from: b */
        void mo11727b(C1574c cVar, C1579f fVar);
    }

    /* renamed from: b.k.a.a.a.c$b */
    public static final class C1576b<T> implements ValueCallback<String> {

        /* renamed from: a */
        public static final C1576b f2679a = new C1576b();

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1574c(Context context) {
        super(context);
        C6888i.m12438e(context, BasePayload.CONTEXT_KEY);
        setContentWidth(Float.valueOf(420.0f));
        setContentHeight(Float.valueOf(580.0f));
        setClearBackgroundColor(Boolean.FALSE);
        WebSettings settings = getSettings();
        C6888i.m12437d(settings, "settings");
        settings.setJavaScriptEnabled(true);
        WebView.setWebContentsDebuggingEnabled(true);
        addJavascriptInterface(this, "androidObject");
    }

    /* renamed from: a */
    public final void mo11714a(C1580g gVar) {
        Boolean bool = this.f2676j;
        C6888i.m12436c(bool);
        if (bool.booleanValue()) {
            C6888i.m12436c(gVar.f2683a);
        }
        String i = new C4465k().mo16123i(gVar);
        this.f2678l = i;
        StringBuilder z = C0843a.m465z("loadTheHighChartView('", i, "','");
        z.append(this.f2673g);
        z.append("','");
        z.append(this.f2674h);
        z.append("')");
        mo11716b(z.toString());
    }

    @JavascriptInterface
    public final String androidMethod(String str) {
        Object c = new C4465k().mo16117c(str, new HashMap().getClass());
        C6888i.m12437d(c, "Gson().fromJson(message, messageBody.javaClass)");
        HashMap hashMap = (HashMap) c;
        C1579f fVar = new C1579f();
        String.valueOf(hashMap.get("name"));
        Double d = (Double) hashMap.get("x");
        Double d2 = (Double) hashMap.get("y");
        String.valueOf(hashMap.get(ScreenPayload.CATEGORY_KEY));
        C4372s sVar = (C4372s) hashMap.get("offset");
        Double d3 = (Double) hashMap.get("index");
        if (d3 != null) {
            d3.doubleValue();
        }
        C1575a aVar = this.f2677k;
        if (aVar == null) {
            return "";
        }
        aVar.mo11727b(this, fVar);
        return "";
    }

    /* renamed from: b */
    public final void mo11716b(String str) {
        evaluateJavascript(C0843a.m451l("javascript:", str), C1576b.f2679a);
    }

    public final C1575a getCallBack() {
        return this.f2677k;
    }

    public final Boolean getChartSeriesHidden() {
        return this.f2675i;
    }

    public final Float getContentHeight() {
        return this.f2674h;
    }

    public final Float getContentWidth() {
        return this.f2673g;
    }

    public final void setCallBack(C1575a aVar) {
        this.f2677k = aVar;
    }

    public final void setChartSeriesHidden(Boolean bool) {
        this.f2675i = bool;
        StringBuilder u = C0843a.m460u("setChartSeriesHidden('");
        u.append(this.f2675i);
        u.append("')");
        mo11716b(u.toString());
    }

    public final void setClearBackgroundColor(Boolean bool) {
        this.f2676j = bool;
        if (C6888i.m12434a(bool, Boolean.TRUE)) {
            setBackgroundColor(0);
            Drawable background = getBackground();
            if (background != null) {
                background.setAlpha(0);
                return;
            }
            return;
        }
        setBackgroundColor(1);
        Drawable background2 = getBackground();
        if (background2 != null) {
            background2.setAlpha(255);
        }
    }

    public final void setContentHeight(Float f) {
        this.f2674h = f;
        StringBuilder u = C0843a.m460u("setTheChartViewContentHeight('");
        u.append(this.f2674h);
        u.append("')");
        mo11716b(u.toString());
    }

    public final void setContentWidth(Float f) {
        this.f2673g = f;
        StringBuilder u = C0843a.m460u("setTheChartViewContentWidth('");
        u.append(this.f2673g);
        u.append("')");
        mo11716b(u.toString());
    }
}
