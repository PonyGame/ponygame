var wshost = 'ws://' +  window.location.host + '/ponygame/websocket';
var webSocket = new WebSocket(wshost);

document.getElementById("sendButton").onclick = function() {
    webSocket.send(document.getElementById("inputText").value);
};

webSocket.onopen = function(event) {
};

webSocket.onmessage = function(event) {
    document.getElementById("output").innerHTML += event.data + "<br/>";
};

webSocket.onclose = function(event) {

};

webSocket.onerror = function(event) {

};