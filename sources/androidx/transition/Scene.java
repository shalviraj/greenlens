package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Scene {
    private Context mContext;
    private Runnable mEnterAction;
    private Runnable mExitAction;
    private View mLayout;
    private int mLayoutId = -1;
    private ViewGroup mSceneRoot;

    public Scene(@NonNull ViewGroup viewGroup) {
        this.mSceneRoot = viewGroup;
    }

    private Scene(ViewGroup viewGroup, int i, Context context) {
        this.mContext = context;
        this.mSceneRoot = viewGroup;
        this.mLayoutId = i;
    }

    public Scene(@NonNull ViewGroup viewGroup, @NonNull View view) {
        this.mSceneRoot = viewGroup;
        this.mLayout = view;
    }

    @Nullable
    public static Scene getCurrentScene(@NonNull ViewGroup viewGroup) {
        return (Scene) viewGroup.getTag(C0518R.C0521id.transition_current_scene);
    }

    @NonNull
    public static Scene getSceneForLayout(@NonNull ViewGroup viewGroup, @LayoutRes int i, @NonNull Context context) {
        int i2 = C0518R.C0521id.transition_scene_layoutid_cache;
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(i2);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(i2, sparseArray);
        }
        Scene scene = (Scene) sparseArray.get(i);
        if (scene != null) {
            return scene;
        }
        Scene scene2 = new Scene(viewGroup, i, context);
        sparseArray.put(i, scene2);
        return scene2;
    }

    public static void setCurrentScene(@NonNull ViewGroup viewGroup, @Nullable Scene scene) {
        viewGroup.setTag(C0518R.C0521id.transition_current_scene, scene);
    }

    public void enter() {
        if (this.mLayoutId > 0 || this.mLayout != null) {
            getSceneRoot().removeAllViews();
            if (this.mLayoutId > 0) {
                LayoutInflater.from(this.mContext).inflate(this.mLayoutId, this.mSceneRoot);
            } else {
                this.mSceneRoot.addView(this.mLayout);
            }
        }
        Runnable runnable = this.mEnterAction;
        if (runnable != null) {
            runnable.run();
        }
        setCurrentScene(this.mSceneRoot, this);
    }

    public void exit() {
        Runnable runnable;
        if (getCurrentScene(this.mSceneRoot) == this && (runnable = this.mExitAction) != null) {
            runnable.run();
        }
    }

    @NonNull
    public ViewGroup getSceneRoot() {
        return this.mSceneRoot;
    }

    public boolean isCreatedFromLayoutResource() {
        return this.mLayoutId > 0;
    }

    public void setEnterAction(@Nullable Runnable runnable) {
        this.mEnterAction = runnable;
    }

    public void setExitAction(@Nullable Runnable runnable) {
        this.mExitAction = runnable;
    }
}
