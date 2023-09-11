# Create a Material Card

## Context

Material is an adaptable system of guidelines, components, and tools that support the best practices of user interface design. Backed by open-source code, Material streamlines collaboration between designers and developers, and helps teams quickly build beautiful products.

A material card is a sheet of material that may contain a photo, text, and a link about a single subject. They may display content containing elements of varying size, such as photos with captions of variable length.

## Problem Statement

 Design a simple material card using CSS floats and position properties which resembles the following image.

![](./Material-card-using-float.png)

### Tasks

- To build the solution for this practice, define styles in `style.css` located in the `css` folder of the boilerplate code.​

- The HTML code for material card is available in the `index.html` file

### Define Styles
Following table lists the recommended CSS style properties required for creating material card:​

| CSS Property | Brief Description | Acceptabe values|
|--------------|-------------------|------------------|
| float| Places an element on the left or right side of its container, allowing text and inline elements to wrap around it.| left,right,none|
|position| Sets how an element is positioned in a document. | static,relative,abccolute,fixed|
|box-shadow|Can be used to add shadow to the element's boxes. |Components of this property:​inset, offset-x, offset-y, blur-radius, spread-radius, color

- Check the following link to add shadow effect to an element's frame.​
`https://developer.mozilla.org/en-US/docs/Web/CSS/box-shadow`

- ​CSS spacing properties (margin and padding), and color properties (background-color, color) can be used to style the HTML element to generate the card layout​.

### Details

- Color codes used frequently used in the card
    - Gray (description and icon buttons)
    - Grey (subtitle)
    - #e4e4e4 (body background color)
    - Black (box-shadow)

- Font family list used in creating the card
    - Franklin Gothic Medium, Arial Narrow, Arial, san-serif