package com.nature.mychannel;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        wv = findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setDomStorageEnabled(true);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("https://youtube.com/@alagarsadjactamil3503?si=NS6SrIBf3JR3Mn6c");

    }

    public void onBackPressed()
    {
        if (wv !=null && wv.canGoBack()) {
            wv.goBack();
        } else {
            super.onBackPressed();
        }
    }


}