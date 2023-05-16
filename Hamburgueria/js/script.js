function adicionar(produtoId){
    var qntElemento = document.querySelector(`#produto${produtoId} .qnt_produtos`);
    var qnt_produtos = parseInt(qntElemento.textContent);
    qnt_produtos++;
    qntElemento.textContent = qnt_produtos;
}
function remover(produtoId){
    var qntElemento = document.querySelector(`#produto${produtoId} .qnt_produtos`);
    var qnt_produtos = parseInt(qntElemento.textContent);
    qnt_produtos--;
    qntElemento.textContent = qnt_produtos;
}

