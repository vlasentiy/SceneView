package com.nouman.sceneview

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_web.*


class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        wv.settings.javaScriptEnabled = true
        wv.settings.builtInZoomControls = false
        wv.settings.setSupportZoom(false)
        //wv.loadUrl("https://modelviewer.dev/examples/augmented-reality.html")
        //wv.loadUrl("https://model-viewer.glitch.me/")
        wv.loadUrl("https://modelviewer.dev/examples/lazy-loading.html")

        val url = "https://modelviewer.dev/examples/augmented-reality.html"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        //startActivity(i)
        return
        wv.loadData(
            "\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "  <meta charset=\"utf-8\">\n" +
                    "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                    "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                    "  <!--  add some polyfill  -->\n" +
                    "  <script src=\"https://unpkg.com/@webcomponents/webcomponentsjs@2.1.3/webcomponents-loader.js\"></script>\n" +
                    "  <script src=\"https://unpkg.com/intersection-observer@0.5.1/intersection-observer.js\"></script>\n" +
                    "  <script src=\"https://unpkg.com/resize-observer-polyfill@1.5.0/dist/ResizeObserver.js\"></script>\n" +
                    "  <script src=\"https://unpkg.com/fullscreen-polyfill@1.0.2/dist/fullscreen.polyfill.js\"></script>\n" +
                    "  <script src=\"https://unpkg.com/@magicleap/prismatic/prismatic.min.js\"></script>\n" +
                    "  <script src=\"https://unpkg.com/focus-visible@5.0.2/dist/focus-visible.js\" defer></script>\n" +
                    "  <title>Model Viewer Demo</title>\n" +
                    "  <style>\n" +
                    "  .viewer {\n" +
                    "      width: 100%;\n" +
                    "      height: 50%;\n" +
                    "  }\n" +
                    "  </style>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "  <h1>Astronaut</h1>\n" +
                    "  <p>Click the button to enjoy AR!</p>\n" +
                    "  <div>\n" +
                    "    <model-viewer class=\"viewer\" alt=\"Astronaut\" \n" +
                    "      src=\"assets/Astronaut.glb\" \n" +
                    "      ios-src=\"assets/Astronaut.usdz\" \n" +
                    "      background-color=\"#455A64\" \n" +
                    "      camera-controls \n" +
                    "      ar>\n" +
                    "    </model-viewer>\n" +
                    "  </div>\n" +
                    "  <script type=\"module\" src=\"https://unpkg.com/@google/model-viewer@v0.6.2/dist/model-viewer.js\">\n" +
                    "  </script>\n" +
                    "  <script nomodule src=\"https://unpkg.com/@google/model-viewer@v0.6.2/dist/model-viewer-legacy.js\">\n" +
                    "  </script>\n" +
                    "</body>\n" +
                    "</html>", "text/html", "UTF-8"
        )
    }
}
