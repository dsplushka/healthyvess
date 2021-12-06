package com.darushina.healthyvess

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class UserFragment : Fragment() {

    lateinit var showWebSiteButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_user, container, false)

        showWebSiteButton = view.findViewById(R.id.show_web_site_button)

        showWebSiteButton.setOnClickListener {
            val link =
                Uri.parse("https://ru.wikipedia.org/wiki/%D0%90%D1%82%D0%B5%D1%80%D0%BE%D1%81%D0%BA%D0%BB%D0%B5%D1%80%D0%BE%D0%B7")
            val intent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }

        return view
    }

}