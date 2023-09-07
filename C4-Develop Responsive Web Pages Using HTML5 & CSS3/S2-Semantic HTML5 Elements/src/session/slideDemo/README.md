## Sprint 2: Structure a Web page Using Semantic and HTML5 Elements

### This sprint has 4 demos 

[**Demo 1: Difference Between Sematic and Non-semantic Elements**](demo-1-semantic-and-non-semantic-elements)

#### Problem Statement
Use chrome vox screen reader tool to demonstrate the demo.​ Install screen reader chrome extension first and then execute.​

1. Non-semantic and Semantic Headers 
- Though the page looks similar, when a screen reader reads the page, headers are identified and read as headers, unlike the one where div is used in a non-semantic example. ​
- The demo code is used with CSS to get the same style, which will be covered in the coming sprints.​
2. Non-semantic Links and Semantic Links
- Look at how navigation links are properly identified by a screen reader in the semantic example, compared to the non-semantic example where a div is used to combine all the links.​
3. Buttons and Links
- Another common anti-pattern is to treat links as buttons by attaching JavaScript behavior to them.​`<a href="#" onclick="//perform some action">`​
- Both buttons and links support some form of synthetic click activation. So, which one should you choose?​
- If clicking on the element will perform an action on the page, use `<button>`.​
- If clicking on the element will navigate the user to a new page, then use `<a>`.​
- The reason for this is that buttons and links are announced differently by screen readers. Using the correct element helps screen reader users know which outcome to expect. 
4. Button and Div
- Built-in accessibility features are available while using `<button>` tags. We can use our button with a keyboard, finger, voice command, or other assistive technology. While using `<div>` tags, additional coding like tabIndex attribute should be added to access via keyboard.
- Div element are made to behave like buttons when clicking it by adding JavaScript code. But all the built-in accessibility features available for button is not available to div elements. Unlike button, when keyboard is used to navigate to div element using "Tab" key and pressing "Enter", the action event is not occurring and hence the text is not changing.


[**Demo 2: Popular Semantic Elements**](demo-2-popular-semantic-elements)

#### Problem Statement

- Demonstrate the use of commonly used HTML5 semantic tags like header, nav, main, article, section, details, aside, footer, small, time in the web page.

[**Demo 3: Tables**](demo-3-tables)

#### Problem Statement

- Create a simple table using table, thead, tr and td tags.

[**Demo 4: Aria Attributes**](demo-4-aria-attributes)

#### Problem Statement

- Use screen reader to execute this demo.
1. Aria Attribute Close Button:
- On a page, a link displays a pop-up box (a div) with additional information. The 'close' element is implemented as a button containing merely the letter 'x'. The property aria-label="close" is used to provide an accessible name to the button.
2. Aria Attributes Search:
- The search role is used to identify the search functionality.
- Use "search" role for a search form instead of "form" role.
- If there is more than one search landmark role in a document, provide a label for each landmark. This label will allow an assistive technology user to be able to quickly understand the purpose of each landmark.