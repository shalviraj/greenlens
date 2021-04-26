package p005b.p273o;

import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import p005b.p273o.C4899m;
import p005b.p273o.C4968s4;

/* renamed from: b.o.x */
public class C5020x implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ RelativeLayout.LayoutParams f9707g;

    /* renamed from: h */
    public final /* synthetic */ LinearLayout.LayoutParams f9708h;

    /* renamed from: i */
    public final /* synthetic */ C4899m.C4901b f9709i;

    /* renamed from: j */
    public final /* synthetic */ C4968s4.C4975g f9710j;

    /* renamed from: k */
    public final /* synthetic */ C4777a0 f9711k;

    public C5020x(C4777a0 a0Var, RelativeLayout.LayoutParams layoutParams, LinearLayout.LayoutParams layoutParams2, C4899m.C4901b bVar, C4968s4.C4975g gVar) {
        this.f9711k = a0Var;
        this.f9707g = layoutParams;
        this.f9708h = layoutParams2;
        this.f9709i = bVar;
        this.f9710j = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r25 = this;
            r1 = r25
            b.o.a0 r0 = r1.f9711k
            android.webkit.WebView r0 = r0.f9142k
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            android.widget.RelativeLayout$LayoutParams r2 = r1.f9707g
            r0.setLayoutParams(r2)
            b.o.a0 r0 = r1.f9711k
            android.app.Activity r0 = r0.f9133b
            android.content.Context r0 = r0.getApplicationContext()
            b.o.a0 r2 = r1.f9711k
            android.widget.LinearLayout$LayoutParams r3 = r1.f9708h
            b.o.m$b r4 = r1.f9709i
            java.util.Objects.requireNonNull(r2)
            b.o.m r5 = new b.o.m
            r5.<init>(r0)
            r2.f9144m = r5
            if (r3 == 0) goto L_0x002b
            r5.setLayoutParams(r3)
        L_0x002b:
            b.o.m r3 = r2.f9144m
            r3.mo16637a(r4)
            b.o.m r3 = r2.f9144m
            b.o.y r4 = new b.o.y
            r4.<init>(r2)
            r3.f9453g = r4
            android.webkit.WebView r3 = r2.f9142k
            android.view.ViewParent r3 = r3.getParent()
            if (r3 == 0) goto L_0x004c
            android.webkit.WebView r3 = r2.f9142k
            android.view.ViewParent r3 = r3.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r3.removeAllViews()
        L_0x004c:
            androidx.cardview.widget.CardView r3 = new androidx.cardview.widget.CardView
            r3.<init>(r0)
            b.o.s4$g r4 = r2.f9141j
            b.o.s4$g r5 = p005b.p273o.C4968s4.C4975g.FULL_SCREEN
            r6 = -2
            r7 = -1
            if (r4 != r5) goto L_0x005b
            r4 = r7
            goto L_0x005c
        L_0x005b:
            r4 = r6
        L_0x005c:
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams
            r5.<init>(r7, r4)
            r4 = 13
            r5.addRule(r4)
            r3.setLayoutParams(r5)
            r4 = 5
            int r4 = p005b.p273o.C4843g2.m8880b(r4)
            float r4 = (float) r4
            r3.setCardElevation(r4)
            r4 = 8
            int r4 = p005b.p273o.C4843g2.m8880b(r4)
            float r4 = (float) r4
            r3.setRadius(r4)
            r4 = 0
            r3.setClipChildren(r4)
            r3.setClipToPadding(r4)
            r3.setPreventCornerOverlap(r4)
            java.lang.String r5 = "IN_APP_MESSAGE_CARD_VIEW_TAG"
            r3.setTag(r5)
            android.webkit.WebView r8 = r2.f9142k
            r3.addView(r8)
            b.o.m r8 = r2.f9144m
            int r9 = p005b.p273o.C4777a0.f9130r
            r8.setPadding(r9, r9, r9, r9)
            b.o.m r8 = r2.f9144m
            r8.setClipChildren(r4)
            b.o.m r8 = r2.f9144m
            r8.setClipToPadding(r4)
            b.o.m r2 = r2.f9144m
            r2.addView(r3)
            b.o.a0 r2 = r1.f9711k
            java.util.Objects.requireNonNull(r2)
            android.widget.RelativeLayout r3 = new android.widget.RelativeLayout
            r3.<init>(r0)
            r2.f9143l = r3
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r4)
            r3.setBackgroundDrawable(r0)
            android.widget.RelativeLayout r0 = r2.f9143l
            r0.setClipChildren(r4)
            android.widget.RelativeLayout r0 = r2.f9143l
            r0.setClipToPadding(r4)
            android.widget.RelativeLayout r0 = r2.f9143l
            b.o.m r2 = r2.f9144m
            r0.addView(r2)
            b.o.a0 r0 = r1.f9711k
            android.widget.RelativeLayout r2 = r0.f9143l
            android.widget.PopupWindow r3 = new android.widget.PopupWindow
            boolean r8 = r0.f9138g
            if (r8 == 0) goto L_0x00d7
            r10 = r7
            goto L_0x00d9
        L_0x00d7:
            int r10 = r0.f9135d
        L_0x00d9:
            if (r8 == 0) goto L_0x00dc
            r6 = r7
        L_0x00dc:
            r3.<init>(r2, r10, r6)
            r0.f9132a = r3
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>(r4)
            r3.setBackgroundDrawable(r2)
            android.widget.PopupWindow r2 = r0.f9132a
            r3 = 1
            r2.setTouchable(r3)
            boolean r2 = r0.f9138g
            if (r2 != 0) goto L_0x0104
            b.o.s4$g r2 = r0.f9141j
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x0101
            if (r2 == r3) goto L_0x00fe
            goto L_0x0104
        L_0x00fe:
            r2 = 81
            goto L_0x0105
        L_0x0101:
            r2 = 49
            goto L_0x0105
        L_0x0104:
            r2 = r4
        L_0x0105:
            android.widget.PopupWindow r6 = r0.f9132a
            r7 = 1003(0x3eb, float:1.406E-42)
            androidx.core.widget.PopupWindowCompat.setWindowLayoutType(r6, r7)
            android.widget.PopupWindow r6 = r0.f9132a
            android.app.Activity r0 = r0.f9133b
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.View r0 = r0.getRootView()
            r6.showAtLocation(r0, r2, r4, r4)
            b.o.a0 r10 = r1.f9711k
            b.o.a0$c r0 = r10.f9145n
            if (r0 == 0) goto L_0x0227
            b.o.s4$g r0 = r1.f9710j
            b.o.m r2 = r10.f9144m
            android.widget.RelativeLayout r11 = r10.f9143l
            android.view.View r4 = r2.findViewWithTag(r5)
            androidx.cardview.widget.CardView r4 = (androidx.cardview.widget.CardView) r4
            int r0 = r0.ordinal()
            r5 = 0
            r6 = 1000(0x3e8, float:1.401E-42)
            r7 = 4620693217682128896(0x4020000000000000, double:8.0)
            r12 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            if (r0 == 0) goto L_0x01a3
            if (r0 == r3) goto L_0x0183
            r3 = 2
            if (r0 == r3) goto L_0x014b
            r3 = 3
            if (r0 == r3) goto L_0x014b
            goto L_0x01c3
        L_0x014b:
            r15 = 0
            b.o.u2 r0 = new b.o.u2
            r0.<init>(r12, r7)
            android.view.animation.ScaleAnimation r3 = new android.view.animation.ScaleAnimation
            r17 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 1
            r22 = 1056964608(0x3f000000, float:0.5)
            r23 = 1
            r24 = 1056964608(0x3f000000, float:0.5)
            r16 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            long r4 = (long) r6
            r3.setDuration(r4)
            r3.setInterpolator(r0)
            r2.setAnimation(r3)
            r12 = 400(0x190, float:5.6E-43)
            int r13 = p005b.p273o.C4777a0.f9128p
            int r14 = p005b.p273o.C4777a0.f9129q
            android.animation.ValueAnimator r0 = r10.mo16497b(r11, r12, r13, r14, r15)
            r3.start()
            r0.start()
            goto L_0x01c3
        L_0x0183:
            android.webkit.WebView r0 = r10.f9142k
            int r0 = r0.getHeight()
            int r0 = r0 + r9
            float r0 = (float) r0
            b.o.u2 r2 = new b.o.u2
            r2.<init>(r12, r7)
            android.view.animation.TranslateAnimation r3 = new android.view.animation.TranslateAnimation
            r3.<init>(r5, r5, r0, r5)
            long r5 = (long) r6
            r3.setDuration(r5)
            r3.setInterpolator(r2)
            r4.setAnimation(r3)
            r3.start()
            goto L_0x01c3
        L_0x01a3:
            android.webkit.WebView r0 = r10.f9142k
            int r0 = r0.getHeight()
            int r0 = -r0
            int r0 = r0 - r9
            float r0 = (float) r0
            b.o.u2 r2 = new b.o.u2
            r2.<init>(r12, r7)
            android.view.animation.TranslateAnimation r3 = new android.view.animation.TranslateAnimation
            r3.<init>(r5, r5, r0, r5)
            long r5 = (long) r6
            r3.setDuration(r5)
            r3.setInterpolator(r2)
            r4.setAnimation(r3)
            r3.start()
        L_0x01c3:
            b.o.a0 r0 = r1.f9711k
            b.o.a0$c r0 = r0.f9145n
            b.o.v4 r0 = (p005b.p273o.C5004v4) r0
            java.util.Objects.requireNonNull(r0)
            b.o.u0 r2 = p005b.p273o.C4857i2.m8948p()
            b.o.s4 r0 = r0.f9674a
            b.o.s0 r0 = r0.f9602d
            java.util.Objects.requireNonNull(r2)
            boolean r3 = r0.f9587k
            if (r3 == 0) goto L_0x01dc
            goto L_0x0227
        L_0x01dc:
            java.util.Set<java.lang.String> r3 = r2.f9648f
            java.lang.String r4 = r0.f9577a
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x01e7
            goto L_0x0227
        L_0x01e7:
            java.util.Set<java.lang.String> r3 = r2.f9648f
            java.lang.String r4 = r0.f9577a
            r3.add(r4)
            java.lang.String r3 = p005b.p273o.C4990u0.m9148x(r0)
            if (r3 != 0) goto L_0x01f5
            goto L_0x0227
        L_0x01f5:
            b.o.v0 r4 = new b.o.v0     // Catch:{ JSONException -> 0x021b }
            r4.<init>(r2, r3)     // Catch:{ JSONException -> 0x021b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x021b }
            r3.<init>()     // Catch:{ JSONException -> 0x021b }
            java.lang.String r5 = "in_app_messages/"
            r3.append(r5)     // Catch:{ JSONException -> 0x021b }
            java.lang.String r5 = r0.f9577a     // Catch:{ JSONException -> 0x021b }
            r3.append(r5)     // Catch:{ JSONException -> 0x021b }
            java.lang.String r5 = "/impression"
            r3.append(r5)     // Catch:{ JSONException -> 0x021b }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x021b }
            b.o.w0 r5 = new b.o.w0     // Catch:{ JSONException -> 0x021b }
            r5.<init>(r2, r0)     // Catch:{ JSONException -> 0x021b }
            p005b.p273o.C4805c3.m8817p(r3, r4, r5)     // Catch:{ JSONException -> 0x021b }
            goto L_0x0227
        L_0x021b:
            r0 = move-exception
            r0.printStackTrace()
            b.o.i2$k r0 = p005b.p273o.C4857i2.C4868k.ERROR
            r2 = 0
            java.lang.String r3 = "Unable to execute in-app message impression HTTP request due to invalid JSON"
            p005b.p273o.C4857i2.m8933a(r0, r3, r2)
        L_0x0227:
            b.o.a0 r0 = r1.f9711k
            double r2 = r0.f9137f
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0232
            goto L_0x0247
        L_0x0232:
            java.lang.Runnable r4 = r0.f9146o
            if (r4 == 0) goto L_0x0237
            goto L_0x0247
        L_0x0237:
            b.o.z r4 = new b.o.z
            r4.<init>(r0)
            r0.f9146o = r4
            android.os.Handler r0 = r0.f9134c
            long r2 = (long) r2
            r5 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r5
            r0.postDelayed(r4, r2)
        L_0x0247:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C5020x.run():void");
    }
}
