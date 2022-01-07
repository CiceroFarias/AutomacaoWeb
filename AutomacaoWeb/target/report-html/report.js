$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/TesteWeb.feature");
formatter.feature({
  "name": "Teste automatizado web",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "acessar pagina do globo esporte e ir no icone do corinthians",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "que eu esteja na pagina do globo esporte",
  "keyword": "Dado "
});
formatter.match({
  "location": "Step.queEuEstejaNaPaginaDoGloboEsporte()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no icone do corinthians",
  "keyword": "Quando "
});
formatter.match({
  "location": "Step.clicarNoIconeDoCorinthians()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo visualizar as informações do corinthians",
  "keyword": "Entao "
});
formatter.match({
  "location": "Step.devoVisualizarAsInformaçõesDoCorinthians()"
});
formatter.result({
  "status": "passed"
});
});