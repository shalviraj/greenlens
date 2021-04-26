package com.github.dhaval2404.imagepicker.util;

import android.content.DialogInterface;
import com.github.dhaval2404.imagepicker.listener.ResultListener;
import kotlin.Metadata;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo24462d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "it", "Ld/r;", "onCancel", "(Landroid/content/DialogInterface;)V", "<anonymous>"}, mo24463k = 3, mo24464mv = {1, 4, 0})
public final class DialogHelper$showChooseAppDialog$dialog$1 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ ResultListener $listener;

    public DialogHelper$showChooseAppDialog$dialog$1(ResultListener resultListener) {
        this.$listener = resultListener;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.$listener.onResult(null);
    }
}
