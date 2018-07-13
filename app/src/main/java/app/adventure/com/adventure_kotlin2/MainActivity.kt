package app.adventure.com.adventure_kotlin2

import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        supportFragmentManager.beginTransaction().replace(R.id.lyt_frame, Fragment1()).commit()

        // SharedPreference 객체
        var sp = PreferenceManager.getDefaultSharedPreferences(this)

        // SharedPreference 수정 객체
        var edit = sp.edit()
        var saveString = sp.getString("userId", "아이디 입력하세요.")
        edt_name.setText(saveString)

        btn_save.setOnClickListener {
            edit.putString("userId", edt_name.text.toString()).commit()
        }
    }
}
