# IO(입출력)

* __IO__ : `Input`과 `Output`의 약자, 컴퓨터 내부 또는 외부 장치와 프로그램 간의 데이터를 주고 받는 것이다.

   장치와 입출력을 위해서는 하드웨어 장치에 직접 접근이 필요한데 다양한 매체에 존재하는 데이터들을 사용하기 위해 입출력 데이터를 처리할 공통적인 방법으로 스트림 이용한다.

  __키보드__--`입력스트림`--> __프로그램__ --`출력스트림`-->__모니터__

---

* __스트림(Stream)__ : 입출력 장치에서 데이터를 읽고 쓰기 위해서 자바에서 제공하는 클래스 

  모든 스트림은 단방향이며 각각의 장치마다 연결할 수 있는 `스트림` 존재한다.

  하나의 `스트림`으로 입출력을 동시에 수행할 수 없으므로 동시에 수행하려면 2개의 스트림 필요하다.



* __기반 스트림__
  * 입력 스트림(바이트) : FileInputStream
  * 출력 스트림(바이트) : FileOutputStream 
  * 입력 스트림(문자) : FileReader
  * 출력 스트림(문자) : FileWriter 

* __보조 스트림__  :스트림의 기능을 향상시키거나 새로운 기능을 추가하기 위해 사용한다.

  보조 스트림은 실제 데이터를 주고 받는 스트림이 아니기 때문에 입출력 처리 불가능하다. 

  `기반 스트림` 을 먼저 생성한 후 이를 이용하여 `보조 스트림 ` 생성한다.

  * __보조 스트림 종류__
    * 문자 변환(`InputStreamReader` / `OutputStreamWriter`)
    * 입출력 성능(`BufferedInputStream` / `BufferedOutputStream`) 
    * 기본 데이터 타입 출력(`DataInputStream` / `DataOutputStream`)
    * 객체 입출력(`ObjectInputStream` / `ObjectOutputStream`)

```java
FileInputStream fis = new FileInputStream("sample.txt"); //기반 스트림 생성
BufferedInputStream bis = new BufferedInputStream(fis); //보조스트림 생성
bis.read(); //보조스트림으로부터 데이터 읽어옴
```

---



* __File 클래스__ : 파일 시스템의 파일을 표현하는 클래스 

  파일 크기, 파일 속성, 파일 이름 등의 정보와 파일 생성 및 삭제 기능 제공한다.

  ```java
  //File 객체 생성
  File file = new File("파일 경로");
  File file = new File("C:/data/test.txt");
  ```

* __파일/디렉토리 생성 및 삭제 메소드__

| __리턴타입__ |   __메소드__    |             __설명__              |
| :----------: | :-------------: | :-------------------------------: |
|   boolean    | createNewFile() |         새로운 파일 생성          |
|   boolean    |     mkdir()     |       새로운 디렉토리 생성        |
|   boolean    |    mkdirs()     | 경로 상에 없는 모든 디렉토리 생성 |
|   boolean    |    delete()     |      파일 또는 디렉토리 삭제      |

* __파일/디렉토리 정보 리턴 메소드__

| __리턴타입__ |   __메소드__    |                __설명__                 |
| :----------: | :-------------: | :-------------------------------------: |
|   boolean    |   canExcute()   |      실행할 수 있는 파일인지 여부       |
|   boolean    |    canRead()    |       읽을 수 있는 파일인지 여부        |
|   boolean    |   canWrite()    |  수정 및 저장할 수 있는 파일인지 여부   |
|    String    |    getName()    |             파일 이름 리턴              |
|    String    |   getParent()   |           부모 디렉토리 리턴            |
|     File     | getParentFile() | 부모 디렉토리를 File객체로 생성 후 리턴 |
|    String    |    getPath()    |             전체 경로 리턴              |
|   boolean    |  isDirectory()  |            디렉토리인지 여부            |
|   boolean    |    isFile()     |              파일인지 여부              |
|   boolean    |   isHidden()    |           숨김 파일인지 여부            |
|     long     | lastModified()  |      마지막 수정 날짜 및 시간 리턴      |
|     long     |    length()     |             파일 크기 리턴              |

