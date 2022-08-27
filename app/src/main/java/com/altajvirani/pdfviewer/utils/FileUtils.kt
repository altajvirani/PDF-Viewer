package com.altajvirani.pdfviewer.utils

import android.content.Context
import android.os.Environment
import androidx.core.content.ContextCompat
import java.io.File

object FileUtils {

    fun getPdfNameFromAssets(): String {
        return "SamplePDF.pdf"
    }

    fun getPdfUrl(): String {
        return "https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"
    }

    fun getRootDirPath(context: Context): String {
        return if (Environment.MEDIA_MOUNTED == Environment.getExternalStorageState()) {
            val file: File = ContextCompat.getExternalFilesDirs(
                context.applicationContext,
                null
            )[0]
            file.absolutePath
        } else {
            context.applicationContext.filesDir.absolutePath
        }
    }

}