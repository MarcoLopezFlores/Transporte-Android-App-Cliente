package com.app.expresstaxi.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.app.expresstaxi.R
import com.app.expresstaxi.navigation.NavigationDrawer
import kotlinx.android.synthetic.main.fragment_details_driver.*



class DetailsDriverFragment:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_details_driver)
        setSupportActionBar(findViewById(R.id.toolbarBackHome))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Detalles del servicio"

        btnChatService.setOnClickListener{
            startActivity(Intent(this,ChatServiceFragment::class.java))
        }

        btnStartService.setOnClickListener{
            btnStartService.visibility = View.GONE
            btnFinishService.visibility = View.VISIBLE
            btnCancelService.visibility = View.GONE
            containerBtnChatService.visibility = View.VISIBLE
        }

        btnCancelService.setOnClickListener{
            startActivity(Intent(this, NavigationDrawer::class.java))
            finish()

        }

        btnFinishService.setOnClickListener{
            startActivity(Intent(this, CalificationServiceFragment::class.java))
        }

    }

    /*override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewRoot = inflater.inflate(R.layout.fragment_details_driver, container, false)

        viewRoot.btnChatService.setOnClickListener{
            findNavController().navigate(R.id.action_detailsFragment_to_chatServiceFragment)
        }

        viewRoot.btnStartService.setOnClickListener{
            viewRoot.btnStartService.visibility = View.GONE
            viewRoot.btnFinishService.visibility = View.VISIBLE
            viewRoot.btnCancelService.visibility = View.GONE
            viewRoot.containerBtnChatService.visibility = View.VISIBLE
        }

        viewRoot.btnCancelService.setOnClickListener{

            findNavController().navigate(R.id.action_detailsFragment_to_mapsFragment)

        }

        viewRoot.btnFinishService.setOnClickListener{
            findNavController().navigate(R.id.action_detailsFragment_to_calificationServiceFragment)

        }

        return viewRoot
    }*/


}