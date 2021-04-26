package p005b.p006a.p007a.p009b;

import com.appfoundry.previewer.model.Params;
import p005b.p096l.p097a.p113c.p142g.C3075d;

/* renamed from: b.a.a.b.e */
public final class C0627e implements C3075d {

    /* renamed from: a */
    public final /* synthetic */ Params f288a;

    public C0627e(Params params) {
        this.f288a = params;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r4 = r2.f11080t;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10371a(p005b.p096l.p097a.p113c.p142g.C3069a r24) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            android.content.Context r2 = p005b.p038f.p039a.C0849e.m505a()
            p005b.p096l.p097a.p113c.p142g.C3074c.m5756a(r2)
            com.appfoundry.previewer.model.Params r2 = r1.f288a
            r3 = 0
            if (r2 == 0) goto L_0x0017
            com.appfoundry.previewer.model.Map r4 = r2.f11080t
            if (r4 == 0) goto L_0x0017
            java.lang.Boolean r4 = r4.f11028c
            goto L_0x0018
        L_0x0017:
            r4 = r3
        L_0x0018:
            java.lang.String r5 = "map"
            r6 = 0
            if (r4 == 0) goto L_0x0029
            com.appfoundry.previewer.model.Map r2 = r2.f11080t
            java.lang.Boolean r2 = r2.f11028c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r2, r4)
            if (r2 == 0) goto L_0x004d
        L_0x0029:
            p298d.p344x.p346c.C6888i.m12437d(r0, r5)
            b.l.a.c.g.e r2 = r0.f5207b     // Catch:{ RemoteException -> 0x0274 }
            if (r2 != 0) goto L_0x003d
            b.l.a.c.g.e r2 = new b.l.a.c.g.e     // Catch:{ RemoteException -> 0x0274 }
            b.l.a.c.g.f.b r4 = r0.f5206a     // Catch:{ RemoteException -> 0x0274 }
            b.l.a.c.g.f.d r4 = r4.mo14033N()     // Catch:{ RemoteException -> 0x0274 }
            r2.<init>(r4)     // Catch:{ RemoteException -> 0x0274 }
            r0.f5207b = r2     // Catch:{ RemoteException -> 0x0274 }
        L_0x003d:
            b.l.a.c.g.e r2 = r0.f5207b     // Catch:{ RemoteException -> 0x0274 }
            java.util.Objects.requireNonNull(r2)
            b.l.a.c.g.f.d r2 = r2.f5218a     // Catch:{ RemoteException -> 0x026d }
            r2.mo14042X(r6)     // Catch:{ RemoteException -> 0x026d }
            r2 = -1
            b.l.a.c.g.f.b r4 = r0.f5206a     // Catch:{ RemoteException -> 0x0266 }
            r4.mo14036p(r2)     // Catch:{ RemoteException -> 0x0266 }
        L_0x004d:
            p298d.p344x.p346c.C6888i.m12437d(r0, r5)
            com.appfoundry.previewer.model.Params r2 = r1.f288a
            p298d.p344x.p346c.C6888i.m12438e(r0, r5)
            if (r2 == 0) goto L_0x005a
            java.util.List<com.appfoundry.previewer.model.Marker> r4 = r2.f11081u
            goto L_0x005b
        L_0x005a:
            r4 = r3
        L_0x005b:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x0113
            b.a.a.o.d r4 = new b.a.a.o.d
            r4.<init>(r2)
            b.l.a.c.g.f.b r9 = r0.f5206a     // Catch:{ RemoteException -> 0x010c }
            b.l.a.c.g.j r10 = new b.l.a.c.g.j     // Catch:{ RemoteException -> 0x010c }
            r10.<init>(r4)     // Catch:{ RemoteException -> 0x010c }
            r9.mo14034O0(r10)     // Catch:{ RemoteException -> 0x010c }
            java.util.List<com.appfoundry.previewer.model.Marker> r2 = r2.f11081u
            java.util.Iterator r2 = r2.iterator()
        L_0x0074:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0113
            java.lang.Object r4 = r2.next()
            com.appfoundry.previewer.model.Marker r4 = (com.appfoundry.previewer.model.Marker) r4
            p298d.p344x.p346c.C6888i.m12438e(r0, r5)
            java.lang.String r9 = "marker"
            p298d.p344x.p346c.C6888i.m12438e(r4, r9)
            d.x.c.v r10 = new d.x.c.v
            r10.<init>()
            com.appfoundry.previewer.model.Properties r11 = r4.f11031c
            if (r11 == 0) goto L_0x0094
            java.lang.String r11 = r11.f11089a
            goto L_0x0095
        L_0x0094:
            r11 = r3
        L_0x0095:
            if (r11 == 0) goto L_0x00e6
            android.content.Context r11 = p005b.p038f.p039a.C0849e.m505a()
            b.h.a.i r11 = p005b.p051h.p052a.C0929c.m654d(r11)
            b.h.a.h r11 = r11.mo10412l()
            p298d.p344x.p346c.C6888i.m12438e(r4, r9)
            com.appfoundry.previewer.model.Properties r9 = r4.f11031c
            if (r9 == 0) goto L_0x00bb
            java.lang.String r9 = r9.f11089a
            if (r9 == 0) goto L_0x00bb
            java.lang.String r12 = "http"
            boolean r9 = p298d.p415c0.C7694h.m13910A(r9, r12, r6, r7)
            if (r9 != r8) goto L_0x00bb
            com.appfoundry.previewer.model.Properties r9 = r4.f11031c
            java.lang.String r9 = r9.f11089a
            goto L_0x00cf
        L_0x00bb:
            com.appfoundry.previewer.model.Properties r9 = r4.f11031c
            if (r9 == 0) goto L_0x00c2
            java.lang.String r9 = r9.f11089a
            goto L_0x00c3
        L_0x00c2:
            r9 = r3
        L_0x00c3:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            com.appfoundry.previewer.model.Asset r9 = p005b.p006a.p007a.p024o.C0823f.m334C(r9, r12)
            if (r9 == 0) goto L_0x00ce
            java.lang.String r9 = r9.f10896b
            goto L_0x00cf
        L_0x00ce:
            r9 = r3
        L_0x00cf:
            b.h.a.h r9 = r11.mo10405I(r9)
            b.a.a.o.e r11 = new b.a.a.o.e
            r11.<init>(r10, r0, r4)
            java.util.Objects.requireNonNull(r9)
            java.util.concurrent.Executor r4 = p005b.p051h.p052a.p078s.C1373e.f1789a
            r9.mo10770D(r11, r3, r9, r4)
            java.lang.String r4 = "Glide.with(appContext())…         }\n            })"
            p298d.p344x.p346c.C6888i.m12437d(r11, r4)
            goto L_0x0074
        L_0x00e6:
            b.l.a.c.g.g.c r9 = p005b.p006a.p007a.p024o.C0820c.m300B(r4)
            b.l.a.c.g.g.b r9 = r0.mo14029a(r9)
            java.lang.String r11 = "map.addMarker(withMarkerOptions(marker))"
            p298d.p344x.p346c.C6888i.m12437d(r9, r11)
            r10.f13801g = r9
            java.lang.String r4 = p005b.p038f.p039a.C0849e.m486J(r4)
            b.l.a.c.e.h.g r9 = r9.f5223a     // Catch:{ RemoteException -> 0x0105 }
            b.l.a.c.c.d r10 = new b.l.a.c.c.d     // Catch:{ RemoteException -> 0x0105 }
            r10.<init>(r4)     // Catch:{ RemoteException -> 0x0105 }
            r9.mo13206V(r10)     // Catch:{ RemoteException -> 0x0105 }
            goto L_0x0074
        L_0x0105:
            r0 = move-exception
            b.l.a.c.g.g.d r2 = new b.l.a.c.g.g.d
            r2.<init>(r0)
            throw r2
        L_0x010c:
            r0 = move-exception
            b.l.a.c.g.g.d r2 = new b.l.a.c.g.g.d
            r2.<init>(r0)
            throw r2
        L_0x0113:
            com.appfoundry.previewer.model.Params r2 = r1.f288a
            java.lang.String r4 = "null reference"
            java.lang.String r5 = "CameraUpdateFactory is not initialized"
            if (r2 == 0) goto L_0x01ae
            java.lang.String r9 = "$this$hasCenterMap"
            p298d.p344x.p346c.C6888i.m12438e(r2, r9)
            com.appfoundry.previewer.model.Map r2 = r2.f11080t
            if (r2 == 0) goto L_0x0126
            java.util.List<java.lang.Float> r3 = r2.f11027b
        L_0x0126:
            if (r3 == 0) goto L_0x0132
            java.util.List<java.lang.Float> r2 = r2.f11027b
            int r2 = r2.size()
            if (r2 != r7) goto L_0x0132
            r2 = r8
            goto L_0x0133
        L_0x0132:
            r2 = r6
        L_0x0133:
            if (r2 != r8) goto L_0x01ae
            com.google.android.gms.maps.model.LatLng r2 = new com.google.android.gms.maps.model.LatLng
            com.appfoundry.previewer.model.Params r3 = r1.f288a
            java.lang.String r7 = "$this$getMapCenterLatitude"
            p298d.p344x.p346c.C6888i.m12438e(r3, r7)
            com.appfoundry.previewer.model.Map r3 = r3.f11080t
            if (r3 == 0) goto L_0x0154
            java.util.List<java.lang.Float> r3 = r3.f11027b
            if (r3 == 0) goto L_0x0154
            java.lang.Object r3 = r3.get(r8)
            java.lang.Float r3 = (java.lang.Float) r3
            if (r3 == 0) goto L_0x0154
            float r3 = r3.floatValue()
            double r7 = (double) r3
            goto L_0x0155
        L_0x0154:
            double r7 = (double) r6
        L_0x0155:
            com.appfoundry.previewer.model.Params r3 = r1.f288a
            java.lang.String r9 = "$this$getMapCenterLongitude"
            p298d.p344x.p346c.C6888i.m12438e(r3, r9)
            com.appfoundry.previewer.model.Map r3 = r3.f11080t
            if (r3 == 0) goto L_0x0172
            java.util.List<java.lang.Float> r3 = r3.f11027b
            if (r3 == 0) goto L_0x0172
            java.lang.Object r3 = r3.get(r6)
            java.lang.Float r3 = (java.lang.Float) r3
            if (r3 == 0) goto L_0x0172
            float r3 = r3.floatValue()
            double r9 = (double) r3
            goto L_0x0173
        L_0x0172:
            double r9 = (double) r6
        L_0x0173:
            r2.<init>(r7, r9)
            com.appfoundry.previewer.model.Params r3 = r1.f288a
            java.lang.String r6 = "$this$getMapZoom"
            p298d.p344x.p346c.C6888i.m12438e(r3, r6)
            com.appfoundry.previewer.model.Map r3 = r3.f11080t
            if (r3 == 0) goto L_0x018b
            java.lang.Integer r3 = r3.f11026a
            if (r3 == 0) goto L_0x018b
            int r3 = r3.intValue()
            float r3 = (float) r3
            goto L_0x018d
        L_0x018b:
            r3 = 1094713344(0x41400000, float:12.0)
        L_0x018d:
            b.l.a.c.g.f.a r6 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.f3516f     // Catch:{ RemoteException -> 0x01a7 }
            p005b.p006a.p007a.p024o.C0823f.m380l(r6, r5)     // Catch:{ RemoteException -> 0x01a7 }
            b.l.a.c.c.b r2 = r6.mo14031M0(r2, r3)     // Catch:{ RemoteException -> 0x01a7 }
            java.util.Objects.requireNonNull(r2, r4)     // Catch:{ RemoteException -> 0x01a7 }
            b.l.a.c.g.f.b r0 = r0.f5206a     // Catch:{ RemoteException -> 0x01a0 }
            r0.mo14037q0(r2)     // Catch:{ RemoteException -> 0x01a0 }
            goto L_0x0265
        L_0x01a0:
            r0 = move-exception
            b.l.a.c.g.g.d r2 = new b.l.a.c.g.g.d
            r2.<init>(r0)
            throw r2
        L_0x01a7:
            r0 = move-exception
            b.l.a.c.g.g.d r2 = new b.l.a.c.g.g.d
            r2.<init>(r0)
            throw r2
        L_0x01ae:
            com.appfoundry.previewer.model.Params r2 = r1.f288a
            if (r2 == 0) goto L_0x0265
            java.util.List<com.appfoundry.previewer.model.Marker> r2 = r2.f11081u
            if (r2 == 0) goto L_0x0265
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r8
            if (r2 != r8) goto L_0x0265
            r2 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r9 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r11 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.appfoundry.previewer.model.Params r7 = r1.f288a
            java.util.List<com.appfoundry.previewer.model.Marker> r7 = r7.f11081u
            java.util.Iterator r7 = r7.iterator()
            r13 = r11
        L_0x01cc:
            boolean r15 = r7.hasNext()
            if (r15 == 0) goto L_0x022b
            java.lang.Object r15 = r7.next()
            com.appfoundry.previewer.model.Marker r15 = (com.appfoundry.previewer.model.Marker) r15
            com.google.android.gms.maps.model.LatLng r15 = p005b.p038f.p039a.C0849e.m484I(r15)
            r16 = r7
            double r6 = r15.f11354g
            double r2 = java.lang.Math.min(r2, r6)
            double r6 = r15.f11354g
            double r9 = java.lang.Math.max(r9, r6)
            double r6 = r15.f11355h
            boolean r15 = java.lang.Double.isNaN(r11)
            if (r15 == 0) goto L_0x01f4
            r11 = r6
            goto L_0x0226
        L_0x01f4:
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 > 0) goto L_0x0201
            int r15 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r15 > 0) goto L_0x020a
            int r15 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r15 > 0) goto L_0x020a
            goto L_0x020c
        L_0x0201:
            int r15 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r15 <= 0) goto L_0x020c
            int r15 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r15 > 0) goto L_0x020a
            goto L_0x020c
        L_0x020a:
            r15 = 0
            goto L_0x020d
        L_0x020c:
            r15 = r8
        L_0x020d:
            if (r15 != 0) goto L_0x0227
            double r17 = r11 - r6
            r19 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r17 = r17 + r19
            double r17 = r17 % r19
            double r21 = r6 - r13
            double r21 = r21 + r19
            double r21 = r21 % r19
            int r15 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r15 >= 0) goto L_0x0226
            r11 = r6
            goto L_0x0227
        L_0x0226:
            r13 = r6
        L_0x0227:
            r7 = r16
            r6 = 0
            goto L_0x01cc
        L_0x022b:
            boolean r6 = java.lang.Double.isNaN(r11)
            r6 = r6 ^ r8
            java.lang.String r7 = "no included points"
            p005b.p006a.p007a.p024o.C0823f.m386o(r6, r7)
            com.google.android.gms.maps.model.LatLngBounds r6 = new com.google.android.gms.maps.model.LatLngBounds
            com.google.android.gms.maps.model.LatLng r7 = new com.google.android.gms.maps.model.LatLng
            r7.<init>(r2, r11)
            com.google.android.gms.maps.model.LatLng r2 = new com.google.android.gms.maps.model.LatLng
            r2.<init>(r9, r13)
            r6.<init>(r7, r2)
            b.l.a.c.g.f.a r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.f3516f     // Catch:{ RemoteException -> 0x025e }
            p005b.p006a.p007a.p024o.C0823f.m380l(r2, r5)     // Catch:{ RemoteException -> 0x025e }
            r3 = 0
            b.l.a.c.c.b r2 = r2.mo14032v(r6, r3)     // Catch:{ RemoteException -> 0x025e }
            java.util.Objects.requireNonNull(r2, r4)     // Catch:{ RemoteException -> 0x025e }
            b.l.a.c.g.f.b r0 = r0.f5206a     // Catch:{ RemoteException -> 0x0257 }
            r0.mo14037q0(r2)     // Catch:{ RemoteException -> 0x0257 }
            goto L_0x0265
        L_0x0257:
            r0 = move-exception
            b.l.a.c.g.g.d r2 = new b.l.a.c.g.g.d
            r2.<init>(r0)
            throw r2
        L_0x025e:
            r0 = move-exception
            b.l.a.c.g.g.d r2 = new b.l.a.c.g.g.d
            r2.<init>(r0)
            throw r2
        L_0x0265:
            return
        L_0x0266:
            r0 = move-exception
            b.l.a.c.g.g.d r2 = new b.l.a.c.g.g.d
            r2.<init>(r0)
            throw r2
        L_0x026d:
            r0 = move-exception
            b.l.a.c.g.g.d r2 = new b.l.a.c.g.g.d
            r2.<init>(r0)
            throw r2
        L_0x0274:
            r0 = move-exception
            b.l.a.c.g.g.d r2 = new b.l.a.c.g.g.d
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p009b.C0627e.mo10371a(b.l.a.c.g.a):void");
    }
}
