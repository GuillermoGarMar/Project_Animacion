package com.example.guille.project_animacion

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Guille on 17/03/2018.
 */
class fragment_b : Fragment()  {

    companion object {
        fun newInstance(): fragment_b {
            var b = fragment_b()
            var args = Bundle()
            b.arguments = args
            return b
        }
        var cont:Double = 0.0
        fun GiroEngB (){
            cont= cont +0.5
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_b, container, false)
    }

}
