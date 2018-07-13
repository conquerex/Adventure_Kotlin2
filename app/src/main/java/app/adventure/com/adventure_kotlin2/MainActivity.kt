package app.adventure.com.adventure_kotlin2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.lyt_main, Fragment1())
                .commit()

        btn_move.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        println("1. 액티비티가 생성될때")
    }

    override fun onResume() {
        super.onResume()
        println("2. 액티비티가 화면에 나타나고")
    }

    override fun onPause() {
        super.onPause()
        println("3. 사라지기 전에 혹은 반만 가려지거나 반투명")
    }

    override fun onStop() {
        super.onStop()
        println("4. 사라진 이후에")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("5. 완전히 메모리에서 제거될 때")
    }
}
