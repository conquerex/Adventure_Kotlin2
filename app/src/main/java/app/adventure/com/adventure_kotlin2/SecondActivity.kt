package app.adventure.com.adventure_kotlin2

import android.Manifest
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var cal = Manifest.permission.READ_CALENDAR
        var loc = Manifest.permission.ACCESS_FINE_LOCATION
        var sen = Manifest.permission.BODY_SENSORS

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(arrayOf(cal, loc, sen), 100)
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 100) {
            for (i in permissions.indices) {
                println("권한 : " + permissions[i] + " // 허가상태 : " + grantResults[i])
            }
        }
    }

}
