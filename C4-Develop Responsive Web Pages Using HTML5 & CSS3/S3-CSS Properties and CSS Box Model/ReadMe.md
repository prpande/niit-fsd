# CSS Properties and CSS Box Model - 08/09

## What is CSS?

- stands for **Cascading Style Sheets**
- Style sheet language used for describing the look and formatting of a document written in HTML or XML
- Enables web developers to control elements like fonts, colors, spacing, layout, and more

### The Purpose of CSS

1. **Separation of Concerns**
   - CSS allows developers to separate the content (HTML) from the presentation (CSS)
   - Separation makes code more organized and maintainable.

2. **Consistency**
    - Ensures a consistent look and feel across a website, which is vital for user experience

3. **Responsive Design**
   - Enables the creation of responsive designs that adapt to different screen sizes and devices

4. **Accessibility**
   - Properly implemented CSS can enhance web accessibility for users with disabilities

5. **Efficiency**
   - Reduces redundancy by allowing developers to apply styles globally or to specific elements, saving time and effort

## CSS Syntax

```css
selector {
    property: value; /* Declaration statement */
}
```

- **Selector**: Selects the HTML element(s) you want to style.
- **Property**: Specifies the aspect of the selected element you want to change.
- **Value**: Defines the new value for the property.
- Can contain one or more declarations separated by semicolons.

### Example

```css
p {
    color: blue;
    font-size: 16px;
}
```

- Selecting all `<p>` (paragraph) elements and changing their text color to blue and font size to 16 pixels

## Practical Examples

### Example 1: Changing Text Color

```html
<!DOCTYPE html>
<html>
<head>
    <style>
        p {
            color: red;
        }
    </style>
</head>
<body>
    <p>This text is red.</p>
</body>
</html>
```

In this example, all `<p>` elements will have red text.

### Example 2: Adjusting Margins and Padding

```html
<!DOCTYPE html>
<html>
<head>
    <style>
        .box {
            margin: 20px;
            padding: 10px;
        }
    </style>
</head>
<body>
    <div class="box">This box has margins and padding.</div>
</body>
</html>
```

Here, created a box with margins (space outside the element) and padding (space inside the element).

### Example 3: Styling Links

```html
<!DOCTYPE html>
<html>
<head>
    <style>
        a {
            text-decoration: none;
            color: #3498db;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <a href="#">Hover over this link.</a>
</body>
</html>
```

- Here, styling hyperlinks (`<a>` elements) to remove the default underline and change the color
- Additionally, adding an underline when hovering over the link

## Applying Styles to an HTML Page

1. **Inline CSS:**
   - Applied directly to individual HTML elements using the `style` attribute.
   - Typically used for making quick, one-off style changes to a specific element.
   - Highest specificity, which means it overrides other styles.

    **Example:**

    ```html
    <!DOCTYPE html>
    <html>
    <head>
        <title>Inline CSS Example</title>
    </head>
    <body>
        <h1 style="color: red;">This is a heading with inline CSS</h1>
        <p style="font-size: 18px;">This is a paragraph with inline CSS.</p>
    </body>
    </html>
    ```

2. **Internal CSS (Style Element):**
   - Placed within the `<style>` element in the `<head>` section of an HTML document.
   - Affects the styling of elements within that specific HTML file.
   - Useful when you want to apply styles to multiple elements on a single page.

    **Example:**

    ```html
    <!DOCTYPE html>
    <html>
    <head>
        <title>Internal CSS Example</title>
        <style>
            h1 {
                color: blue;
            }
            p {
                font-size: 18px;
            }
        </style>
    </head>
    <body>
        <h1>This is a heading with internal CSS</h1>
        <p>This is a paragraph with internal CSS.</p>
    </body>
    </html>
    ```

3. **External CSS (Linking to a Stylesheet):**
   - Involves creating a separate CSS file with `.css` extension and linking it to your HTML document using the `<link>` element.
   - Highly recommended for larger projects and maintains a separation of concerns between HTML and CSS.
   - Allows you to reuse the same stylesheet across multiple HTML pages.

    **Example:**

    Suppose you have an external CSS file named `styles.css`:

    ```css
    /* styles.css */
    h1 {
        color: green;
    }
    p {
        font-size: 20px;
    }
    ```

    Your HTML file can then link to this external CSS file:

    ```html
    <!DOCTYPE html>
    <html>
    <head>
        <title>External CSS Example</title>
        <link rel="stylesheet" type="text/css" href="styles.css">
    </head>
    <body>
        <h1>This is a heading with external CSS</h1>
        <p>This is a paragraph with external CSS.</p>
    </body>
    </html>
    ```

## CSS Selectors

- Patterns used to select and style HTML elements in a web page
- Define which elements in the HTML document will be affected by the styles you apply

### 1. **Type (Element) Selectors**

Select HTML elements by their tag name.

**Example:**

```css
p {
    color: blue;
}
```

In this example, all `<p>` elements will have blue text.

### 2. **Class Selectors**

- Select elements by their class attribute
- Denote a class selector with a period (.) followed by the class name

**Example:**

```html
<p class="highlight">This is a highlighted paragraph.</p>
```

```css
.highlight {
    background-color: yellow;
}
```

The `<p>` element with the class "highlight" will have a yellow background.

### 3. **ID Selectors**

- Select elements by their id attribute
- Denote an ID selector with a hash (#) followed by the ID name.

**Example:**

```html
<p id="unique">This is a unique paragraph.</p>
```

```css
#unique {
    font-weight: bold;
}
```

The `<p>` element with the ID "unique" will have bold text.

### 4. **Universal Selector**

Represented by an asterisk (*), selects all elements on the page.

**Example:**

```css
* {
    margin: 0;
    padding: 0;
}
```

This rule sets the margin and padding to 0 for all elements on the page.

### 5. **Descendant (Whitespace) Selectors**

- Select elements that are descendants of another specified element
- They are separated by a whitespace

**Example:**

```html
<ul>
    <li>Item 1</li>
    <li>Item 2</li>
</ul>
```

```css
ul li {
    list-style-type: square;
}
```

All `<li>` elements that are descendants of a `<ul>` will have a square list-style.

### 6. **Child Selectors**

- Select elements that are a **direct** child of another specified element
- Denoted by the `>` symbol.

**Example:**

```html
<div class="container">
    <p>This is a child paragraph.</p>
</div>
```

```css
.container > p {
    color: red;
}
```

Only the `<p>` element that is a direct child of an element with the class "container" will have red text.

### 7. **Adjacent Sibling Selectors**

- Select an element that is immediately preceded by a specified element
- Denoted by the `+` symbol

**Example:**

```html
<h2>Heading 1</h2>
<p>This is a paragraph.</p>
<h2>Heading 2</h2>
<p>This is another paragraph.</p>
```

```css
h2 + p {
    font-weight: bold;
}
```

The `<p>` element immediately following an `<h2>` will have bold text.

### 8. **Attribute Selectors**

- Select elements based on their attributes
- Enclosed in square brackets and can be used to target specific attribute values

**Example:**

```html
<a href="https://www.example.com">Visit Example</a>
```

```css
a[href="https://www.example.com"] {
    text-decoration: none;
}
```

This rule selects an `<a>` element with the specified `href` attribute value and removes the text decoration.

### 9. **Pseudo-Classes and Pseudo-Elements**

- Allow you to select elements based on their state or position in the document

**Example (Pseudo-Class):**

```css
a:hover {
    color: green;
}
```

This rule changes the color of a link when it is hovered over.

**Example (Pseudo-Element):**

```css
p::first-line {
    font-weight: bold;
}
```

This rule makes the first line of every `<p>` element bold.

### More info on CSS Selectors

- Type selector <https://developer.mozilla.org/en-US/docs/Web/CSS/Type_selectors>
- Universal selector <https://developer.mozilla.org/en-US/docs/Web/CSS/Universal_selectors>
- Class selector <https://developer.mozilla.org/en-US/docs/Web/CSS/Class_selectors>
- id selector <https://developer.mozilla.org/en-US/docs/Web/CSS/ID_selectors>
- Attribute selector <https://developer.mozilla.org/en-US/docs/Web/CSS/Attribute_selectors>
- Pseudo-class selectors <https://developer.mozilla.org/en-US/docs/Web/CSS/Pseudo-classes>
- Pseudo-element selectors <https://developer.mozilla.org/en-US/docs/Web/CSS/Pseudo-elements>
- Descendant combinator <https://developer.mozilla.org/en-US/docs/Web/CSS/Descendant_combinator>
- Child combinator <https://developer.mozilla.org/en-US/docs/Web/CSS/Child_combinator>
- Adjacent sibling combinator <https://developer.mozilla.org/en-US/docs/Web/CSS/Adjacent_sibling_combinator>
- General sibling combinator <https://developer.mozilla.org/en-US/docs/Web/CSS/General_sibling_combinator>

## CSS Properties

- Used to define how HTML elements should be styled or formatted
- Each property controls a specific aspect of an element's appearance, such as color, size, spacing, or layout

### 1. **color**

Sets the text color of an element.

**Example:**

```css
p {
    color: red;
}
```

In this example, all `<p>` elements will have red text.

### 2. **background-color**

Sets the background color of an element.

**Example:**

```css
div {
    background-color: #e0e0e0;
}
```

All `<div>` elements will have a light gray background color.

### 3. **font-family**

Specifies the font of text inside an element.

**Example:**

```css
h1 {
    font-family: Arial, sans-serif;
}
```

The `<h1>` elements will use the Arial font or a sans-serif fallback if Arial is unavailable.

### 4. **font-size**

Determines the size of text.

**Example:**

```css
p {
    font-size: 16px;
}
```

All `<p>` elements will have a font size of 16 pixels.

### 5. **font-weight**

Controls the thickness or boldness of text.

**Example:**

```css
strong {
    font-weight: bold;
}
```

Text within `<strong>` elements will be bold.

### 6. **text-decoration**

Adds decorations to text, such as underlines, overlines, or line-through.

**Example:**

```css
a {
    text-decoration: none;
}
```

Links (`<a>`) will have no text decoration (removes underlines by default).

### 7. **margin**

Sets the space outside the border of an element.

**Example:**

```css
div {
    margin: 10px;
}
```

All `<div>` elements will have a 10-pixel margin on all sides.

### 8. **padding**

Sets the space between an element's content and its border.

**Example:**

```css
button {
    padding: 5px 10px;
}
```

Buttons will have 5 pixels of padding on the top and bottom and 10 pixels on the left and right.

### 9. **border**

Sets the border properties of an element.

**Example:**

```css
img {
    border: 2px solid #ccc;
}
```

All images will have a 2-pixel solid gray border.

### 10. **width and height**

Determine the dimensions of an element.

**Example:**

```css
.container {
    width: 300px;
    height: 200px;
}
```

Elements with the class "container" will have a width of 300 pixels and a height of 200 pixels.

### 11. **display**

- Controls how an element is displayed
- It can change an element's behavior from block-level to inline or other values

**Example:**

```css
span {
    display: inline-block;
}
```

All `<span>` elements will be displayed as inline-block elements.

### 12. **float**

Alows elements to float to the left or right within their container.

**Example:**

```css
img {
    float: left;
}
```

Images will float to the left, allowing text to wrap around them.

### 13. **position**

Used for element positioning, such as "relative," "absolute," or "fixed."

**Example:**

```css
.header {
    position: fixed;
    top: 0;
    left: 0;
}
```

The element with the class "header" will be fixed to the top-left corner of the viewport.

### More CSS Properties Links

- Background properties <https://developer.mozilla.org/en-US/docs/Web/CSS/background>
- Font and text properties <https://developer.mozilla.org/en-US/docs/Web/CSS/font>
- Positioning properties <https://developer.mozilla.org/en-US/docs/Web/CSS/position>
- Styling links properties <https://developer.mozilla.org/en-US/docs/Learn/CSS/Styling_text/Styling_links>
- List-style properties <https://developer.mozilla.org/en-US/docs/Web/CSS/list-style>
- Styling tables properties <https://developer.mozilla.org/en-US/docs/Learn/CSS/Building_blocks/Styling_tables>

### **Shorthand property declarations**

- Provide a more efficient and concise way to set multiple related properties at once
- Useful when applying styles efficiently, reducing redundancy, and improving code readability
- Typically consists of the property name followed by a value or a series of values enclosed in parentheses, brackets, or slashes
- Values are separated by whitespace, slashes, or hyphens, depending on the property

### 1. Font Shorthand

Allows you to set various font-related properties like `font-size`, `font-weight`, and `font-family` in a single declaration.

**Example:**

```css
p {
    font: italic bold 16px/1.5 Arial, sans-serif;
}
```

In this example, we set the `font-style` to `italic`, `font-weight` to `bold`, `font-size` to `16px`, line height (`line-height`) to `1.5`, and `font-family` to Arial or sans-serif as a fallback.

### 2. Margin and Padding Shorthand

Set the margin and padding of an element in one declaration using the `margin` and `padding` shorthand properties.

**Example:**

```css
div {
    margin: 10px 20px 30px 40px;
    padding: 5px 15px;
}
```

In the `margin` property, the values are applied clockwise: top, right, bottom, and left. In the `padding` property, only two values are provided, which apply to top/bottom and left/right.

### 3. Background Shorthand

Allows you to set various background-related properties like `background-color`, `background-image`, and `background-position` in one declaration.

**Example:**

```css
button {
    background: url('button-bg.jpg') no-repeat center center #3498db;
}
```

In this example, we set the `background-image`, `background-repeat`, `background-position`, and `background-color` properties in one declaration.

### 4. Border Shorthand

Used to set the properties for all four borders (top, right, bottom, and left) in one declaration.

**Example:**

```css
div {
    border: 2px solid #e74c3c;
}
```

Here, we set the `border-width`, `border-style`, and `border-color` properties in a single declaration.

### 5. Box Shorthand

Allows you to set properties related to box shadows, such as `box-shadow`, `offset-x`, `offset-y`, `blur-radius`, `spread-radius`, and `color`, all in one declaration.

**Example:**

```css
.card {
    box-shadow: 10px 10px 20px rgba(0, 0, 0, 0.2);
}
```

In this example, we create a box shadow with an x-offset of 10 pixels, a y-offset of 10 pixels, a blur radius of 20 pixels, and a shadow color with a 20% opacity.

## Benefits of Using Shorthand Property Declarations

1. **Conciseness**: Reduce the amount of code you need to write, making stylesheets more concise and easier to read.

2. **Efficiency**: Provide a more efficient way to set multiple related properties, reducing redundancy in code

3. **Maintainability**: Make code easier to maintain and update because dealing with fewer individual property declarations

4. **Improved Readability**: Enhance code readability by grouping related properties together in a single declaration

## Specificity in CSS

- Crucial concept that determines which styles are applied to an HTML element when multiple conflicting CSS rules target the same element
- Set of rules that the browser uses to decide which style declarations should take precedence when there's a conflict
- Essential for understanding and resolving styling conflicts in your web pages
- Calculated based on the combination of selectors used in a CSS rule
- Represented as a four-part value, known as specificity values.

  1. **Inline Styles**: Inline styles have the highest specificity. They are applied directly to an HTML element using the `style` attribute. An inline style is represented as `1,0,0,0`, where the first part is 1 (indicating one inline style), and the other parts are all 0.

     ```html
     <div style="color: red;">This is red text with inline style.</div>
     ```

  2. **IDs**: An ID selector is more specific than a class selector or an element selector. It is represented as `0,1,0,0`, where the second part is 1 (indicating one ID selector), and the other parts are all 0.

     ```css
     #myElement {
         color: blue;
     }
     ```

     ```html
     <div id="myElement">This is blue text with an ID selector.</div>
     ```

  3. **Classes, Pseudo-Classes, and Attributes**: These selectors are less specific than IDs but more specific than element selectors. They are represented as `0,0,1,0` when used. The third part is 1 (indicating one class, pseudo-class, or attribute selector), and the other parts are all 0.

     ```css
     .myClass {
         font-size: 18px;
     }
     ```

     ```html
     <div class="myClass">This text has a font size of 18px with a class selector.</div>
     ```

  4. **Elements and Pseudo-Elements**: These selectors have the lowest specificity. They are represented as `0,0,0,1` when used. The fourth part is 1 (indicating one element or pseudo-element selector), and the other parts are all 0.

     ```css
     p {
         font-weight: bold;
     }
     ```

     ```html
     <p>This is bold text with an element selector.</p>
     ```

### Specificity resolution

- When comparing specificity values, consider these four parts in order of importance
- If two or more rules conflict, the rule with the highest specificity wins
- If specificity values are the same, the rule that appears later in the stylesheet takes precedence, a principle known as the "cascading" nature of CSS

### Specificity hierarchy from highest to lowest

1. Inline Styles (1,0,0,0)
2. IDs (0,1,0,0)
3. Classes, Pseudo-Classes, and Attributes (0,0,1,0)
4. Elements and Pseudo-Elements (0,0,0,1)

- Note that using higher specificity to solve styling conflicts is not always the best practice
- It's recommended to write well-structured and maintainable CSS and to use specificity as a last resort
- Overly specific rules can make your code hard to manage and debug

## CSS Box Model

- Fundamental concept that governs how HTML elements are displayed and spaced on a web page
- Crucial for web developers and designers to grasp this concept thoroughly as it forms the foundation of layout and design in web development

## What is the CSS Box Model?

- Represents every HTML element as a rectangular box
- Each of these boxes consists of four main components:
  1. **Content**: This is the innermost part of the box, where the actual content of the element, such as text, images, or other HTML elements, is displayed.

  2. **Padding**: The padding is the space between the content and the element's border. It provides internal spacing and helps control the element's size.

  3. **Border**: The border is a visible line that surrounds the padding and content. It acts as a boundary separating the element from its surroundings.

  4. **Margin**: The margin is the space outside the border. It creates distance between the element and other elements on the page.

### **The Box Model Components**

### 1. Content

- Represents the actual content of an element
- Its size is determined by the element's width and height properties

**Example:**

```html
<!DOCTYPE html>
<html>
<head>
    <style>
        .box {
            width: 200px;
            height: 100px;
            background-color: #3498db;
        }
    </style>
</head>
<body>
    <div class="box">This is a content area.</div>
</body>
</html>
```

In this example, the content area is the blue rectangle inside the `<div>` element.

### 2. Padding

- Space between the content and the element's border
- Controlled using the `padding` property in CSS

**Example:**

```css
.box {
    width: 200px;
    height: 100px;
    background-color: #3498db;
    padding: 20px;
}
```

In this case, the padding creates a 20-pixel gap between the content and the border of the `<div>` element.

### 3. Border

- Visible line that surrounds the padding and content
- Its properties like width, style, and color can be set using the `border` property

**Example:**

```css
.box {
    width: 200px;
    height: 100px;
    background-color: #3498db;
    padding: 20px;
    border: 2px solid #e74c3c;
}
```

Here, the border is a 2-pixel-wide solid line with a red color.

### 4. Margin

- The space outside the border, creating separation between elements
- Controlled using the `margin` property

**Example:**

```css
.box {
    width: 200px;
    height: 100px;
    background-color: #3498db;
    padding: 20px;
    border: 2px solid #e74c3c;
    margin: 30px;
}
```

In this example, the margin around the `<div>` element is 30 pixels, creating space between this element and other elements on the page.

### **Practical Use Cases of the Box Model**

### 1. Creating Layouts

The Box Model allows you to control the dimensions, spacing, and alignment of various elements, enabling you to create complex page layouts with precise control over spacing and positioning.

### 2. Styling Buttons and Form Elements

By adjusting the padding and border properties, you can style buttons and form elements to make them visually appealing and user-friendly.

### 3. Designing Cards and Panels

Creating cards or panels for displaying content, such as articles or product listings, is a common use case for the Box Model. You can control the padding, border, and margin to achieve the desired look.

### 4. Responsive Design

When building responsive websites, you can adjust the dimensions and spacing of elements using media queries, ensuring that your layout adapts to different screen sizes and devices while maintaining the desired spacing.

### **Inline Boxes vs Block Boxes**

| Characteristic            | Inline Box                                              | Block Box                                     |
|---------------------------|--------------------------------------------------------|-----------------------------------------------|
| **Display Type**          | Renders elements inline within the content flow.      | Renders elements as blocks, creating new lines. |
| **Default Width**         | Occupies only the necessary width for content.        | Expands to fill the entire available width.   |
| **Default Height**        | Adjusts vertically to the content's height.           | Expands vertically to fit its content.         |
| **Line Breaks**           | Does not force a line break after itself.             | Starts on a new line, pushing down content.    |
| **Margins & Padding**     | Horizontal margins and padding affect adjacent content. | Vertical margins and padding affect adjacent content. |
| **Example Elements**      | `<span>`, `<a>`, `<strong>`, `<em>`, `<img>`         | `<div>`, `<p>`, `<h1>`, `<ul>`, `<li>`        |
| **Common Use Cases**     | Styling text elements, inline links, emphasizing text. | Creating layout structures, paragraphs, lists. |
| **Example CSS Properties**| `color`, `font-size`, `text-decoration`, `background-color`. | `width`, `height`, `margin`, `padding`, `border`. |
||

### **`display` Property**

- Determines how an HTML element should be displayed in the document layout
- Enables developers to change the default behavior of elements, transforming inline elements into block-level elements and vice versa, or even hiding elements entirely

### Common Values of the `display` Property

The `display` property accepts various values, each of which changes the behavior of the element in specific ways. Here are some common values:

**1. `block`**

- Makes an element a block-level element, creating a new block formatting context
- Block-level elements start on new lines, stacking vertically on top of each other

**Example:**

```css
p {
    display: block;
    background-color: #3498db;
}
```

In this example, all `<p>` elements will be displayed as block-level elements with a blue background.

**2. `inline`**

- Makes an element an inline-level element
- Inline elements flow within the text content and do not start on new lines

**Example:**

```css
a {
    display: inline;
    text-decoration: underline;
}
```

Here, all `<a>` elements will be displayed inline with underlined text decoration.

**3. `inline-block`**

- Combines the characteristics of both inline and block-level elements
- Allows an element to flow inline like text but still have block-level styling properties

**Example:**

```css
button {
    display: inline-block;
    padding: 10px 20px;
    background-color: #e74c3c;
    color: #fff;
}
```

All `<button>` elements will be displayed as inline-block elements with padding, background color, and text color applied.

**4. `none`**

- Hides an element from the layout entirely
- The element is not rendered, and it does not occupy any space on the page

**Example:**

```css
.hidden {
    display: none;
}
```

Elements with the class "hidden" will not be displayed on the page.

**5. `flex`**

- Used to create a flex container and enable flexible box layout (`flexbox`)
- Allows you to control the alignment and distribution of child elements within the container

**Example:**

```css
.container {
    display: flex;
    justify-content: center;
    align-items: center;
}
```

In this example, the `.container` element becomes a flex container, and its child elements will be flex items, centered both horizontally and vertically.

## BEM naming convention

- <https://getbem.com/introduction/>
- BEM, or Block, Element, Modifier, a widely adopted naming convention for writing CSS classes
- Encourages a systematic and structured approach to styling web components
  - **Block**: A standalone, reusable component that represents a distinct part of a web interface.
  - **Element**: A part of a block that has no standalone meaning and is semantically tied to its parent block.
  - **Modifier**: A flag that changes the appearance or behavior of a block or element.
- Core idea behind BEM is to create self-contained and independent CSS classes that are easy to understand, maintain, and scale

### BEM Naming Convention Principles

1. **Block Names**: Use hyphen-separated words in lowercase for block names. For example, `button`, `menu`, or `card`.

2. **Element Names**: Elements are named after their parent block, followed by two underscores and the element name in lowercase. For example, `button__text`, `menu__item`, or `card__image`.

3. **Modifier Names**: Modifiers are named after the block or element they modify, followed by two hyphens and the modifier name in lowercase. For example, `button--primary`, `menu__item--active`, or `card__image--rounded`.

4. **Avoid Nesting**: Avoid nesting BEM classes in your HTML markup or CSS. Each block, element, or modifier should have its class independently.

### Best Practices and Examples

#### 1. Styling a Button Component

Consider a button component with primary and secondary variations. Using BEM, you can structure your classes like this:

```html
<button class="button button--primary">Primary Button</button>
<button class="button button--secondary">Secondary Button</button>
```

Here, `button` represents the block, and `button--primary` and `button--secondary` are modifiers that change the button's appearance.

#### 2. Creating a Card Component

A card component may consist of a title, description, and an image. BEM can help keep these components organized:

```html
<div class="card">
    <h2 class="card__title">Card Title</h2>
    <p class="card__description">Lorem ipsum dolor sit amet.</p>
    <img class="card__image card__image--rounded" src="card-image.jpg" alt="Card Image">
</div>
```

Here, `card` is the block, and `card__title`, `card__description`, and `card__image` are elements. The `card__image--rounded` modifier modifies the image's appearance.

#### 3. Creating a Menu Component

A menu component with items can benefit from the BEM convention:

```html
<nav class="menu">
    <ul class="menu__list">
        <li class="menu__item"><a class="menu__link" href="#">Home</a></li>
        <li class="menu__item menu__item--active"><a class="menu__link" href="#">About</a></li>
        <li class="menu__item"><a class="menu__link" href="#">Services</a></li>
    </ul>
</nav>
```

In this example, `menu`, `menu__list`, `menu__item`, and `menu__link` represent the block and elements. The `menu__item--active` modifier indicates the active menu item.

#### 4. Modifying Text Styles

You can use BEM for modifying text styles within specific blocks or elements. For instance, adjusting the text color of a block's title:

```html
<div class="card">
    <h2 class="card__title card__title--blue">Blue Title</h2>
    <!-- ...other card content -->
</div>
```

Here, `card__title` is the element, and `card__title--blue` is a modifier that changes the text color to blue.

### Advantages of the BEM Naming Convention

Using the BEM naming convention offers several benefits:

1. **Clarity and Maintainability**: BEM class names are descriptive and self-explanatory, making it easier for developers to understand and maintain code.

2. **Scalability**: BEM's modular structure simplifies the addition of new blocks, elements, or modifiers without affecting existing styles.

3. **Reusability**: BEM encourages the creation of reusable components that can be used across different parts of a website.

4. **Collaboration**: The naming convention enhances collaboration among developers and designers, as class names convey their intended purpose clearly.

5. **Reduced Specificity**: BEM reduces the need for overly specific selectors and minimizes the risk of unintended side effects when applying styles.
