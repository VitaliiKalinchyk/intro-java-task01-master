# ConditionStatements

The purpose of this exercise is to train you to work with condition statements.

Estimated workload of this exercise is _30 min_.

### Description
Please, proceed to [`ConditionStatements`](src/main/java/com/epam/rd/autotasks/ConditionStatements.java) class
and implement its static methods:
---
* `int task1(int n)`\
  Task 1:
  For a given integer n calculate the value which is equal to a:\
  • squared number, if its value is strictly positive;\
  • modulus of a number, if its value is strictly negative;\
  • zero, if the integer n is zero.
###  Example:  
`n = 4 `   -> result =  16
  
`n = -5`  ->  result =  5  

`n = 0`   ->  result = 0   


---
### Examples

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

