// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Stack;

/************************************************************/
/**
 * 
 */
public class StackEl {
	/**
	 * 
	 */
	private StackEl precedingEl;
	/**
	 * 
	 */
	private Person content;

	public StackEl(Person p) {
		this.content=p;
	}

	/**
	 * 
	 */
	public StackEl getPrecedingEl() {
		return this.precedingEl;
	}

	/**
	 * 
	 */
	public Person getContent() {
		return this.content;
	}

	/**
	 * 
	 */
	public void setPrecedingEl(StackEl stackEl) {
		this.precedingEl = stackEl;
	}

};
