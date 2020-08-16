class Button {
    private var mOnClick: (() -> Unit)? = null
    fun setClickListener(onClick: () -> Unit) {
        mOnClick = onClick
    }

    fun click() {
        mOnClick?.invoke()
    }

}

fun main(args: Array<String>) {
    val button = Button()
    button.setClickListener { println("Click") }
    button.click()
}