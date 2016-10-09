/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /BigApp/BigApp_Discuz_Android/libs/AnalysisSDK/src/cn/sharesdk/server/AIDLService.aidl
 */
package cn.sharesdk.server;
public interface AIDLService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cn.sharesdk.server.AIDLService
{
private static final java.lang.String DESCRIPTOR = "cn.sharesdk.server.AIDLService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cn.sharesdk.server.AIDLService interface,
 * generating a proxy if needed.
 */
public static cn.sharesdk.server.AIDLService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cn.sharesdk.server.AIDLService))) {
return ((cn.sharesdk.server.AIDLService)iin);
}
return new cn.sharesdk.server.AIDLService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_setting:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.setting(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_saveLog:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.saveLog(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_uploadLog:
{
data.enforceInterface(DESCRIPTOR);
this.uploadLog();
reply.writeNoException();
return true;
}
case TRANSACTION_updateApk:
{
data.enforceInterface(DESCRIPTOR);
this.updateApk();
reply.writeNoException();
return true;
}
case TRANSACTION_updateConfig:
{
data.enforceInterface(DESCRIPTOR);
this.updateConfig();
reply.writeNoException();
return true;
}
case TRANSACTION_getfeedback:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.getfeedback(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_registerCallback:
{
data.enforceInterface(DESCRIPTOR);
cn.sharesdk.server.AIDLCallback _arg0;
_arg0 = cn.sharesdk.server.AIDLCallback.Stub.asInterface(data.readStrongBinder());
this.registerCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterCallback:
{
data.enforceInterface(DESCRIPTOR);
cn.sharesdk.server.AIDLCallback _arg0;
_arg0 = cn.sharesdk.server.AIDLCallback.Stub.asInterface(data.readStrongBinder());
this.unregisterCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_downloadApk:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.downloadApk(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cn.sharesdk.server.AIDLService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void setting(java.lang.String action, java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(action);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_setting, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void saveLog(java.lang.String action, java.lang.String jsonString) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(action);
_data.writeString(jsonString);
mRemote.transact(Stub.TRANSACTION_saveLog, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void uploadLog() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_uploadLog, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void updateApk() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_updateApk, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void updateConfig() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_updateConfig, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void getfeedback(java.lang.String page, java.lang.String size) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(page);
_data.writeString(size);
mRemote.transact(Stub.TRANSACTION_getfeedback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerCallback(cn.sharesdk.server.AIDLCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterCallback(cn.sharesdk.server.AIDLCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void downloadApk(java.lang.String apkUrl, java.lang.String apkFilePath) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(apkUrl);
_data.writeString(apkFilePath);
mRemote.transact(Stub.TRANSACTION_downloadApk, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_setting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_saveLog = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_uploadLog = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_updateApk = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_updateConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getfeedback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_registerCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_unregisterCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_downloadApk = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
}
public void setting(java.lang.String action, java.lang.String value) throws android.os.RemoteException;
public void saveLog(java.lang.String action, java.lang.String jsonString) throws android.os.RemoteException;
public void uploadLog() throws android.os.RemoteException;
public void updateApk() throws android.os.RemoteException;
public void updateConfig() throws android.os.RemoteException;
public void getfeedback(java.lang.String page, java.lang.String size) throws android.os.RemoteException;
public void registerCallback(cn.sharesdk.server.AIDLCallback cb) throws android.os.RemoteException;
public void unregisterCallback(cn.sharesdk.server.AIDLCallback cb) throws android.os.RemoteException;
public void downloadApk(java.lang.String apkUrl, java.lang.String apkFilePath) throws android.os.RemoteException;
}
