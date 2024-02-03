{/* <html>
    <head>
        <link rel="stylesheet" href="index.css">
    </head>
    <body>
        <img src="images/shoe.jpeg" alt="Nike shoe">
        <p>Nike shoe</p>
        <button onclick=errorMsg()>Purchase - $149</button>
        <p id="error"></p>
        <script src="index.js"></script>
    </body>
</html> */}

// When the user clicks the purchase button, render out
// "Something went wrong, please try again" in the paragraph
// that has the id="error".

let error = document.getElementById("error")

//function for message to add to onclick
function errorMsg(){
    error.textContent = "Something went wrong, please try again"
}