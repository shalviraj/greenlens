package p005b.p096l.p097a.p112b;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.view.MarginLayoutParamsCompat;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.b.d */
public class C1746d {

    /* renamed from: a */
    public final C1743a f3074a;

    /* renamed from: b */
    public boolean[] f3075b;
    @Nullable

    /* renamed from: c */
    public int[] f3076c;
    @Nullable

    /* renamed from: d */
    public long[] f3077d;
    @Nullable

    /* renamed from: e */
    public long[] f3078e;

    /* renamed from: b.l.a.b.d$a */
    public static class C1747a {

        /* renamed from: a */
        public List<C1745c> f3079a;
    }

    public C1746d(C1743a aVar) {
        this.f3074a = aVar;
    }

    /* renamed from: a */
    public final void mo11952a(List<C1745c> list, C1745c cVar, int i, int i2) {
        cVar.f3068i = i2;
        Objects.requireNonNull((FlexboxLayoutManager) this.f3074a);
        cVar.f3071l = i;
        list.add(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        if (mo11968q(r14, r10, r13) != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b1, code lost:
        if (mo11968q(r14, r10, r13) != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0243, code lost:
        if (r1 < (r8 + r10)) goto L_0x0245;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03e6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x024a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11953b(p005b.p096l.p097a.p112b.C1746d.C1747a r24, int r25, int r26, int r27, int r28, int r29, @androidx.annotation.Nullable java.util.List<p005b.p096l.p097a.p112b.C1745c> r30) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = r26
            r3 = r29
            b.l.a.b.a r4 = r0.f3074a
            com.google.android.flexbox.FlexboxLayoutManager r4 = (com.google.android.flexbox.FlexboxLayoutManager) r4
            boolean r4 = r4.mo18811r()
            int r5 = android.view.View.MeasureSpec.getMode(r25)
            int r6 = android.view.View.MeasureSpec.getSize(r25)
            if (r30 != 0) goto L_0x0022
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = r24
            goto L_0x0026
        L_0x0022:
            r8 = r24
            r7 = r30
        L_0x0026:
            r8.f3079a = r7
            r8 = -1
            if (r3 != r8) goto L_0x002d
            r8 = 1
            goto L_0x002e
        L_0x002d:
            r8 = 0
        L_0x002e:
            b.l.a.b.a r9 = r0.f3074a
            if (r4 == 0) goto L_0x0037
            int r9 = r9.getPaddingStart()
            goto L_0x003b
        L_0x0037:
            int r9 = r9.getPaddingTop()
        L_0x003b:
            b.l.a.b.a r10 = r0.f3074a
            if (r4 == 0) goto L_0x0044
            int r10 = r10.getPaddingEnd()
            goto L_0x0048
        L_0x0044:
            int r10 = r10.getPaddingBottom()
        L_0x0048:
            b.l.a.b.a r11 = r0.f3074a
            if (r4 == 0) goto L_0x0051
            int r11 = r11.getPaddingTop()
            goto L_0x0055
        L_0x0051:
            int r11 = r11.getPaddingStart()
        L_0x0055:
            b.l.a.b.a r12 = r0.f3074a
            if (r4 == 0) goto L_0x005e
            int r12 = r12.getPaddingBottom()
            goto L_0x0062
        L_0x005e:
            int r12 = r12.getPaddingEnd()
        L_0x0062:
            b.l.a.b.c r13 = new b.l.a.b.c
            r13.<init>()
            r14 = r28
            r13.f3070k = r14
            int r9 = r9 + r10
            r13.f3060a = r9
            b.l.a.b.a r10 = r0.f3074a
            com.google.android.flexbox.FlexboxLayoutManager r10 = (com.google.android.flexbox.FlexboxLayoutManager) r10
            int r10 = r10.mo18807n()
            r16 = 0
            r17 = 0
            r28 = r8
            r15 = r16
            r8 = r17
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0082:
            if (r14 >= r10) goto L_0x0400
            b.l.a.b.a r3 = r0.f3074a
            com.google.android.flexbox.FlexboxLayoutManager r3 = (com.google.android.flexbox.FlexboxLayoutManager) r3
            android.view.View r3 = r3.mo18806m(r14)
            if (r3 != 0) goto L_0x0097
            boolean r3 = r0.mo11968q(r14, r10, r13)
            r17 = r8
            if (r3 == 0) goto L_0x00b6
            goto L_0x00b3
        L_0x0097:
            r17 = r8
            int r8 = r3.getVisibility()
            r2 = 8
            if (r8 != r2) goto L_0x00c7
            int r2 = r13.f3064e
            int r2 = r2 + 1
            r13.f3064e = r2
            int r2 = r13.f3063d
            int r2 = r2 + 1
            r13.f3063d = r2
            boolean r2 = r0.mo11968q(r14, r10, r13)
            if (r2 == 0) goto L_0x00b6
        L_0x00b3:
            r0.mo11952a(r7, r13, r14, r15)
        L_0x00b6:
            r3 = r28
            r20 = r5
            r1 = r6
            r8 = r7
            r2 = r10
            r22 = r11
            r5 = r26
            r10 = r27
            r7 = r29
            goto L_0x03ed
        L_0x00c7:
            boolean r2 = r3 instanceof android.widget.CompoundButton
            if (r2 == 0) goto L_0x0107
            r2 = r3
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            android.view.ViewGroup$LayoutParams r8 = r2.getLayoutParams()
            b.l.a.b.b r8 = (p005b.p096l.p097a.p112b.C1744b) r8
            r30 = r10
            int r10 = r8.mo11937E()
            r18 = r7
            int r7 = r8.mo11936B()
            android.graphics.drawable.Drawable r2 = androidx.core.widget.CompoundButtonCompat.getButtonDrawable(r2)
            if (r2 != 0) goto L_0x00e9
            r19 = 0
            goto L_0x00ed
        L_0x00e9:
            int r19 = r2.getMinimumWidth()
        L_0x00ed:
            if (r2 != 0) goto L_0x00f3
            r2 = -1
            r20 = 0
            goto L_0x00f8
        L_0x00f3:
            int r20 = r2.getMinimumHeight()
            r2 = -1
        L_0x00f8:
            if (r10 != r2) goto L_0x00fc
            r10 = r19
        L_0x00fc:
            r8.mo11940J(r10)
            if (r7 != r2) goto L_0x0103
            r7 = r20
        L_0x0103:
            r8.mo11947l(r7)
            goto L_0x010b
        L_0x0107:
            r18 = r7
            r30 = r10
        L_0x010b:
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            b.l.a.b.b r2 = (p005b.p096l.p097a.p112b.C1744b) r2
            int r7 = r2.mo11950r()
            r8 = 4
            if (r7 != r8) goto L_0x0121
            java.util.List<java.lang.Integer> r7 = r13.f3069j
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r7.add(r8)
        L_0x0121:
            if (r4 == 0) goto L_0x0128
            int r7 = r2.getWidth()
            goto L_0x012c
        L_0x0128:
            int r7 = r2.getHeight()
        L_0x012c:
            float r8 = r2.mo11949q()
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0144
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 != r8) goto L_0x0144
            float r7 = (float) r6
            float r8 = r2.mo11949q()
            float r8 = r8 * r7
            int r7 = java.lang.Math.round(r8)
        L_0x0144:
            if (r4 == 0) goto L_0x0184
            b.l.a.b.a r8 = r0.f3074a
            r10 = 1
            int r19 = r0.mo11967p(r2, r10)
            int r19 = r19 + r9
            int r10 = r0.mo11965n(r2, r10)
            int r10 = r10 + r19
            com.google.android.flexbox.FlexboxLayoutManager r8 = (com.google.android.flexbox.FlexboxLayoutManager) r8
            int r7 = r8.mo18804k(r1, r10, r7)
            b.l.a.b.a r8 = r0.f3074a
            int r10 = r11 + r12
            r19 = r6
            r6 = 1
            int r20 = r0.mo11966o(r2, r6)
            int r20 = r20 + r10
            int r6 = r0.mo11964m(r2, r6)
            int r6 = r6 + r20
            int r6 = r6 + r15
            int r10 = r2.getHeight()
            com.google.android.flexbox.FlexboxLayoutManager r8 = (com.google.android.flexbox.FlexboxLayoutManager) r8
            r20 = r5
            r5 = r26
            int r6 = r8.mo18803j(r5, r6, r10)
            r3.measure(r7, r6)
            r0.mo11975x(r14, r7, r6, r3)
            goto L_0x01c1
        L_0x0184:
            r20 = r5
            r19 = r6
            r5 = r26
            b.l.a.b.a r6 = r0.f3074a
            int r8 = r11 + r12
            r10 = 0
            int r21 = r0.mo11966o(r2, r10)
            int r21 = r21 + r8
            int r8 = r0.mo11964m(r2, r10)
            int r8 = r8 + r21
            int r8 = r8 + r15
            int r10 = r2.getWidth()
            com.google.android.flexbox.FlexboxLayoutManager r6 = (com.google.android.flexbox.FlexboxLayoutManager) r6
            int r6 = r6.mo18804k(r5, r8, r10)
            b.l.a.b.a r8 = r0.f3074a
            r10 = 0
            int r21 = r0.mo11967p(r2, r10)
            int r21 = r21 + r9
            int r10 = r0.mo11965n(r2, r10)
            int r10 = r10 + r21
            com.google.android.flexbox.FlexboxLayoutManager r8 = (com.google.android.flexbox.FlexboxLayoutManager) r8
            int r7 = r8.mo18803j(r1, r10, r7)
            r3.measure(r6, r7)
            r0.mo11975x(r14, r6, r7, r3)
        L_0x01c1:
            b.l.a.b.a r6 = r0.f3074a
            com.google.android.flexbox.FlexboxLayoutManager r6 = (com.google.android.flexbox.FlexboxLayoutManager) r6
            android.util.SparseArray<android.view.View> r6 = r6.f11213t
            r6.put(r14, r3)
            r0.mo11954c(r3, r14)
            int r6 = r3.getMeasuredState()
            r8 = r17
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            int r8 = r13.f3060a
            if (r4 == 0) goto L_0x01e0
            int r10 = r3.getMeasuredWidth()
            goto L_0x01e4
        L_0x01e0:
            int r10 = r3.getMeasuredHeight()
        L_0x01e4:
            int r17 = r0.mo11967p(r2, r4)
            int r17 = r17 + r10
            int r10 = r0.mo11965n(r2, r4)
            int r10 = r10 + r17
            int r17 = r18.size()
            b.l.a.b.a r1 = r0.f3074a
            com.google.android.flexbox.FlexboxLayoutManager r1 = (com.google.android.flexbox.FlexboxLayoutManager) r1
            int r1 = r1.f11195b
            if (r1 != 0) goto L_0x01fd
            goto L_0x020c
        L_0x01fd:
            boolean r1 = r2.mo11938F()
            if (r1 == 0) goto L_0x020a
            r21 = r6
            r22 = r11
            r1 = r19
            goto L_0x0245
        L_0x020a:
            if (r20 != 0) goto L_0x0211
        L_0x020c:
            r21 = r6
            r22 = r11
            goto L_0x0222
        L_0x0211:
            b.l.a.b.a r1 = r0.f3074a
            com.google.android.flexbox.FlexboxLayoutManager r1 = (com.google.android.flexbox.FlexboxLayoutManager) r1
            r21 = r6
            int r6 = r1.f11197d
            r22 = r11
            r11 = -1
            if (r6 == r11) goto L_0x0225
            int r11 = r17 + 1
            if (r6 > r11) goto L_0x0225
        L_0x0222:
            r1 = r19
            goto L_0x0247
        L_0x0225:
            boolean r6 = r1.mo18811r()
            if (r6 == 0) goto L_0x0234
            int r6 = r1.getLeftDecorationWidth(r3)
            int r1 = r1.getRightDecorationWidth(r3)
            goto L_0x023c
        L_0x0234:
            int r6 = r1.getTopDecorationHeight(r3)
            int r1 = r1.getBottomDecorationHeight(r3)
        L_0x023c:
            int r1 = r1 + r6
            if (r1 <= 0) goto L_0x0240
            int r10 = r10 + r1
        L_0x0240:
            int r8 = r8 + r10
            r1 = r19
            if (r1 >= r8) goto L_0x0247
        L_0x0245:
            r6 = 1
            goto L_0x0248
        L_0x0247:
            r6 = 0
        L_0x0248:
            if (r6 == 0) goto L_0x02cf
            int r6 = r13.f3063d
            int r8 = r13.f3064e
            int r6 = r6 - r8
            if (r6 <= 0) goto L_0x0260
            if (r14 <= 0) goto L_0x0256
            int r6 = r14 + -1
            goto L_0x0257
        L_0x0256:
            r6 = 0
        L_0x0257:
            r8 = r18
            r0.mo11952a(r8, r13, r6, r15)
            int r6 = r13.f3062c
            int r15 = r15 + r6
            goto L_0x0262
        L_0x0260:
            r8 = r18
        L_0x0262:
            if (r4 == 0) goto L_0x0291
            int r6 = r2.getHeight()
            r10 = -1
            if (r6 != r10) goto L_0x02c0
            b.l.a.b.a r6 = r0.f3074a
            int r10 = r6.getPaddingTop()
            b.l.a.b.a r11 = r0.f3074a
            int r11 = r11.getPaddingBottom()
            int r11 = r11 + r10
            int r10 = r2.mo11944U()
            int r10 = r10 + r11
            int r11 = r2.mo11941K()
            int r11 = r11 + r10
            int r11 = r11 + r15
            int r10 = r2.getHeight()
            com.google.android.flexbox.FlexboxLayoutManager r6 = (com.google.android.flexbox.FlexboxLayoutManager) r6
            int r6 = r6.mo18803j(r5, r11, r10)
            r3.measure(r7, r6)
            goto L_0x02bd
        L_0x0291:
            int r6 = r2.getWidth()
            r10 = -1
            if (r6 != r10) goto L_0x02c0
            b.l.a.b.a r6 = r0.f3074a
            int r10 = r6.getPaddingLeft()
            b.l.a.b.a r11 = r0.f3074a
            int r11 = r11.getPaddingRight()
            int r11 = r11 + r10
            int r10 = r2.mo11942M()
            int r10 = r10 + r11
            int r11 = r2.mo11935A()
            int r11 = r11 + r10
            int r11 = r11 + r15
            int r10 = r2.getWidth()
            com.google.android.flexbox.FlexboxLayoutManager r6 = (com.google.android.flexbox.FlexboxLayoutManager) r6
            int r6 = r6.mo18804k(r5, r11, r10)
            r3.measure(r6, r7)
        L_0x02bd:
            r0.mo11954c(r3, r14)
        L_0x02c0:
            b.l.a.b.c r13 = new b.l.a.b.c
            r13.<init>()
            r6 = 1
            r13.f3063d = r6
            r13.f3060a = r9
            r13.f3070k = r14
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x02d9
        L_0x02cf:
            r8 = r18
            int r6 = r13.f3063d
            int r6 = r6 + 1
            r13.f3063d = r6
            r6 = r16
        L_0x02d9:
            boolean r7 = r13.f3072m
            float r10 = r2.mo11948n()
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x02e6
            r10 = 1
            goto L_0x02e7
        L_0x02e6:
            r10 = 0
        L_0x02e7:
            r7 = r7 | r10
            r13.f3072m = r7
            boolean r7 = r13.f3073n
            float r10 = r2.mo11951u()
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x02f6
            r10 = 1
            goto L_0x02f7
        L_0x02f6:
            r10 = 0
        L_0x02f7:
            r7 = r7 | r10
            r13.f3073n = r7
            int[] r7 = r0.f3076c
            if (r7 == 0) goto L_0x0304
            int r10 = r8.size()
            r7[r14] = r10
        L_0x0304:
            int r7 = r13.f3060a
            if (r4 == 0) goto L_0x030d
            int r10 = r3.getMeasuredWidth()
            goto L_0x0311
        L_0x030d:
            int r10 = r3.getMeasuredHeight()
        L_0x0311:
            int r11 = r0.mo11967p(r2, r4)
            int r11 = r11 + r10
            int r10 = r0.mo11965n(r2, r4)
            int r10 = r10 + r11
            int r10 = r10 + r7
            r13.f3060a = r10
            float r7 = r13.f3065f
            float r10 = r2.mo11948n()
            float r10 = r10 + r7
            r13.f3065f = r10
            float r7 = r13.f3066g
            float r10 = r2.mo11951u()
            float r10 = r10 + r7
            r13.f3066g = r10
            b.l.a.b.a r7 = r0.f3074a
            com.google.android.flexbox.FlexboxLayoutManager r7 = (com.google.android.flexbox.FlexboxLayoutManager) r7
            android.graphics.Rect r10 = com.google.android.flexbox.FlexboxLayoutManager.f11193y
            r7.calculateItemDecorationsForChild(r3, r10)
            boolean r10 = r7.mo18811r()
            if (r10 == 0) goto L_0x0348
            int r10 = r7.getLeftDecorationWidth(r3)
            int r7 = r7.getRightDecorationWidth(r3)
            goto L_0x0350
        L_0x0348:
            int r10 = r7.getTopDecorationHeight(r3)
            int r7 = r7.getBottomDecorationHeight(r3)
        L_0x0350:
            int r7 = r7 + r10
            int r10 = r13.f3060a
            int r10 = r10 + r7
            r13.f3060a = r10
            int r10 = r13.f3061b
            int r10 = r10 + r7
            r13.f3061b = r10
            if (r4 == 0) goto L_0x0362
            int r7 = r3.getMeasuredHeight()
            goto L_0x0366
        L_0x0362:
            int r7 = r3.getMeasuredWidth()
        L_0x0366:
            int r10 = r0.mo11966o(r2, r4)
            int r10 = r10 + r7
            int r7 = r0.mo11964m(r2, r4)
            int r7 = r7 + r10
            b.l.a.b.a r10 = r0.f3074a
            com.google.android.flexbox.FlexboxLayoutManager r10 = (com.google.android.flexbox.FlexboxLayoutManager) r10
            int r10 = r10.mo18805l(r3)
            int r10 = r10 + r7
            int r6 = java.lang.Math.max(r6, r10)
            int r7 = r13.f3062c
            int r7 = java.lang.Math.max(r7, r6)
            r13.f3062c = r7
            if (r4 == 0) goto L_0x03b2
            b.l.a.b.a r7 = r0.f3074a
            com.google.android.flexbox.FlexboxLayoutManager r7 = (com.google.android.flexbox.FlexboxLayoutManager) r7
            int r7 = r7.f11195b
            r10 = 2
            if (r7 == r10) goto L_0x039c
            int r7 = r13.f3067h
            int r3 = r3.getBaseline()
            int r2 = r2.mo11944U()
            int r2 = r2 + r3
            goto L_0x03ac
        L_0x039c:
            int r7 = r13.f3067h
            int r10 = r3.getMeasuredHeight()
            int r3 = r3.getBaseline()
            int r10 = r10 - r3
            int r2 = r2.mo11941K()
            int r2 = r2 + r10
        L_0x03ac:
            int r2 = java.lang.Math.max(r7, r2)
            r13.f3067h = r2
        L_0x03b2:
            r2 = r30
            boolean r3 = r0.mo11968q(r14, r2, r13)
            if (r3 == 0) goto L_0x03c0
            r0.mo11952a(r8, r13, r14, r15)
            int r3 = r13.f3062c
            int r15 = r15 + r3
        L_0x03c0:
            r3 = -1
            r7 = r29
            if (r7 == r3) goto L_0x03e0
            int r3 = r8.size()
            if (r3 <= 0) goto L_0x03e0
            r3 = 1
            java.lang.Object r10 = p005b.p035e.p036a.p037a.C0843a.m437M(r8, r3)
            b.l.a.b.c r10 = (p005b.p096l.p097a.p112b.C1745c) r10
            int r10 = r10.f3071l
            if (r10 < r7) goto L_0x03e0
            if (r14 < r7) goto L_0x03e0
            if (r28 != 0) goto L_0x03e0
            int r10 = r13.f3062c
            int r15 = -r10
            r10 = r27
            goto L_0x03e4
        L_0x03e0:
            r10 = r27
            r3 = r28
        L_0x03e4:
            if (r15 <= r10) goto L_0x03e9
            if (r3 == 0) goto L_0x03e9
            goto L_0x0400
        L_0x03e9:
            r16 = r6
            r17 = r21
        L_0x03ed:
            int r14 = r14 + 1
            r6 = r1
            r10 = r2
            r28 = r3
            r2 = r5
            r3 = r7
            r7 = r8
            r8 = r17
            r5 = r20
            r11 = r22
            r1 = r25
            goto L_0x0082
        L_0x0400:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p112b.C1746d.mo11953b(b.l.a.b.d$a, int, int, int, int, int, java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11954c(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            b.l.a.b.b r0 = (p005b.p096l.p097a.p112b.C1744b) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.mo11937E()
            r4 = 1
            if (r1 >= r3) goto L_0x001a
            int r1 = r0.mo11937E()
            goto L_0x0024
        L_0x001a:
            int r3 = r0.mo11943T()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.mo11943T()
        L_0x0024:
            r3 = r4
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.mo11936B()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.mo11936B()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.mo11939I()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.mo11939I()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0059
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.mo11975x(r8, r1, r0, r7)
            b.l.a.b.a r0 = r6.f3074a
            com.google.android.flexbox.FlexboxLayoutManager r0 = (com.google.android.flexbox.FlexboxLayoutManager) r0
            android.util.SparseArray<android.view.View> r0 = r0.f11213t
            r0.put(r8, r7)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p112b.C1746d.mo11954c(android.view.View, int):void");
    }

    /* renamed from: d */
    public void mo11955d(List<C1745c> list, int i) {
        int i2 = this.f3076c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        for (int size = list.size() - 1; size >= i2; size--) {
            list.remove(size);
        }
        int[] iArr = this.f3076c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f3077d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0);
        } else {
            Arrays.fill(jArr, i, length2, 0);
        }
    }

    /* renamed from: e */
    public void mo11956e(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int n = ((FlexboxLayoutManager) this.f3074a).mo18807n();
        boolean[] zArr = this.f3075b;
        int i7 = 0;
        if (zArr == null) {
            if (n < 10) {
                n = 10;
            }
            this.f3075b = new boolean[n];
        } else if (zArr.length < n) {
            int length = zArr.length * 2;
            if (length >= n) {
                n = length;
            }
            this.f3075b = new boolean[n];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 < ((FlexboxLayoutManager) this.f3074a).mo18807n()) {
            C1743a aVar = this.f3074a;
            int i8 = ((FlexboxLayoutManager) aVar).f11194a;
            int i9 = ((FlexboxLayoutManager) aVar).f11194a;
            if (i9 == 0 || i9 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                int o = ((FlexboxLayoutManager) this.f3074a).mo18808o();
                if (mode != 1073741824 && o <= size) {
                    size = o;
                }
                i6 = this.f3074a.getPaddingLeft();
                i4 = this.f3074a.getPaddingRight();
            } else if (i9 == 2 || i9 == 3) {
                int mode2 = View.MeasureSpec.getMode(i2);
                i5 = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    i5 = ((FlexboxLayoutManager) this.f3074a).mo18808o();
                }
                i6 = this.f3074a.getPaddingTop();
                i4 = this.f3074a.getPaddingBottom();
            } else {
                throw new IllegalArgumentException(C0843a.m444e("Invalid flex direction: ", i8));
            }
            int i10 = i4 + i6;
            int[] iArr = this.f3076c;
            if (iArr != null) {
                i7 = iArr[i3];
            }
            List<C1745c> list = ((FlexboxLayoutManager) this.f3074a).f11200g;
            int size2 = list.size();
            while (i7 < size2) {
                C1745c cVar = list.get(i7);
                int i11 = cVar.f3060a;
                if (i11 < i5 && cVar.f3072m) {
                    mo11960i(i, i2, cVar, i5, i10, false);
                } else if (i11 > i5 && cVar.f3073n) {
                    mo11971t(i, i2, cVar, i5, i10, false);
                }
                i7++;
            }
        }
    }

    /* renamed from: f */
    public void mo11957f(int i) {
        int[] iArr = this.f3076c;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f3076c = new int[i];
        } else if (iArr.length < i) {
            int length = iArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f3076c = Arrays.copyOf(iArr, i);
        }
    }

    /* renamed from: g */
    public void mo11958g(int i) {
        long[] jArr = this.f3077d;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f3077d = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f3077d = Arrays.copyOf(jArr, i);
        }
    }

    /* renamed from: h */
    public void mo11959h(int i) {
        long[] jArr = this.f3078e;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f3078e = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f3078e = Arrays.copyOf(jArr, i);
        }
    }

    /* renamed from: i */
    public final void mo11960i(int i, int i2, C1745c cVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d;
        int i8;
        double d2;
        C1745c cVar2 = cVar;
        int i9 = i3;
        float f = cVar2.f3065f;
        float f2 = 0.0f;
        if (f > 0.0f && i9 >= (i5 = cVar2.f3060a)) {
            float f3 = ((float) (i9 - i5)) / f;
            cVar2.f3060a = i4 + cVar2.f3061b;
            if (!z) {
                cVar2.f3062c = Integer.MIN_VALUE;
            }
            int i10 = 0;
            boolean z2 = false;
            int i11 = 0;
            float f4 = 0.0f;
            while (i10 < cVar2.f3063d) {
                int i12 = cVar2.f3070k + i10;
                View m = ((FlexboxLayoutManager) this.f3074a).mo18806m(i12);
                if (m == null || m.getVisibility() == 8) {
                    int i13 = i2;
                    i6 = i5;
                } else {
                    C1744b bVar = (C1744b) m.getLayoutParams();
                    int i14 = ((FlexboxLayoutManager) this.f3074a).f11194a;
                    if (i14 == 0 || i14 == 1) {
                        int i15 = i5;
                        int i16 = i;
                        int measuredWidth = m.getMeasuredWidth();
                        long[] jArr = this.f3078e;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i12];
                        }
                        int measuredHeight = m.getMeasuredHeight();
                        long[] jArr2 = this.f3078e;
                        i6 = i15;
                        if (jArr2 != null) {
                            measuredHeight = mo11961j(jArr2[i12]);
                        }
                        if (this.f3075b[i12] || bVar.mo11948n() <= 0.0f) {
                            int i17 = i2;
                        } else {
                            float n = (bVar.mo11948n() * f3) + ((float) measuredWidth);
                            if (i10 == cVar2.f3063d - 1) {
                                n += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(n);
                            if (round > bVar.mo11943T()) {
                                round = bVar.mo11943T();
                                this.f3075b[i12] = true;
                                cVar2.f3065f -= bVar.mo11948n();
                                z2 = true;
                            } else {
                                float f5 = (n - ((float) round)) + f4;
                                double d3 = (double) f5;
                                if (d3 > 1.0d) {
                                    round++;
                                    d = d3 - 1.0d;
                                } else {
                                    if (d3 < -1.0d) {
                                        round--;
                                        d = d3 + 1.0d;
                                    }
                                    f4 = f5;
                                }
                                f5 = (float) d;
                                f4 = f5;
                            }
                            int k = mo11962k(i2, bVar, cVar2.f3068i);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, BasicMeasure.EXACTLY);
                            m.measure(makeMeasureSpec, k);
                            int measuredWidth2 = m.getMeasuredWidth();
                            int measuredHeight2 = m.getMeasuredHeight();
                            mo11975x(i12, makeMeasureSpec, k, m);
                            ((FlexboxLayoutManager) this.f3074a).f11213t.put(i12, m);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i11, ((FlexboxLayoutManager) this.f3074a).mo18805l(m) + bVar.mo11941K() + bVar.mo11944U() + measuredHeight);
                        cVar2.f3060a = bVar.mo11935A() + bVar.mo11942M() + measuredWidth + cVar2.f3060a;
                        i7 = max;
                    } else {
                        int measuredHeight3 = m.getMeasuredHeight();
                        long[] jArr3 = this.f3078e;
                        if (jArr3 != null) {
                            measuredHeight3 = mo11961j(jArr3[i12]);
                        }
                        int measuredWidth3 = m.getMeasuredWidth();
                        long[] jArr4 = this.f3078e;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i12];
                        }
                        if (this.f3075b[i12] || bVar.mo11948n() <= f2) {
                            i8 = i5;
                            int i18 = i;
                        } else {
                            float n2 = (bVar.mo11948n() * f3) + ((float) measuredHeight3);
                            if (i10 == cVar2.f3063d - 1) {
                                n2 += f4;
                                f4 = f2;
                            }
                            int round2 = Math.round(n2);
                            if (round2 > bVar.mo11939I()) {
                                round2 = bVar.mo11939I();
                                this.f3075b[i12] = true;
                                cVar2.f3065f -= bVar.mo11948n();
                                i8 = i5;
                                z2 = true;
                            } else {
                                float f6 = (n2 - ((float) round2)) + f4;
                                i8 = i5;
                                double d4 = (double) f6;
                                if (d4 > 1.0d) {
                                    round2++;
                                    d2 = d4 - 1.0d;
                                } else if (d4 < -1.0d) {
                                    round2--;
                                    d2 = d4 + 1.0d;
                                } else {
                                    f4 = f6;
                                }
                                f4 = (float) d2;
                            }
                            int l = mo11963l(i, bVar, cVar2.f3068i);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, BasicMeasure.EXACTLY);
                            m.measure(l, makeMeasureSpec2);
                            measuredWidth3 = m.getMeasuredWidth();
                            int measuredHeight4 = m.getMeasuredHeight();
                            mo11975x(i12, l, makeMeasureSpec2, m);
                            ((FlexboxLayoutManager) this.f3074a).f11213t.put(i12, m);
                            measuredHeight3 = measuredHeight4;
                        }
                        i7 = Math.max(i11, ((FlexboxLayoutManager) this.f3074a).mo18805l(m) + bVar.mo11935A() + bVar.mo11942M() + measuredWidth3);
                        cVar2.f3060a = bVar.mo11941K() + bVar.mo11944U() + measuredHeight3 + cVar2.f3060a;
                        int i19 = i2;
                        i6 = i8;
                    }
                    cVar2.f3062c = Math.max(cVar2.f3062c, i7);
                    i11 = i7;
                }
                i10++;
                i5 = i6;
                f2 = 0.0f;
            }
            int i20 = i2;
            int i21 = i5;
            if (z2 && i21 != cVar2.f3060a) {
                mo11960i(i, i2, cVar, i3, i4, true);
            }
        }
    }

    /* renamed from: j */
    public int mo11961j(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: k */
    public final int mo11962k(int i, C1744b bVar, int i2) {
        int i3;
        C1743a aVar = this.f3074a;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) aVar;
        int j = flexboxLayoutManager.mo18803j(i, bVar.mo11941K() + bVar.mo11944U() + this.f3074a.getPaddingBottom() + aVar.getPaddingTop() + i2, bVar.getHeight());
        int size = View.MeasureSpec.getSize(j);
        if (size > bVar.mo11939I()) {
            i3 = bVar.mo11939I();
        } else if (size >= bVar.mo11936B()) {
            return j;
        } else {
            i3 = bVar.mo11936B();
        }
        return View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(j));
    }

    /* renamed from: l */
    public final int mo11963l(int i, C1744b bVar, int i2) {
        int i3;
        C1743a aVar = this.f3074a;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) aVar;
        int k = flexboxLayoutManager.mo18804k(i, bVar.mo11935A() + bVar.mo11942M() + this.f3074a.getPaddingRight() + aVar.getPaddingLeft() + i2, bVar.getWidth());
        int size = View.MeasureSpec.getSize(k);
        if (size > bVar.mo11943T()) {
            i3 = bVar.mo11943T();
        } else if (size >= bVar.mo11937E()) {
            return k;
        } else {
            i3 = bVar.mo11937E();
        }
        return View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(k));
    }

    /* renamed from: m */
    public final int mo11964m(C1744b bVar, boolean z) {
        return z ? bVar.mo11941K() : bVar.mo11935A();
    }

    /* renamed from: n */
    public final int mo11965n(C1744b bVar, boolean z) {
        return z ? bVar.mo11935A() : bVar.mo11941K();
    }

    /* renamed from: o */
    public final int mo11966o(C1744b bVar, boolean z) {
        return z ? bVar.mo11944U() : bVar.mo11942M();
    }

    /* renamed from: p */
    public final int mo11967p(C1744b bVar, boolean z) {
        return z ? bVar.mo11942M() : bVar.mo11944U();
    }

    /* renamed from: q */
    public final boolean mo11968q(int i, int i2, C1745c cVar) {
        return i == i2 - 1 && cVar.f3063d - cVar.f3064e != 0;
    }

    /* renamed from: r */
    public void mo11969r(View view, C1745c cVar, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int K;
        int i10;
        C1744b bVar = (C1744b) view.getLayoutParams();
        int i11 = ((FlexboxLayoutManager) this.f3074a).f11196c;
        if (bVar.mo11950r() != -1) {
            i11 = bVar.mo11950r();
        }
        int i12 = cVar.f3062c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    int U = ((bVar.mo11944U() + (i12 - view.getMeasuredHeight())) - bVar.mo11941K()) / 2;
                    int i13 = ((FlexboxLayoutManager) this.f3074a).f11195b != 2 ? i2 + U : i2 - U;
                    view.layout(i, i13, i3, view.getMeasuredHeight() + i13);
                    return;
                } else if (i11 == 3) {
                    int i14 = ((FlexboxLayoutManager) this.f3074a).f11195b;
                    int i15 = cVar.f3067h;
                    if (i14 != 2) {
                        i10 = Math.max(i15 - view.getBaseline(), bVar.mo11944U());
                        i6 = i2 + i10;
                    } else {
                        i7 = Math.max(view.getBaseline() + (i15 - view.getMeasuredHeight()), bVar.mo11941K());
                        K = i2 - i7;
                        i5 = i4 - i7;
                        view.layout(i, i6, i3, i5);
                    }
                } else if (i11 != 4) {
                    return;
                }
            } else if (((FlexboxLayoutManager) this.f3074a).f11195b != 2) {
                int i16 = i2 + i12;
                i9 = (i16 - view.getMeasuredHeight()) - bVar.mo11941K();
                i8 = i16 - bVar.mo11941K();
                view.layout(i, i9, i3, i8);
                return;
            } else {
                i6 = bVar.mo11944U() + view.getMeasuredHeight() + (i2 - i12);
                i10 = view.getMeasuredHeight() + (i4 - i12);
                i4 = bVar.mo11944U();
            }
            i5 = i4 + i10;
            view.layout(i, i6, i3, i5);
        }
        if (((FlexboxLayoutManager) this.f3074a).f11195b != 2) {
            i9 = bVar.mo11944U() + i2;
            i8 = bVar.mo11944U() + i4;
            view.layout(i, i9, i3, i8);
            return;
        }
        K = i2 - bVar.mo11941K();
        i7 = bVar.mo11941K();
        i5 = i4 - i7;
        view.layout(i, i6, i3, i5);
    }

    /* renamed from: s */
    public void mo11970s(View view, C1745c cVar, boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        C1744b bVar = (C1744b) view.getLayoutParams();
        int i7 = ((FlexboxLayoutManager) this.f3074a).f11196c;
        if (bVar.mo11950r() != -1) {
            i7 = bVar.mo11950r();
        }
        int i8 = cVar.f3062c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int marginStart = ((MarginLayoutParamsCompat.getMarginStart(marginLayoutParams) + (i8 - view.getMeasuredWidth())) - MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) / 2;
                    if (!z) {
                        i6 = i + marginStart;
                        i5 = i3 + marginStart;
                    } else {
                        i6 = i - marginStart;
                        i5 = i3 - marginStart;
                    }
                    view.layout(i6, i2, i5, i4);
                } else if (!(i7 == 3 || i7 == 4)) {
                    return;
                }
            } else if (!z) {
                i6 = ((i + i8) - view.getMeasuredWidth()) - bVar.mo11935A();
                i3 = (i3 + i8) - view.getMeasuredWidth();
                i5 = i3 - bVar.mo11935A();
                view.layout(i6, i2, i5, i4);
            } else {
                int M = bVar.mo11942M();
                view.layout(bVar.mo11942M() + view.getMeasuredWidth() + (i - i8), i2, M + view.getMeasuredWidth() + (i3 - i8), i4);
                return;
            }
        }
        if (!z) {
            view.layout(bVar.mo11942M() + i, i2, bVar.mo11942M() + i3, i4);
            return;
        }
        i6 = i - bVar.mo11935A();
        i5 = i3 - bVar.mo11935A();
        view.layout(i6, i2, i5, i4);
    }

    /* renamed from: t */
    public final void mo11971t(int i, int i2, C1745c cVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C1745c cVar2 = cVar;
        int i10 = i3;
        int i11 = cVar2.f3060a;
        float f = cVar2.f3066g;
        float f2 = 0.0f;
        if (f > 0.0f && i10 <= i11) {
            float f3 = ((float) (i11 - i10)) / f;
            cVar2.f3060a = i4 + cVar2.f3061b;
            if (!z) {
                cVar2.f3062c = Integer.MIN_VALUE;
            }
            int i12 = 0;
            boolean z2 = false;
            int i13 = 0;
            float f4 = 0.0f;
            while (i12 < cVar2.f3063d) {
                int i14 = cVar2.f3070k + i12;
                View m = ((FlexboxLayoutManager) this.f3074a).mo18806m(i14);
                if (m == null || m.getVisibility() == 8) {
                    int i15 = i2;
                    i6 = i11;
                    i5 = i12;
                } else {
                    C1744b bVar = (C1744b) m.getLayoutParams();
                    int i16 = ((FlexboxLayoutManager) this.f3074a).f11194a;
                    if (i16 == 0 || i16 == 1) {
                        i6 = i11;
                        int i17 = i12;
                        int i18 = i;
                        int measuredWidth = m.getMeasuredWidth();
                        long[] jArr = this.f3078e;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i14];
                        }
                        int measuredHeight = m.getMeasuredHeight();
                        long[] jArr2 = this.f3078e;
                        int i19 = i17;
                        if (jArr2 != null) {
                            measuredHeight = mo11961j(jArr2[i14]);
                        }
                        if (this.f3075b[i14] || bVar.mo11951u() <= 0.0f) {
                            int i20 = i2;
                            i8 = i19;
                        } else {
                            float u = ((float) measuredWidth) - (bVar.mo11951u() * f3);
                            i8 = i19;
                            if (i8 == cVar2.f3063d - 1) {
                                u += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(u);
                            if (round < bVar.mo11937E()) {
                                i9 = bVar.mo11937E();
                                this.f3075b[i14] = true;
                                cVar2.f3066g -= bVar.mo11951u();
                                z2 = true;
                            } else {
                                float f5 = (u - ((float) round)) + f4;
                                double d = (double) f5;
                                if (d > 1.0d) {
                                    round++;
                                    f5 -= 1.0f;
                                } else if (d < -1.0d) {
                                    round--;
                                    f5 += 1.0f;
                                }
                                f4 = f5;
                                i9 = round;
                            }
                            int k = mo11962k(i2, bVar, cVar2.f3068i);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, BasicMeasure.EXACTLY);
                            m.measure(makeMeasureSpec, k);
                            int measuredWidth2 = m.getMeasuredWidth();
                            int measuredHeight2 = m.getMeasuredHeight();
                            mo11975x(i14, makeMeasureSpec, k, m);
                            ((FlexboxLayoutManager) this.f3074a).f11213t.put(i14, m);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i13, ((FlexboxLayoutManager) this.f3074a).mo18805l(m) + bVar.mo11941K() + bVar.mo11944U() + measuredHeight);
                        cVar2.f3060a = bVar.mo11935A() + bVar.mo11942M() + measuredWidth + cVar2.f3060a;
                        i7 = max;
                    } else {
                        int measuredHeight3 = m.getMeasuredHeight();
                        long[] jArr3 = this.f3078e;
                        if (jArr3 != null) {
                            measuredHeight3 = mo11961j(jArr3[i14]);
                        }
                        int measuredWidth3 = m.getMeasuredWidth();
                        long[] jArr4 = this.f3078e;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i14];
                        }
                        if (this.f3075b[i14] || bVar.mo11951u() <= f2) {
                            i6 = i11;
                            i5 = i12;
                            int i21 = i;
                        } else {
                            float u2 = ((float) measuredHeight3) - (bVar.mo11951u() * f3);
                            if (i12 == cVar2.f3063d - 1) {
                                u2 += f4;
                                f4 = f2;
                            }
                            int round2 = Math.round(u2);
                            if (round2 < bVar.mo11936B()) {
                                int B = bVar.mo11936B();
                                this.f3075b[i14] = true;
                                cVar2.f3066g -= bVar.mo11951u();
                                i5 = i12;
                                round2 = B;
                                z2 = true;
                                i6 = i11;
                            } else {
                                float f6 = (u2 - ((float) round2)) + f4;
                                i6 = i11;
                                i5 = i12;
                                double d2 = (double) f6;
                                if (d2 > 1.0d) {
                                    round2++;
                                    f6 -= 1.0f;
                                } else if (d2 < -1.0d) {
                                    round2--;
                                    f6 += 1.0f;
                                }
                                f4 = f6;
                            }
                            int l = mo11963l(i, bVar, cVar2.f3068i);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, BasicMeasure.EXACTLY);
                            m.measure(l, makeMeasureSpec2);
                            measuredWidth3 = m.getMeasuredWidth();
                            int measuredHeight4 = m.getMeasuredHeight();
                            mo11975x(i14, l, makeMeasureSpec2, m);
                            ((FlexboxLayoutManager) this.f3074a).f11213t.put(i14, m);
                            measuredHeight3 = measuredHeight4;
                        }
                        i7 = Math.max(i13, ((FlexboxLayoutManager) this.f3074a).mo18805l(m) + bVar.mo11935A() + bVar.mo11942M() + measuredWidth3);
                        cVar2.f3060a = bVar.mo11941K() + bVar.mo11944U() + measuredHeight3 + cVar2.f3060a;
                        int i22 = i2;
                    }
                    cVar2.f3062c = Math.max(cVar2.f3062c, i7);
                    i13 = i7;
                }
                i12 = i5 + 1;
                i11 = i6;
                f2 = 0.0f;
            }
            int i23 = i2;
            int i24 = i11;
            if (z2 && i24 != cVar2.f3060a) {
                mo11971t(i, i2, cVar, i3, i4, true);
            }
        }
    }

    /* renamed from: u */
    public final void mo11972u(View view, int i, int i2) {
        C1744b bVar = (C1744b) view.getLayoutParams();
        int min = Math.min(Math.max(((i - bVar.mo11942M()) - bVar.mo11935A()) - ((FlexboxLayoutManager) this.f3074a).mo18805l(view), bVar.mo11937E()), bVar.mo11943T());
        long[] jArr = this.f3078e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? mo11961j(jArr[i2]) : view.getMeasuredHeight(), BasicMeasure.EXACTLY);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, BasicMeasure.EXACTLY);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        mo11975x(i2, makeMeasureSpec2, makeMeasureSpec, view);
        ((FlexboxLayoutManager) this.f3074a).f11213t.put(i2, view);
    }

    /* renamed from: v */
    public final void mo11973v(View view, int i, int i2) {
        C1744b bVar = (C1744b) view.getLayoutParams();
        int min = Math.min(Math.max(((i - bVar.mo11944U()) - bVar.mo11941K()) - ((FlexboxLayoutManager) this.f3074a).mo18805l(view), bVar.mo11936B()), bVar.mo11939I());
        long[] jArr = this.f3078e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), BasicMeasure.EXACTLY);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, BasicMeasure.EXACTLY);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        mo11975x(i2, makeMeasureSpec, makeMeasureSpec2, view);
        ((FlexboxLayoutManager) this.f3074a).f11213t.put(i2, view);
    }

    /* renamed from: w */
    public void mo11974w(int i) {
        View m;
        if (i < ((FlexboxLayoutManager) this.f3074a).mo18807n()) {
            C1743a aVar = this.f3074a;
            int i2 = ((FlexboxLayoutManager) aVar).f11194a;
            if (((FlexboxLayoutManager) aVar).f11196c == 4) {
                int[] iArr = this.f3076c;
                List<C1745c> list = ((FlexboxLayoutManager) aVar).f11200g;
                int size = list.size();
                for (int i3 = iArr != null ? iArr[i] : 0; i3 < size; i3++) {
                    C1745c cVar = list.get(i3);
                    int i4 = cVar.f3063d;
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = cVar.f3070k + i5;
                        if (!(i5 >= ((FlexboxLayoutManager) this.f3074a).mo18807n() || (m = ((FlexboxLayoutManager) this.f3074a).mo18806m(i6)) == null || m.getVisibility() == 8)) {
                            C1744b bVar = (C1744b) m.getLayoutParams();
                            if (bVar.mo11950r() == -1 || bVar.mo11950r() == 4) {
                                if (i2 == 0 || i2 == 1) {
                                    mo11973v(m, cVar.f3062c, i6);
                                } else if (i2 == 2 || i2 == 3) {
                                    mo11972u(m, cVar.f3062c, i6);
                                } else {
                                    throw new IllegalArgumentException(C0843a.m444e("Invalid flex direction: ", i2));
                                }
                            }
                        }
                    }
                }
                return;
            }
            for (C1745c next : ((FlexboxLayoutManager) aVar).f11200g) {
                Iterator<Integer> it = next.f3069j.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer next2 = it.next();
                        View m2 = ((FlexboxLayoutManager) this.f3074a).mo18806m(next2.intValue());
                        if (i2 == 0 || i2 == 1) {
                            mo11973v(m2, next.f3062c, next2.intValue());
                        } else if (i2 == 2 || i2 == 3) {
                            mo11972u(m2, next.f3062c, next2.intValue());
                        } else {
                            throw new IllegalArgumentException(C0843a.m444e("Invalid flex direction: ", i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: x */
    public final void mo11975x(int i, int i2, int i3, View view) {
        long[] jArr = this.f3077d;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = this.f3078e;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredWidth()) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }
}
