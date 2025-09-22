const promptLib = require("prompt-sync")();

let nome = 'Giovanni'
let idade = 18
let jaAlmocou = false


let numero1 = 40
let numero2 = 4

console.log(numero1 + numero2) 
console.log(numero1 - numero2) 
console.log(numero1 * numero2) 
console.log(numero1 / numero2) 


let cidade = 'Carapucuiba'
let estado = 'Sao Paulo'

console.log("Eu moro em " + cidade + ", " + estado) 
console.log(`Eu moro em ${cidade}, ${estado}`) 


let idadeEx4 = promptLib("Qual a sua idade? ")

if(idade >= 18) {
  console.log("Você pode tirar a CNH!")
} 
else {
  let idadeRestante = 18 - idade
  alert(`Faltam ${idadeRestante} para você tirar a CNH.`)
     }


const numero = promptLib("Digite um numero")

for (let index = 0; index <= 10; index++) {
  console.log(`${numero} x ${index} = `, numero * index )
}


let numeroInt = 15
let numeroStr = '15'

console.log(numeroInt == numeroStr) 
console.log(numeroInt === numeroStr) 


let diaDaSemana = Number(promptLib("Numero do dia da semana? "))

switch (diaDaSemana) {
  case 1:
    console.log("Domingo")
    break
  case 2:
    console.log("Segunda-feira")
    break
  case 3:
    console.log("Terça-feira")
    break
  case 4:
    console.log("Quarta-feira")
    break
  case 5:
    console.log("Quinta-feira")
    break
  case 6:
    console.log("Sexta-feira")
    break
  case 7:
    console.log("Sábado")
    break
  default:
    console.log("Escolha um numero entre 1 e 7")
                    }


let numeroWhile = 0

while (numeroWhile <= 10) {
  if (numeroWhile === 5) {
    break
            }

  console.log(`Numero: ${numeroWhile}`)
  numeroWhile++  
  }



for (let index = 1; index <= 20; index++) {


  let temResto = !!(index % 2)

  if (temResto) {
    continue
  } 
    else {
    console.log(`Encontrei um numero par: ${index}`)
          } 
  }




let numeroDigitado1 = promptLib("Digite o primero numero? ")
let numeroDigitado2 = promptLib("Digite o segundo numero? ")
let operacao = promptLib("Digite a operacao")


let resultado;

if (operacao === '+') {
  resultado = numeroDigitado1 + numeroDigitado2
} 
  else 
    if (operacao === '-') {
  resultado = numeroDigitado1 - numeroDigitado2
} 
      else 
        if (operacao === '*') {
  resultado = numeroDigitado1 * numeroDigitado2
} 
          else {
  resultado = numeroDigitado1 / numeroDigitado2
  }


console.log(resultado)

