## Sprint 3: Style a Web page Using CSS properties and CSS Box Model

### This sprint has 5 demos 

[**Demo 1: Types of Styling**](demo-1-types-of-styling)

#### Problem Statement
- Apply styles to an HTML page in different ways.
1. Inline Style are placed directly inside an HTML element in the code using the "style" attribute​
2. Embedded styles are placed inside the head section of a particular web page via the `<style>` tag.​
3. External style sheet is a separate page that is then linked to the web page using `<link>` tag.

[**Demo 2: CSS Selectors**](demo-2-css-selectors)

#### Problem Statement

- Demonstrate the different methods used to select HTML elements using CSS selectors.
1. Tag Selector using tag names directly
2. ID selector using the symbol `#` followed by the ID name
3. Class Selector using the symbol `.` followed by the class name

[**Demo 3: Basic CSS Properties**](demo-3-basic-css-properties)

#### Problem Statement

- Control the appearance of a web page by applying styles using CSS properties.
1. Apply CSS background and font shorthand properties to paragraph text and headings.
2. Apply list style properties to ordered and unordered lists.

[**Demo 4: Box Model**](demo-4-box-model)

#### Problem Statement

- Understand the CSS Box model properties
1. Apply different values for margin properties to the div container and content inside the container and observe the appearance.
2. Give negative values for margins to understand margin collapsing.
3. Apply padding properties to observe the appearance of the contents inside the container.
4. Apply different border properties like style, width and color to div elements.
5. Create a web page with some basic content, then add margins, borders and paddings to make the web page look appealing.

[**Demo 4: Display Types**](demo-4-display-types)

#### Problem Statement

- Apply different values to the display property to see how the content layout changes.
- In the code, we have a `<span>` inside a paragraph and have applied a width, height, margin, border, and padding to it. You can see that the width and height are ignored. The vertical margin, padding, and border are respected but they do not change the relationship of other content to our inline box and so the padding and border overlaps other words in the paragraph. Horizontal padding, margins, and borders are respected and will cause other content to move away from the box.​
- Try changing  display: inline-block to our `<span>` element. Then change this to display block or remove the line completely to see the difference in the display models.