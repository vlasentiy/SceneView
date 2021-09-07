package com.nouman.sceneview

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun onLocalModelClick(view: View) {
        startActivity(
            Intent(
                this,
                SceneViewActivity::class.java
            ).putExtra(SceneViewActivity.Statics.EXTRA_MODEL_TYPE, "local")
        )

    }

    fun onRemoteModelClick(view: View) {
        /*startActivity(
            Intent(
                this,
                SceneViewActivity::class.java
            ).putExtra(SceneViewActivity.Statics.EXTRA_MODEL_TYPE, "remote")
        )*/

        startActivity(
            Intent(
                this,
                WebActivity::class.java
            )
        )
    }
}
