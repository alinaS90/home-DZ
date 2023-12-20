
function addTask(){

  var val = document.getElementById("inputTask");
  var body = document.querySelector("body");
  var ul = document.getElementById("listTask");
  var li = document.createElement("li");

  //проверка на существование задачи

   if(!val.value){
   alert("Необходимо ввести задачу!");
    return false;
    }

  li.appendChild(document.createTextNode(val.value));
  var id = Math.random(100);
  li.setAttribute("id",id);
  ul.appendChild(li);

  //создание чекбокса
  var checkBox = document.createElement("input");
  checkBox.type = "checkbox";
  li.appendChild(checkBox);

   //создание кнопки
   var button = document.createElement("button");
   button.innerHTML = "<button>Удалить</button>";
   li.appendChild(button);
   button.addEventListener("click",()=>deleteTask(id));
}

function deleteTask(id){

document.getElementById(id).outerHTML = "";
}
