package app.adventure.com.adventure_kotlin2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter = MainRecyclerViewAdapter()
        var gridManager = GridLayoutManager(this, 3)
        recyclerView.layoutManager = gridManager

        gridManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                if(position == 0) {
                    return 3
                }
                return 1
            }
        }
    }

    class MainRecyclerViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        var images = arrayOf(R.drawable.cup_on_table, R.drawable.beer_cup, R.drawable.cup_on_table, R.drawable.beer_cup, R.drawable.beer_cup, R.drawable.beer_cup)

        // 각각의 아이템의 디자인 레이아웃을 불러오는 부분
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            var view = LayoutInflater.from(parent!!.context).inflate(R.layout.item_layout, parent, false)
            var params = view.layoutParams

            if (viewType == 0) {
                params.height = (parent.measuredWidth / 3) * 2
                params.width  = parent.measuredWidth
                view.layoutParams = params
                return CustomViewHolder(view)
            }
            params.height = parent.measuredWidth / 3
            params.width  = parent.measuredWidth / 3
            view.layoutParams = params
            return CustomViewHolder(view)
        }

        class CustomViewHolder(view: View?) : RecyclerView.ViewHolder(view) {
            var imageView : ImageView? = null
            init {
                imageView = view!!.findViewById(R.id.img_item)
            }
        }

        override fun getItemCount(): Int {
            return images.size
        }

        // 각각의 아이템에 데이터를 바인딩 시켜주는 기
        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            var view = holder as CustomViewHolder
            view!!.imageView!!.setImageResource((images[position]))
        }

        // 포지션 값에 따라서 타입을 바꿔주는 기능
        override fun getItemViewType(position: Int): Int {
            if(position == 0) {
                return 0
            }
            return 1
        }
    }
}
