var webSocket = new WebSocket('ws://localhost:9090/ponygame/websocket');

document.getElementById("sendButton").onclick = function() {
    webSocket.send(document.getElementById("inputText").value);
};

webSocket.onopen = function(event) {
};

webSocket.onmessage = function(event) {
    document.getElementById("output").innerHTML += event.data + "<br/>";
};

webSocket.onclose = function(event) {
    alert('onclose');
};

webSocket.onerror = function(event) {
    alert('onerror');
};