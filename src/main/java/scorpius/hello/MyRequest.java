package scorpius.hello;

import org.joo.scorpius.support.BaseRequest;

import lombok.Getter;

@Getter
public class MyRequest extends BaseRequest {
	private String name;
}
