package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import kotlin.Metadata;
import p298d.C6777r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\b¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, mo24462d2 = {"Landroid/content/SharedPreferences;", "", "commit", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Ld/r;", "action", "edit", "(Landroid/content/SharedPreferences;ZLd/x/b/l;)V", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class SharedPreferencesKt {
    @SuppressLint({"ApplySharedPref"})
    public static final void edit(SharedPreferences sharedPreferences, boolean z, C6862l<? super SharedPreferences.Editor, C6777r> lVar) {
        C6888i.m12439f(sharedPreferences, "$this$edit");
        C6888i.m12439f(lVar, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C6888i.m12435b(edit, "editor");
        lVar.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public static /* synthetic */ void edit$default(SharedPreferences sharedPreferences, boolean z, C6862l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        C6888i.m12439f(sharedPreferences, "$this$edit");
        C6888i.m12439f(lVar, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C6888i.m12435b(edit, "editor");
        lVar.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
