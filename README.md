




# Image to Concise Text Converter

This application is designed to convert the text in any image into concise points or summaries of 20 words, as per the user's request. It leverages the power of artificial intelligence to perform this task.


##Screenshot



![d5975a72-4fba-433e-8bee-b4016fd6bd16](https://github.com/hk973/EasyReader/assets/70455169/b9455743-f110-4818-86a9-2a7617dd2e1f)
![0fe12595-c1c2-4b7a-b434-90de6275bc58](https://github.com/hk973/EasyReader/assets/70455169/742c5ec0-770f-4d75-bce5-d7c915bf9d07)



## Features

- **Image to Text Conversion**: The application can extract text from any image, making it easy to process and analyze the content.
- **AI-Powered Summarization**: The extracted text is passed to an AI model, which generates concise points or summaries based on the user's request.

## How to Use

1. Upload an image with text.
2. Choose whether you want a concise point or a 20-word summary.
3. The application will process the image, extract the text, and generate the requested output.

## Future Enhancements

We are constantly working to improve the application and add new features. Stay tuned for updates!

## Contributions

Contributions, issues, and feature requests are welcome! Feel free to check the issues page.

## License

Distributed under the MIT License. See `LICENSE` for more information.

##video demo

https://www.youtube.com/watch?v=ahcDWX6QcRA

##Apk Download

https://fastupload.io/en/ZpIigu3awq6eJQ5/file
https://www.dropbox.com/scl/fi/k567zg7v9yfkalsm9mhjr/app-debug.apk?rlkey=h7rjva6b9v9qgz3f94yv7napf&e=1&dl=0

## dependencies
     implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.google.android.gms:play-services-vision:10.0.0+")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.google.firebase:firebase-storage:20.3.0")
    implementation ("com.google.mlkit:text-recognition:16.0.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

## OpenAI API KEY 
(IN App>scr>main>com/samrudhasolutions/bolo>utils>constants)

const val BASE_URL="https://api.openai.com/v1/"
const val CHATGPT_MODEL="gpt-3.5-turbo"
const val OPENAI_API_KEY="write your api key"  <- write your api key
var ANSBEFOREEDIT=""
var ANSWERAFTEREDIT=""




