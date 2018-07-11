package app.adventure.com.adventure_kotlin2

import android.os.Bundle
import android.support.design.widget.TabLayout
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
        lyt_tab.addTab(lyt_tab.newTab().setText("Fragment1"))
        lyt_tab.addTab(lyt_tab.newTab().setText("Fragment2"))
        lyt_tab.addOnTabSelectedListener(object :TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {
                //
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                //
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager2.setCurrentItem(tab!!.position)
            }

        })

        viewPager2.addOnPageChangeListener(object : TabLayout.TabLayoutOnPageChangeListener(lyt_tab){
            //
        })
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
