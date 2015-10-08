/* 
 * This script creates 11x11 game board 
 * with flipable cards on it
 */


var gameboard = function() {
    var gameboard = document.getElementById('gameboard');

    for( var i = 0; i < 11; i++ ) {
        for (var j = 0; j < 11; j++) {
            var cell = document.createElement("div");
            cell.id = "cell_" + i + "_" + j;

            //boundary conditions
            if (i==0 || j==0 || i==10 || j==10 
                || (i==1 && j==1) || (i==1 && j==9) 
                || (i==9 && j==1) || (i==9 && j==9)) {
                //invisible divs
                cell.className = 'card';
            }   else { 
                //flipable cards
                cell.className = 'card effect__click';
                var card_front = document.createElement("div");
                card_front.className = 'card__front';
                var card_back = document.createElement("div");
                card_back.className = 'card__back';

                cell.appendChild(card_front);
                cell.appendChild(card_back);
            }
            gameboard.appendChild(cell);
        }
    }
}();

