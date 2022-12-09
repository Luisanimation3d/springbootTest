let id = document.querySelector("#idInput");
let button = document.querySelector("#buttonSubmit");
let titleForm = document.querySelector("#titleForm");
let titlePage = document.querySelector("title");

window.addEventListener('load', ()=>{
    if(id.value != 0){
        button.innerHTML = "Edit Product"
        titlePage.innerText = "Editar Producto"
        titleForm.innerHTML = "Editar producto"
    }else{
        titleForm.innerHTML = "Crear un nuevo producto"
        titlePage.innerText = "Crear Producto"
        button.innerHTML = "Create New Product"
    }
})