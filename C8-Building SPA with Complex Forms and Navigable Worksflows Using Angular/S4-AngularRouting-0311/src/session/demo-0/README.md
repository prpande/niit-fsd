### Demo-0 :: Navigation in Multi-Page Application

#### Implementation Steps

Refer to the following guidelines for understanding navigation in multi-page application:

1. Run the json-server to read notes data from `notes.json` file located in `demo-0/keep-app-data` folder.
2. The solution code for note application resides in folder `keep-app-using-javascript`.
3. Launch the application using Live Server on Chrome browser. (Rt. Click on `index.html` file and choose the option `Open with Live Server`).
4. Press function key `F12` or `Shift + I` or right click on the page and choose the option `Inspect` to open `Developers Tools`.
5. Click on `Network` Tab.
6. Press `Ctrl+R` to reload the contents
    - This time the page has loaded `index.html` file and loaded all the scripts and bootstrap contents.
7. The tab shows the entries for requests made in loading this page.
8. On the web page click on `Login` link
9. Refer to the Network Tab and observe the changes
    - This time the page has loaded `login.html` file and reloaded all the scripts and bootstrap contents.

**Note:** Every time a new page is visited a page loads with all the resources requested, even if they had already loaded during the previous page load.