package quizdroid.kylep9.washington.edu.quizdroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

/**
 * Created by iguest on 2/23/15.
 */
public class RepeatingAlarm extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
        String url = sharedPrefs.getString("url", "No URL Set");
        //String url = intent.getStringExtra("url");
        Toast.makeText(context, url, Toast.LENGTH_SHORT).show();
    }
}