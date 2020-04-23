package ru.evtukhov.android.homework6.posts

class Post (
    id: Long,
    author: String,
    content: String,
    dateStamp: Long,
    likedByMe: Boolean,
    likedCount: Int,
    sharedByMe: Boolean,
    sharedCount: Int,
    commentsByMe: Boolean,
    commentsCount: Int,
    postType: PostType
) {
    var id: Long = 0
    var author: String = ""
    var content: String = ""
    var dateStamp: Long = 0
    var dateText: String = format(dateStamp)
    var likedByMe: Boolean = false
    var likedCount: Int = 0
    var sharedByMe: Boolean = false
    var sharedCount: Int = 0
    var commentsByMe: Boolean = false
    var commentsCount: Int = 0
    var address: String = ""
    var lat: Double = 0.0
    var lng: Double = 0.0
    var postType: PostType = PostType.POST
    var videoLink: String = ""
    var imageLink: Int = 0
    var intentLink: String = ""

    init {
        this.id = id
        this.author = author
        this.content = content
        this.dateStamp = dateStamp
        this.likedByMe = likedByMe
        this.likedCount = likedCount
        this.sharedByMe = sharedByMe
        this.sharedCount = sharedCount
        this.commentsByMe = commentsByMe
        this.commentsCount = commentsCount
        this.postType = postType
    }
    constructor(
        address: String,
        lat: Double,
        lng: Double,
        id: Long,
        author: String,
        content: String,
        dateStamp: Long,
        likedByMe: Boolean,
        likedCount: Int,
        sharedByMe: Boolean,
        sharedCount: Int,
        commentsByMe: Boolean,
        commentsCount: Int,
        postType: PostType
    ) : this(id, author, content, dateStamp, likedByMe, likedCount, sharedByMe, sharedCount, commentsByMe, commentsCount, postType) {
        this.address = address
        this.lat = lat
        this.lng = lng
    }
    constructor(
        videoLink: String,
        id: Long,
        author: String,
        content: String,
        dateStamp: Long,
        likedByMe: Boolean,
        likedCount: Int,
        sharedByMe: Boolean,
        sharedCount: Int,
        commentsByMe: Boolean,
        commentsCount: Int,
        postType: PostType
    ) : this(id, author, content, dateStamp, likedByMe, likedCount, sharedByMe, sharedCount, commentsByMe, commentsCount, postType) {
        this.videoLink = videoLink
    }
    constructor(
        imageLink: Int,
        intentLink: String,
        id: Long,
        author: String,
        content: String,
        dateStamp: Long,
        likedByMe: Boolean,
        likedCount: Int,
        sharedByMe: Boolean,
        sharedCount: Int,
        commentsByMe: Boolean,
        commentsCount: Int,
        postType: PostType
    ) : this(id, author, content, dateStamp, likedByMe, likedCount, sharedByMe, sharedCount, commentsByMe, commentsCount, postType) {
        this.imageLink = imageLink
        this.intentLink = intentLink
    }
    private fun format (postDateSeconds: Long): String {
        val currentDate: Long = System.currentTimeMillis()
        val currentDateSeconds: Long = currentDate / 1000
        val dateSeconds: Long = currentDateSeconds - postDateSeconds
        val dateMinutes: Long = dateSeconds / 60
        val dateHours: Long = dateMinutes / 60
        val dateDays: Long = dateHours / 24
        val dateMonth: Long = dateDays / 30
        val dateYear: Long = dateMonth / 12
        val secondText = "$dateSeconds секунд(у/ы) назад"
        val minuteText = "$dateMinutes минут(у/ы) назад"
        val hourText = "$dateHours час(а/ов) назад"
        val dayText = "$dateDays ден(ь/я/ей) назад"
        val monthText = "$dateMonth месяц(а/ев) назад"
        val yearText = "$dateYear год(а)/лет назад"
        return when(dateSeconds) {
            in 0..59 -> secondText
            in 60..3599 -> minuteText
            in 3600..86399 -> hourText
            in 86400..2591999 -> dayText
            in 2592000..31103999 -> monthText
            else -> yearText
        }
    }
}