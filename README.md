# 書籍管理系統 - Spring Boot API 專案

這是一個以Spring Boot 為基礎所開發的書籍後端管理系統，提供 RESTFUL API ;
實作資料的新增、查詢、修改、刪除，並串接MySQL資料庫，作為學習與展示後端開發能力的作品

---

##功能特色

- **查詢所有書籍**: GET /books
- **查詢單一書本**: GET /books/{id}
- **新增書籍**: POST /books/add
- **修改書籍資料**: PUT /books/{id}
- **刪除書籍**: DELETE /books/{id}

---

##技術

- **JAVA 17+**
- **Spring Boot 3.4.5**
- **Spring Web / Spring  Data JPA**
- **My SQL**
- **Postman(測試API工具)**

---

##專案結構

<pre>
src
|___main
    |__java
    |    |___com.lee.bookstors
    |        |___model         #Book Entity
    |        |___repository    #JPA Repository
    |        |___controller    #RESTful API
    |
    |___resources
        |____application.properties
</pre>
