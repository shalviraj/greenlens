package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p112b.C1743a;
import p005b.p096l.p097a.p112b.C1744b;
import p005b.p096l.p097a.p112b.C1745c;
import p005b.p096l.p097a.p112b.C1746d;

public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements C1743a, RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* renamed from: y */
    public static final Rect f11193y = new Rect();

    /* renamed from: a */
    public int f11194a;

    /* renamed from: b */
    public int f11195b;

    /* renamed from: c */
    public int f11196c;

    /* renamed from: d */
    public int f11197d = -1;

    /* renamed from: e */
    public boolean f11198e;

    /* renamed from: f */
    public boolean f11199f;

    /* renamed from: g */
    public List<C1745c> f11200g = new ArrayList();

    /* renamed from: h */
    public final C1746d f11201h = new C1746d(this);

    /* renamed from: i */
    public RecyclerView.Recycler f11202i;

    /* renamed from: j */
    public RecyclerView.State f11203j;

    /* renamed from: k */
    public C5466d f11204k;

    /* renamed from: l */
    public C5463b f11205l = new C5463b((C5462a) null);

    /* renamed from: m */
    public OrientationHelper f11206m;

    /* renamed from: n */
    public OrientationHelper f11207n;

    /* renamed from: o */
    public C5467e f11208o;

    /* renamed from: p */
    public int f11209p = -1;

    /* renamed from: q */
    public int f11210q = Integer.MIN_VALUE;

    /* renamed from: r */
    public int f11211r = Integer.MIN_VALUE;

    /* renamed from: s */
    public int f11212s = Integer.MIN_VALUE;

    /* renamed from: t */
    public SparseArray<View> f11213t = new SparseArray<>();

    /* renamed from: u */
    public final Context f11214u;

    /* renamed from: v */
    public View f11215v;

    /* renamed from: w */
    public int f11216w = -1;

    /* renamed from: x */
    public C1746d.C1747a f11217x = new C1746d.C1747a();

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$b */
    public class C5463b {

        /* renamed from: a */
        public int f11218a;

        /* renamed from: b */
        public int f11219b;

        /* renamed from: c */
        public int f11220c;

        /* renamed from: d */
        public int f11221d = 0;

        /* renamed from: e */
        public boolean f11222e;

        /* renamed from: f */
        public boolean f11223f;

        /* renamed from: g */
        public boolean f11224g;

        public C5463b(C5462a aVar) {
        }

        /* renamed from: a */
        public static void m10351a(C5463b bVar) {
            int i;
            FlexboxLayoutManager flexboxLayoutManager;
            if (!FlexboxLayoutManager.this.mo18811r()) {
                flexboxLayoutManager = FlexboxLayoutManager.this;
                if (flexboxLayoutManager.f11198e) {
                    if (!bVar.f11222e) {
                        i = flexboxLayoutManager.getWidth() - FlexboxLayoutManager.this.f11206m.getStartAfterPadding();
                        bVar.f11220c = i;
                    }
                    i = flexboxLayoutManager.f11206m.getEndAfterPadding();
                    bVar.f11220c = i;
                }
            }
            if (bVar.f11222e) {
                flexboxLayoutManager = FlexboxLayoutManager.this;
                i = flexboxLayoutManager.f11206m.getEndAfterPadding();
                bVar.f11220c = i;
            }
            i = FlexboxLayoutManager.this.f11206m.getStartAfterPadding();
            bVar.f11220c = i;
        }

        /* renamed from: b */
        public static void m10352b(C5463b bVar) {
            FlexboxLayoutManager flexboxLayoutManager;
            int i;
            FlexboxLayoutManager flexboxLayoutManager2;
            int i2;
            bVar.f11218a = -1;
            bVar.f11219b = -1;
            bVar.f11220c = Integer.MIN_VALUE;
            boolean z = false;
            bVar.f11223f = false;
            bVar.f11224g = false;
            if (!FlexboxLayoutManager.this.mo18811r() ? !((i = flexboxLayoutManager.f11195b) != 0 ? i != 2 : (flexboxLayoutManager = FlexboxLayoutManager.this).f11194a != 3) : !((i2 = flexboxLayoutManager2.f11195b) != 0 ? i2 != 2 : (flexboxLayoutManager2 = FlexboxLayoutManager.this).f11194a != 1)) {
                z = true;
            }
            bVar.f11222e = z;
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("AnchorInfo{mPosition=");
            u.append(this.f11218a);
            u.append(", mFlexLinePosition=");
            u.append(this.f11219b);
            u.append(", mCoordinate=");
            u.append(this.f11220c);
            u.append(", mPerpendicularCoordinate=");
            u.append(this.f11221d);
            u.append(", mLayoutFromEnd=");
            u.append(this.f11222e);
            u.append(", mValid=");
            u.append(this.f11223f);
            u.append(", mAssignedFromSavedState=");
            u.append(this.f11224g);
            u.append('}');
            return u.toString();
        }
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$c */
    public static class C5464c extends RecyclerView.LayoutParams implements C1744b {
        public static final Parcelable.Creator<C5464c> CREATOR = new C5465a();

        /* renamed from: g */
        public float f11226g = 0.0f;

        /* renamed from: h */
        public float f11227h = 1.0f;

        /* renamed from: i */
        public int f11228i = -1;

        /* renamed from: j */
        public float f11229j = -1.0f;

        /* renamed from: k */
        public int f11230k;

        /* renamed from: l */
        public int f11231l;

        /* renamed from: m */
        public int f11232m = ViewCompat.MEASURED_SIZE_MASK;

        /* renamed from: n */
        public int f11233n = ViewCompat.MEASURED_SIZE_MASK;

        /* renamed from: o */
        public boolean f11234o;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$c$a */
        public static class C5465a implements Parcelable.Creator<C5464c> {
            public Object createFromParcel(Parcel parcel) {
                return new C5464c(parcel);
            }

            public Object[] newArray(int i) {
                return new C5464c[i];
            }
        }

        public C5464c(int i, int i2) {
            super(i, i2);
        }

        public C5464c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C5464c(Parcel parcel) {
            super(-2, -2);
            this.f11226g = parcel.readFloat();
            this.f11227h = parcel.readFloat();
            this.f11228i = parcel.readInt();
            this.f11229j = parcel.readFloat();
            this.f11230k = parcel.readInt();
            this.f11231l = parcel.readInt();
            this.f11232m = parcel.readInt();
            this.f11233n = parcel.readInt();
            this.f11234o = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        /* renamed from: A */
        public int mo11935A() {
            return this.rightMargin;
        }

        /* renamed from: B */
        public int mo11936B() {
            return this.f11231l;
        }

        /* renamed from: E */
        public int mo11937E() {
            return this.f11230k;
        }

        /* renamed from: F */
        public boolean mo11938F() {
            return this.f11234o;
        }

        /* renamed from: I */
        public int mo11939I() {
            return this.f11233n;
        }

        /* renamed from: J */
        public void mo11940J(int i) {
            this.f11230k = i;
        }

        /* renamed from: K */
        public int mo11941K() {
            return this.bottomMargin;
        }

        /* renamed from: M */
        public int mo11942M() {
            return this.leftMargin;
        }

        /* renamed from: T */
        public int mo11943T() {
            return this.f11232m;
        }

        /* renamed from: U */
        public int mo11944U() {
            return this.topMargin;
        }

        public int describeContents() {
            return 0;
        }

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }

        /* renamed from: l */
        public void mo11947l(int i) {
            this.f11231l = i;
        }

        /* renamed from: n */
        public float mo11948n() {
            return this.f11226g;
        }

        /* renamed from: q */
        public float mo11949q() {
            return this.f11229j;
        }

        /* renamed from: r */
        public int mo11950r() {
            return this.f11228i;
        }

        /* renamed from: u */
        public float mo11951u() {
            return this.f11227h;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f11226g);
            parcel.writeFloat(this.f11227h);
            parcel.writeInt(this.f11228i);
            parcel.writeFloat(this.f11229j);
            parcel.writeInt(this.f11230k);
            parcel.writeInt(this.f11231l);
            parcel.writeInt(this.f11232m);
            parcel.writeInt(this.f11233n);
            parcel.writeByte(this.f11234o ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$d */
    public static class C5466d {

        /* renamed from: a */
        public int f11235a;

        /* renamed from: b */
        public boolean f11236b;

        /* renamed from: c */
        public int f11237c;

        /* renamed from: d */
        public int f11238d;

        /* renamed from: e */
        public int f11239e;

        /* renamed from: f */
        public int f11240f;

        /* renamed from: g */
        public int f11241g;

        /* renamed from: h */
        public int f11242h = 1;

        /* renamed from: i */
        public int f11243i = 1;

        /* renamed from: j */
        public boolean f11244j;

        public C5466d(C5462a aVar) {
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("LayoutState{mAvailable=");
            u.append(this.f11235a);
            u.append(", mFlexLinePosition=");
            u.append(this.f11237c);
            u.append(", mPosition=");
            u.append(this.f11238d);
            u.append(", mOffset=");
            u.append(this.f11239e);
            u.append(", mScrollingOffset=");
            u.append(this.f11240f);
            u.append(", mLastScrollDelta=");
            u.append(this.f11241g);
            u.append(", mItemDirection=");
            u.append(this.f11242h);
            u.append(", mLayoutDirection=");
            u.append(this.f11243i);
            u.append('}');
            return u.toString();
        }
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$e */
    public static class C5467e implements Parcelable {
        public static final Parcelable.Creator<C5467e> CREATOR = new C5468a();

        /* renamed from: g */
        public int f11245g;

        /* renamed from: h */
        public int f11246h;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$e$a */
        public static class C5468a implements Parcelable.Creator<C5467e> {
            public Object createFromParcel(Parcel parcel) {
                return new C5467e(parcel, (C5462a) null);
            }

            public Object[] newArray(int i) {
                return new C5467e[i];
            }
        }

        public C5467e() {
        }

        public C5467e(Parcel parcel, C5462a aVar) {
            this.f11245g = parcel.readInt();
            this.f11246h = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("SavedState{mAnchorPosition=");
            u.append(this.f11245g);
            u.append(", mAnchorOffset=");
            u.append(this.f11246h);
            u.append('}');
            return u.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f11245g);
            parcel.writeInt(this.f11246h);
        }

        public C5467e(C5467e eVar, C5462a aVar) {
            this.f11245g = eVar.f11245g;
            this.f11246h = eVar.f11246h;
        }
    }

    public FlexboxLayoutManager(Context context) {
        mo18815v(0);
        mo18816w(1);
        mo18814u(4);
        setAutoMeasureEnabled(true);
        this.f11214u = context;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3;
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        int i4 = properties.orientation;
        if (i4 != 0) {
            i3 = i4 == 1 ? properties.reverseLayout ? 3 : 2 : i3;
            mo18816w(1);
            mo18814u(4);
            setAutoMeasureEnabled(true);
            this.f11214u = context;
        } else if (properties.reverseLayout) {
            mo18815v(1);
            mo18816w(1);
            mo18814u(4);
            setAutoMeasureEnabled(true);
            this.f11214u = context;
        } else {
            i3 = 0;
        }
        mo18815v(i3);
        mo18816w(1);
        mo18814u(4);
        setAutoMeasureEnabled(true);
        this.f11214u = context;
    }

    public static boolean isMeasurementUpToDate(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    private boolean shouldMeasureChild(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        return view.isLayoutRequested() || !isMeasurementCacheEnabled() || !isMeasurementUpToDate(view.getWidth(), i, layoutParams.width) || !isMeasurementUpToDate(view.getHeight(), i2, layoutParams.height);
    }

    /* renamed from: a */
    public final void mo18788a() {
        this.f11200g.clear();
        C5463b.m10352b(this.f11205l);
        this.f11205l.f11221d = 0;
    }

    /* renamed from: b */
    public final void mo18789b() {
        OrientationHelper orientationHelper;
        if (this.f11206m == null) {
            if (!mo18811r() ? this.f11195b != 0 : this.f11195b == 0) {
                this.f11206m = OrientationHelper.createHorizontalHelper(this);
                orientationHelper = OrientationHelper.createVerticalHelper(this);
            } else {
                this.f11206m = OrientationHelper.createVerticalHelper(this);
                orientationHelper = OrientationHelper.createHorizontalHelper(this);
            }
            this.f11207n = orientationHelper;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        r10 = r2.f11237c;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo18790c(androidx.recyclerview.widget.RecyclerView.Recycler r30, androidx.recyclerview.widget.RecyclerView.State r31, com.google.android.flexbox.FlexboxLayoutManager.C5466d r32) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r32
            int r3 = r2.f11240f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x0016
            int r5 = r2.f11235a
            if (r5 >= 0) goto L_0x0013
            int r3 = r3 + r5
            r2.f11240f = r3
        L_0x0013:
            r0.mo18812s(r1, r2)
        L_0x0016:
            int r3 = r2.f11235a
            boolean r5 = r29.mo18811r()
            r7 = r3
            r8 = 0
        L_0x001e:
            if (r7 > 0) goto L_0x0026
            com.google.android.flexbox.FlexboxLayoutManager$d r9 = r0.f11204k
            boolean r9 = r9.f11236b
            if (r9 == 0) goto L_0x02fd
        L_0x0026:
            java.util.List<b.l.a.b.c> r9 = r0.f11200g
            int r10 = r2.f11238d
            if (r10 < 0) goto L_0x003e
            int r12 = r31.getItemCount()
            if (r10 >= r12) goto L_0x003e
            int r10 = r2.f11237c
            if (r10 < 0) goto L_0x003e
            int r9 = r9.size()
            if (r10 >= r9) goto L_0x003e
            r9 = 1
            goto L_0x003f
        L_0x003e:
            r9 = 0
        L_0x003f:
            if (r9 == 0) goto L_0x02fd
            java.util.List<b.l.a.b.c> r9 = r0.f11200g
            int r10 = r2.f11237c
            java.lang.Object r9 = r9.get(r10)
            b.l.a.b.c r9 = (p005b.p096l.p097a.p112b.C1745c) r9
            int r10 = r9.f3070k
            r2.f11238d = r10
            boolean r10 = r29.mo18811r()
            r12 = 0
            r13 = -1
            if (r10 == 0) goto L_0x016f
            int r10 = r29.getPaddingLeft()
            int r14 = r29.getPaddingRight()
            int r15 = r29.getWidth()
            int r6 = r2.f11239e
            int r4 = r2.f11243i
            if (r4 != r13) goto L_0x006c
            int r4 = r9.f3062c
            int r6 = r6 - r4
        L_0x006c:
            int r4 = r2.f11238d
            float r10 = (float) r10
            int r15 = r15 - r14
            float r13 = (float) r15
            com.google.android.flexbox.FlexboxLayoutManager$b r14 = r0.f11205l
            int r14 = r14.f11221d
            float r14 = (float) r14
            float r10 = r10 - r14
            float r13 = r13 - r14
            float r19 = java.lang.Math.max(r12, r12)
            int r15 = r9.f3063d
            r14 = r4
            r12 = 0
        L_0x0080:
            int r11 = r4 + r15
            if (r14 >= r11) goto L_0x015c
            android.view.View r11 = r0.mo18806m(r14)
            if (r11 != 0) goto L_0x0094
            r22 = r3
            r21 = r4
            r25 = r14
            r26 = r15
            goto L_0x0152
        L_0x0094:
            r21 = r4
            int r4 = r2.f11243i
            r16 = r15
            r15 = 1
            if (r4 != r15) goto L_0x00a6
            android.graphics.Rect r4 = f11193y
            r0.calculateItemDecorationsForChild(r11, r4)
            r0.addView(r11)
            goto L_0x00b0
        L_0x00a6:
            android.graphics.Rect r4 = f11193y
            r0.calculateItemDecorationsForChild(r11, r4)
            r0.addView(r11, r12)
            int r12 = r12 + 1
        L_0x00b0:
            r4 = r12
            b.l.a.b.d r12 = r0.f11201h
            long[] r15 = r12.f3077d
            r22 = r3
            r23 = r4
            r3 = r15[r14]
            int r15 = (int) r3
            int r3 = r12.mo11961j(r3)
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            com.google.android.flexbox.FlexboxLayoutManager$c r4 = (com.google.android.flexbox.FlexboxLayoutManager.C5464c) r4
            boolean r12 = r0.shouldMeasureChild(r11, r15, r3, r4)
            if (r12 == 0) goto L_0x00cf
            r11.measure(r15, r3)
        L_0x00cf:
            int r3 = r4.leftMargin
            int r12 = r0.getLeftDecorationWidth(r11)
            int r12 = r12 + r3
            float r3 = (float) r12
            float r10 = r10 + r3
            int r3 = r4.rightMargin
            int r12 = r0.getRightDecorationWidth(r11)
            int r12 = r12 + r3
            float r3 = (float) r12
            float r3 = r13 - r3
            int r12 = r0.getTopDecorationHeight(r11)
            int r17 = r12 + r6
            boolean r12 = r0.f11198e
            if (r12 == 0) goto L_0x0106
            b.l.a.b.d r12 = r0.f11201h
            int r13 = java.lang.Math.round(r3)
            int r15 = r11.getMeasuredWidth()
            int r13 = r13 - r15
            int r15 = java.lang.Math.round(r3)
            int r18 = r11.getMeasuredHeight()
            int r18 = r18 + r17
            r24 = r18
            r18 = r15
            goto L_0x011e
        L_0x0106:
            b.l.a.b.d r12 = r0.f11201h
            int r13 = java.lang.Math.round(r10)
            int r15 = java.lang.Math.round(r10)
            int r18 = r11.getMeasuredWidth()
            int r18 = r18 + r15
            int r15 = r11.getMeasuredHeight()
            int r15 = r15 + r17
            r24 = r15
        L_0x011e:
            r15 = r13
            r13 = r11
            r25 = r14
            r14 = r9
            r26 = r16
            r16 = r17
            r17 = r18
            r18 = r24
            r12.mo11969r(r13, r14, r15, r16, r17, r18)
            int r12 = r11.getMeasuredWidth()
            int r13 = r4.rightMargin
            int r12 = r12 + r13
            int r13 = r0.getRightDecorationWidth(r11)
            int r13 = r13 + r12
            float r12 = (float) r13
            float r12 = r12 + r19
            float r12 = r12 + r10
            int r10 = r11.getMeasuredWidth()
            int r4 = r4.leftMargin
            int r10 = r10 + r4
            int r4 = r0.getLeftDecorationWidth(r11)
            int r4 = r4 + r10
            float r4 = (float) r4
            float r4 = r4 + r19
            float r3 = r3 - r4
            r13 = r3
            r10 = r12
            r12 = r23
        L_0x0152:
            int r14 = r25 + 1
            r4 = r21
            r3 = r22
            r15 = r26
            goto L_0x0080
        L_0x015c:
            r22 = r3
            int r3 = r2.f11237c
            com.google.android.flexbox.FlexboxLayoutManager$d r4 = r0.f11204k
            int r4 = r4.f11243i
            int r3 = r3 + r4
            r2.f11237c = r3
            int r3 = r9.f3062c
            r21 = r7
            r23 = r8
            goto L_0x02d4
        L_0x016f:
            r22 = r3
            int r3 = r29.getPaddingTop()
            int r4 = r29.getPaddingBottom()
            int r6 = r29.getHeight()
            int r10 = r2.f11239e
            int r11 = r2.f11243i
            if (r11 != r13) goto L_0x018b
            int r11 = r9.f3062c
            int r13 = r10 - r11
            int r10 = r10 + r11
            r11 = r10
            r10 = r13
            goto L_0x018c
        L_0x018b:
            r11 = r10
        L_0x018c:
            int r15 = r2.f11238d
            float r3 = (float) r3
            int r6 = r6 - r4
            float r4 = (float) r6
            com.google.android.flexbox.FlexboxLayoutManager$b r6 = r0.f11205l
            int r6 = r6.f11221d
            float r6 = (float) r6
            float r3 = r3 - r6
            float r4 = r4 - r6
            float r6 = java.lang.Math.max(r12, r12)
            int r14 = r9.f3063d
            r13 = r15
            r12 = 0
        L_0x01a0:
            int r1 = r15 + r14
            if (r13 >= r1) goto L_0x02c5
            android.view.View r1 = r0.mo18806m(r13)
            if (r1 != 0) goto L_0x01b8
            r21 = r7
            r23 = r8
            r26 = r13
            r27 = r14
            r20 = r15
            r28 = 1
            goto L_0x02b9
        L_0x01b8:
            r16 = r14
            b.l.a.b.d r14 = r0.f11201h
            r17 = r15
            long[] r15 = r14.f3077d
            r21 = r7
            r23 = r8
            r7 = r15[r13]
            int r15 = (int) r7
            int r7 = r14.mo11961j(r7)
            android.view.ViewGroup$LayoutParams r8 = r1.getLayoutParams()
            com.google.android.flexbox.FlexboxLayoutManager$c r8 = (com.google.android.flexbox.FlexboxLayoutManager.C5464c) r8
            boolean r14 = r0.shouldMeasureChild(r1, r15, r7, r8)
            if (r14 == 0) goto L_0x01da
            r1.measure(r15, r7)
        L_0x01da:
            int r7 = r8.topMargin
            int r14 = r0.getTopDecorationHeight(r1)
            int r14 = r14 + r7
            float r7 = (float) r14
            float r3 = r3 + r7
            int r7 = r8.rightMargin
            int r14 = r0.getBottomDecorationHeight(r1)
            int r14 = r14 + r7
            float r7 = (float) r14
            float r4 = r4 - r7
            int r7 = r2.f11243i
            r15 = 1
            if (r7 != r15) goto L_0x01fa
            android.graphics.Rect r7 = f11193y
            r0.calculateItemDecorationsForChild(r1, r7)
            r0.addView(r1)
            goto L_0x0204
        L_0x01fa:
            android.graphics.Rect r7 = f11193y
            r0.calculateItemDecorationsForChild(r1, r7)
            r0.addView(r1, r12)
            int r12 = r12 + 1
        L_0x0204:
            r7 = r12
            int r12 = r0.getLeftDecorationWidth(r1)
            int r12 = r12 + r10
            int r14 = r0.getRightDecorationWidth(r1)
            int r14 = r11 - r14
            boolean r15 = r0.f11198e
            if (r15 == 0) goto L_0x024a
            boolean r12 = r0.f11199f
            if (r12 == 0) goto L_0x022f
            b.l.a.b.d r12 = r0.f11201h
            int r18 = r1.getMeasuredWidth()
            int r18 = r14 - r18
            int r19 = java.lang.Math.round(r4)
            int r24 = r1.getMeasuredHeight()
            int r19 = r19 - r24
            int r24 = java.lang.Math.round(r4)
            goto L_0x0245
        L_0x022f:
            b.l.a.b.d r12 = r0.f11201h
            int r18 = r1.getMeasuredWidth()
            int r18 = r14 - r18
            int r19 = java.lang.Math.round(r3)
            int r24 = java.lang.Math.round(r3)
            int r25 = r1.getMeasuredHeight()
            int r24 = r25 + r24
        L_0x0245:
            r25 = r24
            r24 = r14
            goto L_0x0284
        L_0x024a:
            boolean r14 = r0.f11199f
            if (r14 == 0) goto L_0x0265
            b.l.a.b.d r14 = r0.f11201h
            int r18 = java.lang.Math.round(r4)
            int r19 = r1.getMeasuredHeight()
            int r18 = r18 - r19
            int r19 = r1.getMeasuredWidth()
            int r19 = r19 + r12
            int r24 = java.lang.Math.round(r4)
            goto L_0x027b
        L_0x0265:
            b.l.a.b.d r14 = r0.f11201h
            int r18 = java.lang.Math.round(r3)
            int r19 = r1.getMeasuredWidth()
            int r19 = r19 + r12
            int r24 = java.lang.Math.round(r3)
            int r25 = r1.getMeasuredHeight()
            int r24 = r25 + r24
        L_0x027b:
            r25 = r24
            r24 = r19
            r19 = r18
            r18 = r12
            r12 = r14
        L_0x0284:
            r26 = r13
            r13 = r1
            r27 = r16
            r14 = r9
            r20 = r17
            r28 = 1
            r16 = r18
            r17 = r19
            r18 = r24
            r19 = r25
            r12.mo11970s(r13, r14, r15, r16, r17, r18, r19)
            int r12 = r1.getMeasuredHeight()
            int r13 = r8.topMargin
            int r12 = r12 + r13
            int r13 = r0.getBottomDecorationHeight(r1)
            int r13 = r13 + r12
            float r12 = (float) r13
            float r12 = r12 + r6
            float r12 = r12 + r3
            int r3 = r1.getMeasuredHeight()
            int r8 = r8.bottomMargin
            int r3 = r3 + r8
            int r1 = r0.getTopDecorationHeight(r1)
            int r1 = r1 + r3
            float r1 = (float) r1
            float r1 = r1 + r6
            float r4 = r4 - r1
            r3 = r12
            r12 = r7
        L_0x02b9:
            int r13 = r26 + 1
            r15 = r20
            r7 = r21
            r8 = r23
            r14 = r27
            goto L_0x01a0
        L_0x02c5:
            r21 = r7
            r23 = r8
            int r1 = r2.f11237c
            com.google.android.flexbox.FlexboxLayoutManager$d r3 = r0.f11204k
            int r3 = r3.f11243i
            int r1 = r1 + r3
            r2.f11237c = r1
            int r3 = r9.f3062c
        L_0x02d4:
            int r8 = r23 + r3
            if (r5 != 0) goto L_0x02e7
            boolean r1 = r0.f11198e
            if (r1 == 0) goto L_0x02e7
            int r1 = r2.f11239e
            int r3 = r9.f3062c
            int r4 = r2.f11243i
            int r3 = r3 * r4
            int r1 = r1 - r3
            r2.f11239e = r1
            goto L_0x02f1
        L_0x02e7:
            int r1 = r2.f11239e
            int r3 = r9.f3062c
            int r4 = r2.f11243i
            int r3 = r3 * r4
            int r3 = r3 + r1
            r2.f11239e = r3
        L_0x02f1:
            int r1 = r9.f3062c
            int r7 = r21 - r1
            r1 = r30
            r3 = r22
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x001e
        L_0x02fd:
            r22 = r3
            r23 = r8
            int r1 = r2.f11235a
            int r1 = r1 - r23
            r2.f11235a = r1
            int r3 = r2.f11240f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x031b
            int r3 = r3 + r23
            r2.f11240f = r3
            if (r1 >= 0) goto L_0x0316
            int r3 = r3 + r1
            r2.f11240f = r3
        L_0x0316:
            r1 = r30
            r0.mo18812s(r1, r2)
        L_0x031b:
            int r1 = r2.f11235a
            int r3 = r22 - r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.mo18790c(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    public boolean canScrollHorizontally() {
        if (this.f11195b == 0) {
            return mo18811r();
        }
        if (mo18811r()) {
            int width = getWidth();
            View view = this.f11215v;
            return width > (view != null ? view.getWidth() : 0);
        }
    }

    public boolean canScrollVertically() {
        if (this.f11195b == 0) {
            return !mo18811r();
        }
        if (mo18811r()) {
            return true;
        }
        int height = getHeight();
        View view = this.f11215v;
        return height > (view != null ? view.getHeight() : 0);
    }

    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof C5464c;
    }

    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public final int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        mo18789b();
        View d = mo18794d(itemCount);
        View f = mo18796f(itemCount);
        if (state.getItemCount() == 0 || d == null || f == null) {
            return 0;
        }
        return Math.min(this.f11206m.getTotalSpace(), this.f11206m.getDecoratedEnd(f) - this.f11206m.getDecoratedStart(d));
    }

    public final int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View d = mo18794d(itemCount);
        View f = mo18796f(itemCount);
        if (!(state.getItemCount() == 0 || d == null || f == null)) {
            int position = getPosition(d);
            int position2 = getPosition(f);
            int abs = Math.abs(this.f11206m.getDecoratedEnd(f) - this.f11206m.getDecoratedStart(d));
            int[] iArr = this.f11201h.f3076c;
            int i = iArr[position];
            if (!(i == 0 || i == -1)) {
                return Math.round((((float) i) * (((float) abs) / ((float) ((iArr[position2] - i) + 1)))) + ((float) (this.f11206m.getStartAfterPadding() - this.f11206m.getDecoratedStart(d))));
            }
        }
        return 0;
    }

    public final int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View d = mo18794d(itemCount);
        View f = mo18796f(itemCount);
        if (state.getItemCount() == 0 || d == null || f == null) {
            return 0;
        }
        View h = mo18801h(0, getChildCount(), false);
        return (int) ((((float) Math.abs(this.f11206m.getDecoratedEnd(f) - this.f11206m.getDecoratedStart(d))) / ((float) ((findLastVisibleItemPosition() - (h == null ? -1 : getPosition(h))) + 1))) * ((float) state.getItemCount()));
    }

    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = i < getPosition(getChildAt(0)) ? -1 : 1;
        return mo18811r() ? new PointF(0.0f, (float) i2) : new PointF((float) i2, 0.0f);
    }

    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    public int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    /* renamed from: d */
    public final View mo18794d(int i) {
        int i2;
        View i3 = mo18802i(0, getChildCount(), i);
        if (i3 == null || (i2 = this.f11201h.f3076c[getPosition(i3)]) == -1) {
            return null;
        }
        return mo18795e(i3, this.f11200g.get(i2));
    }

    /* renamed from: e */
    public final View mo18795e(View view, C1745c cVar) {
        boolean r = mo18811r();
        int i = cVar.f3063d;
        for (int i2 = 1; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                if (!this.f11198e || r) {
                    if (this.f11206m.getDecoratedStart(view) <= this.f11206m.getDecoratedStart(childAt)) {
                    }
                } else if (this.f11206m.getDecoratedEnd(view) >= this.f11206m.getDecoratedEnd(childAt)) {
                }
                view = childAt;
            }
        }
        return view;
    }

    /* renamed from: f */
    public final View mo18796f(int i) {
        View i2 = mo18802i(getChildCount() - 1, -1, i);
        if (i2 == null) {
            return null;
        }
        return mo18800g(i2, this.f11200g.get(this.f11201h.f3076c[getPosition(i2)]));
    }

    public int findLastVisibleItemPosition() {
        View h = mo18801h(getChildCount() - 1, -1, false);
        if (h == null) {
            return -1;
        }
        return getPosition(h);
    }

    public final int fixLayoutEndGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int i2;
        int endAfterPadding;
        if (!mo18811r() && this.f11198e) {
            int startAfterPadding = i - this.f11206m.getStartAfterPadding();
            if (startAfterPadding <= 0) {
                return 0;
            }
            i2 = mo18809p(startAfterPadding, recycler, state);
        } else {
            int endAfterPadding2 = this.f11206m.getEndAfterPadding() - i;
            if (endAfterPadding2 <= 0) {
                return 0;
            }
            i2 = -mo18809p(-endAfterPadding2, recycler, state);
        }
        int i3 = i + i2;
        if (!z || (endAfterPadding = this.f11206m.getEndAfterPadding() - i3) <= 0) {
            return i2;
        }
        this.f11206m.offsetChildren(endAfterPadding);
        return endAfterPadding + i2;
    }

    public final int fixLayoutStartGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int i2;
        int startAfterPadding;
        if (mo18811r() || !this.f11198e) {
            int startAfterPadding2 = i - this.f11206m.getStartAfterPadding();
            if (startAfterPadding2 <= 0) {
                return 0;
            }
            i2 = -mo18809p(startAfterPadding2, recycler, state);
        } else {
            int endAfterPadding = this.f11206m.getEndAfterPadding() - i;
            if (endAfterPadding <= 0) {
                return 0;
            }
            i2 = mo18809p(-endAfterPadding, recycler, state);
        }
        int i3 = i + i2;
        if (!z || (startAfterPadding = i3 - this.f11206m.getStartAfterPadding()) <= 0) {
            return i2;
        }
        this.f11206m.offsetChildren(-startAfterPadding);
        return i2 - startAfterPadding;
    }

    /* renamed from: g */
    public final View mo18800g(View view, C1745c cVar) {
        boolean r = mo18811r();
        int childCount = (getChildCount() - cVar.f3063d) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                if (!this.f11198e || r) {
                    if (this.f11206m.getDecoratedEnd(view) >= this.f11206m.getDecoratedEnd(childAt)) {
                    }
                } else if (this.f11206m.getDecoratedStart(view) <= this.f11206m.getDecoratedStart(childAt)) {
                }
                view = childAt;
            }
        }
        return view;
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new C5464c(-2, -2);
    }

    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C5464c(context, attributeSet);
    }

    /* renamed from: h */
    public final View mo18801h(int i, int i2, boolean z) {
        int i3 = i2;
        int i4 = i;
        int i5 = i3 > i4 ? 1 : -1;
        while (i4 != i3) {
            View childAt = getChildAt(i4);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int decoratedLeft = getDecoratedLeft(childAt) - ((RecyclerView.LayoutParams) childAt.getLayoutParams()).leftMargin;
            int decoratedTop = getDecoratedTop(childAt) - ((RecyclerView.LayoutParams) childAt.getLayoutParams()).topMargin;
            int decoratedRight = getDecoratedRight(childAt) + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).rightMargin;
            int decoratedBottom = getDecoratedBottom(childAt) + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            boolean z2 = false;
            boolean z3 = paddingLeft <= decoratedLeft && width >= decoratedRight;
            boolean z4 = decoratedLeft >= width || decoratedRight >= paddingLeft;
            boolean z5 = paddingTop <= decoratedTop && height >= decoratedBottom;
            boolean z6 = decoratedTop >= height || decoratedBottom >= paddingTop;
            if (!z ? !(!z4 || !z6) : !(!z3 || !z5)) {
                z2 = true;
            }
            if (z2) {
                return childAt;
            }
            i4 += i5;
        }
        return null;
    }

    /* renamed from: i */
    public final View mo18802i(int i, int i2, int i3) {
        mo18789b();
        View view = null;
        if (this.f11204k == null) {
            this.f11204k = new C5466d((C5462a) null);
        }
        int startAfterPadding = this.f11206m.getStartAfterPadding();
        int endAfterPadding = this.f11206m.getEndAfterPadding();
        int i4 = i2 > i ? 1 : -1;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.f11206m.getDecoratedStart(childAt) >= startAfterPadding && this.f11206m.getDecoratedEnd(childAt) <= endAfterPadding) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* renamed from: j */
    public int mo18803j(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    /* renamed from: k */
    public int mo18804k(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    /* renamed from: l */
    public int mo18805l(View view) {
        int i;
        int i2;
        if (mo18811r()) {
            i2 = getTopDecorationHeight(view);
            i = getBottomDecorationHeight(view);
        } else {
            i2 = getLeftDecorationWidth(view);
            i = getRightDecorationWidth(view);
        }
        return i + i2;
    }

    /* renamed from: m */
    public View mo18806m(int i) {
        View view = this.f11213t.get(i);
        return view != null ? view : this.f11202i.getViewForPosition(i);
    }

    /* renamed from: n */
    public int mo18807n() {
        return this.f11203j.getItemCount();
    }

    /* renamed from: o */
    public int mo18808o() {
        if (this.f11200g.size() == 0) {
            return 0;
        }
        int i = Integer.MIN_VALUE;
        int size = this.f11200g.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.f11200g.get(i2).f3060a);
        }
        return i;
    }

    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f11215v = (View) recyclerView.getParent();
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
    }

    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        mo18817x(i);
    }

    public void onItemsMoved(@NonNull RecyclerView recyclerView, int i, int i2, int i3) {
        super.onItemsMoved(recyclerView, i, i2, i3);
        mo18817x(Math.min(i, i2));
    }

    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        mo18817x(i);
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsUpdated(recyclerView, i, i2);
        mo18817x(i);
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        mo18817x(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        if (r0.f11195b == 2) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0061, code lost:
        if (r0.f11195b == 2) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r22, androidx.recyclerview.widget.RecyclerView.State r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r0.f11202i = r1
            r0.f11203j = r2
            int r3 = r23.getItemCount()
            if (r3 != 0) goto L_0x0017
            boolean r4 = r23.isPreLayout()
            if (r4 == 0) goto L_0x0017
            return
        L_0x0017:
            int r4 = r21.getLayoutDirection()
            int r5 = r0.f11194a
            r6 = 2
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L_0x0058
            if (r5 == r8) goto L_0x004c
            if (r5 == r6) goto L_0x003d
            r9 = 3
            if (r5 == r9) goto L_0x002c
            r0.f11198e = r7
            goto L_0x0065
        L_0x002c:
            if (r4 != r8) goto L_0x0030
            r4 = r8
            goto L_0x0031
        L_0x0030:
            r4 = r7
        L_0x0031:
            r0.f11198e = r4
            int r5 = r0.f11195b
            if (r5 != r6) goto L_0x003a
            r4 = r4 ^ r8
            r0.f11198e = r4
        L_0x003a:
            r0.f11199f = r8
            goto L_0x0068
        L_0x003d:
            if (r4 != r8) goto L_0x0041
            r4 = r8
            goto L_0x0042
        L_0x0041:
            r4 = r7
        L_0x0042:
            r0.f11198e = r4
            int r5 = r0.f11195b
            if (r5 != r6) goto L_0x0065
            r4 = r4 ^ r8
            r0.f11198e = r4
            goto L_0x0065
        L_0x004c:
            if (r4 == r8) goto L_0x0050
            r4 = r8
            goto L_0x0051
        L_0x0050:
            r4 = r7
        L_0x0051:
            r0.f11198e = r4
            int r4 = r0.f11195b
            if (r4 != r6) goto L_0x0065
            goto L_0x0063
        L_0x0058:
            if (r4 != r8) goto L_0x005c
            r4 = r8
            goto L_0x005d
        L_0x005c:
            r4 = r7
        L_0x005d:
            r0.f11198e = r4
            int r4 = r0.f11195b
            if (r4 != r6) goto L_0x0065
        L_0x0063:
            r4 = r8
            goto L_0x0066
        L_0x0065:
            r4 = r7
        L_0x0066:
            r0.f11199f = r4
        L_0x0068:
            r21.mo18789b()
            com.google.android.flexbox.FlexboxLayoutManager$d r4 = r0.f11204k
            r5 = 0
            if (r4 != 0) goto L_0x0077
            com.google.android.flexbox.FlexboxLayoutManager$d r4 = new com.google.android.flexbox.FlexboxLayoutManager$d
            r4.<init>(r5)
            r0.f11204k = r4
        L_0x0077:
            b.l.a.b.d r4 = r0.f11201h
            r4.mo11958g(r3)
            b.l.a.b.d r4 = r0.f11201h
            r4.mo11959h(r3)
            b.l.a.b.d r4 = r0.f11201h
            r4.mo11957f(r3)
            com.google.android.flexbox.FlexboxLayoutManager$d r4 = r0.f11204k
            r4.f11244j = r7
            com.google.android.flexbox.FlexboxLayoutManager$e r4 = r0.f11208o
            if (r4 == 0) goto L_0x009b
            int r6 = r4.f11245g
            if (r6 < 0) goto L_0x0096
            if (r6 >= r3) goto L_0x0096
            r9 = r8
            goto L_0x0097
        L_0x0096:
            r9 = r7
        L_0x0097:
            if (r9 == 0) goto L_0x009b
            r0.f11209p = r6
        L_0x009b:
            com.google.android.flexbox.FlexboxLayoutManager$b r6 = r0.f11205l
            boolean r9 = r6.f11223f
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = -1
            if (r9 == 0) goto L_0x00aa
            int r9 = r0.f11209p
            if (r9 != r11) goto L_0x00aa
            if (r4 == 0) goto L_0x0287
        L_0x00aa:
            com.google.android.flexbox.FlexboxLayoutManager.C5463b.m10352b(r6)
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.f11205l
            com.google.android.flexbox.FlexboxLayoutManager$e r6 = r0.f11208o
            boolean r9 = r23.isPreLayout()
            if (r9 != 0) goto L_0x01a2
            int r9 = r0.f11209p
            if (r9 != r11) goto L_0x00bd
            goto L_0x01a2
        L_0x00bd:
            if (r9 < 0) goto L_0x019e
            int r12 = r23.getItemCount()
            if (r9 < r12) goto L_0x00c7
            goto L_0x019e
        L_0x00c7:
            int r9 = r0.f11209p
            r4.f11218a = r9
            b.l.a.b.d r12 = r0.f11201h
            int[] r12 = r12.f3076c
            r9 = r12[r9]
            r4.f11219b = r9
            com.google.android.flexbox.FlexboxLayoutManager$e r9 = r0.f11208o
            if (r9 == 0) goto L_0x00f7
            int r12 = r23.getItemCount()
            int r9 = r9.f11245g
            if (r9 < 0) goto L_0x00e3
            if (r9 >= r12) goto L_0x00e3
            r9 = r8
            goto L_0x00e4
        L_0x00e3:
            r9 = r7
        L_0x00e4:
            if (r9 == 0) goto L_0x00f7
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f11206m
            int r9 = r9.getStartAfterPadding()
            int r6 = r6.f11246h
            int r9 = r9 + r6
            r4.f11220c = r9
            r4.f11224g = r8
            r4.f11219b = r11
            goto L_0x019c
        L_0x00f7:
            int r6 = r0.f11210q
            if (r6 != r10) goto L_0x017d
            int r6 = r0.f11209p
            android.view.View r6 = r0.findViewByPosition(r6)
            if (r6 == 0) goto L_0x0162
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f11206m
            int r9 = r9.getDecoratedMeasurement(r6)
            androidx.recyclerview.widget.OrientationHelper r12 = r0.f11206m
            int r12 = r12.getTotalSpace()
            if (r9 <= r12) goto L_0x0112
            goto L_0x0179
        L_0x0112:
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f11206m
            int r9 = r9.getDecoratedStart(r6)
            androidx.recyclerview.widget.OrientationHelper r12 = r0.f11206m
            int r12 = r12.getStartAfterPadding()
            int r9 = r9 - r12
            if (r9 >= 0) goto L_0x012d
            androidx.recyclerview.widget.OrientationHelper r6 = r0.f11206m
            int r6 = r6.getStartAfterPadding()
            r4.f11220c = r6
            r4.f11222e = r7
            goto L_0x019c
        L_0x012d:
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f11206m
            int r9 = r9.getEndAfterPadding()
            androidx.recyclerview.widget.OrientationHelper r12 = r0.f11206m
            int r12 = r12.getDecoratedEnd(r6)
            int r9 = r9 - r12
            if (r9 >= 0) goto L_0x0147
            androidx.recyclerview.widget.OrientationHelper r6 = r0.f11206m
            int r6 = r6.getEndAfterPadding()
            r4.f11220c = r6
            r4.f11222e = r8
            goto L_0x019c
        L_0x0147:
            boolean r9 = r4.f11222e
            if (r9 == 0) goto L_0x0159
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f11206m
            int r6 = r9.getDecoratedEnd(r6)
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f11206m
            int r9 = r9.getTotalSpaceChange()
            int r9 = r9 + r6
            goto L_0x015f
        L_0x0159:
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f11206m
            int r9 = r9.getDecoratedStart(r6)
        L_0x015f:
            r4.f11220c = r9
            goto L_0x019c
        L_0x0162:
            int r6 = r21.getChildCount()
            if (r6 <= 0) goto L_0x0179
            android.view.View r6 = r0.getChildAt(r7)
            int r6 = r0.getPosition(r6)
            int r9 = r0.f11209p
            if (r9 >= r6) goto L_0x0176
            r6 = r8
            goto L_0x0177
        L_0x0176:
            r6 = r7
        L_0x0177:
            r4.f11222e = r6
        L_0x0179:
            com.google.android.flexbox.FlexboxLayoutManager.C5463b.m10351a(r4)
            goto L_0x019c
        L_0x017d:
            boolean r6 = r21.mo18811r()
            if (r6 != 0) goto L_0x0191
            boolean r6 = r0.f11198e
            if (r6 == 0) goto L_0x0191
            int r6 = r0.f11210q
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f11206m
            int r9 = r9.getEndPadding()
            int r6 = r6 - r9
            goto L_0x019a
        L_0x0191:
            androidx.recyclerview.widget.OrientationHelper r6 = r0.f11206m
            int r6 = r6.getStartAfterPadding()
            int r9 = r0.f11210q
            int r6 = r6 + r9
        L_0x019a:
            r4.f11220c = r6
        L_0x019c:
            r6 = r8
            goto L_0x01a3
        L_0x019e:
            r0.f11209p = r11
            r0.f11210q = r10
        L_0x01a2:
            r6 = r7
        L_0x01a3:
            if (r6 == 0) goto L_0x01a7
            goto L_0x0283
        L_0x01a7:
            int r6 = r21.getChildCount()
            if (r6 != 0) goto L_0x01af
            goto L_0x0278
        L_0x01af:
            boolean r6 = r4.f11222e
            if (r6 == 0) goto L_0x01bc
            int r6 = r23.getItemCount()
            android.view.View r6 = r0.mo18796f(r6)
            goto L_0x01c4
        L_0x01bc:
            int r6 = r23.getItemCount()
            android.view.View r6 = r0.mo18794d(r6)
        L_0x01c4:
            if (r6 == 0) goto L_0x0278
            com.google.android.flexbox.FlexboxLayoutManager r9 = com.google.android.flexbox.FlexboxLayoutManager.this
            int r12 = r9.f11195b
            if (r12 != 0) goto L_0x01cf
            androidx.recyclerview.widget.OrientationHelper r12 = r9.f11207n
            goto L_0x01d1
        L_0x01cf:
            androidx.recyclerview.widget.OrientationHelper r12 = r9.f11206m
        L_0x01d1:
            boolean r9 = r9.mo18811r()
            if (r9 != 0) goto L_0x01eb
            com.google.android.flexbox.FlexboxLayoutManager r9 = com.google.android.flexbox.FlexboxLayoutManager.this
            boolean r9 = r9.f11198e
            if (r9 == 0) goto L_0x01eb
            boolean r9 = r4.f11222e
            if (r9 == 0) goto L_0x01e6
            int r9 = r12.getDecoratedStart(r6)
            goto L_0x01f3
        L_0x01e6:
            int r9 = r12.getDecoratedEnd(r6)
            goto L_0x01ff
        L_0x01eb:
            boolean r9 = r4.f11222e
            if (r9 == 0) goto L_0x01fb
            int r9 = r12.getDecoratedEnd(r6)
        L_0x01f3:
            int r12 = r12.getTotalSpaceChange()
            int r12 = r12 + r9
            r4.f11220c = r12
            goto L_0x0201
        L_0x01fb:
            int r9 = r12.getDecoratedStart(r6)
        L_0x01ff:
            r4.f11220c = r9
        L_0x0201:
            com.google.android.flexbox.FlexboxLayoutManager r9 = com.google.android.flexbox.FlexboxLayoutManager.this
            int r9 = r9.getPosition(r6)
            r4.f11218a = r9
            r4.f11224g = r7
            com.google.android.flexbox.FlexboxLayoutManager r12 = com.google.android.flexbox.FlexboxLayoutManager.this
            b.l.a.b.d r13 = r12.f11201h
            int[] r13 = r13.f3076c
            if (r9 == r11) goto L_0x0214
            goto L_0x0215
        L_0x0214:
            r9 = r7
        L_0x0215:
            r9 = r13[r9]
            if (r9 == r11) goto L_0x021a
            goto L_0x021b
        L_0x021a:
            r9 = r7
        L_0x021b:
            r4.f11219b = r9
            java.util.List<b.l.a.b.c> r9 = r12.f11200g
            int r9 = r9.size()
            int r12 = r4.f11219b
            if (r9 <= r12) goto L_0x0235
            com.google.android.flexbox.FlexboxLayoutManager r9 = com.google.android.flexbox.FlexboxLayoutManager.this
            java.util.List<b.l.a.b.c> r9 = r9.f11200g
            java.lang.Object r9 = r9.get(r12)
            b.l.a.b.c r9 = (p005b.p096l.p097a.p112b.C1745c) r9
            int r9 = r9.f3070k
            r4.f11218a = r9
        L_0x0235:
            boolean r9 = r23.isPreLayout()
            if (r9 != 0) goto L_0x0276
            boolean r9 = r21.supportsPredictiveItemAnimations()
            if (r9 == 0) goto L_0x0276
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f11206m
            int r9 = r9.getDecoratedStart(r6)
            androidx.recyclerview.widget.OrientationHelper r12 = r0.f11206m
            int r12 = r12.getEndAfterPadding()
            if (r9 >= r12) goto L_0x0260
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f11206m
            int r6 = r9.getDecoratedEnd(r6)
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f11206m
            int r9 = r9.getStartAfterPadding()
            if (r6 >= r9) goto L_0x025e
            goto L_0x0260
        L_0x025e:
            r6 = r7
            goto L_0x0261
        L_0x0260:
            r6 = r8
        L_0x0261:
            if (r6 == 0) goto L_0x0276
            boolean r6 = r4.f11222e
            if (r6 == 0) goto L_0x026e
            androidx.recyclerview.widget.OrientationHelper r6 = r0.f11206m
            int r6 = r6.getEndAfterPadding()
            goto L_0x0274
        L_0x026e:
            androidx.recyclerview.widget.OrientationHelper r6 = r0.f11206m
            int r6 = r6.getStartAfterPadding()
        L_0x0274:
            r4.f11220c = r6
        L_0x0276:
            r6 = r8
            goto L_0x0279
        L_0x0278:
            r6 = r7
        L_0x0279:
            if (r6 == 0) goto L_0x027c
            goto L_0x0283
        L_0x027c:
            com.google.android.flexbox.FlexboxLayoutManager.C5463b.m10351a(r4)
            r4.f11218a = r7
            r4.f11219b = r7
        L_0x0283:
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.f11205l
            r4.f11223f = r8
        L_0x0287:
            r21.detachAndScrapAttachedViews(r22)
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.f11205l
            boolean r6 = r4.f11222e
            if (r6 == 0) goto L_0x0294
            r0.mo18819z(r4, r7, r8)
            goto L_0x0297
        L_0x0294:
            r0.mo18818y(r4, r7, r8)
        L_0x0297:
            int r4 = r21.getWidth()
            int r6 = r21.getWidthMode()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6)
            int r6 = r21.getHeight()
            int r9 = r21.getHeightMode()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            int r9 = r21.getWidth()
            int r12 = r21.getHeight()
            boolean r13 = r21.mo18811r()
            if (r13 == 0) goto L_0x02d9
            int r13 = r0.f11211r
            if (r13 == r10) goto L_0x02c5
            if (r13 == r9) goto L_0x02c5
            r10 = r8
            goto L_0x02c6
        L_0x02c5:
            r10 = r7
        L_0x02c6:
            com.google.android.flexbox.FlexboxLayoutManager$d r13 = r0.f11204k
            boolean r14 = r13.f11236b
            if (r14 == 0) goto L_0x02f5
            android.content.Context r13 = r0.f11214u
            android.content.res.Resources r13 = r13.getResources()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            int r13 = r13.heightPixels
            goto L_0x02f7
        L_0x02d9:
            int r13 = r0.f11212s
            if (r13 == r10) goto L_0x02e1
            if (r13 == r12) goto L_0x02e1
            r10 = r8
            goto L_0x02e2
        L_0x02e1:
            r10 = r7
        L_0x02e2:
            com.google.android.flexbox.FlexboxLayoutManager$d r13 = r0.f11204k
            boolean r14 = r13.f11236b
            if (r14 == 0) goto L_0x02f5
            android.content.Context r13 = r0.f11214u
            android.content.res.Resources r13 = r13.getResources()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            int r13 = r13.widthPixels
            goto L_0x02f7
        L_0x02f5:
            int r13 = r13.f11235a
        L_0x02f7:
            r17 = r13
            r0.f11211r = r9
            r0.f11212s = r12
            int r9 = r0.f11216w
            if (r9 != r11) goto L_0x036d
            int r12 = r0.f11209p
            if (r12 != r11) goto L_0x0307
            if (r10 == 0) goto L_0x036d
        L_0x0307:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f11205l
            boolean r3 = r3.f11222e
            if (r3 == 0) goto L_0x030f
            goto L_0x0410
        L_0x030f:
            java.util.List<b.l.a.b.c> r3 = r0.f11200g
            r3.clear()
            b.l.a.b.d$a r3 = r0.f11217x
            r3.f3079a = r5
            boolean r3 = r21.mo18811r()
            b.l.a.b.d r12 = r0.f11201h
            b.l.a.b.d$a r13 = r0.f11217x
            if (r3 == 0) goto L_0x0337
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f11205l
            int r3 = r3.f11218a
            java.util.List<b.l.a.b.c> r5 = r0.f11200g
            r9 = 0
            r14 = r4
            r15 = r6
            r16 = r17
            r17 = r9
            r18 = r3
            r19 = r5
            r12.mo11953b(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x034b
        L_0x0337:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f11205l
            int r3 = r3.f11218a
            java.util.List<b.l.a.b.c> r5 = r0.f11200g
            r9 = 0
            r14 = r6
            r15 = r4
            r16 = r17
            r17 = r9
            r18 = r3
            r19 = r5
            r12.mo11953b(r13, r14, r15, r16, r17, r18, r19)
        L_0x034b:
            b.l.a.b.d$a r3 = r0.f11217x
            java.util.List<b.l.a.b.c> r3 = r3.f3079a
            r0.f11200g = r3
            b.l.a.b.d r3 = r0.f11201h
            r3.mo11956e(r4, r6, r7)
            b.l.a.b.d r3 = r0.f11201h
            r3.mo11974w(r7)
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f11205l
            b.l.a.b.d r4 = r0.f11201h
            int[] r4 = r4.f3076c
            int r5 = r3.f11218a
            r4 = r4[r5]
            r3.f11219b = r4
            com.google.android.flexbox.FlexboxLayoutManager$d r3 = r0.f11204k
            r3.f11237c = r4
            goto L_0x0410
        L_0x036d:
            if (r9 == r11) goto L_0x0378
            com.google.android.flexbox.FlexboxLayoutManager$b r10 = r0.f11205l
            int r10 = r10.f11218a
            int r9 = java.lang.Math.min(r9, r10)
            goto L_0x037c
        L_0x0378:
            com.google.android.flexbox.FlexboxLayoutManager$b r9 = r0.f11205l
            int r9 = r9.f11218a
        L_0x037c:
            b.l.a.b.d$a r10 = r0.f11217x
            r10.f3079a = r5
            boolean r5 = r21.mo18811r()
            if (r5 == 0) goto L_0x03bf
            java.util.List<b.l.a.b.c> r5 = r0.f11200g
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x03a5
            b.l.a.b.d r3 = r0.f11201h
            java.util.List<b.l.a.b.c> r5 = r0.f11200g
            r3.mo11955d(r5, r9)
            b.l.a.b.d r3 = r0.f11201h
            b.l.a.b.d$a r5 = r0.f11217x
            com.google.android.flexbox.FlexboxLayoutManager$b r10 = r0.f11205l
            int r10 = r10.f11218a
            java.util.List<b.l.a.b.c> r11 = r0.f11200g
            r13 = r3
            r15 = r4
            r14 = r5
            r16 = r6
            goto L_0x03dd
        L_0x03a5:
            b.l.a.b.d r5 = r0.f11201h
            r5.mo11957f(r3)
            b.l.a.b.d r12 = r0.f11201h
            b.l.a.b.d$a r13 = r0.f11217x
            r3 = 0
            java.util.List<b.l.a.b.c> r5 = r0.f11200g
            r18 = -1
            r14 = r4
            r15 = r6
            r16 = r17
            r17 = r3
            r19 = r5
            r12.mo11953b(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0400
        L_0x03bf:
            java.util.List<b.l.a.b.c> r5 = r0.f11200g
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x03e7
            b.l.a.b.d r3 = r0.f11201h
            java.util.List<b.l.a.b.c> r5 = r0.f11200g
            r3.mo11955d(r5, r9)
            b.l.a.b.d r3 = r0.f11201h
            b.l.a.b.d$a r5 = r0.f11217x
            com.google.android.flexbox.FlexboxLayoutManager$b r10 = r0.f11205l
            int r10 = r10.f11218a
            java.util.List<b.l.a.b.c> r11 = r0.f11200g
            r13 = r3
            r16 = r4
            r14 = r5
            r15 = r6
        L_0x03dd:
            r19 = r10
            r20 = r11
            r18 = r9
            r13.mo11953b(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0400
        L_0x03e7:
            b.l.a.b.d r5 = r0.f11201h
            r5.mo11957f(r3)
            b.l.a.b.d r12 = r0.f11201h
            b.l.a.b.d$a r13 = r0.f11217x
            r3 = 0
            java.util.List<b.l.a.b.c> r5 = r0.f11200g
            r18 = -1
            r14 = r6
            r15 = r4
            r16 = r17
            r17 = r3
            r19 = r5
            r12.mo11953b(r13, r14, r15, r16, r17, r18, r19)
        L_0x0400:
            b.l.a.b.d$a r3 = r0.f11217x
            java.util.List<b.l.a.b.c> r3 = r3.f3079a
            r0.f11200g = r3
            b.l.a.b.d r3 = r0.f11201h
            r3.mo11956e(r4, r6, r9)
            b.l.a.b.d r3 = r0.f11201h
            r3.mo11974w(r9)
        L_0x0410:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f11205l
            boolean r3 = r3.f11222e
            if (r3 == 0) goto L_0x042e
            com.google.android.flexbox.FlexboxLayoutManager$d r3 = r0.f11204k
            r0.mo18790c(r1, r2, r3)
            com.google.android.flexbox.FlexboxLayoutManager$d r3 = r0.f11204k
            int r3 = r3.f11239e
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.f11205l
            r0.mo18818y(r4, r8, r7)
            com.google.android.flexbox.FlexboxLayoutManager$d r4 = r0.f11204k
            r0.mo18790c(r1, r2, r4)
            com.google.android.flexbox.FlexboxLayoutManager$d r4 = r0.f11204k
            int r4 = r4.f11239e
            goto L_0x0445
        L_0x042e:
            com.google.android.flexbox.FlexboxLayoutManager$d r3 = r0.f11204k
            r0.mo18790c(r1, r2, r3)
            com.google.android.flexbox.FlexboxLayoutManager$d r3 = r0.f11204k
            int r4 = r3.f11239e
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f11205l
            r0.mo18819z(r3, r8, r7)
            com.google.android.flexbox.FlexboxLayoutManager$d r3 = r0.f11204k
            r0.mo18790c(r1, r2, r3)
            com.google.android.flexbox.FlexboxLayoutManager$d r3 = r0.f11204k
            int r3 = r3.f11239e
        L_0x0445:
            int r5 = r21.getChildCount()
            if (r5 <= 0) goto L_0x0462
            com.google.android.flexbox.FlexboxLayoutManager$b r5 = r0.f11205l
            boolean r5 = r5.f11222e
            if (r5 == 0) goto L_0x045a
            int r4 = r0.fixLayoutEndGap(r4, r1, r2, r8)
            int r4 = r4 + r3
            r0.fixLayoutStartGap(r4, r1, r2, r7)
            goto L_0x0462
        L_0x045a:
            int r3 = r0.fixLayoutStartGap(r3, r1, r2, r8)
            int r3 = r3 + r4
            r0.fixLayoutEndGap(r3, r1, r2, r7)
        L_0x0462:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f11208o = null;
        this.f11209p = -1;
        this.f11210q = Integer.MIN_VALUE;
        this.f11216w = -1;
        C5463b.m10352b(this.f11205l);
        this.f11213t.clear();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C5467e) {
            this.f11208o = (C5467e) parcelable;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        C5467e eVar = this.f11208o;
        if (eVar != null) {
            return new C5467e(eVar, (C5462a) null);
        }
        C5467e eVar2 = new C5467e();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            eVar2.f11245g = getPosition(childAt);
            eVar2.f11246h = this.f11206m.getDecoratedStart(childAt) - this.f11206m.getStartAfterPadding();
        } else {
            eVar2.f11245g = -1;
        }
        return eVar2;
    }

    /* renamed from: p */
    public final int mo18809p(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i2;
        int i3;
        C5466d dVar;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        mo18789b();
        this.f11204k.f11244j = true;
        boolean z = !mo18811r() && this.f11198e;
        int i4 = (!z ? i <= 0 : i >= 0) ? -1 : 1;
        int abs = Math.abs(i);
        this.f11204k.f11243i = i4;
        boolean r = mo18811r();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        boolean z2 = !r && this.f11198e;
        if (i4 == 1) {
            View childAt = getChildAt(getChildCount() - 1);
            this.f11204k.f11239e = this.f11206m.getDecoratedEnd(childAt);
            int position = getPosition(childAt);
            View g = mo18800g(childAt, this.f11200g.get(this.f11201h.f3076c[position]));
            C5466d dVar2 = this.f11204k;
            dVar2.f11242h = 1;
            int i5 = position + 1;
            dVar2.f11238d = i5;
            int[] iArr = this.f11201h.f3076c;
            if (iArr.length <= i5) {
                dVar2.f11237c = -1;
            } else {
                dVar2.f11237c = iArr[i5];
            }
            if (z2) {
                dVar2.f11239e = this.f11206m.getDecoratedStart(g);
                this.f11204k.f11240f = this.f11206m.getStartAfterPadding() + (-this.f11206m.getDecoratedStart(g));
                dVar = this.f11204k;
                i3 = dVar.f11240f;
                if (i3 < 0) {
                    i3 = 0;
                }
            } else {
                dVar2.f11239e = this.f11206m.getDecoratedEnd(g);
                dVar = this.f11204k;
                i3 = this.f11206m.getDecoratedEnd(g) - this.f11206m.getEndAfterPadding();
            }
            dVar.f11240f = i3;
            int i6 = this.f11204k.f11237c;
            if ((i6 == -1 || i6 > this.f11200g.size() - 1) && this.f11204k.f11238d <= mo18807n()) {
                C5466d dVar3 = this.f11204k;
                int i7 = abs - dVar3.f11240f;
                C1746d.C1747a aVar = this.f11217x;
                aVar.f3079a = null;
                if (i7 > 0) {
                    C1746d dVar4 = this.f11201h;
                    if (r) {
                        dVar4.mo11953b(aVar, makeMeasureSpec, makeMeasureSpec2, i7, dVar3.f11238d, -1, this.f11200g);
                    } else {
                        dVar4.mo11953b(aVar, makeMeasureSpec2, makeMeasureSpec, i7, dVar3.f11238d, -1, this.f11200g);
                    }
                    this.f11201h.mo11956e(makeMeasureSpec, makeMeasureSpec2, this.f11204k.f11238d);
                    this.f11201h.mo11974w(this.f11204k.f11238d);
                }
            }
        } else {
            View childAt2 = getChildAt(0);
            this.f11204k.f11239e = this.f11206m.getDecoratedStart(childAt2);
            int position2 = getPosition(childAt2);
            View e = mo18795e(childAt2, this.f11200g.get(this.f11201h.f3076c[position2]));
            C5466d dVar5 = this.f11204k;
            dVar5.f11242h = 1;
            int i8 = this.f11201h.f3076c[position2];
            if (i8 == -1) {
                i8 = 0;
            }
            if (i8 > 0) {
                this.f11204k.f11238d = position2 - this.f11200g.get(i8 - 1).f3063d;
            } else {
                dVar5.f11238d = -1;
            }
            C5466d dVar6 = this.f11204k;
            dVar6.f11237c = i8 > 0 ? i8 - 1 : 0;
            OrientationHelper orientationHelper = this.f11206m;
            if (z2) {
                dVar6.f11239e = orientationHelper.getDecoratedEnd(e);
                this.f11204k.f11240f = this.f11206m.getDecoratedEnd(e) - this.f11206m.getEndAfterPadding();
                C5466d dVar7 = this.f11204k;
                int i9 = dVar7.f11240f;
                if (i9 < 0) {
                    i9 = 0;
                }
                dVar7.f11240f = i9;
            } else {
                dVar6.f11239e = orientationHelper.getDecoratedStart(e);
                this.f11204k.f11240f = this.f11206m.getStartAfterPadding() + (-this.f11206m.getDecoratedStart(e));
            }
        }
        C5466d dVar8 = this.f11204k;
        int i10 = dVar8.f11240f;
        dVar8.f11235a = abs - i10;
        int c = mo18790c(recycler, state, dVar8) + i10;
        if (c < 0) {
            return 0;
        }
        if (z) {
            if (abs > c) {
                i2 = (-i4) * c;
                this.f11206m.offsetChildren(-i2);
                this.f11204k.f11241g = i2;
                return i2;
            }
        } else if (abs > c) {
            i2 = i4 * c;
            this.f11206m.offsetChildren(-i2);
            this.f11204k.f11241g = i2;
            return i2;
        }
        i2 = i;
        this.f11206m.offsetChildren(-i2);
        this.f11204k.f11241g = i2;
        return i2;
    }

    /* renamed from: q */
    public final int mo18810q(int i) {
        int i2;
        boolean z = false;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        mo18789b();
        boolean r = mo18811r();
        View view = this.f11215v;
        int width = r ? view.getWidth() : view.getHeight();
        int width2 = r ? getWidth() : getHeight();
        if (getLayoutDirection() == 1) {
            z = true;
        }
        if (z) {
            int abs = Math.abs(i);
            if (i < 0) {
                return -Math.min((width2 + this.f11205l.f11221d) - width, abs);
            }
            i2 = this.f11205l.f11221d;
            if (i2 + i <= 0) {
                return i;
            }
        } else if (i > 0) {
            return Math.min((width2 - this.f11205l.f11221d) - width, i);
        } else {
            i2 = this.f11205l.f11221d;
            if (i2 + i >= 0) {
                return i;
            }
        }
        return -i2;
    }

    /* renamed from: r */
    public boolean mo18811r() {
        int i = this.f11194a;
        return i == 0 || i == 1;
    }

    /* renamed from: s */
    public final void mo18812s(RecyclerView.Recycler recycler, C5466d dVar) {
        int childCount;
        if (dVar.f11244j) {
            int i = -1;
            if (dVar.f11243i == -1) {
                if (dVar.f11240f >= 0) {
                    this.f11206m.getEnd();
                    int childCount2 = getChildCount();
                    if (childCount2 != 0) {
                        int i2 = childCount2 - 1;
                        int i3 = this.f11201h.f3076c[getPosition(getChildAt(i2))];
                        if (i3 != -1) {
                            C1745c cVar = this.f11200g.get(i3);
                            int i4 = i2;
                            while (true) {
                                if (i4 < 0) {
                                    break;
                                }
                                View childAt = getChildAt(i4);
                                int i5 = dVar.f11240f;
                                if (!(mo18811r() || !this.f11198e ? this.f11206m.getDecoratedStart(childAt) >= this.f11206m.getEnd() - i5 : this.f11206m.getDecoratedEnd(childAt) <= i5)) {
                                    break;
                                }
                                if (cVar.f3070k == getPosition(childAt)) {
                                    if (i3 <= 0) {
                                        childCount2 = i4;
                                        break;
                                    }
                                    i3 += dVar.f11243i;
                                    cVar = this.f11200g.get(i3);
                                    childCount2 = i4;
                                }
                                i4--;
                            }
                            while (i2 >= childCount2) {
                                removeAndRecycleViewAt(i2, recycler);
                                i2--;
                            }
                        }
                    }
                }
            } else if (dVar.f11240f >= 0 && (childCount = getChildCount()) != 0) {
                int i6 = this.f11201h.f3076c[getPosition(getChildAt(0))];
                if (i6 != -1) {
                    C1745c cVar2 = this.f11200g.get(i6);
                    int i7 = 0;
                    while (true) {
                        if (i7 >= childCount) {
                            break;
                        }
                        View childAt2 = getChildAt(i7);
                        int i8 = dVar.f11240f;
                        if (!(mo18811r() || !this.f11198e ? this.f11206m.getDecoratedEnd(childAt2) <= i8 : this.f11206m.getEnd() - this.f11206m.getDecoratedStart(childAt2) <= i8)) {
                            break;
                        }
                        if (cVar2.f3071l == getPosition(childAt2)) {
                            if (i6 >= this.f11200g.size() - 1) {
                                i = i7;
                                break;
                            }
                            i6 += dVar.f11243i;
                            cVar2 = this.f11200g.get(i6);
                            i = i7;
                        }
                        i7++;
                    }
                    while (i >= 0) {
                        removeAndRecycleViewAt(i, recycler);
                        i--;
                    }
                }
            }
        }
    }

    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!mo18811r() || (this.f11195b == 0 && mo18811r())) {
            int p = mo18809p(i, recycler, state);
            this.f11213t.clear();
            return p;
        }
        int q = mo18810q(i);
        this.f11205l.f11221d += q;
        this.f11207n.offsetChildren(-q);
        return q;
    }

    public void scrollToPosition(int i) {
        this.f11209p = i;
        this.f11210q = Integer.MIN_VALUE;
        C5467e eVar = this.f11208o;
        if (eVar != null) {
            eVar.f11245g = -1;
        }
        requestLayout();
    }

    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (mo18811r() || (this.f11195b == 0 && !mo18811r())) {
            int p = mo18809p(i, recycler, state);
            this.f11213t.clear();
            return p;
        }
        int q = mo18810q(i);
        this.f11205l.f11221d += q;
        this.f11207n.offsetChildren(-q);
        return q;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    /* renamed from: t */
    public final void mo18813t() {
        int heightMode = mo18811r() ? getHeightMode() : getWidthMode();
        this.f11204k.f11236b = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    /* renamed from: u */
    public void mo18814u(int i) {
        int i2 = this.f11196c;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                removeAllViews();
                mo18788a();
            }
            this.f11196c = i;
            requestLayout();
        }
    }

    /* renamed from: v */
    public void mo18815v(int i) {
        if (this.f11194a != i) {
            removeAllViews();
            this.f11194a = i;
            this.f11206m = null;
            this.f11207n = null;
            mo18788a();
            requestLayout();
        }
    }

    /* renamed from: w */
    public void mo18816w(int i) {
        if (i != 2) {
            int i2 = this.f11195b;
            if (i2 != i) {
                if (i2 == 0 || i == 0) {
                    removeAllViews();
                    mo18788a();
                }
                this.f11195b = i;
                this.f11206m = null;
                this.f11207n = null;
                requestLayout();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    /* renamed from: x */
    public final void mo18817x(int i) {
        if (i < findLastVisibleItemPosition()) {
            int childCount = getChildCount();
            this.f11201h.mo11958g(childCount);
            this.f11201h.mo11959h(childCount);
            this.f11201h.mo11957f(childCount);
            if (i < this.f11201h.f3076c.length) {
                this.f11216w = i;
                View childAt = getChildAt(0);
                if (childAt != null) {
                    this.f11209p = getPosition(childAt);
                    if (mo18811r() || !this.f11198e) {
                        this.f11210q = this.f11206m.getDecoratedStart(childAt) - this.f11206m.getStartAfterPadding();
                        return;
                    }
                    this.f11210q = this.f11206m.getEndPadding() + this.f11206m.getDecoratedEnd(childAt);
                }
            }
        }
    }

    /* renamed from: y */
    public final void mo18818y(C5463b bVar, boolean z, boolean z2) {
        C5466d dVar;
        int endAfterPadding;
        int i;
        int i2;
        if (z2) {
            mo18813t();
        } else {
            this.f11204k.f11236b = false;
        }
        if (mo18811r() || !this.f11198e) {
            dVar = this.f11204k;
            endAfterPadding = this.f11206m.getEndAfterPadding();
            i = bVar.f11220c;
        } else {
            dVar = this.f11204k;
            endAfterPadding = bVar.f11220c;
            i = getPaddingRight();
        }
        dVar.f11235a = endAfterPadding - i;
        C5466d dVar2 = this.f11204k;
        dVar2.f11238d = bVar.f11218a;
        dVar2.f11242h = 1;
        dVar2.f11243i = 1;
        dVar2.f11239e = bVar.f11220c;
        dVar2.f11240f = Integer.MIN_VALUE;
        dVar2.f11237c = bVar.f11219b;
        if (z && this.f11200g.size() > 1 && (i2 = bVar.f11219b) >= 0 && i2 < this.f11200g.size() - 1) {
            C5466d dVar3 = this.f11204k;
            dVar3.f11237c++;
            dVar3.f11238d += this.f11200g.get(bVar.f11219b).f3063d;
        }
    }

    /* renamed from: z */
    public final void mo18819z(C5463b bVar, boolean z, boolean z2) {
        C5466d dVar;
        int i;
        int i2;
        if (z2) {
            mo18813t();
        } else {
            this.f11204k.f11236b = false;
        }
        if (mo18811r() || !this.f11198e) {
            dVar = this.f11204k;
            i = bVar.f11220c;
        } else {
            dVar = this.f11204k;
            i = this.f11215v.getWidth() - bVar.f11220c;
        }
        dVar.f11235a = i - this.f11206m.getStartAfterPadding();
        C5466d dVar2 = this.f11204k;
        dVar2.f11238d = bVar.f11218a;
        dVar2.f11242h = 1;
        dVar2.f11243i = -1;
        dVar2.f11239e = bVar.f11220c;
        dVar2.f11240f = Integer.MIN_VALUE;
        int i3 = bVar.f11219b;
        dVar2.f11237c = i3;
        if (z && i3 > 0 && this.f11200g.size() > (i2 = bVar.f11219b)) {
            C5466d dVar3 = this.f11204k;
            dVar3.f11237c--;
            dVar3.f11238d -= this.f11200g.get(i2).f3063d;
        }
    }
}
