
# 项目结构简介

```
├── README.md
├── demo-storage-feign-api     # 对外打包的目录，`mvn  deploy`
│   ├── demo-storage-feign-api.iml
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── cn
│                   └── demo
│                       └── storage
│                           └── feigapi
│                               ├── api            # 对外暴露的feign api， 前缀使用`/feign`， 通过前缀来确保权限与安全
│                               │   └── StorageApi.java
│                               ├── dto            # 请求参数
│                               │   └── StorageSelectDTO.java
│                               ├── fallback       # 降级处理
│                               │   └── StorageApiFallbackFactory.java
│                               └── vo             # 返回值
├── demo-storage-server
│   ├── demo-storage-server.iml
│   ├── pom.xml
│   └── src
│       └── main
│           ├── java
│           │   └── cn
│           │       └── demo
│           │           └── storage
│           │               ├── StorageApplication.java
│           │               ├── api        # 对外暴露的feign api实现类
│           │               │   └── StorageController.java
│           │               ├── code
│           │               │   └── StorageCode.java
│           │               ├── controller   # 直接提供的api接口
│           │               │   └── TestController.java
│           │               ├── entity
│           │               │   └── StorageEntity.java
│           │               ├── fallback
│           │               │   └── ExceptionUtil.java
│           │               ├── mapper
│           │               │   └── StorageMapper.java
│           │               ├── service
│           │               │   ├── StorageService.java
│           │               │   └── impl
│           │               │       └── StorageServiceImpl.java
│           │               └── utils           # 工具类
│           │                   └── CodeGeneratorUtil.java
│           ├── profiles       # 对应的三套环境
│           │   ├── local
│           │   │   ├── bootstrap.yml
│           │   │   └── log4j2.xml
│           │   ├── prod
│           │   │   ├── application.yml
│           │   │   └── log4j2.xml
│           │   └── test
│           │       ├── application.yml
│           │       └── log4j2.xml
│           └── resources
│               ├── storage.sql
│               └── xml
│                   └── StorageMapper.xml
├── demo-storage.iml
└── pom.xml

```



# 打包命令

* 环境: `prod`, `local`, `test`

>  如打包`test`

```
mvn clean package -Dmaven.test.skip=true -Ptest  -e -U
```


