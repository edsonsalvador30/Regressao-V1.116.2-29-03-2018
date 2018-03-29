package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class TesteServidor {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// testeServidor
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				return cronapi.database.Operations.query(Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL);
			}
		}.call();
	}

}
