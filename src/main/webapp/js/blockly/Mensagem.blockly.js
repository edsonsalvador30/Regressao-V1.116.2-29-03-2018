window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Mensagem = window.blockly.js.blockly.Mensagem || {};

/**
 * Mensagem
 */
window.blockly.js.blockly.Mensagem.Executar = function() {
	this.cronapi.screen.notify('success', 'Teste');
}
