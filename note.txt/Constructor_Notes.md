# 📚 Java Constructors - Complete Revision Notes

## 1. What is a Constructor?
- A special member method used to initialize objects.
- **Rule 1:** Constructor ka naam exact **class ke naam jaisa** hona chahiye.
- **Rule 2:** Iska koi **return type** nahi hota ((`void` bhi nahi)).
- Ye tab automatically call hota hai jab hum `new` keyword se object banate hain.

---

## 2. Types of Constructors

### A. Default / No-Arg Constructor
- Iske paas koi parameters nahi hote. 
- Agar hum apna khud ka constructor nahi banate, toh Java compiler khud ek default constructor provide karta hai.
```java
Student() {
    name = "Default";
    roll = 0;
}
B. Parameterized / Combined Constructor
Ye arguments/parameters leta hai taaki hum object banate waqt hi values pass kar sakein.

Java
Student(String name, int roll) {
    this.name = name;
    this.roll = roll;
}
C. Copy Constructor
Ye ek existing object ko as a parameter leta hai aur uska data naye object mein safe tarike se copy karta hai (Java mein automatic copy constructor nahi banta, humein khud banana padta hai).

Java
Student(Student other) {
    this.name = other.name;
    this.roll = other.roll;
}
3. Important Keywords & Concepts
🔹 The this Keyword
this current object ko refer karta hai.

Jab instance variables aur parameters ke naam same hote hain, tab confusion door karne ke liye use hota hai:this.name = name;

🔹 Constructor Chaining (this())
Ek constructor ke andar se dusre constructor ko call karna Constructor Chaining kehlata hai.

Important Rule: this() statement hamesha constructor ki pehli line par honi chahiye.

Java
Student() {
    this("Unknown", 0); // Calls the parameterized constructor
}