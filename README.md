# UninstallFeedback
Android APP 卸载反馈，当应用本身被卸载时，程序弹出指定网页内容
## Status
SDK 已经发布到 jCenter.  
[![image](https://www.bintray.com/docs/images/bintray_badge_color.png)](https://bintray.com/NicolasYiu/maven/feedback/view?source=watch)
##Usage
###build.gradle
```groovy
compile 'com.NicolasYiu.fb:feedback:0.1.7'
```
###添加监听代码
```java
UninstallFB.init(this, "http://your_uninstall_feedback_url");
```
##更细日志
> 2016-02-18

- **0.1.7** 弹出网页时，系统默认指定系统浏览器 
