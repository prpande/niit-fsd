<!-- omit in toc -->
# Sematic HTML5 Elements - 06/09

<!-- omit in toc -->
## Contents

- [Semantic Elements](#semantic-elements)
  - [Common Semantic Elements](#common-semantic-elements)
- [Non-Semantic Elements](#non-semantic-elements)
  - [Common Non-Semantic Elements](#common-non-semantic-elements)
  - [`div` vs. `span`](#div-vs-span)
- [Semantic Vs Non-Semantic](#semantic-vs-non-semantic)
- [ARIA (Accessible Rich Internet Applications) labels](#aria-accessible-rich-internet-applications-labels)
  - [ARIA tags examples](#aria-tags-examples)
- [Indexing and SEO](#indexing-and-seo)

## Semantic Elements

- Semantic tags - provide meaning and structure to web content
- help define the purpose and context of different parts of a web page
- making it easier for browsers, search engines and assistive web technologies to understand the content
- Used in Search Engine Optimization(SEO)
- Help search engines, web browsers,  to understand the content

### Common Semantic Elements

1. `<header>`:
   - **Description**: Represents the top section or introductory content of a webpage.
   - Usage example:

   ```html
   <header>
     <h1>My Website</h1>
     <nav>
       <ul>
         <li><a href="#">Home</a></li>
         <li><a href="#">About</a></li>
         <li><a href="#">Contact</a></li>
       </ul>
     </nav>
   </header>
   ```

2. `<nav>`:
   - **Description**: Defines a navigation menu.
   - Usage example:

   ```html
   <nav>
     <ul>
       <li><a href="#">Home</a></li>
       <li><a href="#">Products</a></li>
       <li><a href="#">Services</a></li>
     </ul>
   </nav>
   ```

3. `<main>`:
   - **Description**: Represents the main content of the document. There should be only one `<main>` element per page.
   - Usage example:

   ```html
   <main>
     <h1>Welcome to our Blog</h1>
     <article>
       <h2>Article Title</h2>
       <p>Article content goes here...</p>
     </article>
   </main>
   ```

4. `<article>`:
   - **Description**: Represents a self-contained piece of content, such as a blog post, news article, or forum post.
   - Usage example:

   ```html
   <article>
     <h2>How to Bake a Perfect Cake</h2>
     <p>Here are the steps to bake a delicious cake...</p>
   </article>
   ```

5. `<section>`:
   - **Description**: Defines a section of content within a document. It's a generic container for grouping related content.
   - Usage example:

   ```html
   <section>
     <h2>About Us</h2>
     <p>We are a passionate team of professionals...</p>
   </section>
   ```

6. `<aside>`:
   - **Description**: Represents content that is tangentially related to the content around it, such as sidebars or pull quotes.
   - Usage example:

   ```html
   <article>
     <h2>Article Title</h2>
     <p>Article content goes here...</p>
     <aside>
       <blockquote>Interesting quote related to the article.</blockquote>
     </aside>
   </article>
   ```

7. `<footer>`:
   - **Description**: Represents the footer of a section or the entire page, typically containing copyright information, contact details, or related links.
   - Usage example:

   ```html
   <footer>
     <p>&copy; 2023 My Website</p>
     <p>Contact: contact@example.com</p>
   </footer>
   ```

8. `<dfn>`:
   - **Description**: Stands for "definition". Used to define the defining instance of a term or phrase within a document. It is typically used to mark up the first occurrence of a term in a document to indicate its definition or to emphasize that it is being formally defined. The term within the `<dfn>` tag is usually presented in italics by default, though this can be styled differently using CSS.
   - Usage example:

    ```html
    <p>
    In computer science, <dfn>HTML</dfn> stands for HyperText Markup Language. It is a standardized markup language used for creating web pages.
    </p>
    ```

9. `<mark>`:
   - **Description**:  used to highlight or mark specific text within a document to draw attention to it. This tag is typically used to indicate that a particular portion of text is of special importance or relevance within the content. The text enclosed by the `<mark>` tag is typically highlighted with a background color, often yellow by default, though this can be customized using CSS.
   - Usage example:

    ```html
    <p>
    The <mark>deadline</mark> for the project is <mark>Friday</mark> of this week.
    </p>
    ```

## Non-Semantic Elements

- Do not convey specific meaning or structural information about the content they enclose
- Instead, typically used for layout, styling, or presentation purposes

### Common Non-Semantic Elements

1. `<div>`:
   - **Description**: The `<div>` element is a generic container used to group and style content. It doesn't convey any inherent meaning.
   - Usage example:

   ```html
   <div class="container">
     <p>This is some content inside a div.</p>
     <ul>
       <li>Item 1</li>
       <li>Item 2</li>
     </ul>
   </div>
   ```

2. `<span>`:
   - **Description**: The `<span>` element is an inline-level container used for styling individual text or inline elements.
   - Usage example:

   ```html
   <p>This is a <span style="color: blue;">blue</span> word.</p>
   ```

3. `<b>` and `<i>`:
   - **Description**: The `<b>` element is used for bold text, and the `<i>` element is used for italicized text. They don't provide any semantic meaning.
   - Usage example:

   ```html
   <p><b>This is bold text</b> and <i>this is italicized text</i>.</p>
   ```

4. `<font>`:
   - **Description**: The `<font>` element was historically used to apply font styles and attributes, but it's considered obsolete in modern HTML and should be avoided.
   - Usage example (not recommended):

   ```html
   <p><font color="red">This is red text.</font></p>
   ```

5. `<br>`:
   - **Description**: The `<br>` element is used for line breaks within text, but it doesn't convey any semantic structure.
   - Usage example:

   ```html
   <p>This is some text.<br>Here is a new line of text.</p>
   ```

6. `<table>`, `<tr>`, `<td>`:
   - **Description**: While tables can convey data structure, they are often misused for layout purposes, making them non-semantic in that context.
   - Usage example (misuse for layout):

   ```html
   <table>
     <tr>
       <td>Header 1</td>
       <td>Header 2</td>
     </tr>
     <tr>
       <td>Data 1</td>
       <td>Data 2</td>
     </tr>
   </table>
   ```

### `div` vs. `span`

| Aspect                | `<div>`                                  | `<span>`                                |
|-----------------------|-----------------------------------------|-----------------------------------------|
| Tag Type              | Block-level element: Typically used for creating block-level containers. | Inline-level element: Typically used for styling or marking up inline content. |
| Presentation          | Often used to group and style multiple block-level elements or create layout structures. | Used to apply styles or markup to a portion of inline content within a block-level element. |
| Default CSS Display   | `display: block;`                        | `display: inline;`                       |
| Semantic Meaning      | Doesn't convey any inherent meaning or semantic information. | Doesn't convey any inherent meaning or semantic information. |
| Usage in Forms        | Can be used within forms to group form elements or create form sections. | Can be used within forms to style or wrap specific parts of form elements. |
| Nesting               | Can nest other block-level and inline elements, including other `<div>` elements. | Can nest other inline elements or text within block-level elements. |
| Examples              | `<div class="container"> ... </div>` | `<p>This is a <span style="color: blue;">blue</span> word.</p>` |
|||

## Semantic Vs Non-Semantic

| Aspect| Semantic Elements| Non-Semantic Elements|
|:---|:---|:---|
| Purpose                   | Provide meaning and structure to content, indicating their role and relevance to the document's context. | Serve as layout or formatting elements, without conveying specific meaning or structure. |
| Examples                  | `<header>`, `<nav>`, `<main>`, `<article>`, `<section>`, `<footer>`, `<aside>`, `<figure>`, etc. | `<div>`, `<span>`, `<b>`, `<i>`, `<font>`, `<br>`, `<table>`, `<center>`, etc. |
| Accessibility             | Enhance accessibility for screen readers and assistive technologies by conveying content hierarchy and relationships. | Do not inherently provide accessibility improvements and require additional ARIA roles or attributes for proper labeling and structure. |
| SEO                       | Improve search engine optimization (SEO) by helping search engines understand the content and context of the page. | Have little to no impact on SEO, as they do not convey content semantics to search engines. |
| Document Structure        | Enhance document structure, making it easier for developers to understand and maintain the code. | May result in less structured and harder-to-maintain code when used excessively for layout purposes. |
| Recommended Usage         | Should be used for content that conveys meaning and structure, emphasizing the separation of content and presentation. | Typically used for layout, styling, and formatting purposes, making them less ideal for conveying content semantics. |
| HTML5 Specification       | Introduced and defined in the HTML5 specification to promote better structuring of web documents. | Not explicitly defined as non-semantic, but they are not part of the HTML5 semantic elements introduced for specific structural purposes. |
|||

## ARIA (Accessible Rich Internet Applications) labels

- Attributes and properties that are used to improve the accessibility of web content, particularly for users with disabilities
- Provide additional information to assistive technologies (such as screen readers) about the role, state, and properties of elements on a web page
- Essential for making complex web applications and dynamic content more accessible

### ARIA tags examples

1. `aria-label`:
   - **Description**: The `aria-label` attribute provides a concise label or **Description** for an element when the visible text is not descriptive enough for screen reader users.
   - Usage example:

   ```html
   <button aria-label="Close">X</button>
   ```

   In this example, a button with an "X" label has an `aria-label` attribute to provide a more meaningful label for screen reader users.

2. `aria-labelledby`:
   - **Description**: The `aria-labelledby` attribute associates an element with another element (usually a heading or label) that provides a descriptive label.
   - Usage example:

   ```html
   <div aria-labelledby="section-heading">
     <h2 id="section-heading">Important Information</h2>
     <p>This is some important information.</p>
   </div>
   ```

   Here, the `aria-labelledby` attribute associates the `<div>` with the `<h2>` element to provide a label for the `<div>`.

3. `aria-describedby`:
   - **Description**: The `aria-describedby` attribute points to an element (typically a paragraph or span) that contains additional information about the current element.
   - Usage example:

   ```html
   <input type="password" aria-describedby="password-hint">
   <span id="password-hint">Use at least 8 characters, including numbers and symbols.</span>
   ```

   In this example, the `aria-describedby` attribute is used to provide a hint for the password input field.

4. `aria-role`:
   - **Description**: The `aria-role` attribute specifies the role of an element in an accessible way. Roles define the type of UI element an element represents.
   - Usage example:

   ```html
   <div role="button" tabindex="0" onclick="performAction()">Click me</div>
   ```

   Here, the `<div>` element is given the `role` of a button to indicate that it functions like a button.

5. `aria-disabled`:
   - **Description**: The `aria-disabled` attribute is used to indicate whether an element is currently disabled or not.
   - Usage example:

   ```html
   <button aria-disabled="true">Submit (Disabled)</button>
   ```

   This button is marked as disabled using `aria-disabled="true"`.

6. `aria-hidden`:
   - **Description**: The `aria-hidden` attribute can be used to hide elements from screen readers when they are purely decorative or redundant.
   - Usage example:

   ```html
   <span aria-hidden="true">❤️</span>
   ```

   This span contains a heart emoji that is marked as hidden to screen readers.

## Indexing and SEO

- Google bots/ web crawlers /spiders, are automated software programs used by Google to discover and index web pages on the internet
- Bots play a crucial role in the functioning of Google's search engine
- Google uses complex algorithms to determine the most relevant web pages to display in the search results
- The indexed data, collected by Google bots during the crawling process, plays a significant role in this ranking process
