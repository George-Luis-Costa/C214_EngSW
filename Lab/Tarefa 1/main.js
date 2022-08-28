console.log("Carro")
var carro = new Veiculo("sda-7844",2019)
carro.exibirDados()

console.log("Atualizando por setter")
carro.setPlaca("pwa-7852")
carro.setAno(2015)
carro.exibirDados()
//////////////////////////////////////////////////////////////

console.log("\nCaminhao")
var caminhao = new Caminhao("sal-3522", 2008, 3)
caminhao.exibirDados()
//////////////////////////////////////////////////////////////

console.log("\nOnibus")
var onibus = new Onibus("jhd8387", 2015, 45)
onibus.exibirDados()