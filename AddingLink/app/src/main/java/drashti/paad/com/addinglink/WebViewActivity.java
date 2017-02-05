package drashti.paad.com.addinglink;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by palak mehta on 6/14/2016.
 */
public class WebViewActivity extends Activity {

    private WebView webView;
 //   private WebView webView2;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.google.com/");

       /*webView2 = (WebView) findViewById(R.id.webView1);
        webView2.setWebViewClient(new webViewClient());
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.loadUrl("http://npu85.npu.edu/~henry/npu/classes/index_course.html");

    }
    public class webViewClient extends WebViewClient{
        public void onReceivedHttpRequest(WebView view, HttpAuthHandler handler, String host, String realm){
            handler.proceed("cs532","cs535");
        }*/
    }

    }
