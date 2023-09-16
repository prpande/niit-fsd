<!-- omit in toc -->
# Modern CSS - 13/09

- Article on 'Multi-Device Layout Patterns':<https://www.lukew.com/ff/entry.asp?1514>

<!-- omit in toc -->
## Contents

- [Responsive Website Design Patterns](#responsive-website-design-patterns)
  - [Modern CSS Techniques for Responsive Design](#modern-css-techniques-for-responsive-design)
    - [1. CSS Grid and Flexbox Layouts](#1-css-grid-and-flexbox-layouts)
    - [2. Media Queries](#2-media-queries)
    - [3. Responsive Typography](#3-responsive-typography)
    - [4. Image Optimization](#4-image-optimization)
    - [5. Mobile-First Design](#5-mobile-first-design)
  - [Example: Building a Responsive Navigation Menu](#example-building-a-responsive-navigation-menu)
- [Breakpoints](#breakpoints)
  - [Understanding Breakpoints](#understanding-breakpoints)
  - [1. Media Queries](#1-media-queries)
  - [2. Mobile-First Design](#2-mobile-first-design)
  - [3. Breakpoint Values](#3-breakpoint-values)
  - [4. Logical Operators](#4-logical-operators)
  - [5. Retina and Hi-DPI Displays](#5-retina-and-hi-dpi-displays)
  - [6. Custom Properties and JavaScript Integration](#6-custom-properties-and-javascript-integration)
  - [Advanced Features](#advanced-features)
- [Flexbox](#flexbox)
  - [Understanding the Basics](#understanding-the-basics)
  - [1. Display Property](#1-display-property)
  - [2. Flex Direction](#2-flex-direction)
  - [3. Justify Content](#3-justify-content)
  - [4. Align Items](#4-align-items)
  - [5. Flex Wrap](#5-flex-wrap)
  - [6. Align Content](#6-align-content)
  - [7. Flex Grow, Shrink, and Basis](#7-flex-grow-shrink-and-basis)
  - [8. Order](#8-order)
  - [9. Align Self](#9-align-self)
  - [Advanced Features of Flex box](#advanced-features-of-flex-box)
- [Grid layout](#grid-layout)
  - [Understanding the Basics of Grid layout](#understanding-the-basics-of-grid-layout)
  - [1. Display Property for grid](#1-display-property-for-grid)
  - [2. Grid Template Columns and Rows](#2-grid-template-columns-and-rows)
  - [3. Grid Gap](#3-grid-gap)
  - [4. Justify and Align Properties](#4-justify-and-align-properties)
  - [5. Grid Template Areas](#5-grid-template-areas)
  - [6. Placing Grid Items](#6-placing-grid-items)
  - [7. Implicit Grid](#7-implicit-grid)
  - [8. Grid Auto Flow](#8-grid-auto-flow)
  - [Advanced Features of Grid layout](#advanced-features-of-grid-layout)
- [Flexible images](#flexible-images)
  - [Understanding the Challenge](#understanding-the-challenge)
  - [Methodology 1: Fluid Width with Max-Width](#methodology-1-fluid-width-with-max-width)
  - [Methodology 2: HTML `srcset` Attribute](#methodology-2-html-srcset-attribute)
  - [Methodology 3: The `<picture>` Element](#methodology-3-the-picture-element)
  - [Methodology 4: Art Direction with `<picture>`](#methodology-4-art-direction-with-picture)
  - [Methodology 5: CSS `object-fit` Property](#methodology-5-css-object-fit-property)
- [Media Queries](#media-queries)
  - [Understanding Media Queries](#understanding-media-queries)
  - [Basic Syntax](#basic-syntax)
  - [Common Media Query Properties](#common-media-query-properties)
  - [Complex Media Queries](#complex-media-queries)
  - [Practical Examples](#practical-examples)
    - [Responsive Typography](#responsive-typography)
    - [Image Optimization](#image-optimization)
    - [Navigation Menu](#navigation-menu)

## Responsive Website Design Patterns

Responsive website design patterns are reusable solutions or strategies that web designers and developers can employ to address common challenges and requirements in creating responsive web layouts. These patterns help ensure that websites look and function well across various screen sizes and devices. Here are some common responsive design patterns:

1. **Fluid Grid Layouts:**
   - *Description:* This pattern involves designing layouts using relative units like percentages or the CSS Grid and Flexbox layout systems. It allows content to resize proportionally based on the viewport width.
   - *Example:* Creating a grid-based layout where the columns adjust their width as the screen size changes.

2. **Media Queries:**
   - *Description:* Media queries are used to apply specific CSS rules based on the screen's characteristics, such as width, height, and orientation.
   - *Example:* Changing font sizes or hiding certain elements on smaller screens using `@media` queries.

3. **Mobile-First Design:**
   - *Description:* In this pattern, designers start by creating the mobile version of a website and progressively enhance it for larger screens. It ensures a better user experience on small screens and reduces bloat on larger devices.
   - *Example:* Initially designing a navigation menu for mobile with a collapsible hamburger icon and then expanding it into a horizontal menu for desktop.

4. **Off-Canvas Navigation:**
   - *Description:* This pattern involves hiding navigation menus or sidebars off the screen and revealing them when a user interacts with a toggle button or gesture.
   - *Example:* Using a sliding menu that appears from the side of the screen when a user clicks the menu icon on mobile devices.

5. **Responsive Images:**
   - *Description:* To optimize image delivery and display, this pattern involves using various techniques, such as the `srcset` attribute, to provide different image sizes or resolutions based on the user's device.
   - *Example:* Providing smaller images for mobile devices to reduce load times and larger, higher-resolution images for desktop screens.

6. **One-Page Scrolling:**
   - *Description:* This pattern simplifies navigation by allowing users to scroll vertically through a single page with distinct sections or content blocks.
   - *Example:* Creating a website where users scroll down to view different sections like About Us, Services, and Contact on a single page.

7. **Card-Based Layouts:**
   - *Description:* Card-based designs organize content into separate, self-contained "cards" or containers. These cards stack vertically on small screens and adapt into a grid on larger screens.
   - *Example:* Displaying articles or products as cards on mobile and reorganizing them into a grid on tablets or desktops.

8. **Responsive Typography:**
   - *Description:* Ensuring that text elements adjust their size, line height, and spacing to remain readable and aesthetically pleasing on various screen sizes.
   - *Example:* Using relative units like `em`, `rem`, or viewport units (`vw`, `vh`) to maintain consistent typography across different devices.

9. **Device-Agnostic UI:**
   - *Description:* Designing interfaces that work well regardless of the device or input method (touch or mouse). This pattern often focuses on creating large, touch-friendly elements.
   - *Example:* Designing buttons and interactive elements with ample spacing and touch targets for both mobile and desktop users.

10. **Progressive Enhancement:**
    - *Description:* Starting with a basic, functional website and adding advanced features or styles for devices and browsers that support them.
    - *Example:* Providing a basic HTML form for all users and enhancing it with client-side validation and AJAX submissions for modern browsers.

These responsive design patterns serve as guidelines and building blocks for creating websites that adapt to the diverse landscape of devices and screen sizes, ensuring a consistent and user-friendly experience for all users. Designers and developers can choose and combine these patterns as needed to meet the specific requirements of their projects.

### Modern CSS Techniques for Responsive Design

#### 1. CSS Grid and Flexbox Layouts

CSS Grid and Flexbox are two powerful layout techniques that have revolutionized responsive design.

**CSS Grid** allows you to create complex grid layouts with rows and columns, making it easier to create responsive designs. For example, here's a basic grid structure:

```css
.container {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
  grid-gap: 20px;
}
```

In this example, the `auto-fit` and `minmax` functions ensure that the grid columns adjust based on the available space.

**Flexbox**, on the other hand, is excellent for one-dimensional layouts like navigation menus or aligning items within a container. Here's an example of centering content horizontally and vertically:

```css
.container {
  display: flex;
  justify-content: center;
  align-items: center;
}
```

#### 2. Media Queries

Media queries allow you to apply CSS styles based on the screen size. Here's an example of using a media query to change the font size when the screen width is less than 600 pixels:

```css
@media screen and (max-width: 600px) {
  body {
    font-size: 16px;
  }
}
```

#### 3. Responsive Typography

To ensure legibility on different devices, it's essential to use responsive typography. You can do this by using relative units like `rem` or `em` instead of fixed `px` values. For example:

```css
body {
  font-size: 1rem;
}

h1 {
  font-size: 2rem;
}

@media screen and (max-width: 600px) {
  body {
    font-size: 0.9rem;
  }

  h1 {
    font-size: 1.5rem;
  }
}
```

#### 4. Image Optimization

Images play a significant role in web design. To make them responsive, use the `max-width: 100%` property to ensure they scale down proportionally within their containers:

```css
img {
  max-width: 100%;
  height: auto;
}
```

#### 5. Mobile-First Design

A mobile-first approach means designing your website for mobile devices first, and then gradually adding styles and layout changes for larger screens using media queries. This ensures a better experience for users on smaller devices.

### Example: Building a Responsive Navigation Menu

Let's create a simple example of a responsive navigation menu using the concepts discussed above:

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="styles.css">
  <title>Responsive Navigation Menu</title>
</head>
<body>
  <nav class="navbar">
    <ul class="nav-list">
      <li><a href="#">Home</a></li>
      <li><a href="#">About</a></li>
      <li><a href="#">Services</a></li>
      <li><a href="#">Contact</a></li>
    </ul>
  </nav>
</body>
</html>
```

```css
/* styles.css */
.navbar {
  background-color: #333;
  padding: 10px;
}

.nav-list {
  list-style: none;
  padding: 0;
  display: flex;
  justify-content: center;
}

.nav-list li {
  margin: 0 10px;
}

.nav-list li a {
  color: white;
  text-decoration: none;
}

@media screen and (max-width: 600px) {
  .nav-list {
    flex-direction: column;
    text-align: center;
  }

  .nav-list li {
    margin: 10px 0;
  }
}
```

In this example, the navigation menu changes from a horizontal layout to a vertical layout when the screen width is less than 600 pixels.

## Breakpoints

- Essential for creating responsive web designs that adapt to different screen sizes and devices
- Allow developers to define specific styles and layouts for various viewport widths or other device characteristics

### Understanding Breakpoints

Before diving into the properties and features of breakpoints in CSS, let's establish some foundational concepts:

1. **Viewport:** The visible area of a web page in the browser window. The viewport's width and height can change based on the device or screen size.

2. **Media Query:** A CSS technique that allows you to apply different styles based on the characteristics of the user's device or viewport.

Now, let's explore the core properties and features of breakpoints:

### 1. Media Queries

Media queries are the foundation of breakpoints in CSS. They enable you to conditionally apply CSS styles based on specific criteria, such as viewport width, height, device orientation, and more.

Example:

```css
/* Apply styles for viewports with a maximum width of 768 pixels */
@media (max-width: 768px) {
  /* Your CSS styles for smaller screens go here */
}
```

### 2. Mobile-First Design

Mobile-first design is a responsive design approach where you start by designing for mobile devices and progressively enhance the design for larger screens. This ensures a solid foundation for smaller screens.

Example:

```css
/* Base styles for mobile devices */
body {
  font-size: 16px;
}

/* Enhanced styles for larger screens */
@media (min-width: 768px) {
  body {
    font-size: 18px;
  }
}
```

### 3. Breakpoint Values

Breakpoints are typically defined by specifying specific values for characteristics like viewport width. You can use `min-width`, `max-width`, `min-height`, `max-height`, and more to target various aspects of the viewport.

Example:

```css
/* Apply styles for viewports with a minimum width of 320 pixels */
@media (min-width: 320px) {
  /* Your CSS styles for small screens go here */
}

/* Apply styles for viewports with a maximum width of 1200 pixels */
@media (max-width: 1200px) {
  /* Your CSS styles for medium screens go here */
}
```

### 4. Logical Operators

Media queries support logical operators like `and`, `or`, and `not`. These operators allow you to create complex conditions for applying styles.

Example:

```css
/* Apply styles for viewports with a minimum width of 768 pixels AND a landscape orientation */
@media (min-width: 768px) and (orientation: landscape) {
  /* Your CSS styles for landscape tablets and larger screens */
}
```

### 5. Retina and Hi-DPI Displays

You can use media queries to target devices with higher pixel density, commonly referred to as "retina" or "Hi-DPI" displays.

Example:

```css
/* Apply styles for devices with a minimum resolution of 2x (retina displays) */
@media (min-resolution: 192dpi) {
  /* Your CSS styles for high-resolution displays */
}
```

### 6. Custom Properties and JavaScript Integration

You can dynamically adjust breakpoint values using custom properties (CSS variables) and JavaScript. This approach allows for fine-grained control over responsive behavior.

Example (using CSS variables):

```css
:root {
  --breakpoint-small: 768px;
  --breakpoint-medium: 1024px;
}

@media (max-width: var(--breakpoint-small)) {
  /* Your CSS styles for small screens */
}

@media (max-width: var(--breakpoint-medium)) {
  /* Your CSS styles for medium screens */
}
```

### Advanced Features

In addition to the core properties mentioned above, breakpoints can be used to implement advanced features like adaptive typography, image optimization, and complex layout adjustments based on device characteristics.

```css
/* Example of adaptive typography using media queries */
@media (max-width: 768px) {
  body {
    font-size: 16px; /* Smaller font size for smaller screens */
  }
}
```

```css
/* Example of image optimization using media queries */
@media (max-width: 480px) {
  img {
    max-width: 100%; /* Images scale down on small screens */
  }
}
```

## Flexbox

- Officially known as the Flexible Box Layout
- Layout model that simplifies the complex task of arranging elements within a container
- Provides a more efficient and predictable way to create responsive and dynamic layouts

### Understanding the Basics

1. **Flex Container:** The parent element that holds one or more flex items.

2. **Flex Items:** The child elements inside a flex container that will be laid out using Flexbox.

3. **Main Axis:** The primary axis along which flex items are arranged (either horizontally or vertically).

4. **Cross Axis:** The perpendicular axis to the main axis.

### 1. Display Property

The `display` property is used to define an element as a flex container. By setting `display: flex;` or `display: inline-flex;`, you enable the flex layout model.

Example:

```css
.container {
  display: flex; /* or inline-flex */
}
```

### 2. Flex Direction

The `flex-direction` property determines the main axis along which flex items are laid out. You can choose from four values: `row`, `row-reverse`, `column`, and `column-reverse`.

Example:

```css
.container {
  flex-direction: row; /* Default value */
}
```

### 3. Justify Content

The `justify-content` property controls the alignment of flex items along the main axis. It allows you to distribute items, space them out, or align them at either end.

Example:

```css
.container {
  justify-content: space-between;
}
```

### 4. Align Items

The `align-items` property defines how flex items are aligned along the cross axis within the container.

Example:

```css
.container {
  align-items: center;
}
```

### 5. Flex Wrap

The `flex-wrap` property determines whether flex items should wrap to the next line when the container's width is insufficient to accommodate them.

Example:

```css
.container {
  flex-wrap: wrap;
}
```

### 6. Align Content

The `align-content` property controls how multiple lines of flex items are distributed within the container along the cross axis.

Example:

```css
.container {
  align-content: space-around;
}
```

### 7. Flex Grow, Shrink, and Basis

The `flex` property is shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`. It controls how flex items grow or shrink to fill available space.

Example:

```css
.item {
  flex: 1 0 200px;
}
```

### 8. Order

The `order` property allows you to change the order in which flex items appear within the container, irrespective of their HTML structure.

Example:

```css
.item {
  order: 2;
}
```

### 9. Align Self

The `align-self` property overrides the `align-items` property for individual flex items, allowing you to customize their alignment.

Example:

```css
.item {
  align-self: flex-end;
}
```

### Advanced Features of Flex box

Flexbox offers advanced features like nested flex containers, which enable more complex layouts. Here's a brief example of nesting:

```html
<div class="outer-container">
  <div class="inner-container">
    <div class="item">1</div>
    <div class="item">2</div>
  </div>
  <div class="item">3</div>
</div>
```

```css
.outer-container {
  display: flex;
  flex-direction: column;
}

.inner-container {
  display: flex;
  justify-content: space-between;
}

.item {
  flex: 1;
  margin: 5px;
}
```

## Grid layout

- Powerful two-dimensional layout system that enables web developers to create complex and responsive layouts with ease

### Understanding the Basics of Grid layout

Before diving into the properties and features of CSS Grid, let's establish some foundational concepts:

1. **Grid Container:** The parent element that serves as the container for a grid layout. It contains grid items.

2. **Grid Items:** The child elements inside a grid container that participate in the grid layout.

3. **Grid Line:** The lines that define the grid's rows and columns. Grid lines can be numbered or named.

4. **Grid Cell:** The intersection of a row and a column, representing a single unit within the grid.

5. **Grid Area:** A rectangular area within the grid created by defining a region between specific grid lines.

Now, let's explore the core properties and features of CSS Grid:

### 1. Display Property for grid

The `display` property is used to define an element as a grid container. By setting `display: grid;`, you enable the grid layout model.

Example:

```css
.container {
  display: grid;
}
```

### 2. Grid Template Columns and Rows

The `grid-template-columns` and `grid-template-rows` properties allow you to define the size and structure of grid columns and rows. You can use fixed values, percentages, or flexible units like `fr` (fractional unit).

Example:

```css
.container {
  grid-template-columns: 1fr 2fr 1fr; /* Three columns with 1:2:1 proportions */
  grid-template-rows: auto 100px; /* Two rows with one auto-sized and one 100px tall */
}
```

### 3. Grid Gap

The `grid-gap` property sets the spacing between grid rows and columns, making it easier to control the layout's spacing.

Example:

```css
.container {
  grid-gap: 10px; /* 10px gap between rows and columns */
}
```

### 4. Justify and Align Properties

You can use properties like `justify-items`, `align-items`, `justify-content`, and `align-content` to control the alignment of grid items within the grid container along both the row and column axes.

Example:

```css
.container {
  justify-items: center; /* Center grid items horizontally */
  align-items: center; /* Center grid items vertically */
}
```

### 5. Grid Template Areas

The `grid-template-areas` property allows you to create named grid areas, making it easier to define complex layouts.

Example:

```css
.container {
  grid-template-areas:
    "header header"
    "sidebar main"
    "footer footer";
}
```

### 6. Placing Grid Items

You can place grid items into specific grid areas using the `grid-row` and `grid-column` properties.

Example:

```css
.item {
  grid-row: 2 / span 1; /* Place item in row 2, spanning 1 row */
  grid-column: 2 / span 2; /* Place item in column 2, spanning 2 columns */
}
```

### 7. Implicit Grid

The implicit grid is created when grid items overflow the explicitly defined grid. You can control the behavior of the implicit grid using properties like `grid-auto-rows` and `grid-auto-columns`.

Example:

```css
.container {
  grid-auto-rows: 100px; /* Auto rows have a height of 100px */
  grid-auto-columns: 1fr; /* Auto columns have a flexible width */
}
```

### 8. Grid Auto Flow

The `grid-auto-flow` property determines how grid items are placed into the grid when not explicitly positioned.

Example:

```css
.container {
  grid-auto-flow: dense; /* Items fill in empty spaces before moving to the next cell */
}
```

### Advanced Features of Grid layout

CSS Grid offers advanced features such as nesting grids within grids, aligning grid items within grid areas, and spanning multiple rows or columns. These features allow for intricate and responsive layouts, but they require a deeper understanding of the layout model.

```html
<div class="container">
  <div class="item">1</div>
  <div class="item">2</div>
  <div class="item">3</div>
  <div class="item">4</div>
</div>
```

```css
.container {
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  grid-template-rows: 100px 200px;
  gap: 10px;
}

.item {
  background-color: #3498db;
  color: white;
  padding: 20px;
  text-align: center;
}

.item:nth-child(1) {
  grid-column: span 2;
  grid-row: span 1;
}

.item:nth-child(2) {
  grid-column: span 1;
  grid-row: span 2;
}

.item:nth-child(3) {
  grid-column: 2 / span 1;
  grid-row: 2 / span 1;
}

.item:nth-child(4) {
  grid-column: 1 / span 1;
  grid-row: 2 / span 1;
}
```

## Flexible images

### Understanding the Challenge

- The challenge with images in web design lies in ensuring that they scale and display correctly on screens of different sizes and resolutions
- Stretching or shrinking images disproportionately can lead to visual distortions or unnecessary bandwidth usage

### Methodology 1: Fluid Width with Max-Width

One of the simplest and most effective methods for creating flexible images is using CSS to set the image's `max-width` property to 100%. This ensures that the image will never exceed the width of its containing element while maintaining its aspect ratio.

```css
img {
  max-width: 100%;
  height: auto;
}
```

In this method, the `max-width` property ensures that the image scales down to fit the container while the `height` is set to `auto` to maintain the image's aspect ratio.

### Methodology 2: HTML `srcset` Attribute

The `srcset` attribute is an HTML attribute that allows you to provide multiple image sources with different resolutions or sizes. The browser then selects the most appropriate image to display based on the user's device capabilities and screen size.

```html
<img src="image-320.jpg" srcset="image-320.jpg 320w, image-480.jpg 480w, image-800.jpg 800w" alt="Flexible Image">
```

In this example, the browser will choose the most suitable image based on the viewport width and the specified sizes.

### Methodology 3: The `<picture>` Element

The `<picture>` element is a versatile and powerful method for handling responsive images. It allows you to specify multiple sources and even different image formats, ensuring the best image is delivered to the user's device.

```html
<picture>
  <source srcset="image.webp" type="image/webp">
  <img src="image.jpg" alt="Flexible Image">
</picture>
```

In this example, the browser will choose the `.webp` image if the format is supported, falling back to the `.jpg` image if necessary.

### Methodology 4: Art Direction with `<picture>`

The `<picture>` element also enables art direction, where you can provide different images for different screen sizes or orientations.

```html
<picture>
  <source media="(max-width: 768px)" srcset="image-small.jpg">
  <source media="(min-width: 769px)" srcset="image-large.jpg">
  <img src="image.jpg" alt="Flexible Image">
</picture>
```

In this case, the browser selects the appropriate image source based on the media query, providing a tailored image for different devices.

### Methodology 5: CSS `object-fit` Property

The `object-fit` property in CSS allows you to control how the content of an `<img>` element is resized and scaled within its container.

```css
img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}
```

In this example, `object-fit: cover;` ensures that the image scales proportionally and covers the entire container, cropping the image if necessary.

## Media Queries

### Understanding Media Queries

- Techniques that allow you to apply styles conditionally based on the characteristics of the user's device or viewport
- These characteristics can include screen width, height, resolution, device orientation, and more
- Play a crucial role in responsive web design, enabling designers and developers to create layouts that provide the best user experience regardless of the user's device

### Basic Syntax

A media query consists of an `@media` rule followed by one or more conditions enclosed in parentheses. If the conditions within the parentheses are met, the styles within the corresponding block are applied.

```css
@media type and (condition) {
  /* CSS styles to apply when the condition is met */
}
```

`type` can be different media types like screen, print etc. It is optional to specify.

### Common Media Query Properties

1. **Width-Based Media Queries**

   - Adjust styles based on the width of the viewport.
   - Useful for creating responsive layouts.

   ```css
   /* Apply styles for screens with a maximum width of 768px */
   @media (max-width: 768px) {
     /* CSS styles for smaller screens go here */
   }
   ```

2. **Height-Based Media Queries**

   - Adjust styles based on the height of the viewport.
   - Useful for handling content that relies on vertical space.

   ```css
   /* Apply styles for screens with a minimum height of 600px */
   @media (min-height: 600px) {
     /* CSS styles for taller screens go here */
   }
   ```

3. **Resolution-Based Media Queries**

   - Adapt styles based on the pixel density or resolution of the device's screen.
   - Useful for delivering high-resolution images to devices that support them.

   ```css
   /* Apply styles for devices with a minimum resolution of 2x (retina displays) */
   @media (min-resolution: 192dpi) {
     /* CSS styles for high-resolution displays go here */
   }
   ```

4. **Device Orientation Media Queries**

   - Adjust styles based on the orientation of the device (landscape or portrait).
   - Useful for reformatting content to fit the screen's orientation.

   ```css
   /* Apply styles for screens in portrait orientation */
   @media (orientation: portrait) {
     /* CSS styles for portrait orientation go here */
   }
   ```

5. **Media type based queries**

   - Print with a different text color if the width is greater than a particular size

    ```css
    @media print and (max-width: 800px){
      color: black;
    }
    ```

### Complex Media Queries

Media queries can become more complex by combining multiple conditions using logical operators such as `and`, `or`, and `not`. This allows for fine-grained control over style application.

```css
/* Apply styles for screens with a maximum width of 768px and a portrait orientation */
@media (max-width: 768px) and (orientation: portrait) {
  /* CSS styles for small portrait screens go here */
}
```

### Practical Examples

#### Responsive Typography

```css
/* Base font size for all screens */
body {
  font-size: 16px;
}

/* Adjust font size for screens with a minimum width of 768px */
@media (min-width: 768px) {
  body {
    font-size: 18px;
  }
}
```

#### Image Optimization

```css
/* Images with a max-width of 100% for all screens */
img {
  max-width: 100%;
}

/* Increase image size for screens with a minimum width of 1200px */
@media (min-width: 1200px) {
  img {
    max-width: 1200px;
  }
}
```

#### Navigation Menu

```css
/* Display a mobile-friendly menu icon for screens with a maximum width of 768px */
.mobile-menu {
  display: block;
}

/* Display a horizontal navigation menu for screens with a minimum width of 769px */
@media (min-width: 769px) {
  .mobile-menu {
    display: none;
  }
  .desktop-menu {
    display: block;
  }
}
```
