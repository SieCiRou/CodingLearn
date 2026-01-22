
# CodingLearn

Learn coding from books

---

## JavaSe8：Java SE8 OCPJP 進階認證指南

> 由 OCAJP 進階 OCPJP

---

## 1-1. 建立 Java 類別（Class Basics）

### 🔹 class scope（類別範圍）

* `{}`  **class scope** ：定義「這個類別有什麼」
* 類別內容可以放：
  * 欄位（fields / instance variables）
  * 方法（methods）
* 只要 **宣告在 class 的 `{}` 裡** ，就屬於 class scope

```java
public class JavaSe8_1_1 {
    int x = 10;          // instance variable
    String msg = "Hello Java";
}
```

---

### 🔹 main 方法（Java SE 程式進入點）

* `main` 方法是 **Java SE 程式的執行進入點**
* JVM 啟動後，只會尋找以下方法：

```java
public static void main(String[] args)
```

---

### 🔹 為什麼 main 是 `static`

* JVM 啟動時：
  * **只載入 class**
  * **尚未建立任何物件**
* 因此：
  * `static` 方法可以在「沒有物件」的情況下被呼叫

---

### 🔹 instance variable 不能直接在 main 使用

```java
public class JavaSe8_1_1 {
    int x = 10; // instance variable

    public static void main(String[] args) {
        // System.out.println(x); // ❌ 錯誤

        JavaSe8_1_1 obj = new JavaSe8_1_1(); // 必須先建立物件
        System.out.println(obj.x);          // ✅ 正確
    }
}
```

---

### 🔹 method scope（方法範圍）

* 方法內容定義在 `{}` 內
* 定義「 **這次做事情用到什麼** 」
* 方法內宣告的變數：
  * 只在該方法內有效
  * 稱為 **區域變數（local variables）**

```java
public static void main(String[] args) {
    int y = 20; // local variable
}
```

---

### 🔹 `public static void main(String[] args)` 關鍵字整理

* `public` → JVM 從外部要看得到
* `static` → JVM 不用建立物件就能呼叫
* `void` → JVM 不需要回傳值
* `main` → JVM 規定的入口名稱
* `String[] args` → 接收命令列參數

---

### 🔹 JVM 啟動流程（文字版）

```
java JavaSe8_1_1
│
▼
作業系統（Windows / Linux）
│
▼
啟動 JVM（Java Virtual Machine）
│
▼
讀取 classpath
找到 JavaSe8_1_1.class
│
▼
Class Loader 載入類別
（!! 此時尚未建立任何物件）
│
▼
JVM 尋找進入點
public static void main(String[] args)
│
├─ 找不到 → 程式無法執行
│
└─ 找到
    │
    ▼
    呼叫 main 方法（不用 new）
    │
    ▼
    main 開始執行
    │
    ├─ 建立 Stack Frame
    ├─ 宣告區域變數（int y = 20）
    ├─ new JavaSe8_1_1() → Heap 建立物件
    │
    ▼
    main 執行完畢
    │
    ▼
    Stack Frame 釋放
│
▼
JVM 結束程式
```

---

## 1-2. Java 程式基本結構與檔名規則

### 🔹 類別名稱與檔名

* **public class 名稱必須與檔名相同**

```java
public class HelloJava {
}
```

✔ 檔名必須是：`HelloJava.j
