package com.example.activity611;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mText;
    private static final String LOG_TAG = "MyLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(LOG_TAG, getString(R.string.onCreate));
        mText.append("\n" + getString(R.string.onCreate));

        mText = findViewById(R.id.tv_hello);
    }

    @Override
    protected void onStart() {
        Log.d(LOG_TAG, getString(R.string.onStart));
        mText.append("\n" + getString(R.string.onStart));
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(LOG_TAG, getString(R.string.onResume));
        mText.append("\n" + getString(R.string.onResume));
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(LOG_TAG, getString(R.string.onPause));
        mText.append("\n" + getString(R.string.onPause));
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(LOG_TAG, getString(R.string.onStop));
        mText.append("\n" + getString(R.string.onStop));
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(LOG_TAG, getString(R.string.onDestroy));
        mText.append("\n" + getString(R.string.onDestroy));
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d(LOG_TAG, getString(R.string.onRestart));
        mText.append("\n" + getString(R.string.onRestart));
        super.onRestart();
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        Log.d(LOG_TAG, getString(R.string.onPostCreate));
        mText.append("\n" + getString(R.string.onPostCreate));
        super.onPostCreate(savedInstanceState);
    }

    @Override
    protected void onPostResume() {
        Log.d(LOG_TAG, getString(R.string.onPostResume));
        mText.append("\n" + getString(R.string.onPostResume));
        super.onPostResume();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d(LOG_TAG, getString(R.string.onKeyDown));
        mText.append("\n" + getString(R.string.onKeyDown));
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.d(LOG_TAG, getString(R.string.onKeyLongPress));
        mText.append("\n" + getString(R.string.onKeyLongPress));
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        Log.d(LOG_TAG, getString(R.string.onBackPressed));
        mText.append("\n" + getString(R.string.onBackPressed));
        super.onBackPressed();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.d(LOG_TAG, getString(R.string.onSaveInstanceState));
        mText.append("\n" + getString(R.string.onSaveInstanceState));
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Log.d(LOG_TAG, getString(R.string.onRestoreInstanceState));
        mText.append("\n" + getString(R.string.onRestoreInstanceState));
        super.onRestoreInstanceState(savedInstanceState);
    }
}