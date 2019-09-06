package aspects.events;

import java.util.EventObject;

public class BGMEvent extends EventObject {

	//para los elementos
	private String executionID;
	private String className;
	private String executionIdMethod;
	public void setExecutionIdMethod(String executionIdMethod) {
		this.executionIdMethod = executionIdMethod;
	}

	private String varName;

	private String value;

	//para valores
	private String identifier;
	private String type;
	private String state;

	//para elementos
	public BGMEvent(Object source, String executionID, String className,
			String executionIdMethod, String varName, String value) {
		super(source);
		this.executionID = executionID;
		this.className = className;
		this.executionIdMethod = executionIdMethod;
		this.varName = varName;
		this.value = value;
	}

	//para valores de elementos
	public BGMEvent(Object source, String executionID, String value,
			String identifier, String type) {
		super(source);
		this.executionID = executionID;
		this.value = value;
		this.identifier = identifier;
		this.type = type;
	}

	//para inicio y final metodo
	public BGMEvent(Object source, String executionID, String className,
			String executionIdMethod) {
		super(source);
		this.executionID = executionID;
		this.className = className;
		this.executionIdMethod = executionIdMethod;
	}

	public void setVarName(String varName) {
		this.varName = varName;
	}

	public String getIdentifier() {
		return identifier;
	}

	public String getType() {
		return type;
	}

	public String getExecutionID() {
		return executionID;
	}

	public String getClassName() {
		return className;
	}

	public String getExecutionIdMethod() {
		return executionIdMethod;
	}

	public String getVarName() {
		return varName;
	}

	public String getValue() {
		return value;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
