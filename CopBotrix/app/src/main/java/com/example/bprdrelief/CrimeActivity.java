package com.example.bprdrelief;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CrimeActivity extends AppCompatActivity {


    WebView ourb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);
        ourb =(WebView) findViewById(R.id.webView1);
        ourb.setWebViewClient(new CrimeActivity.MyBrowser());
        ourb.getSettings().setJavaScriptEnabled(true);
        ourb.loadUrl("https://eservices.tnpolice.gov.in/CCTNSNICSDC/PreventionTips");

    }
    private class MyBrowser extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
