package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p005b.p035e.p036a.p037a.C0843a;

public class LayoutState {
    public static final int INVALID_LAYOUT = Integer.MIN_VALUE;
    public static final int ITEM_DIRECTION_HEAD = -1;
    public static final int ITEM_DIRECTION_TAIL = 1;
    public static final int LAYOUT_END = 1;
    public static final int LAYOUT_START = -1;
    public int mAvailable;
    public int mCurrentPosition;
    public int mEndLine = 0;
    public boolean mInfinite;
    public int mItemDirection;
    public int mLayoutDirection;
    public boolean mRecycle = true;
    public int mStartLine = 0;
    public boolean mStopInFocusable;

    public boolean hasMore(RecyclerView.State state) {
        int i = this.mCurrentPosition;
        return i >= 0 && i < state.getItemCount();
    }

    public View next(RecyclerView.Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(this.mCurrentPosition);
        this.mCurrentPosition += this.mItemDirection;
        return viewForPosition;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("LayoutState{mAvailable=");
        u.append(this.mAvailable);
        u.append(", mCurrentPosition=");
        u.append(this.mCurrentPosition);
        u.append(", mItemDirection=");
        u.append(this.mItemDirection);
        u.append(", mLayoutDirection=");
        u.append(this.mLayoutDirection);
        u.append(", mStartLine=");
        u.append(this.mStartLine);
        u.append(", mEndLine=");
        u.append(this.mEndLine);
        u.append('}');
        return u.toString();
    }
}
