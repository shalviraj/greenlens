package p005b.p096l.p097a.p113c.p119b.p122m;

import android.accounts.Account;
import android.os.IInterface;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import p005b.p096l.p097a.p113c.p119b.C1763f;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p122m.C1919j;

/* renamed from: b.l.a.c.b.m.i */
public abstract class C1917i<T extends IInterface> extends C1889b<T> implements C1770a.C1779f, C1919j.C1920a {

    /* renamed from: B */
    public final Set<Scope> f3452B;

    /* renamed from: C */
    public final Account f3453C;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1917i(android.content.Context r10, android.os.Looper r11, int r12, p005b.p096l.p097a.p113c.p119b.p122m.C1905d r13, p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1813f r14, p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1839l r15) {
        /*
            r9 = this;
            b.l.a.c.b.m.k r3 = p005b.p096l.p097a.p113c.p119b.p122m.C1922k.m2652a(r10)
            java.lang.Object r0 = p005b.p096l.p097a.p113c.p119b.C1760e.f3107c
            b.l.a.c.b.e r4 = p005b.p096l.p097a.p113c.p119b.C1760e.f3108d
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r14, r0)
            java.util.Objects.requireNonNull(r15, r0)
            b.l.a.c.b.m.y r6 = new b.l.a.c.b.m.y
            r6.<init>(r14)
            b.l.a.c.b.m.z r7 = new b.l.a.c.b.m.z
            r7.<init>(r15)
            java.lang.String r8 = r13.f3417f
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            android.accounts.Account r10 = r13.f3412a
            r9.f3453C = r10
            java.util.Set<com.google.android.gms.common.api.Scope> r10 = r13.f3414c
            java.util.Iterator r11 = r10.iterator()
        L_0x002d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0048
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L_0x0040
            goto L_0x002d
        L_0x0040:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L_0x0048:
            r9.f3452B = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.p122m.C1917i.<init>(android.content.Context, android.os.Looper, int, b.l.a.c.b.m.d, b.l.a.c.b.l.k.f, b.l.a.c.b.l.k.l):void");
    }

    /* renamed from: A */
    public final Set<Scope> mo12189A() {
        return this.f3452B;
    }

    @NonNull
    /* renamed from: i */
    public Set<Scope> mo12021i() {
        return mo12212t() ? this.f3452B : Collections.emptySet();
    }

    /* renamed from: n */
    public int mo12206n() {
        return C1763f.f3112a;
    }

    /* renamed from: x */
    public final Account mo12216x() {
        return this.f3453C;
    }
}
