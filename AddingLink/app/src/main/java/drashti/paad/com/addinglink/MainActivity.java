package drashti.paad.com.addinglink;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


    public class MainActivity extends AppCompatActivity {
        private Button button;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            final Context context=this;
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            button=(Button) findViewById(R.id.button);


            button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    Intent intent = new Intent(context,  WebViewActivity.class);
                    startActivity(intent);
                }

            });



        }

        }


