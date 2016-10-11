package com.zll.hellokotlin.binding

import android.view.View
import android.widget.TextView
import org.jetbrains.anko.backgroundResource

/**
 * Created by zhangll on 16/10/9.
 */
fun <T: View, V, B: BindObservable<V>> T.bind(observable: B, method: T.(value: V) -> Unit) {
    method.invoke(this, observable.default)
    observable.register { method.invoke(this, it) }
}

fun <T: View, B: BindObservable<Int>> T.bindBackgroundResource(observable: B) {
    this.bind(observable) { backgroundResource = it }
}

fun <T: TextView, V: CharSequence, B: BindObservable<V>> T.bindText(observable: B) {
    this.bind(observable) { text = it }
}