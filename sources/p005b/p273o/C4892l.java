package p005b.p273o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.customview.widget.ViewDragHelper;
import p005b.p273o.C4899m;

/* renamed from: b.o.l */
public class C4892l extends ViewDragHelper.Callback {

    /* renamed from: a */
    public int f9439a;

    /* renamed from: b */
    public final /* synthetic */ C4899m f9440b;

    public C4892l(C4899m mVar) {
        this.f9440b = mVar;
    }

    public int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
        return this.f9440b.f9456j.f9460d;
    }

    public int clampViewPositionVertical(@NonNull View view, int i, int i2) {
        C4899m.C4900a aVar;
        C4899m.C4900a aVar2;
        this.f9439a = i;
        C4899m mVar = this.f9440b;
        C4899m.C4901b bVar = mVar.f9456j;
        if (bVar.f9462f == 1) {
            if (i >= bVar.f9459c && (aVar2 = mVar.f9453g) != null) {
                ((C5039y) aVar2).f9740a.f9140i = true;
            }
            int i3 = bVar.f9458b;
            if (i < i3) {
                return i3;
            }
        } else {
            if (i <= bVar.f9459c && (aVar = mVar.f9453g) != null) {
                ((C5039y) aVar).f9740a.f9140i = true;
            }
            int i4 = bVar.f9458b;
            if (i > i4) {
                return i4;
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6 != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r6 != null) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewReleased(@androidx.annotation.NonNull android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            b.o.m r6 = r5.f9440b
            b.o.m$b r7 = r6.f9456j
            int r0 = r7.f9458b
            boolean r1 = r6.f9455i
            if (r1 != 0) goto L_0x0042
            int r1 = r7.f9462f
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x0026
            int r1 = r5.f9439a
            int r4 = r7.f9465i
            if (r1 > r4) goto L_0x001d
            int r1 = r7.f9463g
            float r1 = (float) r1
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 <= 0) goto L_0x0042
        L_0x001d:
            int r0 = r7.f9464h
            r6.f9455i = r3
            b.o.m$a r6 = r6.f9453g
            if (r6 == 0) goto L_0x0042
            goto L_0x003b
        L_0x0026:
            int r1 = r5.f9439a
            int r4 = r7.f9465i
            if (r1 < r4) goto L_0x0033
            int r1 = r7.f9463g
            float r1 = (float) r1
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 >= 0) goto L_0x0042
        L_0x0033:
            int r0 = r7.f9464h
            r6.f9455i = r3
            b.o.m$a r6 = r6.f9453g
            if (r6 == 0) goto L_0x0042
        L_0x003b:
            b.o.y r6 = (p005b.p273o.C5039y) r6
            b.o.a0 r6 = r6.f9740a
            r6.mo16501f(r2)
        L_0x0042:
            b.o.m r6 = r5.f9440b
            androidx.customview.widget.ViewDragHelper r7 = r6.f9454h
            b.o.m$b r6 = r6.f9456j
            int r6 = r6.f9460d
            boolean r6 = r7.settleCapturedViewAt(r6, r0)
            if (r6 == 0) goto L_0x0055
            b.o.m r6 = r5.f9440b
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r6)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4892l.onViewReleased(android.view.View, float, float):void");
    }

    public boolean tryCaptureView(@NonNull View view, int i) {
        return true;
    }
}
