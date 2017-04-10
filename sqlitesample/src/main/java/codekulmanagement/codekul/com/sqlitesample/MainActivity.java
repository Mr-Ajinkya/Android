package codekulmanagement.codekul.com.sqlitesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtInput;
    TextView txtDiplay;
    MyDBHandler myDBHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtInput = (TextView) findViewById(R.id.txtInput);
        txtDiplay = (TextView) findViewById(R.id.txtDisplay);
        myDBHandler = new MyDBHandler(this, null, null, 1);
        printDatabase();

    }

    public void onAddClicked(){
        Products product = new Products(txtInput.getText().toString());
        myDBHandler.addProduct(product);
        printDatabase();

    }

    public void onDeleteClicked(View view){
        String inputText = txtInput.getText().toString();
        myDBHandler.deleteProduct(inputText);
        printDatabase();
    }

    private void printDatabase() {
        String dbString = myDBHandler.databaseToString();
        txtDiplay.setText(dbString);
        txtInput.setText(" ");
    }
}
