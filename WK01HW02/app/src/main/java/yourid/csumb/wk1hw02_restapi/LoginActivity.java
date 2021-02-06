package yourid.csumb.wk1hw02_restapi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login_button = findViewById(R.id.login_button);
        //Verifying Credentials on ButtonClick
        login_button.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){
               //Input Username and Password
               EditText username = findViewById(R.id.username);
               EditText password = findViewById(R.id.password);

               //Converting the values into Strings
               String name = username.getText().toString();
               String pw = password.getText().toString();

               //Verifying Credentials

           }
        });
    }
}
