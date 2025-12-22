const username = document.getElementById('name');
const number = document.getElementById('number');

const checkName = true;

const button = document.getElementById('submit');

if(username.length > 4 && username.length < 16){
    checkName = true;
}
else{
    checkName = false;
}

const specialChars = "!@#$%^&*(),.<>/?{}[]:;";

if(username[0]=='0' || username[0]=='1' || username[0]=='2' || username[0]=='3' || username[0]=='4' || username[0]=='5' || username[0]=='6' || username[0]=='7' || username[0]=='8' || username[0]=='9'){
    checkName = false;
}

for(let i = 0;i < username.length; i++){
    if(specialChars.indexOf(username[i]) != -1){
        checkName = false;
    }
}

const checkNumber = true;

if(number.length == 10){
    checkNumber = true;
}
else{
    checkNumber = false;
}

if(number.indexOf('+')!=-1 || number.indexOf('-')!=-1 || number.indexOf(" ")){
    checkNumber = false;
}

if(checkName && checkNumber){
    button.style.backgroundColor = green;
}
else{
    button.style.backgroundColor = red;
}