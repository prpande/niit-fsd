### Demo 1 :: Install Angular Material

#### Implementation Steps

1. To set up Angular Material in Angular project, run the following command:

`ng add @angular/material`

2. The user will be prompted with following questions to determine which features to include:

    - Choose a prebuilt theme name, or "custom" for a custom theme:
    - Whether to apply the global typography styles to your application.
    - Whether to set up browser animations for Angular Material
        - Importing the BrowserAnimationsModule into your application enables Angular's animation system. - Declining this will disable most of Angular Material's animations.

3. Upon execution of command, following packages get installed:
    - Angular Material
    - Component Dev Kit (CDK)
    - Angular Animations

4. The ng add command will additionally perform the following configurations:

    - Add project dependencies to package.json
    - Add the Roboto font to your index.html
    - Add the Material Design icon font to your index.html
    - Add a few global CSS styles to:
    - Remove margins from body
    - Set height: 100% on html and body
    - Set Roboto as the default application font
    
Angular Material is now configured to be used in your application.