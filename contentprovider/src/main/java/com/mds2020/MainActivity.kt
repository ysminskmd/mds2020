package com.mds2020

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val PICK_CONTACT_REQUEST = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<View>(R.id.button);
        button.setOnClickListener({
            Intent(Intent.ACTION_PICK).also { intent ->
                intent.setDataAndType(
                    Uri.parse("content://contacts"),
                    ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE)
                startActivityForResult(intent, PICK_CONTACT_REQUEST)
            }
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PICK_CONTACT_REQUEST) {
            if (resultCode == RESULT_OK) {
                if (data != null) {
                    val contactUri = data.data;
                    val projection = arrayOf(ContactsContract.CommonDataKinds.Phone.NUMBER)
                    val cursor = contentResolver.query(
                        contactUri!!, projection, null, null, null
                    )
                    cursor!!.moveToFirst()
                    val column = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)
                    val number = cursor.getString(column)

                    Toast.makeText(this, number, Toast.LENGTH_SHORT).show()
                    cursor.close()
                }
            }
        }
    }
}
