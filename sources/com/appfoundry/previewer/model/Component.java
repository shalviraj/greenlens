package com.appfoundry.previewer.model;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0004R\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR!\u0010%\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00102\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0013\u001a\u0004\b/\u0010\u0004\"\u0004\b0\u00101R\u001b\u00105\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010\u0013\u001a\u0004\b4\u0010\u0004R$\u0010=\u001a\u0004\u0018\u0001068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001b\u0010@\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010\u0013\u001a\u0004\b?\u0010\u0004R\u001b\u0010C\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bA\u0010\u0013\u001a\u0004\bB\u0010\u0004R$\u0010G\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bD\u0010\u0013\u001a\u0004\bE\u0010\u0004\"\u0004\bF\u00101R\u001b\u0010J\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010\u0013\u001a\u0004\bI\u0010\u0004R\u001b\u0010M\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bK\u0010\u0013\u001a\u0004\bL\u0010\u0004R$\u0010T\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010\\\u001a\u0004\u0018\u00010U8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001b\u0010_\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b]\u0010\u0013\u001a\u0004\b^\u0010\u0004R\u001b\u0010b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b`\u0010\u0013\u001a\u0004\ba\u0010\u0004R*\u0010h\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bd\u0010\"\u001a\u0004\be\u0010$\"\u0004\bf\u0010gR$\u0010l\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bi\u0010\u0013\u001a\u0004\bj\u0010\u0004\"\u0004\bk\u00101R\u001b\u0010o\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bm\u0010\u0013\u001a\u0004\bn\u0010\u0004R!\u0010r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010c8\u0006@\u0006¢\u0006\f\n\u0004\bp\u0010\"\u001a\u0004\bq\u0010$R$\u0010v\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bs\u0010\u0013\u001a\u0004\bt\u0010\u0004\"\u0004\bu\u00101R\u001b\u0010y\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bw\u0010\u0013\u001a\u0004\bx\u0010\u0004¨\u0006z"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/Component;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/appfoundry/previewer/model/Actions;", "k", "Lcom/appfoundry/previewer/model/Actions;", "getActions", "()Lcom/appfoundry/previewer/model/Actions;", "actions", "p", "Ljava/lang/String;", "getAnchor", "anchor", "a", "getId", "id", "Lcom/appfoundry/previewer/model/States;", "l", "Lcom/appfoundry/previewer/model/States;", "getStates", "()Lcom/appfoundry/previewer/model/States;", "states", "", "Lcom/appfoundry/previewer/model/RichText;", "q", "Ljava/util/List;", "getRichText", "()Ljava/util/List;", "richText", "Landroid/view/View;", "x", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "view", "w", "getCurrentState", "setCurrentState", "(Ljava/lang/String;)V", "currentState", "u", "getNodeId", "nodeId", "Lcom/appfoundry/previewer/model/Params;", "j", "Lcom/appfoundry/previewer/model/Params;", "getParams", "()Lcom/appfoundry/previewer/model/Params;", "setParams", "(Lcom/appfoundry/previewer/model/Params;)V", "params", "n", "getHrefRemote", "hrefRemote", "r", "getFormat", "format", "g", "getIconUrl", "setIconUrl", "iconUrl", "s", "getInitialState", "initialState", "o", "getValue", "value", "h", "Ljava/lang/Integer;", "getResId", "()Ljava/lang/Integer;", "setResId", "(Ljava/lang/Integer;)V", "resId", "Lcom/appfoundry/previewer/model/Text;", "c", "Lcom/appfoundry/previewer/model/Text;", "getText", "()Lcom/appfoundry/previewer/model/Text;", "setText", "(Lcom/appfoundry/previewer/model/Text;)V", "text", "e", "getHref", "href", "t", "getName", "name", "", "m", "getComponents", "setComponents", "(Ljava/util/List;)V", "components", "v", "getContainerId", "setContainerId", "containerId", "d", "getStyleId", "styleId", "i", "getTags", "tags", "b", "getType", "setType", "type", "f", "getAssetId", "assetId", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class Component {

    /* renamed from: a */
    public final String f10939a;

    /* renamed from: b */
    public String f10940b;

    /* renamed from: c */
    public Text f10941c;

    /* renamed from: d */
    public final String f10942d;

    /* renamed from: e */
    public final String f10943e;

    /* renamed from: f */
    public final String f10944f;

    /* renamed from: g */
    public transient String f10945g;

    /* renamed from: h */
    public transient Integer f10946h;

    /* renamed from: i */
    public final List<String> f10947i;

    /* renamed from: j */
    public Params f10948j;

    /* renamed from: k */
    public final Actions f10949k;

    /* renamed from: l */
    public final States f10950l;

    /* renamed from: m */
    public List<Component> f10951m;

    /* renamed from: n */
    public final String f10952n;

    /* renamed from: o */
    public final String f10953o;

    /* renamed from: p */
    public final String f10954p;

    /* renamed from: q */
    public final List<RichText> f10955q;

    /* renamed from: r */
    public final String f10956r;

    /* renamed from: s */
    public final String f10957s;

    /* renamed from: t */
    public final String f10958t;

    /* renamed from: u */
    public final String f10959u;

    /* renamed from: v */
    public transient String f10960v;

    /* renamed from: w */
    public transient String f10961w;

    /* renamed from: x */
    public transient View f10962x;

    public Component(String str, String str2, Text text, String str3, String str4, String str5, String str6, Integer num, List list, Params params, Actions actions, States states, List list2, String str7, String str8, String str9, List list3, String str10, String str11, String str12, String str13, String str14, String str15, View view, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        View view2 = null;
        String str16 = (i2 & 64) != 0 ? null : str6;
        Integer num2 = (i2 & 128) != 0 ? null : num;
        String str17 = (2097152 & i2) != 0 ? null : str14;
        String str18 = (4194304 & i2) != 0 ? null : str15;
        view2 = (i2 & 8388608) == 0 ? view : view2;
        this.f10939a = str;
        this.f10940b = str2;
        this.f10941c = text;
        this.f10942d = str3;
        this.f10943e = str4;
        this.f10944f = str5;
        this.f10945g = str16;
        this.f10946h = num2;
        this.f10947i = list;
        this.f10948j = params;
        this.f10949k = actions;
        this.f10950l = states;
        this.f10951m = list2;
        this.f10952n = str7;
        this.f10953o = str8;
        this.f10954p = str9;
        this.f10955q = list3;
        this.f10956r = str10;
        this.f10957s = str11;
        this.f10958t = str12;
        this.f10959u = str13;
        this.f10960v = str17;
        this.f10961w = str18;
        this.f10962x = view2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Component)) {
            return false;
        }
        Component component = (Component) obj;
        return C6888i.m12434a(this.f10939a, component.f10939a) && C6888i.m12434a(this.f10940b, component.f10940b) && C6888i.m12434a(this.f10941c, component.f10941c) && C6888i.m12434a(this.f10942d, component.f10942d) && C6888i.m12434a(this.f10943e, component.f10943e) && C6888i.m12434a(this.f10944f, component.f10944f) && C6888i.m12434a(this.f10945g, component.f10945g) && C6888i.m12434a(this.f10946h, component.f10946h) && C6888i.m12434a(this.f10947i, component.f10947i) && C6888i.m12434a(this.f10948j, component.f10948j) && C6888i.m12434a(this.f10949k, component.f10949k) && C6888i.m12434a(this.f10950l, component.f10950l) && C6888i.m12434a(this.f10951m, component.f10951m) && C6888i.m12434a(this.f10952n, component.f10952n) && C6888i.m12434a(this.f10953o, component.f10953o) && C6888i.m12434a(this.f10954p, component.f10954p) && C6888i.m12434a(this.f10955q, component.f10955q) && C6888i.m12434a(this.f10956r, component.f10956r) && C6888i.m12434a(this.f10957s, component.f10957s) && C6888i.m12434a(this.f10958t, component.f10958t) && C6888i.m12434a(this.f10959u, component.f10959u) && C6888i.m12434a(this.f10960v, component.f10960v) && C6888i.m12434a(this.f10961w, component.f10961w) && C6888i.m12434a(this.f10962x, component.f10962x);
    }

    public int hashCode() {
        String str = this.f10939a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10940b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Text text = this.f10941c;
        int hashCode3 = (hashCode2 + (text != null ? text.hashCode() : 0)) * 31;
        String str3 = this.f10942d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f10943e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f10944f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f10945g;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num = this.f10946h;
        int hashCode8 = (hashCode7 + (num != null ? num.hashCode() : 0)) * 31;
        List<String> list = this.f10947i;
        int hashCode9 = (hashCode8 + (list != null ? list.hashCode() : 0)) * 31;
        Params params = this.f10948j;
        int hashCode10 = (hashCode9 + (params != null ? params.hashCode() : 0)) * 31;
        Actions actions = this.f10949k;
        int hashCode11 = (hashCode10 + (actions != null ? actions.hashCode() : 0)) * 31;
        States states = this.f10950l;
        int hashCode12 = (hashCode11 + (states != null ? states.hashCode() : 0)) * 31;
        List<Component> list2 = this.f10951m;
        int hashCode13 = (hashCode12 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str7 = this.f10952n;
        int hashCode14 = (hashCode13 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f10953o;
        int hashCode15 = (hashCode14 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f10954p;
        int hashCode16 = (hashCode15 + (str9 != null ? str9.hashCode() : 0)) * 31;
        List<RichText> list3 = this.f10955q;
        int hashCode17 = (hashCode16 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str10 = this.f10956r;
        int hashCode18 = (hashCode17 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f10957s;
        int hashCode19 = (hashCode18 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f10958t;
        int hashCode20 = (hashCode19 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.f10959u;
        int hashCode21 = (hashCode20 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.f10960v;
        int hashCode22 = (hashCode21 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.f10961w;
        int hashCode23 = (hashCode22 + (str15 != null ? str15.hashCode() : 0)) * 31;
        View view = this.f10962x;
        if (view != null) {
            i = view.hashCode();
        }
        return hashCode23 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Component(id=");
        u.append(this.f10939a);
        u.append(", type=");
        u.append(this.f10940b);
        u.append(", text=");
        u.append(this.f10941c);
        u.append(", styleId=");
        u.append(this.f10942d);
        u.append(", href=");
        u.append(this.f10943e);
        u.append(", assetId=");
        u.append(this.f10944f);
        u.append(", iconUrl=");
        u.append(this.f10945g);
        u.append(", resId=");
        u.append(this.f10946h);
        u.append(", tags=");
        u.append(this.f10947i);
        u.append(", params=");
        u.append(this.f10948j);
        u.append(", actions=");
        u.append(this.f10949k);
        u.append(", states=");
        u.append(this.f10950l);
        u.append(", components=");
        u.append(this.f10951m);
        u.append(", hrefRemote=");
        u.append(this.f10952n);
        u.append(", value=");
        u.append(this.f10953o);
        u.append(", anchor=");
        u.append(this.f10954p);
        u.append(", richText=");
        u.append(this.f10955q);
        u.append(", format=");
        u.append(this.f10956r);
        u.append(", initialState=");
        u.append(this.f10957s);
        u.append(", name=");
        u.append(this.f10958t);
        u.append(", nodeId=");
        u.append(this.f10959u);
        u.append(", containerId=");
        u.append(this.f10960v);
        u.append(", currentState=");
        u.append(this.f10961w);
        u.append(", view=");
        u.append(this.f10962x);
        u.append(")");
        return u.toString();
    }
}
