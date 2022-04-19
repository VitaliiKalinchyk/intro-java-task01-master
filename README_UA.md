# Condition Statements

Час виконання цієї вправи _30 хв_.

### Опис
Будь ласка, перейдіть до класу [`ConditionStatements`](src/main/java/com/epam/rd/autotasks/ConditionStatements.java)
і реалізувати його статичні методи:
---
* `int task1(int n)`\
  Завдання 1:
  Для даного цілого числа n обчисліть значення, яке дорівнює:\
  • число в квадраті, якщо його значення строго додатне;\
  • модуль числа, якщо його значення строго від'ємне;\
  • нуль, якщо ціле число n дорівнює нулю.
### Приклад:
`n = 4 ` -> результат = 16
`n = -5` -> результат = 5
`n = 0` -> результат = 0


---
###  Приклади:

---
Code Sample:
```java
...
        System.out.println(ConditionStatements.task1(4));
```

Output:
```
16
```

---
Code Sample:

```java
...
System.out.println(ConditionStatements.task1(-5));
```

Output:
```
5
```

---
Code Sample:
```java
...
System.out.println(ConditionStatements.task1(0));
```

Output:
```
0
```


