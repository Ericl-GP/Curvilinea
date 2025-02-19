package com.example.curvilina001

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.layout.layout


class MainActivity : AppCompatActivity() {
    private lateinit var myWebView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myWebView = findViewById(R.id.myWebView)
        myWebView.webViewClient =
            WebViewClient() // Isso é importante para que os links abram dentro do WebView
        // myWebView.settings.javaScriptEnabled = true // Habilita JavaScript (se necessário)

        val djangoUrl = "https://curvilinea-egressos.onrender.com/" // Substitua pelo URL do seu projeto Django
        myWebView.loadUrl(djangoUrl)

    }
    @Deprecated("This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    override fun onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}