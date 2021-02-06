package yourid.csumb.wk1hw02_restapi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
               Log.i("Log Message", "Login Button Clicked");
               //Input Username and Password
               EditText username = findViewById(R.id.username);
               EditText password = findViewById(R.id.password);

               //Converting the values into Strings
               String name = username.getText().toString();
               String pw = password.getText().toString();

               //Verifying Credentials
               //Username: din_djarin  Password: baby_yoda_ftw
               if(name.equals("din_djarin") && pw.equals("baby_yoda_ftw"))
               {
                   //Successful Login
                   //Transition to Main Activity
                   Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                   startActivity(intent);

               }
               else
               {
                   //Unsuccessful Login
                   //Display an Error Message
                   if(!name.equals("din_djarin") && !pw.equals("baby_yoda_ftw")){
                       //Username and Password are Wrong
                       TextView msg = findViewById(R.id.message);
                       msg.setText("Incorrect Username and Password");
                   }
                   else if(!pw.equals("baby_yoda_ftw")){
                       //Just Password is Wrong
                       TextView msg = findViewById(R.id.message);
                       msg.setText("Incorrect Password");
                   }
                   else if(!name.equals("din_djarin")){
                       //Just Username is Wrong
                       TextView msg = findViewById(R.id.message);
                       msg.setText("Incorrect Username");
                   }


               }

           }
        });
    }
}
