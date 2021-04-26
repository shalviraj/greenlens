package p005b.p096l.p097a.p113c.p145h.p147b;

import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;

/* renamed from: b.l.a.c.h.b.d9 */
public final class C3152d9 implements C3291q3 {

    /* renamed from: a */
    public final /* synthetic */ String f5474a;

    /* renamed from: b */
    public final /* synthetic */ C3220j9 f5475b;

    public C3152d9(C3220j9 j9Var, String str) {
        this.f5475b = j9Var;
        this.f5474a = str;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo14177a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C3210j jVar;
        C3220j9 j9Var = this.f5475b;
        j9Var.mo14331f().mo14126h();
        j9Var.mo14347M();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                j9Var.f5666s = false;
                j9Var.mo14337B();
                throw th2;
            }
        }
        List<Long> list = j9Var.f5670w;
        Objects.requireNonNull(list, "null reference");
        j9Var.f5670w = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            j9Var.mo14329d().f5807n.mo14416c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            C3379y3 y3Var = j9Var.f5656i.f5562j;
            Objects.requireNonNull((C1959c) j9Var.mo14330e());
            y3Var.mo14634b(System.currentTimeMillis());
            if (i == 503 || i == 429) {
                C3379y3 y3Var2 = j9Var.f5656i.f5560h;
                Objects.requireNonNull((C1959c) j9Var.mo14330e());
                y3Var2.mo14634b(System.currentTimeMillis());
            }
            C3210j jVar2 = j9Var.f5650c;
            C3220j9.m6111F(jVar2);
            jVar2.mo14307m(list);
            j9Var.mo14336A();
            j9Var.f5666s = false;
            j9Var.mo14337B();
        }
        if (th == null) {
            try {
                C3379y3 y3Var3 = j9Var.f5656i.f5561i;
                Objects.requireNonNull((C1959c) j9Var.mo14330e());
                y3Var3.mo14634b(System.currentTimeMillis());
                j9Var.f5656i.f5562j.mo14634b(0);
                j9Var.mo14336A();
                j9Var.mo14329d().f5807n.mo14416c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                C3210j jVar3 = j9Var.f5650c;
                C3220j9.m6111F(jVar3);
                jVar3.mo14317x();
                try {
                    for (Long next : list) {
                        try {
                            jVar = j9Var.f5650c;
                            C3220j9.m6111F(jVar);
                            long longValue = next.longValue();
                            jVar.mo14126h();
                            jVar.mo14646i();
                            if (jVar.mo14286A().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            jVar.f5638a.mo14329d().f5799f.mo14415b("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            List<Long> list2 = j9Var.f5671x;
                            if (list2 == null || !list2.contains(next)) {
                                throw e2;
                            }
                        }
                    }
                    C3210j jVar4 = j9Var.f5650c;
                    C3220j9.m6111F(jVar4);
                    jVar4.mo14318y();
                    C3210j jVar5 = j9Var.f5650c;
                    C3220j9.m6111F(jVar5);
                    jVar5.mo14319z();
                    j9Var.f5671x = null;
                    C3324t3 t3Var = j9Var.f5649b;
                    C3220j9.m6111F(t3Var);
                    if (!t3Var.mo14591l() || !j9Var.mo14372z()) {
                        j9Var.f5672y = -1;
                        j9Var.mo14336A();
                    } else {
                        j9Var.mo14357h();
                    }
                    j9Var.f5661n = 0;
                    j9Var.f5666s = false;
                    j9Var.mo14337B();
                } catch (Throwable th3) {
                    C3210j jVar6 = j9Var.f5650c;
                    C3220j9.m6111F(jVar6);
                    jVar6.mo14319z();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                j9Var.mo14329d().f5799f.mo14415b("Database error while trying to delete uploaded bundles", e3);
                Objects.requireNonNull((C1959c) j9Var.mo14330e());
                j9Var.f5661n = SystemClock.elapsedRealtime();
                j9Var.mo14329d().f5807n.mo14415b("Disable upload, time", Long.valueOf(j9Var.f5661n));
            }
        }
        j9Var.mo14329d().f5807n.mo14416c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        C3379y3 y3Var4 = j9Var.f5656i.f5562j;
        Objects.requireNonNull((C1959c) j9Var.mo14330e());
        y3Var4.mo14634b(System.currentTimeMillis());
        C3379y3 y3Var22 = j9Var.f5656i.f5560h;
        Objects.requireNonNull((C1959c) j9Var.mo14330e());
        y3Var22.mo14634b(System.currentTimeMillis());
        C3210j jVar22 = j9Var.f5650c;
        C3220j9.m6111F(jVar22);
        jVar22.mo14307m(list);
        j9Var.mo14336A();
        j9Var.f5666s = false;
        j9Var.mo14337B();
    }
}
