# Bootstrap - 18/09

## What is Bootstrap?

- Open-source CSS framework developed by Twitter, which is now maintained by the Bootstrap community
- Provides developers with a set of pre-designed HTML, CSS, and JavaScript components and tools that can be easily integrated into web projects
- Known for its responsiveness, flexibility, and ease of use, making it a popular choice among web developers

## Getting Started with Bootstrap

### Installation

You can include Bootstrap in your project by linking to its CSS and JavaScript files directly from a content delivery network (CDN) or by downloading and hosting the files locally. Here's an example of how to include Bootstrap using a CDN:

```html
<!-- Add this to the <head> section of your HTML file -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.min.js"></script>
```

### Bootstrap Examples

Now that we've covered the basics, let's explore some practical examples of Bootstrap's features:

#### Example 1: Creating a Responsive Grid Layout

Bootstrap's grid system allows you to create responsive layouts easily. You can specify the number of columns for each element. For example, this code creates a simple two-column layout:

```html
<div class="container">
    <div class="row">
        <div class="col-md-6">Column 1</div>
        <div class="col-md-6">Column 2</div>
    </div>
</div>
```

#### Example 2: Styling Buttons

Bootstrap provides a variety of pre-styled buttons. Here's how you can create primary and secondary buttons:

```html
<button class="btn btn-primary">Primary Button</button>
<button class="btn btn-secondary">Secondary Button</button>
```

#### Example 3: Creating Alerts

You can easily create informative alerts with Bootstrap. Here's an example of a success alert:

```html
<div class="alert alert-success" role="alert">
    This is a success message.
</div>
```

### Understanding the 12-Column Grid

Bootstrap's grid system is based on dividing a web page's layout into 12 columns. Developers can allocate these columns to different elements within a row, allowing for precise control over how content is displayed. Here's a basic example:

```html
<div class="container">
    <div class="row">
        <div class="col-md-4">Column 1</div>
        <div class="col-md-4">Column 2</div>
        <div class="col-md-4">Column 3</div>
    </div>
</div>
```

In this example, we have a row containing three columns, each occupying four columns of the available 12. This creates a balanced layout on medium-sized screens and larger.

### Breakpoints

Breakpoints in Bootstrap are predefined screen sizes at which the layout and design of a website should adapt to provide the best user experience. Bootstrap provides five default breakpoints:

1. **xs (Extra Small)**: The smallest breakpoint, typically used for smartphones. The class prefix for this breakpoint is `col-xs-`.

2. **sm (Small)**: Used for tablets and larger smartphones. The class prefix is `col-sm-`.

3. **md (Medium)**: This is the default breakpoint and is suitable for most laptops and desktop screens. The class prefix is `col-md-`.

4. **lg (Large)**: Used for larger desktop screens. The class prefix is `col-lg-`.

5. **xl (Extra Large)**: Designed for extra-large screens. The class prefix is `col-xl-`.

### Using Breakpoints

To utilize these breakpoints, you assign column classes according to the breakpoint you want to target. For example, if you want a column to occupy half of the available width on small screens and full width on medium screens and above, you can do this:

```html
<div class="container">
    <div class="row">
        <div class="col-12 col-sm-6">Column 1</div>
    </div>
</div>
```

In this example, `col-12` means that the column takes up all 12 available columns on extra-small screens, while `col-sm-6` indicates that it should occupy 6 columns on small screens and larger. 

### Offset and Ordering

Bootstrap's grid system also allows you to offset columns and control their ordering. For example, to offset a column by two columns and change its order on small screens, you can use classes like `offset-sm-2` and `order-sm-last`.

### Customizing Breakpoints

In addition to Bootstrap's predefined breakpoints, you can customize them by modifying the variables in Bootstrap's SCSS files if you're using a custom build of Bootstrap.

Title: Creating Responsive and Flexible Images with Bootstrap in CSS: A Comprehensive Guide with Examples

### Making Images Responsive

To make images responsive in Bootstrap, you can use the `img-fluid` class. This class sets the `max-width` property of the image to 100%, ensuring that the image scales with its parent container.

Here's an example:

```html
<div class="container">
    <div class="row">
        <div class="col-md-6">
            <img src="your-image.jpg" alt="Responsive Image" class="img-fluid">
        </div>
    </div>
</div>
```

In this example, the `img-fluid` class ensures that the image scales appropriately when viewed on different screen sizes.

### Using Bootstrap's Responsive Image Classes

Bootstrap offers additional classes to fine-tune the behavior of responsive images. Here are some useful ones:

1. **`.img-thumbnail`**: Adds a border and rounded corners to the image.

2. **`.rounded` and `.rounded-circle`**: Apply rounded corners to images, with the latter creating a circular image.

3. **`.img-thumbnail`**: Adds a border and rounded corners to the image.

4. **`.float-left` and `.float-right`**: Floats the image to the left or right of the text.

Here's an example using some of these classes:

```html
<div class="container">
    <div class="row">
        <div class="col-md-6">
            <img src="your-image.jpg" alt="Responsive Image" class="img-fluid rounded-circle float-left">
        </div>
        <div class="col-md-6">
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit...</p>
        </div>
    </div>
</div>
```

### Handling Different Image Sizes

Sometimes, you may want to display different images based on the screen size or resolution. Bootstrap provides the `srcset` attribute for this purpose. By using the `srcset` attribute along with Bootstrap's classes, you can load different images for different screen sizes.

Here's an example:

```html
<img
    src="small-image.jpg"
    srcset="small-image.jpg 300w,
            medium-image.jpg 768w,
            large-image.jpg 1200w"
    sizes="(max-width: 575px) 280px,
           (max-width: 768px) 720px,
           1140px"
    alt="Responsive Image"
    class="img-fluid"
>
```

In this example, the `srcset` attribute specifies different image sources for various screen sizes, and the `sizes` attribute defines the image's display size based on the screen width.

### Image Styling with Bootstrap

Bootstrap offers a range of classes for styling images, from adding borders to rounded corners. Let's explore some of these styling options with examples:

#### 1. Rounded Images

To create rounded images, you can use the `rounded` class. This class applies a slight border-radius to the image, giving it a soft, rounded appearance.

```html
<img src="your-image.jpg" alt="Rounded Image" class="rounded">
```

#### 2. Thumbnail Images

Thumbnail images are commonly used for image galleries. You can apply the `img-thumbnail` class to an image to add a border and padding, giving it a thumbnail-like appearance.

```html
<img src="your-image.jpg" alt="Thumbnail Image" class="img-thumbnail">
```

#### 3. Circle Images

To create circular images, use the `rounded-circle` class. This class applies a border-radius of 50%, resulting in a circular image.

```html
<img src="your-image.jpg" alt="Circle Image" class="rounded-circle">
```

#### 4. Image Borders

If you want to add a custom border to your image, Bootstrap provides classes like `border` and `border-2`. You can adjust the border width by changing the number in the class name.

```html
<img src="your-image.jpg" alt="Bordered Image" class="border border-2">
```

### Image Styling with CSS

While Bootstrap offers convenient classes for image styling, you can also use custom CSS to achieve more advanced effects. For example, you can create a drop-shadow effect on an image like this:

```html
<img src="your-image.jpg" alt="Shadowed Image" class="img-fluid shadowed-image">
```

And in your CSS file:

```css
/* Custom CSS */
.shadowed-image {
    box-shadow: 5px 5px 10px rgba(0, 0, 0, 0.2);
}
```

### Creating Forms with Bootstrap

Bootstrap provides a range of CSS classes and components to build forms efficiently. Let's start with the basics and gradually delve into more advanced form elements.

#### 1. Basic Form Structure

To create a basic form, use the `form` element along with the `form-control` class for form elements like text inputs:

```html
<form>
    <div class="form-group">
        <label for="username">Username</label>
        <input type="text" class="form-control" id="username" placeholder="Enter your username">
    </div>
    <!-- Add more form elements here -->
</form>
```

#### 2. Styling Buttons

Bootstrap offers classes to style buttons. Use `btn` for basic buttons and `btn-primary`, `btn-secondary`, etc., for different button styles:

```html
<button type="submit" class="btn btn-primary">Submit</button>
<button type="reset" class="btn btn-secondary">Reset</button>
```

#### 3. Checkboxes and Radios

Creating checkboxes and radio buttons is straightforward:

```html
<div class="form-check">
    <input class="form-check-input" type="checkbox" id="check1">
    <label class="form-check-label" for="check1">Check this</label>
</div>

<div class="form-check">
    <input class="form-check-input" type="radio" name="radioGroup" id="radio1" checked>
    <label class="form-check-label" for="radio1">Option 1</label>
</div>
```

#### 4. Select Dropdowns

For select dropdowns, use the `form-select` class:

```html
<select class="form-select" aria-label="Select a country">
    <option selected>Select a country</option>
    <option value="1">USA</option>
    <option value="2">Canada</option>
    <option value="3">UK</option>
</select>
```

### Advanced Form Styling

Bootstrap offers several advanced form styling options to enhance your forms:

#### 1. Form Sizing

You can adjust the size of form elements using classes like `form-control-lg` for large inputs and `form-control-sm` for small inputs:

```html
<input type="text" class="form-control form-control-lg" placeholder="Large input">
<input type="text" class="form-control" placeholder="Default input">
<input type="text" class="form-control form-control-sm" placeholder="Small input">
```

#### 2. Input Group

Input groups are useful for adding text, buttons, or other elements alongside form inputs:

```html
<div class="input-group mb-3">
    <input type="text" class="form-control" placeholder="Recipient's username" aria-label="Recipient's username" aria-describedby="basic-addon2">
    <span class="input-group-text" id="basic-addon2">@example.com</span>
</div>
```

#### 3. Validation

Bootstrap provides built-in styles for form validation feedback. Use the `is-invalid` class for invalid inputs and `is-valid` for valid inputs:

```html
<input type="text" class="form-control is-invalid" placeholder="Invalid input">
<div class="invalid-feedback">
    Please provide a valid input.
</div>

<input type="text" class="form-control is-valid" placeholder="Valid input">
```
