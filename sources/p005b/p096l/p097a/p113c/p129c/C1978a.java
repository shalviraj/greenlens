package p005b.p096l.p097a.p113c.p129c;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.LinkedList;
import p005b.p096l.p097a.p113c.p119b.C1760e;
import p005b.p096l.p097a.p113c.p119b.C1765g;
import p005b.p096l.p097a.p113c.p119b.p122m.C1909e;
import p005b.p096l.p097a.p113c.p129c.C1983c;
import p005b.p096l.p097a.p113c.p142g.C3071b;
import p005b.p096l.p097a.p113c.p142g.C3074c;
import p005b.p096l.p097a.p113c.p142g.C3075d;
import p005b.p096l.p097a.p113c.p142g.p143f.C3079c;
import p005b.p096l.p097a.p113c.p142g.p143f.C3088l;
import p005b.p096l.p097a.p113c.p142g.p144g.C3096d;

/* renamed from: b.l.a.c.c.a */
public abstract class C1978a<T extends C1983c> {

    /* renamed from: a */
    public T f3544a;

    /* renamed from: b */
    public Bundle f3545b;

    /* renamed from: c */
    public LinkedList<C1979a> f3546c;

    /* renamed from: d */
    public final C1985e<T> f3547d = new C1986f(this);

    /* renamed from: b.l.a.c.c.a$a */
    public interface C1979a {
        /* renamed from: a */
        void mo12305a(C1983c cVar);
    }

    /* renamed from: a */
    public static void m2896a(FrameLayout frameLayout) {
        Object obj = C1760e.f3107c;
        C1760e eVar = C1760e.f3108d;
        Context context = frameLayout.getContext();
        int d = eVar.mo12006d(context);
        String c = C1909e.m2634c(context, d);
        String b = C1909e.m2633b(context, d);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c);
        linearLayout.addView(textView);
        Intent a = eVar.mo12003a(context, d, (String) null);
        if (a != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(b);
            linearLayout.addView(button);
            button.setOnClickListener(new C1988h(context, a));
        }
    }

    /* renamed from: b */
    public final void mo12304b(Bundle bundle, C1979a aVar) {
        T t = this.f3544a;
        if (t != null) {
            aVar.mo12305a(t);
            return;
        }
        if (this.f3546c == null) {
            this.f3546c = new LinkedList<>();
        }
        this.f3546c.add(aVar);
        if (bundle != null) {
            Bundle bundle2 = this.f3545b;
            if (bundle2 == null) {
                this.f3545b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        C1985e<T> eVar = this.f3547d;
        C3071b.C3073b bVar = (C3071b.C3073b) this;
        bVar.f5214g = eVar;
        if (eVar != null && bVar.f3544a == null) {
            try {
                C3074c.m5756a(bVar.f5213f);
                C3079c s0 = C3088l.m5777a(bVar.f5213f).mo14045s0(new C1984d(bVar.f5213f), bVar.f5215h);
                if (s0 != null) {
                    ((C1986f) bVar.f5214g).mo12306a(new C3071b.C3072a(bVar.f5212e, s0));
                    for (C3075d a : bVar.f5216i) {
                        ((C3071b.C3072a) bVar.f3544a).mo14030a(a);
                    }
                    bVar.f5216i.clear();
                }
            } catch (RemoteException e) {
                throw new C3096d(e);
            } catch (C1765g unused) {
            }
        }
    }
}
