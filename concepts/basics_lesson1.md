# Java Basics — Lesson 1

## Variables and Data Types

- **int:** stores integer numbers (e.g., 1, 100, -50)  
- **double:** stores decimal numbers (e.g., 3.14, 0.01)  
- **char:** stores a single character (e.g., 'A', 'z')  
- **boolean:** stores true or false values  

## Printing to Console

- Use `System.out.println()` to print text or variable values to the console.

## Taking User Input

- Use the `Scanner` class to read input from the user.  
- Common methods include:  
  - `nextLine()` for strings  
  - `nextInt()` for integers  

## Example Code

```java
int age = 25;
double price = 19.99;
char grade = 'A';
boolean isJavaFun = true;

System.out.println("Age: " + age);

Scanner scanner = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = scanner.nextLine();
System.out.println("Hello, " + name + "!");

scanner.close();
```
## Tips

- Always close the scanner after use to free resources.  
- Use meaningful variable names for better readability.

---