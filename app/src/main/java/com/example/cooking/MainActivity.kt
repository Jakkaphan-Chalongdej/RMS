package com.example.cooking


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity() {

    var promotion: RecyclerView? = null
    var Popdrink: RecyclerView? = null
    var Popsweet: RecyclerView? = null
    var Menu: RecyclerView? = null
    var foods = arrayOf(
        "ชาเขียวน้ำผึ้งมะนาว",
        "ชาดำเย็น",
        "ชาเขียวลาเต้",
        "ชาเขียวนมสด ",
        "ปังเย็น"


    )
    var arrImg = arrayOf<Int>(
        R.drawable.ic_lemontea,
        R.drawable.ic_blacktea,
        R.drawable.img_greentea,
        R.drawable.img_milkgreentea,
        R.drawable.pangyen

    )
    var arrTextfood= arrayOf<Int>(
        R.string.pro_lamonteas,
        R.string.pro_blacktea,
        R.string.pro_greentea,
        R.string.pro_milkgreentea,
        R.string.pro_pangyen
    )

    var foods2 = arrayOf(
        "ชาเขียวลาเต้",
        "ชาเขียวนมสด ",
        "COMING SOON"
    )
    var arrImg2 = arrayOf<Int>(
        R.drawable.img_greentea,
        R.drawable.img_milkgreentea,
        R.drawable.img_comingsoon
    )
    var arrTextfood2= arrayOf<Int>(
        R.string.greentea,
        R.string.milkgreentea,
        R.string.coming
    )

    var foods3 = arrayOf(
        "ปังเย็น",
        "ปังหน้ากลัวย",
        "COMING SOON"
    )
    var arrImg3 = arrayOf<Int>(
        R.drawable.pangyen,
        R.drawable.pangbanana,
        R.drawable.img_comingsoon
    )
    var arrTextfood3= arrayOf<Int>(
        R.string.pangyen,
        R.string.pangbanana,
        R.string.coming

    )
    var foods4 = arrayOf(
        "ชาเขียวน้ำผึ้งมะนาว",
        "โอเลี้ยง",
        "ชาดำเย็น",
        "ชาเขียวลาเต้",
        "ชาเขียวนมสด ",
        "ปังเย็น",
        "ปังหน้ากลัวย",
        "COMING SOON"

    )
    var arrImg4 = arrayOf<Int>(
        R.drawable.ic_lemontea,
        R.drawable.ic_ohliang,
        R.drawable.ic_blacktea,
        R.drawable.img_greentea,
        R.drawable.img_milkgreentea,
        R.drawable.pangyen,
        R.drawable.pangbanana,
        R.drawable.img_comingsoon
    )
    var arrTextfood4= arrayOf<Int>(
        R.string.lamonteas,
        R.string.ohliang,
        R.string.blacktea,
        R.string.greentea,
        R.string.milkgreentea,
        R.string.pangyen,
        R.string.pangbanana,
        R.string.coming

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tracking.setOnClickListener {
            var btnConfirm = Intent(this, TrackingOrder::class.java)
            startActivity(btnConfirm)
        }
        btnorder.setOnClickListener {
            var btnOrder = Intent(this, Order::class.java)
            startActivity(btnOrder)
        }
        promotion = findViewById(R.id.promotion) as RecyclerView
        promotion!!.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false) as RecyclerView.LayoutManager?
        val myAdapter = Adapter(foods,arrImg,arrTextfood,this)
        promotion!!.setAdapter(myAdapter)

        Popdrink = findViewById(R.id.Popdrink) as RecyclerView
        Popdrink!!.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false) as RecyclerView.LayoutManager?
        val myAdapter2 = Adapter(foods2,arrImg2,arrTextfood2,this)
        Popdrink!!.setAdapter(myAdapter2)

        Popsweet = findViewById(R.id.Popsweet) as RecyclerView
        Popsweet!!.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false) as RecyclerView.LayoutManager?
        val myAdapter3 = Adapter(foods3,arrImg3,arrTextfood3,this)
        Popsweet!!.setAdapter(myAdapter3)

        Menu = findViewById(R.id.Menu) as RecyclerView
        Menu!!.layoutManager = LinearLayoutManager(this) as RecyclerView.LayoutManager?
        Menu!!.setLayoutManager(GridLayoutManager(this, 3))
        val myAdapter4 = Adapter(foods4,arrImg4,arrTextfood4,this)
        Menu!!.setAdapter(myAdapter4)

    }

}
