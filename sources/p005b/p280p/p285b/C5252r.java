package p005b.p280p.p285b;

import androidx.appcompat.widget.ActivityChooserView;
import java.lang.ref.WeakReference;
import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p005b.p280p.p285b.p286a0.C5123b;
import p005b.p280p.p285b.p286a0.C5124c;
import p005b.p280p.p285b.p286a0.C5132g;
import p005b.p280p.p285b.p286a0.C5134i;
import p005b.p280p.p285b.p286a0.p287j.C5139d;
import p005b.p280p.p285b.p286a0.p287j.C5177t;
import p005b.p280p.p285b.p286a0.p288k.C5211p;
import p005b.p280p.p285b.p286a0.p289l.C5212a;

/* renamed from: b.p.b.r */
public class C5252r implements Cloneable {

    /* renamed from: D */
    public static final List<C5254s> f10447D = C5134i.m9464i(C5254s.HTTP_2, C5254s.SPDY_3, C5254s.HTTP_1_1);

    /* renamed from: E */
    public static final List<C5235j> f10448E = C5134i.m9464i(C5235j.f10399f, C5235j.f10400g, C5235j.f10401h);

    /* renamed from: F */
    public static SSLSocketFactory f10449F;

    /* renamed from: A */
    public int f10450A;

    /* renamed from: B */
    public int f10451B;

    /* renamed from: C */
    public int f10452C;

    /* renamed from: g */
    public final C5132g f10453g;

    /* renamed from: h */
    public C5238k f10454h;

    /* renamed from: i */
    public Proxy f10455i;

    /* renamed from: j */
    public List<C5254s> f10456j;

    /* renamed from: k */
    public List<C5235j> f10457k;

    /* renamed from: l */
    public final List<C5249p> f10458l;

    /* renamed from: m */
    public final List<C5249p> f10459m;

    /* renamed from: n */
    public ProxySelector f10460n;

    /* renamed from: o */
    public CookieHandler f10461o;

    /* renamed from: p */
    public C5124c f10462p;

    /* renamed from: q */
    public SocketFactory f10463q;

    /* renamed from: r */
    public SSLSocketFactory f10464r;

    /* renamed from: s */
    public HostnameVerifier f10465s;

    /* renamed from: t */
    public C5228f f10466t;

    /* renamed from: u */
    public C5219b f10467u;

    /* renamed from: v */
    public C5233i f10468v;

    /* renamed from: w */
    public C5239l f10469w;

    /* renamed from: x */
    public boolean f10470x;

    /* renamed from: y */
    public boolean f10471y;

    /* renamed from: z */
    public boolean f10472z;

    /* renamed from: b.p.b.r$a */
    public static class C5253a extends C5123b {
        /* renamed from: a */
        public C5212a mo16967a(C5233i iVar, C5121a aVar, C5211p pVar) {
            int i;
            for (C5212a next : iVar.f10395e) {
                int size = next.f10245j.size();
                C5139d dVar = next.f10241f;
                if (dVar != null) {
                    synchronized (dVar) {
                        C5177t tVar = dVar.f9992t;
                        i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                        if ((tVar.f10120a & 16) != 0) {
                            i = tVar.f10123d[4];
                        }
                    }
                } else {
                    i = 1;
                }
                if (size < i && aVar.equals(next.f10236a.f10517a) && !next.f10246k) {
                    next.f10245j.add(new WeakReference(pVar));
                    return next;
                }
            }
            return null;
        }
    }

    static {
        C5123b.f9930b = new C5253a();
    }

    public C5252r() {
        this.f10458l = new ArrayList();
        this.f10459m = new ArrayList();
        this.f10470x = true;
        this.f10471y = true;
        this.f10472z = true;
        this.f10450A = 10000;
        this.f10451B = 10000;
        this.f10452C = 10000;
        this.f10453g = new C5132g();
        this.f10454h = new C5238k();
    }

    public C5252r(C5252r rVar) {
        ArrayList arrayList = new ArrayList();
        this.f10458l = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f10459m = arrayList2;
        this.f10470x = true;
        this.f10471y = true;
        this.f10472z = true;
        this.f10450A = 10000;
        this.f10451B = 10000;
        this.f10452C = 10000;
        this.f10453g = rVar.f10453g;
        this.f10454h = rVar.f10454h;
        this.f10455i = rVar.f10455i;
        this.f10456j = rVar.f10456j;
        this.f10457k = rVar.f10457k;
        arrayList.addAll(rVar.f10458l);
        arrayList2.addAll(rVar.f10459m);
        this.f10460n = rVar.f10460n;
        this.f10461o = rVar.f10461o;
        this.f10462p = rVar.f10462p;
        this.f10463q = rVar.f10463q;
        this.f10464r = rVar.f10464r;
        this.f10465s = rVar.f10465s;
        this.f10466t = rVar.f10466t;
        this.f10467u = rVar.f10467u;
        this.f10468v = rVar.f10468v;
        this.f10469w = rVar.f10469w;
        this.f10470x = rVar.f10470x;
        this.f10471y = rVar.f10471y;
        this.f10472z = rVar.f10472z;
        this.f10450A = rVar.f10450A;
        this.f10451B = rVar.f10451B;
        this.f10452C = rVar.f10452C;
    }

    public Object clone() {
        return new C5252r(this);
    }
}
