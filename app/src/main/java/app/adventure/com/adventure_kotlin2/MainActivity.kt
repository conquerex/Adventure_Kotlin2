package app.adventure.com.adventure_kotlin2

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var cal = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_date.setOnClickListener {
            showDatePicker()
        }

        btn_time.setOnClickListener {
            showTimePicker()
        }
    }

    fun showDatePicker() {
        DatePickerDialog(this, DatePickerDialog.OnDateSetListener { date, year, month, dayOfMonth ->
            println("* * * * "+ year + "/" + (month + 1) + "/" + dayOfMonth)
        }, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE)).show()
    }

    fun showTimePicker() {
        TimePickerDialog(this, TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
            println("* * * * "+ hourOfDay + "/" + minute)
        }, cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), true).show()
    }
}
