const fullname = document.getElementById('fullname');
const email = document.getElementById('email');
const checkBox = document.getElementById('checkbox');
const checkStatus = checkBox.isChecked();
const submitButton = document.getElementById('submit');

const nameStatus = true;
const validateFullName = ()=> {
    let words = fullname.split();

    if(words.length < 2){
        nameStatus = false;
    }
    for(let i = 0;i < words.length; i++){
        if(words[i].length < 2){
            nameStatus = false;
        }
    }

    for(let i = 0;i < fullname.length; i++){
        let numbers = "0123456789";

        if(numbers.indexOf(fullname[i])!=-1){
            nameStatus = false;
        }
    }

}

const emailStatus = true;
const validateEmail = ()=>{
    if(fullname.indexOf('@')==-1){
        emailStatus = false;
    }
}

if(!nameStatus || !emailStatus || !checkStatus){
    window.alert("Fill the fields properly");
}

if(nameStatus && emailStatus && checkStatus){
    submitButton.active = true;
}

