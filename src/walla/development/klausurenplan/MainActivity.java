package walla.development.klausurenplan;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void pläneabrufen(View view){
		TextView tv=(TextView) findViewById(R.id.textView1);
		tv.setText("Pläne am abrufen");
		WebView wv=(WebView) findViewById(R.id.webView1);
		wv.loadUrl("http://wikis.zum.de/rmg/Neue_Oberstufe/Klausurtermine_Q11");
		tv.setText("");
	}
	
}
	
