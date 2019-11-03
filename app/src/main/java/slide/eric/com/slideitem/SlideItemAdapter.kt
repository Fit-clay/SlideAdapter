package slide.eric.com.slideitem

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.util.ArrayList

class SlideItemAdapter (mList:List<ItemBean>): RecyclerView.Adapter<SlideItemAdapter.SlideHolder>() {

    lateinit var itemList:List<ItemBean>

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): SlideHolder {
    var view : View=LayoutInflater.from(p0.context).inflate(R.layout.view_item_slide,p0,false)
        return SlideHolder(view)
    }
    init {
        itemList= mList
    }

    override fun getItemCount(): Int {
        if(itemList!=null)
        return itemList.size

        return 0
      }

    override fun onBindViewHolder(p0: SlideHolder, p1: Int) {
    }


    class SlideHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var tvName:TextView
        lateinit var tvType:TextView
        lateinit var tvTime:TextView

        init {

//            tvName=itemView.findViewById(R.id.name)
        }
    }
}