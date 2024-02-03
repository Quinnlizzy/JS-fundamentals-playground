// Grab the welcome-el paragraph and store it in a variable called welcomeEl
let welcomeEL = document.getElementById("welcome-el")
// Create two variables (name & greeting) that contains your name
let name = "Richard"
// and the greeting we want to render on the page
let greeting = "Welcome back, "
// Render the welcome message using welcomeEl.innerText

welcomeEL.innerText = (greeting + name)