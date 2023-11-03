package com.example.sliderudemy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.helper.widget.Carousel
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.OnItemClickListener

class MainActivity : AppCompatActivity() {
    private val list = mutableListOf<CarouselItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carousel: ImageCarousel = findViewById(R.id.carousel)
        list.add(CarouselItem("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6a/Odnagdy_v_skazke_regina.jpg/1200px-Odnagdy_v_skazke_regina.jpg", "Regina"))
        list.add(CarouselItem("https://upload.wikimedia.org/wikipedia/en/0/02/Emma-Swan-promo-ABC.jpg", "Emma"))
        list.add(CarouselItem("https://shopabctv.com/cdn/shop/products/CAG-33-OnceUponATime-Hook-34_RO_1200x1200.jpg?v=1626465609", "Hook"))
        list.add(CarouselItem("https://static.wikia.nocookie.net/once-upon-a-time-reborn/images/a/aa/Snow.jpg/revision/latest?cb=20160315003136", "Snow"))
        list.add(CarouselItem("https://agirlynerd.files.wordpress.com/2015/09/david1.jpg", "Charming"))
        carousel.addData(list)

        carousel.onItemClickListener = object : OnItemClickListener{
            override fun onClick(position: Int, carouselItem: CarouselItem) {
                Log.d("TAG", "Clic al elemento ${carouselItem.caption}")
                Toast.makeText(this@MainActivity, "Clic al elemento ${carouselItem.caption}", Toast.LENGTH_SHORT).show()
            }

            override fun onLongClick(position: Int, dataObject: CarouselItem) {

            }
        }

    }
}