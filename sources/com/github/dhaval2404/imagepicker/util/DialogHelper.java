package com.github.dhaval2404.imagepicker.util;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog;
import com.github.dhaval2404.imagepicker.C5456R;
import com.github.dhaval2404.imagepicker.constant.ImageProvider;
import com.github.dhaval2404.imagepicker.listener.ResultListener;
import com.segment.analytics.integrations.BasePayload;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/util/DialogHelper;", "", "Landroid/content/Context;", "context", "Lcom/github/dhaval2404/imagepicker/listener/ResultListener;", "Lcom/github/dhaval2404/imagepicker/constant/ImageProvider;", "listener", "Ld/r;", "showChooseAppDialog", "(Landroid/content/Context;Lcom/github/dhaval2404/imagepicker/listener/ResultListener;)V", "<init>", "()V", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class DialogHelper {
    public static final DialogHelper INSTANCE = new DialogHelper();

    private DialogHelper() {
    }

    public final void showChooseAppDialog(Context context, ResultListener<ImageProvider> resultListener) {
        C6888i.m12439f(context, BasePayload.CONTEXT_KEY);
        C6888i.m12439f(resultListener, "listener");
        View inflate = LayoutInflater.from(context).inflate(C5456R.layout.dialog_choose_app, (ViewGroup) null);
        AlertDialog show = new AlertDialog.Builder(context).setTitle(C5456R.string.title_choose_image_provider).setView(inflate).setOnCancelListener(new DialogHelper$showChooseAppDialog$dialog$1(resultListener)).setNegativeButton(C5456R.string.action_cancel, (DialogInterface.OnClickListener) new DialogHelper$showChooseAppDialog$dialog$2(resultListener)).show();
        C6888i.m12435b(inflate, "customView");
        ((LinearLayout) inflate.findViewById(C5456R.C5459id.lytCameraPick)).setOnClickListener(new DialogHelper$showChooseAppDialog$1(resultListener, show));
        ((LinearLayout) inflate.findViewById(C5456R.C5459id.lytGalleryPick)).setOnClickListener(new DialogHelper$showChooseAppDialog$2(resultListener, show));
    }
}
