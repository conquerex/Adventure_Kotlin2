package app.adventure.com.adventure_kotlin2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter = MainRecyclerViewAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    class MainRecyclerViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        var images = arrayOf(R.drawable.drink_1, R.drawable.drink_2, R.drawable.drink_3,
                             R.drawable.drink_1, R.drawable.drink_2)
        var titles = arrayOf("Test11", "Test2", "Test3333", "Test 44", "Test555")
        var contents = arrayOf("하나...", "둘...", "세엣...", "네에엣.....", "다아서어엇..")
        override fun getItemCount(): Int {
            return images.size
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            var view = holder as CustomViewHolder
            view.imageView!!.setImageResource(images[position])
            view.textView!!.text = titles[position]
            view.textView2!!.text = contents[position]
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            var view = LayoutInflater.from(parent!!.context).inflate(R.layout.item_layout, parent, false)
            return CustomViewHolder(view)
        }

        class CustomViewHolder(view : View?) : RecyclerView.ViewHolder(view) {
            var imageView : ImageView? = null
            var textView : TextView? = null
            var textView2 : TextView? = null

            init {
                imageView = view!!.findViewById(R.id.img_profile)
                textView  = view.findViewById(R.id.txt_title)
                textView2 = view.findViewById(R.id.txt_content)
            }
        }

    }
}
