# Repo for NIIT Full Stack Developer Program

This repo contains the class notes, slides, assignments and solution src files for the NIIT FSD program.\
The repo contains both the practice and learning session code files.\
The files should be arranged in directories corresponding to each sprint sessions.\

## Software

- IntelliJ Community Edition – <https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC>
- GitHub – <https://github.com/git-for-windows/git/releases/download/v2.41.0.windows.3/Git-2.41.0.3-64-bit.exe>

## Repository Directory Structure

```text
    NIIT-FSD   
    └─── C1-<Course1>
    |   └─── S1-<Sprint1>-<ddmm>
    |   |   |   <Class notes>.md
    |   |   |   <Course1 Slides>.pdf
    |   |   |   <Course1 Consolidation>.pdf        
    |   |   └─── src
    |   |       └─── session
    |   |       |   |   <Demo/Session code files/projects>
    |   |       └─── practice
    |   |       |   |   <Practice code files/projects>
    |   |       |   |   <Practice problem statement>.pdf
    |   |       └─── challenge
    |   |           |   <Challenge code files/projects>
    |   |           |   <Challenge problem statement>.pdf
    |   |
    |   └─── S2-<Sprint2>-<ddmm>
    |   |       ...
    |   └─── Sn-<SprintN>-<ddmm>
    |
    └─── C2-<Course2>
    |       ...
    └─── Cn-<CourseN>
    |
    └─── Assessments
        └─── Assessment1-<ddmm>
        |   |   <Quiz/Questions/Problems files/projects>
        |       ...
        └─── AssessmentN-<ddmm>
```

## Course1 - Programming Foundations Using Java

In this course, you will learn to apply problem-solving techniques to decompose a problem into a step-by-step solution. You will then translate the steps into a program using Core Java language. This course will enable you to declare variables and use multiple data types in a Java program. You will explore how to work with different types of operators to do computational tasks and use conditional statements to make decisions in the program. You will also learn about using loops to perform repetitive tasks. You will use methods to make your code modular.

### Sprint1 - Pseudocode & Algorithms

Problem-solving algorithm is a technique used to find a solution in a finite amount of time. Programmers often use pseudocodes to develop these algorithms. The primary objective of a pseudocode is to simplify the function of each line of a program and make the construction phase of a code simpler for the programmer.In this learning sprint, you will decompose a problem into a step-by-step solution and apply programming logic to solve problems using algorithms and pseudocodes.

- Algorithms and Pseudocode
<https://www.unf.edu/-broggio/cop2221/2221pseu.htm>

### Sprint2 - Introduction to Java

Variables are considered as containers or entities used for saving data values at the time of Java Program execution. Operators are used to perform operations on these variables and values.In this learning sprint, you will go through the structure of a Java program and then write simple programs. You will use arithmetic, relational operators, and expressions to write programs in a logical manner.

- Introduction to Java
<https://docs.oracle.com/javase/tutorial/getStarted/cuQjava/win32.html>
- Variables
<https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html>
- Data types
<https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html>

### Sprint3 - Conditional Constructs

Programming languages allow you to check a condition and execute certain instructions, depending on the result whether it is true or false. Such statements are either called conditional constructs or decision-making constructs.In this learning sprint you will acquire the necessary skills to create Java programs in a logical and structured manner.

- Conditional Constructs:
<https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html>
<https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html>

### Sprint4 - Looping Constructs

Looping constructs in programming languages execute a set of repeated statements that work for as long as a specified condition remains true. This condition is generally known as the loop control.In this learning sprint, you will use different types of looping constructs to perform repetitive tasks easily and to control the flow of the program.

- While and Do-while:
<https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html>
- For Loop:
<https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html>
- Do-while Loop :
<https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html>

### Sprint5 - Functions

Dividing a complex problem into smaller chunks makes your program easy to understand and reusable.In this learning sprint, you will learn to write modular programs by breaking them into simpler and logical methods. These methods are used to perform certain actions known as functions.

- Functions: <https://docs.oracle.com/javase/tutoriaI/java/javaOO/methods.html>
<https://docs.oracle.com/javase/tutorial/java/javaOO/returnvalue.html>

## Course2 - Java Language Fundamentals

For programmers, writing codes to manipulate strings is an important skill, as almost all programs contain text. Arrays are a faster and more efficient way to store and manipulate a collection of data of the same type. In this course, you will learn to write Java programs using arrays and strings. You will learn to check your code for errors or missing requirements. The course will teach you to implement logic, code, compile, run and test Java programs.

### Sprint1 - Unit Testing with JUnit

How can you find out whether a code will produce the desired result? If it does not produce the expected output, at what point would you like to find the errors? At the unit level or at the end, when all the programs are integrated? Identifying defects at the unit level and fixing the defects helps to achieve better quality code, simplifies the debugging process, and reduces the overall time and cost incurred to fix a defect.In this learning sprint, you will implement unit testing using the JUnit framework. You will learn to write test cases and use assertion statements to test the individual unit of your code.

### Sprint2 - Arrays

A data structure that stores a fixed-size, sequential collection of elements of the same type is called an array. You may also think of an array as a collection of variables of the same type.In this learning sprint, you will learn to declare, define, store, and manipulate a set of data elements in the memory as a single-dimensional array.

- Array: <https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html>
- Creating, Initializing, and Accessing an Array:
<https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html>
- Array Manipulations: <https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html>

### Sprint3 - Sorting and Searching

Have you ever noticed how data is typically displayed in chronological order, whether in an email application or on a social media platform? An email application, for instance could display emails sorted as per their received date or sorted as per the sender. Sorting an array means arranging its elements in ascending or descending order. There are different algorithms that can be used to sort an array.In this learning sprint, you will learn to sort data stored in arrays using a few sorting algorithms.

- Sorting Algorithm Implementation using Java
<https://stackabuse.com/sorting-agorithms-in-java/>
- Time and Space Complexity of Sorting Algorithms
<https://www.interviewkickstart.com/learn/time-complexities-of-all-sorting-algorithms>

### Sprint4 - Implementing Recursion

Recursion is a technique used for making a function call itself. This technique helps in breaking down complicated problems into simpler ones so that are easier to solve.In this learning sprint, you will learn to break down large, complex problems into simple sub-problems using recursive methods.

- Recursion
<https://en.wikipedia.org/wiki/Recursion_(computer_science)>
- Recursion Vs Iteration
<https://www.advanced-ict.info/programming/recursion.html>

### Sprint5 - String Manipulation

In Java, a string is an object that represents a sequence of characters.In this learning sprint, you will learn how to use the string class in Java and to manipulate strings using built-in methods.

- Strings: <https://docs.oracle.com/javase/tutorial/java/data/strings.html>

## Course3 - Object-Oriented Programming

Object-oriented programming is a programming paradigm based on the concept of "objects." Object-oriented programming mimics how objects are modelled in the real world to replicate the same in software programs. It uses concepts such as abstraction, inheritance, encapsulation, polymorphism, etc. In this course, you will learn to identify the objects in a given problem and write object-oriented programs in Java.

### Sprint1 - Introduction to Object-Oriented Programming

Object-oriented programming is the core of Java Programming language. It is used to design a program using classes and objects. You would have seen various objects around you. Each of these objects have attributes that display some kind of behavior.In this learning sprint, you will learn to identify attributes and behavior of objects and model them as Java objects. It will also help you to create classes that will be the manufacturer of the objects.

- Classes and objects: <https://docs.oracle.com/javase/tutorial/java/javaOO/index.html>

### Sprint2 - Objects and Constructors

The foundation of Java is build on classes and objects, their attributes and their methods.In this learning sprint you will learn to create Java objects through programming. You will learn to declare and initialize Java objects in a class by using constructors. You will also explore how Java objects are stored in memory.

- Create Objects - <https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html>
- Constructors - <https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html>

### Sprint3 - Data Abstraction and Encapsulation

In object-oriented programming (OOP), abstraction is a feature of that hides unnecessary information and makes only what is essential visible to the users. OOPs also have encapsulation as a feature. In order to shield the data from prying eyes, it combines the code and data into a single entity. This helps resolve issues or problems at the design level of a program.In this learning sprint, you will learn to package and organize Java classes and understand how access can be specified for all the classes. You will learn the necessary skills to write well encapsulated classes.

- Packages: <https://docs.oracle.com/javase/tutorial/java/concepts/package.html>
- Encapsulation: <https://www.simplilearn.com/tutorials/java-tutorial/java-encapsulation>

### Sprint4 - Inheritance

In inheritance, one object acquires or inherits the properties of another object. The process of inheritance also supports hierarchical classification. It allows building of new classes on top of the existing classes.In this learning sprint, you will identify the relationship between classes and implement the different types of inheritance relationships among classes. You will learn to inherit a new class from an existing one and identify the reusable methods within the class hierarchy.

- Inheritance - <https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html>
- Object class - <https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html>

### Sprint5 - Polymorphism

Polymorphism is a process in which different ways can be used to perform the same task. In Java, one class can acquire the attributes and properties of another class through Java inheritance. Users use polymorphism to use these inherited properties for a variety of purposes.In this learning sprint, you will learn to use abstract classes and interfaces to implement static and dynamic polymorphism among Java objects.

- Polymorphism - <https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html>

## Course4 - Develop Responsive Web Pages using HTML5 and CSS3

Millennials spend one third of the day on the internet, and more than 50 percent of internet users use mobile devices to access content. This has created a huge demand for frontend developers who can build websites that load fast and provide a similar user experience on desktops as well as mobile devices. This course helps you acquire the skills to build responsive web pages that can adapt to multiple devices. During the journey, you will learn to structure and style W3C compliant web pages using HTML5 and CSS3. You will then advance in the journey to build responsive layouts using modern CSS concepts such as floats, media queries, grids, and flexbox. You will also learn to use the BootStrap Framework to rapidly build mobile-first responsive Web pages.

### Sprint1 - Develop a Web Page Using HTML5

Dependency on the internet and social media has increased tremendously over the past decade. HTML is a markup language used for developing web pages. It is therefore important for aspiring web developers to know the basics of the Hypertext Markup Language (HTML).In this learning sprint, you will learn to structure a Web Page using HTML5. You will understand the anatomy of a web page, the various HTML elements and the tools used to build these pages quickly.

- Quick Facts about the World Wide Web <https://www.britannica.com/topic/World-Wide-Web>
- HTML Tags Chart <https://www.csun.edu/science/help/help_docs/html_tags.html>
- Best HTML Editors <https://www.hostinger.in/tutorials/best-html-editors>
- Emmet Cheat Sheet <https://docs.emmet.io/cheat-sheet/>
- VS Code Multi-cursor Feature <https://code.visualstudio.com/docs/editor/codebasics#:~:text=VS%20Code%20supports%20multiple%20cursors>
- Web Platform Tests: How are different browsers able to render the same information without any changes? How do different browsers function alike even after being created by different vendors? <https://web-platform-tests.org/>
- Hosting HTML pages on github.com <https://medium.com/any-writers/how-to-host-a-static-website-on-github-for-free-f47b12790775>
- Hosting HTML Pages using Heroku <https://medium.com/@agavitalis/how-to-deploy-a-simple-static-html-website-on-heroku-492697238e48>

### Sprint2 - Develop a Web Page Using Semantic HTML5 Elements

Web founder Tim Berners Lee had a vision for the web. He wanted to make web content accessible to all machines using appropriate HTML elements for the intended purpose. The semantic elements should clearly communicate the intent to both the browsers and the developers.In this learning sprint, you would learn to semantically structure web pages which make machines understand web pages. You will also learn how semantically designed web pages can help people with disabilities.

- How Do Semantic Elements Help Screen Readers?
  - <https://www.youtube.com/watch?v=LP3zLrOjQSY&ab_channel=dantamas>
  - <https://www.youtube.com/watch?v=qdB8SRhqvFc&ab_channel=Front-Trends>

### Sprint3 - Style a Web Page Using CSS Properties and CSS Box Model

HTML helps to frame and structure a web page. CSS or the Cascading Style Sheet language, on the other hand helps in adding aesthetics to the web page. Web pages with only information and no styles makes it less appealing. Companies whose websites are styled with pleasing looks have a better viewership. Hence developers must master the skill of applying CSS while developing web pages.In this learning sprint, you will get introduced to CSS and basic CSS style properties. You will learn the different techniques of styling web page using CSS. You will learn how these style properties can be applied on HTML elements using various CSS selectors. You will explore about CSS Box model properties and how do we manage spaces by applying the Properties like margin, padding and borders.

- Boxes and border cheat sheet <https://learntheweb.courses/topics/boxes-borders-cheat-sheet/>
- Letter spacing and line-height
  - <https://developer.mozilla.org/en-US/docs/Web/CSS/letter-spacing>
  - <https://developer.mozilla.org/en-US/docs/Web/CSS/line-height>
- Calculating the exact size of the box <https://css-tricks.com/the-css-box-model/>
- Combinators <https://developer.mozilla.org/en-US/docs/Learn/CSS/Building_blocks/Selectors/Combinators>
- Pseudo Class Selectors <https://css-tricks.com/pseudo-class-selectors/>
- CSS Specificity - Things you should know <https://www.smashingmagazine.com/2007/07/css-specificity-things-you-should-know/>
- BEM syntax <https://css-tricks.com/bem-101/>

### Sprint4 - Structure a Web Page Using CSS Floats

Structuring information provides clear paths for navigation within webpages and puts the most important elements of a website at the front and center. To design complex layouts, the normal document flow needs to be changed by overriding the default browser styles. You need to control the behavior and position of elements on the page. Positioning allows to customize the flow of elements in the document.In this learning sprint, you will learn to explore the behavior of normal document flow and how it can be controlled using CSS floats. You will also learn various CSS position properties like absolute, relative, fixed and static that will help to alter the position of elements.

### Sprint5 - Develop a Responsive Web Page Using Modern CSS

Web surfing has grown at a phenomenal rate over the past years as most people prefer browsing on their mobile devices. To provide a seamless user experience, web sites should adapt to various devices. A responsive web design offers smooth navigation with reduced scrolling and zooming for excellent user experience on various screen sizes.In this learning sprint, you will be introduced to the various responsive design patterns that use breakpoints for adding responsiveness to a web page. You will learn to implement design patterns like Mostly fluid and Layout shifter using modern CSS properties like media queries.

### Sprint6 - Develop a Responsive Web Page Using Bootstrap

Developing and designing responsive web pages has never been easy. It requires developing a grid system that can help web pages adapt on any device. Framework provides a predefined and tested code for reuse. This helps increase the productivity of a developer. Bootstrap is a CSS Framework which already provides a Grid System for you to work with.In this learning sprint, you will explore the column drop responsive design pattern. You will learn to implement this design pattern quickly using the Bootstrap Framework. You will also learn to design a responsive web page using various Bootstrap components like navbar, carousel, tables, cards and forms.

## Additional Resources

> Java tutorials:  <https://docs.oracle.com/javase/tutorial/java/index.html>