package p005b.p051h.p052a.p055m.p064x.p070h;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p055m.p064x.p066d.C1269b;
import p005b.p051h.p052a.p055m.p064x.p069g.C1282c;
import p005b.p051h.p052a.p078s.C1367a;

/* renamed from: b.h.a.m.x.h.d */
public class C1297d implements C1298e<C1282c, byte[]> {
    @Nullable
    /* renamed from: a */
    public C1115w<byte[]> mo11138a(@NonNull C1115w<C1282c> wVar, @NonNull C0979p pVar) {
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = wVar.get().f1593g.f1604a.f1606a.mo10814g().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = C1367a.f1777a;
        C1367a.C1369b bVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new C1367a.C1369b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        if (bVar != null && bVar.f1780a == 0 && bVar.f1781b == bVar.f1782c.length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            asReadOnlyBuffer2.position(0);
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new C1269b(bArr);
    }
}
