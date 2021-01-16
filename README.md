# JavaTutorials
---

1. Basic and Datatype
- Datatype
  - Number
  - Character
  - Float
  - Double
  - console 출력 (System.out.println();)
- Naming Variables
  - snake case: age_in_years
  - camel case: ageInYears(Java 개발에 주로 사용)
- Get user input 
  - Scanner library 사용
- print formatting
  - System.out의 여러 방법
  
---

2. Operator

- 지정 연산자
  - =, +=, -= 등
- 산술 연산자
  - +, -, *, /, %,
- 비교 연산자
  - ==, !=, <, >, <=, >=
- 논리 연산자 
  - &&, ||

---

3. Conditional Statements
  
- If, elif else
  - 양/음 수 구분하는 프로그램
  - 입력한 점수의 등급을 정해주는 프로그램
- Swich
  - 입력한 월의 총 일수를 확인하는 프로그램

---

4. Loop

- for
  - 입력된 구구단 범위 만큼 출력 (2, 4 --> 2단 3단 4단 출력) 
- while (do/while)
  - 입력된 연도가 윤년인지 확인해주는 프로그램

---

5. Functions

- Mathmatical functions
  - exp, pow, sqrt, ceil, floor, round, max, min 등
- CharacterFunctions
  - .equals, substring, indexOf 등
- Overloaded method
  - 매개변수의 갯수나 자료형이 다른 경우 같은 함수를 중복해서 선언가능
- Variable number of augments
  - (자료형... variable) array로 인식 --> 원하는 만큼 매개변수 입력 가능
  
---

6. Array

- Array Basic
  - Array 선언
- Copying Arrays
  - reference 만 복사하는 경우
  - 새로운 reference를 가지도록 copy (foreach, arraycopy)
- Linear search
  - array에서 앞에서부터 순서대로 원하는 값 검색
- Binary search
  - 자료가 순서대로 sort된 상태에서 중간값을 기준으로 큰값 작은값을 판단하여 원하는 값 검색
  ![BinarySearch](https://github.com/dmlee89/JavaTutorials/blob/master/image/Binary%20search.png){:height="400px" width="400px"}
- Two dimensional array 
  - 2차원 Array
- Ragged array
  - 각 열의 길이가 다른 2차원 Array

  6.1 Object  

  - Element(원소)
    - object를 요소로 가지는 array
    - 원소 class를 이용하여 테스트
  
---

7. Object

- Object Basic
  - 객체가 왜 필요한가 ?
- Circle
  - 원을 생성하고 resize함수로 Circle Objet를 매개변수로 넘김.
  - resize()함수를 통해 반지름 변경
    - Test_1: 넘어온 Object의 반지름 값을 변경
    ![PassingObject1](https://github.com/dmlee89/JavaTutorials/blob/master/image/PassingObject1.png)
    - Test_2: 변경하고자 하는 반지름을 가지는 새로운 Circle Instance를 생성
    ![PassingObject2](https://github.com/dmlee89/JavaTutorials/blob/master/image/PassingObject2.png)
  7.1 Primitive and Reference
    - Rectangle
      - Primitive: 메모리 값 자체를 저장
      - Reference: 메모리에 instance의 reference를 저장
      - **Copying object**
      ![CopyingObject](https://github.com/dmlee89/JavaTutorials/blob/master/image/CopyingObject.png)
  7.2 Static Usage
    - Reservation
      - Static: 클래스에만 포함되며 클래스로 부터 생성된 어떠한 인스턴스에도 포함되지 않는 값을 설정하는 경우
      - 예약 클래스에서 예약 수, 예약 요일
      - **Static**
      ![Static](https://github.com/dmlee89/JavaTutorials/blob/master/image/Static.png)  
---

8. OOP

- Toaster
  - 토스터 제작 회사에서 제작하는 예시로 Toaster에 PowerSupply, Dial의 class에 가져와 사용
  ![Toaster](https://github.com/dmlee89/JavaTutorials/blob/master/image/Oop_Toaster.png)
  
  - **Visibility modifier**
  ![ModifierVisibility](https://github.com/dmlee89/JavaTutorials/blob/master/image/ModifierVisibility.png)
  
  8.1 Chaining Constructor
    - Subclass가 생성될 때, 각 Class에 생성자가 호출되는 과정
    - **Chaining constructors**
    
    ![ChainingConstructor](https://github.com/dmlee89/JavaTutorials/blob/master/image/chaining%20constructor.jpg)
  
  8.2 Inheritance and Polymorphism
    - TestGeometricObject_inheritance
      ```java
      public class Circle extends GeometricObject{
      public class Rectangle extends GeometricObject{
      public class Triangle extends GeometricObject{
      
      ```
    
    - TestGeometricObject_Polymorphism
      ```java
      GeometricObject[] shapes = {
      new Circle(3.0, "blue", true),
      new Rectangle(4.5, 7.2, "green", false),
      new Triangle(3.5, 4.6, 6.7, "ecru", true)
      };
      
      ```
     
     - **Complie**
      
      ![Polymorphism_compile](https://github.com/dmlee89/JavaTutorials/blob/master/image/Polymorphism_compile.png)
      
      
     - **Runtime**
      
      ![Polymorphism_runtime](https://github.com/dmlee89/JavaTutorials/blob/master/image/Polymorphism_runtime.png)
   
   - DiagonalTest
      ```java
      GeometricObject shape = new Rectangle(4.5, 7.2, "green", true);
      // double diag = shape.getDiagonal(); // compile error, GeometricObject에 정의되지 않은 메서드
      double diag = ((Rectangle)shape).getDiagonal(); // shape를 Rectangle Class로 캐스팅
      
      ```
	
    - CastingTest
      ```java
      double area1 = ((GeometricObject)c).getArea(); // runtime 시 instance인 Circle의 getArea method 호출
      double area2 = ((Circle)geo).getArea(); // compile에는 문제가 없지만 runtime에서 문제 발생
      double area3 = ((Rectangle)c).getArea(); // subclass를 또 다른 subclass로 casing ==> compile 오류
      
      ```
	
    - TestShepeInfo
      - 각 instance가 고유하게 가지는 함수를 호출
      ```
      shapes[i] instanceof Circle
      shapes[i] instanceof Rectangle
      
      ```
	 
---

9. ArrayList

- Percentages
  - Array: 배열의 크기가 정해져 있음.
  - ArrayList: 크기 가변이 가능한 배열
- ArrayList Functions
  - remove, contains, indexOf
  
---

10. Exception

- AgeInDays
  - 예외를 사용하는 예
- Gerneral Exception
  - 나누기 프로그램에서 예상 가능한 Exception을 적용
- Using Exception
  - 모든 예외상황에 Exception을 쓰기보다는 if 문을 통해서 해결
- UseUtils
  - library 개발 시 예외처리 고려사항
  
---
  
  11. FileSystem

- FileInformation
  - 자바를 통해서 파일의 정보를 확인 
- ReadPriceList
  - 가격이 적힌 파일을 읽고, 모두 합한 후 5% 세금을 붙이는 계산 
- NameSwitcher
  - people.txt 파일을 읽고, first name과 second name의 자리를 바꿔 switched_people.txt 파일 생성하여 입력
  
---
        `Youtube [Geek's Lession]체널 'Java Tutorial for Beginners to Expert [Full Course - 2020]'를 보고 공부한 내용입니다.`
  
