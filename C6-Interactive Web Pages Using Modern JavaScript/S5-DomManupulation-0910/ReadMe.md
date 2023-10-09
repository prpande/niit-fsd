<!-- omit in toc -->
# Developing interactive Web Pages using DOM and DOM events 09/10

[Live DOM Viewer](https://software.hixie.ch/utilities/js/live-dom-viewer/)

<!-- omit in toc -->
# Contents

- [What is the DOM?](#what-is-the-dom)
- [Accessing DOM Elements](#accessing-dom-elements)
- [Manipulating DOM Elements](#manipulating-dom-elements)
- [Accessing \& Changing Element Styles](#accessing--changing-element-styles)
  - [Computed Styles](#computed-styles)
  - [Adding or Removing CSS Classes](#adding-or-removing-css-classes)
  - [Toggle Classes](#toggle-classes)
  - [Inline Styles vs. CSS Classes](#inline-styles-vs-css-classes)
- [Creating and Appending Elements](#creating-and-appending-elements)
- [DOM Events \& handling them](#dom-events--handling-them)
  - [Event Types](#event-types)
    - [Example: Mouse Event](#example-mouse-event)
  - [Event Handling Techniques](#event-handling-techniques)
    - [Event Object](#event-object)
  - [Event Bubbling and Capturing](#event-bubbling-and-capturing)
  - [Event Delegation](#event-delegation)
  - [Removing Event Listeners](#removing-event-listeners)
- [Traversing the DOM](#traversing-the-dom)
  - [Example : Basic DOM Structure](#example--basic-dom-structure)
  - [Accessing Parent Elements](#accessing-parent-elements)
  - [Accessing Child Elements](#accessing-child-elements)
  - [Traversing Siblings](#traversing-siblings)
  - [Finding Descendants](#finding-descendants)
  - [Navigating to Ancestors](#navigating-to-ancestors)
- [Removing Elements](#removing-elements)
- [Form Validations with HTML5 and JavaScript](#form-validations-with-html5-and-javascript)
  - [Example : Basic HTML5 Form Validation](#example--basic-html5-form-validation)
  - [Built-in Input Types](#built-in-input-types)
  - [Constraint Validation API](#constraint-validation-api)
  - [Custom Validation with JavaScript](#custom-validation-with-javascript)
  - [Real-time Feedback](#real-time-feedback)
  - [Automatic Form Submission](#automatic-form-submission)
    - [Example : Preventing Form Submission](#example--preventing-form-submission)

## What is the DOM?

The DOM is a programming interface for web documents. It represents the page so that programs can change the document structure, style, and content dynamically. The DOM represents the document as a tree of nodes, where each node corresponds to a part of the page, such as elements, attributes, and text.

Here's a basic structure of the DOM tree:

```html
<!DOCTYPE html>
<html>
  <head>
    <title>Sample DOM</title>
  </head>
  <body>
    <h1>Hello, DOM!</h1>
    <p>This is a paragraph.</p>
  </body>
</html>
```

In this example, the DOM tree consists of nodes representing the HTML document's structure.

## Accessing DOM Elements

JavaScript provides several methods to access DOM elements. The most common methods include `getElementById`, `getElementsByClassName`, `getElementsByTagName`, and `querySelector`.

```javascript
// Access an element by its ID
const heading = document.getElementById("myHeading");

// Access elements by class name
const paragraphs = document.getElementsByClassName("myParagraph");

// Access elements by tag name
const links = document.getElementsByTagName("a");

// Access elements using CSS selectors
const firstParagraph = document.querySelector(".myParagraph");
```

## Manipulating DOM Elements

Once you've accessed DOM elements, you can manipulate them by changing their content, attributes, or styles.

```javascript
// Change the text content of an element
heading.textContent = "New Heading";

// Change an element's HTML content
paragraphs[0].innerHTML = "Updated paragraph content";

// Modify element attributes
const link = document.querySelector("a");
link.setAttribute("href", "https://example.com");

// Change CSS styles
paragraphs[1].style.color = "red";
```

## Accessing & Changing Element Styles

You can access an element's style properties through its `style` object. The style object contains properties corresponding to CSS attributes like `color`, `fontSize`, `backgroundColor`, and many more.

```javascript
// Access the style object of an element
const element = document.getElementById("myElement");

// Access and read a specific style property
const color = element.style.color;
const fontSize = element.style.fontSize;
```

```javascript
// Change the color of an element
element.style.color = "blue";

// Change the font size
element.style.fontSize = "18px";
```

### Computed Styles

Sometimes, you need to access computed styles, which take into account both inline styles and styles inherited from CSS rules. You can use the `getComputedStyle` method for this purpose.

```javascript
// Get the computed style of an element
const computedStyle = getComputedStyle(element);

// Access specific computed style properties
const computedColor = computedStyle.color;
const computedFontSize = computedStyle.fontSize;
```

### Adding or Removing CSS Classes

You can also manipulate element styles by adding or removing CSS classes. This is often a more efficient way to change styles in response to user interactions.

```javascript
// Add a CSS class to an element
element.classList.add("highlight");

// Remove a CSS class from an element
element.classList.remove("highlight");
```

### Toggle Classes

Toggling classes is useful for implementing interactive features that change an element's style with a click or other events.

```javascript
// Toggle a CSS class on an element
element.classList.toggle("active");
```

### Inline Styles vs. CSS Classes

When working with styles in JavaScript, consider the trade-off between inline styles and CSS classes. Inline styles can be modified directly, but they might override CSS rules. CSS classes provide a more structured approach and better separation of concerns.

## Creating and Appending Elements

You can create new DOM elements and add them to the document using JavaScript.

```javascript
// Create a new paragraph element
const newParagraph = document.createElement("p");
newParagraph.textContent = "This is a new paragraph.";

// Append the new paragraph to the document
document.body.appendChild(newParagraph);
```

## DOM Events & handling them

DOM events represent interactions or occurrences within the browser window. Common events include clicks, keypresses, mouse movements, form submissions, and more. Events can be generated by the user, the browser, or scripts.

```javascript
// Add a click event handler to a button element
const button = document.getElementById("myButton");
button.addEventListener("click", function() {
  alert("Button clicked!");
});
```

In this example, we add a click event handler to a button element. When the button is clicked, the event handler displays an alert.

### Event Types

DOM events are categorized into different types, such as **UI events**, **Mouse events**, **Keyboard events**, and **Form events**. Understanding the type of event you're dealing with is essential for proper event handling.

#### Example: Mouse Event

```javascript
// Add a mouseover event handler to an element
const element = document.getElementById("myElement");
element.addEventListener("mouseover", function() {
  element.style.backgroundColor = "lightblue";
});
```

Here, we change the background color of an element when the mouse hovers over it, utilizing a mouseover event.

### Event Handling Techniques

#### Event Object

When an event occurs, an **event object** is created, containing information about the event. This object can be accessed in the event handler function.

```javascript
// Access event properties in an event handler
element.addEventListener("click", function(event) {
  console.log(`Clicked at (${event.clientX}, ${event.clientY})`);
});
```

Here, we use the `event` object to access the mouse coordinates when a click event happens.

### Event Bubbling and Capturing

DOM events follow a propagation order known as **event bubbling**. The event starts from the target element and bubbles up the DOM tree. You can control whether the event is captured during the **capture phase** or bubbled during the **bubbling phase**.

```javascript
// Add a click event handler in capturing phase
element.addEventListener("click", function() {
  console.log("Capturing phase");
}, true);

// Add a click event handler in bubbling phase
element.addEventListener("click", function() {
  console.log("Bubbling phase");
});
```

This code adds two click event handlers to an element, one in the capturing phase and one in the bubbling phase. The order in which they're executed depends on the event propagation phase.

### Event Delegation

**Event delegation** is a powerful technique that allows you to handle events for multiple elements with a single event handler. It relies on event propagation and the `target` property of the event object.

```javascript
// Use event delegation to handle clicks on a list
const list = document.getElementById("myList");
list.addEventListener("click", function(event) {
  if (event.target.tagName === "LI") {
    event.target.style.textDecoration = "line-through";
  }
});
```

Here, we use event delegation to handle clicks on list items. When a list item is clicked, the event bubbles up to the list, and we check if the target element is an `<li>`. If so, we apply a line-through style.

### Removing Event Listeners

You can remove event listeners when they are no longer needed to prevent memory leaks.

```javascript
// Add a click event listener
function clickHandler() {
  console.log("Button clicked!");
}

button.addEventListener("click", clickHandler);

// Remove the event listener
button.removeEventListener("click", clickHandler);
```

In this example, we add and then remove a click event listener from a button element.

## Traversing the DOM

The DOM represents the structure of an HTML document as a tree-like structure, with each HTML element as a node in the tree. Traversing the DOM means moving between these nodes to access and manipulate the content, attributes, and styles of elements.

### Example : Basic DOM Structure

```html
<!DOCTYPE html>
<html>
  <head>
    <title>DOM Traversal</title>
  </head>
  <body>
    <div id="container">
      <h1>Main Heading</h1>
      <p>Paragraph 1</p>
      <p>Paragraph 2</p>
    </div>
  </body>
</html>
```

In this example, the DOM tree contains various elements, such as `<div>`, `<h1>`, and `<p>`, forming a hierarchical structure.

### Accessing Parent Elements

You can access the parent element of an HTML element using the `parentNode` property.

```javascript
// Access the parent of a <p> element
const paragraph = document.querySelector('p');
const parentDiv = paragraph.parentNode;
```

In this example, `parentDiv` will contain the `<div>` element that wraps the paragraph.

### Accessing Child Elements

To access child elements of a parent node, you can use methods like `childNodes` or `children`.

```javascript
// Access child nodes of an element
const container = document.getElementById('container');
const childNodes = container.childNodes; // Includes text nodes

// Access child elements (excluding text nodes)
const children = container.children;
```

The `childNodes` method returns all child nodes, including text nodes, while `children` returns only the child elements.

### Traversing Siblings

You can traverse sibling elements, which are elements that share the same parent, using properties like `previousSibling`, `nextSibling`, `previousElementSibling`, and `nextElementSibling`.

```javascript
// Access previous and next sibling elements
const paragraph = document.querySelector('p');
const previousParagraph = paragraph.previousElementSibling;
const nextParagraph = paragraph.nextElementSibling;
```

Here, `previousParagraph` and `nextParagraph` will contain the previous and next `<p>` elements, respectively.

### Finding Descendants

To access descendants, which are elements nested within a parent element, you can use methods like `querySelector` and `querySelectorAll`.

```javascript
// Find all <p> elements within the <div>
const div = document.getElementById('container');
const paragraphs = div.querySelectorAll('p');
```

In this example, `paragraphs` will contain all the `<p>` elements within the `<div>`.

### Navigating to Ancestors

To navigate up the DOM tree to ancestors or parent elements, you can use the `closest` method.

```javascript
// Find the closest ancestor with a specific class
const paragraph = document.querySelector('p');
const ancestor = paragraph.closest('.container');
```

In this code, `ancestor` will contain the closest ancestor of the `<p>` element with the class `container`.

## Removing Elements

You can remove elements from the DOM using the `remove` method.

```javascript
// Remove an element from the DOM
const elementToRemove = document.getElementById("elementToRemove");
elementToRemove.remove();
```

## Form Validations with HTML5 and JavaScript

Form validations are a crucial aspect of web development. They ensure that data submitted by users meets certain criteria, improving the user experience and data integrity. HTML5 introduced built-in validation features that can be enhanced and customized using JavaScript.
HTML5 brought significant improvements to form validation by introducing new input types, attributes, and properties. These built-in features make it easier to validate form data without the need for extensive JavaScript code.

### Example : Basic HTML5 Form Validation

```html
<form>
  <label for="email">Email:</label>
  <input type="email" id="email" required>
  <button type="submit">Submit</button>
</form>
```

In this example, the `type="email"` attribute specifies that the input field should accept email addresses. The `required` attribute indicates that the field must be filled out before the form can be submitted.

### Built-in Input Types

HTML5 provides various input types that come with built-in validation rules, including `email`, `url`, `number`, `date`, and more. These types help ensure that the entered data is in the correct format.


```html
<label for="url">Website URL:</label>
<input type="url" id="url" required>

<label for="age">Age:</label>
<input type="number" id="age" min="18" max="100" required>
```

In this example, the `type="url"` input enforces URL format, and the `type="number"` input restricts values to be between 18 and 100.

### Constraint Validation API

HTML5 also introduced the **Constraint Validation API**, which allows you to access and manipulate form validation properties and methods via JavaScript. You can check the validity of form elements and provide custom error messages.

```javascript
const emailInput = document.getElementById('email');

// Check if the email input is valid
if (emailInput.validity.valid) {
  // The email is valid
} else {
  // Display a custom error message
  emailInput.setCustomValidity('Please enter a valid email address.');
}
```

In this code, we check the validity of the email input and set a custom error message if it's invalid.

### Custom Validation with JavaScript

While HTML5's built-in validation is powerful, there are cases where custom validation rules are needed. JavaScript can be used to extend and enhance form validation.

```javascript
const passwordInput = document.getElementById('password');

passwordInput.addEventListener('input', function() {
  const password = passwordInput.value;
  const minLength = 8;

  if (password.length < minLength) {
    passwordInput.setCustomValidity('Password must be at least 8 characters long.');
  } else {
    passwordInput.setCustomValidity('');
  }
});
```

In this example, we use JavaScript to add an event listener that checks if the password input meets a minimum length requirement and sets a custom error message accordingly.

### Real-time Feedback

Providing real-time feedback to users during form validation improves the user experience. You can use JavaScript to dynamically update error messages or display checkmarks when input is valid.

```javascript
const confirmPasswordInput = document.getElementById('confirm-password');
const passwordInput = document.getElementById('password');
const confirmationMessage = document.getElementById('confirmation-message');

confirmPasswordInput.addEventListener('input', function() {
  const confirmPassword = confirmPasswordInput.value;
  const password = passwordInput.value;

  if (confirmPassword === password) {
    confirmationMessage.textContent = 'Passwords match!';
  } else {
    confirmationMessage.textContent = 'Passwords do not match.';
  }
});
```

In this code, we provide real-time feedback on password confirmation by comparing the values of two input fields.

### Automatic Form Submission

HTML5 and JavaScript allow you to control form submission based on validation results. You can prevent form submission if validation fails and display error messages to users.

#### Example : Preventing Form Submission

```javascript
const form = document.querySelector('form');

form.addEventListener('submit', function(event) {
  if (!form.checkValidity()) {
    event.preventDefault(); // Prevent form submission
    // Display error messages or take other actions
  }
});
```

In this example, we use the `checkValidity()` method to determine if the form is valid before allowing submission.
