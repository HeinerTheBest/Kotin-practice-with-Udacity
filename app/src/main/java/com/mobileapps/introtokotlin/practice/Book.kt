package com.mobileapps.introtokotlin.practice

open class Book(val title : String, val author : String){
    var currentPage = 1

    open fun readPage() {
        currentPage++
    }
}




class eBook (book: Book,var format : String = "text") : Book(book.title,book.author){

     var wordsRead = 0

    override fun readPage() {
        wordsRead += 250
    }
}

