## Sprint 4: Structure a Web Page Using CSS Floats
### This sprint has 6 demos 

[**Demo 1: Normal Document FLow**](demo-1-normal-flow)

#### Problem Statement
- Demonstrate how the block and the inline elements are displayed on a page before any changes are made to their layout. ​
1. Normal document flow with paragraph, span and img elements.
- Observe the normal flow of documemt for block elements like `<p>` which displays one after another and inline elements like `<span>` which is just the size of their content. The `<img>` element appears in the next line because of its bigger size.

2. Normal document flow with multiple images of smaller size.
- Observe the flow of document when inline elements like `<span>` and `<img>` with smaller size. They  all sit on the same line along with any adjacent (or wrapped) text content as long as there is space for them.

[**Demo 2: CSS Floats**](demo-2-css-floats)

#### Problem Statement

Demonstrate floats by using the CSS float property. Check how a floating element is removed from the normal flow of a document. 
1. Floating elements 
- An `<img>` is added to a container and made to float left to the following `<p>` text content.
2. Floating elements removed from normal flow
- The `<p>` following the image is styled with properties like padding, background-color and color.  
- To make the effect easier to see, change the `margin-left` on your float to `margin` so you get space all around the float. 
- You can see the background on the paragraph running right underneath the floated image box.

[**Demo 3: Clear Floats**](demo-3-clear-floats)

#### Problem Statement

Demonstrate what elements can float beside the cleared element, and on which side using the CSS clear property. ​ 
1. Clear floats
- Clear property can be used to stop the following element from moving up. In our case, the second paragraph is added with a new class called cleared and is also given the following property:​
```css
.cleared { ​
clear:left; ​
} ​
```
You should see that the following paragraph clears the floated element and that it no longer comes up alongside.
2. Clear-fix Hack: Clearing boxes wrapped around a float
- Change the document so that the first paragraph and the floated image are wrapped with a `<div>` with a class of wrapper. ​ 
- Insert some generated content after the box that contains both the float and the content wrapping around it, then setting that generated content to clear both.​ ​


[**Demo 4: Positioning**](demo-4-positioning)

#### Problem Statement

Demonstrate the various types of CSS position property values.
1. Static positioning is the default positoning. Providing values as `position:static` to `<p>` element does not change the document flow.
2. Relative positioning : Provide `position:relative` and positive values for top and left css properties to `<p>` and observe the change in the final position of the `<p>` after taking its initial position in the normal document flow.
3. Relative positioning: Provide `position:relative` and negative values for top and left css properties to `<p>` and observe the change in the final position of the `<p>` aftre taking its initial position in the normal document flow.
4. Absolute positioning: Provide `position:absolute` and top, left properties to the second `<p>` element and observe that the positioned element is no longer exists in the normal document flow. It is positioned relative to the document body and hence overlap with other `<p>` elemnents. 
5. Fixed positioning: Provide `position:fixed` and `top:0` to the heading and observe that the heading sticks to the top of the screen (staying fixed) and the contents appears to scroll up and disappear underneath it.

[**Demo 5: Z Index**](demo-5-z-index)

#### Problem Statement

Change the order of the HTML elements displayed in the browser using the z-index property.
- Both lime and yellow paragraphs are absolutely positioned. 
- The lime paragraph is given an index value as 1 which is greater than the yellow paragraph(default z-index value 0). 
- Hence lime paragraph overlaps the yellow paragraph.


[**Demo 6: Flex Box**](demo-5-flex-box)

#### Problem Statement

Create an easy multi-column layout using the flex display property.  
