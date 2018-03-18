package com.example.guille.project_animacion

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
/**
 * Created by Guille on 17/03/2018.
 */
class fragment_a : Fragment() {


    companion object {
        fun newInstance(): fragment_a {
            var a = fragment_a()
            var args = Bundle()
            a.arguments = args
            return a
        }
        var cont = 0

        fun GiroEngA (){
            cont++
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_a, container, false)
    }

}
