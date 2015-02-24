// Kyle Peterson, INFO 498, QuizDroid
// Home page
package quizdroid.kylep9.washington.edu.quizdroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Iterator;


public class MainActivity extends ActionBarActivity {
    protected QuizApp app;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        app = (QuizApp) getApplication();
        QuizApp instance = app.getInstance();
        SimpleTopicRepo repo = instance.topicRepo;
        Iterator topicIt = repo.getTopicNames().iterator();
        final Button button1 = (Button) findViewById(R.id.button1);
        String topic = (String) topicIt.next();
        button1.setText(topic);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent nextActivity = new Intent(MainActivity.this, QuestionActivity.class);
                nextActivity.putExtra("topic-name", button1.getText());
                startActivity(nextActivity);
                finish();
            }
        });

        final Button button2 = (Button) findViewById(R.id.button2);
        topic = (String) topicIt.next();
        button2.setText(topic);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent nextActivity = new Intent(MainActivity.this, QuestionActivity.class);
                nextActivity.putExtra("topic-name", button2.getText());
                startActivity(nextActivity);
                finish();
            }
        });

        final Button button3 = (Button) findViewById(R.id.button3);
        topic = (String) topicIt.next();
        button3.setText(topic);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent nextActivity = new Intent(MainActivity.this, QuestionActivity.class);
                nextActivity.putExtra("topic-name", button3.getText());
                startActivity(nextActivity);
                finish();

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        // noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
