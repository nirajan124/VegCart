package `in`.nirajan.vegcartpro.activity

import `in`.nirajan.vegcartpro.R
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val tv_facebook:TextView = findViewById(R.id.tv_facebook)
        val tv_github:TextView = findViewById(R.id.tv_github)
        val tv_linkedin:TextView = findViewById(R.id.tv_linkedin)
        val tv_twitter:TextView = findViewById(R.id.tv_twitter)
        val tv_gmail:TextView = findViewById(R.id.tv_gmail)

        tv_facebook.setOnClickListener {
        }
        tv_github.setOnClickListener {
            val web = Uri.parse("https://github.com/nirajan124")
            openBrowser(web)
        }
        tv_linkedin.setOnClickListener {
            val web = Uri.parse("https://linkedin.com/in/nirajan20")
            openBrowser(web)
        }
        tv_twitter.setOnClickListener {
            val web = Uri.parse("https://twitter.com/nirajan")
            openBrowser(web)
        }
        tv_gmail.setOnClickListener {
            val web = Uri.parse("nirajanbhattarai20@gmail.com")
            openBrowser(web)
        }
    }

    private fun openBrowser(web: Uri?) {
        val intent = Intent(Intent.ACTION_VIEW, web)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}