package p005b.p280p.p285b.p286a0.p288k;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p005b.p280p.p285b.p286a0.C5134i;
import p435n.C8030a0;
import p435n.C8034b0;
import p435n.C8040e;
import p435n.C8042f;
import p435n.C8043g;

/* renamed from: b.p.b.a0.k.h */
public class C5202h implements C8030a0 {

    /* renamed from: g */
    public boolean f10201g;

    /* renamed from: h */
    public final /* synthetic */ C8043g f10202h;

    /* renamed from: i */
    public final /* synthetic */ C5183b f10203i;

    /* renamed from: j */
    public final /* synthetic */ C8042f f10204j;

    public C5202h(C5199g gVar, C8043g gVar2, C5183b bVar, C8042f fVar) {
        this.f10202h = gVar2;
        this.f10203i = bVar;
        this.f10204j = fVar;
    }

    /* renamed from: T */
    public long mo17031T(C8040e eVar, long j) {
        try {
            long T = this.f10202h.mo17031T(eVar, j);
            if (T == -1) {
                if (!this.f10201g) {
                    this.f10201g = true;
                    this.f10204j.close();
                }
                return -1;
            }
            eVar.mo25946z(this.f10204j.mo25900a(), eVar.f16140h - T, T);
            this.f10204j.mo25894Q();
            return T;
        } catch (IOException e) {
            if (!this.f10201g) {
                this.f10201g = true;
                this.f10203i.mo17072b();
            }
            throw e;
        }
    }

    public void close() {
        if (!this.f10201g && !C5134i.m9460e(this, 100, TimeUnit.MILLISECONDS)) {
            this.f10201g = true;
            this.f10203i.mo17072b();
        }
        this.f10202h.close();
    }

    /* renamed from: f */
    public C8034b0 mo17035f() {
        return this.f10202h.mo17035f();
    }
}
