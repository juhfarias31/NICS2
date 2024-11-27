// Declaração de variáveis globais

var produto = "";
var preco = parseFloat(0);
var qtd = parseInt(0);


function sacola() {

  const qtdCostela = document.getElementById('qtdCostela').value;
  const qtdPeito = document.getElementById('qtdPeito').value;
  const qtdTorresmo = document.getElementById('qtdTorresmo').value;
  const qtdPasteis = document.getElementById('qtdPasteis').value;
  const qtdImperatriz = document.getElementById('qtdImperatriz').value;
  const qtdCatharina = document.getElementById('qtdatharina').value;
  const qtdWayne = document.getElementById('qtdWayne').value;
  const qtdVinho = document.getElementById('qtdVinho').value;
  const qtdRefri = document.getElementById('qtdRefri').value;
  const qtdCaipirinha = document.getElementById('qtdCaipirinha').value;
  const qtdSuco = document.getElementById('qtdSuco').value;
  const qtdGin = document.getElementById('qtdGin').value;


/*COSTELA*/
const costela = [];
costela.push({
  produto: "Costela de boi",
  preco: 69.99,
  qtd: 1
});

/*PEITO BOVINO*/
const peito = [];
peito.push({
  produto: "Peito bovino",
  preco: 50.00,
  qtd: 1
});

/*TORRESMO*/
const torresmo = [];
torresmo.push({
  produto: "Torresmo",
  preco: 21.99,
  qtd: 1
});

/*PASTEIS*/
const pasteis = [];
pasteis.push({
  produto: "Pastéis",
  preco: 25.99,
  qtd: 1
});

/*CHOPP IMPERATRIZ*/
const imperatriz = [];
imperatriz.push({
  produto: "Chopp imperatriz",
  preco: 22.00,
  qtd: 1
}); 

/*CHOPP WAYNE*/
const wayne = [];
wayne.push({
  produto: "Chopp wayne",
  preco: 42.00,
  qtd: 1
});

/*CHOPP CATHARINA*/
const catharina = [];
catharina.push({
  produto: "Chopp catharina",
  preco: 22.00,
  qtd: 1
});

/*CHOPP DE VINHO*/
const vinho = [];
vinho.push({
  produto: "Chopp de vinho",
  preco: 50.00,
  qtd: 1
}); 

/*REFRI*/
const refri = [];
refri.push({
  produto: "Refrigerante",
  preco: 7.00,
  qtd: 1
});

/*CAIPIRINHA*/
const caipirinha = [];
caipirinha.push({
  produto: "Caipirinha",
  preco: 20.00,
  qtd: 1
}); 

/*SUCO*/
const suco = [];
suco.push({
  produto: "Suco",
  preco: 7.00,
  qtd: 1
});

/*GIN*/
const gin = [];
gin.push({
  produto: "Gin",
  preco: 25.00,
  qtd: 1
});

}


function criarEntradas(plus, minus, num, valor) {
  let value = valor;

  plus.addEventListener('click', () => {
      value++;
      value = value < 10 ? '0' + value : value;
      num.textContent = value;
  });

  minus.addEventListener('click', () => {
      if (value > 0) {
          value--;
          value = value < 10 ? '0' + value : value;
          num.textContent = value;
      }
  });
}

criarEntradas(
  // produto = "Costela",
  // preco = 69.99,
  // qtd = value,
  document.querySelector('.plusA'),
  document.querySelector('.minusA'),
  document.querySelector('.numA'),
  0
);

criarEntradas(
  // produto = "Peito Bovino",
  // preco = 50.0,
  // qtd = value,
  document.querySelector('.plusB'),
  document.querySelector('.minusB'),
  document.querySelector('.numB'),
  0
);

criarEntradas(
  // produto = "Torresmo",
  // preco = 21.99,
  // qtd = value,
  document.querySelector('.plusC'),
  document.querySelector('.minusC'),
  document.querySelector('.numC'),
  0
);

criarEntradas(
  // produto = "Mini Pastéis",
  // preco = 25.99,
  // qtd = value,
  document.querySelector('.plusD'),
  document.querySelector('.minusD'),
  document.querySelector('.numD'),
  0
);

criarEntradas(
  // produto = "Chope Session IPA Imperatriz",
  // preco = 22.00,
  // qtd = value,
  document.querySelector('.plusE'),
  document.querySelector('.minusE'),
  document.querySelector('.numE'),
  0
);

criarEntradas(
  // produto = "Chope Sir IPA Wayne",
  // preco = 42.00,
  // qtd = value,
  document.querySelector('.plusF'),
  document.querySelector('.minusF'),
  document.querySelector('.numF'),
  0
);

criarEntradas(
  // produto = "Catharina Sour",
  // preco = 22.00,
  // qtd = value,
  document.querySelector('.plusG'),
  document.querySelector('.minusG'),
  document.querySelector('.numG'),
  0
);

criarEntradas(
  // produto = "Chope De Vinho",
  // preco = 50.00,
  // qtd = value,
  document.querySelector('.plusH'),
  document.querySelector('.minusH'),
  document.querySelector('.numH'),
  0
);

criarEntradas(
  // produto = "Refrigerante",
  // preco = 7.00,
  // qtd = value,
  document.querySelector('.plusI'),
  document.querySelector('.minusI'),
  document.querySelector('.numI'),
  0
);

criarEntradas(
  // produto = "Caipirinha",
  // preco = 20.00,
  // qtd = value,
  document.querySelector('.plusJ'),
  document.querySelector('.minusJ'),
  document.querySelector('.numJ'),
  0
);

criarEntradas(
  // produto = "Suco Del Valle",
  // preco = 7.00,
  // qtd = value,
  document.querySelector('.plusK'),
  document.querySelector('.minusK'),
  document.querySelector('.numK'),
  0
);

criarEntradas(
  // produto = "Gin",
  // preco = 25.00,
  // qtd = value,
  document.querySelector('.plusL'),
  document.querySelector('.minusL'),
  document.querySelector('.numL'),
  0
);

/*filtro de comida*/
function filterItems() {
  // Obtém o termo de busca
  const filterValue = document.getElementById('filter-input').value.toLowerCase();

  // Seleciona todos os itens do cardápio
  const items = document.querySelectorAll('.flex-container .item1, .flex-container .item2');

  // Itera sobre os itens e filtra
  items.forEach(item => {
      const itemText = item.innerText.toLowerCase(); // Texto do item
      if (itemText.includes(filterValue)) {
          item.style.display = ""; // Mostra o item
      } else {
          item.style.display = "none"; // Esconde o item
      }
  });
}