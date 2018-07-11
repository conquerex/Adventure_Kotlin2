package app.adventure.com.adventure_kotlin2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by barley on 2018. 7. 11.
 */
class Fragment2 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater!!.inflate(R.layout.fragment_2, container, false)

        return view
    }
}