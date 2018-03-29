package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoServidor {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// BlocoServidor
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				return cronapi.database.Operations.queryPaged(Var.valueOf("app.entity.Produto"),
						Var.valueOf("select p from Produto p"), Var.valueOf(true));
			}
		}.call();
	}

}
