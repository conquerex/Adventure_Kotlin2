package app.adventure.com.adventure_kotlin2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager2.adapter = ViewPagerAdapter(supportFragmentManager)
    }

    class ViewPagerAdapter(fm: FragmentManager): FragmentStatePagerAdapter(fm) {

        var fragments = arrayOf(Fragment1(), Fragment2())

        // 화면을 넣어주는 부분
        override fun getItem(position: Int): Fragment {
            return fragments[position]
        }

        // 페이지 갯수를 세는 부분
        override fun getCount(): Int {
            return fragments.size
        }

    }
}
