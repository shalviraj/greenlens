package p005b.p006a.p007a.p023n;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import java.util.Hashtable;
import p005b.p038f.p039a.C0849e;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.n.a */
public final class C0801a {

    /* renamed from: a */
    public static final Hashtable<String, Typeface> f596a = new Hashtable<>();

    /* renamed from: b */
    public static final C0801a f597b = new C0801a();

    /* renamed from: a */
    public static Typeface m267a(C0801a aVar, String str, int i, int i2) {
        Typeface typeface;
        StringBuilder sb;
        AssetManager assetManager;
        int i3 = i2 & 2;
        boolean z = false;
        if (i3 != 0) {
            i = 0;
        }
        Hashtable<String, Typeface> hashtable = f596a;
        Typeface typeface2 = hashtable.get(str);
        if (typeface2 == null) {
            if (str != null) {
                try {
                    if (C6888i.m12434a(str, "01DZ4603S1A99S0MKRX805Z15F") || C6888i.m12434a(str, "01DZ4603RX0X7SJMZFXAMWZQ4T")) {
                        z = true;
                    }
                } catch (Exception unused) {
                    return null;
                }
            }
            if (z) {
                Context a = C0849e.m505a();
                C6888i.m12437d(a, "appContext()");
                assetManager = a.getAssets();
                sb = new StringBuilder();
                sb.append("fonts/");
                sb.append(str);
                sb.append(".otf");
            } else if (i == 1) {
                Context a2 = C0849e.m505a();
                C6888i.m12437d(a2, "appContext()");
                assetManager = a2.getAssets();
                sb = new StringBuilder();
                sb.append("fonts/");
                sb.append(str);
            } else {
                typeface = Typeface.createFromFile(C0849e.m472C() + str);
                typeface2 = typeface;
                hashtable.put(str, typeface2);
            }
            typeface = Typeface.createFromAsset(assetManager, sb.toString());
            typeface2 = typeface;
            hashtable.put(str, typeface2);
        }
        return typeface2;
    }

    /* renamed from: b */
    public final Typeface mo10628b(String str) {
        C6888i.m12438e(str, "fontName");
        Hashtable<String, Typeface> hashtable = f596a;
        Typeface typeface = hashtable.get(str);
        if (typeface == null) {
            try {
                Context a = C0849e.m505a();
                C6888i.m12437d(a, "appContext()");
                AssetManager assets = a.getAssets();
                typeface = Typeface.createFromAsset(assets, "fonts/" + str + ".otf");
                hashtable.put(str, typeface);
            } catch (Exception unused) {
                return null;
            }
        }
        return typeface;
    }
}
