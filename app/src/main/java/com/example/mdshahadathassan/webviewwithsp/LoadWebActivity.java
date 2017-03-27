package com.example.mdshahadathassan.webviewwithsp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LoadWebActivity extends AppCompatActivity {
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_web);
        web=(WebView)findViewById(R.id.webView);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setBuiltInZoomControls(true);

        String getData= getIntent().getExtras().getString("data");

        if(getData.equals("Web")){
            // Location of Website
        web.loadUrl("http://www.cricinfo.com");

        }
        if(getData.equals("Asset")){
            //Location of html file
            web.loadUrl("file:///android_asset/about.html");

        }
    }
    //for back press
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if(keyCode==KeyEvent.KEYCODE_BACK && web.canGoBack()){
            web.goBack();
            return true;
        }
        return super.onKeyDown(keyCode,event);
    }
}
