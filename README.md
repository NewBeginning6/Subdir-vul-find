# Subdir-vul-find

> 本工具仅限于技术研究与测试，严禁用于非法用途，否则产生的一切后果自行承担。

## 版本 v1.1

**更新内容：**

1. **筛选功能：** 根据关键字在结果中进行筛选，快速匹配脆弱资产。
2. **新增自适应缩放。**
3. **增加超时机制，避免线程卡死。**

### 使用场景：

当Burp开启被动扫描获取大量目标或爬虫获取到大量目标时，经常会出现URL类似于 `http://target/path1/path2/path3/*` 的情况。手动对这些目录进行拆分和简单的目录爆破是非常繁琐的。为了解决这个问题，我们开发了这款工具。其思路相对简单，期待您的批评和建议。

**Burp案例使用：** 复制所有URL到工具即可。

![1](https://user-images.githubusercontent.com/44469015/191990667-007e84a3-45d2-42fc-9535-4d367f5c4af1.png)

**批量请求 GET/POST 功能示例：**

![2](https://user-images.githubusercontent.com/44469015/191990746-91c89f94-da02-40ca-bf8d-359e3013615c.png)

**目录拆分爆破功能：** 发现未授权漏洞非常实用。例如，以下是一个复杂接口的示例，正常访问时将获取到相关目录的JavaScript文件。通过目录拆分进行爆破，您有机会找到相应的未授权功能页面。

![3](https://user-images.githubusercontent.com/44469015/191990807-f361ca2e-9aac-48d4-b10b-6d6b7b822569.png)

![4](https://user-images.githubusercontent.com/44469015/191990815-fad148c0-2a0a-462b-8719-95e27ff306e0.png)

还有一些常见的Swagger界面：

![6](https://user-images.githubusercontent.com/44469015/191990837-454b6103-25ef-42a6-9796-7737dcc02a9d.png)

此工具还支持导入、导出、多线程、高亮、预览请求体等功能。如果您感兴趣，可以自行查看。

### 工具参考：

[WebBatchRequest](https://github.com/ScriptKid-Beta/WebBatchRequest)
