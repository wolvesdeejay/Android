package com.wdtechnologies.Staffswildlife.Nature;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ThirdFragment extends Fragment {
    public static ThridFragment newInstance() {
        ThridFragment fragment = new ThridFragment();
        return fragment;
    }

    public WebView mWebView;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_third, container, false);
        mWebView = (WebView) v.findViewById(R.id.webview);
        mWebView.loadUrl("http://www.staffs-wildlife.org.uk/");

        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());

        return v;
    }

    private static class ThridFragment {
    }
}


