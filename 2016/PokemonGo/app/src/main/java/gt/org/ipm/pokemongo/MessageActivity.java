package gt.org.ipm.pokemongo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import gt.org.ipm.pokemongo.objects.Condominium;

public class MessageActivity extends AppCompatActivity {

    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        String nuestroMensaje = getIntent().getStringExtra(MainMenuActivity.MESSAGE_KEY);
        Condominium condominium = getIntent().getParcelableExtra("MiCondominio");

        
        tvMessage = (TextView) findViewById(R.id.tv_message);

        tvMessage.setText(nuestroMensaje);
    }

}
