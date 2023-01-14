package androidx.core.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import androidx.core.content.a.c;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* compiled from: TypefaceCompatApi26Impl */
public class f extends d {

    /* renamed from: a  reason: collision with root package name */
    protected final Class f526a;

    /* renamed from: b  reason: collision with root package name */
    protected final Constructor f527b;

    /* renamed from: c  reason: collision with root package name */
    protected final Method f528c;
    protected final Method d;
    protected final Method e;
    protected final Method f;
    protected final Method g;

    public f() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor constructor;
        Method method5;
        Class cls = null;
        try {
            Class a2 = a();
            constructor = e(a2);
            method4 = b(a2);
            method3 = c(a2);
            method2 = f(a2);
            method = a(a2);
            Class cls2 = a2;
            method5 = d(a2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f526a = cls;
        this.f527b = constructor;
        this.f528c = method4;
        this.d = method3;
        this.e = method2;
        this.f = method;
        this.g = method5;
    }

    private boolean a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f528c.invoke(obj, new Object[]{context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private boolean b() {
        if (this.f528c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f528c != null;
    }

    private Object c() {
        try {
            return this.f527b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public Method d(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    public Constructor e(Class cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method f(Class cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    private boolean c(Object obj) {
        try {
            return ((Boolean) this.e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private void b(Object obj) {
        try {
            this.f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public Method b(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    public Method c(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    private boolean a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f526a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.g.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Typeface a(Context context, c.b bVar, Resources resources, int i) {
        if (!b()) {
            return super.a(context, bVar, resources, i);
        }
        Object c2 = c();
        for (c.C0008c cVar : bVar.a()) {
            if (!a(context, c2, cVar.a(), cVar.c(), cVar.e(), cVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.d()))) {
                b(c2);
                return null;
            }
        }
        if (!c(c2)) {
            return null;
        }
        return a(c2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        r13 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        r10 = r14;
        r14 = r13;
        r13 = r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(android.content.Context r12, android.os.CancellationSignal r13, androidx.core.e.f.b[] r14, int r15) {
        /*
            r11 = this;
            int r0 = r14.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0006
            return r2
        L_0x0006:
            boolean r0 = r11.b()
            if (r0 != 0) goto L_0x0064
            androidx.core.e.f$b r14 = r11.a((androidx.core.e.f.b[]) r14, (int) r15)
            android.content.ContentResolver r12 = r12.getContentResolver()
            android.net.Uri r15 = r14.c()     // Catch:{ IOException -> 0x0063 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r12 = r12.openFileDescriptor(r15, r0, r13)     // Catch:{ IOException -> 0x0063 }
            if (r12 != 0) goto L_0x0026
            if (r12 == 0) goto L_0x0025
            r12.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0025:
            return r2
        L_0x0026:
            android.graphics.Typeface$Builder r13 = new android.graphics.Typeface$Builder     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            java.io.FileDescriptor r15 = r12.getFileDescriptor()     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            r13.<init>(r15)     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            int r15 = r14.d()     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            android.graphics.Typeface$Builder r13 = r13.setWeight(r15)     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            boolean r14 = r14.e()     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            android.graphics.Typeface$Builder r13 = r13.setItalic(r14)     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            android.graphics.Typeface r13 = r13.build()     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            if (r12 == 0) goto L_0x0048
            r12.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0048:
            return r13
        L_0x0049:
            r13 = move-exception
            r14 = r2
            goto L_0x0052
        L_0x004c:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x004e }
        L_0x004e:
            r14 = move-exception
            r10 = r14
            r14 = r13
            r13 = r10
        L_0x0052:
            if (r12 == 0) goto L_0x0062
            if (r14 == 0) goto L_0x005f
            r12.close()     // Catch:{ Throwable -> 0x005a }
            goto L_0x0062
        L_0x005a:
            r12 = move-exception
            r14.addSuppressed(r12)     // Catch:{ IOException -> 0x0063 }
            goto L_0x0062
        L_0x005f:
            r12.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0062:
            throw r13     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            return r2
        L_0x0064:
            java.util.Map r12 = androidx.core.e.f.a((android.content.Context) r12, (androidx.core.e.f.b[]) r14, (android.os.CancellationSignal) r13)
            java.lang.Object r13 = r11.c()
            int r0 = r14.length
            r3 = 0
            r9 = 0
        L_0x006f:
            if (r9 >= r0) goto L_0x009c
            r4 = r14[r9]
            android.net.Uri r5 = r4.c()
            java.lang.Object r5 = r12.get(r5)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            if (r5 != 0) goto L_0x0080
            goto L_0x0099
        L_0x0080:
            int r6 = r4.b()
            int r7 = r4.d()
            boolean r8 = r4.e()
            r3 = r11
            r4 = r13
            boolean r3 = r3.a((java.lang.Object) r4, (java.nio.ByteBuffer) r5, (int) r6, (int) r7, (int) r8)
            if (r3 != 0) goto L_0x0098
            r11.b((java.lang.Object) r13)
            return r2
        L_0x0098:
            r3 = 1
        L_0x0099:
            int r9 = r9 + 1
            goto L_0x006f
        L_0x009c:
            if (r3 != 0) goto L_0x00a2
            r11.b((java.lang.Object) r13)
            return r2
        L_0x00a2:
            boolean r12 = r11.c((java.lang.Object) r13)
            if (r12 != 0) goto L_0x00a9
            return r2
        L_0x00a9:
            android.graphics.Typeface r12 = r11.a((java.lang.Object) r13)
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r15)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.a.f.a(android.content.Context, android.os.CancellationSignal, androidx.core.e.f$b[], int):android.graphics.Typeface");
    }

    public Typeface a(Context context, Resources resources, int i, String str, int i2) {
        if (!b()) {
            return super.a(context, resources, i, str, i2);
        }
        Object c2 = c();
        if (!a(context, c2, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            b(c2);
            return null;
        } else if (!c(c2)) {
            return null;
        } else {
            return a(c2);
        }
    }

    /* access modifiers changed from: protected */
    public Class a() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    public Method a(Class cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }
}
