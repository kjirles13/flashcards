import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class FlashcardApp {
    private static Map<Integer, Flashcard> flashcards = new HashMap<>();

    public static void main(String[] args) {
        flashcards.put(0, new Flashcard("What is Maven?", "Project management tool for java based projects. It builds, compiles code, handles dependencies."));
        flashcards.put(1, new Flashcard("What is JRE?", "Stands for Java Runtime Environment - it's basically a piece of software meant to run other software - allows you to run your java code"));
        flashcards.put(2, new Flashcard("What is JDK?", "Java Development Kit - emcompasses the JRE and JVM along with other tools to develop java-based software applications"));
        flashcards.put(3, new Flashcard("What is a JVM?", "Java Virtual Machine - calls the main method in the code - acts as a runtime engine to run your code"));
        flashcards.put(4, new Flashcard("What is OOP and why do we use it?", "Design paradigm around classes and objects - it allows us to code in simple reuseble pieces of code called classes"));
        flashcards.put(5, new Flashcard("What are the three pillars of OOP?", "Inheritance, Polymorphism, and Encapsulation"));
        flashcards.put(6, new Flashcard("What is Inheritance?", "When a class derives properties and behaviors from another class"));
        flashcards.put(7, new Flashcard("What is Polymorphism? What types are there?", "Polymorphism is the ability of an object to take on many different forms - means our classes can provide different implementations of methods - method overloading and overriding are examples"));
        flashcards.put(8, new Flashcard("What is Encapsulation?", "Bundling data and methods within a class - information hiding or abstraction - protects your data and makes it only accessible in certain ways by making methods or properties private or protected"));
        flashcards.put(9, new Flashcard("What is an abstract class?", "A class that is not instantiated but it can be subclassed - you can implement methods"));
        flashcards.put(10, new Flashcard("What is the difference between an array and other reference types?", "An array is set size and must be declared that size - allocated to the stack rather than the heap - lists can contain multiple data types and can change size"));
        flashcards.put(11, new Flashcard("What is the difference between a constructor and a method?", "A constructor is called to instantiate an object of a particular class, while a method is a behavior of that class"));
        flashcards.put(12, new Flashcard("What is the difference between primitive (value) types and reference types?", "Primitive values allocate memory in the stack"));
        flashcards.put(13, new Flashcard("What is an interface? How is it difference from Abstract?", "An interface contains method signatures but no method bodies - any class that implements that interface must implement those methods - an abstract class can have methods that are developed"));
        flashcards.put(14, new Flashcard("What are the differences between a Stack and a Queue?", "Stack - pull from the top (FILO); Queue - pull from the front (FIFO)"));
        flashcards.put(15, new Flashcard("What is CRUD?", "Create - Retrieve - Update - Delete; Basic functions for a persistent storage system"));
        flashcards.put(16, new Flashcard("What is a pom.xml file and what does it do?", "A pom.xml file contains dependencies that are necessary for the function of your application"));
        flashcards.put(17, new Flashcard("What are dependencies?", "Dependencies are JAR files needed to run your program - JAR file is file format to aggregate multiple java files and their metadata"));
        flashcards.put(18, new Flashcard("What is pair programming? Advantages and disadvantages?", "Pair programming is where one programmer works on a project and the other observes while they type - they switch roles frequently"));
        flashcards.put(19, new Flashcard("What is RDBMS?", "Relational Database Management System - a database that represents data in tables that reference one another - creates links between tables using primary and foreign keys"));
        flashcards.put(20, new Flashcard("What is a software vulnerability that is totally under the control of the programmer (even a junior developer)?", "Avoiding SQL injection by using parameters - hashing passwords and never storing unhashed passwords in databases"));
        flashcards.put(21, new Flashcard("What are some aspects of Integration Testing?", "Testing how your code interacts with a database or an API, unit testing is testing your methods and integration testing is testing how your program interacts with other programs "));
        flashcards.put(22, new Flashcard("What does the first forward slash (\"/\") in a URL represent. What does the questions mark {\"?\") in a URL represent?", "Forward slash indicates the root directory - question mark indicates the root directory"));
        flashcards.put(23, new Flashcard("What is MVC?", "Model-View-Controller : Design pattern that keeps your code clean and maintainable - Allows you to reuse logic across platforms without allowing any particular part to do too much"));
        flashcards.put(24, new Flashcard("What is loosely coupled code?", "You don't want code so tightly integrated that it's completely dependent on another piece of code - You don't want any piece of code doing too much - Coders aim to create loosely coupled code"));
        flashcards.put(25, new Flashcard("What is Spring Framework?", "Open source framework for building and running applications in java."));
        flashcards.put(26, new Flashcard("What is annotation?", "Tag that is used to associate metadata with code blocks - They \"decorate\" the code block"));
        flashcards.put(27, new Flashcard("What is Spring Boot?", "A framework tp create java apps and web server applications"));
        flashcards.put(28, new Flashcard("What is a compiler?", "A compiler translates all your code from your source language into a java file so you can run your program"));
        flashcards.put(29, new Flashcard("What is a model?", "A model is a class that represents data that you pull from a database and stores that information in a object"));
        flashcards.put(30, new Flashcard("In HTTP, how are the GET and POST verbs alike? How are they different?", "Get retrieves information and does not send a body - Post sends a body to be added to a database"));
        flashcards.put(31, new Flashcard("What is JSON?", "Javascript Object Notation. It's a format often used to transfer data from a server to a web page. Lightweight for storing and transferring data."));
        flashcards.put(32, new Flashcard("What is model binding?", "Allows you to map an HTTP request to a model in you MVC code"));
        flashcards.put(33, new Flashcard("What is Node.js", "Runtime application to build server side applications"));
        flashcards.put(34, new Flashcard("What is overloading?", "Overloading a method means that you have more than one method of the same name but with different parameters"));
        flashcards.put(35, new Flashcard("What is a parameter?", "Parameters act as variables within a method - they are in the method signature"));
        flashcards.put(36, new Flashcard("What is overriding?", "Overriding a method is when a subclass of a parent class implements the same method in a different way"));
        flashcards.put(37, new Flashcard("What is REST?", "Representational State Transfer : series of guidlines for defining Web Services that are flexible and usable by a wide range of services - every component is a resource and is accessed by HTTP standard methods - stateless and does not store any information about the client"));
        flashcards.put(38, new Flashcard("Whats the order of an SQL statement?", "FROM/JOIN, WHERE, GROUP BY, HAVING, SELECT, ORDER BY, LIMIT/OFFSET"));
        flashcards.put(39, new Flashcard("What is a DAO?", "Data Access Object : an object or an interface that is used to access data from a database"));
        flashcards.put(40, new Flashcard("Why is parameter substitution important as opposed to concatanation?", "Avoids SQL injection - you can put in certain SQL calls with a path variable to delete information from a database - parameters avoid this because they're just treated as data rather than an executable statement"));
        flashcards.put(41, new Flashcard("What is dependency injection?", "Where a framework(like Spring) injects instances of required classes into a new object rather than the object itself creating them - Dependency Injection is concrete term, in which we provide dependencies of the object at run time like injecting an instance of one class into another that is needed for the function. DI helps create loosely coupled code."));
        flashcards.put(42, new Flashcard("What are the components that make up the signature method?", "accessor, return type, name, number and type of parameters"));
        flashcards.put(43, new Flashcard("What is the relationship between classes and objects?", "A class is a blueprint for an object - it contains properties and behaviors for an object - an object is an instantiation of that class (objects only exist in runtime)"));
        flashcards.put(44, new Flashcard("What is a foreign key in a relational database? Can you give an example?", "A foreign key links one table to another - it is the primary key in another table and creates a relationship between the data"));
        flashcards.put(45, new Flashcard("What is a primary key?", "A primary key is a unique identifier for a row in a table in a Relational Database - all information in the table should relate to the primary key"));
        flashcards.put(46, new Flashcard("What key word do you use to inherit form class in Java?", "Extends"));
        flashcards.put(47, new Flashcard("What is the keyword \"super\" a reference to?", "Super refers to the parent class that that class inherits from"));
        flashcards.put(48, new Flashcard("What is the \"this\" keyword used for in Java?", "This refers to the particular instantiation of the class or the particular object"));
        flashcards.put(49, new Flashcard("What does the keyword \"final\" mean in a method?", "Final means that a variable cannot be modified - for a class it means that no other class can inherit from it"));
        flashcards.put(50, new Flashcard("What is a NullPointerException?", "A null pointer exception is a runtime exception that is thrown when a variable is accessed that has no reference or is \"null\""));
        flashcards.put(51, new Flashcard("What does the term \"static\" mean?", "Static means a property or method belongs to the class rather than an instance, so it can be called without instantiating an object of that class"));
        flashcards.put(52, new Flashcard("What is a JSON Web Token?", "Used primarily for authorization in APIs and other HTTP requests : compact method of transmitting information between parties : in header/payload/signature format"));
        flashcards.put(53, new Flashcard("What is Unix time?", "Number of seconds since 1970-01-01 00:00:00 UTC"));
        flashcards.put(54, new Flashcard("What is Principal?", "The current logged in user"));
        flashcards.put(55, new Flashcard("What is a package?", "A namespace that organizes a group of related classes and interfaces - like a folder on your computer"));
        flashcards.put(56, new Flashcard("What is NPM?", "Node.js Package Manager - Written in JavaScript - offers consistent way to install, uninstall, and upgrade software - automatically handles dependencies - packages available online"));
        flashcards.put(57, new Flashcard("How can we test our client-server application is following the rules and protocols of REST?", "Uniform interface, separation of concerns between client and server, STATELESS (does not keep information on user), cacheable, hierarchally labeled"));
        flashcards.put(58, new Flashcard("What is a JWT and how is it used?", "JSON Web Token - compact and self-contained way for transmitting information as a JSON object - often used for user authorization"));
        flashcards.put(59, new Flashcard("Describe MVC in the context of a Web Service running on a server.", "Model - View - Controller ; design pattern in software used to build web services - separates the software logic from the display to the user"));
        flashcards.put(60, new Flashcard("What is the stack?", "Memory structure that stores local variables and order of method execution - physical space in your ram allocated to each thread at run time"));
        flashcards.put(61, new Flashcard("What is the heap?", "Stores objects and classes - it's dynamic and doesn't follow a specific order - objects that are no longer used are deleted and space is freed up"));
        flashcards.put(62, new Flashcard("What should HTTP status codes in the 200's indicate? The 400's? The 500's? What specific HTTP status codes do you know, and what should they mean?", "200s - OK ; 300 - redirect; 400s - client side issue with the call ; 500s - server side issue ; 200 OK, 201 Created, 204 No content, 400 Bad Request, 403 Forbidden, 404 not found, 500 internal server error"));
        flashcards.put(63, new Flashcard("What is normalizing a database?", "Normalizing a database is organizing data in your database, ensuring the proper relationship between your data, protecting your data and keeping you from repeating data in tables"));
        flashcards.put(64, new Flashcard("What is HTML and what does it do?", "Hyper Text Mark-up Language, take the raw content you want to display and structure it with HTML"));
        flashcards.put(65, new Flashcard("What are HTML attributes?", "A key value pair in an HTML element like type = \"text\""));
        flashcards.put(66, new Flashcard("What is semantic HTML?", "Assigning meaning to your elements (<header>, <footer>, <nav>, <article>, <section>, <aside>, <main>)"));
        flashcards.put(67, new Flashcard("What is CSS?", "Cascading Style Sheets - styles a web page"));
        flashcards.put(68, new Flashcard("What is a CSS selector?", "Define the elements to which a set of CSS rules apply"));
        flashcards.put(69, new Flashcard("What is the head information in HTML?", "Meta data information for the webpage, link to the CSS file, and the title of the page"));
        flashcards.put(70, new Flashcard("\"==\" versuses \".equals()\"", "Compares addresses versus values - primitive types have the same address on the stack and reference types have unique addresses"));
        flashcards.put(71, new Flashcard("What is a runtime error?", "A logic error while the program is running"));
        flashcards.put(72, new Flashcard("What is a compiler error?", "Syntax error - the code will not compile"));
        flashcards.put(73, new Flashcard("What is the difference between a for loop and a for each loop?", "For loop increments through a defined section of an array or list using a variable (often i) ; For each loops loop through all of the list without an index element"));
        flashcards.put(74, new Flashcard("What is the differnce between do while loops and while loops?", "Do while loops perform the function within the loop at least once regardless of the condition ; while loops continue until a certain condition is met"));
        flashcards.put(75, new Flashcard("How do you skip an item in a loop?", "You can increment a fori loop by 2 instead of 1 - You can make a conditional statement like an else if statement to compare if the element is the one you want and skip over it - keyword continue"));
        flashcards.put(76, new Flashcard("How do you break a loop?", "Meet the condition or break;"));
        flashcards.put(77, new Flashcard("What is the difference between a List and a Map object?", "Maps are key value pairs, you would use a map when you have a unique indexed key to directly pull the value"));
        flashcards.put(78, new Flashcard("How many classes can a class inherit from?", "One"));
        flashcards.put(79, new Flashcard("How many interfaces can a class inherit from?", "As many as they want"));
        flashcards.put(80, new Flashcard("Describe a try/catch block", "Try is the action you're attempting to do - Catch catches an error if one is thrown - Finally is executed regardless of whether or not the Try was successful"));
        flashcards.put(81, new Flashcard("What is the ACID principle?", "Transactions in a database - Atomic: one single action (all perform or none at all), Consistent: no side effects - repeatable, Isolated - does not effect other transactions occurring simultaneously, Durable: persist after you're done"));
        flashcards.put(82, new Flashcard("How do I get all the values from Table A whether or not there is a match in Table B?", "Left join"));
        flashcards.put(83, new Flashcard("What is a table constraint?", "A table constraint is a way to protect and put conditions on how data can be inserted and deleted - Two big ones are primary key restraints and foreign key restraints"));
        flashcards.put(84, new Flashcard("What is a field constraint?", "A field constraint is placed on a column in an RDBMS to control what information can be put into that column"));
        flashcards.put(85, new Flashcard("I have an Order Table and a child OrderDetail table.  What must I do to delete an order from the Order Table?", "You must delete the information from the child table first because of primary and foreign key constraints"));
        flashcards.put(86, new Flashcard("What is a connection string?", "A connection string opens a connection from a java program to an outside source - includes the information you need to conncet like username, password, authentication"));
        flashcards.put(87, new Flashcard("When would you use jdbcTemplate.queryForObject vs  jdbcTemplate.queryForRowSet", "Getting one piece of data back as opposed to a whole row set that would be stored in an object"));
        flashcards.put(88, new Flashcard("What is a JDBC driver and what does it do?", "Java Database Connectivity driver that connects a java program to a database"));
        flashcards.put(89, new Flashcard("When do we use a Request object vs a Response object?", "A request object is retrieving information from a database and a response object is what is being returned from a database"));
        flashcards.put(90, new Flashcard("What is serialize and deserialize an object?", "Serializing an object is turning in object into a string and a deserializing is converting that JSON or string back into an object"));
        flashcards.put(91, new Flashcard("What's a query string in the URL?", "contains key value pairs - search expressions"));
        flashcards.put(92, new Flashcard("What is a path variable?", "a path variable is just one variable that is inserted into the url"));
        flashcards.put(93, new Flashcard("What is CRUD and what is the HTTP Method equivalents?", "POST, GET, PUT, DELETE"));
        flashcards.put(94, new Flashcard("What is Authorization and Authentication?", "Authentication verifies the identity of the user and authorization determines their access to the information"));
        flashcards.put(95, new Flashcard("What does 401 Unauthorized and 403 Forbidden mean?", "401 - means the request was not completed because there was not proper authenticaion for the user, 403 - means the request was not completed beause the user is not authorized to view that information"));
        flashcards.put(96, new Flashcard("What do I use to determine the user's identity in Java WEB API code?", "You would use a JWT token that is returned to to the user when they sign into your account"));
        flashcards.put(97, new Flashcard("What is the Principal?", "Principal is the current user of a program that is authenticated by the program"));
        flashcards.put(98, new Flashcard("What is the difference between a block, inline, and inline-block element?", "Block extends the length of the entire page on its own line, inline can be inserted into a line like a span object and only take up the amount of space needed, an inline-block element allows you to set block elements side by side and still set width and height of the element"));
        flashcards.put(99, new Flashcard("What is Grid?", "Grid provides the ability to split up an HTML page into rows and columns and then assign elements of that page into the \"grid\" that's created"));
        flashcards.put(100, new Flashcard("What is the fr unit in Grid?", "The unit represents a fraction of the available space in the Grid container"));
        flashcards.put(101, new Flashcard("What is the Gap property?", "Adds space between cells of the grid in CSS"));
        flashcards.put(102, new Flashcard("What is vh and vw in CSS?", "vh is relative to 1% of height of the viewport and vw is relative to 1% of the width of the viewport"));
        flashcards.put(103, new Flashcard("What needs to be addressed for a responsive design?", "Flexible or fluid grid layouts, resizeable images, and CSS media queries"));
        flashcards.put(104, new Flashcard("What is a media query?", "A special CSS rule that only applies when your viewport reaches a certain breakpoint - common query is for width of screen"));
        flashcards.put(105, new Flashcard("What is a viewport?", "The area of your web browser where you see content."));
        flashcards.put(106, new Flashcard("What is version control?", "A program tracking changes to a software program, like github or gitlab"));
        flashcards.put(107, new Flashcard("What is an IDE?", "Integrated Development Environment - example is IntelliJ - typically include a code editor, a compiler or interpreter, and debugger accessible through a GUI"));
        flashcards.put(108, new Flashcard("Name some methods you can perform on Strings", "length(), substring(), contains(), startsWith(), endsWith(), indexOf(), replace(), equalsIgnoresCase(), split(), String.join(), toLowerCase(), toUpperCase()"));
        flashcards.put(109, new Flashcard("What is BigDecimal and what is it used for? What issue does it solve?", "BigDecimal is a precision decimal - It's used to avoid rounding and precision errors that you can get by just using the type double - Used when performing functions on money"));
        flashcards.put(110, new Flashcard("What is a tree?", "A non-linear data structure that is used to represent hierarchical data - data is stored in a structure called a node"));
        flashcards.put(111, new Flashcard("Can an ArrayList hold primitive types? Can an array hold objects?", "No - Yes"));
        flashcards.put(112, new Flashcard("What is a derived property?", "It's a property that is generated based on other property values in your class"));
        flashcards.put(113, new Flashcard("What are the access modifiers and what do they do?", "Restrict the scope of a class, constructor, variable, method, or data member - Default (not specified and means it's only accessible within the package), Protected (Available in package and sub classes), Private (only within the same class), Public (Accessible from everywhere in the program)"));
        flashcards.put(114, new Flashcard("What is a magic number? Should you use them?", "A unique number that has specific meaning in your code - you should make them constants for clarity and readability - example '24' as '24 hours in a day'"));
        flashcards.put(115, new Flashcard("What is the DRY principle? What WET principle?", "Don't Repeat Yourself - if you're rewriting code, refactor into a method that you can call to simplify ; Write Everything Twice - writing something twice is probably fine - avoid refactoring so much you actually make your code more complex"));
        flashcards.put(116, new Flashcard("What is casting?", "Widening casting happens automatically (example: from an integer to a double) but narrowing casting must be explicitly stated in case you are losing precision and data"));
        flashcards.put(117, new Flashcard("What is Abstraction and why is it used?", "Hiding the complexity of code from the user - it's done so you can add more complexity on top of that without having to worry about how the underlying code works"));
        flashcards.put(118, new Flashcard("What is Agile software development?", "Calls for collaborative cross-functional teams often working in small 'sprints' rather than separate teams finishing their section and 'thorwing it over the wall' to the next team"));
        flashcards.put(119, new Flashcard("What is JUnit?", "Software testing framework in Java - write and execute automated tests for your Java program"));
        flashcards.put(120, new Flashcard("What is a stacktrace?", "Line of breadcrumbs that can be used to debug a program - list of method calls that the application was in the middle of when an Exception was thrown"));
        flashcards.put(121, new Flashcard("Walk through the steps of reading a file", "Get file path, create file object, pass into a new Scanner object to open the connection, while data.hasNextLine() you can work with each line of code"));
        flashcards.put(122, new Flashcard("Walk through the steps of writing to a file", "Create a new PrintWriter with the file object you created, print the message, flush and close the file ; you can append by using the keyword .append()"));
        flashcards.put(123, new Flashcard("What are the steps of database design", "Data modeling (precisely defining your data), Logical Design (creating a design), Physical Design (adjusting design to meet requirements related to performance), Physical Implementation (creating all the tables and supporting objects)"));
        flashcards.put(124, new Flashcard("How do you set up a JdbcTemplate to access a database?", "Need a data source - create a BasicDataSource = set the url, username, password for access - instantiate a new jdbctemplate with that datasource"));
        flashcards.put(125, new Flashcard("Can you overload your main method?", "Yes you can by calling different arguments into the main method"));
        flashcards.put(126, new Flashcard("What do the String args[] in the main method do?", "They allow you to pass in arguments from the command line"));
        flashcards.put(127, new Flashcard("What is a UNION in SQL?", "Combines the result set of two or more SELECT statements - only distinct elements - use UNION ALL for duplicate values"));
        flashcards.put(128, new Flashcard("What is data integrity?", "The overall accuracy, completeness, and consistency of data - ACID principle - data is complete, accurate, and reliable no matter how long it is stored or how often it is accessed"));
        flashcards.put(129, new Flashcard("What is a URI?", "Uniform Resource Identifier - character sequence that distinguishes one resource from another - a URL is a type of URI"));
        flashcards.put(130, new Flashcard("What is FlexBox and how does it work?", "Flexible box model - it dynamically handles alignment and spacing between between page items"));
        flashcards.put(131, new Flashcard("When would you use grid vs flexbox?", "If you're organizing a display on with both rows and columns (two dimensional) use Grid - If you're working with layout, Grid is best - If you're adjusting content within your layout, use flexbox"));
        flashcards.put(132, new Flashcard("What is big0 notation?", "Relates to time complexity for your program - refers to how long an algorithm takes to run - constant time = 0(1) - linear time = 0(N) - quadratic time = 0(N^2)"));
        flashcards.put(133, new Flashcard("What is a binary search?", "You half the data you're searching every time. Faster way to search big data sets"));
        flashcards.put(134, new Flashcard("What role does HTML, CSS, and JavaScript provide in the browser?", "HTML provides the content and basic structure, CSS makes it prettier and orients stuff on the page, JavaScript makes your page interactive"));
        flashcards.put(135, new Flashcard("What is Javascript?", "Javascript is a general purpose language intended to make HTML more dynamic"));
        flashcards.put(136, new Flashcard("What is IoT?", "Stands for Internet of Things - Describes the network of physical objects that are connected to the internet"));
        flashcards.put(137, new Flashcard("What is a loosely typed language vs a strongly typed language?", "A language that does not required a variable to be defined - like JavaScript - Java is a strongly typed language"));
        flashcards.put(138, new Flashcard("What is an object in JavaScript?", "A collection of key-value pairs - do not have to call a class or constructor"));
        flashcards.put(139, new Flashcard("Describe null vs undefined in Javascript", "Undefined is assigned to variables that have been declared but not assigned a value - Null represents the intentional absence of any object value"));
        flashcards.put(140, new Flashcard("What is shadowing in JavaScript?", "Variables can have the same name in a different scope : The inner variable will 'shadow' the outer variable"));
        flashcards.put(141, new Flashcard("Describe a web browser vs web server", "A web browser is an application software that is used to browse and display web pages to a user - A web server is a software hosted on a dedicated computer that provides these documents when requested by a web browser"));
        flashcards.put(142, new Flashcard("What is Emmet?", "It's a plugin for popular text editors where you can use abbreviations and short expressions to quickly build code"));
        flashcards.put(143, new Flashcard("What is JSDoc?", "Mark-up language to annotate JavaScript source code files - detected by your development environment and create documentation"));
        flashcards.put(145, new Flashcard("What is DOM?", "Document Object Model - browser's internal representation of the structure of the current web page - It provides a way to access and manipulate the structure, style, and content once loaded - represents the document as nodes and objects (tree)"));
        flashcards.put(146, new Flashcard("What is DOM manipulation?", "Writing code to change and select information on the DOM using Javascript"));
        flashcards.put(147, new Flashcard("What is Vanilla JavaScript?", "Javascript that doesn't rely on any outside utility libraries to do things that you can do with functions and objects defined in the ECMAScript specification"));
        flashcards.put(148, new Flashcard("What is a Node List?", "In Javascript, it is an object list (collection) of nodes extracted from a document"));
        flashcards.put(149, new Flashcard("What is the publish and subscribe model?", "Pub-sub is a programmatic way to pass messages between different parts of a system while keeping those parts decoupled from each other - publish means trigger an event and subscribe means and subscribe means listening to en event (Javascript)"));
        flashcards.put(150, new Flashcard("What is event propogation?", "If an event is triggered in an element in HTML, the event also rises to the top and looks for any listeners for the event in all the parent elements - you can stop this with stopPropagation()"));
        flashcards.put(151, new Flashcard("What is a component in Vue?", "Functional unit containing HTML, CSS, and JavaScript - You can build and test components in isolation and assemble them into a cohesive application"));
        flashcards.put(152, new Flashcard("What advantage does component-based design in webpages provide?", "Encapsulation (work on the component without understanding the complexity of the entire application) - Reusability - Single-responsibility (limited scope makes it easier to debug and maintain)"));
        flashcards.put(153, new Flashcard("What is Data Binding?", "Connects data in a component to a specified portion of HTML - Whenever the data changes, elements bound to that data automatically reflect the change"));
        flashcards.put(154, new Flashcard("What is a mustache tag?", "Double curly braces - Example: used when rendering data properties from a component's HTML"));
        flashcards.put(155, new Flashcard("What is Vue?", "Open source JavaScript framework for building web applications - often used to build single page applications - Similar to Angular and React"));
        flashcards.put(156, new Flashcard("What is Babel?", "A JavaScript compiler that allows you to run newer JavaScript versions in all web browsers"));
        flashcards.put(157, new Flashcard("What is the DNS?", "Domain Name System - A DNS is a server that translates domain names into IP addresses"));
        flashcards.put(158, new Flashcard("What is the difference between HTTP and HTTPS?", "HTTPS uses encryption so it's much more secure - Uses TLS (Transportation Layer Protection) - public key (asymmetric) encryption"));
        flashcards.put(159, new Flashcard("Describe how encryption works", "Scrambling data so it is unreadable without a cryptographic key - There is symmetric encryption where all communicating parties use the same key and asymmetric where there is a public key for encryption but only one private key for decryption"));


        System.out.println("\n=============================================================================================");
        System.out.println("======================================= Welcome to ==========================================\n");
        delay(250);
        System.out.println("/$$$$$$$$ /$$                     /$$                                           /$$");
        delay(250);
        System.out.println("| $$_____/| $$                    | $$                                          | $$");
        delay(250);
        System.out.println("| $$      | $$  /$$$$$$   /$$$$$$$| $$$$$$$   /$$$$$$$  /$$$$$$   /$$$$$$   /$$$$$$$  /$$$$$$$");
        delay(250);
        System.out.println("| $$$$$   | $$ |____  $$ /$$_____/| $$__  $$ /$$_____/ |____  $$ /$$__  $$ /$$__  $$ /$$_____/");
        delay(250);
        System.out.println("| $$__/   | $$  /$$$$$$$|  $$$$$$ | $$  \\ $$| $$        /$$$$$$$| $$  \\__/| $$  | $$|  $$$$$$ ");
        delay(250);
        System.out.println("| $$      | $$ /$$__  $$ \\____  $$| $$  | $$| $$       /$$__  $$| $$      | $$  | $$ \\____  $$");
        delay(250);
        System.out.println("| $$      | $$|  $$$$$$$ /$$$$$$$/| $$  | $$|  $$$$$$$|  $$$$$$$| $$      |  $$$$$$$ /$$$$$$$/");
        delay(250);
        System.out.println("|__/      |__/ \\_______/|_______/ |__/  |__/ \\_______/ \\_______/|__/       \\_______/|_______/");
        delay(250);

        Scanner userInput = new Scanner(System.in);
        boolean running = true;

        System.out.print("\nPress enter to start learning! >>> ");
        userInput.nextLine();

        Random random = new Random();

        while (running) {
            int randomKey = random.nextInt(flashcards.size());

            printQuestion(randomKey);

            System.out.print("\nPress enter to continue >>> ");
            userInput.nextLine();

            printAnswer(randomKey);

            System.out.print("\nPress enter to continue or 0 to exit >>> ");
            running = userInput.nextLine().equals("0") ? false : true;
        }
    }

    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void printQuestion(int key) {
        System.out.println("\n" + flashcards.get(key).getQuestion());
    }

    public static void printAnswer(int key) {
        System.out.println("\n" + flashcards.get(key).getAnswer());
    }
}