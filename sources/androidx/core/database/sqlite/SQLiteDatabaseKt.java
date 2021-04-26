package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import kotlin.Metadata;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0004H\b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo24462d2 = {"T", "Landroid/database/sqlite/SQLiteDatabase;", "", "exclusive", "Lkotlin/Function1;", "body", "transaction", "(Landroid/database/sqlite/SQLiteDatabase;ZLd/x/b/l;)Ljava/lang/Object;", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class SQLiteDatabaseKt {
    public static final <T> T transaction(SQLiteDatabase sQLiteDatabase, boolean z, C6862l<? super SQLiteDatabase, ? extends T> lVar) {
        C6888i.m12439f(sQLiteDatabase, "$this$transaction");
        C6888i.m12439f(lVar, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T invoke = lVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static Object transaction$default(SQLiteDatabase sQLiteDatabase, boolean z, C6862l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        C6888i.m12439f(sQLiteDatabase, "$this$transaction");
        C6888i.m12439f(lVar, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object invoke = lVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
