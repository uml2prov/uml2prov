package aspects.listeners;

import aspects.events.BGMEvent;

public class ListenerSout implements BGMListener {

	@Override
	public void newValueBinding(BGMEvent e) {
		System.err.println(e);
	}

	@Override
	public void newBinding(BGMEvent e) {
		System.err.println(e);
	}

	@Override
	public void operationStart(BGMEvent e) {
		System.err.println("-------Start: "+e.getExecutionIdMethod());
	}

	@Override
	public void operationEnd(BGMEvent e) {
		System.err.println("-------End: "+e.getExecutionIdMethod());
	}

}


	


