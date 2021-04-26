package p005b.p096l.p097a.p113c.p142g;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p129c.C1978a;
import p005b.p096l.p097a.p113c.p129c.C1983c;
import p005b.p096l.p097a.p113c.p129c.C1985e;
import p005b.p096l.p097a.p113c.p142g.p143f.C3079c;
import p005b.p096l.p097a.p113c.p142g.p144g.C3096d;

/* renamed from: b.l.a.c.g.b */
public class C3071b extends FrameLayout {

    /* renamed from: g */
    public final C3073b f5208g;

    /* renamed from: b.l.a.c.g.b$a */
    public static class C3072a implements C1983c {

        /* renamed from: a */
        public final ViewGroup f5209a;

        /* renamed from: b */
        public final C3079c f5210b;

        /* renamed from: c */
        public View f5211c;

        public C3072a(ViewGroup viewGroup, C3079c cVar) {
            this.f5210b = cVar;
            Objects.requireNonNull(viewGroup, "null reference");
            this.f5209a = viewGroup;
        }

        /* renamed from: a */
        public final void mo14030a(C3075d dVar) {
            try {
                this.f5210b.mo14041u0(new C3102i(dVar));
            } catch (RemoteException e) {
                throw new C3096d(e);
            }
        }
    }

    /* renamed from: b.l.a.c.g.b$b */
    public static class C3073b extends C1978a<C3072a> {

        /* renamed from: e */
        public final ViewGroup f5212e;

        /* renamed from: f */
        public final Context f5213f;

        /* renamed from: g */
        public C1985e<C3072a> f5214g;

        /* renamed from: h */
        public final GoogleMapOptions f5215h;

        /* renamed from: i */
        public final List<C3075d> f5216i = new ArrayList();

        public C3073b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.f5212e = viewGroup;
            this.f5213f = context;
            this.f5215h = null;
        }
    }

    public C3071b(Context context) {
        super(context);
        this.f5208g = new C3073b(this, context, (GoogleMapOptions) null);
        setClickable(true);
    }
}
