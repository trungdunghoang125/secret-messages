package com.trungdunghoang125.secretmessages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController

class MessageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_message, container, false)
        val nextButton = view.findViewById<Button>(R.id.next)
        val messageView = view.findViewById<EditText>(R.id.message)

        nextButton.setOnClickListener {
            val messageText = messageView.text.toString()
            val action = MessageFragmentDirections.actionMessageFragmentToEncryptFragment(messageText)
            view.findNavController().navigate(action)
        }
        return view
    }

}