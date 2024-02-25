# Image to Concise Text Converter

This application is designed to convert the text in any image into concise points or summaries of 20 words, as per the user's request. It leverages the power of artificial intelligence to perform this task.

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

https://drive.google.com/file/u/0/d/1-InOnlXcOUCC6uJboEDbL7aTkWKwZi0q/view?usp=drivesdk&pli=1

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
