package app.adventure.com.adventure_kotlin2

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_toast.setOnClickListener {
            Toast.makeText(this, "Toast message", Toast.LENGTH_LONG).show()
        }

        btn_snack.setOnClickListener {
            Snackbar.make(lyt_main, "Snackbar message", Snackbar.LENGTH_LONG).show()

        }

    }
}
