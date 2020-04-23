package ru.evtukhov.android.homework6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import ru.evtukhov.android.homework6.adapter.PostAdapter
import ru.evtukhov.android.homework6.posts.Post
import ru.evtukhov.android.homework6.posts.PostType

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = listOf(
            Post(1, "Netology", "First post in our network!", 1585637381, false, 0, false, 50, false, 10, postType = PostType.POST),
            Post("address", 55.75222, 37.61556, 2, "Netology", "First post in our network!", 1585637381, false, 0, false, 50, false, 10, postType = PostType.EVENT),
            Post("https://vimeo.com/27299211", 3, "Netology", "First post in our network!", 1585637381, false, 0, false, 50, false, 10, postType = PostType.VIDEO),
            Post(R.drawable.ic_logo_full_color_black, "https://netology.ru/?utm_source=yandex&utm_medium=cpc&utm_campaign=brand_all_ou_ya_retarget&utm_content=8944030781&utm_term=нетология&yclid=1932640884155777924&stop=1", 1, "Netology", "First post in our network!", 1585637381, false, 0, false, 50, false, 10, postType = PostType.ADVERTISING)
        )
        with(itemList) {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = PostAdapter(list)
        }
    }
}
