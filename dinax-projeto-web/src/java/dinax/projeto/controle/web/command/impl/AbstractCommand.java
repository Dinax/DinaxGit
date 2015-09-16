
package dinax.projeto.controle.web.command.impl;

import dinax.projeto.controle.web.command.ICommand;
import dinax.projeto.core.IFachada;
import dinax.projeto.core.impl.controle.Fachada;



public abstract class AbstractCommand implements ICommand {

	protected IFachada fachada = new Fachada();

}
