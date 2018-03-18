package com.example.guille.project_animacion

import android.animation.ObjectAnimator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_a.*
import kotlinx.android.synthetic.main.fragment_b.*
import kotlinx.coroutines.experimental.*
import kotlin.coroutines.experimental.CoroutineContext
import kotlinx.coroutines.experimental.android.UI

class MainActivity : AppCompatActivity() {

    private val ui: CoroutineContext = UI
    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.abc_fade_in, R.anim.abc_fade_out)
                .replace(R.id.f_eng_a, fragment, fragment.javaClass.getSimpleName())
                .addToBackStack(fragment.javaClass.getSimpleName())
                .commit()
    }
    private fun addFragment2(fragment: Fragment) {
        supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.abc_fade_in, R.anim.abc_fade_out)
                .replace(R.id.f_eng_b, fragment, fragment.javaClass.getSimpleName())
                .addToBackStack(fragment.javaClass.getSimpleName())
                .commit()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var engranajeA = com.example.guille.project_animacion.fragment_a.Companion
        var engranajeB = com.example.guille.project_animacion.fragment_b.Companion
        addFragment(engranajeA.newInstance())
        addFragment2(engranajeB.newInstance())

        var AnimEngA = ObjectAnimator.ofFloat(img_eng_a,"rotation",90f)
        var AnimEngB = ObjectAnimator.ofFloat(img_eng_b,"rotation",90f)


        txt_eng_a.setText("0")
        txt_eng_b.setText("0")

        btnGirar.setOnClickListener(){
            launch(ui) {
                engranajeA.GiroEngA()
                engranajeB.GiroEngB()
                AnimEngA = ObjectAnimator.ofFloat(img_eng_a,"rotation",AnimEngA.animatedValue as Float+360)
                AnimEngA.setDuration(700)
                AnimEngA.start()

                AnimEngB = ObjectAnimator.ofFloat(img_eng_b,"rotation",AnimEngB.animatedValue as Float+180)
                AnimEngB.setDuration(700)
                AnimEngB.start()

                txt_eng_a.setText(engranajeA.cont).toString()
                txt_eng_a.setText((engranajeB.cont).toInt()).toString()
            }
        }


    }



}
