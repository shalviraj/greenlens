package p005b.p006a.p007a.p018i;

import android.view.View;
import com.appfoundry.previewer.model.Component;
import p005b.p006a.p007a.p019j.C0772c;

/* renamed from: b.a.a.i.f */
public final class C0747f implements View.OnTouchListener {

    /* renamed from: g */
    public final /* synthetic */ Component f462g;

    /* renamed from: h */
    public final /* synthetic */ Component f463h;

    /* renamed from: i */
    public final /* synthetic */ String f464i;

    /* renamed from: j */
    public final /* synthetic */ String f465j;

    /* renamed from: k */
    public final /* synthetic */ C0772c f466k;

    public C0747f(Component component, Component component2, String str, String str2, C0772c cVar) {
        this.f462g = component;
        this.f463h = component2;
        this.f464i = str;
        this.f465j = str2;
        this.f466k = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009f, code lost:
        r2 = r2.f11113c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            r12 = this;
            java.lang.String r13 = "event"
            p298d.p344x.p346c.C6888i.m12437d(r14, r13)
            int r13 = r14.getActionMasked()
            r0 = 1
            if (r13 != 0) goto L_0x0083
            com.appfoundry.previewer.BravoApp$b r13 = com.appfoundry.previewer.BravoApp.f10730N
            com.appfoundry.previewer.BravoApp.f10721E = r0
            com.appfoundry.previewer.model.Component r13 = r12.f463h
            java.lang.String r14 = "$this$showPressedOnly"
            p298d.p344x.p346c.C6888i.m12438e(r13, r14)
            com.appfoundry.previewer.model.States r14 = r13.f10950l
            if (r14 == 0) goto L_0x003b
            com.appfoundry.previewer.model.Component r14 = r14.f11112b
            if (r14 == 0) goto L_0x003b
            java.util.List<com.appfoundry.previewer.model.Component> r14 = r14.f10951m
            if (r14 == 0) goto L_0x003b
            java.util.Iterator r14 = r14.iterator()
        L_0x0027:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r14.next()
            com.appfoundry.previewer.model.Component r1 = (com.appfoundry.previewer.model.Component) r1
            android.view.View r1 = r1.f10962x
            if (r1 == 0) goto L_0x0027
            p005b.p006a.p007a.p018i.C0758q.m247l(r1)
            goto L_0x0027
        L_0x003b:
            com.appfoundry.previewer.model.States r14 = r13.f10950l
            if (r14 == 0) goto L_0x005f
            com.appfoundry.previewer.model.Component r14 = r14.f11113c
            if (r14 == 0) goto L_0x005f
            java.util.List<com.appfoundry.previewer.model.Component> r14 = r14.f10951m
            if (r14 == 0) goto L_0x005f
            java.util.Iterator r14 = r14.iterator()
        L_0x004b:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r14.next()
            com.appfoundry.previewer.model.Component r1 = (com.appfoundry.previewer.model.Component) r1
            android.view.View r1 = r1.f10962x
            if (r1 == 0) goto L_0x004b
            p005b.p006a.p007a.p018i.C0758q.m240e(r1)
            goto L_0x004b
        L_0x005f:
            com.appfoundry.previewer.model.States r13 = r13.f10950l
            if (r13 == 0) goto L_0x01f9
            com.appfoundry.previewer.model.Component r13 = r13.f11111a
            if (r13 == 0) goto L_0x01f9
            java.util.List<com.appfoundry.previewer.model.Component> r13 = r13.f10951m
            if (r13 == 0) goto L_0x01f9
            java.util.Iterator r13 = r13.iterator()
        L_0x006f:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x01f9
            java.lang.Object r14 = r13.next()
            com.appfoundry.previewer.model.Component r14 = (com.appfoundry.previewer.model.Component) r14
            android.view.View r14 = r14.f10962x
            if (r14 == 0) goto L_0x006f
            p005b.p006a.p007a.p018i.C0758q.m240e(r14)
            goto L_0x006f
        L_0x0083:
            int r13 = r14.getActionMasked()
            r1 = 0
            if (r13 == r0) goto L_0x0098
            int r13 = r14.getActionMasked()
            r2 = 3
            if (r13 != r2) goto L_0x0092
            goto L_0x0098
        L_0x0092:
            com.appfoundry.previewer.BravoApp$b r13 = com.appfoundry.previewer.BravoApp.f10730N
            com.appfoundry.previewer.BravoApp.f10721E = r1
            goto L_0x01f9
        L_0x0098:
            com.appfoundry.previewer.model.Component r13 = r12.f463h
            com.appfoundry.previewer.model.States r2 = r13.f10950l
            r3 = 0
            if (r2 == 0) goto L_0x00a6
            com.appfoundry.previewer.model.Component r2 = r2.f11113c
            if (r2 == 0) goto L_0x00a6
            java.util.List<com.appfoundry.previewer.model.Component> r2 = r2.f10951m
            goto L_0x00a7
        L_0x00a6:
            r2 = r3
        L_0x00a7:
            if (r2 == 0) goto L_0x00ab
            r2 = r0
            goto L_0x00ac
        L_0x00ab:
            r2 = r1
        L_0x00ac:
            com.appfoundry.previewer.BravoApp$b r4 = com.appfoundry.previewer.BravoApp.f10730N
            com.appfoundry.previewer.BravoApp.f10721E = r1
            java.lang.String r13 = r13.f10961w
            java.lang.String r4 = "default"
            boolean r13 = p298d.p344x.p346c.C6888i.m12434a(r13, r4)
            java.lang.String r5 = "active"
            if (r13 == 0) goto L_0x00c3
            if (r2 == 0) goto L_0x00c3
            com.appfoundry.previewer.model.Component r13 = r12.f463h
            r13.f10961w = r5
            goto L_0x00c7
        L_0x00c3:
            com.appfoundry.previewer.model.Component r13 = r12.f463h
            r13.f10961w = r4
        L_0x00c7:
            com.appfoundry.previewer.model.Component r13 = r12.f463h
            java.lang.String r13 = r13.f10960v
            java.lang.Boolean r13 = p005b.p006a.p007a.p024o.C0823f.m352U(r13)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r13 = p298d.p344x.p346c.C6888i.m12434a(r13, r6)
            if (r13 == 0) goto L_0x00dd
            com.appfoundry.previewer.model.Component r13 = r12.f463h
            p005b.p038f.p039a.C0849e.m469A0(r13)
            goto L_0x0112
        L_0x00dd:
            com.appfoundry.previewer.model.Component r13 = r12.f463h
            java.lang.String r13 = r13.f10961w
            boolean r13 = p298d.p344x.p346c.C6888i.m12434a(r13, r5)
            if (r13 == 0) goto L_0x00eb
            if (r2 == 0) goto L_0x00eb
            r13 = r5
            goto L_0x00ec
        L_0x00eb:
            r13 = r4
        L_0x00ec:
            int r2 = r13.hashCode()
            r6 = -1422950650(0xffffffffab2f7f06, float:-6.234877E-13)
            if (r2 == r6) goto L_0x0107
            r5 = 1544803905(0x5c13d641, float:1.66449585E17)
            if (r2 == r5) goto L_0x00fb
            goto L_0x0112
        L_0x00fb:
            boolean r13 = r13.equals(r4)
            if (r13 == 0) goto L_0x0112
            com.appfoundry.previewer.model.Component r13 = r12.f463h
            p005b.p006a.p007a.p018i.C0744e.m195H(r13)
            goto L_0x0112
        L_0x0107:
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto L_0x0112
            com.appfoundry.previewer.model.Component r13 = r12.f463h
            p005b.p006a.p007a.p018i.C0744e.m194G(r13)
        L_0x0112:
            int r13 = r14.getActionMasked()
            if (r13 != r0) goto L_0x01f9
            com.appfoundry.previewer.model.Component r13 = r12.f462g
            java.lang.String r14 = "$this$hasAnyClickEvent"
            p298d.p344x.p346c.C6888i.m12438e(r13, r14)
            com.appfoundry.previewer.model.Actions r2 = r13.f10949k
            java.lang.String r4 = ""
            if (r2 == 0) goto L_0x012e
            com.appfoundry.previewer.model.Tap r2 = r2.f10886a
            if (r2 == 0) goto L_0x012e
            java.lang.String r2 = r2.f11166a
            if (r2 == 0) goto L_0x012e
            goto L_0x012f
        L_0x012e:
            r2 = r4
        L_0x012f:
            java.util.List<java.lang.String> r5 = r13.f10947i
            if (r5 == 0) goto L_0x013a
            java.lang.String r5 = p005b.p038f.p039a.C0849e.m549w(r5)
            if (r5 == 0) goto L_0x013a
            goto L_0x013b
        L_0x013a:
            r5 = r4
        L_0x013b:
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r2, r4)
            r2 = r2 ^ r0
            if (r2 != 0) goto L_0x015a
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r5, r4)
            r2 = r2 ^ r0
            if (r2 != 0) goto L_0x015a
            java.lang.String r2 = r13.f10952n
            if (r2 == 0) goto L_0x0153
            boolean r2 = p005b.p006a.p007a.p018i.C0756o.m228f(r2)
            if (r2 == r0) goto L_0x015a
        L_0x0153:
            java.lang.String r13 = r13.f10943e
            if (r13 == 0) goto L_0x0158
            goto L_0x015a
        L_0x0158:
            r13 = r1
            goto L_0x015b
        L_0x015a:
            r13 = r0
        L_0x015b:
            if (r13 == 0) goto L_0x017b
            com.appfoundry.previewer.BravoApp.f10721E = r1
            o.a.a.c r13 = p437o.p438a.p439a.C8068c.m14948b()
            java.lang.String r5 = r12.f464i
            java.lang.String r6 = r12.f465j
            com.appfoundry.previewer.model.Component r2 = r12.f462g
            java.lang.String r7 = r2.f10943e
            com.appfoundry.previewer.model.Actions r8 = r2.f10949k
            java.lang.String r9 = r2.f10952n
            java.util.List<java.lang.String> r10 = r2.f10947i
            java.lang.String r11 = r2.f10939a
            java.lang.Object r2 = p005b.p038f.p039a.C0849e.m491M(r5, r6, r7, r8, r9, r10, r11)
            r13.mo26008g(r2)
            goto L_0x017d
        L_0x017b:
            com.appfoundry.previewer.BravoApp.f10721E = r1
        L_0x017d:
            b.a.a.j.c r13 = r12.f466k
            if (r13 == 0) goto L_0x01f9
            p298d.p344x.p346c.C6888i.m12438e(r13, r14)
            com.appfoundry.previewer.model.Actions r14 = r13.f521d
            if (r14 == 0) goto L_0x0191
            com.appfoundry.previewer.model.Tap r14 = r14.f10886a
            if (r14 == 0) goto L_0x0191
            java.lang.String r14 = r14.f11166a
            if (r14 == 0) goto L_0x0191
            goto L_0x0192
        L_0x0191:
            r14 = r4
        L_0x0192:
            java.util.List<java.lang.String> r2 = r13.f523f
            if (r2 == 0) goto L_0x019d
            java.lang.String r2 = p005b.p038f.p039a.C0849e.m549w(r2)
            if (r2 == 0) goto L_0x019d
            goto L_0x019e
        L_0x019d:
            r2 = r4
        L_0x019e:
            boolean r14 = p298d.p344x.p346c.C6888i.m12434a(r14, r4)
            r14 = r14 ^ r0
            if (r14 != 0) goto L_0x01ba
            boolean r14 = p298d.p344x.p346c.C6888i.m12434a(r2, r4)
            r14 = r14 ^ r0
            if (r14 != 0) goto L_0x01ba
            java.lang.String r14 = r13.f522e
            if (r14 == 0) goto L_0x01b6
            boolean r14 = p005b.p006a.p007a.p018i.C0756o.m228f(r14)
            if (r14 == r0) goto L_0x01ba
        L_0x01b6:
            java.lang.String r13 = r13.f520c
            if (r13 == 0) goto L_0x01bb
        L_0x01ba:
            r1 = r0
        L_0x01bb:
            if (r1 != r0) goto L_0x01f9
            o.a.a.c r13 = p437o.p438a.p439a.C8068c.m14948b()
            b.a.a.j.c r14 = r12.f466k
            if (r14 == 0) goto L_0x01c9
            java.lang.String r1 = r14.f518a
            r4 = r1
            goto L_0x01ca
        L_0x01c9:
            r4 = r3
        L_0x01ca:
            if (r14 == 0) goto L_0x01d0
            java.lang.String r1 = r14.f519b
            r5 = r1
            goto L_0x01d1
        L_0x01d0:
            r5 = r3
        L_0x01d1:
            if (r14 == 0) goto L_0x01d7
            java.lang.String r1 = r14.f520c
            r6 = r1
            goto L_0x01d8
        L_0x01d7:
            r6 = r3
        L_0x01d8:
            if (r14 == 0) goto L_0x01de
            com.appfoundry.previewer.model.Actions r1 = r14.f521d
            r7 = r1
            goto L_0x01df
        L_0x01de:
            r7 = r3
        L_0x01df:
            if (r14 == 0) goto L_0x01e5
            java.lang.String r1 = r14.f522e
            r8 = r1
            goto L_0x01e6
        L_0x01e5:
            r8 = r3
        L_0x01e6:
            if (r14 == 0) goto L_0x01ec
            java.util.List<java.lang.String> r1 = r14.f523f
            r9 = r1
            goto L_0x01ed
        L_0x01ec:
            r9 = r3
        L_0x01ed:
            if (r14 == 0) goto L_0x01f1
            java.lang.String r3 = r14.f524g
        L_0x01f1:
            r10 = r3
            java.lang.Object r14 = p005b.p038f.p039a.C0849e.m491M(r4, r5, r6, r7, r8, r9, r10)
            r13.mo26008g(r14)
        L_0x01f9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p018i.C0747f.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
