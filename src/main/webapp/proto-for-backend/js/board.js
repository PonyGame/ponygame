var xmlhttp = new XMLHttpRequest();

xmlhttp.onreadystatechange = function () {
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
        alert(xmlhttp.responseText);
    }
};

document.getElementById("create_room_button").onclick = function () {

    xmlhttp.open("POST", "", true);
    xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xmlhttp.send("fname=Henry&lname=Ford");
};