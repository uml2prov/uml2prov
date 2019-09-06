package aspects.listeners;
import aspects.events.BGMEvent;

public interface BGMListener {

	public void newValueBinding(BGMEvent e);
	public void newBinding(BGMEvent e);
	public void operationStart(BGMEvent e);
	public void operationEnd(BGMEvent e);

}
