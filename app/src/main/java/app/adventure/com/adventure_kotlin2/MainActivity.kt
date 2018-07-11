package app.adventure.com.adventure_kotlin2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var country = arrayOf("Korea", "USA")
    var city_kor = arrayOf("Seoul", "Busan")
    var city_usa = arrayOf("NY", "LA")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var countryAdapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, country)
        spn_country.adapter = countryAdapter
    }

}
