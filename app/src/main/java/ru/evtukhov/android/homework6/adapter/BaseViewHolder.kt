package ru.evtukhov.android.homework6.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import ru.evtukhov.android.homework6.posts.Post

abstract class BaseViewHolder (adapter: PostAdapter, view: View): RecyclerView.ViewHolder(view) {
    abstract fun bind (post: Post)
}