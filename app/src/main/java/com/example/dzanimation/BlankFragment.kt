package com.example.dzanimation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.transition.*
import com.example.dzanimation.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    lateinit var binding: FragmentBlankBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentBlankBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btAnimation.setOnClickListener {
            animationFrag()
        }
        super.onViewCreated(view, savedInstanceState)
    }

    private fun animationFrag() {
        val scene = Scene.getSceneForLayout(requireView() as ViewGroup,
            R.layout.two_anim,
            requireContext())
            TransitionManager.go(scene, TransitionSet().apply {
                addTransition(Fade())
                addTransition(ChangeBounds())
                duration = 400L
            })
    }

    companion object {

        @JvmStatic fun newInstance() = BlankFragment()
    }
}