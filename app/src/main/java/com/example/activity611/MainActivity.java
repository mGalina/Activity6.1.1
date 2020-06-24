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
    private String name = "Hello";

    final static String nameVariableKey = "NAME_VARIABLE";
    final static String textViewTexKey = "TEXTVIEW_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = findViewById(R.id.tv_hello);

        Log.d(LOG_TAG, getString(R.string.onCreate));
        mText.append("\n" + "onCreate");
    }

    @Override
    protected void onStart() {
        Log.d(LOG_TAG, getString(R.string.onStart));
        mText.setText(name);
        mText.append("\n" + "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(LOG_TAG, getString(R.string.onResume));
        mText.append("\n" + "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(LOG_TAG, getString(R.string.onPause));
        mText.append("\n" + "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(LOG_TAG, getString(R.string.onStop));
        mText.append("\n" + "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(LOG_TAG, getString(R.string.onDestroy));
        mText.append("\n" + "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d(LOG_TAG, getString(R.string.onRestart));
        mText.append("\n" + "onRestart");
        super.onRestart();
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        Log.d(LOG_TAG, getString(R.string.onPostCreate));
        mText.append("\n" + "onPostCreate");
        super.onPostCreate(savedInstanceState);
    }

    @Override
    protected void onPostResume() {
        Log.d(LOG_TAG, getString(R.string.onPostResume));
        mText.append("\n" + "onPostResume");
        super.onPostResume();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d(LOG_TAG, getString(R.string.onKeyDown));
        mText.append("\n" + "onKeyDown");
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.d(LOG_TAG, getString(R.string.onKeyLongPress));
        mText.append("\n" + "onKeyLongPress");
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        Log.d(LOG_TAG, getString(R.string.onBackPressed));
        mText.append("\n" + "onBackPressed");
        super.onBackPressed();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.d(LOG_TAG, getString(R.string.onSaveInstanceState));
        mText.append("\n" + "onSaveInstanceState");

        outState.putString(nameVariableKey, name);
        outState.putString(textViewTexKey, mText.getText().toString());

        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Log.d(LOG_TAG, getString(R.string.onRestoreInstanceState));
        mText.append("\n" + "onRestoreInstanceState");

        name = savedInstanceState.getString(nameVariableKey);
        String textViewText = savedInstanceState.getString(textViewTexKey);
        mText.setText(textViewText);

        super.onRestoreInstanceState(savedInstanceState);
    }
}