package app.meensinaai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TelaLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button btnEntrar = (Button)findViewById(R.id.buttonEntrar);
        final EditText edtEmail = (EditText) findViewById(R.id.editEmail);
        final EditText edtSenha = (EditText) findViewById(R.id.editSenha);
        TextView txtCadastro = (TextView) findViewById(R.id.textCadastrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtSenha.getText().toString().trim().equals("") || edtEmail.getText().toString().trim().equals("")){
                    Toast.makeText(getBaseContext(),"Preencha todos os campos!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getBaseContext(),"Bem Vindo!",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getBaseContext(),TelaPrincipal.class));
                }
            }
        });

        txtCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(),TelaCadastro.class));
            }
        });
    }
}
