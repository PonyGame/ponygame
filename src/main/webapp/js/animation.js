/* 
 * This script controls the game animation
 * 
 */


function selectUnit(cell) {
    websocket.send(cell);
    
}

function selectCard(card, unit) {
    if (card.isAvailable()) {
        
    } 
    if (card.isOpen()) {
        unit.move(card);
    } else {
        flipCard(card);
    }
}

function selectAvailableCells(activePlayer, selectedUnit) {

}

/*
 * Flip animation
 */
function flipCard(card) {
    var cards = document.querySelectorAll(".card.effect__click");
    for (var i = 0, len = cards.length; i < len; i++) {
        var card = cards[i];
        clickListener(card);
    }
}

function clickListener(card) {
    card.addEventListener("click", function() {
        var c = this.classList;
        c.contains("flipped") === true ? c.remove("flipped") : c.add("flipped");
    });
}



