package app.adventure.com.adventure_kotlin2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
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
        spn_country.onItemSelectedListener = object  : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                //
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                var country = parent!!.getItemAtPosition(position)
                var adapter : ArrayAdapter<String>? = null
                if(country == "Korea") {
                    adapter = ArrayAdapter<String>(this@MainActivity, android.R.layout.simple_spinner_dropdown_item, city_kor)
                } else if(country == "USA") {
                    adapter = ArrayAdapter<String>(this@MainActivity, android.R.layout.simple_spinner_dropdown_item, city_usa)
                }
                spn_city.adapter = adapter
            }
        }

        spn_city.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                //
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                var city = parent!!.getItemAtPosition(position).toString()
                Toast.makeText(this@MainActivity, city + "를 선택했습니다.", Toast.LENGTH_LONG).show()
            }

        }
    }

}
