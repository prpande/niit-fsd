<!-- omit in toc -->
# CSS Floats - 11/09

<!-- omit in toc -->
## Contents

- [Normal Document Flow](#normal-document-flow)
- [CSS Floats](#css-floats)
  - [Basic Syntax](#basic-syntax)
  - [Examples of CSS Floats](#examples-of-css-floats)
    - [1. Creating a Simple Two-Column Layout](#1-creating-a-simple-two-column-layout)
    - [2. Creating Text Wraps Around an Image](#2-creating-text-wraps-around-an-image)
  - [Advantages of CSS Floats](#advantages-of-css-floats)
  - [Limitations of CSS Floats](#limitations-of-css-floats)
  - [Clearing floats](#clearing-floats)
    - [Understanding the Problem](#understanding-the-problem)
    - [Clearing Floats Using the `clear` Property](#clearing-floats-using-the-clear-property)
    - [Using the `::after` Pseudo-Element for Clearing](#using-the-after-pseudo-element-for-clearing)
    - [Clearing Floats Using `display: flow-root;` ***(Best way)***](#clearing-floats-using-display-flow-root-best-way)
    - [Benefits of Using `display: flow-root;`](#benefits-of-using-display-flow-root)
- [CSS Positioning](#css-positioning)
  - [`position` Property](#position-property)
  - [Examples of CSS Positioning](#examples-of-css-positioning)
    - [1. Basic Relative Positioning](#1-basic-relative-positioning)
    - [2. Absolute Positioning within a Relative Container](#2-absolute-positioning-within-a-relative-container)
    - [3. Fixed Positioning](#3-fixed-positioning)
    - [4. Sticky Positioning](#4-sticky-positioning)
- [`z-index` and Stack Order](#z-index-and-stack-order)
  - [Basic Syntax of `z-index`](#basic-syntax-of-z-index)
  - [Understanding Stack Order](#understanding-stack-order)
  - [Examples of `z-index` and Stack Order](#examples-of-z-index-and-stack-order)
    - [1. Basic Stacking with `z-index`](#1-basic-stacking-with-z-index)
    - [2. Stacking Contexts with `transform`](#2-stacking-contexts-with-transform)
    - [3. Stacking Order with `position`](#3-stacking-order-with-position)
- [`overflow` property](#overflow-property)
  - [Basic Syntax for `overflow`](#basic-syntax-for-overflow)
  - [Examples of "overflow"](#examples-of-overflow)
    - [1. Clipping Overflowing Content](#1-clipping-overflowing-content)
    - [2. Adding Scrollbars for Overflowing Content](#2-adding-scrollbars-for-overflowing-content)
    - [3. Automatically Adding Scrollbars as Needed](#3-automatically-adding-scrollbars-as-needed)
- [`table` layout](#table-layout)
  - [Basic Syntax of `table` layout](#basic-syntax-of-table-layout)
  - [Examples of CSS Table Layout](#examples-of-css-table-layout)
    - [1. Creating a Simple Table](#1-creating-a-simple-table)
    - [2. Creating a Table-Like Form](#2-creating-a-table-like-form)

## Normal Document Flow

- Refers to how elements are displayed and laid out on a web page by default, without any explicit positioning or styling
- In default flow, elements appear on the page in the order they are written in the HTML document, from top to bottom, and from left to right

Consider the following HTML structure:

```html
<!DOCTYPE html>
<html>
<head>
    <title>Normal Document Flow Example</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <header>
        <h1>Welcome to My Website</h1>
        <nav>
            <ul>
                <li><a href="#">Home</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Services</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        </nav>
    </header>
    <main>
        <section>
            <h2>About Us</h2>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
        </section>
        <section>
            <h2>Our Services</h2>
            <ul>
                <li>Service 1</li>
                <li>Service 2</li>
                <li>Service 3</li>
            </ul>
        </section>
    </main>
    <footer>
        <p>&copy; 2023 My Website</p>
    </footer>
</body>
</html>
```

In this example:

- The HTML elements are structured hierarchically, with a `<header>`, `<main>`, and `<footer>` within the `<body>` element.

- Elements are placed one after the other in the order they appear in the HTML document.

- Text and block-level elements (such as `<h1>`, `<p>`, `<ul>`, and `<li>`) naturally flow from left to right and top to bottom within their respective containers.

- There is no explicit positioning or styling applied to any of the elements, so they appear one below the other in the default flow.

Now, let's consider a simple CSS stylesheet (styles.css) that applies some basic styling without disrupting the normal document flow:

```css
/* Apply basic styles to header and footer */
header, footer {
    background-color: #333;
    color: #fff;
    text-align: center;
    padding: 10px;
}

/* Style the navigation menu */
nav ul {
    list-style: none;
    padding: 0;
}

nav li {
    display: inline;
    margin-right: 10px;
}

/* Style main content sections */
main {
    margin: 20px;
}

section {
    background-color: #f5f5f5;
    padding: 20px;
    margin-bottom: 20px;
}
```

In this CSS example, we've added some basic styling to the header, footer, navigation menu, and main content sections. However, none of these styles disrupt the natural order of elements in the normal document flow. The elements still appear in the same order as in the HTML document, with headers at the top, main content in the middle, and the footer at the bottom.

## CSS Floats

- `float` property in CSS is used to control the alignment of an element within its containing element
- When an element is floated, it is removed from the normal document flow and positioned to the left or right of its containing element, allowing other content to flow around it
- <https://developer.mozilla.org/en-US/docs/Learn/CSS/CSS_layout/Floats#using_overflow>

### Basic Syntax

```css
.selector {
    float: position; /* left, right, none (default) */
}
```

- `position`: Specifies the direction in which the element should float, which can be `left`, `right`, or `none` (the default).

### Examples of CSS Floats

#### 1. Creating a Simple Two-Column Layout

```html
<div class="left-column">Left Column</div>
<div class="right-column">Right Column</div>
```

```css
.left-column {
    float: left;
    width: 50%;
}

.right-column {
    float: left;
    width: 50%;
}
```

In this example:

- Both columns are floated to the left, making them appear side by side.
- The `width` property ensures that each column takes up 50% of the container's width.

#### 2. Creating Text Wraps Around an Image

```html
<img src="image.jpg" alt="Floating Image" class="float-left">
<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit...</p>
```

```css
.float-left {
    float: left;
    margin-right: 10px; /* Adds spacing between the image and text */
}
```

In this example:

- The `float-left` class floats the image to the left, allowing text to wrap around it.
- The `margin-right` property adds some spacing between the image and the text.

### Advantages of CSS Floats

1. **Simplicity**: CSS floats are relatively easy to understand and implement, making them accessible for beginners.

2. **Text Wrapping**: They are effective for creating text wraps around images or other floated elements.

3. **Responsive Design**: Floats can be used to create responsive layouts, where content flows gracefully on different screen sizes.

### Limitations of CSS Floats

1. **Complex Layouts**: Floats can be challenging to work with when creating complex layouts, especially those with multiple columns and nested elements.

2. **Clearing Floats**: Handling the clearing of floats and avoiding layout issues can be cumbersome.

3. **Overlap**: Overlapping elements can occur if floats are not managed correctly.

### Clearing floats

- Common technique used in HTML and CSS to ensure that elements are properly contained within their parent containers, especially when working with floated elements
- When you float an element, it is taken out of the normal document flow, which can sometimes lead to layout issues
- Way to prevent these issues and ensure that the parent container expands to accommodate the floated elements

#### Understanding the Problem

Consider a scenario where you have two floated elements inside a container:

```html
<div class="container">
  <div class="float-left">Float Left</div>
  <div class="float-right">Float Right</div>
</div>
```

```css
.float-left {
  float: left;
  width: 50%;
  background-color: #3498db;
  color: #fff;
  padding: 10px;
}

.float-right {
  float: right;
  width: 50%;
  background-color: #e74c3c;
  color: #fff;
  padding: 10px;
}
```

In this example,

- The `.float-left` and `.float-right` elements are floated to the left and right, respectively. 
- Notice that the container does not fully enclose these floated elements
- Leads to layout issues where other content on the page is affected

#### Clearing Floats Using the `clear` Property

- Ensure that the parent container fully contains the floated elements, you can use the `clear` property in CSS
- `clear` property specifies which side of the floating elements should not be allowed to touch other floating elements
- Common values for the `clear` property are `left`, `right`, and `both`

Example:

```html
<div class="container">
  <div class="float-left">Float Left</div>
  <div class="float-right">Float Right</div>
  <div class="clearfix"></div> <!-- Clearing element -->
</div>
```

```css
.clearfix {
  clear: both;
}
```

- Added a clearing element with the class `.clearfix` and applied the `clear: both;` property to it
- This tells the browser not to allow floating elements on either side of the clearing element, effectively clearing the floats and ensuring that the container fully contains its children

#### Using the `::after` Pseudo-Element for Clearing

- Doesn't require adding extra markup

```css
.container::after {
  content: "";
  display: table;
  clear: both;
}
```

Target the container with the `::after` pseudo-element, and we use the `content: "";` property to generate an empty box. By setting `display: table;` and `clear: both;`, we effectively clear the floats without adding extra elements to the HTML.

#### Clearing Floats Using `display: flow-root;` ***(Best way)***

- Modern and effective way to clear floats in HTML and CSS without the need for additional clearing elements or pseudo-elements
- Creates a new block formatting context (BFC), which automatically clears the floated elements within a container

```html
<div class="container flow-root">
  <div class="float-left">Float Left</div>
  <div class="float-right">Float Right</div>
</div>
```

```css
.float-left {
  float: left;
  width: 50%;
  background-color: #3498db;
  color: #fff;
  padding: 10px;
}

.float-right {
  float: right;
  width: 50%;
  background-color: #e74c3c;
  color: #fff;
  padding: 10px;
}

.flow-root {
  display: flow-root; /* Create a new block formatting context */
}
```

In this example:

- Added the class `.flow-root` to the `.container` element, and applied `display: flow-root;` to create a new block formatting context.
- This new block formatting context ensures that the floated elements inside the container are properly contained within it, preventing layout issues.

#### Benefits of Using `display: flow-root;`

Using `display: flow-root;` for clearing floats has several advantages:

1. **Simplicity**: It eliminates the need for additional clearing elements or pseudo-elements, resulting in cleaner HTML markup.

2. **Semantic**: It provides a more semantic and straightforward way to indicate that an element should clear its floated children.

3. **Compatibility**: It is well-supported by modern browsers, making it a reliable choice for clearing floats.

4. **Predictable Behavior**: It ensures that the parent container always contains its floated children, regardless of their dimensions or content.

## CSS Positioning

- Allows you to precisely control the placement of elements within their containing elements or the viewport
- Determines how elements are displayed and how they interact with other elements on the page
- There are several CSS properties related to positioning, including `position`, `top`, `right`, `bottom`, and `left`

### `position` Property

Core of CSS positioning and accepts several values

1. `static` (default): The element is positioned according to the normal document flow.

2. `relative`: The element is positioned relative to its **normal** position, allowing you to offset it using `top`, `right`, `bottom`, or `left` properties.

3. `absolute`: The element is positioned relative to its nearest positioned ancestor, or if none exists, relative to the initial containing block. It is taken out of the normal document flow.

4. `fixed`: The element is positioned relative to the viewport and does not move even when the page is scrolled. It is also removed from the normal document flow.

5. `sticky`: The element is positioned based on the user's scroll position. It behaves like `relative` until a specified scroll point is reached, after which it becomes `fixed` until the user scrolls back.

### Examples of CSS Positioning

#### 1. Basic Relative Positioning

```html
<div class="container">
  <div class="box">Relative</div>
</div>
```

```css
.container {
  position: relative;
  width: 200px;
  height: 200px;
  border: 1px solid #000;
}

.box {
  position: relative;
  top: 20px;
  left: 20px;
  background-color: #3498db;
  color: #fff;
  padding: 10px;
}
```

In this example:

- The `.container` div is positioned relative, creating a containing block for its child.
- The `.box` div is also positioned relative, and its `top` and `left` properties move it 20 pixels down and 20 pixels to the right from its normal position within the container.

#### 2. Absolute Positioning within a Relative Container

```html
<div class="container">
  <div class="box">Relative Container</div>
  <div class="absolute-box">Absolute</div>
</div>
```

```css
.container {
  position: relative;
  width: 200px;
  height: 200px;
  border: 1px solid #000;
}

.box {
  background-color: #3498db;
  color: #fff;
  padding: 10px;
}

.absolute-box {
  position: absolute;
  top: 20px;
  left: 20px;
  background-color: #e74c3c;
  color: #fff;
  padding: 10px;
}
```

In this example:

- The `.container` div is positioned relative, creating a containing block for its children.
- The `.box` div is positioned normally within the container.
- The `.absolute-box` div is positioned absolutely within the container, and its `top` and `left` properties move it 20 pixels down and 20 pixels to the right from the top-left corner of the container.

#### 3. Fixed Positioning

```html
<div class="fixed-box">Fixed</div>
```

```css
.fixed-box {
  position: fixed;
  top: 20px;
  left: 20px;
  background-color: #e74c3c;
  color: #fff;
  padding: 10px;
}
```

In this example:

- The `.fixed-box` div is positioned fixed relative to the viewport. It remains in the same position even when the page is scrolled, staying 20 pixels from the top and 20 pixels from the left of the viewport.

#### 4. Sticky Positioning

```html
<div class="container">
  <div class="sticky-box">Sticky</div>
</div>
```

```css
.container {
  height: 1000px; /* Create a tall container to demonstrate scrolling */
}

.sticky-box {
  position: sticky;
  top: 20px;
  background-color: #3498db;
  color: #fff;
  padding: 10px;
}
```

In this example:

- The `.sticky-box` div is positioned as sticky. Initially, it behaves like a relatively positioned element within its container.
- When you scroll down the page, the `.sticky-box` element becomes fixed at 20 pixels from the top of its container.

## `z-index` and Stack Order

- `z-index` property is used to control the vertical stacking order of elements on a web page
- It specifies the z-axis position of an element relative to other elements
- Elements with higher `z-index` values are positioned in front of elements with lower `z-index` values
- By manipulating the `z-index` property, you can create layered effects and control which elements appear in front of others

### Basic Syntax of `z-index`

```css
.selector {
    z-index: value;
}
```

- `selector`: The CSS selector for the element you want to apply the `z-index` to.
- `value`: An integer or the keyword `auto` (default). The higher the integer value, the closer the element is to the viewer.

### Understanding Stack Order

In CSS, the stacking order, also known as the stacking context, is determined by several factors:

1. **HTML Source Order**: Elements that appear later in the HTML source order are rendered on top of elements that appear earlier. This is the default stacking order when no `z-index` values are applied.

2. **`z-index` Values**: Elements with higher `z-index` values are stacked in front of elements with lower values. A higher value moves an element closer to the viewer.

3. **Position Property**: The `position` property also affects stacking. Elements with a `position` value of `relative`, `absolute`, or `fixed` are stacked in front of elements with `static` (default) positioning.

4. **Stacking Contexts**: Certain CSS properties, like `transform`, `opacity`, and `will-change`, create stacking contexts. Elements within a stacking context are stacked relative to each other and may not interact with elements outside their stacking context.

### Examples of `z-index` and Stack Order

#### 1. Basic Stacking with `z-index`

Consider a simple HTML structure:

```html
<div class="container">
    <div class="box red"></div>
    <div class="box green"></div>
</div>
```

```css
.box {
    width: 100px;
    height: 100px;
    position: absolute;
}

.red {
    background-color: #e74c3c;
    z-index: 2;
}

.green {
    background-color: #27ae60;
    z-index: 1;
}
```

In this example:

- Two `.box` elements are absolutely positioned within a `.container`.
- The red box (`.red`) has a higher `z-index` value of 2, so it appears in front of the green box (`.green`), which has a `z-index` value of 1.

#### 2. Stacking Contexts with `transform`

```html
<div class="container">
    <div class="box"></div>
</div>
<div class="box"></div>
```

```css
.container {
    transform: translateZ(0);
}
.box {
    width: 100px;
    height: 100px;
    background-color: #3498db;
    margin: 10px;
    position: relative;
}
```

In this example:

- The first `.box` element inside the `.container` has a `transform` property applied to it. This creates a stacking context for elements within the container.
- The second `.box` element outside the container is rendered on top of the container's box, even though it appears later in the HTML source order.

#### 3. Stacking Order with `position`

```html
<div class="container">
    <div class="box"></div>
</div>
<div class="box"></div>
```

```css
.container {
    position: relative;
    z-index: 1;
}
.box {
    width: 100px;
    height: 100px;
    background-color: #e74c3c;
    margin: 10px;
    position: relative;
    z-index: 2;
}
```

In this example:

- Both `.box` elements have `position: relative;` applied to them.
- The first `.box` element inside the `.container` has a higher `z-index` value, so it appears in front of the second `.box` element outside the container.



## `overflow` property

- Used to control how content is displayed when it overflows the boundaries of its containing element in the horizontal or vertical direction
- Useful property when dealing with content that doesn't fit within a fixed-size container, such as text, images, or overflowing menus
- It accepts four main values:

  1. **visible (default)**: Content overflows the container but is still visible outside it. This is the default behavior.

  2. **hidden**: Content that overflows the container is clipped and not visible.

  3. **scroll**: Scrollbars are added to the container, allowing the user to scroll and view the hidden content.

  4. **auto**: Scrollbars are added only when the content overflows the container, and the user can scroll if necessary.

### Basic Syntax for `overflow`

```css
.selector {
    overflow: value;
}
```

- `selector`: The CSS selector for the element you want to apply the "overflow" property to.

- `value`: One of the four "overflow" values: `visible`, `hidden`, `scroll`, or `auto`.

### Examples of "overflow"

#### 1. Clipping Overflowing Content

```html
<div class="container">
    <p class="text">This is some long text that will overflow the container.</p>
</div>
```

```css
.container {
    width: 200px;
    height: 100px;
    border: 1px solid #ccc;
    overflow: hidden;
}

.text {
    width: 250px;
}
```

In this example:

- The `.container` div has a fixed width and height, creating a constrained container.

- The `.text` paragraph within the container has a width that exceeds the container's width.

- Applying `overflow: hidden;` to the container clips and hides the overflowing text, making it invisible to the user.

#### 2. Adding Scrollbars for Overflowing Content

```html
<div class="container">
    <p class="text">This is some long text that will overflow the container.</p>
</div>
```

```css
.container {
    width: 200px;
    height: 100px;
    border: 1px solid #ccc;
    overflow: scroll;
}

.text {
    width: 250px;
}
```

In this example:

- The `.container` div has the same fixed width and height as the previous example.

- However, instead of `overflow: hidden;`, we use `overflow: scroll;` to add both horizontal and vertical scrollbars to the container.

- This allows the user to scroll and view the hidden content within the constrained container.

#### 3. Automatically Adding Scrollbars as Needed

```html
<div class="container">
    <p class="text">This is some long text that will overflow the container only when the container is smaller.</p>
</div>
```

```css
.container {
    width: 300px;
    height: 200px;
    border: 1px solid #ccc;
    overflow: auto;
}

.text {
    width: 250px;
}
```

In this example:

- The `.container` div has larger dimensions than the previous examples.

- We use `overflow: auto;` to add scrollbars only when the content overflows the container. If the content fits within the container, no scrollbars are displayed.

- This provides a user-friendly experience by avoiding unnecessary scrollbars when they are not needed.

## `table` layout

- Method of arranging content into rows and columns, similar to HTML tables
- It doesn't require the use of actual `<table>` elements
- You can use CSS properties to create grid-based layouts with HTML elements such as `<div>`, `<section>`, or `<article>`
- The primary CSS properties associated with table layout are:
  - `display: table;`: This property is applied to a container element to make it act like a table.
  - `display: table-row;`: Applied to elements within the container to act as table rows.
  - `display: table-cell;`: Applied to elements within table rows to act as table cells.

### Basic Syntax of `table` layout

- Define a container with the `display: table;` property
- Child elements with `display: table-row;` and `display: table-cell;` properties

```css
.table-container {
    display: table;
}

.table-row {
    display: table-row;
}

.table-cell {
    display: table-cell;
}
```

### Examples of CSS Table Layout

#### 1. Creating a Simple Table

```html
<div class="table-container">
    <div class="table-row">
        <div class="table-cell">Header 1</div>
        <div class="table-cell">Header 2</div>
        <div class="table-cell">Header 3</div>
    </div>
    <div class="table-row">
        <div class="table-cell">Row 1, Cell 1</div>
        <div class="table-cell">Row 1, Cell 2</div>
        <div class="table-cell">Row 1, Cell 3</div>
    </div>
    <div class="table-row">
        <div class="table-cell">Row 2, Cell 1</div>
        <div class="table-cell">Row 2, Cell 2</div>
        <div class="table-cell">Row 2, Cell 3</div>
    </div>
</div>
```

```css
.table-container {
    display: table;
    width: 100%;
    border-collapse: collapse;
}

.table-row {
    display: table-row;
}

.table-cell {
    display: table-cell;
    border: 1px solid #000;
    padding: 8px;
}
```

In this example:

- The `.table-container` is a container element with `display: table;`, creating a table-like structure.

- `.table-row` elements inside the container act as table rows.

- `.table-cell` elements within the rows act as table cells.

- The `border-collapse: collapse;` property ensures that cell borders are collapsed into a single border for a more table-like appearance.

#### 2. Creating a Table-Like Form

```html
<div class="table-container">
    <div class="table-row">
        <div class="table-cell">Name:</div>
        <div class="table-cell">
            <input type="text" placeholder="Enter your name">
        </div>
    </div>
    <div class="table-row">
        <div class="table-cell">Email:</div>
        <div class="table-cell">
            <input type="email" placeholder="Enter your email">
        </div>
    </div>
    <div class="table-row">
        <div class="table-cell"></div>
        <div class="table-cell">
            <button>Submit</button>
        </div>
    </div>
</div>
```

```css
.table-container {
    display: table;
    width: 100%;
}

.table-row {
    display: table-row;
}

.table-cell {
    display: table-cell;
    padding: 8px;
    vertical-align: middle;
}

input[type="text"],
input[type="email"] {
    width: 100%;
    padding: 5px;
}

button {
    background-color: #3498db;
    color: #fff;
    border: none;
    padding: 10px 20px;
    cursor: pointer;
}
```

In this example:

- We've created a table-like form layout with labels in the left column and form inputs in the right column.

- The `vertical-align: middle;` property aligns content vertically in the middle of table cells.

- CSS styles have been applied to form elements for better visual presentation.
