let input_nome = document.querySelector('#input_nome');
let btn_saudar = document.querySelector('#btn-saudacao')
let p_saudar = document.querySelector('#saudacao')

btn_saudar.addEventListener('click', function() {
  if (input_nome.value) {
    p_saudar.innerHTML = `Oii, ${input_nome.value}! Seja bem-vindo!`
  } else {
    p_saudar.innerHTML = "Por favor, digite seu nome."
  }
})