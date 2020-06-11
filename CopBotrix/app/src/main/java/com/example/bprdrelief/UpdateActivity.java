package com.example.bprdrelief;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class UpdateActivity extends AppCompatActivity {
    WebView ourb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        ourb =(WebView) findViewById(R.id.webView);
        ourb.setWebViewClient(new Mybrowser());
        ourb.getSettings().setJavaScriptEnabled(true);
        ourb.loadUrl("https://www.indiatoday.in/india");

    }
    private class Mybrowser extends WebViewClient{

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }


}
