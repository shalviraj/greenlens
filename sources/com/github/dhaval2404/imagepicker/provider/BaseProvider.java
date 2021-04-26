package com.github.dhaval2404.imagepicker.provider;

import android.content.ContextWrapper;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.widget.ActivityChooserModel;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0016\u001a\u00020\u00158\u0004@\u0004X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/provider/BaseProvider;", "Landroid/content/ContextWrapper;", "", "error", "Ld/r;", "setError", "(Ljava/lang/String;)V", "", "errorRes", "(I)V", "messageRes", "showToast", "setResultCancel", "()V", "onFailure", "Landroid/os/Bundle;", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "savedInstanceState", "onRestoreInstanceState", "Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;", "activity", "Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;", "getActivity", "()Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;", "<init>", "(Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;)V", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public abstract class BaseProvider extends ContextWrapper {
    private final ImagePickerActivity activity;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseProvider(ImagePickerActivity imagePickerActivity) {
        super(imagePickerActivity);
        C6888i.m12439f(imagePickerActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.activity = imagePickerActivity;
    }

    public final ImagePickerActivity getActivity() {
        return this.activity;
    }

    public void onFailure() {
    }

    public void onRestoreInstanceState(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
        C6888i.m12439f(bundle, "outState");
    }

    public final void setError(int i) {
        String string = getString(i);
        C6888i.m12435b(string, "getString(errorRes)");
        setError(string);
    }

    public final void setError(String str) {
        C6888i.m12439f(str, "error");
        onFailure();
        this.activity.setError(str);
    }

    public final void setResultCancel() {
        onFailure();
        this.activity.setResultCancel();
    }

    public final void showToast(int i) {
        Toast.makeText(this, i, 0).show();
    }
}
