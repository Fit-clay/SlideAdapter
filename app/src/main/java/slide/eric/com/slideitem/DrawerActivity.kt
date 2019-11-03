package slide.eric.com.slideitem

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.AppCompatActivity
import android.widget.LinearLayout

class DrawerActivity : AppCompatActivity()  {

    lateinit var draw:DrawerLayout
    lateinit var ly_left:LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawerlayout)
        initView()
    }

    private fun initView() {
        draw=findViewById(R.id.draw_layout)
        ly_left=findViewById(R.id.ly_left)
        draw.openDrawer(ly_left)
    }

}