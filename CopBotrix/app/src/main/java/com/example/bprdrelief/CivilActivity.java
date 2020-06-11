package com.example.bprdrelief;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CivilActivity extends AppCompatActivity {

    WebView ourb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);
        ourb =(WebView) findViewById(R.id.webView2);
        ourb.setWebViewClient(new CivilActivity.MyBrowser());
        ourb.getSettings().setJavaScriptEnabled(true);
        ourb.loadUrl("https://yourstory.com/mystory/2a21a79849-the-civil-law-in-india");

    }
    private class MyBrowser extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
