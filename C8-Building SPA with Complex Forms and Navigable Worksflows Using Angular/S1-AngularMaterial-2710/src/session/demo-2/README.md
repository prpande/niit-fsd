### Demo-2 :: Design UI with Angular Material Components

#### Implementation Steps

Refer to the following guidelines for modifying the solution code:
- The solution code used here, already contains Angular Material package installed.


1. HEADER
    - Import `MatToolbarModule` module from `@angular/material/toolbar` in `app.module.ts`.
    - Import `MatIconModule` module from `@angular/material/icon` in `app.module.ts`. 
    - Use `<mat-toolbar>` for creating page header.
    - Use `<mat-icon>` for `home` and `settings` icon
    - `.html`
        - replace `div` with `mat-toolbar`
        - add `id` attribute with value `header`
        - replace `app-icon` with `mat-icon`
            ```html
                <mat-toolbar id="header">
                    <h2>Fruit Fantasy - Vendor View</h2>
                    <div id="icons">
                        <mat-icon>home</mat-icon>
                        <mat-icon>settings</mat-icon>
                    </div>
                </mat-toolbar>
            ```
    - `.css`
        - ```css
            #header{
                display: flex;
                align-items: flex-end;
                justify-content: space-between;
            }
            
            #icons > * {
                margin-right: 15px;
            }
        ```
2. SEARCH
    - Import `MatInputModule` module from `@angular/material/input` in `app.module.ts`.
    - Use `<mat-form-field>` for search input field
    - `.html`
        ```html
            <div>
                <mat-form-field>
                    <mat-label>Search Fruit</mat-label>
                    <input matInput (input)="searchFruit()" type="text" placeholder="Search Fruit" name="fruitName" [(ngModel)]="fruitName">
                </mat-form-field>
            </div>
        ```
    - No style properties are required to be added in `.css` file.
3. ADD FRUIT
    - Import `MatButtonModule` module from `@angular/material/button` in `app.module.ts`.
    - Use `<mat-form-field>` for input fields.
    - Use `mat-button` attribute for add button.
    - Use `<mat-icon>` in place of button text
    - `.html`
        ```html
            <div id="add-fruit">
                <mat-form-field class="input-field" appearance="legacy">
                    <input matInput [(ngModel)]="fruit.name" type="text" placeholder="Name">
                </mat-form-field>
                <mat-form-field class="input-field" appearance="legacy">
                    <input matInput [(ngModel)]="fruit.price" type="text" placeholder="Price ($)">
                </mat-form-field>
                <mat-form-field class="input-field" appearance="legacy">
                    <input matInput [(ngModel)]="fruit.unit" type="text" placeholder="Unit (pound / piece)">
                </mat-form-field>
                <button mat-fab type="button" (click)="add()">
                    <mat-icon>add</mat-icon>
                </button>
            </div>
        ```
    - `.css`
        ```css
            #add-fruit {
                display: flex;
                padding: 20px;
                flex-direction: column;
            }
            button {
                align-self: flex-end;
            }
        ```
    - **Note:** The `Add-Note` component is displayed to the right side of the page. The position will be updated while redesigning the `Fruit-Manager` component.
4. FRUIT CARD
    - Import `MatCardModule` module from `@angular/material/card` in `app.module.ts`.
    - Import `MatRippleModule` module from `@angular/material/ripple` in `app.module.ts`.
    - Use `<mat-card>` for displaying fruit details.
    - Use `mat-button` with `mat-icon` for adding buttons to card. Buttons should be added to the `mat-card-actions` section of the `mat-card`
    - Use `<mat-ripple>` for adding ripple effect to the fruit card.
    - `.html`
        ```html
            <a href="">
                <mat-card mat-ripple [matRippleCentered]="true" class="card-content">
                    <img src="../../assets/fruits/{{fruit?.name}}.jpg" alt="" width="280px" height="250px">
                    <mat-card-content>
                        <h4>{{fruit?.name}}</h4>
                        ${{fruit?.price}} per {{fruit?.unit}}
                    </mat-card-content>
                    <mat-card-actions>
                        <button mat-icon-button><mat-icon>favorite</mat-icon></button>
                        <button mat-icon-button><mat-icon>delete</mat-icon></button>
                    </mat-card-actions>
                </mat-card>
            </a>
        ```
    - `.css`
        ```css
            .card-content{
                text-align: center;
                margin: 10px;
                padding: 12px;
            }

            a {
                text-decoration: none;
                color: navy;
                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
                font-size: 0.75em;
            }
        ```
5. FRUIT LIST
    - By default, the fruit cards will be placed one below the other.
    - To arrange the cards inline, the `Fruit-List` component needs to be styled.
    - `.html`
        ```html
            <app-fruit-card class="card" *ngFor="let fruit of fruits" [fruit] = "fruit">
            </app-fruit-card>
        ```
    - `.css`
        ```css
            .card {
                display: inline-flex;
            }
        ```
6. FRUIT MANAGER
    - The overall position of `Search`, `Add-Fruit` and `Fruit-List` components is determined by the style properties defined in `Fruit Manager` component.
    - The `Add-Fruit` component can be wrapped inside `<mat-expansion-panel>` for clutter free and space saving UI.
    - Import `MatExpansionModule` module from `@angular/material/expansion` in `app.module.ts`.
    - `.html`
        ```html
            <div class="container">
                    <mat-expansion-panel id="add-fruit-panel">
                        <mat-expansion-panel-header>
                            <mat-panel-title>
                                <h3>Add Fruit</h3>
                            </mat-panel-title>
                        </mat-expansion-panel-header>
                        <app-add-fruit (fruitAdded)="onFruitAdded($event)"></app-add-fruit>
                    </mat-expansion-panel>
                    <app-search id="search-fruit-panel" (searchTextChanged)="onSearchTextChanged($event)"></app-search>
                    <app-fruit-list id="fruit-list-panel" [fruits]="fruits"></app-fruit-list>
            </div>
        ```
    - `.css`
        ```css
            .container {
                display: flex;
                flex-direction: column;
            }

            #add-fruit-panel {
                margin: auto;
                width: 400px;
            }

            #search-fruit-panel {
                margin: auto;
                margin-top: 20px;
            }

            #fruit-list-panel {
                margin: auto;
                margin-top: 30px;
            }
        ```