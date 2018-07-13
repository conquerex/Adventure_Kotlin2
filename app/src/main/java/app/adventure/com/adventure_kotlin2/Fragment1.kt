package app.adventure.com.adventure_kotlin2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

/**
 * Created by barley on 2018. 7. 11.
 */
class Fragment1 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater!!.inflate(R.layout.fragment_1, container, false)

        Toast.makeText(activity, "Use 'this' on Fragment", Toast.LENGTH_LONG).show()

        return view
    }
}