# UninstallFeedback
Android APP 卸载反馈，当应用本身被卸载时，程序弹出指定网页内容
##Usage
###build.gradle
```groovy
compile 'com.mumaoxi.fb:feedback:0.1.6'
```
###添加监听代码
```java
UninstallFB.init(this, "http://your_uninstall_feedback_url");
```
