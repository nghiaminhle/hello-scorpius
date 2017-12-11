package scorpius.hello;

import org.joo.scorpius.support.exception.TriggerExecutionException;
import org.joo.scorpius.trigger.TriggerExecutionContext;
import org.joo.scorpius.trigger.impl.AbstractTrigger;

public class MyTrigger extends AbstractTrigger<MyRequest, MyResponse> {
	@Override
	public void execute(TriggerExecutionContext executionContext) throws TriggerExecutionException {
		// TODO Auto-generated method stub
		executionContext.finish(new MyResponse());
	}
}
