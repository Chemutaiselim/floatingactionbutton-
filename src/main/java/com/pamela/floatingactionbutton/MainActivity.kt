package com.pamela.floatingactionbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val rotateopen: Animation by lazy { AnimationUtils.loadAnimation(this,R.anim.rotate_open) }
    private val rotateclose: Animation by lazy { AnimationUtils.loadAnimation(this,R.anim.rotate_close) }
    private val toBottom: Animation by lazy { AnimationUtils.loadAnimation(this,R.anim.to_bottom) }
    private val frombottom: Animation by lazy { AnimationUtils.loadAnimation(this,R.anim.from_bottom) }
    private val add:Button=findViewById(R.id.add)
    private val edit:Button=findViewById(R.id.edit)
    private val image:Button=findViewById(R.id.image)
    private var clicked=false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener {
onAddButtonClicked()
        }
        edit.setOnClickListener {
            Toast.makeText(this,"Edit Button Clicked",Toast.LENGTH_LONG).show()

        }
        image.setOnClickListener {
            Toast.makeText(this, "Image BUtton Clicked",Toast.LENGTH_LONG).show()

        }


        
    }

    private fun onAddButtonClicked() {
        setVisibility(clicked)
        setAnimation(clicked)
        clicked = !clicked
    }

    private fun setVisibility(clicked:Boolean) {
        if(!clicked){
            edit.visibility=View.VISIBLE
            image.visibility=View.VISIBLE
        }
        else{
            edit.visibility=View.INVISIBLE
            image.visibility=View.INVISIBLE
        }

    }

    private fun setAnimation(clicked: Boolean) {
        if (!clicked){
            edit.startAnimation(frombottom)
            image.startAnimation(frombottom)
            add.startAnimation(rotateopen)
        }
        else{
            edit.startAnimation(frombottom)
            image.startAnimation(frombottom)
            add.startAnimation(rotateopen)

        }
    }
}