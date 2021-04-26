package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Metadata;
import p298d.C6777r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p298d.p414b0.C7668h;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\r\u001a\u00020\u0007*\u00020\u0000H\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0007*\u00020\u0000H\b¢\u0006\u0004\b\u000f\u0010\u000e\u001a(\u0010\u0012\u001a\u00020\n*\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0010H\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a.\u0010\u0015\u001a\u00020\n*\u00020\u00002\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0014H\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017*\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0018\u0010\u001c\u001a\u00020\u0001*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001d*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, mo24462d2 = {"Landroid/view/Menu;", "", "index", "Landroid/view/MenuItem;", "get", "(Landroid/view/Menu;I)Landroid/view/MenuItem;", "item", "", "contains", "(Landroid/view/Menu;Landroid/view/MenuItem;)Z", "Ld/r;", "minusAssign", "(Landroid/view/Menu;Landroid/view/MenuItem;)V", "isEmpty", "(Landroid/view/Menu;)Z", "isNotEmpty", "Lkotlin/Function1;", "action", "forEach", "(Landroid/view/Menu;Ld/x/b/l;)V", "Lkotlin/Function2;", "forEachIndexed", "(Landroid/view/Menu;Ld/x/b/p;)V", "", "iterator", "(Landroid/view/Menu;)Ljava/util/Iterator;", "getSize", "(Landroid/view/Menu;)I", "size", "Ld/b0/h;", "getChildren", "(Landroid/view/Menu;)Ld/b0/h;", "children", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class MenuKt {
    public static final boolean contains(Menu menu, MenuItem menuItem) {
        C6888i.m12439f(menu, "$this$contains");
        C6888i.m12439f(menuItem, "item");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            if (C6888i.m12434a(menu.getItem(i), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(Menu menu, C6862l<? super MenuItem, C6777r> lVar) {
        C6888i.m12439f(menu, "$this$forEach");
        C6888i.m12439f(lVar, "action");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            C6888i.m12435b(item, "getItem(index)");
            lVar.invoke(item);
        }
    }

    public static final void forEachIndexed(Menu menu, C6866p<? super Integer, ? super MenuItem, C6777r> pVar) {
        C6888i.m12439f(menu, "$this$forEachIndexed");
        C6888i.m12439f(pVar, "action");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            Integer valueOf = Integer.valueOf(i);
            MenuItem item = menu.getItem(i);
            C6888i.m12435b(item, "getItem(index)");
            pVar.invoke(valueOf, item);
        }
    }

    public static final MenuItem get(Menu menu, int i) {
        C6888i.m12439f(menu, "$this$get");
        MenuItem item = menu.getItem(i);
        C6888i.m12435b(item, "getItem(index)");
        return item;
    }

    public static final C7668h<MenuItem> getChildren(Menu menu) {
        C6888i.m12439f(menu, "$this$children");
        return new MenuKt$children$1(menu);
    }

    public static final int getSize(Menu menu) {
        C6888i.m12439f(menu, "$this$size");
        return menu.size();
    }

    public static final boolean isEmpty(Menu menu) {
        C6888i.m12439f(menu, "$this$isEmpty");
        return menu.size() == 0;
    }

    public static final boolean isNotEmpty(Menu menu) {
        C6888i.m12439f(menu, "$this$isNotEmpty");
        return menu.size() != 0;
    }

    public static final Iterator<MenuItem> iterator(Menu menu) {
        C6888i.m12439f(menu, "$this$iterator");
        return new MenuKt$iterator$1(menu);
    }

    public static final void minusAssign(Menu menu, MenuItem menuItem) {
        C6888i.m12439f(menu, "$this$minusAssign");
        C6888i.m12439f(menuItem, "item");
        menu.removeItem(menuItem.getItemId());
    }
}
