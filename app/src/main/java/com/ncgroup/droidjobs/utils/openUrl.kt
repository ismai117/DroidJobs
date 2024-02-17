package com.ncgroup.droidjobs.utils

import android.content.Intent
import android.net.Uri
import com.ncgroup.droidjobs.DroidJobsApplication


fun openUrl(url: String?) {
    val uri = url?.let { Uri.parse(it) } ?: return
    val intent = Intent().apply {
        action = Intent.ACTION_VIEW
        data = uri
        addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    }
    DroidJobsApplication.INSTANCE.startActivity(intent)
}