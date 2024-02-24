package com.samrudhasolutions.virtualtutoringplatform

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.google.android.gms.tasks.Task
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.text.Text
import com.google.mlkit.vision.text.TextRecognition
import com.google.mlkit.vision.text.TextRecognizer
import com.google.mlkit.vision.text.latin.TextRecognizerOptions
import com.samrudhasolutions.bolo.utils.ANSWERAFTEREDIT
import com.samrudhasolutions.bolo.utils.IMAGETEXT


import com.samrudhasolutions.virtualtutoringplatform.respository.ChatRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.IOException

class MainActivity : AppCompatActivity() {

    private lateinit var buttonSend: Button
    private lateinit var editTextUserInput: EditText
    private lateinit var textViewChat: TextView
    private lateinit var imageView: ImageView // Add ImageView for displaying the selected image
    private val chatRepository = ChatRepository()
    private lateinit var textView: TextView
    private lateinit var buttonSen: Button

    private val PICK_IMAGE_REQUEST = 1

    @SuppressLint("MissingInflatedId")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        buttonSend = findViewById(R.id.buttonSend)
        buttonSen= findViewById(R.id.buttonSen)

        imageView = findViewById(R.id.imageView)
        textView=findViewById(R.id.textView)

        // Set OnClickListener for the send button
        buttonSend.setOnClickListener {
                sendToChatGPT(IMAGETEXT)

        }

        // Set OnClickListener for the image upload button
        imageView.setOnClickListener {
            openFileChooser()

        }

        buttonSen.setOnClickListener {
            senToChatGPT(IMAGETEXT)
            Toast.makeText(this, "iF you can't see the result scroll down", Toast.LENGTH_SHORT).show()

        }




    }
    private fun sendToChatGPT(userInput: String) {
        textView.setText("pls wait....... ")
        val myInstance = ChatRepository()
        lifecycleScope.launch {
            myInstance.sendToChatGPT(
                "conclude this input in 20 words and dont miss any important points like dates,MRP and timing ",
                userInput
            )

            textView.setText(ANSWERAFTEREDIT)
            Log.e("bresult ", ANSWERAFTEREDIT)
            Log.e("aresult", ANSWERAFTEREDIT)
            Log.e("imagetext", IMAGETEXT)

        }}


    private fun senToChatGPT(userInput: String) {
        textView.setText("pls wait....... ")
        val myInstance = ChatRepository()
        lifecycleScope.launch {
            myInstance.sendToChatGPT(
                "conclude this in point wise such that important points are first ",
                userInput
            )

            textView.setText(ANSWERAFTEREDIT)
            Log.e("bresult ", ANSWERAFTEREDIT)
            Log.e("aresult", ANSWERAFTEREDIT)
            Log.e("imagetext", IMAGETEXT)

        }}




    private fun openFileChooser() {
        // Create an Intent to pick an image from the gallery
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(intent, PICK_IMAGE_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK && data != null && data.data != null) {
            // Get the URI of the selected image
            val imageUri: Uri = data.data!!
            // Set the selected image to ImageView
            imageView.setImageURI(imageUri)
            // Process the selected image for text recognition
            IMAGETEXT=processImageFromUri(imageUri)



        }
    }



    fun processImageFromUri(imageUri: Uri): String {
        val image: InputImage
        var resultText = ""
        try {
            image = InputImage.fromFilePath(this, imageUri)

            val recognizer = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS)
            val task = recognizer.process(image)

            // Wait for the task to complete
            while (!task.isComplete) {}

            if (task.isSuccessful) {
                val visionText = task.result
                resultText = visionText.text
            } else {
                // Handle the error
                task.exception?.printStackTrace()
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return resultText
    }



    private fun processExtractedText(text: String) {
        // TODO: Implement your grading algorithm based on the extracted text
        // Assign marks based on the recognized text
        // Update UI or send data to the server
    }}






