package gt.org.ipm.pokemongo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        handler = new Handler();
        handler.postDelayed(GoToMenu, 5000);
    }

    Runnable GoToMenu = new Runnable() {
        @Override
        public void run() {
            startMainMenu();
        }
    };

    private void startMainMenu(){
        Intent intentMainMenu = new Intent(this, MainMenuActivity.class);
        startActivity(intentMainMenu);
        finish();
    }

}
