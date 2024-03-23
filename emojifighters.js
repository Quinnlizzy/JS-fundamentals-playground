let fighters = ["🐉", "🐥", "🐊","💩", "🦍", "🐢", "🐩", "🦭", "🦀", "🐝", "🤖", "🐘", "🐸", "🕷","🐆", "🦕", "🦁"]

let stageEl = document.getElementById("stage")
let fightButton = document.getElementById("fightButton")

fightButton.addEventListener("click", function() {
    let fighter1 = Math.floor(Math.random() * 16) + 1;
    
    let fighter2 = Math.floor(Math.random() * 16) + 1;
    console.log(fighters[fighter1]);
    console.log(fighters[fighter2]);
    
    // emoji fighters and display them as i.e. "🦀 vs 🐢" in the "stage" <div>.
    stageEl.textContent = fighters[fighter1] + " vs " + fighters[fighter2];
    })
