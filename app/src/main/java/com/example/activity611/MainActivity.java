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
    private String text = "undefined";
    final static String nameVariableKey = "NAME_VARIABLE";
    final static String textViewTexKey = "TEXTVIEW_TEXT";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, getString(R.string.onCreate));

        mText = findViewById(R.id.tv_hello);

        if (savedInstanceState != null) {
            Log.d(LOG_TAG, getString(R.string.bundle));
            text = savedInstanceState.getString(nameVariableKey);
            String textViewText = savedInstanceState.getString(textViewTexKey);
            mText.append(textViewText);
            mText.append("\n" + getString(R.string.bundle));
        } else {
            Log.d(LOG_TAG, getString(R.string.bundle));
            mText.append(getString(R.string.bundle));
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, getString(R.string.onStart));
        mText.append("\n" + getString(R.string.onStart));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, getString(R.string.onResume));
        mText.append("\n" + getString(R.string.onResume));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, getString(R.string.onPause));
        mText.append("\n" + getString(R.string.onPause));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, getString(R.string.onStop));
        mText.append("\n" + getString(R.string.onStop));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, getString(R.string.onDestroy));
        mText.append("\n" + getString(R.string.onDestroy));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, getString(R.string.onRestart));
        mText.append("\n" + getString(R.string.onRestart));
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(LOG_TAG, getString(R.string.onPostCreate));
        mText.append("\n" + getString(R.string.onPostCreate));
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(LOG_TAG, getString(R.string.onPostResume));
        mText.append("\n" + getString(R.string.onPostResume));
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
        super.onBackPressed();
        Log.d(LOG_TAG, getString(R.string.onBackPressed));
        mText.append("\n" + getString(R.string.onBackPressed));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString(nameVariableKey, text);
        outState.putString(textViewTexKey, mText.getText().toString());
        super.onSaveInstanceState(outState);
        Log.d(LOG_TAG, getString(R.string.onSaveInstanceState));
        mText.append("\n" + getString(R.string.onSaveInstanceState));
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(LOG_TAG, getString(R.string.onRestoreInstanceState));
        mText.append("\n" + getString(R.string.onRestoreInstanceState));
    }
}