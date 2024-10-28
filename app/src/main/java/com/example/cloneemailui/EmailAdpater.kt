package com.example.cloneemailui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.cloneemailui.data.Email

class EmailAdapter(private val context: Context, private val emails: List<Email>) : BaseAdapter() {

    override fun getCount(): Int = emails.size

    override fun getItem(position: Int): Email = emails[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.email_item, parent, false)

        val emailSender = view.findViewById<TextView>(R.id.emailSender)
        val emailSubject = view.findViewById<TextView>(R.id.emailSubject)
        val emailSnippet = view.findViewById<TextView>(R.id.emailSnippet)
        val emailTime = view.findViewById<TextView>(R.id.emailTime)

        val email = getItem(position)
        emailSender.text = email.sender
        emailSubject.text = email.subject
        emailSnippet.text = email.snippet
        emailTime.text = email.time

        return view
    }
}


