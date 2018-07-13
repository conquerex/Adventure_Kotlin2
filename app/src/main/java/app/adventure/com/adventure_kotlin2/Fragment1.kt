package app.adventure.com.adventure_kotlin2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by barley on 2018. 7. 11.
 */
class Fragment1 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater!!.inflate(R.layout.fragment_1, container, false)

        return view
    }

    override fun onStart() {
        super.onStart()
    }

    // 프래그먼트 나타나기 전
    override fun onResume() {
        super.onResume()
    }

    // 반만 가려진 상태
    override fun onPause() {
        super.onPause()
    }

    // 정지
    override fun onStop() {
        super.onStop()
    }

    // 프래그먼트 제거
    override fun onDetach() {
        super.onDetach()
    }
}