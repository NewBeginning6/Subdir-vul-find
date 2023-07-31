# Subdir-vul-find
本工具仅限技术研究与测试，严禁用于非法用途，否则产生的一切后果自行承担。

# Subdir-vul-find v1.1

新增部分功能，修改若干bug

1、筛选功能（根据关键字在结果中进行筛选，快速匹配脆弱资产）

2、新增自适应缩放

3、增加超时机制，避免线程卡死


### 使用场景：

在burp开启被动扫描获取到大量target或者爬虫获取到大量target时，经常会出现http://target/path1/path2/path3/* 的情况，手工无法对目录进行拆分进行简单的目录爆破，所以有了这款工具，思路比较简单，望批评指教。
burp案例，复制所有url到工具即可。
![1](https://user-images.githubusercontent.com/44469015/191990667-007e84a3-45d2-42fc-9535-4d367f5c4af1.png)

批量请求get/post功能
![2](https://user-images.githubusercontent.com/44469015/191990746-91c89f94-da02-40ca-bf8d-359e3013615c.png)




目录拆分爆破功能，发现未授权比较好用

例如如下较为复杂的接口，在正常访问时会获取到相关目录的js，通过目录拆分进行爆破就有机会找到相应的未授权功能页面。

![3](https://user-images.githubusercontent.com/44469015/191990807-f361ca2e-9aac-48d4-b10b-6d6b7b822569.png)


![4](https://user-images.githubusercontent.com/44469015/191990815-fad148c0-2a0a-462b-8719-95e27ff306e0.png)


当然还有较为常见的swagger界面
![6](https://user-images.githubusercontent.com/44469015/191990837-454b6103-25ef-42a6-9796-7737dcc02a9d.png)


工具也自带了导入、导出、多线程、高亮、预览body等功能，感兴趣可自行查看。

### 工具参考：
`https://github.com/ScriptKid-Beta/WebBatchRequest`
