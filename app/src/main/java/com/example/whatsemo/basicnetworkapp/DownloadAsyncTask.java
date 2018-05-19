package com.example.whatsemo.basicnetworkapp;

import android.os.AsyncTask;

import java.lang.ref.WeakReference;

public class DownloadAsyncTask extends AsyncTask<String, Integer, UserViewHolder> {



    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected UserViewHolder doInBackground(String... strings) {
        return null;
    }

    @Override
    protected void onPostExecute(UserViewHolder userViewHolder) {
        super.onPostExecute(userViewHolder);
    }
}
