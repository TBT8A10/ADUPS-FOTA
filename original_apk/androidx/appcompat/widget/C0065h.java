package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.ActionMenuPresenter;

/* renamed from: androidx.appcompat.widget.h  reason: case insensitive filesystem */
/* compiled from: ActionMenuPresenter */
class C0065h implements Parcelable.Creator<ActionMenuPresenter.SavedState> {
    C0065h() {
    }

    public ActionMenuPresenter.SavedState createFromParcel(Parcel parcel) {
        return new ActionMenuPresenter.SavedState(parcel);
    }

    public ActionMenuPresenter.SavedState[] newArray(int i) {
        return new ActionMenuPresenter.SavedState[i];
    }
}
