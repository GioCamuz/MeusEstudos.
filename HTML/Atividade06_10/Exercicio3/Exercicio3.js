let img = document.querySelector("img");

const btn_prev = document.querySelector("#previous");
const btn_next = document.querySelector("#next");
let position_imagem = 0;

const list_images = [
  "https://images.unsplash.com/photo-1759681770972-560b9949da0b?q=80&w=735&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
  "https://images.unsplash.com/photo-1744619438376-30bfc6c4666c?q=80&w=735&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D?",
  "https://images.unsplash.com/photo-1755398104149-961fa827e015?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
  "https://images.unsplash.com/photo-1759512605031-e285d92af608?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
];

btn_next.addEventListener("click", function () {
  if (position_imagem < list_images.length) {
    img.src = list_images[position_imagem];
    position_imagem++;
  }
});

btn_prev.addEventListener("click", function () {
  if (position_imagem !== 0) {
    position_imagem--;
    img.src = list_images[position_imagem];
  } 
});