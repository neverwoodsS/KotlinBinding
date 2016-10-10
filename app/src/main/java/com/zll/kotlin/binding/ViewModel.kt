package com.zll.hellokotlin.binding

import com.zll.kotlin.binding.R

/**
 * Created by zhangll on 16/10/9.
 */
class ViewModel {
    var text: BindObservable<CharSequence> = BindObservable("null")
    var backGroundResource = BindObservable(android.R.color.black)
    var imageResource = BindObservable(R.mipmap.ic_launcher)
}