package id.management.jagauang;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
    Button archieve;
    Button help;
    Button report;
    Button saving;
    Button spending;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.saving = (Button) findViewById(R.id.bsaving);
        this.saving.setOnClickListener(this);
        this.archieve = (Button) findViewById(R.id.barchieve);
        this.archieve.setOnClickListener(this);
        this.spending = (Button) findViewById(R.id.bspending);
        this.spending.setOnClickListener(this);
        this.report = (Button) findViewById(R.id.breport);
        this.report.setOnClickListener(this);
        this.help = (Button) findViewById(R.id.help_id);
        this.help.setOnClickListener(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void onClick(View v) {
        if (v == this.saving) {
            startActivity(new Intent(this, SavingActivity.class));
        }
        if (v == this.archieve) {
            startActivity(new Intent(this, ReportActivity.class));
        }
        if (v == this.spending) {
            startActivity(new Intent(this, SpendingActivity.class));
        }
        if (v == this.report) {
            startActivity(new Intent(this, daftar_management.class));
        }
        if (v == this.help) {
            startActivity(new Intent(this, HelpActivity.class));
        }
    }
}
