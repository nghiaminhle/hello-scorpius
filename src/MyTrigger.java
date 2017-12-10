import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


import org.joo.scorpius.support.exception.TriggerExecutionException;

import org.joo.scorpius.trigger.TriggerExecutionContext;
import org.joo.scorpius.trigger.impl.AbstractTrigger;

public class MyTrigger extends AbstractTrigger<MyRequest, MyResponse> {

	@Override
	public void execute(TriggerExecutionContext executionContext) throws TriggerExecutionException {
		// TODO Auto-generated method stub
		
	}
}
