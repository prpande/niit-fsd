# Positive Work Environment Task Force 

## Context
World Wide Web Consortium is a global community where participants choose to work together. In that community, participants experience differences in language, location, nationality, and experience. In such a diverse environment, misunderstandings and disagreements happen, and in most cases can be resolved informally. The goals of this code are to:
- Define acceptable and expected standards of behavior.
- Provide a benchmark.
- Ensure transparency in community and group management.
- Ensure an environment where people can participate without fear of harassment.
- Contribute to the identity of the organization.

## Problem Statement

Create a web page that documents code of ethics and professional conduct using HTML5 semantic elements.

The sample output is provided in the below PDF format:

[PDF](./Positive-Work-Environment-at-W3C-Code-of-Ethics-and-Professional-Conduct.pdf)

### Tasks

- Edit `index.html` file provided in the boilerplate to add various HTML elements to get the page output as shown in the image.
- The solution for this challenge can be developed in 3 steps:​
    - Step 1: Create Header​
    - Step 2: Create Main section with sub sections​
    - Step 3: Create Footer​
- Use appropriate semantic tags to accomplish this outcome based on the practices performed earlier.​
- Texts used in the web page can be obtained from the [PDF](./Positive-Work-Environment-at-W3C-Code-of-Ethics-and-Professional-Conduct.pdf) file shared.
​

### Using Semantic Tags Recommendations

- The page header should be created using `<header>` tag.​
- The page footer should be created using `<footer>` tag.​
- The complete page content excluding header and footer should be added to the `<main>` tag.​
- Each block within main element should be defined using `<section>` element.​
- Use heading elements in header, footer, and section elements to create hierarchy of decreasing headings. For esample
```html
<main>
    <h1></h1>
    <section>
        <h2></h2>
        <section>
            <h3></h3>
        </section>
    </section>
</main>
```
- The lists on the page can be added using ordered list, unordered list, and definition list elements.​
- Use `<dfn>` tag to provide term definition or explanation.​
- Use `<details>` and `<summary>` tags to create collapsible content to produce show/hide effect.