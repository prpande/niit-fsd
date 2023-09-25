<!-- omit in toc -->
# Repo for NIIT Full Stack Developer Program

- This repo contains the class notes, slides, assignments and solution src files for the NIIT FSD program.
- The repo contains both the practice and learning session code files.
- The files should be arranged in directories corresponding to each sprint sessions.

<!-- omit in toc -->
## Contents

- [Software](#software)
- [Repository Directory Structure](#repository-directory-structure)
- [Course1 - Programming Foundations Using Java](#course1---programming-foundations-using-java)
  - [Sprint1 - Pseudocode \& Algorithms](#sprint1---pseudocode--algorithms)
  - [Sprint2 - Introduction to Java](#sprint2---introduction-to-java)
  - [Sprint3 - Conditional Constructs](#sprint3---conditional-constructs)
  - [Sprint4 - Looping Constructs](#sprint4---looping-constructs)
  - [Sprint5 - Functions](#sprint5---functions)
- [Course2 - Java Language Fundamentals](#course2---java-language-fundamentals)
  - [Sprint1 - Unit Testing with JUnit](#sprint1---unit-testing-with-junit)
  - [Sprint2 - Arrays](#sprint2---arrays)
  - [Sprint3 - Sorting and Searching](#sprint3---sorting-and-searching)
  - [Sprint4 - Implementing Recursion](#sprint4---implementing-recursion)
  - [Sprint5 - String Manipulation](#sprint5---string-manipulation)
- [Course3 - Object-Oriented Programming](#course3---object-oriented-programming)
  - [Sprint1 - Introduction to Object-Oriented Programming](#sprint1---introduction-to-object-oriented-programming)
  - [Sprint2 - Objects and Constructors](#sprint2---objects-and-constructors)
  - [Sprint3 - Data Abstraction and Encapsulation](#sprint3---data-abstraction-and-encapsulation)
  - [Sprint4 - Inheritance](#sprint4---inheritance)
  - [Sprint5 - Polymorphism](#sprint5---polymorphism)
- [Course4 - Develop Responsive Web Pages using HTML5 and CSS3](#course4---develop-responsive-web-pages-using-html5-and-css3)
  - [Sprint1 - Develop a Web Page Using HTML5](#sprint1---develop-a-web-page-using-html5)
  - [Sprint2 - Develop a Web Page Using Semantic HTML5 Elements](#sprint2---develop-a-web-page-using-semantic-html5-elements)
  - [Sprint3 - Style a Web Page Using CSS Properties and CSS Box Model](#sprint3---style-a-web-page-using-css-properties-and-css-box-model)
  - [Sprint4 - Structure a Web Page Using CSS Floats](#sprint4---structure-a-web-page-using-css-floats)
  - [Sprint5 - Develop a Responsive Web Page Using Modern CSS](#sprint5---develop-a-responsive-web-page-using-modern-css)
  - [Sprint6 - Develop a Responsive Web Page Using Bootstrap](#sprint6---develop-a-responsive-web-page-using-bootstrap)
- [Course5 - Developing Basic Programs using JavaScript](#course5---developing-basic-programs-using-javascript)
  - [Sprint1 - Getting Started with JavaScript](#sprint1---getting-started-with-javascript)
    - [**Helpful Tools for Developing a JavaScript Code**](#helpful-tools-for-developing-a-javascript-code)
  - [Sprint2 - Implement Modular Programming Using Functions](#sprint2---implement-modular-programming-using-functions)
  - [Sprint3 - Implement Unit Testing using Mocha and Chai](#sprint3---implement-unit-testing-using-mocha-and-chai)
- [Course6 - Building Interactive Web Pages Using Modern JavaScript](#course6---building-interactive-web-pages-using-modern-javascript)
  - [\[Sprint1 - Utilize Arrays to Model Aggregate Data\]](#sprint1---utilize-arrays-to-model-aggregate-data)
  - [\[Sprint2 - Perform Common Array Operations Using JavaScript Array Methods\]](#sprint2---perform-common-array-operations-using-javascript-array-methods)
  - [\[Sprint3 - Model Real World Data Using Objects\]](#sprint3---model-real-world-data-using-objects)
  - [\[Sprint4 -Implement Stateless Communication Using REST APIs and JSON\]](#sprint4--implement-stateless-communication-using-rest-apis-and-json)
  - [\[Sprint5 -Develop Interactive Web Pages Using DOM and DOM Events\]](#sprint5--develop-interactive-web-pages-using-dom-and-dom-events)
  - [\[Sprint6 -Interact With Application Servers Using HTTP Protocol\]](#sprint6--interact-with-application-servers-using-http-protocol)
  - [\[Sprint7 - Gen AI Enabled Interactive Web Page Development\]](#sprint7---gen-ai-enabled-interactive-web-page-development)
- [Additional Resources](#additional-resources)

## Software

- [IntelliJ Community Edition](<https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC>)
- [Git](<https://github.com/git-for-windows/git/releases/download/v2.41.0.windows.3/Git-2.41.0.3-64-bit.exe>)
  - [GitHub Pull Requests and Issues](<https://marketplace.visualstudio.com/items?itemName=GitHub.vscode-pull-request-github>)
- [Visual Studio Code](<https://code.visualstudio.com/download>)
- Java Extensions for VS Code
  - [Extension Pack for Java](<https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack>)
  - [Test Runner for Java](<https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-test>)
  - [Debugger for Java](<https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-debug>)
  - [Maven for Java](<https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-maven>)
  - [Project Manager for Java](<https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-dependency>)
  
- HTML, CSS & JS Extensions for VS Code
  - [HTML CSS Support](<https://marketplace.visualstudio.com/items?itemName=ecmel.vscode-html-css>)
  - [Live Preview](<https://marketplace.visualstudio.com/items?itemName=ms-vscode.live-server>)
  - [Live Server](<https://marketplace.visualstudio.com/items?itemName=ritwickdey.LiveServer>)
  - [JavaScript (ES6) code snippets](<https://marketplace.visualstudio.com/items?itemName=xabikos.JavaScriptSnippets>)
  - [Bootstrap 4, Font awesome 4, Font Awesome 5 Free & Pro snippets](<https://marketplace.visualstudio.com/items?itemName=thekalinga.bootstrap4-vscode>)
- [NodeJS](<https://nodejs.org/en>)

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

## [Course1 - Programming Foundations Using Java](./C1-Programming%20Foundation%20Using%20Java)

In this course, you will learn to apply problem-solving techniques to decompose a problem into a step-by-step solution. You will then translate the steps into a program using Core Java language. This course will enable you to declare variables and use multiple data types in a Java program. You will explore how to work with different types of operators to do computational tasks and use conditional statements to make decisions in the program. You will also learn about using loops to perform repetitive tasks. You will use methods to make your code modular.

### [Sprint1 - Pseudocode & Algorithms](./C1-Programming%20Foundation%20Using%20Java/S1-Pseudocode&Algorithms-1707/)

Problem-solving algorithm is a technique used to find a solution in a finite amount of time. Programmers often use pseudocodes to develop these algorithms. The primary objective of a pseudocode is to simplify the function of each line of a program and make the construction phase of a code simpler for the programmer.In this learning sprint, you will decompose a problem into a step-by-step solution and apply programming logic to solve problems using algorithms and pseudocodes.

- [Algorithms and Pseudocode](<https://www.unf.edu/-broggio/cop2221/2221pseu.htm>)

### [Sprint2 - Introduction to Java](./C1-Programming%20Foundation%20Using%20Java/S2-JavaIntro-1907/)

Variables are considered as containers or entities used for saving data values at the time of Java Program execution. Operators are used to perform operations on these variables and values.In this learning sprint, you will go through the structure of a Java program and then write simple programs. You will use arithmetic, relational operators, and expressions to write programs in a logical manner.

- [Introduction to Java](<https://docs.oracle.com/javase/tutorial/getStarted/cuQjava/win32.html>)
- [Variables](<https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html>)
- [Data types](<https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html>)

### [Sprint3 - Conditional Constructs](./C1-Programming%20Foundation%20Using%20Java/S3-ConditionalConstructs-2407/)

Programming languages allow you to check a condition and execute certain instructions, depending on the result whether it is true or false. Such statements are either called conditional constructs or decision-making constructs.In this learning sprint you will acquire the necessary skills to create Java programs in a logical and structured manner.

- [`if` Construct](<https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html>)
- [`switch` Construct](<https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html>)

### [Sprint4 - Looping Constructs](./C1-Programming%20Foundation%20Using%20Java/S4-LoopingConstructs-2607/)

Looping constructs in programming languages execute a set of repeated statements that work for as long as a specified condition remains true. This condition is generally known as the loop control.In this learning sprint, you will use different types of looping constructs to perform repetitive tasks easily and to control the flow of the program.

- [While and Do-while](<https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html>)
- [For Loop](<https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html>)
- [Do-while Loop](<https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html>)

### [Sprint5 - Functions](./C1-Programming%20Foundation%20Using%20Java/S5-Functions-3107/)

Dividing a complex problem into smaller chunks makes your program easy to understand and reusable.In this learning sprint, you will learn to write modular programs by breaking them into simpler and logical methods. These methods are used to perform certain actions known as functions.

- [Functions](<https://docs.oracle.com/javase/tutoriaI/java/javaOO/methods.html>)
- [Return Values](<https://docs.oracle.com/javase/tutorial/java/javaOO/returnvalue.html>)

## [Course2 - Java Language Fundamentals](./C2-Java%20Language%20Fundamentals/)

For programmers, writing codes to manipulate strings is an important skill, as almost all programs contain text. Arrays are a faster and more efficient way to store and manipulate a collection of data of the same type. In this course, you will learn to write Java programs using arrays and strings. You will learn to check your code for errors or missing requirements. The course will teach you to implement logic, code, compile, run and test Java programs.

### [Sprint1 - Unit Testing with JUnit](./C2-Java%20Language%20Fundamentals/S1-UnitTesting-0308/)

How can you find out whether a code will produce the desired result? If it does not produce the expected output, at what point would you like to find the errors? At the unit level or at the end, when all the programs are integrated? Identifying defects at the unit level and fixing the defects helps to achieve better quality code, simplifies the debugging process, and reduces the overall time and cost incurred to fix a defect.In this learning sprint, you will implement unit testing using the JUnit framework. You will learn to write test cases and use assertion statements to test the individual unit of your code.

### [Sprint2 - Arrays](./C2-Java%20Language%20Fundamentals/S2-Arrays-0708/)

A data structure that stores a fixed-size, sequential collection of elements of the same type is called an array. You may also think of an array as a collection of variables of the same type.In this learning sprint, you will learn to declare, define, store, and manipulate a set of data elements in the memory as a single-dimensional array.

- [Array](<https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html>)
- [Creating, Initializing, and Accessing an Array](<https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html>)
- [Array Manipulations](<https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html>)

### [Sprint3 - Sorting and Searching](./C2-Java%20Language%20Fundamentals/S3-Sorting-1008/)

Have you ever noticed how data is typically displayed in chronological order, whether in an email application or on a social media platform? An email application, for instance could display emails sorted as per their received date or sorted as per the sender. Sorting an array means arranging its elements in ascending or descending order. There are different algorithms that can be used to sort an array.In this learning sprint, you will learn to sort data stored in arrays using a few sorting algorithms.

- [Sorting Algorithm Implementation using Java](<https://stackabuse.com/sorting-agorithms-in-java/>)
- [Time and Space Complexity of Sorting Algorithms](<https://www.interviewkickstart.com/learn/time-complexities-of-all-sorting-algorithms>)

### [Sprint4 - Implementing Recursion](./C2-Java%20Language%20Fundamentals/S4-Recursion-1408/)

Recursion is a technique used for making a function call itself. This technique helps in breaking down complicated problems into simpler ones so that are easier to solve.In this learning sprint, you will learn to break down large, complex problems into simple sub-problems using recursive methods.

- [Recursion](<https://en.wikipedia.org/wiki/Recursion_(computer_science)>)
- [Recursion Vs Iteration](<https://www.advanced-ict.info/programming/recursion.html>)

### [Sprint5 - String Manipulation](./C2-Java%20Language%20Fundamentals/S5-StringManipulation-1608/)

In Java, a string is an object that represents a sequence of characters.In this learning sprint, you will learn how to use the string class in Java and to manipulate strings using built-in methods.

- [Strings](<https://docs.oracle.com/javase/tutorial/java/data/strings.html>)

## [Course3 - Object-Oriented Programming](./C3-Object%20Oriented%20Programming/)

Object-oriented programming is a programming paradigm based on the concept of "objects." Object-oriented programming mimics how objects are modelled in the real world to replicate the same in software programs. It uses concepts such as abstraction, inheritance, encapsulation, polymorphism, etc. In this course, you will learn to identify the objects in a given problem and write object-oriented programs in Java.

### [Sprint1 - Introduction to Object-Oriented Programming](./C3-Object%20Oriented%20Programming/S1-IntroToOOP-2208/)

Object-oriented programming is the core of Java Programming language. It is used to design a program using classes and objects. You would have seen various objects around you. Each of these objects have attributes that display some kind of behavior.In this learning sprint, you will learn to identify attributes and behavior of objects and model them as Java objects. It will also help you to create classes that will be the manufacturer of the objects.

- [Classes and objects](<https://docs.oracle.com/javase/tutorial/java/javaOO/index.html>)

### [Sprint2 - Objects and Constructors](./C3-Object%20Oriented%20Programming/S2-Objects&Ctors-2408/)

The foundation of Java is build on classes and objects, their attributes and their methods.In this learning sprint you will learn to create Java objects through programming. You will learn to declare and initialize Java objects in a class by using constructors. You will also explore how Java objects are stored in memory.

- [Create Objects](<https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html>)
- [Constructors](<https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html>)

### [Sprint3 - Data Abstraction and Encapsulation](./C3-Object%20Oriented%20Programming/S3-DataAbstraction&Encapsulation-2808/)

In object-oriented programming (OOP), abstraction is a feature of that hides unnecessary information and makes only what is essential visible to the users. OOPs also have encapsulation as a feature. In order to shield the data from prying eyes, it combines the code and data into a single entity. This helps resolve issues or problems at the design level of a program.In this learning sprint, you will learn to package and organize Java classes and understand how access can be specified for all the classes. You will learn the necessary skills to write well encapsulated classes.

- [Packages](<https://docs.oracle.com/javase/tutorial/java/concepts/package.html>)
- [Encapsulation](<https://www.simplilearn.com/tutorials/java-tutorial/java-encapsulation>)

### [Sprint4 - Inheritance](./C3-Object%20Oriented%20Programming/S4-Inheritance-3008/)

In inheritance, one object acquires or inherits the properties of another object. The process of inheritance also supports hierarchical classification. It allows building of new classes on top of the existing classes.In this learning sprint, you will identify the relationship between classes and implement the different types of inheritance relationships among classes. You will learn to inherit a new class from an existing one and identify the reusable methods within the class hierarchy.

- [Inheritance](<https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html>)
- [Object class](<https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html>)

### [Sprint5 - Polymorphism](./C3-Object%20Oriented%20Programming/S5-Polymorphism-0109/)

Polymorphism is a process in which different ways can be used to perform the same task. In Java, one class can acquire the attributes and properties of another class through Java inheritance. Users use polymorphism to use these inherited properties for a variety of purposes.In this learning sprint, you will learn to use abstract classes and interfaces to implement static and dynamic polymorphism among Java objects.

- [Polymorphism](<https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html>)

## [Course4 - Develop Responsive Web Pages using HTML5 and CSS3](./C4-Develop%20Responsive%20Web%20Pages%20Using%20HTML5%20&%20CSS3/)

Millennials spend one third of the day on the internet, and more than 50 percent of internet users use mobile devices to access content. This has created a huge demand for frontend developers who can build websites that load fast and provide a similar user experience on desktops as well as mobile devices. This course helps you acquire the skills to build responsive web pages that can adapt to multiple devices. During the journey, you will learn to structure and style W3C compliant web pages using HTML5 and CSS3. You will then advance in the journey to build responsive layouts using modern CSS concepts such as floats, media queries, grids, and flexbox. You will also learn to use the BootStrap Framework to rapidly build mobile-first responsive Web pages.

### [Sprint1 - Develop a Web Page Using HTML5](./C4-Develop%20Responsive%20Web%20Pages%20Using%20HTML5%20&%20CSS3/S1-HTML5-0509/)

Dependency on the internet and social media has increased tremendously over the past decade. HTML is a markup language used for developing web pages. It is therefore important for aspiring web developers to know the basics of the Hypertext Markup Language (HTML).In this learning sprint, you will learn to structure a Web Page using HTML5. You will understand the anatomy of a web page, the various HTML elements and the tools used to build these pages quickly.

- [Quick Facts about the World Wide Web](<https://www.britannica.com/topic/World-Wide-Web>)
- [HTML Tags Chart](<https://www.csun.edu/science/help/help_docs/html_tags.html>)
- [Best HTML Editors](<https://www.hostinger.in/tutorials/best-html-editors>)
- [Emmet Cheat Sheet](<https://docs.emmet.io/cheat-sheet/>)
- [VS Code Multi-cursor Feature](<https://code.visualstudio.com/docs/editor/codebasics#:~:text=VS%20Code%20supports%20multiple%20cursors>)
- [Web Platform Tests: How are different browsers able to render the same information without any changes? How do different browsers function alike even after being created by different vendors?](<https://web-platform-tests.org/>)
- [Hosting HTML pages on github.com](<https://medium.com/any-writers/how-to-host-a-static-website-on-github-for-free-f47b12790775>)
- [Hosting HTML Pages using Heroku](<https://medium.com/@agavitalis/how-to-deploy-a-simple-static-html-website-on-heroku-492697238e48>)

### [Sprint2 - Develop a Web Page Using Semantic HTML5 Elements](./C4-Develop%20Responsive%20Web%20Pages%20Using%20HTML5%20&%20CSS3/S2-Semantic%20HTML5%20Elements/)

Web founder Tim Berners Lee had a vision for the web. He wanted to make web content accessible to all machines using appropriate HTML elements for the intended purpose. The semantic elements should clearly communicate the intent to both the browsers and the developers.In this learning sprint, you would learn to semantically structure web pages which make machines understand web pages. You will also learn how semantically designed web pages can help people with disabilities.

- How Do Semantic Elements Help Screen Readers?
  - <https://www.youtube.com/watch?v=LP3zLrOjQSY&ab_channel=dantamas>
  - <https://www.youtube.com/watch?v=qdB8SRhqvFc&ab_channel=Front-Trends>

### [Sprint3 - Style a Web Page Using CSS Properties and CSS Box Model](./C4-Develop%20Responsive%20Web%20Pages%20Using%20HTML5%20&%20CSS3/S3-CSS%20Properties%20and%20CSS%20Box%20Model/)

HTML helps to frame and structure a web page. CSS or the Cascading Style Sheet language, on the other hand helps in adding aesthetics to the web page. Web pages with only information and no styles makes it less appealing. Companies whose websites are styled with pleasing looks have a better viewership. Hence developers must master the skill of applying CSS while developing web pages.In this learning sprint, you will get introduced to CSS and basic CSS style properties. You will learn the different techniques of styling web page using CSS. You will learn how these style properties can be applied on HTML elements using various CSS selectors. You will explore about CSS Box model properties and how do we manage spaces by applying the Properties like margin, padding and borders.

- [Boxes and border cheat sheet](<https://learntheweb.courses/topics/boxes-borders-cheat-sheet/>)
- [Letter spacing](<https://developer.mozilla.org/en-US/docs/Web/CSS/letter-spacing>)
- [Line height](<https://developer.mozilla.org/en-US/docs/Web/CSS/line-height>)
- [Calculating the exact size of the box](<https://css-tricks.com/the-css-box-model/>)
- [Combinators](<https://developer.mozilla.org/en-US/docs/Learn/CSS/Building_blocks/Selectors/Combinators>)
- [Pseudo Class Selectors](<https://css-tricks.com/pseudo-class-selectors/>)
- [CSS Specificity - Things you should know](<https://www.smashingmagazine.com/2007/07/css-specificity-things-you-should-know/>)
- [BEM syntax](<https://css-tricks.com/bem-101/>)

### [Sprint4 - Structure a Web Page Using CSS Floats](./C4-Develop%20Responsive%20Web%20Pages%20Using%20HTML5%20&%20CSS3/S4-CSS%20Floats-1109/)

Structuring information provides clear paths for navigation within webpages and puts the most important elements of a website at the front and center. To design complex layouts, the normal document flow needs to be changed by overriding the default browser styles. You need to control the behavior and position of elements on the page. Positioning allows to customize the flow of elements in the document.In this learning sprint, you will learn to explore the behavior of normal document flow and how it can be controlled using CSS floats. You will also learn various CSS position properties like absolute, relative, fixed and static that will help to alter the position of elements.

- [Things you should know about floats](<https://www.smashingmagazine.com/2007/05/css-float-theory-things-you-should-know/>)
- [All about floats](<https://css-tricks.com/all-about-floats/>)
- [Float property and its values](<https://developer.mozilla.org/en-US/docs/Web/CSS/float>)
- [Logical properties of margin, padding and border](<https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_logical_properties_and_values/Margins_borders_padding>)

### [Sprint5 - Develop a Responsive Web Page Using Modern CSS](./C4-Develop%20Responsive%20Web%20Pages%20Using%20HTML5%20&%20CSS3/S5-Modern%20CSS-1309/)

Web surfing has grown at a phenomenal rate over the past years as most people prefer browsing on their mobile devices. To provide a seamless user experience, web sites should adapt to various devices. A responsive web design offers smooth navigation with reduced scrolling and zooming for excellent user experience on various screen sizes.In this learning sprint, you will be introduced to the various responsive design patterns that use breakpoints for adding responsiveness to a web page. You will learn to implement design patterns like Mostly fluid and Layout shifter using modern CSS properties like media queries.

- [Guidelines for responsive web design](<https://www.smashingmagazine.com/2011/01/guidelines-for-responsive-web-design/>)
- [Responsive web design proven principle](<https://level-level.com/blog/responsive-web-design-our-5-proven-principles/>)
- [Responsive design best practices](<https://www.impactplus.com/blog/responsive-design-best-practices#:~:text=For%20an%20optimal%20responsive%20experience>)
- [Golden ratio in web design](<https://uxplanet.org/golden-ratio-bring-balance-in-ui-design-765c954f0ff9>)
- [A complete guide to CSS media queries](<https://css-tricks.com/a-complete-guide-to-css-media-queries/>)
- [What does mobile first design mean for digital designers?](<https://www.invisionapp.com/inside-design/mobile-first-design/>)

### [Sprint6 - Develop a Responsive Web Page Using Bootstrap](./C4-Develop%20Responsive%20Web%20Pages%20Using%20HTML5%20&%20CSS3/S6-Bootstrap-1809/)

Developing and designing responsive web pages has never been easy. It requires developing a grid system that can help web pages adapt on any device. Framework provides a predefined and tested code for reuse. This helps increase the productivity of a developer. Bootstrap is a CSS Framework which already provides a Grid System for you to work with.In this learning sprint, you will explore the column drop responsive design pattern. You will learn to implement this design pattern quickly using the Bootstrap Framework. You will also learn to design a responsive web page using various Bootstrap components like navbar, carousel, tables, cards and forms.

- [Get Bootstrap](<https://getbootstrap.com/>)
- [Bootstrap Best Practices](<https://medium.com/@nikita.vyrko/bootstrap-best-practices-59752895d4e1>)
- [Common Bootstrap Mistakes](<https://codeburst.io/7-common-bootstrap-mistakes-that-developers-make-5dc8f9bc5423>)
- [Best Bootstrap websites](<https://www.awwwards.com/websites/bootstrap/>)

## [Course5 - Developing Basic Programs using JavaScript](./C5-Basic%20Programs%20using%20JavaScript/)

HTML5 and CSS3 frameworks help you build a static web page, that displays content and works on any device. However, to make a page interactive, you need a programming language that can be understood by the browsers. JavaScript is one of the core technologies of the World Wide Web. In this course, you will explore basic programming concepts and solve simple computational problems using JavaScript. You will acquire skills to write decision-making programs using conditional constructs and build iterations in programs using looping constructs. The course will also provide insight into modularizing code by writing user-defined functions. In addition you will write test cases using JavaScript Libraries.

### [Sprint1 - Getting Started with JavaScript](./C5-Basic%20Programs%20using%20JavaScript/S1-JavaScriptIntro-2009/)

JavaScript is the most popular programming language for web development. More specifically, it’s a scripting language that is interpreted by the browser to make the page interactive. To add interactivity to the web page, the developer has to write programs in JavaScript. This learning sprint sets the foundation for writing simple JavaScript programs. By the end of this sprint, you will be able to work with key programming concepts such as statements, expressions, datatypes, variables, constants, literals, and operators and will solve basic computational problems using these concepts.

- [JavaScript Intro](<https://javascript.info/intro>)
- [Intro to JS Engine](<https://www.htmlgoodies.com/javascript/what-is-the-javascript-engine-and-how-it-works/>)
- [JavaScript Development Tools and IDEs](<https://technostacks.com/blog/javascript-development-tools/>)
- [Evolution of JavaScript](<https://www.opensourceforu.com/2021/12/the-evolution-of-javascript/>)
- [Truthy in JavaScript](<https://developer.mozilla.org/en-US/docs/Glossary/Truthy>)
- [Falsy in JavaScript](<https://developer.mozilla.org/en-US/docs/Glossary/Falsy>)
- [switch vs if...else: A Comparison]( <https://javascript.plainenglish.io/switch-vs-if-else-7f7617bfe8cb>)
- [JavaScript — Short Circuit Evaluation - && (AND) Operator]( <https://codeburst.io/javascript-short-circuit-conditionals-bbc13ac3e9eb>)
- [JavaScript — Short Circuit Evaluation - || (OR) Operator](<https://codeburst.io/javascript-short-circuit-evaluation-3709ffda6384>)
- [JavaScript Best Practices - Loop Flow Control]( <https://levelup.gitconnected.com/javascript-best-practices-more-about-loops-910589f7aa24>)
- [Difference between while and do...while](<https://techdifferences.com/difference-between-while-and-do-while-loop.html>)
- [Tips: JavaScript break and continue Statements](<https://www.bitdegree.org/learn/javascript-break>)

#### **Helpful Tools for Developing a JavaScript Code**

- Firefox Developer Tools
- JavaScript Shells
- StackBlitz
- JSFiddle
- CodePen

### [Sprint2 - Implement Modular Programming Using Functions](./C5-Basic%20Programs%20using%20JavaScript/S2-JavaScriptFunctions-2209/)

A very large program is always difficult to understand, and debugging takes a lot of time to trace an error in a big program. JavaScript functions enable programmers to break down or decompose a problem into smaller chunks, each of which performs a particular task. By the end of this sprint, you will be able to write modular programs by breaking them into simpler and logical methods. Hands-on practices are provided to create and execute user-defined functions, which improves the readability of code.

- [MDN Functions](<https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Functions#predefined_functions>)
- [JavaScript Function and Function Expressions](<https://www.programiz.com/javascript/function>)

### [Sprint3 - Implement Unit Testing using Mocha and Chai](./C5-Basic%20Programs%20using%20JavaScript/S3-TestingwithMocha&Chai-2509/)

Producing top quality products requires rigorous testing. The web is no exception. In this learning sprint, you will learn to think and write test cases using JavaScript Libraries to test your Web Application.

- [What is Testing Framework?](https://mindmajix.com/what-is-testing-framework)
- [Understanding Chai.js Language Mechanics](https://medium.com/building-ibotta/understanding-chai-js-language-mechanics-cc28e4c9604b)
- [What is the difference between a test runner, testing framework, assertion library, and a testing plugin?](https://amzotti.github.io/testing/2015/03/16/what-is-the-difference-between-a-test-runner-testing-framework-assertion-library-and-a-testing-plugin/)

## [Course6 - Building Interactive Web Pages Using Modern JavaScript](./C6-Interactive%20Web%20Pages%20Using%20Modern%20JavaScript/)

Most businesses with a strong online presence wish to provide their customers with a rich, interactive, user experience. JavaScript is a popular scripting language that executes within the browser and helps in developing interactive web pages. The language features provide support to add interactivity to the pages by allowing page contents to be updated dynamically based on a user's request. In addition, there are features that help perform complex data operations and interchanging information with the server without creating any delay.

### [Sprint1 - Utilize Arrays to Model Aggregate Data]

Data in a web application should be a representation of real-world objects. In JavaScript, arrays represent a collection of values, and objects help model the real world's data. By the end of this learning sprint, you will learn to create objects and access their properties. You will also be able to create arrays, access their values using for loops, and extract multiple properties from an array using array destructuring.

### [Sprint2 - Perform Common Array Operations Using JavaScript Array Methods]

Performing array operations is an inherent part of any large application. This sprint will teach you how to manipulate array elements with the help of various built-in Array methods. By the end of this learning sprint, you will be able to add and remove elements from the array using built-in methods like push, pop, shift, and un-shift. Hands-on practices will enable you to filter, transform, and aggregate array elements using filter, map, and reduce methods.

### [Sprint3 - Model Real World Data Using Objects]

In a web application, a client and server communicate to exchange information. Client makes a request to the server to send or receive data. However, client and server applications are developed using different languages. Hence, the data needs to be converted and shared in a format that is understood by both applications. JSON is a text-based format that represents structured data based on JavaScript syntax but is language-independent. In this learning sprint, you will acquire skills to create JSON structures, both simple and complex.The hands-on exercises will help you to convert JSON to JavaScript objects and perform aggregations. You will also learn to use the method to convert a JavaScript object to JSON data.

### [Sprint4 -Implement Stateless Communication Using REST APIs and JSON]

In a typical web application, the client and server applications are written in all sorts of different languages that cannot communicate without an intermediary. REST API is a uniform interface that allows a client to communicate with the server using Hyper Text Transfer Protocol - HTTP. In this learning sprint, you will acquire skills to create RESTful APIs using json-server and test them using the Postman app. You will get opportunities to interpret an API specification document and create it in JSON format.

### [Sprint5 -Develop Interactive Web Pages Using DOM and DOM Events]

User experiences are enhanced when web pages are interactive. They not only respond to users' interactions but also keep them engaged and coming back for more. JavaScript helps build interactive web pages. It helps save network bandwidth by preempting server validation and performing client-side validation.In this learning sprint, you will learn to add interactivity by understanding the DOM and DOM Events. You will learn to validate users' data using client-side JavaScript.

### [Sprint6 -Interact With Application Servers Using HTTP Protocol]

JavaScript, by default, is synchronous, meaning a task needs to complete its execution before the next can begin. However, in web application, there are many tasks that need to execute asynchronously. Asynchronous programming enables your program to start a potentially long-running task without waiting for the on-going task to finish. It is responsive to other events triggered by the user or by the system. In this learning sprint, you will acquire the skills required to make asynchronous requests to respond to timer events or make HTTP calls to a server to fetch or store data using callbacks and promises. The hands-on practices and challenges of this sprint will enable you to experience the limitations of working with callbacks and encourage you to use Promise with the Axios API to make asynchronous server calls and handle responses.

### [Sprint7 - Gen AI Enabled Interactive Web Page Development]

## Additional Resources

> Java tutorials:  <https://docs.oracle.com/javase/tutorial/java/index.html>
