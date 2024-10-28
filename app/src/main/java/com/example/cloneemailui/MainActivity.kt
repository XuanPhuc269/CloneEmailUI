package com.example.cloneemailui

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.cloneemailui.data.Email

class MainActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var emailListView: ListView

    private val emailList = listOf(
        Email("John Doe", "Meeting Reminder", "Don't forget our meeting tomorrow at 10 AM.", "10:30 AM"),
        Email("Jane Smith", "Your Invoice", "Please find attached your invoice for the last month.", "9:15 AM"),
        Email("Newsletter", "Weekly Updates", "Check out our latest updates and offers!", "Yesterday"),
        Email("Support", "Your Support Ticket", "Your support ticket has been received.", "2 days ago")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        emailListView = findViewById(R.id.emailListView)

        val adapter = EmailAdapter(this, emailList)
        emailListView.adapter = adapter
    }
}

