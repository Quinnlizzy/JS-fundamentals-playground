// document.getElementById("count").innerText = 5

// change the count-el in the HTML to reflect the new count

let count = 0
let countEL=document.getElementById("count-el")

console.log(countEL)

function increment() {
    count = count + 1
    console.log(count)
    countEL.innerText = count
}