package androidx.core.e;

import android.os.Handler;
import android.os.Message;

/* compiled from: SelfDestructiveThread */
class g implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f616a;

    g(k kVar) {
        this.f616a = kVar;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f616a.a();
            return true;
        } else if (i != 1) {
            return true;
        } else {
            this.f616a.a((Runnable) message.obj);
            return true;
        }
    }
}
