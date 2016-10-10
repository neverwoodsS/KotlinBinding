# KotlinBinding
This is a android demo which binds view with viewModel by using Kotlin language

####1.基础绑定,具体绑定方法自己实现
```
textView.bind(viewModel.text) { text = it }
```
####2.有针对性的调用绑定方法
```
textView.bindText(viewModel.text)
textView.bindBackgroundResource(viewModel.backGroundResource)
```
####3.使用 with 等方法,让绑定实现的代码看上去更优雅（支持 anko 中使用）
```
with(contentTv) {
    bindText(viewModel.text)
    bindBackgroundResource(viewModel.backGroundResource)
}
```
####4.修改 viewModel 中的值
```
with(viewModel) {
    text.set("changed")
    backGroundResource.set(android.R.color.darker_gray)
}
```
####5.viewModel定义
```
class ViewModel {
    var text: BindObservable<CharSequence> = BindObservable("default")
    var backGroundResource = BindObservable(android.R.color.black)
}
```

