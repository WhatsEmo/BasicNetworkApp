package com.example.whatsemo.basicnetworkapp;

import android.net.NetworkInfo;

public interface DownloadCallback<T> {

    void updateFromDownload(T result);

    NetworkInfo getActiveNetworkInfo();

    void onProgressUpdate(int progressCode, int percentComplete);

    void finishDownloading();
}